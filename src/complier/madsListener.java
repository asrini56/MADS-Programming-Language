// Generated from mads.g4 by ANTLR 4.8

	package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link madsParser}.
 */
public interface madsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link madsParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(madsParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link madsParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(madsParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link madsParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(madsParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link madsParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(madsParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link madsParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(madsParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link madsParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(madsParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link madsParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(madsParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link madsParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(madsParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link madsParser#initializeStatement}.
	 * @param ctx the parse tree
	 */
	void enterInitializeStatement(madsParser.InitializeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link madsParser#initializeStatement}.
	 * @param ctx the parse tree
	 */
	void exitInitializeStatement(madsParser.InitializeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link madsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(madsParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link madsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(madsParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link madsParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(madsParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link madsParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(madsParser.PrintStatementContext ctx);
}