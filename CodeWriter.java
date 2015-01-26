import org.antlr.v4.runtime.*;
import java.io.*;
import java.util.*;

class CodeWriter extends LangBaseListener {
	private PrintWriter writer;
	private String currentClassName;
	private String inputFile;
	private int curLine;
	private String curBooleanCommand = "eq";

	public CodeWriter(String inputFile, String outputFile) {
		ProgramInfo.symTable.clear();
		this.inputFile = inputFile;
	}

	public void exitCompilationUnit(LangParser.CompilationUnitContext ctx) {
		System.out.println("Close");
		// Close the writer when the end of file is reached
		writer.close();
	}

	// Enter a class declaration
	public void enterClassDec(LangParser.ClassDecContext ctx) {
		// Create a new class file for the new class declared
		File f = new File(ctx.className().getText() + ".j");
		try {
			f.createNewFile();
		} catch (IOException e) {
			System.err.println("Unable to create new file " + ctx.className().getText() + ".j");
			System.exit(1);
		}
		try {
			// Flush the everything out of the writer and get ready to create a new writer
			if (writer != null) {
				writer.flush();
			}
			writer = new PrintWriter(f);
			writer.println("; Generated by the lang compiler");
			writer.println(".source " + inputFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		currentClassName = ctx.className().getText();
		writer.println(".class public " + ctx.className().getText());
		if (ctx.inheritance() == null) {
			writer.println(".super java/lang/Object");
		}
	}

	public void enterInheritance(LangParser.InheritanceContext ctx) {
		writer.println(".super " + Lang.qualifiedName(ctx.className().getText()));
	}

	// Write a default constructor
	// public void exitFieldDecs(LangParser.FieldDecsContext ctx) {
	// 	writer.println(".method <init>()V");
	// 	writer.println(".limit stack 1");
	// 	writer.println(".limit locals 1");
	// 	writer.println("aload_0");
	// 	writer.println("invokespecial java/lang/Object/<init>()V");
	// 	writer.println("return");
	// 	writer.println(".end method");
	// }

	public void enterFieldDec(LangParser.FieldDecContext ctx) {
		// Get all the info about the field: public, static, type, and name
		// Defaults
		String isPublic = "public";
		String isStatic = "";
		String name = ctx.varName().getText();
		String type = ctx.type().getText();

		// If there is an accessmodifier make sure it is private
		if (ctx.accessModifier() != null) {
			if (ctx.accessModifier().getText().equals("private")) {
				isPublic = "private";
			}
		}
		// If there is a staticmodifier make sure it is static
		if (ctx.staticModifier() != null) {
			if (ctx.staticModifier().getText().equals("static")) {
				isPublic = "static";
			}
		}

		writer.println(".field " + isPublic + " " + isStatic + " " + name + " " + Lang.typeToDescriptor(Lang.qualifiedName(type)));
	}

	public void enterParam(LangParser.ParamContext ctx) {
		// Define a new variable for the parameter
		ProgramInfo.symTable.define(ctx.varName().getText(), ctx.type().getText());
	}

	// Declaration of the main method
	public void enterMainDec(LangParser.MainDecContext ctx) {
		// Clear all variables and define args
		ProgramInfo.symTable.clear();
		ProgramInfo.symTable.define("args", "String[]");
		writer.println(".method public static main([Ljava/lang/String;)V");
		writer.println(".limit stack 10");
		writer.println(".limit locals " + ProgramInfo.mainLocals);
	}

	public void exitMainDec(LangParser.MainDecContext ctx) {
		writer.println("return");
		writer.println(".end method");
	}

	public void enterConstructorDec(LangParser.ConstructorDecContext ctx) {
		ProgramInfo.symTable.clear();
		ProgramInfo.symTable.define("this", currentClassName);
		String paramTypes = "";
		int i = 0;
		while (true) {
			if (ctx.paramList().param(i) != null) {
				// Define each parameter
				paramTypes += Lang.typeToDescriptor(Lang.qualifiedName(ctx.paramList().param(i).type().getText()));
			} else {
				break;
			}
			i++;
		}
		writer.println(".method <init>(" + paramTypes + ")V");
		writer.println(".limit stack 10");
		writer.println(".limit locals 10");
	}

	public void exitConstructorDec(LangParser.ConstructorDecContext ctx) {
		writer.println("aload_0");
		writer.println("invokespecial java/lang/Object/<init>()V");
		writer.println("return");
		writer.println(".end method");
	}

	public void enterMethodDec(LangParser.MethodDecContext ctx) {
		// Clear all local variables
		ProgramInfo.symTable.clear();
		// Get all the info about the method: public, static, returntype, name, and parameters
		String name = ctx.methodName().getText();

		String isStatic = "";
		String isPublic = "public";

		if (ctx.accessModifier() != null) {
			if (ctx.accessModifier().getText().equals("private")) {
				isPublic = "private";
			}
		}

		if (ctx.staticModifier() != null) {
			if (ctx.staticModifier().getText().equals("static")) {
				isStatic = "static";
			}
		}

		if (!isStatic.equals("static")) {
			ProgramInfo.symTable.define("this", currentClassName);
		}

		String returnType = ctx.type().getText();

		String paramTypes = "";
		ArrayList<String> paramTypesList = new ArrayList<String>();
		int i = 0;
		while (true) {
			if (ctx.paramList().param(i) != null) {
				// Define each parameter
				paramTypesList.add(ctx.paramList().param(i).type().getText());
				// ProgramInfo.symTable.define(ctx.paramList().param(i).varName().getText(), ctx.paramList().param(i).type().getText());
				paramTypes += Lang.typeToDescriptor(Lang.qualifiedName(ctx.paramList().param(i).type().getText()));
			} else {
				break;
			}
			i++;
		}

		writer.println(".method " + isPublic + " " + isStatic + " " + name + "(" + paramTypes + ")" + Lang.typeToDescriptor(Lang.qualifiedName(returnType)));
		writer.println(".limit stack " + ProgramInfo.subTable.getStack(currentClassName + "." + name, paramTypesList.toArray(new String[paramTypesList.size()])));
		writer.println(".limit locals " + ProgramInfo.subTable.getLocals(currentClassName + "." + name, paramTypesList.toArray(new String[paramTypesList.size()])));
	}

	public void exitMethodDec(LangParser.MethodDecContext ctx) {
		// Only write a return statement if the method is void
		// Otherwise the return statement will be written by its own returnStatement node
		if (ctx.type().getText().equals("void")) {
			writer.println("return");
		}

		writer.println(".end method");
	}

	public void exitReturnStatement(LangParser.ReturnStatementContext ctx) {
		// Write the corresponding return statement

		writer.println(Lang.typeToAbbrev(Lang.qualifiedName(ctx.expr().getExprType())) + "return");
	}

	public void enterPrintStatement(LangParser.PrintStatementContext ctx) {
		// Get System.out
		writer.println("getstatic java/lang/System/out Ljava/io/PrintStream;");
		// Wait for parameters to be evaluated by expr and pushed to the stack
	}

	public void exitPrintStatement(LangParser.PrintStatementContext ctx) {
		String typeDescriptor = Lang.typeToDescriptor(Lang.qualifiedName(ctx.expr().getExprType()));
		LangMethod m = new LangMethod("PrintStream.println", new String[] {ctx.expr().getExprType()});
		// Invoke the PrintStream.println method
		writer.println("invokevirtual  java/io/PrintStream/println(" + typeDescriptor +  ")V");
	}

	public void exitAssignStatement(LangParser.AssignStatementContext ctx) {
		if (!ProgramInfo.symTable.contains(ctx.varName().getText())) {
			// If the variable does not already exist define it in the symbol table
			ProgramInfo.symTable.define(ctx.varName().getText(), ctx.expr().getExprType());
		} else if (!ProgramInfo.symTable.getType(ctx.varName().getText()).equals(ctx.expr().getExprType())) {
			// If the variable is being redefined with a different type, redefine it in the symbol table
			ProgramInfo.symTable.redefine(ctx.varName().getText(), ctx.expr().getExprType());
		}

		// Store the pushed expr inside the local variable location
		writer.println(Lang.typeToAbbrev(ctx.expr().getExprType()) + "store " + ProgramInfo.symTable.getNum(ctx.varName().getText()));
	}

	// Dan Broun easter egg
	public void enterDan(LangParser.DanContext ctx) {
		writer.println("getstatic java/lang/System/out Ljava/io/PrintStream;");
		writer.println("ldc \"Dan Broun is Lyf\"");
		writer.println("invokevirtual  java/io/PrintStream/println(Ljava/lang/String;)V");
	}

	// On entering an expression
	// This is where constants and variables are pushed to the stack
	public void enterExpr(LangParser.ExprContext ctx) {
		// Check whether it is a constant or a variable
		if (ctx.INT() != null) {
			// Push the int constant
			int i = Integer.parseInt(ctx.INT().getText());
			if (i >= 0 && i <= 5) {
				writer.println("iconst_" + i);
			} else if (i <= Byte.MAX_VALUE && i >= Byte.MIN_VALUE) {
				writer.println("bipush " + i);
			} else if (i <= Short.MAX_VALUE && i >= Short.MIN_VALUE) {
				writer.println("sipush " + i);
			} else if (i <= Integer.MAX_VALUE && i >= Integer.MAX_VALUE) {
				writer.println("ldc " + i);
			} else {
				System.err.println("Integer out of bounds exception on integer " + i);
				System.exit(1);
			}
		} else if (ctx.DOUBLE() != null) {
			// Push the double constant
			writer.println("ldc2_w " + ctx.DOUBLE().getText());
		} else if (ctx.STRING() != null) {
			// Push the String constant
			writer.println("ldc " + ctx.STRING().getText());
		} else if (ctx.varName() != null) {
			// Load the variable onto the stack
			writer.println(Lang.typeToAbbrev(ProgramInfo.symTable.getType(ctx.varName().getText())) + "load " + ProgramInfo.symTable.getNum(ctx.varName().getText()));
		}
	}

	// On exiting an expression
	// This is where operators such as multiplication and division are executed
	public void exitExpr(LangParser.ExprContext ctx) {
		// Get the abbrevation of the type being operated on (int, double...)
		String abbrev = Lang.typeToAbbrev(ctx.getExprType());
		// Multiplication or division
		if (ctx.operatorMulDiv() != null) {
			if (ctx.operatorMulDiv().getText().equals("*")) {
				writer.println(abbrev + "mul");
			}
			if (ctx.operatorMulDiv().getText().equals("/")) {
				writer.println(abbrev + "div");
			}
		}

		// Addition or subtraction
		if (ctx.operatorPlusMin() != null) {
			if (ctx.operatorPlusMin().getText().equals("+")) {
				if (ctx.expr(0).getExprType().equals("String") || ctx.expr(1).getExprType().equals("String")) {
					writer.println("invokestatic StdLib/concat(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;");
				} else if (ctx.expr(0).getExprType().equals("int")) {
					writer.println(abbrev + "add");
				}
			}
			if (ctx.operatorPlusMin().getText().equals("-")) {
				writer.println(abbrev + "sub");
			}
		}

		// Boolean operators
		if (ctx.boolOperator() != null) {
			String operator = ctx.boolOperator().getText();
			// This is the command that will be attached to the if statement afterward (ifeq is default)
			curBooleanCommand = "eq";
			// Equals
			if (operator.equals("==")) {
				if (ctx.expr(0).getExprType().equals("int")) {
					writer.println("if_icmpeq Label" + ProgramInfo.labelNum);
					writeBoolGoto();
				} else if (ctx.expr(0).getExprType().equals("double")) {
					writer.println("dcmpl");
					curBooleanCommand = "ne";
				}
				// Not equal
			} else if (operator.equals("!=")) {
				if (ctx.expr(0).getExprType().equals("int")) {
					writer.println("if_icmpne Label" + ProgramInfo.labelNum);
					writeBoolGoto();
				} else if (ctx.expr(0).getExprType().equals("double")) {
					writer.println("dcmpl");
				}
				// Greater than
			} else if (operator.equals(">")) {
				if (ctx.expr(0).getExprType().equals("int")) {
					writer.println("if_icmpgt Label" + ProgramInfo.labelNum);
					writeBoolGoto();
				} else if (ctx.expr(0).getExprType().equals("double")) {
					writer.println("dcmpl");
					curBooleanCommand = "le";
				}
				// Greater than or equal
			} else if (operator.equals(">=")) {
				if (ctx.expr(0).getExprType().equals("int")) {
					writer.println("if_icmpge Label" + ProgramInfo.labelNum);
					writeBoolGoto();
				} else if (ctx.expr(0).getExprType().equals("double")) {
					writer.println("dcmpl");
					curBooleanCommand = "lt";
				}
				// Less than
			} else if (operator.equals("<")) {
				if (ctx.expr(0).getExprType().equals("int")) {
					writer.println("if_icmplt Label" + ProgramInfo.labelNum);
					writeBoolGoto();
				} else if (ctx.expr(0).getExprType().equals("double")) {
					writer.println("dcmpg");
					curBooleanCommand = "ge";
				}
				// Less than or equal
			} else if (operator.equals("<=")) {
				if (ctx.expr(0).getExprType().equals("int")) {
					writer.println("if_icmple Label" + ProgramInfo.labelNum);
					writeBoolGoto();
				} else if (ctx.expr(0).getExprType().equals("double")) {
					writer.println("dcmpg");
					curBooleanCommand = "gt";
				}
				// TODO: 'or' and 'and'
			} else if (operator.equals("or")) {
			} else if (operator.equals("and")) {
			}
		}
	}

	// For booleans: jump to either true or false
	// The if-goto is written by exitexpr booleans
	private void writeBoolGoto() {
		// Push false
		writer.println("iconst_0");
		// Goto end (don't push true)
		writer.println("goto Label" + (ProgramInfo.labelNum + 1));
		// This label is the destination of the if-goto from exitexpr
		writer.println("Label" + ProgramInfo.labelNum + ":");
		// Push true
		writer.println("iconst_1");
		// Destination of the goto if the boolean was false (skipping push true)
		writer.println("Label" + (ProgramInfo.labelNum + 1) + ":");
		// Add 2 to the label num so there won't be problems next time booleans are used
		ProgramInfo.labelNum += 2;
	}

	// Get a field's value
	public void exitGetField(LangParser.GetFieldContext ctx) {
		String type = "";
		String varName = "";
		if (ctx.getField() != null) {
			// If this is recursive get the calling field's type
			// This is in onExit so the other fields have been evaluated
			type = ctx.getField().getFieldType();
		} else {
			// Get the type and varname of this field
			type = Lang.getType(ctx.className().getText())[0];
			varName = Lang.getType(ctx.className().getText())[1];
		}

		// Create a new field
		LangField f = new LangField(type + "." + ctx.varName().getText());
		String staticStr = f.isStatic() ? "static" : "field";
		if (!f.isStatic()) {
			// Make sure the caller variable exists
			// If not throw an error
			if (varName.equals("") && ctx.getField() == null) {
				System.err.println(ctx.className().getText() + "." + ctx.varName().getText() + " is not static but is being used statically");
				System.exit(1);
			}

			// If it is not a static field we have to load the caller variable
			writer.println(Lang.typeToAbbrev(type) + "load " + ProgramInfo.symTable.getNum(varName));
		}
		// Write the getfield
		writer.println("get" + staticStr + " " + Lang.qualifiedName(type) + "/" + ctx.varName().getText() + " " + Lang.typeToDescriptor(Lang.qualifiedName(f.type())));
	}

	// Storing a value in a field
	public void enterPutfield(LangParser.PutfieldContext ctx) {
		// Default class is current class
		String className = currentClassName;
		String varName = "";
		// If a classname is being used
		if (ctx.className() != null) {
			className = Lang.getType(ctx.className().getText())[0];
			varName = Lang.getType(ctx.className().getText())[1];
		} else if (ctx.getField() != null) {
			className = ctx.getField().getFieldType();
		}

		// Create the field
		LangField f = new LangField(className + "." + ctx.varName().getText());

		// If there is no type throw an error
		if (f.type() == null) {
			System.err.println("Field " + className + "." + ctx.varName().getText() + " does not exist");
			System.exit(1);
		}

		// Throw an error if there is a type mismatch between the defined field and the expr being stored in it
		if (!f.type().equals(ctx.expr().getExprType())) {
			System.err.println("Type mismatch: " + className + "." + ctx.varName().getText() + " is an " + f.type() + " and the expression given is a " + ctx.expr().getExprType());
			System.exit(1);
		}

		boolean isStatic = f.isStatic();

		if (!isStatic) {
			// Make sure a caller variable exists if the field is not static
			if (varName.equals("") && ctx.getField() == null) {
				System.out.println(className + "." + ctx.varName().getText() + " is not static but is being used statically");
				System.exit(1);
			}
			// Load the caller variable
			writer.println(Lang.typeToAbbrev(varName) + "load " + ProgramInfo.symTable.getNum(varName));
		}
	}

	// Called once the expr being stored has been pushed to the stack
	public void exitPutfield(LangParser.PutfieldContext ctx) {
		// Default is current class name
		String className = currentClassName;
		if (ctx.className() != null) {
			className = Lang.getType(ctx.className().getText())[0];
		} else if (ctx.getField() != null) {
			className = ctx.getField().getFieldType();
		}

		LangField f = new LangField(className + "." + ctx.varName().getText());

		// Make sure there is no type mismatch (Perhaps this is redundant code as this is also checked in the enter method)
		if (!f.type().equals(ctx.expr().getExprType())) {
			System.err.println("Type mismatch: " + className + "." + ctx.varName().getText() + " is an " + f.type() + " and the expression given is a " + ctx.expr().getExprType());
			System.exit(1);
		}

		String type = f.type();
		String staticStr = f.isStatic() ? "static " : "field ";

		writer.println("put" + staticStr + "" + Lang.qualifiedName(className) + "/" + ctx.varName().getText() + " " + Lang.typeToDescriptor(f.type()));
	}

	// Used to load the calling variable (if the method is not static)
	public void enterMethodCall(LangParser.MethodCallContext ctx) {
		// Get all the necessary info to retrieve the method from the subroutine table
		String methodName = ctx.methodName().getText();
		String paramTypesStr = "";
		ArrayList<String> paramTypesList = new ArrayList<String>();
		for (int i = 0; ctx.exprList().expr(i) != null; i++) {
			paramTypesList.add(ctx.exprList().expr(i).getExprType());
			paramTypesStr += Lang.typeToDescriptor(Lang.qualifiedName(ctx.exprList().expr(i).getExprType()));
		}

		String className = currentClassName;
		String varName = "";

		if (ctx.className() != null) {
			className = Lang.getType(ctx.className().getText())[0];
			varName = Lang.getType(ctx.className().getText())[1];
		} else if (ctx.getField() != null) {
			className = ctx.getField().getFieldType();
		} else if (ctx.methodCall() != null) {
			className = ctx.methodCall().getMethodType();
		}

		String[] paramTypes = paramTypesList.toArray(new String[paramTypesList.size()]);

		LangMethod m = new LangMethod(className + "." + methodName, paramTypes);
		System.out.println("Hello");
		String returnType = m.returnType();
		boolean isStatic = m.isStatic();

		className = Lang.qualifiedName(className);
		if (!isStatic && ctx.getField() == null && ctx.methodCall() == null) {
			if (varName.equals("")) {
				System.err.println("Method " + className + "." + methodName + " is not static but is being used statically");
				System.exit(1);
			}
			// Push the calling variable to the stack
			writer.println(Lang.typeToAbbrev(className) + "load " + ProgramInfo.symTable.getNum(varName));
		}
	}

	// The main part of the method call
	public void exitMethodCall(LangParser.MethodCallContext ctx) {
		String methodName = ctx.methodName().getText();
		String paramTypesStr = "";
		ArrayList<String> paramTypesList = new ArrayList<String>();
		for (int i = 0; ctx.exprList().expr(i) != null; i++) {
			paramTypesList.add(ctx.exprList().expr(i).getExprType());
			paramTypesStr += Lang.typeToDescriptor(Lang.qualifiedName(ctx.exprList().expr(i).getExprType()));
		}

		String className = currentClassName;
		String varName = "";

		if (ctx.className() != null) {
			className = Lang.getType(ctx.className().getText())[0];
			varName = Lang.getType(ctx.className().getText())[1];
		} else if (ctx.getField() != null) {
			className = ctx.getField().getFieldType();
		} else if (ctx.methodCall() != null) {
			className = ctx.methodCall().getMethodType();
		}

		String[] paramTypes = paramTypesList.toArray(new String[paramTypesList.size()]);

		LangMethod m = new LangMethod(className + "." + methodName, paramTypes);
		String returnType = m.returnType();
		boolean isStatic = m.isStatic();

		className = Lang.qualifiedName(className);

		if (!isStatic) {
			if (varName.equals("") && ctx.getField() == null && ctx.methodCall() == null) {
				System.err.println("Method " + className + "." + methodName + " is not static but is being used statically");
				System.exit(1);
			}
			writer.println("invokevirtual " + className.replaceAll("\\.", "/") + "/" + methodName + "(" + paramTypesStr + ")" + Lang.typeToDescriptor(Lang.qualifiedName(returnType)));
		} else {
			if (!varName.equals("")) {
				System.err.println("Method " + className + "." + methodName + " is static but is not being used statically");
				System.exit(1);
			}
			writer.println("invokestatic " + className.replaceAll("\\.", "/") + "/" + methodName + "(" + paramTypesStr + ")" + Lang.typeToDescriptor(Lang.qualifiedName(returnType)));
		}
	}

	public void enterInitialization(LangParser.InitializationContext ctx) {
		// Create a new object and duplicate it
		writer.println("new " + Lang.qualifiedName(ctx.type().getText()).replaceAll("\\.", "/"));
		writer.println("dup");
		// Wait for all parameters to be pushed to the stack
		// The object will be instantiated on the exit method
	}

	public void exitInitialization(LangParser.InitializationContext ctx) {
		String paramTypes = "";
		for (int i = 0; ctx.exprList().expr(i) != null; i++) {
			paramTypes += Lang.typeToDescriptor(Lang.qualifiedName(ctx.exprList().expr(i).getExprType()));
		}
		// Invoke the constructor with the given parameters
		writer.println("invokespecial " + Lang.qualifiedName(ctx.type().getText()).replaceAll("\\.", "/") + "/<init>(" + paramTypes + ")V");
	}

	// Initialize an array
	public void enterArrayInit(LangParser.ArrayInitContext ctx) {
		String arrayType = Lang.qualifiedName(ctx.arrayType().ID().getText());
		String abbrev = "";
		// Only use an abbrevation if it is an array of objects
		if (Lang.typeToAbbrev(arrayType).equals("a")) {
			abbrev = "a";
		}
		// Push the size of the array
		writer.println("ldc " + ctx.arrayType().expr(0).getText());
		// Initialize the new array
		writer.println(abbrev + "newarray " + arrayType.replaceAll("\\.", "/"));
	}

	// Get a value from an array
	public void enterArrayGet(LangParser.ArrayGetContext ctx) {
		// Get the type of the array variable
		String type = ProgramInfo.symTable.getType(ctx.varName().getText());
		// Push the array
		writer.println("aload " + ProgramInfo.symTable.getNum(ctx.varName().getText()));
		// Push the index number
		if (!ctx.expr(0).getExprType().equals("int")) {
			System.out.println("Error on expression ");
			System.exit(1);
		}
		writer.println("ldc " + ctx.expr(0).getText());
		// Push the value at the index
		writer.println(Lang.typeToAbbrev(type.substring(0, type.indexOf("["))) + "aload");
	}

	// Called before the expr is evaluated, here the array must be ready to store a value
	public void enterArrayAssign(LangParser.ArrayAssignContext ctx) {
		// Load the array
		writer.println("aload " + ProgramInfo.symTable.getNum(ctx.varName().getText()));
		// Push the index
		writer.println("ldc " + ctx.INT(0).getText());
	}

	// Store the pushed expr inside the array
	public void exitArrayAssign(LangParser.ArrayAssignContext ctx) {
		String type = ProgramInfo.symTable.getType(ctx.varName().getText());
		// Array store the value on the top of the stack
		writer.println(Lang.typeToAbbrev(type.substring(0, type.indexOf("["))) + "astore");
	}

	// After the boolean expr has been pushed to the stack, jump to the label (if false) which will be written after exiting the entire if block
	public void exitIfDec(LangParser.IfDecContext ctx) {
		// Goto the else label (if the condition is false)
		writer.println("if" + curBooleanCommand + " " + "IfLabel" + ProgramInfo.ifLabelNum);
		ProgramInfo.ifLabelStack.push(ProgramInfo.ifLabelNum);
	}

	// After exiting the if write the ending label and goto the very end (this is for possible else statements)
	public void exitIfBody(LangParser.IfBodyContext ctx) {
		int ifLabelNum = ProgramInfo.ifLabelStack.pop();
		// Goto the end label
		writer.println("goto IfLabel" + (ifLabelNum + 1));
		// Write the else label
		writer.println("IfLabel" + ifLabelNum + ":");
		ProgramInfo.ifLabelStack.push(ifLabelNum);
	}

	// Write the final ending label
	public void exitIfStatement(LangParser.IfStatementContext ctx) {
		int ifLabelNum = ProgramInfo.ifLabelStack.pop();
		writer.println("IfLabel" + (ProgramInfo.ifLabelNum + 1) + ":");
		ProgramInfo.ifLabelNum += 2;
	}

	public void enterWhileDec(LangParser.WhileDecContext ctx) {
		// Write the while label
		writer.println("WhileLabel" + ProgramInfo.whileLabelNum + ":");
		// Push the while label number that we are currently at
		// This is necessary for making nested loops work
		ProgramInfo.whileLabelStack.push(ProgramInfo.whileLabelNum);
	}

	public void exitWhileDec(LangParser.WhileDecContext ctx) {
		// If the pushed boolean condition is false, jump to the end of the loop
		writer.println("ifeq WhileLabel" + (ProgramInfo.whileLabelNum + 1));
		ProgramInfo.whileLabelNum += 2;
	}

	public void exitWhileStatement(LangParser.WhileStatementContext ctx) {
		// Pop the current while label num off the stack
		int whileLabelNum = ProgramInfo.whileLabelStack.pop();
		// Goto the first label in the loop
		writer.println("goto WhileLabel" + whileLabelNum);
		// Write the end label
		writer.println("WhileLabel" + (whileLabelNum + 1) + ":");
	}

	// This provides the ability to inline jasmin bytecode in your program
	public void enterBytecodeStatement(LangParser.BytecodeStatementContext ctx) {
		// Write out literally what is written (excluding the 'bytecode' statement)
	}
}
