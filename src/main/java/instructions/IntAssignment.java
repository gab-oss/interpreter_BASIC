package instructions;

public class IntAssignment implements Instruction{

    private String id;
    private ArtmExpr artmExpr;

    public IntAssignment(String id, ArtmExpr artmExpr) {

        this.id = id;
        this.artmExpr = artmExpr;
    }

    @Override
    public Object execute(Object object) {
        return null;
    }
}
