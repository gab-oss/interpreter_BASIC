package instructions;

public class CallArg implements Instruction {

    private ArtmExpr artmExpr;

    public CallArg(ArtmExpr artmExpr) {

        this.artmExpr = artmExpr;
    }

    @Override
    public Object execute(Object object) {
        return null;
    }
}
