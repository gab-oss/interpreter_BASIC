package instructions;

import java.util.List;

public class Read implements Instruction {

    List<String> vars;

    public Read(List<String> vars) {

        this.vars = vars;
        System.out.println("Read created");

    }

    @Override
    public Object execute(Interpreter interpreter) {
        return null;
    }
}
