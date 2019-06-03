package instructions;

public class Arg implements Instruction{

    private ArtmExpr artmExpr;
    private StringArg stringArg;
    private boolean isString;

    public Arg(ArtmExpr artmExpr) {

        this.artmExpr = artmExpr;
        isString = false;
        System.out.println("Arg created");
    }

    public Arg(StringArg stringArg) {

        isString = true;
        this.stringArg = stringArg;
    }

    public boolean isString() {
        return isString;
    }

    @Override
    public Object execute(Interpreter interpreter) {

        if(artmExpr != null) {
            return artmExpr.execute(interpreter);
        } else {
            return stringArg.execute(interpreter);
        }
    }
}
