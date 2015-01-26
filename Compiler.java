import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;

class Compiler {
	public static void main(String[] args) {
		LangLexer lexer = null;
		// Create the output file as Xxx.j
		String outputFile = args[0].substring(0, args[0].indexOf(".lang")) + ".j";
		try {
			// Create a new lexer for the input file
			lexer = new LangLexer(new ANTLRFileStream(args[0]));
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Create a new parser
		LangParser parser = new LangParser(new CommonTokenStream(lexer));
		ParseTree tree = parser.compilationUnit();
		// Run the MethodFieldResolver
		ParseTreeWalker.DEFAULT.walk(new MethodFieldResolver(), tree);
		System.out.println("Subroutine and field tables filled");
		// Run the TypeChecker
		ParseTreeWalker.DEFAULT.walk(new TypeChecker(), tree);
		System.out.println("Type checker done");
		// Run the CodeWriter
		ParseTreeWalker.DEFAULT.walk(new CodeWriter(args[0], outputFile), tree);
		System.out.println("Code generation done");

		// This section tells the user which classes have been generated
		String classes = "";
		String classNames = "";
		for (int i = 0; i < ProgramInfo.classes.size(); i++) {
			classes += ProgramInfo.classes.get(i) + ".j ";
			classNames += ProgramInfo.classes.get(i) + " ";
		}
		// Print out the list of generated classes
		System.out.println("Generated class" + (classNames.split(" ").length > 1 ? "es " : "" + ": ") + classNames);

		try {
			// This section compiles the .j files into actual class files
			Runtime rt = Runtime.getRuntime();
			// Run jasmin on the classes
			Process proc = rt.exec("java -jar jasmin.jar " + classes);
			InputStream stderr = proc.getErrorStream();
			InputStreamReader isr = new InputStreamReader(stderr);
			BufferedReader br = new BufferedReader(isr);
			String line = null;
			// Print out any errors that occur
			while ( (line = br.readLine()) != null) {
				System.out.println(line);
			}
			try {
				// This section removes the .j files if the -j flag is used
				if (args[1].equals("-j")) {
					Runtime.getRuntime().exec("rm " + classes);
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				// Do nothing
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
