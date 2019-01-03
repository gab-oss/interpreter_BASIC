public class BasicVisitorImpl extends BasicBaseVisitor<Object>{

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    private SymbolTable symbolTable;

    public BasicVisitorImpl(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    @Override public Variable visitIntAssignment(BasicParser.IntAssignmentContext ctx) {
        visitChildren(ctx);
        String id = ctx.ID().toString();
        Variable v = new IntVar(id);
        symbolTable.pushVariable(v);
        return v;
    }
}
