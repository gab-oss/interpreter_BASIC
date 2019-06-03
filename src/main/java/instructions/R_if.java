package instructions;

import java.util.List;

public class R_if implements Instruction {
//    private List<Condition> conditions;
    private Condition condition;
    private R_instructions rinstructions;

    public R_if(Condition condition, R_instructions rinstructions) {

        this.condition = condition;
        this.rinstructions = rinstructions;
        System.out.println("If created");

    }

    @Override
    public Object execute(Interpreter interpreter) {

        if ((Boolean) condition.execute(interpreter)) {
            rinstructions.execute(interpreter);
        }


//        for(Condition condition: conditions) {
//            if((Integer)condition.execute(interpreter) == 0) {
//                return null;
//            }
//        }

//        for (Instruction instruction: rinstructions) {
//            instruction.execute(interpreter);
//        }

        return null;
    }
}
