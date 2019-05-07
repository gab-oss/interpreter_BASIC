package instructions;

public class ArtmExpr implements Instruction {

    private AdditiveExpr additiveExpr;

    public ArtmExpr(AdditiveExpr additiveExpr) {

        this.additiveExpr = additiveExpr;
        System.out.println("ArtmExpr created");
    }

    @Override
    public Object execute(Object object) {
        return null;
    }

    public void addAdditiveExpr(Instruction instruction) {
    }

    public void subAdditiveExpr(Instruction instruction) {
    }
}
