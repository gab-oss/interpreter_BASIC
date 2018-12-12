// Generated from Basic.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BasicParser}.
 */
public interface BasicListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BasicParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(BasicParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(BasicParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#predefined}.
	 * @param ctx the parse tree
	 */
	void enterPredefined(BasicParser.PredefinedContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#predefined}.
	 * @param ctx the parse tree
	 */
	void exitPredefined(BasicParser.PredefinedContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#intFunction}.
	 * @param ctx the parse tree
	 */
	void enterIntFunction(BasicParser.IntFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#intFunction}.
	 * @param ctx the parse tree
	 */
	void exitIntFunction(BasicParser.IntFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#stringFunction}.
	 * @param ctx the parse tree
	 */
	void enterStringFunction(BasicParser.StringFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#stringFunction}.
	 * @param ctx the parse tree
	 */
	void exitStringFunction(BasicParser.StringFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(BasicParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(BasicParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#r_for}.
	 * @param ctx the parse tree
	 */
	void enterR_for(BasicParser.R_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#r_for}.
	 * @param ctx the parse tree
	 */
	void exitR_for(BasicParser.R_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#r_if}.
	 * @param ctx the parse tree
	 */
	void enterR_if(BasicParser.R_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#r_if}.
	 * @param ctx the parse tree
	 */
	void exitR_if(BasicParser.R_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#procReturn}.
	 * @param ctx the parse tree
	 */
	void enterProcReturn(BasicParser.ProcReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#procReturn}.
	 * @param ctx the parse tree
	 */
	void exitProcReturn(BasicParser.ProcReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#funReturn}.
	 * @param ctx the parse tree
	 */
	void enterFunReturn(BasicParser.FunReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#funReturn}.
	 * @param ctx the parse tree
	 */
	void exitFunReturn(BasicParser.FunReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#intReturn}.
	 * @param ctx the parse tree
	 */
	void enterIntReturn(BasicParser.IntReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#intReturn}.
	 * @param ctx the parse tree
	 */
	void exitIntReturn(BasicParser.IntReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#stringReturn}.
	 * @param ctx the parse tree
	 */
	void enterStringReturn(BasicParser.StringReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#stringReturn}.
	 * @param ctx the parse tree
	 */
	void exitStringReturn(BasicParser.StringReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(BasicParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(BasicParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(BasicParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(BasicParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(BasicParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(BasicParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(BasicParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(BasicParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#logTerm}.
	 * @param ctx the parse tree
	 */
	void enterLogTerm(BasicParser.LogTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#logTerm}.
	 * @param ctx the parse tree
	 */
	void exitLogTerm(BasicParser.LogTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#artmExpr}.
	 * @param ctx the parse tree
	 */
	void enterArtmExpr(BasicParser.ArtmExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#artmExpr}.
	 * @param ctx the parse tree
	 */
	void exitArtmExpr(BasicParser.ArtmExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(BasicParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(BasicParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#multExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultExpression(BasicParser.MultExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#multExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultExpression(BasicParser.MultExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(BasicParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(BasicParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#intDefinition}.
	 * @param ctx the parse tree
	 */
	void enterIntDefinition(BasicParser.IntDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#intDefinition}.
	 * @param ctx the parse tree
	 */
	void exitIntDefinition(BasicParser.IntDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#stringDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStringDeclaration(BasicParser.StringDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#stringDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStringDeclaration(BasicParser.StringDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#intAssignment}.
	 * @param ctx the parse tree
	 */
	void enterIntAssignment(BasicParser.IntAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#intAssignment}.
	 * @param ctx the parse tree
	 */
	void exitIntAssignment(BasicParser.IntAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#stringAssignment}.
	 * @param ctx the parse tree
	 */
	void enterStringAssignment(BasicParser.StringAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#stringAssignment}.
	 * @param ctx the parse tree
	 */
	void exitStringAssignment(BasicParser.StringAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#len}.
	 * @param ctx the parse tree
	 */
	void enterLen(BasicParser.LenContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#len}.
	 * @param ctx the parse tree
	 */
	void exitLen(BasicParser.LenContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(BasicParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(BasicParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(BasicParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(BasicParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(BasicParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(BasicParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#r_goto}.
	 * @param ctx the parse tree
	 */
	void enterR_goto(BasicParser.R_gotoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#r_goto}.
	 * @param ctx the parse tree
	 */
	void exitR_goto(BasicParser.R_gotoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#gosub}.
	 * @param ctx the parse tree
	 */
	void enterGosub(BasicParser.GosubContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#gosub}.
	 * @param ctx the parse tree
	 */
	void exitGosub(BasicParser.GosubContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(BasicParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(BasicParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#funSignature}.
	 * @param ctx the parse tree
	 */
	void enterFunSignature(BasicParser.FunSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#funSignature}.
	 * @param ctx the parse tree
	 */
	void exitFunSignature(BasicParser.FunSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#callArgs}.
	 * @param ctx the parse tree
	 */
	void enterCallArgs(BasicParser.CallArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#callArgs}.
	 * @param ctx the parse tree
	 */
	void exitCallArgs(BasicParser.CallArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#callArg}.
	 * @param ctx the parse tree
	 */
	void enterCallArg(BasicParser.CallArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#callArg}.
	 * @param ctx the parse tree
	 */
	void exitCallArg(BasicParser.CallArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(BasicParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(BasicParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#intArg}.
	 * @param ctx the parse tree
	 */
	void enterIntArg(BasicParser.IntArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#intArg}.
	 * @param ctx the parse tree
	 */
	void exitIntArg(BasicParser.IntArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#stringArg}.
	 * @param ctx the parse tree
	 */
	void enterStringArg(BasicParser.StringArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#stringArg}.
	 * @param ctx the parse tree
	 */
	void exitStringArg(BasicParser.StringArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#substringOrDecl}.
	 * @param ctx the parse tree
	 */
	void enterSubstringOrDecl(BasicParser.SubstringOrDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#substringOrDecl}.
	 * @param ctx the parse tree
	 */
	void exitSubstringOrDecl(BasicParser.SubstringOrDeclContext ctx);
}