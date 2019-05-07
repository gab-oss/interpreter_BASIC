package instructions;

import java.util.List;

public class R_instructions implements Instruction {

    private List<Instruction> instructions;

    public R_instructions(List<Instruction> instructions) {

        this.instructions = instructions;
    }

    @Override
    public Object execute(Object object) {
        return null;
    }
}
