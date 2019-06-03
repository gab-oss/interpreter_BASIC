package instructions;

import java.util.List;

public class R_instructions implements Instruction {

    private List<Instruction> instructions;

    public R_instructions(List<Instruction> instructions) {

        this.instructions = instructions;
    }

    public List<Instruction> getInstructions() {
        return instructions;
    }

    @Override
    public Object execute(Interpreter interpreter) {

        for (Instruction instruction: instructions) {
            instruction.execute(interpreter);
        }
        return null;
    }
}
