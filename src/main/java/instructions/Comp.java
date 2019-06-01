package instructions;

public class Comp implements Instruction {

    LogTerm term1;
    LogTerm term2;
    String operator;

    public Comp(LogTerm term1) {

        this.term1 = term1;
        this.term2 = null;
        this.operator = null;
        System.out.println("Comp created with one term");
    }

    public Comp(LogTerm term1, LogTerm term2, String operator) {

        this.term1 = term1;
        this.term2 = term2;
        this.operator = operator;
        System.out.println("Comp created with two terms");
    }


    @Override
    public Object execute(Interpreter interpreter) {
        return null;
    }
}
