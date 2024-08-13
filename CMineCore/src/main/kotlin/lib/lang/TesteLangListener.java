package lib.lang;// Generated from TesteLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TesteLangParser}.
 */
public interface TesteLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TesteLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TesteLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TesteLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TesteLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TesteLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(TesteLangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TesteLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(TesteLangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TesteLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TesteLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TesteLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TesteLangParser.ExprContext ctx);
}