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

declaration : TypeSpecifier Identifier
            | initializeStatement
			;

initializeStatement : TypeSpecifier Identifier Assign Constant
            | TypeSpecifier Identifier Assign Identifier
            | TypeSpecifier Identifier Assign expr
			| assignmentStatement
			;

assignmentStatement:  varName = Identifier Assign Constant
            | varName = Identifier Assign Identifier
            | varName = Identifier Assign expr;

TypeSpecifier : (Int | Float | Bool | String);

expr : expr Plus expr_term
| expr Minus expr_term
| expr_term
;

expr_term : expr_term Star expr_fact
| expr_term Div expr_fact
| expr_term Mod expr_fact
| expr_fact
;

expr_fact : LeftParen expr RightParen
| varName = Identifier
| num = DigitSequence
| floatNum = FractionalSequence
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

unaryExpr : PlusPlus Identifier
| MinusMinus Identifier
| Identifier PlusPlus
| Identifier MinusMinus;

conditionStmt : relationalExpr
		| logicalExpr
		| equalityExpr
		;

relationalExpr : relationalExpr RelationalOperator relationalExpr
| Identifier
| expr
;

equalityExpr: equalityExpr EqualityOperator equalityExpr
| Identifier | True | False ;

RelationalOperator : ('>' | '<' | '>=' | '<=' |'==' | '!=' );

EqualityOperator : ('==' | '!=' );

logicalExpr : logicalExpr LogicalOperator comparisonExpr
		| comparisonExpr LogicalOperator logicalExpr
		| Not comparisonExpr
		| Not logicalExpr
		| Identifier | True | False
		;


LogicalOperator : ( '&' | '||' );


comparisonExpr: relationalExpr | equalityExpr;

ternaryOperator : conditionStmt Question ternaryStatement Colon ternaryStatement;

ternaryStatement : printStatement
			| initializeStatement
			| expr
			;


loopStatement : ifLoop
        | whileLoop
		| forLoop
		;

ifLoop : 'if' '(' conditionStmt ')' statementList '{' 'else' '{' statementList '}'
 | 'if' '(' conditionStmt ')' '{' statementList '}';

whileLoop : 'while' '(' conditionStmt ')' '{' statementList '}';

forLoop : 'for' Identifier 'in range' '(' numberValue ',' numberValue ')' '{' statementList '}'
| 'for' '(' initializeStatement ';' conditionStmt ';' assignmentStatement ')' '{' statementList '}'
| 'for' '(' initializeStatement ';' conditionStmt ';' unaryExpr ')' '{' statementList '}';

numberValue: Identifier | DigitSequence;

printStatement : 'print' LeftParen Identifier RightParen | 'print' LeftParen Constant RightParen ;

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