package instructions;

import java.util.List;

public class StringFunction extends Callable {

    private StringReturn stringReturn;

    public StringFunction(String id, List<String> args, R_instructions rInstructions, StringReturn stringReturn) {

        super(id, args, rInstructions);
        this.stringReturn = stringReturn;

        System.out.println("StringFunction created");

    }

    public StringReturn getStringReturn() {
        return stringReturn;
    }


}
