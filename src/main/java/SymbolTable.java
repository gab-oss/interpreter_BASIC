import java.util.ArrayList;
import java.util.List;

public class SymbolTable {
    private List<Variable> variables;
    private List<CallableObj> callables;

    public SymbolTable() {
        this.variables = new ArrayList<Variable>();
        this.callables = new ArrayList<CallableObj>();
    }

    public void pushVariable(Variable variable){
        variables.add(variable);
    };

    public Variable lookupVariable(String name){
        for (Variable v: variables){
            if (v.getName() == name) {
                return v;
            }
        }
        return null;
    };

    public void popVariable(String name){};
    public void popCallable(String name){};

    public void pushCallable(CallableObj callable){};
    public void lookupCallable(String name){};

    public void printVariableStack(){
        for (Variable v: variables){
            System.out.println(v.getName());
        }
    }
}
