grammar MADS;

@header{
    package compiler;
}

program : 'main' '(' ')' '{' statementList '}';

statementList : statement statementList | statement;

statement: declaration ';'
| printStatement ';'
| ternaryOperator ';'
| loopStatement
| unaryExpr
;

declaration : DataType IDENTIFIER
            | initializeStatement
			;

initializeStatement : DataType IDENTIFIER '=' DataTypeValue
			| varName = IDENTIFIER '=' DataTypeValue
			| varName = IDENTIFIER '=' expr
			;

expr : expr_term '+' expr
| expr_term '-' expr
| expr_term
;

expr_term : expr_fact '*' expr_term
| expr_fact '/' expr_term
| expr_fact '%' expr_term
| expr_fact
;

expr_fact : '(' expr ')'
| varName = IDENTIFIER
| num = DIGIT
;

unaryExpr : '++' IDENTIFIER | '--' IDENTIFIER;

conditionStmt : conditionStmt LogicalOperator conditionStmt
		| '!' conditionStmt 
        | relationalExpr 
		| logicalExpr
		| Bool
		;

relationalExpr : expr RelationalOperator expr
| IDENTIFIER
| Bool 
;

logicalExpr : relationalExpr LogicalOperator relationalExpr
		| relationalExpr LogicalOperator logicalExpr
		| '!' relationalExpr
		| '!' logicalExpr
		;

ternaryOperator : conditionStmt '?' ternaryStatement ':' ternaryStatement;

ternaryStatement : printStatement
			| initializeStatement
			| Bool
			;


loopStatement : ifLoop
        | whileLoop
		| forLoop
		;

ifLoop : 'if' '(' conditionStmt ')' '{' statement '}' 'else' '{' statement '}' ;

whileLoop : 'while' '(' conditionStmt ')' '{' statement '}';

forLoop : 'for' IDENTIFIER 'in range' '(' NumberValue ',' NumberValue ')' '{' statement '}'
| 'for' '(' initializeStatement ';' conditionStmt ';' expr ')' '{' statement '}'  
| 'for' '(' initializeStatement ';' conditionStmt ';' unaryExpr ')' '{' statement '}'  ;

printStatement : 'print' '(' IDENTIFIER ')' | 'print' '(' String ')' ;

DataType : ('int' | 'float' | 'string' | 'bool');

DataTypeValue : Integer | Float | String | Bool;

LogicalOperator : ( '&' | '| |' );
RelationalOperator : ('>' | '<' | '>=' | '<=' | '==' | '!=' );

String : '“' [a-zA-Z0-9]* '”';

DIGIT :[0-9]+;
Integer : '-' DIGIT | DIGIT;
Float : DIGIT | DIGIT '.' DIGIT | '-' DIGIT | '-' DIGIT '.' DIGIT;
Bool : ('true' | 'false');

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