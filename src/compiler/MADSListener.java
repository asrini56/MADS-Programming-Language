// Generated from MADS.g4 by ANTLR 4.8

    package compiler;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MADSParser}.
 */
public interface MADSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MADSParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MADSParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MADSParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MADSParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MADSParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(MADSParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MADSParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(MADSParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MADSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MADSParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MADSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MADSParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MADSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(MADSParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MADSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(MADSParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MADSParser#initializeStatement}.
	 * @param ctx the parse tree
	 */
	void enterInitializeStatement(MADSParser.InitializeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MADSParser#initializeStatement}.
	 * @param ctx the parse tree
	 */
	void exitInitializeStatement(MADSParser.InitializeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MADSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MADSParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MADSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MADSParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MADSParser#expr_term}.
	 * @param ctx the parse tree
	 */
	void enterExpr_term(MADSParser.Expr_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link MADSParser#expr_term}.
	 * @param ctx the parse tree
	 */
	void exitExpr_term(MADSParser.Expr_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link MADSParser#expr_fact}.
	 * @param ctx the parse tree
	 */
	void enterExpr_fact(MADSParser.Expr_factContext ctx);
	/**
	 * Exit a parse tree produced by {@link MADSParser#expr_fact}.
	 * @param ctx the parse tree
	 */
	void exitExpr_fact(MADSParser.Expr_factContext ctx);
	/**
	 * Enter a parse tree produced by {@link MADSParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(MADSParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MADSParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(MADSParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MADSParser#conditionStmt}.
	 * @param ctx the parse tree
	 */
	void enterConditionStmt(MADSParser.ConditionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MADSParser#conditionStmt}.
	 * @param ctx the parse tree
	 */
	void exitConditionStmt(MADSParser.ConditionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MADSParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(MADSParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MADSParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(MADSParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MADSParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpr(MADSParser.LogicalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MADSParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpr(MADSParser.LogicalExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MADSParser#ternaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterTernaryOperator(MADSParser.TernaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MADSParser#ternaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitTernaryOperator(MADSParser.TernaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MADSParser#ternaryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTernaryStatement(MADSParser.TernaryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MADSParser#ternaryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTernaryStatement(MADSParser.TernaryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MADSParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(MADSParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MADSParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(MADSParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MADSParser#ifLoop}.
	 * @param ctx the parse tree
	 */
	void enterIfLoop(MADSParser.IfLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MADSParser#ifLoop}.
	 * @param ctx the parse tree
	 */
	void exitIfLoop(MADSParser.IfLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MADSParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(MADSParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MADSParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(MADSParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MADSParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(MADSParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MADSParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(MADSParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MADSParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(MADSParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MADSParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(MADSParser.PrintStatementContext ctx);
}