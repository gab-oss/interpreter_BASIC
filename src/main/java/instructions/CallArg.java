package instructions;

public class CallArg implements Instruction {

    private ArtmExpr artmExpr;

    public CallArg(ArtmExpr artmExpr) {

        this.artmExpr = artmExpr;
        System.out.println("CallArg created");

    }

    @Override
    public Object execute(Interpreter interpreter) {
        return null;
    }
}
