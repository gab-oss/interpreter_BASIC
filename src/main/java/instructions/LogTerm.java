package instructions;

public class LogTerm implements Instruction {

    ArtmExpr artmExpr;
    Condition condition;

    public LogTerm(ArtmExpr ae) {
        this.artmExpr = artmExpr;
        System.out.println("LogTerm created with ArtmExpr");

    }

    public LogTerm(Condition condition) {

        this.condition = condition;
        System.out.println("LogTerm created with Condition");

    }

    @Override
    public Object execute(Object object) {
        return null;
    }
}
