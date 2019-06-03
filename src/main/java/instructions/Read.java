package instructions;

import java.util.List;
import java.util.Scanner;

public class Read implements Instruction {

    List<String> vars;

    public Read(List<String> vars) {

        this.vars = vars;
        System.out.println("Read created");

    }

    @Override
    public Object execute(Interpreter interpreter) {

        Scanner scanner = new Scanner(System.in);

        for(String var: vars) {
            if (!interpreter.replaceVar(var, scanner.next())) {
                throw new RuntimeException("Tried to read nonexisting variable");
            }

        }

        return null;
    }
}
