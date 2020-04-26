package compiler;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomMADSListener extends MADSBaseListener {

    private StringBuilder stringBuilder = new StringBuilder();
    private String fileName = null;

    private  List<String> varList = new ArrayList<>();
    private Map<String, String> varMap = new HashMap<>();
    private int instCount = 0;

    CustomMADSListener(String filename){
        this.fileName = filename;
    }

    @Override
    public void enterProgram(MADSParser.ProgramContext ctx) {
        super.enterProgram(ctx);
        stringBuilder.append(instCount).append(" START\n");
        instCount++;
    }

    @Override
    public void exitProgram(MADSParser.ProgramContext ctx) {
        super.exitProgram(ctx);
        stringBuilder.append(instCount).append(" END\n");
        String[] filePath = this.fileName.split(".mads");
        String icFileName = filePath[0] + ".imc";
        byte[] intermediateCode = stringBuilder.toString().getBytes();
        try {
            Files.write(Paths.get(icFileName), intermediateCode);
        } catch (IOException e) {
            System.err.println("Unable to write Intermediate code to " + icFileName);
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
    public void enterDeclaration(MADSParser.DeclarationContext ctx) {
        super.enterDeclaration(ctx);
        if(ctx.Identifier() != null ){
            String id = ctx.Identifier().getText();
            String dataType = ctx.start.getText().toUpperCase();
            stringBuilder.append(instCount).append(" DECL ").append(dataType);
            stringBuilder.append(" ").append(id).append("\n");
            instCount++;
            varMap.put(id, dataType);
        }
    }

    @Override
    public void exitDeclaration(MADSParser.DeclarationContext ctx) {
        super.exitDeclaration(ctx);
    }

    @Override
    public void enterInitializeStatement(MADSParser.InitializeStatementContext ctx) {
        super.enterInitializeStatement(ctx);
        if(ctx.TypeSpecifier() != null){
            String id = ctx.Identifier(0).getText();
            String dataType = ctx.start.getText().toUpperCase();
            stringBuilder.append(instCount).append(" DECL ").append(ctx.start.getText().toUpperCase());
            stringBuilder.append(" ").append(ctx.Identifier(0).getText()).append("\n");
            instCount++;
            varMap.put(id, dataType);
            if(ctx.children.toArray()[3] != null && varMap.containsKey(id)) {
                String  value = "";
                if(ctx.Identifier(1) != null){
                    value = ((TerminalNodeImpl) ((java.util.ArrayList)ctx.children).get(3)).getText();
                } else{
                    value = ((MADSParser.ExprContext) ((java.util.ArrayList)ctx.children).get(3)).getText();
                }
                stringBuilder.append(instCount).append(" ASGN ").append(ctx.Identifier(0).getText());
                stringBuilder.append(" ").append(value).append("\n");
                instCount++;
            }
        }
    }

    @Override
    public void exitInitializeStatement(MADSParser.InitializeStatementContext ctx) {
        super.exitInitializeStatement(ctx);
    }

    @Override
    public void enterAssignmentStatement(MADSParser.AssignmentStatementContext ctx) {
        super.enterAssignmentStatement(ctx);
    }

    @Override
    public void exitAssignmentStatement(MADSParser.AssignmentStatementContext ctx) {
        super.exitAssignmentStatement(ctx);
    }

    @Override
    public void enterExpr(MADSParser.ExprContext ctx) {
        super.enterExpr(ctx);
    }

    @Override
    public void exitExpr(MADSParser.ExprContext ctx) {
        super.exitExpr(ctx);
    }

    @Override
    public void enterExpr_term(MADSParser.Expr_termContext ctx) {
        super.enterExpr_term(ctx);
    }

    @Override
    public void exitExpr_term(MADSParser.Expr_termContext ctx) {
        super.exitExpr_term(ctx);
    }

    @Override
    public void enterExpr_fact(MADSParser.Expr_factContext ctx) {
        super.enterExpr_fact(ctx);
    }

    @Override
    public void exitExpr_fact(MADSParser.Expr_factContext ctx) {
        super.exitExpr_fact(ctx);
    }

    @Override
    public void enterUnaryExpr(MADSParser.UnaryExprContext ctx) {
        super.enterUnaryExpr(ctx);
    }

    @Override
    public void exitUnaryExpr(MADSParser.UnaryExprContext ctx) {
        super.exitUnaryExpr(ctx);
    }

    @Override
    public void enterConditionStmt(MADSParser.ConditionStmtContext ctx) {
        super.enterConditionStmt(ctx);
    }

    @Override
    public void exitConditionStmt(MADSParser.ConditionStmtContext ctx) {
        super.exitConditionStmt(ctx);
    }

    @Override
    public void enterRelationalExpr(MADSParser.RelationalExprContext ctx) {
        super.enterRelationalExpr(ctx);
    }

    @Override
    public void exitRelationalExpr(MADSParser.RelationalExprContext ctx) {
        super.exitRelationalExpr(ctx);
    }

    @Override
    public void enterEqualityExpr(MADSParser.EqualityExprContext ctx) {
        super.enterEqualityExpr(ctx);
    }

    @Override
    public void exitEqualityExpr(MADSParser.EqualityExprContext ctx) {
        super.exitEqualityExpr(ctx);
    }

    @Override
    public void enterLogicalExpr(MADSParser.LogicalExprContext ctx) {
        super.enterLogicalExpr(ctx);
    }

    @Override
    public void exitLogicalExpr(MADSParser.LogicalExprContext ctx) {
        super.exitLogicalExpr(ctx);
    }

    @Override
    public void enterComparisonExpr(MADSParser.ComparisonExprContext ctx) {
        super.enterComparisonExpr(ctx);
    }

    @Override
    public void exitComparisonExpr(MADSParser.ComparisonExprContext ctx) {
        super.exitComparisonExpr(ctx);
    }

    @Override
    public void enterTernaryOperator(MADSParser.TernaryOperatorContext ctx) {
        super.enterTernaryOperator(ctx);
    }

    @Override
    public void exitTernaryOperator(MADSParser.TernaryOperatorContext ctx) {
        super.exitTernaryOperator(ctx);
    }

    @Override
    public void enterTernaryStatement(MADSParser.TernaryStatementContext ctx) {
        super.enterTernaryStatement(ctx);
    }

    @Override
    public void exitTernaryStatement(MADSParser.TernaryStatementContext ctx) {
        super.exitTernaryStatement(ctx);
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
    public void enterIfLoop(MADSParser.IfLoopContext ctx) {
        super.enterIfLoop(ctx);
    }

    @Override
    public void exitIfLoop(MADSParser.IfLoopContext ctx) {
        super.exitIfLoop(ctx);
    }

    @Override
    public void enterWhileLoop(MADSParser.WhileLoopContext ctx) {
        super.enterWhileLoop(ctx);
    }

    @Override
    public void exitWhileLoop(MADSParser.WhileLoopContext ctx) {
        super.exitWhileLoop(ctx);
    }

    @Override
    public void enterForLoop(MADSParser.ForLoopContext ctx) {
        super.enterForLoop(ctx);
    }

    @Override
    public void exitForLoop(MADSParser.ForLoopContext ctx) {
        super.exitForLoop(ctx);
    }

    @Override
    public void enterNumberValue(MADSParser.NumberValueContext ctx) {
        super.enterNumberValue(ctx);
    }

    @Override
    public void exitNumberValue(MADSParser.NumberValueContext ctx) {
        super.exitNumberValue(ctx);
    }

    @Override
    public void enterPrintStatement(MADSParser.PrintStatementContext ctx) {
        super.enterPrintStatement(ctx);
    }

    @Override
    public void exitPrintStatement(MADSParser.PrintStatementContext ctx) {
        super.exitPrintStatement(ctx);
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
