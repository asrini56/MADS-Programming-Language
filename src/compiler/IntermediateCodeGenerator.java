package compiler;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import static compiler.Constants.*;

public class IntermediateCodeGenerator extends MADSBaseListener {

    private StringBuilder stringBuilder = new StringBuilder();
    private String fileName = null;

    private Map<String, String> varMap = new HashMap<>();

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
        }
    }

    @Override
    public void enterProgram(MADSParser.ProgramContext ctx) {
        stringBuilder.append(START).append(NEW_LINE);
    }

    @Override
    public void exitProgram(MADSParser.ProgramContext ctx) {
        stringBuilder.append(END).append(NEW_LINE);
        writeToFile();
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
        }
    }

    @Override
    public void exitInitializeExpr(MADSParser.InitializeExprContext ctx) {
        if(varMap.containsKey(ctx.Identifier().getText())) {
            stringBuilder.append("STORE ").append(ctx.Identifier().getText()).append(NEW_LINE);
        } else {
            System.err.println(COMPILE_TIME_ERROR + VARIABLE + ctx.Identifier().getText() + NOT_DECLARED);
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
        }
    }

}
