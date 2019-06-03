package instructions;

import java.util.List;

public class IntDefinition implements Instruction {

    List<IntAssignment> defs;

    public IntDefinition(List<IntAssignment> defs) {

        this.defs = defs;
        System.out.println("IntDefinition created");

    }

    @Override
    public Object execute(Interpreter interpreter) {
        for (IntAssignment def: defs) {
            interpreter.putVar(def.getId(), null);
            def.execute(interpreter);
        }
        return null;
    }
}
