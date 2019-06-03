package instructions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunCall implements Instruction {

    private String id;
    private List<Arg> args;

    public FunCall(String id) {

        this.id = id;
        this.args = null;
        System.out.println("FunCall created without arguments");

    }

    public FunCall(String id, List<Arg> args) {

        this.id = id;
        this.args = args;
        System.out.println("FunCall created with arguments");

    }



    @Override
    public Object execute(Interpreter interpreter) {

        Map<String, Object> argumentValues = new HashMap<String, Object>();

//        interpreter.pushCallableContext();
//        interpreter.pushBlockContext();

        Callable c = interpreter.getCallable(id);
        if(c == null)
            throw new RuntimeException("Callable does not exist");

        if(args.size() != c.getArgs().size())
            throw new RuntimeException("Wrong number of parameters");

        int i = -1;
        for (String argName : c.getArgs()) {
            i++;
            //sprawdz zgodnosc typow argumentow
            if ((args.get(i).isString() && argName.charAt(argName.length() - 1) == '$')
                || (!args.get(i).isString() && argName.charAt(argName.length() - 1) != '$'))
                    argumentValues.put(argName, args.get(i).execute(interpreter));
//                interpreter.putVar(argName, args.get(i).execute(interpreter));
            else
                throw new RuntimeException("Wrong function parameters");
        }
//
//        Object value = null;
//
//        if (c.getClass().equals(Procedure.class)) {
//            for (Instruction ins: c.getInstructions().getInstructions()) {
//                ins.execute(interpreter);
//            }
//            return null;
//        }
//
//        for (Instruction ins: c.getInstructions().getInstructions()) {
//            if(IntReturn.class.equals(ins.getClass())){
//                value = ins.execute(interpreter);
//                break;
//            } else if (StringReturn.class.equals(interpreter)) {
//                value = ins.execute(interpreter);
//                break;
//            } else
//                ins.execute(interpreter);
//        }

        interpreter.pushCallableContext();
        interpreter.pushBlockContext();

        for (String argName:  c.getArgs()){
            interpreter.putVar(argName, argumentValues.get(argName));
        }

        for (Instruction ins: c.getInstructions().getInstructions()) {
            ins.execute(interpreter);
        }

        Object value = null;
        if (c.getClass().equals(StringFunction.class)) {
            value = ((StringFunction)c).getStringReturn().execute(interpreter);
        } else if (c.getClass().equals(IntFunction.class)) {
            value = ((IntFunction)c).getIntReturn().execute(interpreter);
        }


        interpreter.popCallableContext();
        return value;
    }
}
