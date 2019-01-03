import java.util.List;

public class CallableObj {
    private String name;
    private BasicParser.ProcedureContext ctx;
    private List<Variable> arguments;


    public CallableObj() {
    }

    public CallableObj(String name) {
        this.name = name;
    }

    public CallableObj(String name, BasicParser.ProcedureContext ctx) {
        this.name = name;
        this.ctx = ctx;
    }

    public CallableObj(String name, BasicParser.ProcedureContext ctx, List<Variable> arguments) {
        this.name = name;
        this.ctx = ctx;
        this.arguments = arguments;
    }

    public BasicParser.ProcedureContext getCtx() {
        return ctx;
    }

    public void setCtx(BasicParser.ProcedureContext ctx) {
        this.ctx = ctx;
    }

    public List<Variable> getArguments() {
        return arguments;
    }

    public void setArguments(List<Variable> arguments) {
        this.arguments = arguments;
    }
}
