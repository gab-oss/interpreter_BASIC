package instructions;

import java.util.List;

public class Print implements Instruction {

    List<Arg> args;

    public Print(List<Arg> args) {

        this.args = args;

    }

    @Override
    public Object execute(Interpreter interpreter) {
        for (Arg arg: args) {
            System.out.print(arg.execute(interpreter));
        }
        System.out.print('\n');
        return null;
    }
}
