package instructions;

import java.util.List;

public abstract class Callable implements Instruction {
    private String id;
    private List<String> args;
    private R_instructions rInstructions;


    @Override
    public abstract Object execute(Interpreter interpreter);

    public String getId() {
        return id;
    }
}
