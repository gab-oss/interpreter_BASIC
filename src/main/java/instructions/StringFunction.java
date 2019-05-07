package instructions;

import java.util.List;

public class StringFunction implements Instruction {

    private String id;
    private List<String> args;
    private R_instructions rInstructions;
    private StringReturn stringReturn;

    public StringFunction(String id, List<String> args, R_instructions rInstructions, StringReturn stringReturn) {

        this.id = id;
        this.args = args;
        this.rInstructions = rInstructions;
        this.stringReturn = stringReturn;

        System.out.println("StringFunction created");

    }

    @Override
    public Object execute(Object object) {
        return null;
    }
}
