package instructions;

public class Len implements Instruction {

    StringArg stringArg;

    public Len(StringArg stringArg) {

        this.stringArg = stringArg;
    }

    @Override
    public Object execute(Object object) {
        return null;
    }
}
