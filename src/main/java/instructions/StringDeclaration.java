package instructions;

import java.util.List;

public class StringDeclaration implements Instruction {
    private List<String> ids;
    private List<ArtmExpr> artmExprs;

    public StringDeclaration(List<String> ids, List<ArtmExpr> artmExprs) {

        this.ids = ids;
        this.artmExprs = artmExprs;

        System.out.println("StringDeclaration created");

    }

    @Override
    public Object execute(Object object) {
        return null;
    }
}
