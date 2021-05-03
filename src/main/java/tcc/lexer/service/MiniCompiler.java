package tcc.lexer.service;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import tcc.lexer.CompilerRunner;
import tcc.lexer.analyzer.minipascalLexer;
import tcc.lexer.analyzer.minipascalParser;

import java.io.IOException;
import java.util.Arrays;

public class MiniCompiler {

    private static final Logger log = LogManager.getLogger(CompilerRunner.class);

    public static void lexicalAnalysis(String INPUT_FILE_PATH) throws IOException {
        minipascalLexer lexer = new minipascalLexer(CharStreams.fromFileName(INPUT_FILE_PATH));

            while (lexer.nextToken().getType() != Token.EOF){
                String token = minipascalLexer.VOCABULARY.getDisplayName(lexer.getType());
                String lexeme = lexer.getText();

                log.info("Token found: "+ token +" | Lexeme: " + lexeme);
            }
    }

    public static void syntaxAnalysis(String INPUT_FILE_PATH) throws IOException {

        minipascalLexer lexer = new minipascalLexer(CharStreams.fromFileName(INPUT_FILE_PATH));
        TokenStream tokenStream = new CommonTokenStream(lexer);
        minipascalParser parser = new minipascalParser(tokenStream);
        ParseTree tree = parser.program();

        log.info(tree.toStringTree(parser));

        TreeViewer viewer = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree);
        viewer.open();

    }

}
