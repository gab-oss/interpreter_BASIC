import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import static org.antlr.v4.parse.ANTLRLexer.EOF;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LexerTest {

    @Test
    public void idCanBeLettersNumbersAndUnderscore() throws IOException {

        String string = "e_5ex22a_mple";
        List<Token> tokens = new ArrayList<Token>();
        InputStream is = new ByteArrayInputStream(string.getBytes());
        CharStream chs = new org.antlr.v4.runtime.ANTLRInputStream(is);

        BasicLexer lexer = new BasicLexer(chs);

        while(true) {
            Token token = lexer.nextToken();
            tokens.add(token);

            if (token.getType() == EOF) {
                break;
            }
        }

        assertEquals(tokens.get(0).getType(), BasicLexer.ID);
    }

    @Test
    public void idEndingWithDollarIsStringId() throws IOException {

        String string = "e_5ex22a_mple$";
        List<Token> tokens = new ArrayList<Token>();
        InputStream is = new ByteArrayInputStream(string.getBytes());
        CharStream chs = new org.antlr.v4.runtime.ANTLRInputStream(is);

        BasicLexer lexer = new BasicLexer(chs);

        while(true) {
            Token token = lexer.nextToken();
            tokens.add(token);

            if (token.getType() == EOF) {
                break;
            }
        }

        assertEquals(tokens.get(0).getType(), BasicLexer.STRING_ID);
    }

    @Test
    public void stringIdCantBeCapitalFunctionDollar() throws IOException {

        String string = "FUNCTION$";
        List<Token> tokens = new ArrayList<Token>();
        InputStream is = new ByteArrayInputStream(string.getBytes());
        CharStream chs = new org.antlr.v4.runtime.ANTLRInputStream(is);

        BasicLexer lexer = new BasicLexer(chs);

        while(true) {
            Token token = lexer.nextToken();
            tokens.add(token);

            if (token.getType() == EOF) {
                break;
            }
        }

        assertNotEquals(tokens.get(0).getType(), BasicLexer.STRING_ID);
    }

    @Test
    public void idCantStartWithNumber() throws IOException {

        String string = "5example";
        List<Token> tokens = new ArrayList<Token>();
        InputStream is = new ByteArrayInputStream(string.getBytes());
        CharStream chs = new org.antlr.v4.runtime.ANTLRInputStream(is);

        BasicLexer lexer = new BasicLexer(chs);

        while(true) {
            Token token = lexer.nextToken();
            tokens.add(token);

            if (token.getType() == EOF) {
                break;
            }
        }

        assertNotEquals(tokens.get(0).getType(), BasicLexer.ID);
    }

    @Test
    public void tokensAreRecognizedCorrectlyInWeakInequality() throws IOException {

        String string = "5 <= e_5ex22a_mple";
        List<Token> tokens = new ArrayList<Token>();
        InputStream is = new ByteArrayInputStream(string.getBytes());
        CharStream chs = new org.antlr.v4.runtime.ANTLRInputStream(is);

        BasicLexer lexer = new BasicLexer(chs);

        while(true) {
            Token token = lexer.nextToken();
            tokens.add(token);

            if (token.getType() == EOF) {
                break;
            }
        }

        assertEquals(tokens.get(0).getType(), BasicLexer.NUMBER);
        assertEquals(tokens.get(1).getType(), BasicLexer.COMP_OPERATOR);
        assertEquals(tokens.get(1).getText(), "<=");
        assertEquals(tokens.get(2).getType(), BasicLexer.ID);
    }
}