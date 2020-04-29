// Generated from MADS.g4 by ANTLR 4.8

    package compiler;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * @author Deepti Paul
 * @author Srinivasan Sundar
 * @since 18/04/2020
 * @version 1.0
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
	 * Enter a parse tree produced by the {@code declareIdentifier}
	 * labeled alternative in {@link MADSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclareIdentifier(MADSParser.DeclareIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declareIdentifier}
	 * labeled alternative in {@link MADSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclareIdentifier(MADSParser.DeclareIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initializeStmt}
	 * labeled alternative in {@link MADSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterInitializeStmt(MADSParser.InitializeStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initializeStmt}
	 * labeled alternative in {@link MADSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitInitializeStmt(MADSParser.InitializeStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initializeConstant}
	 * labeled alternative in {@link MADSParser#initializeStatement}.
	 * @param ctx the parse tree
	 */
	void enterInitializeConstant(MADSParser.InitializeConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initializeConstant}
	 * labeled alternative in {@link MADSParser#initializeStatement}.
	 * @param ctx the parse tree
	 */
	void exitInitializeConstant(MADSParser.InitializeConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initializeIdentifier}
	 * labeled alternative in {@link MADSParser#initializeStatement}.
	 * @param ctx the parse tree
	 */
	void enterInitializeIdentifier(MADSParser.InitializeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initializeIdentifier}
	 * labeled alternative in {@link MADSParser#initializeStatement}.
	 * @param ctx the parse tree
	 */
	void exitInitializeIdentifier(MADSParser.InitializeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initializeExpr}
	 * labeled alternative in {@link MADSParser#initializeStatement}.
	 * @param ctx the parse tree
	 */
	void enterInitializeExpr(MADSParser.InitializeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initializeExpr}
	 * labeled alternative in {@link MADSParser#initializeStatement}.
	 * @param ctx the parse tree
	 */
	void exitInitializeExpr(MADSParser.InitializeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignstmt}
	 * labeled alternative in {@link MADSParser#initializeStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignstmt(MADSParser.AssignstmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignstmt}
	 * labeled alternative in {@link MADSParser#initializeStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignstmt(MADSParser.AssignstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignConst}
	 * labeled alternative in {@link MADSParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignConst(MADSParser.AssignConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignConst}
	 * labeled alternative in {@link MADSParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignConst(MADSParser.AssignConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignIdentifier}
	 * labeled alternative in {@link MADSParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignIdentifier(MADSParser.AssignIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignIdentifier}
	 * labeled alternative in {@link MADSParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignIdentifier(MADSParser.AssignIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link MADSParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(MADSParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link MADSParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(MADSParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link MADSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(MADSParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link MADSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(MADSParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termExpression}
	 * labeled alternative in {@link MADSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTermExpression(MADSParser.TermExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termExpression}
	 * labeled alternative in {@link MADSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTermExpression(MADSParser.TermExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subExpression}
	 * labeled alternative in {@link MADSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubExpression(MADSParser.SubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subExpression}
	 * labeled alternative in {@link MADSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubExpression(MADSParser.SubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factExpression}
	 * labeled alternative in {@link MADSParser#expr_term}.
	 * @param ctx the parse tree
	 */
	void enterFactExpression(MADSParser.FactExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factExpression}
	 * labeled alternative in {@link MADSParser#expr_term}.
	 * @param ctx the parse tree
	 */
	void exitFactExpression(MADSParser.FactExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modExpression}
	 * labeled alternative in {@link MADSParser#expr_term}.
	 * @param ctx the parse tree
	 */
	void enterModExpression(MADSParser.ModExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modExpression}
	 * labeled alternative in {@link MADSParser#expr_term}.
	 * @param ctx the parse tree
	 */
	void exitModExpression(MADSParser.ModExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divExpression}
	 * labeled alternative in {@link MADSParser#expr_term}.
	 * @param ctx the parse tree
	 */
	void enterDivExpression(MADSParser.DivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divExpression}
	 * labeled alternative in {@link MADSParser#expr_term}.
	 * @param ctx the parse tree
	 */
	void exitDivExpression(MADSParser.DivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExpression}
	 * labeled alternative in {@link MADSParser#expr_term}.
	 * @param ctx the parse tree
	 */
	void enterMulExpression(MADSParser.MulExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExpression}
	 * labeled alternative in {@link MADSParser#expr_term}.
	 * @param ctx the parse tree
	 */
	void exitMulExpression(MADSParser.MulExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketExpression}
	 * labeled alternative in {@link MADSParser#expr_fact}.
	 * @param ctx the parse tree
	 */
	void enterBracketExpression(MADSParser.BracketExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketExpression}
	 * labeled alternative in {@link MADSParser#expr_fact}.
	 * @param ctx the parse tree
	 */
	void exitBracketExpression(MADSParser.BracketExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link MADSParser#expr_fact}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(MADSParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link MADSParser#expr_fact}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(MADSParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numExpression}
	 * labeled alternative in {@link MADSParser#expr_fact}.
	 * @param ctx the parse tree
	 */
	void enterNumExpression(MADSParser.NumExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numExpression}
	 * labeled alternative in {@link MADSParser#expr_fact}.
	 * @param ctx the parse tree
	 */
	void exitNumExpression(MADSParser.NumExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatExpression}
	 * labeled alternative in {@link MADSParser#expr_fact}.
	 * @param ctx the parse tree
	 */
	void enterFloatExpression(MADSParser.FloatExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatExpression}
	 * labeled alternative in {@link MADSParser#expr_fact}.
	 * @param ctx the parse tree
	 */
	void exitFloatExpression(MADSParser.FloatExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusPlusId}
	 * labeled alternative in {@link MADSParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPlusPlusId(MADSParser.PlusPlusIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusPlusId}
	 * labeled alternative in {@link MADSParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPlusPlusId(MADSParser.PlusPlusIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusMinusId}
	 * labeled alternative in {@link MADSParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterMinusMinusId(MADSParser.MinusMinusIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusMinusId}
	 * labeled alternative in {@link MADSParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitMinusMinusId(MADSParser.MinusMinusIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idPlusPlus}
	 * labeled alternative in {@link MADSParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterIdPlusPlus(MADSParser.IdPlusPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idPlusPlus}
	 * labeled alternative in {@link MADSParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitIdPlusPlus(MADSParser.IdPlusPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idMinusMinus}
	 * labeled alternative in {@link MADSParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterIdMinusMinus(MADSParser.IdMinusMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idMinusMinus}
	 * labeled alternative in {@link MADSParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitIdMinusMinus(MADSParser.IdMinusMinusContext ctx);
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
	 * Enter a parse tree produced by the {@code equal}
	 * labeled alternative in {@link MADSParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqual(MADSParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link MADSParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqual(MADSParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lesserThan}
	 * labeled alternative in {@link MADSParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void enterLesserThan(MADSParser.LesserThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lesserThan}
	 * labeled alternative in {@link MADSParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void exitLesserThan(MADSParser.LesserThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterOrEqual}
	 * labeled alternative in {@link MADSParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterOrEqual(MADSParser.GreaterOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterOrEqual}
	 * labeled alternative in {@link MADSParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterOrEqual(MADSParser.GreaterOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression}
	 * labeled alternative in {@link MADSParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MADSParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression}
	 * labeled alternative in {@link MADSParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MADSParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lesserOrEqual}
	 * labeled alternative in {@link MADSParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void enterLesserOrEqual(MADSParser.LesserOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lesserOrEqual}
	 * labeled alternative in {@link MADSParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void exitLesserOrEqual(MADSParser.LesserOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueRltn}
	 * labeled alternative in {@link MADSParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void enterTrueRltn(MADSParser.TrueRltnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueRltn}
	 * labeled alternative in {@link MADSParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void exitTrueRltn(MADSParser.TrueRltnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notEqual}
	 * labeled alternative in {@link MADSParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotEqual(MADSParser.NotEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notEqual}
	 * labeled alternative in {@link MADSParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotEqual(MADSParser.NotEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierRltn}
	 * labeled alternative in {@link MADSParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierRltn(MADSParser.IdentifierRltnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierRltn}
	 * labeled alternative in {@link MADSParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierRltn(MADSParser.IdentifierRltnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseRltn}
	 * labeled alternative in {@link MADSParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void enterFalseRltn(MADSParser.FalseRltnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseRltn}
	 * labeled alternative in {@link MADSParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void exitFalseRltn(MADSParser.FalseRltnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThan}
	 * labeled alternative in {@link MADSParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(MADSParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThan}
	 * labeled alternative in {@link MADSParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(MADSParser.GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link MADSParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(MADSParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link MADSParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(MADSParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierLogical}
	 * labeled alternative in {@link MADSParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierLogical(MADSParser.IdentifierLogicalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierLogical}
	 * labeled alternative in {@link MADSParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierLogical(MADSParser.IdentifierLogicalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseLogical}
	 * labeled alternative in {@link MADSParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void enterFalseLogical(MADSParser.FalseLogicalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseLogical}
	 * labeled alternative in {@link MADSParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void exitFalseLogical(MADSParser.FalseLogicalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueLogical}
	 * labeled alternative in {@link MADSParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void enterTrueLogical(MADSParser.TrueLogicalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueLogical}
	 * labeled alternative in {@link MADSParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void exitTrueLogical(MADSParser.TrueLogicalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalAnd}
	 * labeled alternative in {@link MADSParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAnd(MADSParser.LogicalAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalAnd}
	 * labeled alternative in {@link MADSParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAnd(MADSParser.LogicalAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalOr}
	 * labeled alternative in {@link MADSParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOr(MADSParser.LogicalOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalOr}
	 * labeled alternative in {@link MADSParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOr(MADSParser.LogicalOrContext ctx);
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
	 * Enter a parse tree produced by the {@code ifElseCondition}
	 * labeled alternative in {@link MADSParser#ifLoop}.
	 * @param ctx the parse tree
	 */
	void enterIfElseCondition(MADSParser.IfElseConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElseCondition}
	 * labeled alternative in {@link MADSParser#ifLoop}.
	 * @param ctx the parse tree
	 */
	void exitIfElseCondition(MADSParser.IfElseConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifCondition}
	 * labeled alternative in {@link MADSParser#ifLoop}.
	 * @param ctx the parse tree
	 */
	void enterIfCondition(MADSParser.IfConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifCondition}
	 * labeled alternative in {@link MADSParser#ifLoop}.
	 * @param ctx the parse tree
	 */
	void exitIfCondition(MADSParser.IfConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MADSParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(MADSParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MADSParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(MADSParser.ElseStatementContext ctx);
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
	 * Enter a parse tree produced by the {@code forRangeLoop}
	 * labeled alternative in {@link MADSParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForRangeLoop(MADSParser.ForRangeLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forRangeLoop}
	 * labeled alternative in {@link MADSParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForRangeLoop(MADSParser.ForRangeLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forAssignLoop}
	 * labeled alternative in {@link MADSParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForAssignLoop(MADSParser.ForAssignLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forAssignLoop}
	 * labeled alternative in {@link MADSParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForAssignLoop(MADSParser.ForAssignLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MADSParser#forIncrement}.
	 * @param ctx the parse tree
	 */
	void enterForIncrement(MADSParser.ForIncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MADSParser#forIncrement}.
	 * @param ctx the parse tree
	 */
	void exitForIncrement(MADSParser.ForIncrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierNumber}
	 * labeled alternative in {@link MADSParser#numberValue}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierNumber(MADSParser.IdentifierNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierNumber}
	 * labeled alternative in {@link MADSParser#numberValue}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierNumber(MADSParser.IdentifierNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code digitValue}
	 * labeled alternative in {@link MADSParser#numberValue}.
	 * @param ctx the parse tree
	 */
	void enterDigitValue(MADSParser.DigitValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code digitValue}
	 * labeled alternative in {@link MADSParser#numberValue}.
	 * @param ctx the parse tree
	 */
	void exitDigitValue(MADSParser.DigitValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printIdentifier}
	 * labeled alternative in {@link MADSParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintIdentifier(MADSParser.PrintIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printIdentifier}
	 * labeled alternative in {@link MADSParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintIdentifier(MADSParser.PrintIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printString}
	 * labeled alternative in {@link MADSParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintString(MADSParser.PrintStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printString}
	 * labeled alternative in {@link MADSParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintString(MADSParser.PrintStringContext ctx);
}