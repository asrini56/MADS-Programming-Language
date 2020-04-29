package compiler;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.io.IOException;

/**
 * @author Deepti Paul
 * @author Srinivasan Sundar
 * @since 18/04/2020
 * @version 1.0
 * MADSCompiler compiles the .mads program files and provide intermediate code
 */
public class MADSCompiler {

    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            String filename = "examples/boolOperation.mads";
            CharStream charStream = CharStreams.fromFileName(filename);
            MADSLexer madsLexer = new MADSLexer(charStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(madsLexer);
            MADSParser madsParser = new MADSParser(commonTokenStream);
            ParseTree parseTree = madsParser.program();
            ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
            parseTreeWalker.walk(new IntermediateCodeGenerator(filename), parseTree);
        } else{
            System.err.println("Program name is missing in the command");
        }
    }

}
