package instructions;

public class StringReturn implements Instruction {
    private FunCall funCall;
    private StringArg stringArg;

    public StringReturn(StringArg stringArg, FunCall funCall) {

        this.stringArg = stringArg;
        this.funCall = funCall;

    }

    @Override
    public Object execute(Interpreter interpreter) {

        if (funCall != null) {
            return funCall.execute(interpreter);
        } else  {
            return stringArg.execute(interpreter);
        }
    }
}
