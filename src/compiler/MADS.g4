grammar MADS;

@header {
	package antlr;
}

program : 'start' '{' statementList '}' 'end';

statementList : statement statementList | statement;

statement: declaration ';'
| expr ';'
| printStatement ';'
| ternaryOperator ';'
| loopStatement
| unaryExpr
;

declaration : DataType Identifier
            | initializeStatement
			;

initializeStatement : DataType Identifier '=' DataTypeValue
			| Identifier '=' DataTypeValue
			| Identifier '=' expr
			;

expr : expr '+' expr 
| expr '-' expr 
| expr '*' expr 
| expr '/' expr
| expr '%' expr
| (expr) 
| Identifier 
| Digit 
;

unaryExpr : '++' Identifier | '--' Identifier;

conditionStmt : conditionStmt LogicalOperator conditionStmt
		| '!' conditionStmt 
        | relationalExpr 
		| logicalExpr
		| Bool
		;

relationalExpr : expr RelationalOperator expr
| Identifier 
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

forLoop : 'for' Identifier 'in range' '(' NumberValue ',' NumberValue ')' '{' statement '}'
| 'for' '(' initializeStatement ';' conditionStmt ';' expr ')' '{' statement '}'  
| 'for' '(' initializeStatement ';' conditionStmt ';' unaryExpr ')' '{' statement '}'  ;

printStatement : 'print' '(' Identifier ')' | 'print' '(' String ')' ;

DataType : ('int' | 'float' | 'string' | 'bool');

DataTypeValue : Integer | Float | String | Bool;

LogicalOperator : ( '&' | '| |' );
RelationalOperator : ('>' | '<' | '>=' | '<=' | '==' | '!=' );

String : '"' [a-zA-Z0-9]* '"';

Digit : [0-9]+;
Integer : '-' Digit | Digit;
Float : Digit | Digit '.' Digit | '-' Digit | '-' Digit '.' Digit;
Bool : ('true' | 'false');

Identifier : [a-z][a-zA-Z0-9_]*; 

NumberValue : Identifier | Digit;

Keyword : ('start' | 'end' | 'int' | 'float' | 'string' | 'bool' | 'for' | 'while' | 'if' | 'else' | 'true' | 'false' | 'print' | 'and' | 'or' |  'not');
