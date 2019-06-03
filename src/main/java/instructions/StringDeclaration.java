package instructions;

import java.util.List;

public class StringDeclaration implements Instruction {
    private List<String> ids;
    private List<ArtmExpr> artmExprs;

    public StringDeclaration(List<String> ids) {

        this.ids = ids;

        System.out.println("StringDeclaration created");

    }

    @Override
    public Object execute(Interpreter interpreter) {

        for (int i = 0; i < ids.size(); ++i) {
            interpreter.putVar(ids.get(i), null);
        }
        return null;
    }
}
