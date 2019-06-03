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
	 * Enter a parse tree produced by {@link BasicParser#r_instructions}.
	 * @param ctx the parse tree
	 */
	void enterR_instructions(BasicParser.R_instructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#r_instructions}.
	 * @param ctx the parse tree
	 */
	void exitR_instructions(BasicParser.R_instructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#r_instruction}.
	 * @param ctx the parse tree
	 */
	void enterR_instruction(BasicParser.R_instructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#r_instruction}.
	 * @param ctx the parse tree
	 */
	void exitR_instruction(BasicParser.R_instructionContext ctx);
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
	 * Enter a parse tree produced by {@link BasicParser#funCall}.
	 * @param ctx the parse tree
	 */
	void enterFunCall(BasicParser.FunCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#funCall}.
	 * @param ctx the parse tree
	 */
	void exitFunCall(BasicParser.FunCallContext ctx);
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
	 * Enter a parse tree produced by {@link BasicParser#substring}.
	 * @param ctx the parse tree
	 */
	void enterSubstring(BasicParser.SubstringContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#substring}.
	 * @param ctx the parse tree
	 */
	void exitSubstring(BasicParser.SubstringContext ctx);
}