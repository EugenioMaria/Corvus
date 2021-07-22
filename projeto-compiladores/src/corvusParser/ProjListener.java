// Generated from C:/Users/Gabriel Agostini/IdeaProjects/projeto-compiladores-ufabc/projeto-compiladores\Proj.g4 by ANTLR 4.9.1
package corvusParser;

    import corvusDataStructures.corvusSymbol;
    import corvusDataStructures.corvusVariable;
    import corvusDataStructures.corvusSymbolTable;
    import corvusExceptions.corvusSemanticException;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProjParser}.
 */
public interface ProjListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProjParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ProjParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ProjParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(ProjParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(ProjParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(ProjParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(ProjParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ProjParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ProjParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(ProjParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(ProjParser.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(ProjParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(ProjParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(ProjParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(ProjParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(ProjParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(ProjParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(ProjParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(ProjParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ProjParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ProjParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpression(ProjParser.BoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpression(ProjParser.BoolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(ProjParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(ProjParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjParser#ifCMD}.
	 * @param ctx the parse tree
	 */
	void enterIfCMD(ProjParser.IfCMDContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjParser#ifCMD}.
	 * @param ctx the parse tree
	 */
	void exitIfCMD(ProjParser.IfCMDContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjParser#ifElseCMD}.
	 * @param ctx the parse tree
	 */
	void enterIfElseCMD(ProjParser.IfElseCMDContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjParser#ifElseCMD}.
	 * @param ctx the parse tree
	 */
	void exitIfElseCMD(ProjParser.IfElseCMDContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjParser#elseIfCMD}.
	 * @param ctx the parse tree
	 */
	void enterElseIfCMD(ProjParser.ElseIfCMDContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjParser#elseIfCMD}.
	 * @param ctx the parse tree
	 */
	void exitElseIfCMD(ProjParser.ElseIfCMDContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjParser#whileCMD}.
	 * @param ctx the parse tree
	 */
	void enterWhileCMD(ProjParser.WhileCMDContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjParser#whileCMD}.
	 * @param ctx the parse tree
	 */
	void exitWhileCMD(ProjParser.WhileCMDContext ctx);
}