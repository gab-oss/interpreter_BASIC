package instructions;

import java.util.List;

public class Input implements Instruction {

    List<String> ids;

    public Input(List<String> ids) {

        this.ids = ids;

    }

    @Override
    public Object execute(Interpreter interpreter) {

        return null;
    }
}
