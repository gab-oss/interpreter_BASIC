package instructions;

import java.util.ArrayList;
import java.util.List;

public class Condition implements Instruction {

    private List<Comp> comps;
    private List<String> operators;


    public Condition(List<Comp> comps, List<String> operators) {

        this.comps = comps;
        this.operators = operators;
    }

    @Override
    public Object execute(Interpreter interpreter) {

        Boolean result = (Boolean) comps.get(0).execute(interpreter);
        for(int i = 1; i < comps.size(); ++i)
        {
            if(operators.get(i - 1).equals("OR"))
                result = result || (Boolean) comps.get(i).execute(interpreter);
            else
                result = result && (Boolean) comps.get(i).execute(interpreter);
        }
        return result;
    }
}
