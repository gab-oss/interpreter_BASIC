import org.antlr.v4.runtime.*;

import java.io.IOException;

import static org.antlr.v4.parse.ANTLRLexer.EOF;

public class TokenPrinter {

    private Vocabulary vocabulary;
    private TokenSource tokenSource;

    TokenPrinter(String fileName) {

        StructureLoader loader = null;
        try {
            loader = new StructureLoader(fileName);
            this.vocabulary = loader.getLexer().getVocabulary();
            this.tokenSource = loader.getLexer();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void print() {
        while (true) {
            Token token = tokenSource.nextToken();
            if (token.getType() == EOF) {
                break;
            }

            System.out.print("type: " + vocabulary.getSymbolicName(token.getType()) + " - ");
            System.out.println("text: " + token.getText());
        }
    }
}
