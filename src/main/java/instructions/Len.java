package instructions;

public class Len implements Instruction {

    private FunCall funCall;
    private StringArg stringArg;

    public Len(StringArg stringArg) {

        this.stringArg = stringArg;

    }

    public Len(FunCall funCall) {

        this.funCall = funCall;

    }

    @Override
    public Object execute(Interpreter interpreter) {

        if (stringArg != null) {
            return stringArg.execute(interpreter).toString().length();
        } else {
            return ((String)funCall.execute(interpreter)).length();
        }
    }
}
