package instructions;

import java.util.List;

public class Program implements Instruction {
    private List<StringFunction> stringFunctions;
    private List<IntFunction> intFunctions;
    private List<Procedure> procedures;
    private R_instructions rInstructions;

    public Program(List<StringFunction> stringFunctions, List<IntFunction> intFunctions,
                   List<Procedure> procedures, R_instructions rInstructions) {

        this.stringFunctions = stringFunctions;
        this.intFunctions = intFunctions;
        this.procedures = procedures;
        this.rInstructions = rInstructions;

    }

    @Override
    public Object execute(Interpreter interpreter) {


        return null;
    }
}
