package instructions;

public class AdditiveExpr implements Instruction{

    private MultExpression multExpression;

    public AdditiveExpr(MultExpression multExpression) {

        this.multExpression = multExpression;
        System.out.println("AdditiveExpr created");
    }

    @Override
    public Object execute(Interpreter interpreter) {
        return null;
    }

    public void multMultExpression(Instruction instruction) {
    }

    public void divMultExpression(Instruction instruction) {
    }
}
