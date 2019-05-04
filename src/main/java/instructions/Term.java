package instructions;

public class Term implements Instruction {

    int value;

    public Term(String s) {
        this.value = Integer.parseInt(s);
    }

    @Override
    public Object execute(Object object) {
        return null;
    }
}
