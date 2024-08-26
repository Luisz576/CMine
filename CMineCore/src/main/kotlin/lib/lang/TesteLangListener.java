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
	/**
	 * Enter a parse tree produced by {@link TesteLangParser#exp_func_called}.
	 * @param ctx the parse tree
	 */
	void enterExp_func_called(TesteLangParser.Exp_func_calledContext ctx);
	/**
	 * Exit a parse tree produced by {@link TesteLangParser#exp_func_called}.
	 * @param ctx the parse tree
	 */
	void exitExp_func_called(TesteLangParser.Exp_func_calledContext ctx);
	/**
	 * Enter a parse tree produced by {@link TesteLangParser#exp_stored_value}.
	 * @param ctx the parse tree
	 */
	void enterExp_stored_value(TesteLangParser.Exp_stored_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TesteLangParser#exp_stored_value}.
	 * @param ctx the parse tree
	 */
	void exitExp_stored_value(TesteLangParser.Exp_stored_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TesteLangParser#exp_number}.
	 * @param ctx the parse tree
	 */
	void enterExp_number(TesteLangParser.Exp_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link TesteLangParser#exp_number}.
	 * @param ctx the parse tree
	 */
	void exitExp_number(TesteLangParser.Exp_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link TesteLangParser#exp_arith_paren}.
	 * @param ctx the parse tree
	 */
	void enterExp_arith_paren(TesteLangParser.Exp_arith_parenContext ctx);
	/**
	 * Exit a parse tree produced by {@link TesteLangParser#exp_arith_paren}.
	 * @param ctx the parse tree
	 */
	void exitExp_arith_paren(TesteLangParser.Exp_arith_parenContext ctx);
	/**
	 * Enter a parse tree produced by {@link TesteLangParser#exp_arith}.
	 * @param ctx the parse tree
	 */
	void enterExp_arith(TesteLangParser.Exp_arithContext ctx);
	/**
	 * Exit a parse tree produced by {@link TesteLangParser#exp_arith}.
	 * @param ctx the parse tree
	 */
	void exitExp_arith(TesteLangParser.Exp_arithContext ctx);
	/**
	 * Enter a parse tree produced by {@link TesteLangParser#exp_boolean}.
	 * @param ctx the parse tree
	 */
	void enterExp_boolean(TesteLangParser.Exp_booleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link TesteLangParser#exp_boolean}.
	 * @param ctx the parse tree
	 */
	void exitExp_boolean(TesteLangParser.Exp_booleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link TesteLangParser#exp_comparable}.
	 * @param ctx the parse tree
	 */
	void enterExp_comparable(TesteLangParser.Exp_comparableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TesteLangParser#exp_comparable}.
	 * @param ctx the parse tree
	 */
	void exitExp_comparable(TesteLangParser.Exp_comparableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TesteLangParser#exp_value}.
	 * @param ctx the parse tree
	 */
	void enterExp_value(TesteLangParser.Exp_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TesteLangParser#exp_value}.
	 * @param ctx the parse tree
	 */
	void exitExp_value(TesteLangParser.Exp_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TesteLangParser#exp_assign}.
	 * @param ctx the parse tree
	 */
	void enterExp_assign(TesteLangParser.Exp_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link TesteLangParser#exp_assign}.
	 * @param ctx the parse tree
	 */
	void exitExp_assign(TesteLangParser.Exp_assignContext ctx);
}