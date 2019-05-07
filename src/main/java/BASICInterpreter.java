import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class BASICInterpreter {
    public static void main(String[] args) {
        String fileName = args[0] ;

        ParseTree tree;
        StructureLoader loader;
        BasicBaseVisitor visitor = new BASICVisitorImpl();

        try {
            loader = new StructureLoader(fileName);
            tree = loader.getParser().program();
            visitor.visit(tree);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        TokenPrinter tokenPrinter = new TokenPrinter(fileName);
//        tokenPrinter.print();

        TreePrinter treePrinter = new TreePrinter(fileName);
        treePrinter.print();
    }
}