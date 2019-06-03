package instructions;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class AdditiveExpr implements Instruction{

//    private MultExpression multExpression;

//    public AdditiveExpr(MultExpression multExpression) {
//
//        this.multExpression = multExpression;
//        System.out.println("AdditiveExpr created");
//    }

    List<MultExpression> multExpressions;
    List<TerminalNode> operators;

    public AdditiveExpr(List<MultExpression> multExpressions, List<TerminalNode> operators) {

        this.multExpressions = multExpressions;
        this.operators = operators;
    }

    @Override
    public Object execute(Interpreter interpreter) {

        int i = 0;

        int result = (Integer)multExpressions.get(i).execute(interpreter);

        for (TerminalNode operator: operators) {
            ++i;
            if (operator.toString().equals("*")) {
                result = result * (Integer)multExpressions.get(i).execute(interpreter);
            } else {

                int div = (Integer)multExpressions.get(i).execute(interpreter);
                if (div == 0) {
                    throw new RuntimeException("Can't divide by zero");
                }
                result = result / div;
            }
        }

        return result;
    }

//    public void multMultExpression(Instruction instruction) {
//    }
//
//    public void divMultExpression(Instruction instruction) {
//    }
}
