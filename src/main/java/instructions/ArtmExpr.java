package instructions;

import java.util.List;

public class ArtmExpr implements Instruction {

    private List<AdditiveExpr> toAdd;
    private List<AdditiveExpr> toSub;

    public ArtmExpr(List<AdditiveExpr> toAdd, List<AdditiveExpr> toSub) {

        this.toAdd = toAdd;
        this.toSub = toSub;
        System.out.println("ArtmExpr created");
    }

    @Override
    public Object execute(Interpreter interpreter) {

        int result = 0;

        for (AdditiveExpr a: toAdd) {
            result += (Integer)a.execute(interpreter);
        }

        for (AdditiveExpr s: toSub) {
            result -= (Integer)s.execute(interpreter);
        }
        return result;
    }

}
