package instructions;

import java.util.List;

public class IntDefinition implements Instruction {

    List<IntAssignment> defs;

    public IntDefinition(List<IntAssignment> defs) {

        this.defs = defs;
    }

    @Override
    public Object execute(Object object) {
        return null;
    }
}
