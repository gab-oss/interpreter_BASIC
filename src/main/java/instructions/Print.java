package instructions;

import java.util.List;

public class Print implements Instruction {

    List<Arg> args;

    public Print(List<Arg> args) {

        this.args = args;
        System.out.println("Print created");

    }

    @Override
    public Object execute(Interpreter interpreter) {
        for (Arg arg: args) {
            System.out.println(arg.execute(interpreter));
        }
        return null;
    }
}
