// Generated from C:/Users/Gabriel Agostini/IdeaProjects/projeto-compiladores-ufabc/projeto-compiladores\Proj.g4 by ANTLR 4.9.1
package corvusParser;

    import corvusDataStructures.corvusSymbol;
    import corvusDataStructures.corvusVariable;
    import corvusDataStructures.corvusSymbolTable;
    import corvusExceptions.corvusSemanticException;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProjParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProjVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ProjParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ProjParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(ProjParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(ProjParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ProjParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjParser#codeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeBlock(ProjParser.CodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(ProjParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(ProjParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(ProjParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(ProjParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ProjParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjParser#boolExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpression(ProjParser.BoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(ProjParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjParser#ifCMD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCMD(ProjParser.IfCMDContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjParser#ifElseCMD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseCMD(ProjParser.IfElseCMDContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjParser#elseIfCMD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfCMD(ProjParser.ElseIfCMDContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjParser#whileCMD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileCMD(ProjParser.WhileCMDContext ctx);
}