package instructions;

public class Comp implements Instruction {

    LogTerm term1;
    LogTerm term2;
    String operator;

    public Comp(LogTerm term1) {

        this.term1 = term1;
        this.term2 = null;
        this.operator = null;
    }

    public Comp(LogTerm term1, LogTerm term2, String operator) {

        this.term1 = term1;
        this.term2 = term2;
        this.operator = operator;
    }


    @Override
    public Object execute(Object object) {
        return null;
    }
}
