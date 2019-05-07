package instructions;

public class R_instruction implements Instruction {

    private Instruction instruction;

    public R_instruction(Instruction instruction) {

        this.instruction = instruction;

    }

    @Override
    public Object execute(Object object) {
        return null;
    }
}
