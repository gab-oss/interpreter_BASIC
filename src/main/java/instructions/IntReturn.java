package instructions;

public class IntReturn implements Instruction {
    private ArtmExpr artmExpr;

    public IntReturn(ArtmExpr artmExpr) {

        this.artmExpr = artmExpr;

    }

    @Override
    public Object execute(Interpreter interpreter) {
        return artmExpr.execute(interpreter);
    }
}
