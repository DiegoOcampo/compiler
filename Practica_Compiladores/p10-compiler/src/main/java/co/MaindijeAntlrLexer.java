/**
 * JayCompilerLexerAntlr4 class shows how a scanner generated by
 *  ANTLR4 is running to process only tokens. The tokens generated
 *  are produced by @see org.antlr.v4.runtime.Token.
 */

//package co;

//import co.edu.eafit.dis.st0270.p20151.dije.p10.lexer.dijeAntlrLexer;
import java.io.IOException;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.Token;

public class MaindijeAntlrLexer {

    private static void usage(int errcode) {
        System.err.println("Usage: java pl0 <file>");
        System.exit(errcode);
    }

    private static void printToken(Token t, String type) {

        System.out.println("Token: " + t.getText() +
                           " line: " + t.getLine() +
                           " column: " +
                           t.getCharPositionInLine() +
                           " type: " + type +
                           " typeId: " + t.getType());
    }

    /**
     * This method start the scanner.
     * <p>
     * @param args It accepts only one file name.
     *
     */
 public static void main(String args[]) {

        if (args.length != 1) {
            usage(1);
        }

        ANTLRFileStream afs = null;

        try {

            afs = new ANTLRFileStream(args[0]);
        }
        catch (IOException ioe) {
            System.err.println("Error: " + ioe);
            usage(2);
        }

        dijeAntlrLexer lexer = new dijeAntlrLexer(afs);

        Token t = lexer.nextToken();
        Token eof = lexer.emitEOF();
 while (t.getType() != eof.getType()) {

            switch(t.getType()) {

           case dijeAntlrLexer.WS:

                // Ignore files
                break;

            case dijeAntlrLexer.SEPARATORS:

                printToken(t, "separators");
                break;

            case dijeAntlrLexer.OPERATORS:

                printToken(t, "operators");
                break;

            case dijeAntlrLexer.KEYWORDS:

                printToken(t, "keywords");
                break;

            case dijeAntlrLexer.INT:

                printToken(t, "literal");
                break;

            case dijeAntlrLexer.ID:

                printToken(t, "Id");
                break;

            default:

                System.err.println("This cannot happen here");
printToken(t, "unknown");
                System.exit(1);
            }

            t = lexer.nextToken();
        }

    }
}
