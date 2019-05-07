package instructions;

public class Len implements Instruction {

    private FunCall funCall;
    private StringArg stringArg;

    public Len(StringArg stringArg) {

        this.stringArg = stringArg;
        System.out.println("Len created with stringArg");

    }

    public Len(FunCall funCall) {

        this.funCall = funCall;
        System.out.println("Len created with funCall");

    }

    @Override
    public Object execute(Object object) {
        return null;
    }
}
