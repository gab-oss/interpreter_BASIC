package instructions;

public class IntReturn implements Instruction {
    private ArtmExpr artmExpr;

    public IntReturn(ArtmExpr artmExpr) {

        this.artmExpr = artmExpr;
        System.out.println("IntReturn created");

    }

    @Override
    public Object execute(Object object) {
        return null;
    }
}
