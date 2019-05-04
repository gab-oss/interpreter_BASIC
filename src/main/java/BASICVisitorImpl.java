import instructions.*;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class BASICVisitorImpl extends BasicBaseVisitor<Instruction>{

//    intDefinition         : LET intAssignment (COMMA intAssignment)* ;

    @Override
    public IntDefinition visitIntDefinition(BasicParser.IntDefinitionContext ctx) {

        List<IntAssignment> defs = new ArrayList<IntAssignment>();

        int i = 0;
        defs.add(visitIntAssignment(ctx.intAssignment(i++)));

        for (TerminalNode n: ctx.COMMA()) {
            defs.add(visitIntAssignment(ctx.intAssignment(i++)));
        }

        return new IntDefinition(defs);
    }
//
//    stringDeclaration     : DIM substringOrDecl (COMMA substringOrDecl)* ;

    @Override
    public StringDeclaration visitStringDeclaration(BasicParser.StringDeclarationContext ctx) {

        List<SubstringOrDecl> decls = new ArrayList<SubstringOrDecl>();

        int i = 0;
        decls.add(visitSubstringOrDecl(ctx.substringOrDecl(i++)));

        for (TerminalNode n: ctx.COMMA()) {
            decls.add(visitSubstringOrDecl(ctx.substringOrDecl(i++)));
        }

        return new StringDeclaration(decls);
    }

//    intAssignment         : ID ASSIGN artmExpr;

    @Override
    public IntAssignment visitIntAssignment(BasicParser.IntAssignmentContext ctx) {

        return new IntAssignment(ctx.ID().toString(), visitArtmExpr(ctx.artmExpr()));
    }

//    len                   : LEN  LEFT_PARENTHESES (stringArg | funSignature) RIGHT_PARENTHESES;

    @Override
    public Len visitLen(BasicParser.LenContext ctx) {

        if (ctx.stringArg() != null) {
            return new Len(visitStringArg(ctx.stringArg()));
        } else {
            // TODO - find and check
            return null;
        }
    }

//    input                 : INPUT ID (COMMA ID)* ;

    @Override public Input visitInput(BasicParser.InputContext ctx) {

        List<String> ids = new ArrayList<String>();

        for (TerminalNode n: ctx.ID()) {
            ids.add(n.toString());
        }

        return new Input(ids);
    }

//    read                  : READ STRING_ID (COMMA STRING_ID)* ;

    @Override
    public Read visitRead(BasicParser.ReadContext ctx) {

        List<String> vars = new ArrayList<String>();

        for (TerminalNode n: ctx.STRING_ID()){
            vars.add(n.toString());
        }

        return new Read(vars);
    }


//  stringArg : STRING | STRING_ID | substringOrDecl ;

    @Override
    public StringArg visitStringArg(BasicParser.StringArgContext ctx) {

        if (ctx.STRING() != null) {
            return new StringArg(ctx.STRING().toString());
        } else if (ctx.STRING_ID() != null) {
            // TODO - find and check
            return null;
        } else {
            // TODO - find and check
            return null;
        }
    }

//    condition             : comp (LOG_OPERATOR comp)* ;

    @Override
    public Condition visitCondition(BasicParser.ConditionContext ctx) {
        Condition condition = new Condition(visitComp(ctx.comp(0)));

        if (ctx.LOG_OPERATOR().isEmpty())
            return condition;

        List<String> operators = new ArrayList<String>();
        List<Comp> comps = new ArrayList<Comp>();

        int i = 1;

        for (TerminalNode operator : ctx.LOG_OPERATOR()) {
            operators.add(operator.toString());
            comps.add(visitComp(ctx.comp(i++)));
        }

        return new Condition(comps, operators);
    }

//    comp                  : logTerm (COMP_OPERATOR logTerm)* ;

    @Override
    public Comp visitComp(BasicParser.CompContext ctx) {

        LogTerm term1 = visitLogTerm(ctx.logTerm(0));

        if (ctx.COMP_OPERATOR().isEmpty()) {
            return new Comp(term1);
        }

        LogTerm term2 = visitLogTerm(ctx.logTerm(1));

        // TODO - throw out the 0
        return new Comp(term1, term2, ctx.COMP_OPERATOR(0).toString());
    }

//    logTerm               : artmExpr | ( LEFT_PARENTHESES condition RIGHT_PARENTHESES ) ;

    @Override
    public LogTerm visitLogTerm(BasicParser.LogTermContext ctx) {

        if (ctx.artmExpr() != null) {
            return new LogTerm(ctx.artmExpr().toString());
        } else {
            //  TODO - get result
            return null;
        }
    }

    // term : NUMBER | ID | funSignature | len | ( LEFT_PARENTHESES artmExpr RIGHT_PARENTHESES ) ;

    @Override
    public Term visitTerm(BasicParser.TermContext ctx) {

        if (ctx.NUMBER() != null) {
            return new Term(ctx.NUMBER().toString());
        } else if (ctx.ID() != null) {
            // TODO - find ID in the symbol table
            return null;
        } else if (ctx.funSignature() != null) {
            // TODO - find and check
            return null;
        } else if (ctx.len() != null) {
            // TODO - get result
            return null;
        } else {
            // TODO - get result
            return null;
        }

    }

    @Override
    public MultExpression visitMultExpression (BasicParser.MultExpressionContext ctx) {

        return new MultExpression(visitTerm(ctx.term()), ctx.MINUS() != null);

    }

    @Override
    public AdditiveExpr visitAdditiveExpr(BasicParser.AdditiveExprContext ctx) {

        AdditiveExpr additiveExpr = new AdditiveExpr(visitMultExpression(ctx.multExpression(0)));
        if (ctx.MULTI_OPERATOR().isEmpty())
            return additiveExpr;

        int i = 1;
        for (TerminalNode operator : ctx.MULTI_OPERATOR()) {
            if (operator.toString().equals("*"))
                additiveExpr.multMultExpression(visitMultExpression(ctx.multExpression(i++)));
            else
                additiveExpr.divMultExpression(visitMultExpression(ctx.multExpression(i++)));
        }
        return additiveExpr;
    }


    @Override
    public ArtmExpr visitArtmExpr(BasicParser.ArtmExprContext ctx) {

        ArtmExpr artmExpr = new ArtmExpr(visitAdditiveExpr(ctx.additiveExpr(0)));
        if (ctx.ADD_OPERATOR().isEmpty())
            return artmExpr;

        int i = 1;
        for (TerminalNode operator : ctx.ADD_OPERATOR()) {
            if (operator.toString().equals("+"))
                artmExpr.addAdditiveExpr(visitAdditiveExpr(ctx.additiveExpr(i++)));
            else
                artmExpr.subAdditiveExpr(visitAdditiveExpr(ctx.additiveExpr(i++)));
        }
        return artmExpr;
    }

    // TODO - remove

    @Override
    public CallArg visitCallArg(BasicParser.CallArgContext ctx) {

        return new CallArg(visitArtmExpr(ctx.artmExpr()));
    }

    @Override
    public SubstringOrDecl visitSubstringOrDecl(BasicParser.SubstringOrDeclContext ctx) {
        String stringId = ctx.STRING_ID().toString();
        CallArg callArg = visitCallArg(ctx.callArg());

        return new SubstringOrDecl(stringId, callArg);
    }


}
