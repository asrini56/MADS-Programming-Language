package compiler;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.util.Arrays;

public class MADSCompiler {

    public static void main(String[] args) throws IOException {
        String filename = "examples/ex1.mads";
        CharStream charStream = CharStreams.fromFileName(filename);
        MADSLexer madsLexer = new MADSLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(madsLexer);
        MADSParser madsParser = new MADSParser(commonTokenStream);
        ParseTree parseTree = madsParser.program();

        System.out.println("Parse Tree for the given program: ");

        System.out.println(parseTree.toStringTree(madsParser));

        TreeViewer viewer = new TreeViewer(Arrays.asList(madsParser.getRuleNames()), parseTree);
        viewer.open();

        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        parseTreeWalker.walk(new IntermediateCodeGenerator(filename), parseTree);
    }

}
