package instructions;

import java.util.List;

public class Input implements Instruction {

    List<String> ids;

    public Input(List<String> ids) {

        this.ids = ids;
    }

    @Override
    public Object execute(Object object) {
        return null;
    }
}
