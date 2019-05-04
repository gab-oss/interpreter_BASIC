package instructions;

import java.util.ArrayList;
import java.util.List;

public class Condition implements Instruction {

    private List<Comp> comps;
    private List<String> operators;

    public Condition(Comp comp) {

        comps = new ArrayList<Comp>();
        comps.add(comp);
        operators = null;
    }

    public Condition(List<Comp> comps, List<String> operators) {

        this.comps = comps;
        this.operators = operators;
    }

    @Override
    public Object execute(Object object) {
        return null;
    }
}
