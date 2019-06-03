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
            int beginIndex = (Integer) artmExpr.execute(interpreter);
            if (beginIndex == 0) {
                return s;
            } else {
                return s.substring(beginIndex);
            }


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
