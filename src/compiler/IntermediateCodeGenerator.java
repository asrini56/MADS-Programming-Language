package compiler;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Deepti Paul
 * @author Srinivasan Sundar
 * @since 18/04/2020
 *  @version 1.0
 *  IntermediateCodeGenerator generates intermediate code
 */
public class IntermediateCodeGenerator extends MADSBaseListener {

    private StringBuilder stringBuilder = new StringBuilder();
    private String fileName = null;

    private Map<String, String> varMap = new HashMap<>();
    private int errorCount = 0;

    private static final String SPACE = " ";
    private static final String NEW_LINE = "\n";
    private static final String START = "START";
    private static final String END = "END";
    private static final String DECLARE = "DECL ";
    private static final String ASSIGN = "ASGN ";
    private static final String PULL = "PULL ";
    private static final String COMPILE_TIME_ERROR = "Compile Time Error: ";
    private static final String VARIABLE = "Variable ";
    private static final String ALREADY_DECLARED = " already declared in this scope";
    private static final String NOT_DECLARED = " not declared in this scope";
    private static final String FILE_WRITE_ERROR ="Unable to write Intermediate code to ";

    IntermediateCodeGenerator(String filename){
        this.fileName = filename;
    }

    private void writeToFile() {
        String[] filePath = this.fileName.split(".mads");
        String icFileName = filePath[0] + ".imc";
        byte[] intermediateCode = stringBuilder.toString().getBytes();
        try {
            Files.write(Paths.get(icFileName), intermediateCode);
        } catch (IOException e) {
            System.err.println(COMPILE_TIME_ERROR + FILE_WRITE_ERROR + icFileName);
            errorCount++;
        }
    }

    @Override
    public void enterProgram(MADSParser.ProgramContext ctx) {
        stringBuilder.append(START).append(NEW_LINE);
    }

    @Override
    public void exitProgram(MADSParser.ProgramContext ctx) {
        stringBuilder.append(END).append(NEW_LINE);
        if(errorCount == 0) {
            writeToFile();
        } else{
            System.err.println(errorCount + " Error(s) in compiling the program");
        }
    }

    @Override
    public void enterStatementList(MADSParser.StatementListContext ctx) {
        super.enterStatementList(ctx);
    }

    @Override
    public void exitStatementList(MADSParser.StatementListContext ctx) {
        super.exitStatementList(ctx);
    }

    @Override
    public void enterStatement(MADSParser.StatementContext ctx) {
        super.enterStatement(ctx);
    }

    @Override
    public void exitStatement(MADSParser.StatementContext ctx) {
        super.exitStatement(ctx);
    }

    @Override
    public void enterDeclareIdentifier(MADSParser.DeclareIdentifierContext ctx) {
        if(!varMap.containsKey(ctx.Identifier().getText())) {
            stringBuilder.append(DECLARE).append(ctx.TypeSpecifier().getText().toUpperCase());
            stringBuilder.append(SPACE).append(ctx.Identifier().getText()).append(NEW_LINE);
            varMap.put(ctx.Identifier().getText(), ctx.TypeSpecifier().getText().toUpperCase());
        } else {
            System.err.println(COMPILE_TIME_ERROR + VARIABLE + ctx.Identifier().getText() + ALREADY_DECLARED);
            errorCount++;
        }
    }

    @Override
    public void exitDeclareIdentifier(MADSParser.DeclareIdentifierContext ctx) {
        super.exitDeclareIdentifier(ctx);
    }

    @Override
    public void enterInitializeStmt(MADSParser.InitializeStmtContext ctx) {
        super.enterInitializeStmt(ctx);
    }

    @Override
    public void exitInitializeStmt(MADSParser.InitializeStmtContext ctx) {
        super.exitInitializeStmt(ctx);
    }

    @Override
    public void enterInitializeConstant(MADSParser.InitializeConstantContext ctx) {
        if(!varMap.containsKey(ctx.Identifier().getText())) {
            stringBuilder.append(DECLARE).append(ctx.TypeSpecifier().getText().toUpperCase());
            stringBuilder.append(" ").append(ctx.Identifier().getText()).append(NEW_LINE);
            varMap.put(ctx.Identifier().getText(), ctx.TypeSpecifier().getText().toUpperCase());
            stringBuilder.append(ASSIGN).append(ctx.Identifier().getText());
            stringBuilder.append(" ").append(ctx.Constant().getText()).append(NEW_LINE);
        } else {
            System.err.println(COMPILE_TIME_ERROR + VARIABLE + ctx.Identifier().getText() + ALREADY_DECLARED);
            errorCount++;
        }
    }

    @Override
    public void exitInitializeConstant(MADSParser.InitializeConstantContext ctx) {
        super.exitInitializeConstant(ctx);
    }

    @Override
    public void enterInitializeIdentifier(MADSParser.InitializeIdentifierContext ctx) {
        if(!varMap.containsKey(ctx.Identifier(0).getText())) {
            stringBuilder.append(DECLARE).append(ctx.TypeSpecifier().getText().toUpperCase());
            stringBuilder.append(" ").append(ctx.Identifier(0).getText()).append(NEW_LINE);
            varMap.put(ctx.Identifier(0).getText(), ctx.TypeSpecifier().getText().toUpperCase());
            stringBuilder.append(ASSIGN).append(ctx.Identifier(0).getText());
            stringBuilder.append(" ").append(ctx.Identifier(1).getText()).append(NEW_LINE);
        } else {
            System.err.println(COMPILE_TIME_ERROR + VARIABLE + ctx.Identifier(0).getText() + ALREADY_DECLARED);
            errorCount++;
        }
    }

    @Override
    public void exitInitializeIdentifier(MADSParser.InitializeIdentifierContext ctx) {
        super.exitInitializeIdentifier(ctx);
    }

    @Override
    public void enterInitializeExpr(MADSParser.InitializeExprContext ctx) {
        if(!varMap.containsKey(ctx.Identifier().getText())) {
            stringBuilder.append(DECLARE).append(ctx.TypeSpecifier().getText().toUpperCase());
            stringBuilder.append(SPACE).append(ctx.Identifier().getText()).append(NEW_LINE);
            varMap.put(ctx.Identifier().getText(), ctx.TypeSpecifier().getText().toUpperCase());
        } else {
            System.err.println(COMPILE_TIME_ERROR + VARIABLE + ctx.Identifier().getText() + ALREADY_DECLARED);
            errorCount++;
        }
    }

    @Override
    public void exitInitializeExpr(MADSParser.InitializeExprContext ctx) {
        if(varMap.containsKey(ctx.Identifier().getText())) {
            stringBuilder.append("STORE ").append(ctx.Identifier().getText()).append(NEW_LINE);
        } else {
            System.err.println(COMPILE_TIME_ERROR + VARIABLE + ctx.Identifier().getText() + NOT_DECLARED);
            errorCount++;
        }
    }

    @Override
    public void enterAssignstmt(MADSParser.AssignstmtContext ctx) {
        super.enterAssignstmt(ctx);
    }

    @Override
    public void exitAssignstmt(MADSParser.AssignstmtContext ctx) {
        super.exitAssignstmt(ctx);
    }

    @Override
    public void enterAssignConst(MADSParser.AssignConstContext ctx) {
        if(varMap.containsKey(ctx.Identifier().getText())) {
            stringBuilder.append(ASSIGN).append(ctx.Identifier().getText());
            stringBuilder.append(" ").append(ctx.Constant().getText()).append("\n");
        } else {
            System.err.println(COMPILE_TIME_ERROR + VARIABLE + ctx.Identifier().getText() + NOT_DECLARED);
            errorCount++;
        }
    }

    @Override
    public void exitAssignConst(MADSParser.AssignConstContext ctx) {
        super.exitAssignConst(ctx);
    }

    @Override
    public void enterAssignIdentifier(MADSParser.AssignIdentifierContext ctx) {
        if(varMap.containsKey(ctx.Identifier(0).getText())) {
            stringBuilder.append(ASSIGN).append(ctx.Identifier(0).getText());
            stringBuilder.append(" ").append(ctx.Identifier(1).getText()).append("\n");
        } else {
            System.err.println(COMPILE_TIME_ERROR + VARIABLE + ctx.Identifier(0).getText() + NOT_DECLARED);
            errorCount++;
        }
    }

    @Override
    public void exitAssignIdentifier(MADSParser.AssignIdentifierContext ctx) {
        super.exitAssignIdentifier(ctx);
    }

    @Override
    public void enterAssignExpr(MADSParser.AssignExprContext ctx) {
        super.enterAssignExpr(ctx);
    }

    @Override
    public void exitAssignExpr(MADSParser.AssignExprContext ctx) {
        if(varMap.containsKey(ctx.Identifier().getText())) {
            stringBuilder.append("STORE ").append(ctx.Identifier().getText()).append(NEW_LINE);
        } else {
            System.err.println(COMPILE_TIME_ERROR + VARIABLE + ctx.Identifier().getText() + NOT_DECLARED);
            errorCount++;
        }
    }

    @Override
    public void enterAddExpression(MADSParser.AddExpressionContext ctx) {
        super.enterAddExpression(ctx);
    }

    @Override
    public void exitAddExpression(MADSParser.AddExpressionContext ctx) {
        stringBuilder.append("ADD").append(NEW_LINE);
    }

    @Override
    public void enterTermExpression(MADSParser.TermExpressionContext ctx) {
        super.enterTermExpression(ctx);
    }

    @Override
    public void exitTermExpression(MADSParser.TermExpressionContext ctx) {
        super.exitTermExpression(ctx);
    }

    @Override
    public void enterSubExpression(MADSParser.SubExpressionContext ctx) {
        super.enterSubExpression(ctx);
    }

    @Override
    public void exitSubExpression(MADSParser.SubExpressionContext ctx) {
        stringBuilder.append("SUB").append(NEW_LINE);
    }

    @Override
    public void enterFactExpression(MADSParser.FactExpressionContext ctx) {
        super.enterFactExpression(ctx);
    }

    @Override
    public void exitFactExpression(MADSParser.FactExpressionContext ctx) {
        super.exitFactExpression(ctx);
    }

    @Override
    public void enterModExpression(MADSParser.ModExpressionContext ctx) {
        super.enterModExpression(ctx);
    }

    @Override
    public void exitModExpression(MADSParser.ModExpressionContext ctx) {
        stringBuilder.append("MOD").append(NEW_LINE);
    }

    @Override
    public void enterDivExpression(MADSParser.DivExpressionContext ctx) {
        super.enterDivExpression(ctx);
    }

    @Override
    public void exitDivExpression(MADSParser.DivExpressionContext ctx) {
        stringBuilder.append("DIV").append(NEW_LINE);
    }

    @Override
    public void enterMulExpression(MADSParser.MulExpressionContext ctx) {
        super.enterMulExpression(ctx);
    }

    @Override
    public void exitMulExpression(MADSParser.MulExpressionContext ctx) {
        stringBuilder.append("MUL").append(NEW_LINE);
    }

    @Override
    public void enterBracketExpression(MADSParser.BracketExpressionContext ctx) {
        super.enterBracketExpression(ctx);
    }

    @Override
    public void exitBracketExpression(MADSParser.BracketExpressionContext ctx) {
        super.exitBracketExpression(ctx);
    }

    @Override
    public void enterIdentifierExpression(MADSParser.IdentifierExpressionContext ctx) {
        super.enterIdentifierExpression(ctx);
    }

    @Override
    public void exitIdentifierExpression(MADSParser.IdentifierExpressionContext ctx) {
        if(varMap.containsKey(ctx.Identifier().getText())){
            stringBuilder.append(PULL).append(ctx.Identifier().getText()).append(NEW_LINE);
        } else {
            System.err.println(COMPILE_TIME_ERROR + VARIABLE + ctx.Identifier().getText() + NOT_DECLARED);
            errorCount++;
        }
    }

    @Override
    public void enterNumExpression(MADSParser.NumExpressionContext ctx) {
        super.enterNumExpression(ctx);
    }

    @Override
    public void exitNumExpression(MADSParser.NumExpressionContext ctx) {
        stringBuilder.append("NUM ").append(ctx.num.getText()).append(NEW_LINE);
    }

    @Override
    public void enterFloatExpression(MADSParser.FloatExpressionContext ctx) {
        super.enterFloatExpression(ctx);
    }

    @Override
    public void exitFloatExpression(MADSParser.FloatExpressionContext ctx) {
        stringBuilder.append("FLOAT ").append(ctx.floatNum.getText()).append(NEW_LINE);
    }

    @Override
    public void enterPlusPlusId(MADSParser.PlusPlusIdContext ctx) {
        super.enterPlusPlusId(ctx);
    }

    @Override
    public void exitPlusPlusId(MADSParser.PlusPlusIdContext ctx) {
        if(varMap.containsKey(ctx.Identifier().getText())){
            stringBuilder.append("INC ").append(ctx.Identifier().getText()).append(NEW_LINE);
        } else {
            System.err.println(COMPILE_TIME_ERROR + VARIABLE + ctx.Identifier().getText() + NOT_DECLARED);
            errorCount++;
        }
    }

    @Override
    public void enterMinusMinusId(MADSParser.MinusMinusIdContext ctx) {
        super.enterMinusMinusId(ctx);
    }

    @Override
    public void exitMinusMinusId(MADSParser.MinusMinusIdContext ctx) {
        if(varMap.containsKey(ctx.Identifier().getText())){
            stringBuilder.append("DEC ").append(ctx.Identifier().getText()).append(NEW_LINE);
        } else {
            System.err.println(COMPILE_TIME_ERROR + VARIABLE + ctx.Identifier().getText() + NOT_DECLARED);
            errorCount++;
        }
    }

    @Override
    public void enterIdPlusPlus(MADSParser.IdPlusPlusContext ctx) {
        super.enterIdPlusPlus(ctx);
    }

    @Override
    public void exitIdPlusPlus(MADSParser.IdPlusPlusContext ctx) {
        if(varMap.containsKey(ctx.Identifier().getText())){
            stringBuilder.append("INC ").append(ctx.Identifier().getText()).append(NEW_LINE);
        } else {
            System.err.println(COMPILE_TIME_ERROR + VARIABLE + ctx.Identifier().getText() + NOT_DECLARED);
            errorCount++;
        }
    }

    @Override
    public void enterIdMinusMinus(MADSParser.IdMinusMinusContext ctx) {
        super.enterIdMinusMinus(ctx);
    }

    @Override
    public void exitIdMinusMinus(MADSParser.IdMinusMinusContext ctx) {
        if(varMap.containsKey(ctx.Identifier().getText())){
            stringBuilder.append("DEC ").append(ctx.Identifier().getText()).append(NEW_LINE);
        } else {
            System.err.println(COMPILE_TIME_ERROR + VARIABLE + ctx.Identifier().getText() + NOT_DECLARED);
            errorCount++;
        }
    }

    @Override
    public void enterConditionStmt(MADSParser.ConditionStmtContext ctx) {
        stringBuilder.append("CNDT").append(NEW_LINE);
    }

    @Override
    public void exitConditionStmt(MADSParser.ConditionStmtContext ctx) {
        stringBuilder.append("CNDTEND").append(NEW_LINE);
    }

    @Override
    public void enterEqual(MADSParser.EqualContext ctx) {
        super.enterEqual(ctx);
    }

    @Override
    public void exitEqual(MADSParser.EqualContext ctx) {
        stringBuilder.append("EQL").append(NEW_LINE);
    }

    @Override
    public void enterLesserThan(MADSParser.LesserThanContext ctx) {
        super.enterLesserThan(ctx);
    }

    @Override
    public void exitLesserThan(MADSParser.LesserThanContext ctx) {
        stringBuilder.append("SML").append(NEW_LINE);
    }

    @Override
    public void enterGreaterOrEqual(MADSParser.GreaterOrEqualContext ctx) {
        super.enterGreaterOrEqual(ctx);
    }

    @Override
    public void exitGreaterOrEqual(MADSParser.GreaterOrEqualContext ctx) {
        stringBuilder.append("GTREQL").append(NEW_LINE);
    }

    @Override
    public void enterExpression(MADSParser.ExpressionContext ctx) {
        //stringBuilder.append("EXPR CNDT").append(NEW_LINE);
    }

    @Override
    public void exitExpression(MADSParser.ExpressionContext ctx) {
        //stringBuilder.append("EXPR CNDT END").append(NEW_LINE);
    }

    @Override
    public void enterLesserOrEqual(MADSParser.LesserOrEqualContext ctx) {
        super.enterLesserOrEqual(ctx);
    }

    @Override
    public void exitLesserOrEqual(MADSParser.LesserOrEqualContext ctx) {
        stringBuilder.append("SMLEQL").append(NEW_LINE);
    }

    @Override
    public void enterTrueRltn(MADSParser.TrueRltnContext ctx) {
        super.enterTrueRltn(ctx);
    }

    @Override
    public void exitTrueRltn(MADSParser.TrueRltnContext ctx) {
        stringBuilder.append("BOOL true").append(NEW_LINE);
    }

    @Override
    public void enterNotEqual(MADSParser.NotEqualContext ctx) {
        super.enterNotEqual(ctx);
    }

    @Override
    public void exitNotEqual(MADSParser.NotEqualContext ctx) {
        stringBuilder.append("NOTEQL").append(NEW_LINE);
    }

    @Override
    public void enterIdentifierRltn(MADSParser.IdentifierRltnContext ctx) {
        super.enterIdentifierRltn(ctx);
    }

    @Override
    public void exitIdentifierRltn(MADSParser.IdentifierRltnContext ctx) {
        if(ctx.Identifier().getText().equals("true") || ctx.Identifier().getText().equals("false")){
            stringBuilder.append("BOOL ").append(ctx.Identifier().getText()).append(NEW_LINE);
        } else {
            if (varMap.containsKey(ctx.Identifier().getText())) {
                stringBuilder.append(PULL).append(ctx.Identifier().getText()).append(NEW_LINE);
            } else {
                System.err.println(COMPILE_TIME_ERROR + VARIABLE + ctx.Identifier().getText() + NOT_DECLARED);
                errorCount++;
            }
        }
    }

    @Override
    public void enterFalseRltn(MADSParser.FalseRltnContext ctx) {
        super.enterFalseRltn(ctx);
    }

    @Override
    public void exitFalseRltn(MADSParser.FalseRltnContext ctx) {
        stringBuilder.append("BOOL false").append(NEW_LINE);
    }

    @Override
    public void enterGreaterThan(MADSParser.GreaterThanContext ctx) {
        super.enterGreaterThan(ctx);
    }

    @Override
    public void exitGreaterThan(MADSParser.GreaterThanContext ctx) {
        stringBuilder.append("GTR").append(NEW_LINE);
    }

    @Override
    public void enterLogicalNot(MADSParser.LogicalNotContext ctx) {
        super.enterLogicalNot(ctx);
    }

    @Override
    public void exitLogicalNot(MADSParser.LogicalNotContext ctx) {
        stringBuilder.append("NOT").append(NEW_LINE);
    }

    @Override
    public void enterIdentifierLogical(MADSParser.IdentifierLogicalContext ctx) {
        super.enterIdentifierLogical(ctx);
    }

    @Override
    public void exitIdentifierLogical(MADSParser.IdentifierLogicalContext ctx) {
        if(ctx.Identifier().getText().equals("true") || ctx.Identifier().getText().equals("false")){
            stringBuilder.append("BOOL ").append(ctx.Identifier().getText()).append(NEW_LINE);
        } else {
            if (varMap.containsKey(ctx.Identifier().getText())) {
                stringBuilder.append(PULL).append(ctx.Identifier().getText()).append(NEW_LINE);
            } else {
                System.err.println(COMPILE_TIME_ERROR + VARIABLE + ctx.Identifier().getText() + NOT_DECLARED);
                errorCount++;
            }
        }
    }

    @Override
    public void enterFalseLogical(MADSParser.FalseLogicalContext ctx) {
        super.enterFalseLogical(ctx);
    }

    @Override
    public void exitFalseLogical(MADSParser.FalseLogicalContext ctx) {
        stringBuilder.append("BOOL false").append(NEW_LINE);
    }

    @Override
    public void enterTrueLogical(MADSParser.TrueLogicalContext ctx) {
        super.enterTrueLogical(ctx);
    }

    @Override
    public void exitTrueLogical(MADSParser.TrueLogicalContext ctx) {
        stringBuilder.append("BOOL true").append(NEW_LINE);
    }

    @Override
    public void enterLogicalAnd(MADSParser.LogicalAndContext ctx) {
        super.enterLogicalAnd(ctx);
    }

    @Override
    public void exitLogicalAnd(MADSParser.LogicalAndContext ctx) {
        stringBuilder.append("AND").append(NEW_LINE);
    }

    @Override
    public void enterLogicalOr(MADSParser.LogicalOrContext ctx) {
        super.enterLogicalOr(ctx);
    }

    @Override
    public void exitLogicalOr(MADSParser.LogicalOrContext ctx) {
        stringBuilder.append("OR").append(NEW_LINE);
    }

    @Override
    public void enterTernaryOperator(MADSParser.TernaryOperatorContext ctx) {
        stringBuilder.append("TRN").append(NEW_LINE);
    }

    @Override
    public void exitTernaryOperator(MADSParser.TernaryOperatorContext ctx) {
        stringBuilder.append("TRNEND").append(NEW_LINE);
    }

    @Override
    public void enterTernaryStatement(MADSParser.TernaryStatementContext ctx) {
        stringBuilder.append("TRNSTMT").append(NEW_LINE);
    }

    @Override
    public void exitTernaryStatement(MADSParser.TernaryStatementContext ctx) {
        stringBuilder.append("TRNSTMTEND").append(NEW_LINE);
    }

    @Override
    public void enterLoopStatement(MADSParser.LoopStatementContext ctx) {
        super.enterLoopStatement(ctx);
    }

    @Override
    public void exitLoopStatement(MADSParser.LoopStatementContext ctx) {
        super.exitLoopStatement(ctx);
    }

    @Override
    public void enterIfElseCondition(MADSParser.IfElseConditionContext ctx) {
        stringBuilder.append("IFLOOP").append(NEW_LINE);
    }

    @Override
    public void exitIfElseCondition(MADSParser.IfElseConditionContext ctx) {
        stringBuilder.append("ENDIF").append(NEW_LINE);
    }

    @Override
    public void enterElseStatement(MADSParser.ElseStatementContext ctx) {
        stringBuilder.append("ELSE").append(NEW_LINE);
    }

    @Override
    public void exitElseStatement(MADSParser.ElseStatementContext ctx) {
        super.exitElseStatement(ctx);
    }

    @Override
    public void enterIfCondition(MADSParser.IfConditionContext ctx) {
        stringBuilder.append("IFLOOP").append(NEW_LINE);
    }

    @Override
    public void exitIfCondition(MADSParser.IfConditionContext ctx) {
        stringBuilder.append("ENDIF").append(NEW_LINE);
    }

    @Override
    public void enterWhileLoop(MADSParser.WhileLoopContext ctx) {
        stringBuilder.append("WHILE").append(NEW_LINE);
    }

    @Override
    public void exitWhileLoop(MADSParser.WhileLoopContext ctx) {
        stringBuilder.append("ENDWHILE").append(NEW_LINE);
    }

    @Override
    public void enterForRangeLoop(MADSParser.ForRangeLoopContext ctx) {
        stringBuilder.append("FORLOOP").append(NEW_LINE);
        stringBuilder.append(DECLARE).append("INT ").append(ctx.Identifier().getText()).append(NEW_LINE);
        varMap.put(ctx.Identifier().getText(), "INT");
    }

    @Override
    public void exitForRangeLoop(MADSParser.ForRangeLoopContext ctx) {
        stringBuilder.append("ENDFOR").append(NEW_LINE);
    }

    @Override
    public void enterForAssignLoop(MADSParser.ForAssignLoopContext ctx) {
        stringBuilder.append("FORLOOP").append(NEW_LINE);
    }

    @Override
    public void exitForAssignLoop(MADSParser.ForAssignLoopContext ctx) {
        stringBuilder.append("ENDFOR").append(NEW_LINE);
    }

    @Override
    public void enterForIncrement(MADSParser.ForIncrementContext ctx) {
        stringBuilder.append("FORINC").append(NEW_LINE);
    }

    @Override
    public void exitForIncrement(MADSParser.ForIncrementContext ctx) {
        stringBuilder.append("FORINCEND").append(NEW_LINE);
    }

    @Override
    public void enterIdentifierNumber(MADSParser.IdentifierNumberContext ctx) {
        stringBuilder.append("RANGE").append(NEW_LINE);
        stringBuilder.append(PULL).append(ctx.Identifier()).append(NEW_LINE);
    }

    @Override
    public void exitIdentifierNumber(MADSParser.IdentifierNumberContext ctx) {
        stringBuilder.append("RANGEEND").append(NEW_LINE);
    }

    @Override
    public void enterDigitValue(MADSParser.DigitValueContext ctx) {
        stringBuilder.append("RANGE").append(NEW_LINE);
        stringBuilder.append("NUM ").append(ctx.DigitSequence().getText()).append(NEW_LINE);
    }

    @Override
    public void exitDigitValue(MADSParser.DigitValueContext ctx) {
        stringBuilder.append("RANGEEND").append(NEW_LINE);
    }

    @Override
    public void enterPrintIdentifier(MADSParser.PrintIdentifierContext ctx) {
        super.enterPrintIdentifier(ctx);
    }

    @Override
    public void exitPrintIdentifier(MADSParser.PrintIdentifierContext ctx) {
        if(varMap.containsKey(ctx.Identifier().getText())){
            stringBuilder.append("PRINT ").append(ctx.Identifier().getText()).append(NEW_LINE);
        } else {
            System.err.println(COMPILE_TIME_ERROR + VARIABLE + ctx.Identifier().getText() + NOT_DECLARED);
            errorCount++;
        }
    }

    @Override
    public void enterPrintString(MADSParser.PrintStringContext ctx) {
        super.enterPrintString(ctx);
    }

    @Override
    public void exitPrintString(MADSParser.PrintStringContext ctx) {
        if(ctx.Constant().getText().contains("\"")){
            stringBuilder.append("PRINT ").append(ctx.Constant().getText()).append(NEW_LINE);
        }
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }
}
