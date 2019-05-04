package instructions;

public class MultExpression implements Instruction {

    private Term term;
    private boolean positive;

    public MultExpression(Term term, boolean positive) {

        this.term = term;
        this.positive = positive;
    }

    @Override
    public Object execute(Object object) {
        return null;
    }
}
