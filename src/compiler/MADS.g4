grammar MADS;

@header{
    package compiler;
}

program : 'main' LeftParen RightParen LeftBrace statementList RightBrace;

statementList : statementList statement | statement;

statement: declaration Semi
| unaryExpr Semi
| expr Semi
| printStatement Semi
| ternaryOperator Semi
| loopStatement
;

declaration : TypeSpecifier Identifier #declareIdentifier
            | initializeStatement #initializeStmt
			;

initializeStatement : TypeSpecifier Identifier Assign Constant #initializeConstant
            | TypeSpecifier Identifier Assign Identifier #initializeIdentifier
            | TypeSpecifier Identifier Assign expr #initializeExpr
			| assignmentStatement #assignstmt
			;

assignmentStatement:  varName = Identifier Assign Constant #assignConst
            | varName = Identifier Assign Identifier #assignIdentifier
            | varName = Identifier Assign expr #assignExpr;

TypeSpecifier : (Int | Float | Bool | String);

expr : expr Plus expr_term #addExpression
| expr Minus expr_term #subExpression
| expr_term #termExpression
;

expr_term : expr_term Star expr_fact #mulExpression
| expr_term Div expr_fact #divExpression
| expr_term Mod expr_fact #modExpression
| expr_fact #factExpression
;

expr_fact : LeftParen expr RightParen #bracketExpression
| varName = Identifier #identifierExpression
| num = DigitSequence #numExpression
| floatNum = FractionalSequence #floatExpression
;


DigitSequence
    :   Digit+
    ;

FractionalSequence
    :   DigitSequence? '.' DigitSequence
    |   DigitSequence '.'
    ;

Identifier
    :   IdentifierNondigit
        (   IdentifierNondigit
        |   Digit
        )*
    ;

Constant
    :   NumberConstant
    |   BoolConstant
    |   CharacterConstant
    ;

BoolConstant: ( 'true' | 'false' );

NumberConstant : IntegerConstant
 |   FloatingConstant;


fragment
Digit
    :   [0-9]
    ;

unaryExpr : PlusPlus Identifier #plusPlusId
| MinusMinus Identifier #minusMinusId
| Identifier PlusPlus #idPlusPlus
| Identifier MinusMinus #idMinusMinus ;

conditionStmt : relationalExpr
		| logicalExpr
		;

relationalExpr : relationalExpr '>' relationalExpr #greaterThan |
 relationalExpr '<' relationalExpr #lesserThan |
 relationalExpr '>=' relationalExpr #greaterOrEqual |
 relationalExpr '<=' relationalExpr #lesserOrEqual |
 relationalExpr '==' relationalExpr #equal |
 relationalExpr '!=' relationalExpr #notEqual |
 Identifier #identifierRltn
 | expr #expression
 | 'true' #trueRltn
 | 'false' #falseRltn
;

logicalExpr : logicalExpr '&' logicalExpr #logicalAnd
        | logicalExpr '||' logicalExpr #logicalOr
		| Not logicalExpr #logicalNot
		| Identifier #identifierLogical
		| True #trueLogical
		| False #falseLogical
		;

ternaryOperator : conditionStmt Question ternaryStatement Colon ternaryStatement;

ternaryStatement : printStatement
			| initializeStatement
			| expr
			;


loopStatement : ifLoop
        | whileLoop
		| forLoop
		;

ifLoop : 'if' '(' conditionStmt ')' statementList '{' 'else' '{' statementList '}' #ifElseCondition
 | 'if' '(' conditionStmt ')' '{' statementList '}' #ifCondition ;

whileLoop : 'while' '(' conditionStmt ')' '{' statementList '}';

forLoop : 'for' Identifier 'in range' '(' numberValue ',' numberValue ')' '{' statementList '}' #forRangeLoop
| 'for' '(' initializeStatement ';' conditionStmt ';' forIncrement ')' '{' statementList '}' #forAssignLoop;

forIncrement : assignmentStatement | unaryExpr ;

numberValue: Identifier #identifierNumber| DigitSequence #digitValue;

printStatement : 'print' LeftParen Identifier RightParen #printIdentifier
| 'print' LeftParen Constant RightParen #printString;

Float : 'float';
Int : 'int';
String : 'string';
Bool : 'bool';

True : 'true';
False : 'false';

LeftParen : '(';
RightParen : ')';
LeftBrace : '{';
RightBrace : '}';

Less : '<';
LessEqual : '<=';
Greater : '>';
GreaterEqual : '>=';

Plus : '+';
PlusPlus : '++';
Minus : '-';
MinusMinus : '--';
Star : '*';
Div : '/';
Mod : '%';
And : '&';
Or : '||';
Not : '!';
Question : '?';
Colon : ':';
Semi : ';';
Comma : ',';
Assign : '=';
Equal : '==';
NotEqual : '!=';
Dot : '.';

fragment
IdentifierNondigit
    :   Nondigit
    ;

fragment
Nondigit
    :   [a-zA-Z_]
    ;


fragment
IntegerConstant
    :   DecimalConstant
    ;

fragment
DecimalConstant
    :   NonzeroDigit Digit*
    ;

fragment
NonzeroDigit
    :   [1-9]
    ;

fragment
FloatingConstant
    :   DecimalFloatingConstant
    ;

fragment
DecimalFloatingConstant
    :   FractionalConstant
    |   DigitSequence
    ;


fragment
FractionalConstant
    :   DigitSequence? '.' DigitSequence
    |   DigitSequence '.'
    ;


fragment
Sign
    :   '+' | '-'
    ;

fragment
CharacterConstant
    :   '"' CCharSequence '"'
    ;

fragment
CCharSequence
    :   CChar*
    ;

fragment
CChar
    :   ~['\\\r\n]
    |   EscapeSequence
    ;

fragment
EscapeSequence
    :   SimpleEscapeSequence
    ;

fragment
SimpleEscapeSequence
    :   '\\' ['"?abfnrtv\\]
    ;

StringLiteral
    :   '"' SCharSequence? '"'
    ;

fragment
SCharSequence
    :   SChar+
    ;

fragment
SChar
    :   ~["\\\r\n]
    |   EscapeSequence
    |   '\\\n'   // Added line
    |   '\\\r\n' // Added line
    ;

Whitespace
    :   [ \t]+
        -> skip
    ;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;

BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;