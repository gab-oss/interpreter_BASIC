package instructions;

public class R_for implements Instruction {
    private ArtmExpr artmExpr;
    private R_instructions rInstructions;
    private IntAssignment intAsignment;

    public R_for(IntAssignment intAssignment, ArtmExpr artmExpr, R_instructions rInstructions) {

        this.intAsignment = intAssignment;
        this.artmExpr = artmExpr;
        this.rInstructions = rInstructions;
        System.out.println("For created");

    }

    @Override
    public Object execute(Interpreter interpreter) {

        int count = (Integer)artmExpr.execute(interpreter);

        interpreter.pushBlockContext();
        intAsignment.execute(interpreter);

        for(int i = (Integer)interpreter.getVar(intAsignment.getId()); i <= count; ++i) {
            rInstructions.execute(interpreter);
        }

        interpreter.popBlockContext();
        return null;
    }
}
