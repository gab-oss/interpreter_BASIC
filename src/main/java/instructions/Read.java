package instructions;

import java.util.List;

public class Read implements Instruction {

    List<String> vars;

    public Read(List<String> vars) {

        this.vars = vars;
    }

    @Override
    public Object execute(Object object) {
        return null;
    }
}
