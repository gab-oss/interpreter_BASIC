package instructions;

public class StringAssignment implements Instruction {
    private String stringId;
    private Substring substring;
    private StringArg stringArg;
    private FunCall funCall;

    public StringAssignment(String stringId, Substring substring, StringArg stringArg, FunCall funCall) {

        this.stringId = stringId;
        this.substring = substring;
        this.stringArg = stringArg;
        this.funCall = funCall;

        System.out.println("StringAssignment created");

    }

    @Override
    public Object execute(Interpreter interpreter) {
        return null;
    }
}
