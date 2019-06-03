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
            String s = scanner.next();
            if(var.charAt(var.length() - 1) != '$') {
                if (!interpreter.replaceVar(var, Integer.parseInt(s) )) {
                    throw new RuntimeException("Tried to read nonexisting variable");
                }
            } else if (!interpreter.replaceVar(var, s)) {
                throw new RuntimeException("Tried to read nonexisting variable");
            }

        }

        return null;
    }
}
