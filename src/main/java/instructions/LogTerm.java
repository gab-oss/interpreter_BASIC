package instructions;

public class LogTerm implements Instruction {

    int value;

    public LogTerm(String s) {
        this.value = Integer.parseInt(s);
    }

    @Override
    public Object execute(Object object) {
        return null;
    }
}
