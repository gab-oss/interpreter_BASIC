package instructions;

import org.antlr.v4.runtime.tree.TerminalNode;

public class StringArg  implements Instruction {

    private Substring substring;
    private TerminalNode stringId;
    private String value;

    public StringArg(String value) {
        this.value = value;
    }

    public StringArg(TerminalNode stringId) {

        this.stringId = stringId;

    }

    public StringArg(Substring substring) {

        this.substring = substring;

    }

    @Override
    public Object execute(Interpreter interpreter) {

        if (substring != null) {
            return substring.execute(interpreter);
        }
        if (stringId != null) {
            String s = (String)interpreter.getVar(stringId.toString());
            if (s == null) {
                throw new RuntimeException("String not declared");
            } else {
                return s;
            }

        }
        if(value != null) {
            return value;
        }
        return null;
    }
}
