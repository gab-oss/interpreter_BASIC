import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

class StructureLoader {

    private BasicLexer lexer;
    private BasicParser parser;

    StructureLoader(String fileName) throws IOException {

        File file = new File(fileName);
        FileInputStream is = new FileInputStream(file);
        CharStream chs = new ANTLRInputStream(is);

        this.lexer = new BasicLexer(chs);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        this.parser = new BasicParser(tokenStream);
    }

    BasicLexer getLexer() {
        return lexer;
    }

    BasicParser getParser() {
        return parser;
    }
}
