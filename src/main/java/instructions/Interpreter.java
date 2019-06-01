package instructions;

import java.util.*;

public class Interpreter implements Instruction{
    private Map<String, Object> globals = new HashMap<String, Object>();
    private Set<Callable> functions = new HashSet<Callable>();
    private Stack<List<Map<String, Object>>> vars = new Stack<List<Map<String, Object>>>();

    private List<Instruction> instructions = new LinkedList();

    public Interpreter() {
        globals = new HashMap<String, Object>();
        functions = new HashSet<Callable>();
        vars = new Stack<List<Map<String, Object>>>();
        List<Map<String, Object>> globalContext = new LinkedList<Map<String, Object>>();
        globalContext.add(globals);
        vars.push(globalContext);
    }

    void putVar(String id, Object value) {
        vars.peek().get(vars.peek().size() - 1).put(id, value); //do ostatniej mapy listy z wierzchu stosu
    }

    Object getVar(String id) {
        for (Map<String, Object> var:vars.peek()) //szukaj w liscie z wierzchu stosu mapy, ktora zawiera zmienną
            if(var.containsKey(id))
                return var.get(id); //zwróc wartość zmiennej

        return null;
    }

    boolean replaceVar(String id, Object value)
    {
        for (Map<String, Object> var:vars.peek()) {
            if(var.containsKey(id) && var.get(id).getClass().equals(value.getClass()))
            {
                var.put(id, value);
                return true;
            }
        }
        return false;
    }

    void pushFunctionContext()
    {
        vars.push(new LinkedList<Map<String, Object>>());
    }

    void popFunctionContext()
    {
        vars.pop();
    }

    void pushBlockContext()
    {
        vars.peek().add(new HashMap<String, Object>());
    }

    void popBlockContext()
    {
        vars.peek().remove(vars.peek().size() - 1);
    }

    @Override
    public Object execute(Object interpreter) {
        for (Instruction instruction:instructions) {
            instruction.execute(this);
        }
        return null;
    }

    public void pushInstruction(Instruction i)
    {
        instructions.add(i);
    }

    public Boolean pushFunction(Callable f)
    {
        return functions.add(f);
    }

    public Callable getFunction(String id)
    {
        for (Callable func:functions) {
            if(id.equals(func.getId()))
                return func;
        }
        return null;
    }
}
