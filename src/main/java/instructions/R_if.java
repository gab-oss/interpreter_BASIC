package instructions;

import java.util.List;

public class R_if implements Instruction {

    private Condition condition;
    private R_instructions rinstructions;

    public R_if(Condition condition, R_instructions rinstructions) {

        this.condition = condition;
        this.rinstructions = rinstructions;

    }

    @Override
    public Object execute(Interpreter interpreter) {

        if ((Boolean) condition.execute(interpreter)) {
            rinstructions.execute(interpreter);
        }

        return null;
    }
}
