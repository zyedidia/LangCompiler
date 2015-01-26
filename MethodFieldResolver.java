import java.util.*;

class MethodFieldResolver extends LangBaseListener {
	// The current class being parsed
	private String curClass;

	public void enterCompilationUnit(LangParser.CompilationUnitContext ctx) {
		ProgramInfo.init();
	}

	public void enterClassDec(LangParser.ClassDecContext ctx) {
		curClass = ctx.className().getText();
		// Add the class to the list
		ProgramInfo.classes.add(Lang.qualifiedName(curClass));
	}

	public void enterFieldDec(LangParser.FieldDecContext ctx) {
		boolean isStatic = false;
		// Check if it is static
		if (ctx.staticModifier() != null) {
			if (ctx.staticModifier().getText().equals("static")) {
				isStatic = true;
			}
		}
		// Add the field to the field table
		ProgramInfo.fieldTable.define(curClass + "." + ctx.varName().getText(), ctx.type().getText(), isStatic);
	}

	public void enterMethodDec(LangParser.MethodDecContext ctx) {
		boolean isStatic = false;
		ArrayList<String> paramTypesList = new ArrayList<String>();

		// Check if it is static
		if (ctx.staticModifier() != null) {
			if (ctx.staticModifier().getText().equals("static")) {
				isStatic = true;
			}
		}

		// Get the parameters
		if (ctx.paramList() != null) {
			for (int i = 0; ctx.paramList().param(i) != null; i++) {
				paramTypesList.add(ctx.paramList().param(i).type().getText());
			}
		}

		String[] paramTypes = paramTypesList.toArray(new String[paramTypesList.size()]);
		// Add the method to the method table
		ProgramInfo.subTable.define(curClass + "." + ctx.methodName().getText(), ctx.type().getText(), isStatic, paramTypes);
	}
}
