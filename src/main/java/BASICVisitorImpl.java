import instructions.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class BASICVisitorImpl extends BasicBaseVisitor<Instruction> {

//    program               : (stringFunction | intFunction | procedure)* BEGIN NL r_instructions END NL ;
//

    @Override
    public Interpreter visitProgram(BasicParser.ProgramContext ctx) {
        System.out.println("PROGRAM");

        Interpreter interpreter = new Interpreter();

        for (ParseTree child:ctx.children) {
            Instruction visited = visit(child);
            if (visited != null) {
                interpreter.pushInstruction(visited);
            }
        }

        return interpreter;
    }




//        List<StringFunction> stringFunctions = new ArrayList<StringFunction>();
//        List<IntFunction> intFunctions = new ArrayList<IntFunction>();
//        List<Procedure> procedures = new ArrayList<Procedure>();
//        R_instructions rInstructions;
//
//        for (BasicParser.StringFunctionContext strCtx: ctx.stringFunction()) {
//            stringFunctions.add(visitStringFunction(strCtx));
//        }
//
//        for (BasicParser.IntFunctionContext intCtx: ctx.intFunction()) {
//            intFunctions.add(visitIntFunction(intCtx));
//        }
//
//        for (BasicParser.ProcedureContext procCtx: ctx.procedure()) {
//            procedures.add(visitProcedure(procCtx));
//        }
//
//        rInstructions = visitR_instructions(ctx.r_instructions());
//
//        return new Program(stringFunctions, intFunctions, procedures, rInstructions);



//    intFunction           : INT_FUN ID LEFT_BRACKET ((ID | STRING_ID) (COMMA (ID | STRING_ID))*)? RIGHT_BRACKET NL
//    r_instructions
//    intReturn NL;

    @Override
    public IntFunction visitIntFunction(BasicParser.IntFunctionContext ctx) {



        String id = null;
        List<String> args = new ArrayList<String>();
        R_instructions rInstructions = visitR_instructions(ctx.r_instructions());
        IntReturn intReturn = visitIntReturn(ctx.intReturn());

        int i = 0;
        for(TerminalNode n: ctx.ID()) {
            if (i == 0) {
                id = n.toString();
            } else {
                args.add(n.toString());
            }
            ++i;
        }

        for(TerminalNode n: ctx.STRING_ID()) {
            args.add(n.toString());
        }

        return new IntFunction(id, args, rInstructions, intReturn);
    }


//    stringFunction        : STRING_FUN ID LEFT_BRACKET ((ID | STRING_ID) (COMMA (ID | STRING_ID))*)? RIGHT_BRACKET NL
                        //    r_instructions
                        //    stringReturn NL ;

    @Override
    public StringFunction visitStringFunction(BasicParser.StringFunctionContext ctx) {

        String id = null;

        List<String> args = new ArrayList<String>();
        R_instructions rInstructions = visitR_instructions(ctx.r_instructions());
        StringReturn stringReturn = visitStringReturn(ctx.stringReturn());

        int i = 0;
        for(TerminalNode n: ctx.ID()) {
            if (i == 0) {
                id = n.toString();
            } else {
                args.add(n.toString());
            }
            ++i;
        }

        for(TerminalNode n: ctx.STRING_ID()) {
            args.add(n.toString());
        }

        return new StringFunction(id, args, rInstructions, stringReturn);
    }

    //
//    procedure             : SUB ID LEFT_BRACKET ((ID | STRING_ID) (COMMA (ID | STRING_ID))*)? RIGHT_BRACKET NL
                        //    r_instructions
                        //    RETURN NL ;
    @Override
    public Procedure visitProcedure(BasicParser.ProcedureContext ctx) {

        String id = null;

        List<String> args = new ArrayList<String>();
        R_instructions rInstructions = visitR_instructions(ctx.r_instructions());

        int i = 0;
        for(TerminalNode n: ctx.ID()) {
            if (i == 0) {
                id = n.toString();
            } else {
                args.add(n.toString());
            }
            ++i;
        }

        for(TerminalNode n: ctx.STRING_ID()) {
            args.add(n.toString());
        }

        return new Procedure(id, args, rInstructions);

    }

//
//    r_for                 : FOR intAssignment TO artmExpr NL
                //            r_instructions
                        //    NEXT ID ;


    @Override
    public R_for visitR_for(BasicParser.R_forContext ctx) {

        IntAssignment intAssignment = visitIntAssignment(ctx.intAssignment());
        ArtmExpr artmExpr = visitArtmExpr(ctx.artmExpr());
        R_instructions rInstructions = visitR_instructions(ctx.r_instructions());
        return new R_for(intAssignment, artmExpr, rInstructions);
    }


//    r_if                  : IF condition THEN NL
                        //    r_instructions
                        //            ((ELSIF condition THEN NL
                        //                    r_instructions)*
                        //    ELSE NL
                        //    r_instructions)?
                        //    ENDIF ;
    @Override
    public R_if visitR_if(BasicParser.R_ifContext ctx) {

//        List<Condition> conditions = new ArrayList<Condition>();
//        List<R_instructions> rinstructions = new ArrayList<R_instructions>();
//
//        for (BasicParser.ConditionContext condContext: ctx.condition()) {
//
//            conditions.add(visitCondition(condContext));
//        }
//
//        for (BasicParser.R_instructionsContext riContext: ctx.r_instructions()) {
//
//            rinstructions.add(visitR_instructions(riContext));
//        }
//
//        return new R_if(conditions, rinstructions);

        Condition condition = visitCondition(ctx.condition());
        R_instructions rInstructions = visitR_instructions(ctx.r_instructions());

        return new R_if(condition, rInstructions);

    }

// stringReturn          : RETURN (stringArg | funCall) ;

    @Override
    public StringReturn visitStringReturn(BasicParser.StringReturnContext ctx) {

        StringArg stringArg = ctx.stringArg() == null ? null : visitStringArg(ctx.stringArg());
        FunCall funCall = ctx.funCall() == null ? null : visitFunCall(ctx.funCall());

        return new StringReturn(stringArg, funCall);
    }


// intReturn             : RETURN artmExpr ;

    @Override
    public IntReturn visitIntReturn(BasicParser.IntReturnContext ctx) {

        return new IntReturn(visitArtmExpr(ctx.artmExpr()));
    }

//stringReturn          : RETURN (stringArg | funCall) ;



// r_instructions          : (r_instruction NL)+ ;

    @Override
    public R_instructions visitR_instructions(BasicParser.R_instructionsContext ctx) {

        List<Instruction> instructions = new ArrayList<Instruction>();

        for (ParseTree child:ctx.children) {

            Instruction visited = visit(child);
            if (visited != null) {
                instructions.add(visited);

            }
        }

        return new R_instructions(instructions);
    }

// r_instruction           : intDefinition | stringDeclaration | intAssignment | stringAssignment | input | print
//                      | read | funCall | r_if | r_for ;

    @Override
    public R_instruction visitR_instruction(BasicParser.R_instructionContext ctx) {

        Instruction instruction = visit(ctx.getChild(0));

        return new R_instruction(instruction);
    }

// stringAssignment      : (STRING_ID | substring) ASSIGN (stringArg | funCall) ;

    @Override
    public StringAssignment visitStringAssignment(BasicParser.StringAssignmentContext ctx) {

        String stringId = ctx.STRING_ID() == null ? null : ctx.STRING_ID().toString();
        Substring substring = ctx.substring() == null ? null : visitSubstring(ctx.substring());
        StringArg stringArg = ctx.stringArg() == null ? null : visitStringArg(ctx.stringArg());
        FunCall funCall = ctx.funCall() == null ? null : visitFunCall(ctx.funCall());

        return new StringAssignment(stringId, substring, stringArg, funCall);
    }

// substring             : STRING_ID LEFT_PARENTHESES artmExpr RIGHT_PARENTHESES ;

    @Override
    public Substring visitSubstring(BasicParser.SubstringContext ctx) {

        return new Substring(ctx.STRING_ID().toString(), visitArtmExpr(ctx.artmExpr()));
    }



// print                 : PRINT arg (SEMICOLON arg)* SEMICOLON? ;

    @Override
    public Print visitPrint(BasicParser.PrintContext ctx) {

        List<Arg> args = new ArrayList<Arg>();

//        int i = 0;
//        args.add(visitArg(ctx.arg(i++)));

        for (BasicParser.ArgContext argCtx: ctx.arg()) {
            args.add(visitArg(argCtx));
        }

        return new Print(args);
    }


// arg                   : artmExpr | stringArg;
    @Override
    public Arg visitArg(BasicParser.ArgContext ctx) {

        if (ctx.stringArg() != null) {
            return new Arg(visitStringArg(ctx.stringArg()));
        } else {
            return new Arg(visitArtmExpr(ctx.artmExpr()));
        }
}

// funCall               : ID LEFT_BRACKET ((arg COMMA)* arg)? RIGHT_BRACKET ;

    @Override
    public FunCall visitFunCall(BasicParser.FunCallContext ctx) {

        String id = ctx.ID().toString();
        List<Arg> args = new ArrayList<Arg>();

        if (ctx.arg() == null){
            return new FunCall(id);
        } else {

            for (BasicParser.ArgContext argCtx: ctx.arg()) {
                args.add(visitArg(argCtx));
            }

            return new FunCall(id, args);
        }
    }

// intDefinition         : LET intAssignment (COMMA intAssignment)* ;

    @Override
    public IntDefinition visitIntDefinition(BasicParser.IntDefinitionContext ctx) {

        List<IntAssignment> defs = new ArrayList<IntAssignment>();

        for (BasicParser.IntAssignmentContext iaCtx: ctx.intAssignment()) {
            defs.add(visitIntAssignment(iaCtx));
        }

        return new IntDefinition(defs);
    }

// stringDeclaration     : DIM STRING_ID LEFT_PARENTHESES artmExpr RIGHT_PARENTHESES (COMMA STRING_ID LEFT_PARENTHESES artmExpr RIGHT_PARENTHESES)* ;

    @Override
    public StringDeclaration visitStringDeclaration(BasicParser.StringDeclarationContext ctx) {

        List<String> ids = new ArrayList<String>();

        for (TerminalNode s: ctx.STRING_ID()) {
            ids.add(s.toString());
        }

        return new StringDeclaration(ids);
    }

// intAssignment         : ID ASSIGN artmExpr;

    @Override
    public IntAssignment visitIntAssignment(BasicParser.IntAssignmentContext ctx) {

        return new IntAssignment(ctx.ID().toString(), visitArtmExpr(ctx.artmExpr()));
    }

// len                   : LEN  LEFT_PARENTHESES (stringArg | funCall) RIGHT_PARENTHESES;

    @Override
    public Len visitLen(BasicParser.LenContext ctx) {

        if (ctx.stringArg() != null) {
            return new Len(visitStringArg(ctx.stringArg()));
        } else {
            return new Len(visitFunCall(ctx.funCall()));
        }
    }

// input                 : INPUT ID (COMMA ID)* ;

//    @Override public Input visitInput(BasicParser.InputContext ctx) {
//
//        List<String> ids = new ArrayList<String>();
//
//        for (TerminalNode n: ctx.ID()) {
//            ids.add(n.toString());
//        }
//
//        return new Input(ids);
//    }

// read                  : READ STRING_ID (COMMA STRING_ID)* ;

    @Override
    public Read visitRead(BasicParser.ReadContext ctx) {

        List<String> vars = new ArrayList<String>();

        int i = 1;
        vars.add(ctx.getChild(i).toString());
        for (TerminalNode n: ctx.COMMA()){
            ++i;
            vars.add(ctx.getChild(i).toString());
        }

        return new Read(vars);
    }


//  stringArg             : STRING | STRING_ID | substring ;

    @Override
    public StringArg visitStringArg(BasicParser.StringArgContext ctx) {

        if (ctx.STRING() != null) {
            return new StringArg(ctx.STRING().toString());
        } else if (ctx.STRING_ID() != null) {
            return new StringArg(ctx.STRING_ID());
        } else {
            return new StringArg(visitSubstring(ctx.substring()));
        }
    }

// condition             : comp (LOG_OPERATOR comp)* ;

    @Override
    public Condition visitCondition(BasicParser.ConditionContext ctx) {

        List<String> operators = new ArrayList<String>();
        List<Comp> comps = new ArrayList<Comp>();

        comps.add(visitComp(ctx.comp(0)));

        int i = 1;

        for (TerminalNode operator : ctx.LOG_OPERATOR()) {
            operators.add(operator.toString());
            comps.add(visitComp(ctx.comp(i++)));
        }

        return new Condition(comps, operators);
    }

// comp                  : artmExpr (COMP_OPERATOR artmExpr)* | ( LEFT_PARENTHESES condition RIGHT_PARENTHESES ) ;

    @Override
    public Comp visitComp(BasicParser.CompContext ctx) {

        if (ctx.condition() != null) {
            return new Comp(visitCondition(ctx.condition()));
        }

        ArtmExpr expr1 = visitArtmExpr(ctx.artmExpr(0));

        if (ctx.COMP_OPERATOR().isEmpty()) {
            return new Comp(expr1);
        }

        ArtmExpr expr2 = visitArtmExpr(ctx.artmExpr(1));

        return new Comp(expr1, expr2, ctx.COMP_OPERATOR(0).toString());
    }

//    logTerm               : artmExpr | ( LEFT_PARENTHESES condition RIGHT_PARENTHESES ) ;
//
//    @Override
//    public LogTerm visitLogTerm(BasicParser.LogTermContext ctx) {
//
//        if (ctx.artmExpr() != null) {
//            return new LogTerm(visitArtmExpr(ctx.artmExpr()));
//        } else {
//            return new LogTerm(visitCondition(ctx.condition()));
//        }
//    }

// term                  : NUMBER | ID | funCall | len | ( LEFT_PARENTHESES artmExpr RIGHT_PARENTHESES ) ;

    @Override
    public Term visitTerm(BasicParser.TermContext ctx) {

        if (ctx.NUMBER() != null) {
            return new Term(ctx.NUMBER().toString(), true);
        } else if (ctx.ID() != null) {
            return new Term(ctx.ID().toString(), false);
        } else if (ctx.funCall() != null) {
            return new Term(visitFunCall(ctx.funCall()));
        } else if (ctx.len() != null) {
            return new Term(visitLen(ctx.len()));
        } else {
            return new Term(visitArtmExpr(ctx.artmExpr()));
        }

    }

// multExpression        : MINUS? term ;

    @Override
    public MultExpression visitMultExpression (BasicParser.MultExpressionContext ctx) {

        boolean positive = "-".equals(ctx.getChild(0).toString())?false:true;
        return new MultExpression(visitTerm(ctx.term()), positive);

    }

// additiveExpr          : multExpression (MULTI_OPERATOR multExpression)* ;

    @Override
    public AdditiveExpr visitAdditiveExpr(BasicParser.AdditiveExprContext ctx) {

//        List<AdditiveExpr> toAdd = new ArrayList<AdditiveExpr>();
//        List<AdditiveExpr> toSub = new ArrayList<AdditiveExpr>();
//
//
//        int i = 0;
//
//        toAdd.add(visitAdditiveExpr(ctx.additiveExpr(i)));
//        for (TerminalNode operator : ctx.ADD_OPERATOR()) {
//            if (operator.getText() == "+")
//                toAdd.add(visitAdditiveExpr(ctx.additiveExpr(i++)));
//            else
//                toSub.add(visitAdditiveExpr(ctx.additiveExpr(i++)));
//        }
//
//        return new ArtmExpr(toAdd, toSub);

        List<MultExpression> multExpressions = new ArrayList<MultExpression>();
        List<TerminalNode> operators = new ArrayList<TerminalNode>();

        for (BasicParser.MultExpressionContext multExpressionContext: ctx.multExpression()) {
            multExpressions.add(visitMultExpression(multExpressionContext));
        }
//
//        AdditiveExpr additiveExpr = new AdditiveExpr(visitMultExpression(ctx.multExpression(0)));
//        if (ctx.MULTI_OPERATOR().isEmpty())
//            return additiveExpr;

//        int i = 1;
        for (TerminalNode operator : ctx.MULTI_OPERATOR()) {
            operators.add(operator);
        }

        return new AdditiveExpr(multExpressions, operators);
    }

// artmExpr              : additiveExpr ((PLUS | MINUS) additiveExpr)* ;

    @Override
    public ArtmExpr visitArtmExpr(BasicParser.ArtmExprContext ctx) {

        List<AdditiveExpr> toAdd = new ArrayList<AdditiveExpr>();
        List<AdditiveExpr> toSub = new ArrayList<AdditiveExpr>();


        int i = 0;

        toAdd.add(visitAdditiveExpr(ctx.additiveExpr(i)));
        for (TerminalNode operator : ctx.ADD_OPERATOR()) {
            ++i;
            if (operator.getText().charAt(0) == '-')
                toSub.add(visitAdditiveExpr(ctx.additiveExpr(i)));

            else
                toAdd.add(visitAdditiveExpr(ctx.additiveExpr(i)));
        }

        return new ArtmExpr(toAdd, toSub);
    }

}
