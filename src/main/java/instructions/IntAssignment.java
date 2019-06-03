package instructions;

public class IntAssignment implements Instruction{

    private String id;
    private ArtmExpr artmExpr;

    public IntAssignment(String id, ArtmExpr artmExpr) {

        this.id = id;
        this.artmExpr = artmExpr;
        System.out.println("IntAssignment created");

    }

    @Override
    public Object execute(Interpreter interpreter) {

        int value = (Integer)artmExpr.execute(interpreter);

        if (!interpreter.replaceVar(id, value))
            interpreter.putVar(id, value);

        return null;
    }

    public String getId() {
        return id;
    }
}
