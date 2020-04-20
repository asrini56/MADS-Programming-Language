grammar mads;

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