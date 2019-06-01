package instructions;

import java.util.List;

public class FunCall implements Instruction {

    private String id;
    private List<Arg> args;

    public FunCall(String id) {

        this.id = id;
        this.args = null;
        System.out.println("FunCall created without arguments");

    }

    public FunCall(String id, List<Arg> args) {

        this.id = id;
        this.args = args;
        System.out.println("FunCall created with arguments");

    }



    @Override
    public Object execute(Interpreter interpreter) {
        return null;
    }
}
