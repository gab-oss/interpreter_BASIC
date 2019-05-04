package instructions;

public class StringArg  implements Instruction {

    private String value;

    public StringArg(String value) {
        this.value = value;
    }

    @Override
    public Object execute(Object object) {
        return null;
    }
}
