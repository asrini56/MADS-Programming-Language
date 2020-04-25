grammar MADS;

@header{
    package compiler;
}

program : 'main' '(' ')' '{' statementList '}';

statementList : statementList statement | statement;

statement: declaration ';'
| unaryExpr ';'
| expr ';'
| printStatement ';'
| ternaryOperator ';'
| loopStatement
;

declaration : DataType IDENTIFIER
            | initializeStatement
			;

initializeStatement : DataType IDENTIFIER '=' DataTypeValue
			| varName = IDENTIFIER '=' DataTypeValue
			| varName = IDENTIFIER '=' expr
			;

expr : expr '+' expr_term
| expr '-' expr_term
| expr_term
;

expr_term : expr_term '*' expr_fact
| expr_term '/' expr_fact
| expr_term '%' expr_fact
| expr_fact
;

expr_fact : '(' expr ')'
| varName = IDENTIFIER
| num = DIGIT
;

unaryExpr : '++' IDENTIFIER
| '--' IDENTIFIER
| IDENTIFIER '++'
| IDENTIFIER '--';

conditionStmt : conditionStmt LogicalOperator conditionStmt
		| '!' conditionStmt 
        | relationalExpr 
		| logicalExpr
		| BOOL
		;

relationalExpr : expr RelationalOperator expr
| IDENTIFIER
| BOOL
;

logicalExpr : relationalExpr LogicalOperator relationalExpr
		| relationalExpr LogicalOperator logicalExpr
		| '!' relationalExpr
		| '!' logicalExpr
		;

ternaryOperator : conditionStmt '?' ternaryStatement ':' ternaryStatement;

ternaryStatement : printStatement
			| initializeStatement
			| BOOL
			;


loopStatement : ifLoop
        | whileLoop
		| forLoop
		;

ifLoop : 'if' '(' conditionStmt ')' '{' statementList '}' 'else' '{' statementList '}'
 | 'if' '(' conditionStmt ')' '{' statementList '}';

whileLoop : 'while' '(' conditionStmt ')' '{' statementList '}';

forLoop : 'for' IDENTIFIER 'in range' '(' NumberValue ',' NumberValue ')' '{' statementList '}'
| 'for' '(' initializeStatement ';' conditionStmt ';' expr ')' '{' statementList '}'
| 'for' '(' initializeStatement ';' conditionStmt ';' unaryExpr ')' '{' statementList '}';

printStatement : 'print' '(' IDENTIFIER ')' | 'print' '(' String ')' ;

DataType : ('int' | 'float' | 'string' | 'bool');

DataTypeValue : Integer | Float | String | BOOL;

LogicalOperator : ( '&' | '||' );
RelationalOperator : ('>' | '<' | '>=' | '<=' | '==' | '!=' );

String : '“' [a-zA-Z0-9]* '”';

DIGIT :[0-9]+;
Integer : '-' DIGIT | DIGIT;
Float : DIGIT | DIGIT '.' DIGIT | '-' DIGIT | '-' DIGIT '.' DIGIT;
BOOL : ('true' | 'false');

IDENTIFIER : [a-z][a-zA-Z0-9_]*;

NumberValue : IDENTIFIER | DIGIT;

Keyword : ('start' | 'end' | 'int' | 'float' | 'string' | 'bool' | 'for' | 'while' | 'if' | 'else' | 'true' | 'false' | 'print' | 'and' | 'or' |  'not');


Whitespace
   : [ \t]+ -> skip
   ;

Newline
   : ('\r' '\n'? | '\n') -> skip
   ;

BlockComment
   : '/*' .*? '*/' -> skip
   ;

LineComment
   : '//' ~ [\r\n]* -> skip
   ;