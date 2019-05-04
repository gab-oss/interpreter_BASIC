package instructions;

import java.util.List;

public class StringDeclaration implements Instruction {
    private final List<SubstringOrDecl> decls;

    public StringDeclaration(List<SubstringOrDecl> decls) {
        
        this.decls = decls;
    }

    @Override
    public Object execute(Object object) {
        return null;
    }
}
