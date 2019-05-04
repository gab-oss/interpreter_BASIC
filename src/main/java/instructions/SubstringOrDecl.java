package instructions;

public class SubstringOrDecl implements Instruction {

    String stringId;
    CallArg callArg;

    public SubstringOrDecl(String stringId, CallArg callArg) {

        this.stringId = stringId;
        this.callArg = callArg;
    }

    @Override
    public Object execute(Object object) {
        return null;
    }
}
