import java.util.List;

public class FunctionObj extends CallableObj {
    private boolean returnsInt;


    public FunctionObj(boolean returnsInt) {
        this.returnsInt = returnsInt;
    }

    public FunctionObj(String name, boolean returnsInt) {
        super(name);
        this.returnsInt = returnsInt;
    }

    public FunctionObj(String name, BasicParser.ProcedureContext ctx, boolean returnsInt) {
        super(name, ctx);
        this.returnsInt = returnsInt;
    }

    public FunctionObj(String name, BasicParser.ProcedureContext ctx, List<Variable> arguments, boolean returnsInt) {
        super(name, ctx, arguments);
        this.returnsInt = returnsInt;
    }

    public boolean isReturnsInt() {
        return returnsInt;
    }
}
