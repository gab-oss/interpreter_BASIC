import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.tree.ParseTree;
import javax.swing.*;
import java.io.IOException;
import java.util.Arrays;

public class TreePrinter {

    private TreeViewer treev;

    private JFrame frame;

    TreePrinter(String fileName) {

        StructureLoader loader = null;
        try {
            loader = new StructureLoader(fileName);
            ParseTree tree = loader.getParser().program();

            this.treev = new TreeViewer(Arrays.asList(loader
                    .getParser()
                    .getRuleNames()),tree);
            this.frame = new JFrame("BASIC");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void print(){

        JPanel container = new JPanel();
        container.add(treev);

        JScrollPane scrPane = new JScrollPane(container);
        frame.add(scrPane);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);
    }
}
