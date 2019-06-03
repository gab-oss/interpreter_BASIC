package instructions;

public class MultExpression implements Instruction {

    private Term term;
    private boolean positive;

    public MultExpression(Term term, boolean positive) {

        this.term = term;
        this.positive = positive;
        System.out.println("MultExpression created");

    }

    @Override
    public Object execute(Interpreter interpreter) {
        if (positive) {
            return term.execute(interpreter);
        } else {
            return  -1 * (Integer)term.execute(interpreter);
        }
    }
}
