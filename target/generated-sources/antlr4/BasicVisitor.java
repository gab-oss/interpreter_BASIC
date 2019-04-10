// Generated from Basic.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BasicParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BasicVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BasicParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(BasicParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#predefined}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredefined(BasicParser.PredefinedContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#intFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntFunction(BasicParser.IntFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#stringFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringFunction(BasicParser.StringFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(BasicParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#r_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_for(BasicParser.R_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#r_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_if(BasicParser.R_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#procReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcReturn(BasicParser.ProcReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#intReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntReturn(BasicParser.IntReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#stringReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringReturn(BasicParser.StringReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructions(BasicParser.InstructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(BasicParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(BasicParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(BasicParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#logTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogTerm(BasicParser.LogTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#artmExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArtmExpr(BasicParser.ArtmExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#additiveExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(BasicParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#multExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpression(BasicParser.MultExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(BasicParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#intDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntDefinition(BasicParser.IntDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#stringDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringDeclaration(BasicParser.StringDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#intAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntAssignment(BasicParser.IntAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#stringAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAssignment(BasicParser.StringAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#len}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLen(BasicParser.LenContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(BasicParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(BasicParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(BasicParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#r_goto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_goto(BasicParser.R_gotoContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#gosub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGosub(BasicParser.GosubContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(BasicParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#funSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunSignature(BasicParser.FunSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#callArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallArgs(BasicParser.CallArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#callArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallArg(BasicParser.CallArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(BasicParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#stringArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringArg(BasicParser.StringArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#substringOrDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstringOrDecl(BasicParser.SubstringOrDeclContext ctx);
}