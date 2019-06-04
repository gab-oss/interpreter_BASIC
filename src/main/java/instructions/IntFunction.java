package instructions;

import java.util.List;

public class IntFunction extends Callable{

    private IntReturn intReturn;

    public IntFunction(String id, List<String> args, R_instructions rInstructions, IntReturn intReturn) {

        super(id, args, rInstructions);
        this.intReturn = intReturn;

    }

    public IntReturn getIntReturn() {
        return intReturn;
    }


}
