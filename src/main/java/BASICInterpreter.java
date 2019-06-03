import instructions.Interpreter;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class BASICInterpreter {
    public static void main(String[] args) {
        String fileName = args[0] ;

        ParseTree tree;
        StructureLoader loader;
        BasicBaseVisitor visitor = new BASICVisitorImpl();
        Interpreter interpreter;

        try {
            loader = new StructureLoader(fileName);
            tree = loader.getParser().program();
//            visitor.visit(tree);
            TreePrinter treePrinter = new TreePrinter(fileName);
            treePrinter.print();
            interpreter = (Interpreter) visitor.visit(tree);
            interpreter.execute(interpreter);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        TokenPrinter tokenPrinter = new TokenPrinter(fileName);
//        tokenPrinter.print();



    }
}