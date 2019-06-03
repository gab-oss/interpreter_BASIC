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
    public Object execute(Interpreter interpreter) {

        if (stringArg != null) {
            return stringArg.execute(interpreter).toString().length() - 2;
        } else {
            return ((String)funCall.execute(interpreter)).length() - 2;
        }
    }
}
