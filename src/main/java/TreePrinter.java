import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.tree.ParseTree;
import javax.swing.*;
import java.io.IOException;
import java.util.Arrays;

public class TreePrinter {

    private ParseTree tree;
    private TreeViewer treev;
    private JFrame frame;

    TreePrinter(String fileName) {

        StructureLoader loader = null;
        try {
            loader = new StructureLoader(fileName);
            this.tree = loader.getParser().program();

            this.treev = new TreeViewer(Arrays.asList(loader
                    .getParser()
                    .getRuleNames()),tree);
            this.frame = new JFrame("BASIC");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void print(){


        BasicBaseVisitor visitor = new BasicVisitorImpl(new SymbolTable());
        visitor.visit(tree);
        ((BasicVisitorImpl) visitor).getSymbolTable().printVariableStack();

        JPanel container = new JPanel();
        container.add(treev);

        JScrollPane scrPane = new JScrollPane(container);
        frame.add(scrPane);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);
    }
}
