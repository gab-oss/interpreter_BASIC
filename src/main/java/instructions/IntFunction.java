package instructions;

import java.util.List;

public class IntFunction extends Callable{

    private String id;
    private List<String> args;
    private R_instructions rInstructions;
    private IntReturn intReturn;

    public IntFunction(String id, List<String> args, R_instructions rInstructions, IntReturn intReturn) {

        this.id = id;
        this.args = args;
        this.rInstructions = rInstructions;
        this.intReturn = intReturn;
        System.out.println("IntFunction created");

    }

    @Override
    public Object execute(Interpreter interpreter) {
        return null;
    }
}
