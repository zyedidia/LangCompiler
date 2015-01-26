// Generated from Lang.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__40=1, T__39=2, T__38=3, T__37=4, T__36=5, T__35=6, T__34=7, T__33=8, 
		T__32=9, T__31=10, T__30=11, T__29=12, T__28=13, T__27=14, T__26=15, T__25=16, 
		T__24=17, T__23=18, T__22=19, T__21=20, T__20=21, T__19=22, T__18=23, 
		T__17=24, T__16=25, T__15=26, T__14=27, T__13=28, T__12=29, T__11=30, 
		T__10=31, T__9=32, T__8=33, T__7=34, T__6=35, T__5=36, T__4=37, T__3=38, 
		T__2=39, T__1=40, T__0=41, ID=42, STRING=43, BOOL=44, DOUBLE=45, INT=46, 
		DIGIT=47, LINE_COMMENT=48, COMMENT=49, WS=50;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'public'", "','", "'while'", "'['", "'or'", "'*'", 
		"'-'", "':'", "'('", "'if'", "'<'", "'main'", "'!='", "'private'", "'<='", 
		"'''", "'{'", "'and'", "'extends'", "'constructor'", "'else'", "'}'", 
		"'static'", "'arr'", "'import'", "'.'", "')'", "'virtual'", "'+'", "'print'", 
		"'return'", "'='", "'bytecode'", "'Dan'", "'>'", "'new'", "'=='", "'/'", 
		"'class'", "'>='", "ID", "STRING", "BOOL", "DOUBLE", "INT", "DIGIT", "LINE_COMMENT", 
		"COMMENT", "WS"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_importDec = 1, RULE_packageName = 2, RULE_classDec = 3, 
		RULE_inheritance = 4, RULE_classBody = 5, RULE_mainDec = 6, RULE_methodDec = 7, 
		RULE_methodBody = 8, RULE_constructorDec = 9, RULE_methodCall = 10, RULE_getField = 11, 
		RULE_fieldDecs = 12, RULE_fieldDec = 13, RULE_className = 14, RULE_methodName = 15, 
		RULE_varName = 16, RULE_type = 17, RULE_arrayType = 18, RULE_accessModifier = 19, 
		RULE_staticModifier = 20, RULE_statement = 21, RULE_printStatement = 22, 
		RULE_assignStatement = 23, RULE_arrayAssign = 24, RULE_returnStatement = 25, 
		RULE_putfield = 26, RULE_ifStatement = 27, RULE_ifDec = 28, RULE_ifBody = 29, 
		RULE_elseBody = 30, RULE_whileStatement = 31, RULE_whileDec = 32, RULE_whileBody = 33, 
		RULE_bytecodeStatement = 34, RULE_exprList = 35, RULE_paramList = 36, 
		RULE_param = 37, RULE_expr = 38, RULE_cast = 39, RULE_boolOperator = 40, 
		RULE_initialization = 41, RULE_arrayInit = 42, RULE_arrayGet = 43, RULE_operatorMulDiv = 44, 
		RULE_operatorPlusMin = 45, RULE_easterEgg = 46, RULE_dan = 47;
	public static final String[] ruleNames = {
		"compilationUnit", "importDec", "packageName", "classDec", "inheritance", 
		"classBody", "mainDec", "methodDec", "methodBody", "constructorDec", "methodCall", 
		"getField", "fieldDecs", "fieldDec", "className", "methodName", "varName", 
		"type", "arrayType", "accessModifier", "staticModifier", "statement", 
		"printStatement", "assignStatement", "arrayAssign", "returnStatement", 
		"putfield", "ifStatement", "ifDec", "ifBody", "elseBody", "whileStatement", 
		"whileDec", "whileBody", "bytecodeStatement", "exprList", "paramList", 
		"param", "expr", "cast", "boolOperator", "initialization", "arrayInit", 
		"arrayGet", "operatorMulDiv", "operatorPlusMin", "easterEgg", "dan"
	};

	@Override
	public String getGrammarFileName() { return "Lang.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public List<ClassDecContext> classDec() {
			return getRuleContexts(ClassDecContext.class);
		}
		public TerminalNode EOF() { return getToken(LangParser.EOF, 0); }
		public ImportDecContext importDec(int i) {
			return getRuleContext(ImportDecContext.class,i);
		}
		public ClassDecContext classDec(int i) {
			return getRuleContext(ClassDecContext.class,i);
		}
		public List<ImportDecContext> importDec() {
			return getRuleContexts(ImportDecContext.class);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(96); importDec();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(102); classDec();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDecContext extends ParserRuleContext {
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public ImportDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterImportDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitImportDec(this);
		}
	}

	public final ImportDecContext importDec() throws RecognitionException {
		ImportDecContext _localctx = new ImportDecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(T__15);
			setState(111); packageName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageNameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(LangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LangParser.ID, i);
		}
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterPackageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitPackageName(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		PackageNameContext _localctx = new PackageNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_packageName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(ID);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(114); match(T__14);
				setState(115); match(ID);
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDecContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public InheritanceContext inheritance() {
			return getRuleContext(InheritanceContext.class,0);
		}
		public ClassDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterClassDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitClassDec(this);
		}
	}

	public final ClassDecContext classDec() throws RecognitionException {
		ClassDecContext _localctx = new ClassDecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); match(T__1);
			setState(122); className();
			setState(124);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(123); inheritance();
				}
			}

			setState(126); match(T__23);
			setState(127); classBody();
			setState(128); match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InheritanceContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public InheritanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterInheritance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitInheritance(this);
		}
	}

	public final InheritanceContext inheritance() throws RecognitionException {
		InheritanceContext _localctx = new InheritanceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_inheritance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); match(T__21);
			setState(131); className();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public ConstructorDecContext constructorDec(int i) {
			return getRuleContext(ConstructorDecContext.class,i);
		}
		public FieldDecsContext fieldDecs() {
			return getRuleContext(FieldDecsContext.class,0);
		}
		public List<ConstructorDecContext> constructorDec() {
			return getRuleContexts(ConstructorDecContext.class);
		}
		public List<MainDecContext> mainDec() {
			return getRuleContexts(MainDecContext.class);
		}
		public List<MethodDecContext> methodDec() {
			return getRuleContexts(MethodDecContext.class);
		}
		public MainDecContext mainDec(int i) {
			return getRuleContext(MainDecContext.class,i);
		}
		public MethodDecContext methodDec(int i) {
			return getRuleContext(MethodDecContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); fieldDecs();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__28) | (1L << T__26) | (1L << T__20) | (1L << T__17) | (1L << T__12) | (1L << ID))) != 0)) {
				{
				setState(137);
				switch (_input.LA(1)) {
				case T__20:
					{
					setState(134); constructorDec();
					}
					break;
				case T__39:
				case T__26:
				case T__17:
				case T__12:
				case ID:
					{
					setState(135); methodDec();
					}
					break;
				case T__28:
					{
					setState(136); mainDec();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainDecContext extends ParserRuleContext {
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MainDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterMainDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitMainDec(this);
		}
	}

	public final MainDecContext mainDec() throws RecognitionException {
		MainDecContext _localctx = new MainDecContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mainDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); match(T__28);
			setState(143); match(T__23);
			setState(144); methodBody();
			setState(145); match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDecContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public StaticModifierContext staticModifier() {
			return getRuleContext(StaticModifierContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MethodDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterMethodDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitMethodDec(this);
		}
	}

	public final MethodDecContext methodDec() throws RecognitionException {
		MethodDecContext _localctx = new MethodDecContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methodDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if (_la==T__39 || _la==T__26) {
				{
				setState(147); accessModifier();
				}
			}

			setState(151);
			_la = _input.LA(1);
			if (_la==T__17 || _la==T__12) {
				{
				setState(150); staticModifier();
				}
			}

			setState(153); type();
			setState(154); methodName();
			setState(155); match(T__31);
			setState(156); paramList();
			setState(157); match(T__13);
			setState(158); match(T__23);
			setState(159); methodBody();
			setState(160); match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__30) | (1L << T__10) | (1L << T__9) | (1L << T__7) | (1L << T__6) | (1L << ID))) != 0)) {
				{
				{
				setState(162); statement();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDecContext extends ParserRuleContext {
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public ConstructorDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterConstructorDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitConstructorDec(this);
		}
	}

	public final ConstructorDecContext constructorDec() throws RecognitionException {
		ConstructorDecContext _localctx = new ConstructorDecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constructorDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); match(T__20);
			setState(169); match(T__31);
			setState(170); paramList();
			setState(171); match(T__13);
			setState(172); match(T__23);
			setState(173); methodBody();
			setState(174); match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		private String methodType;
		public void setMethodType(String type) {
			methodType = type;
		}
		public String getMethodType() {
			return methodType;
		}
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public GetFieldContext getField() {
			return getRuleContext(GetFieldContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitMethodCall(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		return methodCall(0);
	}

	private MethodCallContext methodCall(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MethodCallContext _localctx = new MethodCallContext(_ctx, _parentState);
		MethodCallContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_methodCall, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(177); className();
				setState(178); match(T__14);
				setState(179); methodName();
				setState(180); match(T__31);
				setState(181); exprList();
				setState(182); match(T__13);
				}
				break;
			case 2:
				{
				setState(184); getField(0);
				setState(185); match(T__14);
				setState(186); methodName();
				setState(187); match(T__31);
				setState(188); exprList();
				setState(189); match(T__13);
				}
				break;
			case 3:
				{
				setState(191); methodName();
				setState(192); match(T__31);
				setState(193); exprList();
				setState(194); match(T__13);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MethodCallContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_methodCall);
					setState(198);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(199); match(T__14);
					setState(200); methodName();
					setState(201); match(T__31);
					setState(202); exprList();
					setState(203); match(T__13);
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class GetFieldContext extends ParserRuleContext {
		private String fieldType;
		public void setFieldType(String type) {
			fieldType = type;
		}
		public String getFieldType() {
			return fieldType;
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public GetFieldContext getField() {
			return getRuleContext(GetFieldContext.class,0);
		}
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public GetFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterGetField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitGetField(this);
		}
	}

	public final GetFieldContext getField() throws RecognitionException {
		return getField(0);
	}

	private GetFieldContext getField(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GetFieldContext _localctx = new GetFieldContext(_ctx, _parentState);
		GetFieldContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_getField, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(211); className();
			setState(212); match(T__14);
			setState(213); varName();
			}
			_ctx.stop = _input.LT(-1);
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GetFieldContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_getField);
					setState(215);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(216); match(T__14);
					setState(217); varName();
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FieldDecsContext extends ParserRuleContext {
		public FieldDecContext fieldDec(int i) {
			return getRuleContext(FieldDecContext.class,i);
		}
		public List<FieldDecContext> fieldDec() {
			return getRuleContexts(FieldDecContext.class);
		}
		public FieldDecsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterFieldDecs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitFieldDecs(this);
		}
	}

	public final FieldDecsContext fieldDecs() throws RecognitionException {
		FieldDecsContext _localctx = new FieldDecsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fieldDecs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(223); fieldDec();
					}
					} 
				}
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDecContext extends ParserRuleContext {
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public StaticModifierContext staticModifier() {
			return getRuleContext(StaticModifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public FieldDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterFieldDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitFieldDec(this);
		}
	}

	public final FieldDecContext fieldDec() throws RecognitionException {
		FieldDecContext _localctx = new FieldDecContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fieldDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if (_la==T__39 || _la==T__26) {
				{
				setState(229); accessModifier();
				}
			}

			setState(233);
			_la = _input.LA(1);
			if (_la==T__17 || _la==T__12) {
				{
				setState(232); staticModifier();
				}
			}

			setState(235); type();
			setState(236); varName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitClassName(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitMethodName(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public VarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterVarName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitVarName(this);
		}
	}

	public final VarNameContext varName() throws RecognitionException {
		VarNameContext _localctx = new VarNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_varName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(LangParser.INT); }
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode INT(int i) {
			return getToken(LangParser.INT, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244); match(ID);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(245); match(T__36);
				setState(247);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(246); match(INT);
					}
				}

				setState(249); match(T__40);
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arrayType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(255); match(ID);
			setState(261); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(256); match(T__36);
					setState(258);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__16) | (1L << T__4) | (1L << ID) | (1L << STRING) | (1L << BOOL) | (1L << DOUBLE) | (1L << INT))) != 0)) {
						{
						setState(257); expr(0);
						}
					}

					setState(260); match(T__40);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(263); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessModifierContext extends ParserRuleContext {
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterAccessModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitAccessModifier(this);
		}
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_la = _input.LA(1);
			if ( !(_la==T__39 || _la==T__26) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticModifierContext extends ParserRuleContext {
		public StaticModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterStaticModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitStaticModifier(this);
		}
	}

	public final StaticModifierContext staticModifier() throws RecognitionException {
		StaticModifierContext _localctx = new StaticModifierContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_staticModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__12) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public ArrayAssignContext arrayAssign() {
			return getRuleContext(ArrayAssignContext.class,0);
		}
		public BytecodeStatementContext bytecodeStatement() {
			return getRuleContext(BytecodeStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public PutfieldContext putfield() {
			return getRuleContext(PutfieldContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public EasterEggContext easterEgg() {
			return getRuleContext(EasterEggContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_statement);
		try {
			setState(279);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269); ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270); whileStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(271); methodCall(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(272); printStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(273); assignStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(274); arrayAssign();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(275); putfield();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(276); returnStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(277); bytecodeStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(278); easterEgg();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitPrintStatement(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); match(T__10);
			setState(282); expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitAssignStatement(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284); varName();
			setState(285); match(T__8);
			setState(286); expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAssignContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(LangParser.INT); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INT(int i) {
			return getToken(LangParser.INT, i);
		}
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public ArrayAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterArrayAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitArrayAssign(this);
		}
	}

	public final ArrayAssignContext arrayAssign() throws RecognitionException {
		ArrayAssignContext _localctx = new ArrayAssignContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arrayAssign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288); varName();
			setState(292); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(289); match(T__36);
				setState(290); match(INT);
				setState(291); match(T__40);
				}
				}
				setState(294); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__36 );
			setState(296); match(T__8);
			setState(297); expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299); match(T__9);
			setState(300); expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PutfieldContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public GetFieldContext getField() {
			return getRuleContext(GetFieldContext.class,0);
		}
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public PutfieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_putfield; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterPutfield(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitPutfield(this);
		}
	}

	public final PutfieldContext putfield() throws RecognitionException {
		PutfieldContext _localctx = new PutfieldContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_putfield);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(302); className();
				}
				break;
			case 2:
				{
				setState(303); getField(0);
				}
				break;
			}
			setState(306); match(T__14);
			setState(307); varName();
			setState(308); match(T__8);
			setState(309); expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public IfBodyContext ifBody() {
			return getRuleContext(IfBodyContext.class,0);
		}
		public IfDecContext ifDec() {
			return getRuleContext(IfDecContext.class,0);
		}
		public ElseBodyContext elseBody() {
			return getRuleContext(ElseBodyContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311); ifDec();
			setState(312); match(T__23);
			setState(313); ifBody();
			setState(314); match(T__18);
			setState(320);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(315); match(T__19);
				setState(316); match(T__23);
				setState(317); elseBody();
				setState(318); match(T__18);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfDecContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IfDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIfDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIfDec(this);
		}
	}

	public final IfDecContext ifDec() throws RecognitionException {
		IfDecContext _localctx = new IfDecContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ifDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322); match(T__30);
			setState(323); match(T__31);
			setState(324); expr(0);
			setState(325); match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIfBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIfBody(this);
		}
	}

	public final IfBodyContext ifBody() throws RecognitionException {
		IfBodyContext _localctx = new IfBodyContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ifBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__30) | (1L << T__10) | (1L << T__9) | (1L << T__7) | (1L << T__6) | (1L << ID))) != 0)) {
				{
				{
				setState(327); statement();
				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterElseBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitElseBody(this);
		}
	}

	public final ElseBodyContext elseBody() throws RecognitionException {
		ElseBodyContext _localctx = new ElseBodyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_elseBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__30) | (1L << T__10) | (1L << T__9) | (1L << T__7) | (1L << T__6) | (1L << ID))) != 0)) {
				{
				{
				setState(333); statement();
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public WhileDecContext whileDec() {
			return getRuleContext(WhileDecContext.class,0);
		}
		public WhileBodyContext whileBody() {
			return getRuleContext(WhileBodyContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339); whileDec();
			setState(340); match(T__23);
			setState(341); whileBody();
			setState(342); match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileDecContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhileDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterWhileDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitWhileDec(this);
		}
	}

	public final WhileDecContext whileDec() throws RecognitionException {
		WhileDecContext _localctx = new WhileDecContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_whileDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344); match(T__37);
			setState(345); match(T__31);
			setState(346); expr(0);
			setState(347); match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterWhileBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitWhileBody(this);
		}
	}

	public final WhileBodyContext whileBody() throws RecognitionException {
		WhileBodyContext _localctx = new WhileBodyContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_whileBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__30) | (1L << T__10) | (1L << T__9) | (1L << T__7) | (1L << T__6) | (1L << ID))) != 0)) {
				{
				{
				setState(349); statement();
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BytecodeStatementContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(LangParser.STRING, 0); }
		public BytecodeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bytecodeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterBytecodeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitBytecodeStatement(this);
		}
	}

	public final BytecodeStatementContext bytecodeStatement() throws RecognitionException {
		BytecodeStatementContext _localctx = new BytecodeStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_bytecodeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355); match(T__7);
			setState(356); match(T__32);
			setState(357); match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitExprList(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__16) | (1L << T__4) | (1L << ID) | (1L << STRING) | (1L << BOOL) | (1L << DOUBLE) | (1L << INT))) != 0)) {
				{
				setState(359); expr(0);
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__38) {
					{
					{
					setState(360); match(T__38);
					setState(361); expr(0);
					}
					}
					setState(366);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamListContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitParamList(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(369); param();
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__38) {
					{
					{
					setState(370); match(T__38);
					setState(371); param();
					}
					}
					setState(376);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379); type();
			setState(380); varName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		private String exprType;
		public void setExprType(String type) {
			exprType = type;
		}
		public String getExprType() {
			return exprType;
		}
		public OperatorMulDivContext operatorMulDiv() {
			return getRuleContext(OperatorMulDivContext.class,0);
		}
		public BoolOperatorContext boolOperator() {
			return getRuleContext(BoolOperatorContext.class,0);
		}
		public TerminalNode INT() { return getToken(LangParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(LangParser.DOUBLE, 0); }
		public OperatorPlusMinContext operatorPlusMin() {
			return getRuleContext(OperatorPlusMinContext.class,0);
		}
		public GetFieldContext getField() {
			return getRuleContext(GetFieldContext.class,0);
		}
		public CastContext cast() {
			return getRuleContext(CastContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(LangParser.BOOL, 0); }
		public ArrayGetContext arrayGet() {
			return getRuleContext(ArrayGetContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ArrayInitContext arrayInit() {
			return getRuleContext(ArrayInitContext.class,0);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode STRING() { return getToken(LangParser.STRING, 0); }
		public InitializationContext initialization() {
			return getRuleContext(InitializationContext.class,0);
		}
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(383);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << BOOL) | (1L << DOUBLE) | (1L << INT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case 2:
				{
				setState(384); methodCall(0);
				}
				break;
			case 3:
				{
				setState(385); getField(0);
				}
				break;
			case 4:
				{
				setState(386); varName();
				}
				break;
			case 5:
				{
				setState(387); arrayGet();
				}
				break;
			case 6:
				{
				setState(388); initialization();
				}
				break;
			case 7:
				{
				setState(389); arrayInit();
				}
				break;
			case 8:
				{
				setState(390); match(T__31);
				setState(391); expr(0);
				setState(392); match(T__13);
				}
				break;
			case 9:
				{
				setState(394); cast();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(411);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(409);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(397);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(398); boolOperator();
						setState(399); expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(401);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(402); operatorMulDiv();
						setState(403); expr(12);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(405);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(406); operatorPlusMin();
						setState(407); expr(11);
						}
						break;
					}
					} 
				}
				setState(413);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CastContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public CastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitCast(this);
		}
	}

	public final CastContext cast() throws RecognitionException {
		CastContext _localctx = new CastContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414); type();
			setState(415); match(T__24);
			setState(416); expr(0);
			setState(417); match(T__24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolOperatorContext extends ParserRuleContext {
		public BoolOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterBoolOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitBoolOperator(this);
		}
	}

	public final BoolOperatorContext boolOperator() throws RecognitionException {
		BoolOperatorContext _localctx = new BoolOperatorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_boolOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__29) | (1L << T__27) | (1L << T__25) | (1L << T__22) | (1L << T__5) | (1L << T__3) | (1L << T__0))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializationContext extends ParserRuleContext {
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitInitialization(this);
		}
	}

	public final InitializationContext initialization() throws RecognitionException {
		InitializationContext _localctx = new InitializationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_initialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421); match(T__4);
			setState(422); type();
			setState(423); match(T__31);
			setState(424); exprList();
			setState(425); match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ArrayInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterArrayInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitArrayInit(this);
		}
	}

	public final ArrayInitContext arrayInit() throws RecognitionException {
		ArrayInitContext _localctx = new ArrayInitContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_arrayInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427); match(T__16);
			setState(428); arrayType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayGetContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public ArrayGetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayGet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterArrayGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitArrayGet(this);
		}
	}

	public final ArrayGetContext arrayGet() throws RecognitionException {
		ArrayGetContext _localctx = new ArrayGetContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_arrayGet);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(430); varName();
			setState(435); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(431); match(T__36);
					setState(432); expr(0);
					setState(433); match(T__40);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(437); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorMulDivContext extends ParserRuleContext {
		public OperatorMulDivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorMulDiv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterOperatorMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitOperatorMulDiv(this);
		}
	}

	public final OperatorMulDivContext operatorMulDiv() throws RecognitionException {
		OperatorMulDivContext _localctx = new OperatorMulDivContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_operatorMulDiv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			_la = _input.LA(1);
			if ( !(_la==T__34 || _la==T__2) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorPlusMinContext extends ParserRuleContext {
		public OperatorPlusMinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorPlusMin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterOperatorPlusMin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitOperatorPlusMin(this);
		}
	}

	public final OperatorPlusMinContext operatorPlusMin() throws RecognitionException {
		OperatorPlusMinContext _localctx = new OperatorPlusMinContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_operatorPlusMin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			_la = _input.LA(1);
			if ( !(_la==T__33 || _la==T__11) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EasterEggContext extends ParserRuleContext {
		public DanContext dan() {
			return getRuleContext(DanContext.class,0);
		}
		public EasterEggContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_easterEgg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterEasterEgg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitEasterEgg(this);
		}
	}

	public final EasterEggContext easterEgg() throws RecognitionException {
		EasterEggContext _localctx = new EasterEggContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_easterEgg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443); dan();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DanContext extends ParserRuleContext {
		public DanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterDan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitDan(this);
		}
	}

	public final DanContext dan() throws RecognitionException {
		DanContext _localctx = new DanContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_dan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445); match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10: return methodCall_sempred((MethodCallContext)_localctx, predIndex);
		case 11: return getField_sempred((GetFieldContext)_localctx, predIndex);
		case 38: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean methodCall_sempred(MethodCallContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean getField_sempred(GetFieldContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 12);
		case 3: return precpred(_ctx, 11);
		case 4: return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64\u01c2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\7\2d\n\2\f\2\16\2g\13\2"+
		"\3\2\7\2j\n\2\f\2\16\2m\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\7\4w\n\4"+
		"\f\4\16\4z\13\4\3\5\3\5\3\5\5\5\177\n\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\7\7\u008c\n\7\f\7\16\7\u008f\13\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\5\t\u0097\n\t\3\t\5\t\u009a\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\7\n\u00a6\n\n\f\n\16\n\u00a9\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u00c7\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00d0"+
		"\n\f\f\f\16\f\u00d3\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00dd\n\r"+
		"\f\r\16\r\u00e0\13\r\3\16\7\16\u00e3\n\16\f\16\16\16\u00e6\13\16\3\17"+
		"\5\17\u00e9\n\17\3\17\5\17\u00ec\n\17\3\17\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\23\5\23\u00fa\n\23\3\23\7\23\u00fd\n\23\f\23"+
		"\16\23\u0100\13\23\3\24\3\24\3\24\5\24\u0105\n\24\3\24\6\24\u0108\n\24"+
		"\r\24\16\24\u0109\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\5\27\u011a\n\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\6\32\u0127\n\32\r\32\16\32\u0128\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\34\3\34\5\34\u0133\n\34\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0143\n\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\7\37\u014b\n\37\f\37\16\37\u014e\13\37\3 \7 \u0151\n "+
		"\f \16 \u0154\13 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\7#\u0161\n#\f"+
		"#\16#\u0164\13#\3$\3$\3$\3$\3%\3%\3%\7%\u016d\n%\f%\16%\u0170\13%\5%\u0172"+
		"\n%\3&\3&\3&\7&\u0177\n&\f&\16&\u017a\13&\5&\u017c\n&\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u018e\n(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\7(\u019c\n(\f(\16(\u019f\13(\3)\3)\3)\3)\3)\3*\3*\3+\3+"+
		"\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\6-\u01b6\n-\r-\16-\u01b7\3.\3.\3"+
		"/\3/\3\60\3\60\3\61\3\61\3\61\2\5\26\30N\62\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`\2\b\4\2\4\4\21"+
		"\21\4\2\32\32\37\37\3\2-\60\n\2\b\b\16\16\20\20\22\22\25\25&&((++\4\2"+
		"\t\t))\4\2\n\n  \u01c5\2e\3\2\2\2\4p\3\2\2\2\6s\3\2\2\2\b{\3\2\2\2\n\u0084"+
		"\3\2\2\2\f\u0087\3\2\2\2\16\u0090\3\2\2\2\20\u0096\3\2\2\2\22\u00a7\3"+
		"\2\2\2\24\u00aa\3\2\2\2\26\u00c6\3\2\2\2\30\u00d4\3\2\2\2\32\u00e4\3\2"+
		"\2\2\34\u00e8\3\2\2\2\36\u00f0\3\2\2\2 \u00f2\3\2\2\2\"\u00f4\3\2\2\2"+
		"$\u00f6\3\2\2\2&\u0101\3\2\2\2(\u010b\3\2\2\2*\u010d\3\2\2\2,\u0119\3"+
		"\2\2\2.\u011b\3\2\2\2\60\u011e\3\2\2\2\62\u0122\3\2\2\2\64\u012d\3\2\2"+
		"\2\66\u0132\3\2\2\28\u0139\3\2\2\2:\u0144\3\2\2\2<\u014c\3\2\2\2>\u0152"+
		"\3\2\2\2@\u0155\3\2\2\2B\u015a\3\2\2\2D\u0162\3\2\2\2F\u0165\3\2\2\2H"+
		"\u0171\3\2\2\2J\u017b\3\2\2\2L\u017d\3\2\2\2N\u018d\3\2\2\2P\u01a0\3\2"+
		"\2\2R\u01a5\3\2\2\2T\u01a7\3\2\2\2V\u01ad\3\2\2\2X\u01b0\3\2\2\2Z\u01b9"+
		"\3\2\2\2\\\u01bb\3\2\2\2^\u01bd\3\2\2\2`\u01bf\3\2\2\2bd\5\4\3\2cb\3\2"+
		"\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fk\3\2\2\2ge\3\2\2\2hj\5\b\5\2ih\3\2"+
		"\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7\2\2\3o\3\3"+
		"\2\2\2pq\7\34\2\2qr\5\6\4\2r\5\3\2\2\2sx\7,\2\2tu\7\35\2\2uw\7,\2\2vt"+
		"\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\7\3\2\2\2zx\3\2\2\2{|\7*\2\2|"+
		"~\5\36\20\2}\177\5\n\6\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0081\7\24\2\2\u0081\u0082\5\f\7\2\u0082\u0083\7\31\2\2\u0083\t\3\2\2"+
		"\2\u0084\u0085\7\26\2\2\u0085\u0086\5\36\20\2\u0086\13\3\2\2\2\u0087\u008d"+
		"\5\32\16\2\u0088\u008c\5\24\13\2\u0089\u008c\5\20\t\2\u008a\u008c\5\16"+
		"\b\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c"+
		"\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\r\3\2\2\2"+
		"\u008f\u008d\3\2\2\2\u0090\u0091\7\17\2\2\u0091\u0092\7\24\2\2\u0092\u0093"+
		"\5\22\n\2\u0093\u0094\7\31\2\2\u0094\17\3\2\2\2\u0095\u0097\5(\25\2\u0096"+
		"\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u009a\5*"+
		"\26\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009c\5$\23\2\u009c\u009d\5 \21\2\u009d\u009e\7\f\2\2\u009e\u009f\5J"+
		"&\2\u009f\u00a0\7\36\2\2\u00a0\u00a1\7\24\2\2\u00a1\u00a2\5\22\n\2\u00a2"+
		"\u00a3\7\31\2\2\u00a3\21\3\2\2\2\u00a4\u00a6\5,\27\2\u00a5\u00a4\3\2\2"+
		"\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\23"+
		"\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7\27\2\2\u00ab\u00ac\7\f\2\2"+
		"\u00ac\u00ad\5J&\2\u00ad\u00ae\7\36\2\2\u00ae\u00af\7\24\2\2\u00af\u00b0"+
		"\5\22\n\2\u00b0\u00b1\7\31\2\2\u00b1\25\3\2\2\2\u00b2\u00b3\b\f\1\2\u00b3"+
		"\u00b4\5\36\20\2\u00b4\u00b5\7\35\2\2\u00b5\u00b6\5 \21\2\u00b6\u00b7"+
		"\7\f\2\2\u00b7\u00b8\5H%\2\u00b8\u00b9\7\36\2\2\u00b9\u00c7\3\2\2\2\u00ba"+
		"\u00bb\5\30\r\2\u00bb\u00bc\7\35\2\2\u00bc\u00bd\5 \21\2\u00bd\u00be\7"+
		"\f\2\2\u00be\u00bf\5H%\2\u00bf\u00c0\7\36\2\2\u00c0\u00c7\3\2\2\2\u00c1"+
		"\u00c2\5 \21\2\u00c2\u00c3\7\f\2\2\u00c3\u00c4\5H%\2\u00c4\u00c5\7\36"+
		"\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00b2\3\2\2\2\u00c6\u00ba\3\2\2\2\u00c6"+
		"\u00c1\3\2\2\2\u00c7\u00d1\3\2\2\2\u00c8\u00c9\f\4\2\2\u00c9\u00ca\7\35"+
		"\2\2\u00ca\u00cb\5 \21\2\u00cb\u00cc\7\f\2\2\u00cc\u00cd\5H%\2\u00cd\u00ce"+
		"\7\36\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00c8\3\2\2\2\u00d0\u00d3\3\2\2\2"+
		"\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\27\3\2\2\2\u00d3\u00d1"+
		"\3\2\2\2\u00d4\u00d5\b\r\1\2\u00d5\u00d6\5\36\20\2\u00d6\u00d7\7\35\2"+
		"\2\u00d7\u00d8\5\"\22\2\u00d8\u00de\3\2\2\2\u00d9\u00da\f\4\2\2\u00da"+
		"\u00db\7\35\2\2\u00db\u00dd\5\"\22\2\u00dc\u00d9\3\2\2\2\u00dd\u00e0\3"+
		"\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\31\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e1\u00e3\5\34\17\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3"+
		"\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\33\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e7\u00e9\5(\25\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00ec\5*\26\2\u00eb\u00ea\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\5$\23\2\u00ee\u00ef\5\""+
		"\22\2\u00ef\35\3\2\2\2\u00f0\u00f1\7,\2\2\u00f1\37\3\2\2\2\u00f2\u00f3"+
		"\7,\2\2\u00f3!\3\2\2\2\u00f4\u00f5\7,\2\2\u00f5#\3\2\2\2\u00f6\u00fe\7"+
		",\2\2\u00f7\u00f9\7\7\2\2\u00f8\u00fa\7\60\2\2\u00f9\u00f8\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\7\3\2\2\u00fc\u00f7\3\2"+
		"\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"%\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0107\7,\2\2\u0102\u0104\7\7\2\2\u0103"+
		"\u0105\5N(\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2"+
		"\2\u0106\u0108\7\3\2\2\u0107\u0102\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0107"+
		"\3\2\2\2\u0109\u010a\3\2\2\2\u010a\'\3\2\2\2\u010b\u010c\t\2\2\2\u010c"+
		")\3\2\2\2\u010d\u010e\t\3\2\2\u010e+\3\2\2\2\u010f\u011a\58\35\2\u0110"+
		"\u011a\5@!\2\u0111\u011a\5\26\f\2\u0112\u011a\5.\30\2\u0113\u011a\5\60"+
		"\31\2\u0114\u011a\5\62\32\2\u0115\u011a\5\66\34\2\u0116\u011a\5\64\33"+
		"\2\u0117\u011a\5F$\2\u0118\u011a\5^\60\2\u0119\u010f\3\2\2\2\u0119\u0110"+
		"\3\2\2\2\u0119\u0111\3\2\2\2\u0119\u0112\3\2\2\2\u0119\u0113\3\2\2\2\u0119"+
		"\u0114\3\2\2\2\u0119\u0115\3\2\2\2\u0119\u0116\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u0119\u0118\3\2\2\2\u011a-\3\2\2\2\u011b\u011c\7!\2\2\u011c\u011d"+
		"\5N(\2\u011d/\3\2\2\2\u011e\u011f\5\"\22\2\u011f\u0120\7#\2\2\u0120\u0121"+
		"\5N(\2\u0121\61\3\2\2\2\u0122\u0126\5\"\22\2\u0123\u0124\7\7\2\2\u0124"+
		"\u0125\7\60\2\2\u0125\u0127\7\3\2\2\u0126\u0123\3\2\2\2\u0127\u0128\3"+
		"\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012b\7#\2\2\u012b\u012c\5N(\2\u012c\63\3\2\2\2\u012d\u012e\7\"\2\2\u012e"+
		"\u012f\5N(\2\u012f\65\3\2\2\2\u0130\u0133\5\36\20\2\u0131\u0133\5\30\r"+
		"\2\u0132\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135"+
		"\7\35\2\2\u0135\u0136\5\"\22\2\u0136\u0137\7#\2\2\u0137\u0138\5N(\2\u0138"+
		"\67\3\2\2\2\u0139\u013a\5:\36\2\u013a\u013b\7\24\2\2\u013b\u013c\5<\37"+
		"\2\u013c\u0142\7\31\2\2\u013d\u013e\7\30\2\2\u013e\u013f\7\24\2\2\u013f"+
		"\u0140\5> \2\u0140\u0141\7\31\2\2\u0141\u0143\3\2\2\2\u0142\u013d\3\2"+
		"\2\2\u0142\u0143\3\2\2\2\u01439\3\2\2\2\u0144\u0145\7\r\2\2\u0145\u0146"+
		"\7\f\2\2\u0146\u0147\5N(\2\u0147\u0148\7\36\2\2\u0148;\3\2\2\2\u0149\u014b"+
		"\5,\27\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d=\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0151\5,\27\2"+
		"\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153"+
		"\3\2\2\2\u0153?\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\5B\"\2\u0156\u0157"+
		"\7\24\2\2\u0157\u0158\5D#\2\u0158\u0159\7\31\2\2\u0159A\3\2\2\2\u015a"+
		"\u015b\7\6\2\2\u015b\u015c\7\f\2\2\u015c\u015d\5N(\2\u015d\u015e\7\36"+
		"\2\2\u015eC\3\2\2\2\u015f\u0161\5,\27\2\u0160\u015f\3\2\2\2\u0161\u0164"+
		"\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163E\3\2\2\2\u0164"+
		"\u0162\3\2\2\2\u0165\u0166\7$\2\2\u0166\u0167\7\13\2\2\u0167\u0168\7-"+
		"\2\2\u0168G\3\2\2\2\u0169\u016e\5N(\2\u016a\u016b\7\5\2\2\u016b\u016d"+
		"\5N(\2\u016c\u016a\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0169\3\2"+
		"\2\2\u0171\u0172\3\2\2\2\u0172I\3\2\2\2\u0173\u0178\5L\'\2\u0174\u0175"+
		"\7\5\2\2\u0175\u0177\5L\'\2\u0176\u0174\3\2\2\2\u0177\u017a\3\2\2\2\u0178"+
		"\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2"+
		"\2\2\u017b\u0173\3\2\2\2\u017b\u017c\3\2\2\2\u017cK\3\2\2\2\u017d\u017e"+
		"\5$\23\2\u017e\u017f\5\"\22\2\u017fM\3\2\2\2\u0180\u0181\b(\1\2\u0181"+
		"\u018e\t\4\2\2\u0182\u018e\5\26\f\2\u0183\u018e\5\30\r\2\u0184\u018e\5"+
		"\"\22\2\u0185\u018e\5X-\2\u0186\u018e\5T+\2\u0187\u018e\5V,\2\u0188\u0189"+
		"\7\f\2\2\u0189\u018a\5N(\2\u018a\u018b\7\36\2\2\u018b\u018e\3\2\2\2\u018c"+
		"\u018e\5P)\2\u018d\u0180\3\2\2\2\u018d\u0182\3\2\2\2\u018d\u0183\3\2\2"+
		"\2\u018d\u0184\3\2\2\2\u018d\u0185\3\2\2\2\u018d\u0186\3\2\2\2\u018d\u0187"+
		"\3\2\2\2\u018d\u0188\3\2\2\2\u018d\u018c\3\2\2\2\u018e\u019d\3\2\2\2\u018f"+
		"\u0190\f\16\2\2\u0190\u0191\5R*\2\u0191\u0192\5N(\17\u0192\u019c\3\2\2"+
		"\2\u0193\u0194\f\r\2\2\u0194\u0195\5Z.\2\u0195\u0196\5N(\16\u0196\u019c"+
		"\3\2\2\2\u0197\u0198\f\f\2\2\u0198\u0199\5\\/\2\u0199\u019a\5N(\r\u019a"+
		"\u019c\3\2\2\2\u019b\u018f\3\2\2\2\u019b\u0193\3\2\2\2\u019b\u0197\3\2"+
		"\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"O\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a1\5$\23\2\u01a1\u01a2\7\23\2\2"+
		"\u01a2\u01a3\5N(\2\u01a3\u01a4\7\23\2\2\u01a4Q\3\2\2\2\u01a5\u01a6\t\5"+
		"\2\2\u01a6S\3\2\2\2\u01a7\u01a8\7\'\2\2\u01a8\u01a9\5$\23\2\u01a9\u01aa"+
		"\7\f\2\2\u01aa\u01ab\5H%\2\u01ab\u01ac\7\36\2\2\u01acU\3\2\2\2\u01ad\u01ae"+
		"\7\33\2\2\u01ae\u01af\5&\24\2\u01afW\3\2\2\2\u01b0\u01b5\5\"\22\2\u01b1"+
		"\u01b2\7\7\2\2\u01b2\u01b3\5N(\2\u01b3\u01b4\7\3\2\2\u01b4\u01b6\3\2\2"+
		"\2\u01b5\u01b1\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8"+
		"\3\2\2\2\u01b8Y\3\2\2\2\u01b9\u01ba\t\6\2\2\u01ba[\3\2\2\2\u01bb\u01bc"+
		"\t\7\2\2\u01bc]\3\2\2\2\u01bd\u01be\5`\61\2\u01be_\3\2\2\2\u01bf\u01c0"+
		"\7%\2\2\u01c0a\3\2\2\2$ekx~\u008b\u008d\u0096\u0099\u00a7\u00c6\u00d1"+
		"\u00de\u00e4\u00e8\u00eb\u00f9\u00fe\u0104\u0109\u0119\u0128\u0132\u0142"+
		"\u014c\u0152\u0162\u016e\u0171\u0178\u017b\u018d\u019b\u019d\u01b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
