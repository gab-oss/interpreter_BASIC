package instructions;

public class StringAssignment implements Instruction {
    private String stringId;
    private Substring substring;
    private StringArg stringArg;
    private FunCall funCall;

    public StringAssignment(String stringId, Substring substring, StringArg stringArg, FunCall funCall) {

        this.stringId = stringId;
        this.substring = substring;

        this.stringArg = stringArg;
        this.funCall = funCall;

        System.out.println("StringAssignment created");

    }

    @Override
    public Object execute(Interpreter interpreter) {

        if(stringId != null) {
            if (stringArg != null) {
                if (!interpreter.replaceVar(stringId, stringArg.execute(interpreter)))
                    throw new RuntimeException("String not declared");
            } else {
                if(!interpreter.replaceVar(stringId, funCall.execute(interpreter)))
                    throw new RuntimeException("String not declared");;
            }
        } else if (substring != null) {
            String subbstringId = substring.getStringId();
            String s = (String)interpreter.getVar(subbstringId);

            if (s == null) {
                throw new RuntimeException("Substring doesn't belong to any declared string");
            }

            int beginIndex = substring.getBeginIndex(interpreter);

            if (stringArg != null) {
                s = s.substring(0, beginIndex - 1) + stringArg.execute(interpreter);

                if(!interpreter.replaceVar(stringId, s))
                    throw new RuntimeException("String not declared");

            } else {
                s = s.substring(0, beginIndex - 1) + funCall.execute(interpreter);

                if(!interpreter.replaceVar(stringId, s))
                    throw new RuntimeException("String not declared");
            }
        }
        return null;
    }
}
