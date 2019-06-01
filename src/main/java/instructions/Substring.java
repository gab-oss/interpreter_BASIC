package instructions;

public class Substring implements Instruction {
    private ArtmExpr artmExpr;
    private String stringId;

    public Substring(String id, ArtmExpr artmExpr) {

        this.stringId = id;
        this.artmExpr = artmExpr;

        System.out.println("Substring created");

    }

    @Override
    public Object execute(Interpreter interpreter) {

        return null;
    }
}
