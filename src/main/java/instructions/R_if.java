package instructions;

import java.util.List;

public class R_if implements Instruction {
    private List<Condition> conditions;
    private List<R_instructions> rinstructions;

    public R_if(List<Condition> conditions, List<R_instructions> rinstructions) {

        this.conditions = conditions;
        this.rinstructions = rinstructions;
        System.out.println("If created");

    }

    @Override
    public Object execute(Interpreter interpreter) {
        return null;
    }
}
