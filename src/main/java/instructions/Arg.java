package instructions;

public class Arg implements Instruction{

    private ArtmExpr artmExpr;
    private StringArg stringArg;

    public Arg(ArtmExpr artmExpr) {

        this.artmExpr = artmExpr;
        System.out.println("Arg created");
    }

    public Arg(StringArg stringArg) {

        this.stringArg = stringArg;
    }

    @Override
    public Object execute(Object object) {
        return null;
    }
}
