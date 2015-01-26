// Generated from Lang.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangParser}.
 */
public interface LangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LangParser#whileBody}.
	 * @param ctx the parse tree
	 */
	void enterWhileBody(@NotNull LangParser.WhileBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#whileBody}.
	 * @param ctx the parse tree
	 */
	void exitWhileBody(@NotNull LangParser.WhileBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#methodDec}.
	 * @param ctx the parse tree
	 */
	void enterMethodDec(@NotNull LangParser.MethodDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#methodDec}.
	 * @param ctx the parse tree
	 */
	void exitMethodDec(@NotNull LangParser.MethodDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#classDec}.
	 * @param ctx the parse tree
	 */
	void enterClassDec(@NotNull LangParser.ClassDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#classDec}.
	 * @param ctx the parse tree
	 */
	void exitClassDec(@NotNull LangParser.ClassDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(@NotNull LangParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(@NotNull LangParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(@NotNull LangParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(@NotNull LangParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(@NotNull LangParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(@NotNull LangParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(@NotNull LangParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(@NotNull LangParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull LangParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull LangParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#ifDec}.
	 * @param ctx the parse tree
	 */
	void enterIfDec(@NotNull LangParser.IfDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#ifDec}.
	 * @param ctx the parse tree
	 */
	void exitIfDec(@NotNull LangParser.IfDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(@NotNull LangParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(@NotNull LangParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull LangParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull LangParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull LangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull LangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#elseBody}.
	 * @param ctx the parse tree
	 */
	void enterElseBody(@NotNull LangParser.ElseBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#elseBody}.
	 * @param ctx the parse tree
	 */
	void exitElseBody(@NotNull LangParser.ElseBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#bytecodeStatement}.
	 * @param ctx the parse tree
	 */
	void enterBytecodeStatement(@NotNull LangParser.BytecodeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#bytecodeStatement}.
	 * @param ctx the parse tree
	 */
	void exitBytecodeStatement(@NotNull LangParser.BytecodeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#boolOperator}.
	 * @param ctx the parse tree
	 */
	void enterBoolOperator(@NotNull LangParser.BoolOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#boolOperator}.
	 * @param ctx the parse tree
	 */
	void exitBoolOperator(@NotNull LangParser.BoolOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull LangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull LangParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#varName}.
	 * @param ctx the parse tree
	 */
	void enterVarName(@NotNull LangParser.VarNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#varName}.
	 * @param ctx the parse tree
	 */
	void exitVarName(@NotNull LangParser.VarNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#arrayAssign}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssign(@NotNull LangParser.ArrayAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#arrayAssign}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssign(@NotNull LangParser.ArrayAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#fieldDecs}.
	 * @param ctx the parse tree
	 */
	void enterFieldDecs(@NotNull LangParser.FieldDecsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#fieldDecs}.
	 * @param ctx the parse tree
	 */
	void exitFieldDecs(@NotNull LangParser.FieldDecsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#putfield}.
	 * @param ctx the parse tree
	 */
	void enterPutfield(@NotNull LangParser.PutfieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#putfield}.
	 * @param ctx the parse tree
	 */
	void exitPutfield(@NotNull LangParser.PutfieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void enterIfBody(@NotNull LangParser.IfBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void exitIfBody(@NotNull LangParser.IfBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(@NotNull LangParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(@NotNull LangParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(@NotNull LangParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(@NotNull LangParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#easterEgg}.
	 * @param ctx the parse tree
	 */
	void enterEasterEgg(@NotNull LangParser.EasterEggContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#easterEgg}.
	 * @param ctx the parse tree
	 */
	void exitEasterEgg(@NotNull LangParser.EasterEggContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(@NotNull LangParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(@NotNull LangParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(@NotNull LangParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(@NotNull LangParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessModifier(@NotNull LangParser.AccessModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessModifier(@NotNull LangParser.AccessModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#importDec}.
	 * @param ctx the parse tree
	 */
	void enterImportDec(@NotNull LangParser.ImportDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#importDec}.
	 * @param ctx the parse tree
	 */
	void exitImportDec(@NotNull LangParser.ImportDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#operatorPlusMin}.
	 * @param ctx the parse tree
	 */
	void enterOperatorPlusMin(@NotNull LangParser.OperatorPlusMinContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#operatorPlusMin}.
	 * @param ctx the parse tree
	 */
	void exitOperatorPlusMin(@NotNull LangParser.OperatorPlusMinContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#staticModifier}.
	 * @param ctx the parse tree
	 */
	void enterStaticModifier(@NotNull LangParser.StaticModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#staticModifier}.
	 * @param ctx the parse tree
	 */
	void exitStaticModifier(@NotNull LangParser.StaticModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#getField}.
	 * @param ctx the parse tree
	 */
	void enterGetField(@NotNull LangParser.GetFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#getField}.
	 * @param ctx the parse tree
	 */
	void exitGetField(@NotNull LangParser.GetFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#mainDec}.
	 * @param ctx the parse tree
	 */
	void enterMainDec(@NotNull LangParser.MainDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#mainDec}.
	 * @param ctx the parse tree
	 */
	void exitMainDec(@NotNull LangParser.MainDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(@NotNull LangParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(@NotNull LangParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#inheritance}.
	 * @param ctx the parse tree
	 */
	void enterInheritance(@NotNull LangParser.InheritanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#inheritance}.
	 * @param ctx the parse tree
	 */
	void exitInheritance(@NotNull LangParser.InheritanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#fieldDec}.
	 * @param ctx the parse tree
	 */
	void enterFieldDec(@NotNull LangParser.FieldDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#fieldDec}.
	 * @param ctx the parse tree
	 */
	void exitFieldDec(@NotNull LangParser.FieldDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(@NotNull LangParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(@NotNull LangParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#arrayGet}.
	 * @param ctx the parse tree
	 */
	void enterArrayGet(@NotNull LangParser.ArrayGetContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#arrayGet}.
	 * @param ctx the parse tree
	 */
	void exitArrayGet(@NotNull LangParser.ArrayGetContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull LangParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull LangParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#initialization}.
	 * @param ctx the parse tree
	 */
	void enterInitialization(@NotNull LangParser.InitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#initialization}.
	 * @param ctx the parse tree
	 */
	void exitInitialization(@NotNull LangParser.InitializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull LangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull LangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#arrayInit}.
	 * @param ctx the parse tree
	 */
	void enterArrayInit(@NotNull LangParser.ArrayInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#arrayInit}.
	 * @param ctx the parse tree
	 */
	void exitArrayInit(@NotNull LangParser.ArrayInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(@NotNull LangParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(@NotNull LangParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#cast}.
	 * @param ctx the parse tree
	 */
	void enterCast(@NotNull LangParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#cast}.
	 * @param ctx the parse tree
	 */
	void exitCast(@NotNull LangParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull LangParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull LangParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#dan}.
	 * @param ctx the parse tree
	 */
	void enterDan(@NotNull LangParser.DanContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#dan}.
	 * @param ctx the parse tree
	 */
	void exitDan(@NotNull LangParser.DanContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#operatorMulDiv}.
	 * @param ctx the parse tree
	 */
	void enterOperatorMulDiv(@NotNull LangParser.OperatorMulDivContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#operatorMulDiv}.
	 * @param ctx the parse tree
	 */
	void exitOperatorMulDiv(@NotNull LangParser.OperatorMulDivContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#constructorDec}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDec(@NotNull LangParser.ConstructorDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#constructorDec}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDec(@NotNull LangParser.ConstructorDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#whileDec}.
	 * @param ctx the parse tree
	 */
	void enterWhileDec(@NotNull LangParser.WhileDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#whileDec}.
	 * @param ctx the parse tree
	 */
	void exitWhileDec(@NotNull LangParser.WhileDecContext ctx);
}