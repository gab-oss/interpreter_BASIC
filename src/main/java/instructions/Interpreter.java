package instructions;

import java.util.*;

public class Interpreter implements Instruction{
    private Map<String, Object> globals;
    private Set<Callable> callables;
    private Stack<List<Map<String, Object>>> vars;

    private List<Instruction> instructions;

    public Interpreter() {
        globals = new HashMap<String, Object>();
        callables = new HashSet<Callable>();
        vars = new Stack<List<Map<String, Object>>>();
        List<Map<String, Object>> globalContext = new LinkedList<Map<String, Object>>();
        globalContext.add(globals);
        vars.push(globalContext);
        instructions = new LinkedList();
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
        //    if(var.containsKey(id) && var.get(id).getClass().equals(value.getClass()))
            if(var.containsKey(id))
            {
                var.put(id, value);
                return true;
            }
        }
        return false;
    }

    void pushCallableContext()
    {
        vars.push(new LinkedList<Map<String, Object>>());
    }

    void popCallableContext()
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
    public Object execute(Interpreter interpreter) {
        if(instructions.isEmpty()) {
            System.out.println("EMPTY");
        }
        for (Instruction instruction:instructions) {
            System.out.println( "EXECUTING" + instruction.toString());

            instruction.execute(this);
        }
        return null;
    }

    public void pushInstruction(Instruction i)
    {
        instructions.add(i);
    }

    public Boolean pushCallable(Callable c)
    {
        System.out.println("PUSHED CALLABLE");
        return callables.add(c);
    }

    public Callable getCallable(String id)
    {
        for (Callable func: callables) {
            if(id.equals(func.getId()))
                return func;
        }
        return null;
    }
}
