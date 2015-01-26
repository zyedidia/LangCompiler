grammar Lang;

compilationUnit : importDec* classDec* EOF;

importDec : 'import' packageName;
packageName : ID ('.' ID)*;

classDec : 'class' className (inheritance)? '{' classBody '}';
inheritance : 'extends' className;
classBody : fieldDecs (constructorDec | methodDec | mainDec)*;

mainDec : 'main' '{' methodBody '}';

methodDec : accessModifier? staticModifier? type methodName '(' paramList ')' '{' methodBody '}';
methodBody : (statement)*;
constructorDec : 'constructor' '(' paramList ')' '{' methodBody '}';

methodCall : className '.' methodName '(' exprList ')' | getField '.' methodName '(' exprList ')'| methodCall '.' methodName '(' exprList ')' | methodName '(' exprList ')';
/* methodCall : methodName '(' exprList ')' | methodCall '.' methodName '(' exprList ')' | ((INT | DOUBLE | BOOL | STRING) | getField | varName | arrayGet | initialization | arrayInit | '(' expr ')' | cast) '.' methodName '(' exprList ')'; */

getField : getField '.' varName
		 | className '.' varName;

fieldDecs : fieldDec*;
fieldDec : accessModifier? staticModifier? type varName;

className : ID;
methodName : ID;
varName : ID;
type : ID ('[' INT? ']')*;
arrayType : ID ('[' expr? ']')+;

accessModifier : 'public' | 'private';
staticModifier : 'static' | 'virtual';

statement : ifStatement | whileStatement | methodCall | printStatement | assignStatement | arrayAssign | putfield | returnStatement | bytecodeStatement | easterEgg;
printStatement : 'print' expr;
assignStatement : varName '=' expr;
arrayAssign : varName ('[' INT ']')+ '=' expr;
returnStatement : 'return' expr;
putfield : (className | getField) '.' varName '=' expr;
ifStatement : ifDec '{' ifBody '}' ('else' '{' elseBody '}')?;
ifDec : 'if' '(' expr ')';
ifBody : statement*;
elseBody : statement*;
whileStatement : whileDec '{' whileBody '}';
whileDec : 'while' '(' expr ')';
whileBody : statement*;
bytecodeStatement : 'bytecode' ':' STRING;

exprList : (expr (',' expr)* )?;
paramList : (param (',' param)* )?;
param : type varName;

expr : expr boolOperator expr
	 | expr operatorMulDiv expr
	 | expr operatorPlusMin expr
	 | (INT | DOUBLE | BOOL | STRING)
	 | methodCall
	 | getField
	 | varName
	 | arrayGet
	 | initialization
	 | arrayInit
	 | '(' expr ')'
	 | cast;

cast : type '\'' expr '\'';

boolOperator : ('!=' | '>' | '>=' | '<' | '<=' | '==' | 'or' | 'and');

initialization : 'new' type '(' exprList ')';
arrayInit : 'arr' arrayType;
arrayGet : varName ('[' expr ']')+;

operatorMulDiv : ('*' | '/');
operatorPlusMin : ('+' | '-');

ID : [a-zA-Z$_]+;
STRING : '"'.*?'"';

BOOL : 'true' | 'false';

DOUBLE : INT'.'DIGIT+;
INT : DIGIT+;
DIGIT : [0-9];

LINE_COMMENT : '//'.*?'\n' -> skip;
COMMENT : '/*'.*?'*/' -> skip;
WS : [ \t\r\n]+ -> skip;

// Easter eggs:
easterEgg : dan;
dan : 'Dan';
