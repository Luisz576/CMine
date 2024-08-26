package lib.lang;// Generated from TesteLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TesteLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T_CODE_S=1, T_CODE_E=2, T_CV_TYPE=3, T_OP_UN=4, T_OP_MATH=5, T_OP_REL=6, 
		T_OP_ATR=7, T_OP_LOG=8, T_OP_NOT=9, T_COND_IF=10, T_COND_ELSE=11, T_REP_FOR=12, 
		T_REP_WHILE=13, T_REP_CONT=14, T_REP_BREAK=15, T_EX_TRY=16, T_EX_CATCH=17, 
		T_FUNC_DEF=18, T_FUNC_RET=19, T_SYS_VAR=20, T_SYS_FUNC=21, T_END_C=22, 
		T_COMMA=23, T_DOT=24, T_PAR_OPEN=25, T_PAR_CLOSE=26, T_BRAC_OPEN=27, T_BRAC_CLOSE=28, 
		T_VAL_BOOL=29, T_ID_VAR=30, T_ID_CONST=31, T_ID_FUNC=32, T_VAL_INT=33, 
		T_VAL_DOUBLE=34, T_VAL_STRING=35, NEW_LINE=36, SPACES=37, T_COMMENT=38;
	public static final int
		RULE_program = 0, RULE_prog = 1, RULE_expr = 2, RULE_exp_try = 3, RULE_exp_req_params = 4, 
		RULE_exp_req_param = 5, RULE_exp_params = 6, RULE_exp_param = 7, RULE_exp_return = 8, 
		RULE_exp_func = 9, RULE_exp_def_func = 10, RULE_exp_func_called = 11, 
		RULE_exp_stored_value = 12, RULE_exp_cond = 13, RULE_exp_cond_assign = 14, 
		RULE_exp_unary = 15, RULE_exp_loop = 16, RULE_exp_loop_assign = 17, RULE_exp_number = 18, 
		RULE_exp_arith_paren = 19, RULE_exp_arith = 20, RULE_exp_boolean = 21, 
		RULE_exp_boolean_compared = 22, RULE_exp_comparable = 23, RULE_exp_value = 24, 
		RULE_exp_assign = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "prog", "expr", "exp_try", "exp_req_params", "exp_req_param", 
			"exp_params", "exp_param", "exp_return", "exp_func", "exp_def_func", 
			"exp_func_called", "exp_stored_value", "exp_cond", "exp_cond_assign", 
			"exp_unary", "exp_loop", "exp_loop_assign", "exp_number", "exp_arith_paren", 
			"exp_arith", "exp_boolean", "exp_boolean_compared", "exp_comparable", 
			"exp_value", "exp_assign"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'IFSULDEMINAS'", "'MUZ'", null, null, null, null, "'='", null, 
			"'!'", "'check'", "'checked'", "'task'", "'journey'", "'respawn'", "'quit'", 
			"'play'", "'crash'", "'quest'", "'loot'", null, null, "';'", "','", "'.'", 
			"'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "T_CODE_S", "T_CODE_E", "T_CV_TYPE", "T_OP_UN", "T_OP_MATH", "T_OP_REL", 
			"T_OP_ATR", "T_OP_LOG", "T_OP_NOT", "T_COND_IF", "T_COND_ELSE", "T_REP_FOR", 
			"T_REP_WHILE", "T_REP_CONT", "T_REP_BREAK", "T_EX_TRY", "T_EX_CATCH", 
			"T_FUNC_DEF", "T_FUNC_RET", "T_SYS_VAR", "T_SYS_FUNC", "T_END_C", "T_COMMA", 
			"T_DOT", "T_PAR_OPEN", "T_PAR_CLOSE", "T_BRAC_OPEN", "T_BRAC_CLOSE", 
			"T_VAL_BOOL", "T_ID_VAR", "T_ID_CONST", "T_ID_FUNC", "T_VAL_INT", "T_VAL_DOUBLE", 
			"T_VAL_STRING", "NEW_LINE", "SPACES", "T_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TesteLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TesteLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode T_CODE_S() { return getToken(TesteLangParser.T_CODE_S, 0); }
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public TerminalNode T_CODE_E() { return getToken(TesteLangParser.T_CODE_E, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T_CODE_S);
			setState(53);
			prog();
			setState(54);
			match(T_CODE_E);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68220171800L) != 0)) {
				{
				{
				setState(56);
				expr();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public Exp_assignContext exp_assign() {
			return getRuleContext(Exp_assignContext.class,0);
		}
		public TerminalNode T_END_C() { return getToken(TesteLangParser.T_END_C, 0); }
		public Exp_valueContext exp_value() {
			return getRuleContext(Exp_valueContext.class,0);
		}
		public Exp_arithContext exp_arith() {
			return getRuleContext(Exp_arithContext.class,0);
		}
		public Exp_returnContext exp_return() {
			return getRuleContext(Exp_returnContext.class,0);
		}
		public Exp_loopContext exp_loop() {
			return getRuleContext(Exp_loopContext.class,0);
		}
		public Exp_condContext exp_cond() {
			return getRuleContext(Exp_condContext.class,0);
		}
		public Exp_tryContext exp_try() {
			return getRuleContext(Exp_tryContext.class,0);
		}
		public Exp_funcContext exp_func() {
			return getRuleContext(Exp_funcContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(62);
				exp_assign();
				setState(63);
				match(T_END_C);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(65);
				exp_value();
				setState(66);
				match(T_END_C);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(68);
				exp_arith();
				setState(69);
				match(T_END_C);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(71);
				exp_return();
				setState(72);
				match(T_END_C);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(74);
				exp_loop();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(75);
				exp_cond();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(76);
				exp_try();
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(77);
				exp_func();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_tryContext extends ParserRuleContext {
		public TerminalNode T_EX_TRY() { return getToken(TesteLangParser.T_EX_TRY, 0); }
		public List<TerminalNode> T_BRAC_OPEN() { return getTokens(TesteLangParser.T_BRAC_OPEN); }
		public TerminalNode T_BRAC_OPEN(int i) {
			return getToken(TesteLangParser.T_BRAC_OPEN, i);
		}
		public List<TerminalNode> T_BRAC_CLOSE() { return getTokens(TesteLangParser.T_BRAC_CLOSE); }
		public TerminalNode T_BRAC_CLOSE(int i) {
			return getToken(TesteLangParser.T_BRAC_CLOSE, i);
		}
		public TerminalNode T_EX_CATCH() { return getToken(TesteLangParser.T_EX_CATCH, 0); }
		public TerminalNode T_PAR_OPEN() { return getToken(TesteLangParser.T_PAR_OPEN, 0); }
		public Exp_req_paramsContext exp_req_params() {
			return getRuleContext(Exp_req_paramsContext.class,0);
		}
		public TerminalNode T_PAR_CLOSE() { return getToken(TesteLangParser.T_PAR_CLOSE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Exp_tryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_try; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).enterExp_try(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).exitExp_try(this);
		}
	}

	public final Exp_tryContext exp_try() throws RecognitionException {
		Exp_tryContext _localctx = new Exp_tryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exp_try);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T_EX_TRY);
			setState(81);
			match(T_BRAC_OPEN);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68220171800L) != 0)) {
				{
				{
				setState(82);
				expr();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			match(T_BRAC_CLOSE);
			setState(89);
			match(T_EX_CATCH);
			setState(90);
			match(T_PAR_OPEN);
			setState(91);
			exp_req_params();
			setState(92);
			match(T_PAR_CLOSE);
			setState(93);
			match(T_BRAC_OPEN);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68220171800L) != 0)) {
				{
				{
				setState(94);
				expr();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(T_BRAC_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_req_paramsContext extends ParserRuleContext {
		public List<Exp_req_paramContext> exp_req_param() {
			return getRuleContexts(Exp_req_paramContext.class);
		}
		public Exp_req_paramContext exp_req_param(int i) {
			return getRuleContext(Exp_req_paramContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(TesteLangParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(TesteLangParser.T_COMMA, i);
		}
		public Exp_req_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_req_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).enterExp_req_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).exitExp_req_params(this);
		}
	}

	public final Exp_req_paramsContext exp_req_params() throws RecognitionException {
		Exp_req_paramsContext _localctx = new Exp_req_paramsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_exp_req_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			exp_req_param();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(103);
				match(T_COMMA);
				setState(104);
				exp_req_param();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_req_paramContext extends ParserRuleContext {
		public TerminalNode T_CV_TYPE() { return getToken(TesteLangParser.T_CV_TYPE, 0); }
		public TerminalNode T_ID_VAR() { return getToken(TesteLangParser.T_ID_VAR, 0); }
		public Exp_req_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_req_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).enterExp_req_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).exitExp_req_param(this);
		}
	}

	public final Exp_req_paramContext exp_req_param() throws RecognitionException {
		Exp_req_paramContext _localctx = new Exp_req_paramContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exp_req_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T_CV_TYPE);
			setState(111);
			match(T_ID_VAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_paramsContext extends ParserRuleContext {
		public List<Exp_paramContext> exp_param() {
			return getRuleContexts(Exp_paramContext.class);
		}
		public Exp_paramContext exp_param(int i) {
			return getRuleContext(Exp_paramContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(TesteLangParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(TesteLangParser.T_COMMA, i);
		}
		public Exp_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).enterExp_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).exitExp_params(this);
		}
	}

	public final Exp_paramsContext exp_params() throws RecognitionException {
		Exp_paramsContext _localctx = new Exp_paramsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exp_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			exp_param();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(114);
				match(T_COMMA);
				setState(115);
				exp_param();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_paramContext extends ParserRuleContext {
		public Exp_valueContext exp_value() {
			return getRuleContext(Exp_valueContext.class,0);
		}
		public Exp_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).enterExp_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).exitExp_param(this);
		}
	}

	public final Exp_paramContext exp_param() throws RecognitionException {
		Exp_paramContext _localctx = new Exp_paramContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exp_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			exp_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_returnContext extends ParserRuleContext {
		public TerminalNode T_FUNC_RET() { return getToken(TesteLangParser.T_FUNC_RET, 0); }
		public Exp_valueContext exp_value() {
			return getRuleContext(Exp_valueContext.class,0);
		}
		public Exp_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).enterExp_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).exitExp_return(this);
		}
	}

	public final Exp_returnContext exp_return() throws RecognitionException {
		Exp_returnContext _localctx = new Exp_returnContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exp_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T_FUNC_RET);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68219306512L) != 0)) {
				{
				setState(124);
				exp_value();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_funcContext extends ParserRuleContext {
		public Exp_def_funcContext exp_def_func() {
			return getRuleContext(Exp_def_funcContext.class,0);
		}
		public TerminalNode T_BRAC_OPEN() { return getToken(TesteLangParser.T_BRAC_OPEN, 0); }
		public TerminalNode T_BRAC_CLOSE() { return getToken(TesteLangParser.T_BRAC_CLOSE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Exp_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).enterExp_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).exitExp_func(this);
		}
	}

	public final Exp_funcContext exp_func() throws RecognitionException {
		Exp_funcContext _localctx = new Exp_funcContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exp_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			exp_def_func();
			setState(128);
			match(T_BRAC_OPEN);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68220171800L) != 0)) {
				{
				{
				setState(129);
				expr();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
			match(T_BRAC_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_def_funcContext extends ParserRuleContext {
		public TerminalNode T_FUNC_DEF() { return getToken(TesteLangParser.T_FUNC_DEF, 0); }
		public TerminalNode T_ID_FUNC() { return getToken(TesteLangParser.T_ID_FUNC, 0); }
		public TerminalNode T_PAR_OPEN() { return getToken(TesteLangParser.T_PAR_OPEN, 0); }
		public TerminalNode T_PAR_CLOSE() { return getToken(TesteLangParser.T_PAR_CLOSE, 0); }
		public Exp_req_paramsContext exp_req_params() {
			return getRuleContext(Exp_req_paramsContext.class,0);
		}
		public Exp_def_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_def_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).enterExp_def_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).exitExp_def_func(this);
		}
	}

	public final Exp_def_funcContext exp_def_func() throws RecognitionException {
		Exp_def_funcContext _localctx = new Exp_def_funcContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exp_def_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T_FUNC_DEF);
			setState(138);
			match(T_ID_FUNC);
			setState(139);
			match(T_PAR_OPEN);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_CV_TYPE) {
				{
				setState(140);
				exp_req_params();
				}
			}

			setState(143);
			match(T_PAR_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_func_calledContext extends ParserRuleContext {
		public TerminalNode T_ID_FUNC() { return getToken(TesteLangParser.T_ID_FUNC, 0); }
		public TerminalNode T_PAR_OPEN() { return getToken(TesteLangParser.T_PAR_OPEN, 0); }
		public TerminalNode T_PAR_CLOSE() { return getToken(TesteLangParser.T_PAR_CLOSE, 0); }
		public Exp_paramsContext exp_params() {
			return getRuleContext(Exp_paramsContext.class,0);
		}
		public TerminalNode T_SYS_FUNC() { return getToken(TesteLangParser.T_SYS_FUNC, 0); }
		public Exp_func_calledContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_func_called; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).enterExp_func_called(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).exitExp_func_called(this);
		}
	}

	public final Exp_func_calledContext exp_func_called() throws RecognitionException {
		Exp_func_calledContext _localctx = new Exp_func_calledContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exp_func_called);
		int _la;
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ID_FUNC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(145);
				match(T_ID_FUNC);
				setState(146);
				match(T_PAR_OPEN);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68219306512L) != 0)) {
					{
					setState(147);
					exp_params();
					}
				}

				setState(150);
				match(T_PAR_CLOSE);
				}
				}
				break;
			case T_SYS_FUNC:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(151);
				match(T_SYS_FUNC);
				setState(152);
				match(T_PAR_OPEN);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68219306512L) != 0)) {
					{
					setState(153);
					exp_params();
					}
				}

				setState(156);
				match(T_PAR_CLOSE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_stored_valueContext extends ParserRuleContext {
		public TerminalNode T_ID_VAR() { return getToken(TesteLangParser.T_ID_VAR, 0); }
		public TerminalNode T_ID_CONST() { return getToken(TesteLangParser.T_ID_CONST, 0); }
		public Exp_unaryContext exp_unary() {
			return getRuleContext(Exp_unaryContext.class,0);
		}
		public Exp_stored_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_stored_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).enterExp_stored_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).exitExp_stored_value(this);
		}
	}

	public final Exp_stored_valueContext exp_stored_value() throws RecognitionException {
		Exp_stored_valueContext _localctx = new Exp_stored_valueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exp_stored_value);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(T_ID_VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(T_ID_CONST);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				exp_unary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_condContext extends ParserRuleContext {
		public Exp_cond_assignContext exp_cond_assign() {
			return getRuleContext(Exp_cond_assignContext.class,0);
		}
		public List<TerminalNode> T_BRAC_OPEN() { return getTokens(TesteLangParser.T_BRAC_OPEN); }
		public TerminalNode T_BRAC_OPEN(int i) {
			return getToken(TesteLangParser.T_BRAC_OPEN, i);
		}
		public List<TerminalNode> T_BRAC_CLOSE() { return getTokens(TesteLangParser.T_BRAC_CLOSE); }
		public TerminalNode T_BRAC_CLOSE(int i) {
			return getToken(TesteLangParser.T_BRAC_CLOSE, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_COND_ELSE() { return getToken(TesteLangParser.T_COND_ELSE, 0); }
		public Exp_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).enterExp_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).exitExp_cond(this);
		}
	}

	public final Exp_condContext exp_cond() throws RecognitionException {
		Exp_condContext _localctx = new Exp_condContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exp_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			exp_cond_assign();
			setState(165);
			match(T_BRAC_OPEN);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68220171800L) != 0)) {
				{
				{
				setState(166);
				expr();
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			match(T_BRAC_CLOSE);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COND_ELSE) {
				{
				setState(173);
				match(T_COND_ELSE);
				setState(174);
				match(T_BRAC_OPEN);
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68220171800L) != 0)) {
					{
					{
					setState(175);
					expr();
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(181);
				match(T_BRAC_CLOSE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_cond_assignContext extends ParserRuleContext {
		public TerminalNode T_COND_IF() { return getToken(TesteLangParser.T_COND_IF, 0); }
		public TerminalNode T_PAR_OPEN() { return getToken(TesteLangParser.T_PAR_OPEN, 0); }
		public Exp_booleanContext exp_boolean() {
			return getRuleContext(Exp_booleanContext.class,0);
		}
		public TerminalNode T_PAR_CLOSE() { return getToken(TesteLangParser.T_PAR_CLOSE, 0); }
		public Exp_cond_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_cond_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).enterExp_cond_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).exitExp_cond_assign(this);
		}
	}

	public final Exp_cond_assignContext exp_cond_assign() throws RecognitionException {
		Exp_cond_assignContext _localctx = new Exp_cond_assignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exp_cond_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(184);
			match(T_COND_IF);
			setState(185);
			match(T_PAR_OPEN);
			setState(186);
			exp_boolean();
			setState(187);
			match(T_PAR_CLOSE);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_unaryContext extends ParserRuleContext {
		public TerminalNode T_ID_VAR() { return getToken(TesteLangParser.T_ID_VAR, 0); }
		public TerminalNode T_OP_UN() { return getToken(TesteLangParser.T_OP_UN, 0); }
		public Exp_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).enterExp_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).exitExp_unary(this);
		}
	}

	public final Exp_unaryContext exp_unary() throws RecognitionException {
		Exp_unaryContext _localctx = new Exp_unaryContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exp_unary);
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ID_VAR:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(189);
				match(T_ID_VAR);
				setState(190);
				match(T_OP_UN);
				}
				}
				break;
			case T_OP_UN:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(191);
				match(T_OP_UN);
				setState(192);
				match(T_ID_VAR);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_loopContext extends ParserRuleContext {
		public Exp_loop_assignContext exp_loop_assign() {
			return getRuleContext(Exp_loop_assignContext.class,0);
		}
		public TerminalNode T_BRAC_OPEN() { return getToken(TesteLangParser.T_BRAC_OPEN, 0); }
		public TerminalNode T_BRAC_CLOSE() { return getToken(TesteLangParser.T_BRAC_CLOSE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Exp_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).enterExp_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).exitExp_loop(this);
		}
	}

	public final Exp_loopContext exp_loop() throws RecognitionException {
		Exp_loopContext _localctx = new Exp_loopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exp_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			exp_loop_assign();
			setState(196);
			match(T_BRAC_OPEN);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68220171800L) != 0)) {
				{
				{
				setState(197);
				expr();
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
			match(T_BRAC_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_loop_assignContext extends ParserRuleContext {
		public TerminalNode T_REP_FOR() { return getToken(TesteLangParser.T_REP_FOR, 0); }
		public TerminalNode T_PAR_OPEN() { return getToken(TesteLangParser.T_PAR_OPEN, 0); }
		public List<TerminalNode> T_END_C() { return getTokens(TesteLangParser.T_END_C); }
		public TerminalNode T_END_C(int i) {
			return getToken(TesteLangParser.T_END_C, i);
		}
		public Exp_booleanContext exp_boolean() {
			return getRuleContext(Exp_booleanContext.class,0);
		}
		public TerminalNode T_PAR_CLOSE() { return getToken(TesteLangParser.T_PAR_CLOSE, 0); }
		public List<Exp_assignContext> exp_assign() {
			return getRuleContexts(Exp_assignContext.class);
		}
		public Exp_assignContext exp_assign(int i) {
			return getRuleContext(Exp_assignContext.class,i);
		}
		public TerminalNode T_REP_WHILE() { return getToken(TesteLangParser.T_REP_WHILE, 0); }
		public Exp_loop_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_loop_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).enterExp_loop_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).exitExp_loop_assign(this);
		}
	}

	public final Exp_loop_assignContext exp_loop_assign() throws RecognitionException {
		Exp_loop_assignContext _localctx = new Exp_loop_assignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exp_loop_assign);
		int _la;
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_REP_FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(T_REP_FOR);
				setState(206);
				match(T_PAR_OPEN);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3221225496L) != 0)) {
					{
					setState(207);
					exp_assign();
					}
				}

				setState(210);
				match(T_END_C);
				setState(211);
				exp_boolean();
				setState(212);
				match(T_END_C);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3221225496L) != 0)) {
					{
					setState(213);
					exp_assign();
					}
				}

				setState(216);
				match(T_PAR_CLOSE);
				}
				break;
			case T_REP_WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(T_REP_WHILE);
				setState(219);
				match(T_PAR_OPEN);
				setState(220);
				exp_boolean();
				setState(221);
				match(T_PAR_CLOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_numberContext extends ParserRuleContext {
		public TerminalNode T_VAL_INT() { return getToken(TesteLangParser.T_VAL_INT, 0); }
		public TerminalNode T_VAL_DOUBLE() { return getToken(TesteLangParser.T_VAL_DOUBLE, 0); }
		public Exp_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).enterExp_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).exitExp_number(this);
		}
	}

	public final Exp_numberContext exp_number() throws RecognitionException {
		Exp_numberContext _localctx = new Exp_numberContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exp_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_la = _input.LA(1);
			if ( !(_la==T_VAL_INT || _la==T_VAL_DOUBLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_arith_parenContext extends ParserRuleContext {
		public TerminalNode T_PAR_OPEN() { return getToken(TesteLangParser.T_PAR_OPEN, 0); }
		public Exp_arithContext exp_arith() {
			return getRuleContext(Exp_arithContext.class,0);
		}
		public TerminalNode T_PAR_CLOSE() { return getToken(TesteLangParser.T_PAR_CLOSE, 0); }
		public Exp_arith_parenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_arith_paren; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).enterExp_arith_paren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).exitExp_arith_paren(this);
		}
	}

	public final Exp_arith_parenContext exp_arith_paren() throws RecognitionException {
		Exp_arith_parenContext _localctx = new Exp_arith_parenContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_exp_arith_paren);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T_PAR_OPEN);
			setState(228);
			exp_arith();
			setState(229);
			match(T_PAR_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_arithContext extends ParserRuleContext {
		public List<Exp_arith_parenContext> exp_arith_paren() {
			return getRuleContexts(Exp_arith_parenContext.class);
		}
		public Exp_arith_parenContext exp_arith_paren(int i) {
			return getRuleContext(Exp_arith_parenContext.class,i);
		}
		public List<Exp_numberContext> exp_number() {
			return getRuleContexts(Exp_numberContext.class);
		}
		public Exp_numberContext exp_number(int i) {
			return getRuleContext(Exp_numberContext.class,i);
		}
		public TerminalNode T_OP_MATH() { return getToken(TesteLangParser.T_OP_MATH, 0); }
		public Exp_arithContext exp_arith() {
			return getRuleContext(Exp_arithContext.class,0);
		}
		public List<Exp_stored_valueContext> exp_stored_value() {
			return getRuleContexts(Exp_stored_valueContext.class);
		}
		public Exp_stored_valueContext exp_stored_value(int i) {
			return getRuleContext(Exp_stored_valueContext.class,i);
		}
		public Exp_arithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_arith; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).enterExp_arith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).exitExp_arith(this);
		}
	}

	public final Exp_arithContext exp_arith() throws RecognitionException {
		Exp_arithContext _localctx = new Exp_arithContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exp_arith);
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				exp_arith_paren();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				exp_number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(233);
				exp_arith_paren();
				setState(234);
				match(T_OP_MATH);
				setState(235);
				exp_arith_paren();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(237);
				exp_arith_paren();
				setState(238);
				match(T_OP_MATH);
				setState(239);
				exp_arith();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(241);
				exp_number();
				setState(242);
				match(T_OP_MATH);
				setState(243);
				exp_number();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(245);
				exp_stored_value();
				setState(246);
				match(T_OP_MATH);
				setState(247);
				exp_number();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(249);
				exp_stored_value();
				setState(250);
				match(T_OP_MATH);
				setState(251);
				exp_stored_value();
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(253);
				exp_number();
				setState(254);
				match(T_OP_MATH);
				setState(255);
				exp_stored_value();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_booleanContext extends ParserRuleContext {
		public TerminalNode T_VAL_BOOL() { return getToken(TesteLangParser.T_VAL_BOOL, 0); }
		public List<Exp_comparableContext> exp_comparable() {
			return getRuleContexts(Exp_comparableContext.class);
		}
		public Exp_comparableContext exp_comparable(int i) {
			return getRuleContext(Exp_comparableContext.class,i);
		}
		public TerminalNode T_OP_REL() { return getToken(TesteLangParser.T_OP_REL, 0); }
		public Exp_boolean_comparedContext exp_boolean_compared() {
			return getRuleContext(Exp_boolean_comparedContext.class,0);
		}
		public TerminalNode T_OP_NOT() { return getToken(TesteLangParser.T_OP_NOT, 0); }
		public Exp_booleanContext exp_boolean() {
			return getRuleContext(Exp_booleanContext.class,0);
		}
		public Exp_booleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_boolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).enterExp_boolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).exitExp_boolean(this);
		}
	}

	public final Exp_booleanContext exp_boolean() throws RecognitionException {
		Exp_booleanContext _localctx = new Exp_booleanContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exp_boolean);
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(T_VAL_BOOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(260);
				exp_comparable();
				setState(261);
				match(T_OP_REL);
				setState(262);
				exp_comparable();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				exp_boolean_compared();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(265);
				match(T_OP_NOT);
				setState(266);
				exp_boolean();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_boolean_comparedContext extends ParserRuleContext {
		public List<Exp_comparableContext> exp_comparable() {
			return getRuleContexts(Exp_comparableContext.class);
		}
		public Exp_comparableContext exp_comparable(int i) {
			return getRuleContext(Exp_comparableContext.class,i);
		}
		public TerminalNode T_OP_REL() { return getToken(TesteLangParser.T_OP_REL, 0); }
		public Exp_boolean_comparedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_boolean_compared; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).enterExp_boolean_compared(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).exitExp_boolean_compared(this);
		}
	}

	public final Exp_boolean_comparedContext exp_boolean_compared() throws RecognitionException {
		Exp_boolean_comparedContext _localctx = new Exp_boolean_comparedContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_exp_boolean_compared);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(269);
			exp_comparable();
			setState(270);
			match(T_OP_REL);
			setState(271);
			exp_comparable();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_comparableContext extends ParserRuleContext {
		public Exp_stored_valueContext exp_stored_value() {
			return getRuleContext(Exp_stored_valueContext.class,0);
		}
		public TerminalNode T_VAL_BOOL() { return getToken(TesteLangParser.T_VAL_BOOL, 0); }
		public TerminalNode T_SYS_VAR() { return getToken(TesteLangParser.T_SYS_VAR, 0); }
		public Exp_numberContext exp_number() {
			return getRuleContext(Exp_numberContext.class,0);
		}
		public TerminalNode T_PAR_OPEN() { return getToken(TesteLangParser.T_PAR_OPEN, 0); }
		public Exp_arithContext exp_arith() {
			return getRuleContext(Exp_arithContext.class,0);
		}
		public TerminalNode T_PAR_CLOSE() { return getToken(TesteLangParser.T_PAR_CLOSE, 0); }
		public Exp_booleanContext exp_boolean() {
			return getRuleContext(Exp_booleanContext.class,0);
		}
		public Exp_comparableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_comparable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).enterExp_comparable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).exitExp_comparable(this);
		}
	}

	public final Exp_comparableContext exp_comparable() throws RecognitionException {
		Exp_comparableContext _localctx = new Exp_comparableContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_exp_comparable);
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				exp_stored_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(T_VAL_BOOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				match(T_SYS_VAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
				exp_number();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(277);
				exp_stored_value();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(278);
				match(T_PAR_OPEN);
				setState(279);
				exp_arith();
				setState(280);
				match(T_PAR_CLOSE);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(282);
				match(T_PAR_OPEN);
				setState(283);
				exp_boolean();
				setState(284);
				match(T_PAR_CLOSE);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_valueContext extends ParserRuleContext {
		public Exp_func_calledContext exp_func_called() {
			return getRuleContext(Exp_func_calledContext.class,0);
		}
		public Exp_stored_valueContext exp_stored_value() {
			return getRuleContext(Exp_stored_valueContext.class,0);
		}
		public Exp_booleanContext exp_boolean() {
			return getRuleContext(Exp_booleanContext.class,0);
		}
		public Exp_arithContext exp_arith() {
			return getRuleContext(Exp_arithContext.class,0);
		}
		public TerminalNode T_VAL_STRING() { return getToken(TesteLangParser.T_VAL_STRING, 0); }
		public Exp_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).enterExp_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).exitExp_value(this);
		}
	}

	public final Exp_valueContext exp_value() throws RecognitionException {
		Exp_valueContext _localctx = new Exp_valueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_exp_value);
		try {
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				exp_func_called();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				exp_stored_value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				exp_boolean();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(291);
				exp_arith();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(292);
				match(T_VAL_STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_assignContext extends ParserRuleContext {
		public Exp_stored_valueContext exp_stored_value() {
			return getRuleContext(Exp_stored_valueContext.class,0);
		}
		public TerminalNode T_OP_ATR() { return getToken(TesteLangParser.T_OP_ATR, 0); }
		public Exp_valueContext exp_value() {
			return getRuleContext(Exp_valueContext.class,0);
		}
		public TerminalNode T_CV_TYPE() { return getToken(TesteLangParser.T_CV_TYPE, 0); }
		public Exp_unaryContext exp_unary() {
			return getRuleContext(Exp_unaryContext.class,0);
		}
		public Exp_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).enterExp_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TesteLangListener ) ((TesteLangListener)listener).exitExp_assign(this);
		}
	}

	public final Exp_assignContext exp_assign() throws RecognitionException {
		Exp_assignContext _localctx = new Exp_assignContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_exp_assign);
		int _la;
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CV_TYPE) {
					{
					setState(295);
					match(T_CV_TYPE);
					}
				}

				setState(298);
				exp_stored_value();
				setState(299);
				match(T_OP_ATR);
				setState(300);
				exp_value();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				exp_unary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001&\u0132\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0005\u0001:\b\u0001\n\u0001\f\u0001=\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002O\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003T\b\u0003\n\u0003\f\u0003W\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003`\b\u0003\n\u0003\f\u0003c\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004j\b\u0004"+
		"\n\u0004\f\u0004m\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006u\b\u0006\n\u0006\f\u0006x\t\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b~\b\b\u0001\t\u0001\t"+
		"\u0001\t\u0005\t\u0083\b\t\n\t\f\t\u0086\t\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u008e\b\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u0095\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u009b\b\u000b\u0001\u000b\u0003\u000b\u009e"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u00a3\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\u00a8\b\r\n\r\f\r\u00ab\t\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0005\r\u00b1\b\r\n\r\f\r\u00b4\t\r\u0001\r\u0003\r\u00b7\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00c2\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u00c7\b\u0010\n\u0010\f\u0010\u00ca\t\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00d1"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00d7"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00e0\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u0102\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u010c\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u011f"+
		"\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u0126\b\u0018\u0001\u0019\u0003\u0019\u0129\b\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0130\b\u0019"+
		"\u0001\u0019\u0000\u0000\u001a\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02\u0000\u0001\u0001"+
		"\u0000!\"\u0149\u00004\u0001\u0000\u0000\u0000\u0002;\u0001\u0000\u0000"+
		"\u0000\u0004N\u0001\u0000\u0000\u0000\u0006P\u0001\u0000\u0000\u0000\b"+
		"f\u0001\u0000\u0000\u0000\nn\u0001\u0000\u0000\u0000\fq\u0001\u0000\u0000"+
		"\u0000\u000ey\u0001\u0000\u0000\u0000\u0010{\u0001\u0000\u0000\u0000\u0012"+
		"\u007f\u0001\u0000\u0000\u0000\u0014\u0089\u0001\u0000\u0000\u0000\u0016"+
		"\u009d\u0001\u0000\u0000\u0000\u0018\u00a2\u0001\u0000\u0000\u0000\u001a"+
		"\u00a4\u0001\u0000\u0000\u0000\u001c\u00b8\u0001\u0000\u0000\u0000\u001e"+
		"\u00c1\u0001\u0000\u0000\u0000 \u00c3\u0001\u0000\u0000\u0000\"\u00df"+
		"\u0001\u0000\u0000\u0000$\u00e1\u0001\u0000\u0000\u0000&\u00e3\u0001\u0000"+
		"\u0000\u0000(\u0101\u0001\u0000\u0000\u0000*\u010b\u0001\u0000\u0000\u0000"+
		",\u010d\u0001\u0000\u0000\u0000.\u011e\u0001\u0000\u0000\u00000\u0125"+
		"\u0001\u0000\u0000\u00002\u012f\u0001\u0000\u0000\u000045\u0005\u0001"+
		"\u0000\u000056\u0003\u0002\u0001\u000067\u0005\u0002\u0000\u00007\u0001"+
		"\u0001\u0000\u0000\u00008:\u0003\u0004\u0002\u000098\u0001\u0000\u0000"+
		"\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000"+
		"\u0000\u0000<\u0003\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000"+
		">?\u00032\u0019\u0000?@\u0005\u0016\u0000\u0000@O\u0001\u0000\u0000\u0000"+
		"AB\u00030\u0018\u0000BC\u0005\u0016\u0000\u0000CO\u0001\u0000\u0000\u0000"+
		"DE\u0003(\u0014\u0000EF\u0005\u0016\u0000\u0000FO\u0001\u0000\u0000\u0000"+
		"GH\u0003\u0010\b\u0000HI\u0005\u0016\u0000\u0000IO\u0001\u0000\u0000\u0000"+
		"JO\u0003 \u0010\u0000KO\u0003\u001a\r\u0000LO\u0003\u0006\u0003\u0000"+
		"MO\u0003\u0012\t\u0000N>\u0001\u0000\u0000\u0000NA\u0001\u0000\u0000\u0000"+
		"ND\u0001\u0000\u0000\u0000NG\u0001\u0000\u0000\u0000NJ\u0001\u0000\u0000"+
		"\u0000NK\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NM\u0001\u0000"+
		"\u0000\u0000O\u0005\u0001\u0000\u0000\u0000PQ\u0005\u0010\u0000\u0000"+
		"QU\u0005\u001b\u0000\u0000RT\u0003\u0004\u0002\u0000SR\u0001\u0000\u0000"+
		"\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000"+
		"\u0000\u0000VX\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000XY\u0005"+
		"\u001c\u0000\u0000YZ\u0005\u0011\u0000\u0000Z[\u0005\u0019\u0000\u0000"+
		"[\\\u0003\b\u0004\u0000\\]\u0005\u001a\u0000\u0000]a\u0005\u001b\u0000"+
		"\u0000^`\u0003\u0004\u0002\u0000_^\u0001\u0000\u0000\u0000`c\u0001\u0000"+
		"\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bd\u0001"+
		"\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000de\u0005\u001c\u0000\u0000"+
		"e\u0007\u0001\u0000\u0000\u0000fk\u0003\n\u0005\u0000gh\u0005\u0017\u0000"+
		"\u0000hj\u0003\n\u0005\u0000ig\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000l\t\u0001\u0000"+
		"\u0000\u0000mk\u0001\u0000\u0000\u0000no\u0005\u0003\u0000\u0000op\u0005"+
		"\u001e\u0000\u0000p\u000b\u0001\u0000\u0000\u0000qv\u0003\u000e\u0007"+
		"\u0000rs\u0005\u0017\u0000\u0000su\u0003\u000e\u0007\u0000tr\u0001\u0000"+
		"\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000w\r\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000"+
		"yz\u00030\u0018\u0000z\u000f\u0001\u0000\u0000\u0000{}\u0005\u0013\u0000"+
		"\u0000|~\u00030\u0018\u0000}|\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000"+
		"\u0000~\u0011\u0001\u0000\u0000\u0000\u007f\u0080\u0003\u0014\n\u0000"+
		"\u0080\u0084\u0005\u001b\u0000\u0000\u0081\u0083\u0003\u0004\u0002\u0000"+
		"\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000"+
		"\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000"+
		"\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0005\u001c\u0000\u0000\u0088\u0013\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0005\u0012\u0000\u0000\u008a\u008b\u0005 \u0000\u0000\u008b"+
		"\u008d\u0005\u0019\u0000\u0000\u008c\u008e\u0003\b\u0004\u0000\u008d\u008c"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u001a\u0000\u0000\u0090\u0015"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0005 \u0000\u0000\u0092\u0094\u0005"+
		"\u0019\u0000\u0000\u0093\u0095\u0003\f\u0006\u0000\u0094\u0093\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000"+
		"\u0000\u0000\u0096\u009e\u0005\u001a\u0000\u0000\u0097\u0098\u0005\u0015"+
		"\u0000\u0000\u0098\u009a\u0005\u0019\u0000\u0000\u0099\u009b\u0003\f\u0006"+
		"\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009e\u0005\u001a\u0000"+
		"\u0000\u009d\u0091\u0001\u0000\u0000\u0000\u009d\u0097\u0001\u0000\u0000"+
		"\u0000\u009e\u0017\u0001\u0000\u0000\u0000\u009f\u00a3\u0005\u001e\u0000"+
		"\u0000\u00a0\u00a3\u0005\u001f\u0000\u0000\u00a1\u00a3\u0003\u001e\u000f"+
		"\u0000\u00a2\u009f\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u0019\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0003\u001c\u000e\u0000\u00a5\u00a9\u0005\u001b\u0000"+
		"\u0000\u00a6\u00a8\u0003\u0004\u0002\u0000\u00a7\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00b6\u0005\u001c\u0000"+
		"\u0000\u00ad\u00ae\u0005\u000b\u0000\u0000\u00ae\u00b2\u0005\u001b\u0000"+
		"\u0000\u00af\u00b1\u0003\u0004\u0002\u0000\u00b0\u00af\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b7\u0005\u001c\u0000"+
		"\u0000\u00b6\u00ad\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b7\u001b\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\n\u0000\u0000"+
		"\u00b9\u00ba\u0005\u0019\u0000\u0000\u00ba\u00bb\u0003*\u0015\u0000\u00bb"+
		"\u00bc\u0005\u001a\u0000\u0000\u00bc\u001d\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0005\u001e\u0000\u0000\u00be\u00c2\u0005\u0004\u0000\u0000\u00bf"+
		"\u00c0\u0005\u0004\u0000\u0000\u00c0\u00c2\u0005\u001e\u0000\u0000\u00c1"+
		"\u00bd\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2"+
		"\u001f\u0001\u0000\u0000\u0000\u00c3\u00c4\u0003\"\u0011\u0000\u00c4\u00c8"+
		"\u0005\u001b\u0000\u0000\u00c5\u00c7\u0003\u0004\u0002\u0000\u00c6\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cb"+
		"\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0005\u001c\u0000\u0000\u00cc!\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005"+
		"\f\u0000\u0000\u00ce\u00d0\u0005\u0019\u0000\u0000\u00cf\u00d1\u00032"+
		"\u0019\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u0016"+
		"\u0000\u0000\u00d3\u00d4\u0003*\u0015\u0000\u00d4\u00d6\u0005\u0016\u0000"+
		"\u0000\u00d5\u00d7\u00032\u0019\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\u0005\u001a\u0000\u0000\u00d9\u00e0\u0001\u0000\u0000\u0000"+
		"\u00da\u00db\u0005\r\u0000\u0000\u00db\u00dc\u0005\u0019\u0000\u0000\u00dc"+
		"\u00dd\u0003*\u0015\u0000\u00dd\u00de\u0005\u001a\u0000\u0000\u00de\u00e0"+
		"\u0001\u0000\u0000\u0000\u00df\u00cd\u0001\u0000\u0000\u0000\u00df\u00da"+
		"\u0001\u0000\u0000\u0000\u00e0#\u0001\u0000\u0000\u0000\u00e1\u00e2\u0007"+
		"\u0000\u0000\u0000\u00e2%\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\u0019"+
		"\u0000\u0000\u00e4\u00e5\u0003(\u0014\u0000\u00e5\u00e6\u0005\u001a\u0000"+
		"\u0000\u00e6\'\u0001\u0000\u0000\u0000\u00e7\u0102\u0003&\u0013\u0000"+
		"\u00e8\u0102\u0003$\u0012\u0000\u00e9\u00ea\u0003&\u0013\u0000\u00ea\u00eb"+
		"\u0005\u0005\u0000\u0000\u00eb\u00ec\u0003&\u0013\u0000\u00ec\u0102\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0003&\u0013\u0000\u00ee\u00ef\u0005\u0005"+
		"\u0000\u0000\u00ef\u00f0\u0003(\u0014\u0000\u00f0\u0102\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f2\u0003$\u0012\u0000\u00f2\u00f3\u0005\u0005\u0000\u0000"+
		"\u00f3\u00f4\u0003$\u0012\u0000\u00f4\u0102\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f6\u0003\u0018\f\u0000\u00f6\u00f7\u0005\u0005\u0000\u0000\u00f7\u00f8"+
		"\u0003$\u0012\u0000\u00f8\u0102\u0001\u0000\u0000\u0000\u00f9\u00fa\u0003"+
		"\u0018\f\u0000\u00fa\u00fb\u0005\u0005\u0000\u0000\u00fb\u00fc\u0003\u0018"+
		"\f\u0000\u00fc\u0102\u0001\u0000\u0000\u0000\u00fd\u00fe\u0003$\u0012"+
		"\u0000\u00fe\u00ff\u0005\u0005\u0000\u0000\u00ff\u0100\u0003\u0018\f\u0000"+
		"\u0100\u0102\u0001\u0000\u0000\u0000\u0101\u00e7\u0001\u0000\u0000\u0000"+
		"\u0101\u00e8\u0001\u0000\u0000\u0000\u0101\u00e9\u0001\u0000\u0000\u0000"+
		"\u0101\u00ed\u0001\u0000\u0000\u0000\u0101\u00f1\u0001\u0000\u0000\u0000"+
		"\u0101\u00f5\u0001\u0000\u0000\u0000\u0101\u00f9\u0001\u0000\u0000\u0000"+
		"\u0101\u00fd\u0001\u0000\u0000\u0000\u0102)\u0001\u0000\u0000\u0000\u0103"+
		"\u010c\u0005\u001d\u0000\u0000\u0104\u0105\u0003.\u0017\u0000\u0105\u0106"+
		"\u0005\u0006\u0000\u0000\u0106\u0107\u0003.\u0017\u0000\u0107\u010c\u0001"+
		"\u0000\u0000\u0000\u0108\u010c\u0003,\u0016\u0000\u0109\u010a\u0005\t"+
		"\u0000\u0000\u010a\u010c\u0003*\u0015\u0000\u010b\u0103\u0001\u0000\u0000"+
		"\u0000\u010b\u0104\u0001\u0000\u0000\u0000\u010b\u0108\u0001\u0000\u0000"+
		"\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010c+\u0001\u0000\u0000\u0000"+
		"\u010d\u010e\u0003.\u0017\u0000\u010e\u010f\u0005\u0006\u0000\u0000\u010f"+
		"\u0110\u0003.\u0017\u0000\u0110-\u0001\u0000\u0000\u0000\u0111\u011f\u0003"+
		"\u0018\f\u0000\u0112\u011f\u0005\u001d\u0000\u0000\u0113\u011f\u0005\u0014"+
		"\u0000\u0000\u0114\u011f\u0003$\u0012\u0000\u0115\u011f\u0003\u0018\f"+
		"\u0000\u0116\u0117\u0005\u0019\u0000\u0000\u0117\u0118\u0003(\u0014\u0000"+
		"\u0118\u0119\u0005\u001a\u0000\u0000\u0119\u011f\u0001\u0000\u0000\u0000"+
		"\u011a\u011b\u0005\u0019\u0000\u0000\u011b\u011c\u0003*\u0015\u0000\u011c"+
		"\u011d\u0005\u001a\u0000\u0000\u011d\u011f\u0001\u0000\u0000\u0000\u011e"+
		"\u0111\u0001\u0000\u0000\u0000\u011e\u0112\u0001\u0000\u0000\u0000\u011e"+
		"\u0113\u0001\u0000\u0000\u0000\u011e\u0114\u0001\u0000\u0000\u0000\u011e"+
		"\u0115\u0001\u0000\u0000\u0000\u011e\u0116\u0001\u0000\u0000\u0000\u011e"+
		"\u011a\u0001\u0000\u0000\u0000\u011f/\u0001\u0000\u0000\u0000\u0120\u0126"+
		"\u0003\u0016\u000b\u0000\u0121\u0126\u0003\u0018\f\u0000\u0122\u0126\u0003"+
		"*\u0015\u0000\u0123\u0126\u0003(\u0014\u0000\u0124\u0126\u0005#\u0000"+
		"\u0000\u0125\u0120\u0001\u0000\u0000\u0000\u0125\u0121\u0001\u0000\u0000"+
		"\u0000\u0125\u0122\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000"+
		"\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u01261\u0001\u0000\u0000\u0000"+
		"\u0127\u0129\u0005\u0003\u0000\u0000\u0128\u0127\u0001\u0000\u0000\u0000"+
		"\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000"+
		"\u012a\u012b\u0003\u0018\f\u0000\u012b\u012c\u0005\u0007\u0000\u0000\u012c"+
		"\u012d\u00030\u0018\u0000\u012d\u0130\u0001\u0000\u0000\u0000\u012e\u0130"+
		"\u0003\u001e\u000f\u0000\u012f\u0128\u0001\u0000\u0000\u0000\u012f\u012e"+
		"\u0001\u0000\u0000\u0000\u01303\u0001\u0000\u0000\u0000\u001b;NUakv}\u0084"+
		"\u008d\u0094\u009a\u009d\u00a2\u00a9\u00b2\u00b6\u00c1\u00c8\u00d0\u00d6"+
		"\u00df\u0101\u010b\u011e\u0125\u0128\u012f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}