package instructions;

import java.util.List;

public class IntFunction extends Callable{

    private IntReturn intReturn;

    public IntFunction(String id, List<String> args, R_instructions rInstructions, IntReturn intReturn) {

        super(id, args, rInstructions);
        this.intReturn = intReturn;
        System.out.println("IntFunction created");

    }

    public IntReturn getIntReturn() {
        return intReturn;
    }

//
//    @Override
//    public Object execute(Interpreter interpreter) {
//        return null;
//    }
}
