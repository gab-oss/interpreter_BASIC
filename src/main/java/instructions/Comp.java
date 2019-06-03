package instructions;

public class Comp implements Instruction {

    ArtmExpr expr1;
    ArtmExpr expr2;
    String operator;
    Condition condition;

    public Comp(ArtmExpr expr1) {


        this.expr1 = expr1;
        this.expr2 = null;
        this.operator = null;
        System.out.println("Comp created with one term");
    }

    public Comp(ArtmExpr expr1, ArtmExpr expr2, String operator) {

        this.expr1 = expr1;
        this.expr2 = expr2;
        this.operator = operator;
        System.out.println("Comp created with two terms");
    }

    public Comp(Condition condition) {

        this.condition = condition;
    }


    @Override
    public Object execute(Interpreter interpreter) {

        if(condition != null ){
            return condition.execute(interpreter);
        }

        if (expr2 == null)
            if ((Integer)expr1.execute(interpreter) >= 0) {
                return true;
            }

        if (condition != null)
            return condition.execute(interpreter);
        else {
            int resExpr1 = (Integer)expr1.execute(interpreter);
            int resExpr2 = (Integer)expr2.execute(interpreter);

            // COMP_OPERATOR         : '<' | '>' | '<>' | '==' | '<=' | '>='  ;

            if (operator.equals("<")) {
                if (resExpr1 < resExpr2) {
                    return true;
                } else {
                    return false;
                }
            }

            if (operator.equals(">")) {
                if (resExpr1 > resExpr2) {
                    return true;
                } else {
                    return false;
                }
            }

            if (operator.equals("<>")) {
                if (resExpr1 != resExpr2) {
                    return true;
                } else {
                    return false;
                }
            }

            if (operator.equals("==")) {
                if (resExpr1 == resExpr2) {
                    return true;
                } else {
                    return false;
                }
            }

            if (operator.equals("<=")) {
                if (resExpr1 <= resExpr2) {
                    return true;
                } else {
                    return false;
                }
            }

            if (operator.equals(">=")) {
                if (resExpr1 >= resExpr2) {
                    return true;
                } else {
                    return false;
                }
            }
        }

        return null;
    }
}
