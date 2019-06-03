package instructions;

import java.util.List;

public abstract class Callable implements Instruction {
    protected String id;
    protected List<String> args;
    protected R_instructions rInstructions;

    public Callable(String id, List<String> args, R_instructions rInstructions) {
        this.id = id;
        this.args = args;
        this.rInstructions = rInstructions;
    }


    public String getId() {
        return id;
    }

    public List<String> getArgs() {
        return args;
    }

    public R_instructions getInstructions() {
        return rInstructions;
    }

    @Override
    public int hashCode() {
        return (/*type.hashCode()*/id.hashCode() /*+ args.hashCode() /*+ instructions.hashCode()*/) % 31;
    }



    @Override
    public boolean equals(Object obj) {
        return getClass().equals(obj.getClass())
                && id.equals(((Callable) obj).getId());
    }

    @Override
    public Object execute(Interpreter interpreter) {
        System.out.println("EXECUTE INTFUNCTION");
        if(!interpreter.pushCallable(this))
            throw new RuntimeException("Function already exists");
        System.out.println("EXECUTED INTFUNCTION");
        return null;
    }

}
