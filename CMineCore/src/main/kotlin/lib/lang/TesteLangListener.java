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
	 * Enter a parse tree produced by {@link TesteLangParser#exp_try}.
	 * @param ctx the parse tree
	 */
	void enterExp_try(TesteLangParser.Exp_tryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TesteLangParser#exp_try}.
	 * @param ctx the parse tree
	 */
	void exitExp_try(TesteLangParser.Exp_tryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TesteLangParser#exp_req_params}.
	 * @param ctx the parse tree
	 */
	void enterExp_req_params(TesteLangParser.Exp_req_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TesteLangParser#exp_req_params}.
	 * @param ctx the parse tree
	 */
	void exitExp_req_params(TesteLangParser.Exp_req_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TesteLangParser#exp_req_param}.
	 * @param ctx the parse tree
	 */
	void enterExp_req_param(TesteLangParser.Exp_req_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TesteLangParser#exp_req_param}.
	 * @param ctx the parse tree
	 */
	void exitExp_req_param(TesteLangParser.Exp_req_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TesteLangParser#exp_params}.
	 * @param ctx the parse tree
	 */
	void enterExp_params(TesteLangParser.Exp_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TesteLangParser#exp_params}.
	 * @param ctx the parse tree
	 */
	void exitExp_params(TesteLangParser.Exp_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TesteLangParser#exp_param}.
	 * @param ctx the parse tree
	 */
	void enterExp_param(TesteLangParser.Exp_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TesteLangParser#exp_param}.
	 * @param ctx the parse tree
	 */
	void exitExp_param(TesteLangParser.Exp_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TesteLangParser#exp_return}.
	 * @param ctx the parse tree
	 */
	void enterExp_return(TesteLangParser.Exp_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link TesteLangParser#exp_return}.
	 * @param ctx the parse tree
	 */
	void exitExp_return(TesteLangParser.Exp_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link TesteLangParser#exp_func}.
	 * @param ctx the parse tree
	 */
	void enterExp_func(TesteLangParser.Exp_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link TesteLangParser#exp_func}.
	 * @param ctx the parse tree
	 */
	void exitExp_func(TesteLangParser.Exp_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link TesteLangParser#exp_def_func}.
	 * @param ctx the parse tree
	 */
	void enterExp_def_func(TesteLangParser.Exp_def_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link TesteLangParser#exp_def_func}.
	 * @param ctx the parse tree
	 */
	void exitExp_def_func(TesteLangParser.Exp_def_funcContext ctx);
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
	 * Enter a parse tree produced by {@link TesteLangParser#exp_cond}.
	 * @param ctx the parse tree
	 */
	void enterExp_cond(TesteLangParser.Exp_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link TesteLangParser#exp_cond}.
	 * @param ctx the parse tree
	 */
	void exitExp_cond(TesteLangParser.Exp_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link TesteLangParser#exp_cond_assign}.
	 * @param ctx the parse tree
	 */
	void enterExp_cond_assign(TesteLangParser.Exp_cond_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link TesteLangParser#exp_cond_assign}.
	 * @param ctx the parse tree
	 */
	void exitExp_cond_assign(TesteLangParser.Exp_cond_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link TesteLangParser#exp_unary}.
	 * @param ctx the parse tree
	 */
	void enterExp_unary(TesteLangParser.Exp_unaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TesteLangParser#exp_unary}.
	 * @param ctx the parse tree
	 */
	void exitExp_unary(TesteLangParser.Exp_unaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TesteLangParser#exp_loop}.
	 * @param ctx the parse tree
	 */
	void enterExp_loop(TesteLangParser.Exp_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link TesteLangParser#exp_loop}.
	 * @param ctx the parse tree
	 */
	void exitExp_loop(TesteLangParser.Exp_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link TesteLangParser#exp_loop_assign}.
	 * @param ctx the parse tree
	 */
	void enterExp_loop_assign(TesteLangParser.Exp_loop_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link TesteLangParser#exp_loop_assign}.
	 * @param ctx the parse tree
	 */
	void exitExp_loop_assign(TesteLangParser.Exp_loop_assignContext ctx);
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
	 * Enter a parse tree produced by {@link TesteLangParser#exp_boolean_compared}.
	 * @param ctx the parse tree
	 */
	void enterExp_boolean_compared(TesteLangParser.Exp_boolean_comparedContext ctx);
	/**
	 * Exit a parse tree produced by {@link TesteLangParser#exp_boolean_compared}.
	 * @param ctx the parse tree
	 */
	void exitExp_boolean_compared(TesteLangParser.Exp_boolean_comparedContext ctx);
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