import java.util.*;
import java.io.*;

class TypeChecker extends LangBaseListener {
	private String curClass;
	private String curMethod;
	private int stackSize = 10;

	public void enterImportDec(LangParser.ImportDecContext ctx) {
		if (!ProgramInfo.importList.contains(ctx.packageName().getText())) {
			ProgramInfo.importList.add(ctx.packageName().getText());
		}
	}

	public void enterClassDec(LangParser.ClassDecContext ctx) {
		curClass = ctx.className().getText();
	}

	public void exitAssignStatement(LangParser.AssignStatementContext ctx) {
		if (!ProgramInfo.symTable.contains(ctx.varName().getText())) {
			ProgramInfo.symTable.define(ctx.varName().getText(), ctx.expr().getExprType());
		} else if (!ProgramInfo.symTable.getType(ctx.varName().getText()).equals(ctx.expr().getExprType())) {
			ProgramInfo.symTable.redefine(ctx.varName().getText(), ctx.expr().getExprType());
		}
	}

	public void enterMainDec(LangParser.MainDecContext ctx) {
		ProgramInfo.symTable.clear();
		ProgramInfo.symTable.define("args", "String[]");
	}

	public void exitMainDec(LangParser.MainDecContext ctx) {
		ProgramInfo.mainLocals = ProgramInfo.symTable.numLocals();
	}

	public void enterMethodDec(LangParser.MethodDecContext ctx) {
		curMethod = ctx.methodName().getText();
		ProgramInfo.symTable.clear();
		boolean isStatic = false;
		if (ctx.staticModifier() != null) {
			if (ctx.staticModifier().getText().equals("static")) {
				isStatic = true;
			}
		}
		if (!isStatic) {
			ProgramInfo.symTable.define("this", curClass);
		}
	}

	public void exitMethodDec(LangParser.MethodDecContext ctx) {
		ProgramInfo.subTable.addLocals(ProgramInfo.symTable.numLocals());
		ProgramInfo.subTable.addStack(stackSize);
	}

	public void enterParam(LangParser.ParamContext ctx) {
		ProgramInfo.symTable.define(ctx.varName().getText(), ctx.type().getText());
	}

	public void exitGetField(LangParser.GetFieldContext ctx) {
		String type = "";
		if (ctx.getField() != null) {
			ctx.setFieldType(ctx.getField().getFieldType());
		} else {
			String className = Lang.qualifiedName(ctx.className().getText());
			if (ProgramInfo.symTable.contains(ctx.className().getText())) {
				String varType = ProgramInfo.symTable.getType(ctx.className().getText());
				LangField f = new LangField(varType + "." + ctx.varName().getText());
				type = f.type();
			} else {
				if (Lang.classExists(className)) {
					LangField f = new LangField(ctx.className().getText() + "." + ctx.varName().getText());
					type = f.type();
				}
			}
		}

		ctx.setFieldType(type);
	}

	public void exitMethodCall(LangParser.MethodCallContext ctx) {
		String className = curClass;
		if (ctx.className() != null) {
			className = Lang.getType(ctx.className().getText())[0];
		} else if (ctx.getField() != null) {
			className = ctx.getField().getFieldType();
		} else if (ctx.methodCall() != null) {
			className = ctx.methodCall().getMethodType();
		}
		className = Lang.qualifiedName(className);

		ArrayList<String> paramTypesList = new ArrayList<String>();
		for (int i = 0; ctx.exprList().expr(i) != null; i++) {
			paramTypesList.add(ctx.exprList().expr(i).getExprType());
		}

		String[] paramTypes = paramTypesList.toArray(new String[paramTypesList.size()]);

		LangMethod m = new LangMethod(className + "." + ctx.methodName().getText(), paramTypes);
		ctx.setMethodType(m.returnType());
	}

	public void exitExpr(LangParser.ExprContext ctx) {
		if (ctx.cast() != null) {
			ctx.setExprType(ctx.cast().type().getText());
		} else if (ctx.initialization() != null) {
			ctx.setExprType(ctx.initialization().type().getText());
		} else if (ctx.arrayInit() != null) {
			ctx.setExprType(ctx.arrayInit().arrayType().ID().getText() + "[]");
		} else if (ctx.methodCall() != null) {
			String className = curClass;
			if (ctx.methodCall().className() != null) {
				className = Lang.getType(ctx.methodCall().className().getText())[0];
			} else if (ctx.methodCall().getField() != null) {
				className = ctx.methodCall().getField().getFieldType();
			} else if (ctx.methodCall().methodCall() != null) {
				className = ctx.methodCall().methodCall().getMethodType();
			}
			className = Lang.qualifiedName(className);

			ArrayList<String> paramTypesList = new ArrayList<String>();
			for (int i = 0; ctx.methodCall().exprList().expr(i) != null; i++) {
				paramTypesList.add(ctx.methodCall().exprList().expr(i).getExprType());
			}

			String[] paramTypes = paramTypesList.toArray(new String[paramTypesList.size()]);

			LangMethod m = new LangMethod(className + "." + ctx.methodCall().methodName().getText(), paramTypes);
			ctx.setExprType(m.returnType());
			ctx.methodCall().setMethodType(m.returnType());
		} else if (ctx.varName() != null) {
			if (ProgramInfo.symTable.contains(ctx.varName().getText())) {
				String type = Lang.getType(ctx.varName().getText())[0];
				ctx.setExprType(type);
			}
		} else if (ctx.arrayGet() != null) {
			String arrayType = ProgramInfo.symTable.getType(ctx.arrayGet().varName().getText());
			if (arrayType.indexOf("[") == 0) {
				ctx.setExprType(arrayType.substring(arrayType.indexOf("L") + 1, arrayType.indexOf(";")));
			} else {
				ctx.setExprType(arrayType.substring(0, arrayType.indexOf("[")));
			}
		} else if (ctx.getField() != null) {
			ctx.setExprType(ctx.getField().getFieldType());
		} else if (ctx.STRING() != null) {
			ctx.setExprType("String");
		} else if (ctx.DOUBLE() != null) {
			ctx.setExprType("double");
		} else if (ctx.INT() != null) {
			ctx.setExprType("int");
		} else if (ctx.BOOL() != null) {
			ctx.setExprType("boolean");
		} else if (ctx.boolOperator() != null) {
			ctx.setExprType("boolean");
		} else if (ctx.operatorMulDiv() != null) {
			ctx.setExprType(ctx.expr(0).getExprType());
		} else if (ctx.operatorPlusMin() != null) {
			ctx.setExprType(ctx.expr(0).getExprType());
		} else if (ctx.boolOperator() != null) {
			ctx.setExprType(ctx.expr(0).getExprType());
		} else {
			ctx.setExprType(ctx.expr(0).getExprType());
		}
	}
}
