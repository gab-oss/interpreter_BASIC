package instructions;

import java.util.List;

public class Procedure extends Callable{
    private String id;
    private List<String> args;
    private R_instructions rInstructions;

    public Procedure(String id, List<String> args, R_instructions rInstructions) {

        this.id = id;
        this.args = args;
        this.rInstructions = rInstructions;
        System.out.println("Procedure created");

    }

    @Override
    public Object execute(Interpreter interpreter) {
        return null;
    }
}
