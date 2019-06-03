package instructions;

public class Substring implements Instruction {
    private ArtmExpr artmExpr;
    private String stringId;

    public Substring(String id, ArtmExpr artmExpr) {

        this.stringId = id;
        this.artmExpr = artmExpr;

        System.out.println("Substring created");

    }

    @Override
    public Object execute(Interpreter interpreter) {

        String s = (String)interpreter.getVar(stringId);

        if (s != null) {
            return '"' + s.substring((Integer) artmExpr.execute(interpreter));

        } else {
            System.out.println("String " + stringId + " doesn't exist");
            return null;
        }
    }

    public String getStringId() {
        return stringId;
    }

    public int getBeginIndex(Interpreter interpreter) {
        return (Integer)artmExpr.execute(interpreter);
    }
}
