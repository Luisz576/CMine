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
		RULE_program = 0, RULE_prog = 1, RULE_expr = 2, RULE_exp_func_called = 3, 
		RULE_exp_stored_value = 4, RULE_exp_number = 5, RULE_exp_arith_paren = 6, 
		RULE_exp_arith = 7, RULE_exp_boolean = 8, RULE_exp_comparable = 9, RULE_exp_value = 10, 
		RULE_exp_assign = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "prog", "expr", "exp_func_called", "exp_stored_value", "exp_number", 
			"exp_arith_paren", "exp_arith", "exp_boolean", "exp_comparable", "exp_value", 
			"exp_assign"
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
			setState(24);
			match(T_CODE_S);
			setState(25);
			prog();
			setState(26);
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
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33859567616L) != 0)) {
				{
				{
				setState(28);
				expr();
				}
				}
				setState(33);
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
		public Exp_func_calledContext exp_func_called() {
			return getRuleContext(Exp_func_calledContext.class,0);
		}
		public Exp_stored_valueContext exp_stored_value() {
			return getRuleContext(Exp_stored_valueContext.class,0);
		}
		public Exp_numberContext exp_number() {
			return getRuleContext(Exp_numberContext.class,0);
		}
		public Exp_comparableContext exp_comparable() {
			return getRuleContext(Exp_comparableContext.class,0);
		}
		public Exp_assignContext exp_assign() {
			return getRuleContext(Exp_assignContext.class,0);
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
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				exp_func_called();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				exp_stored_value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				exp_number();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				exp_comparable();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(38);
				exp_assign();
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
	public static class Exp_func_calledContext extends ParserRuleContext {
		public TerminalNode T_ID_FUNC() { return getToken(TesteLangParser.T_ID_FUNC, 0); }
		public TerminalNode T_PAR_OPEN() { return getToken(TesteLangParser.T_PAR_OPEN, 0); }
		public TerminalNode T_PAR_CLOSE() { return getToken(TesteLangParser.T_PAR_CLOSE, 0); }
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
		enterRule(_localctx, 6, RULE_exp_func_called);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ID_FUNC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(41);
				match(T_ID_FUNC);
				setState(42);
				match(T_PAR_OPEN);
				setState(43);
				match(T_PAR_CLOSE);
				}
				}
				break;
			case T_SYS_FUNC:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(44);
				match(T_SYS_FUNC);
				setState(45);
				match(T_PAR_OPEN);
				setState(46);
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
		enterRule(_localctx, 8, RULE_exp_stored_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_la = _input.LA(1);
			if ( !(_la==T_ID_VAR || _la==T_ID_CONST) ) {
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
		enterRule(_localctx, 10, RULE_exp_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
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
		enterRule(_localctx, 12, RULE_exp_arith_paren);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T_PAR_OPEN);
			setState(54);
			exp_arith();
			setState(55);
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
		public TerminalNode T_OP_MATH() { return getToken(TesteLangParser.T_OP_MATH, 0); }
		public List<Exp_numberContext> exp_number() {
			return getRuleContexts(Exp_numberContext.class);
		}
		public Exp_numberContext exp_number(int i) {
			return getRuleContext(Exp_numberContext.class,i);
		}
		public Exp_stored_valueContext exp_stored_value() {
			return getRuleContext(Exp_stored_valueContext.class,0);
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
		enterRule(_localctx, 14, RULE_exp_arith);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				exp_arith_paren();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(58);
				exp_arith_paren();
				setState(59);
				match(T_OP_MATH);
				setState(60);
				exp_arith_paren();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(62);
				exp_number();
				setState(63);
				match(T_OP_MATH);
				setState(64);
				exp_number();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(66);
				exp_stored_value();
				setState(67);
				match(T_OP_MATH);
				setState(68);
				exp_number();
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
		enterRule(_localctx, 16, RULE_exp_boolean);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(T_VAL_BOOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(73);
				exp_comparable();
				setState(74);
				match(T_OP_REL);
				setState(75);
				exp_comparable();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(77);
				match(T_OP_NOT);
				setState(78);
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
		enterRule(_localctx, 18, RULE_exp_comparable);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				exp_stored_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(T_VAL_BOOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				match(T_SYS_VAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				exp_number();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				exp_stored_value();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(86);
				match(T_PAR_OPEN);
				setState(87);
				exp_arith();
				setState(88);
				match(T_PAR_CLOSE);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(90);
				match(T_PAR_OPEN);
				setState(91);
				exp_boolean();
				setState(92);
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
		public Exp_stored_valueContext exp_stored_value() {
			return getRuleContext(Exp_stored_valueContext.class,0);
		}
		public Exp_booleanContext exp_boolean() {
			return getRuleContext(Exp_booleanContext.class,0);
		}
		public Exp_arithContext exp_arith() {
			return getRuleContext(Exp_arithContext.class,0);
		}
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
		enterRule(_localctx, 20, RULE_exp_value);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				exp_stored_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				exp_boolean();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				exp_arith();
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
		enterRule(_localctx, 22, RULE_exp_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(101);
			exp_stored_value();
			setState(102);
			match(T_OP_ATR);
			setState(103);
			exp_value();
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

	public static final String _serializedATN =
		"\u0004\u0001&j\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001\u001e\b\u0001"+
		"\n\u0001\f\u0001!\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002(\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00030\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007G\b\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bP\b\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t_\b\t\u0001\n\u0001\n\u0001\n\u0003\nd\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0002\u0001\u0000"+
		"\u001e\u001f\u0001\u0000!\"p\u0000\u0018\u0001\u0000\u0000\u0000\u0002"+
		"\u001f\u0001\u0000\u0000\u0000\u0004\'\u0001\u0000\u0000\u0000\u0006/"+
		"\u0001\u0000\u0000\u0000\b1\u0001\u0000\u0000\u0000\n3\u0001\u0000\u0000"+
		"\u0000\f5\u0001\u0000\u0000\u0000\u000eF\u0001\u0000\u0000\u0000\u0010"+
		"O\u0001\u0000\u0000\u0000\u0012^\u0001\u0000\u0000\u0000\u0014c\u0001"+
		"\u0000\u0000\u0000\u0016e\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u0001"+
		"\u0000\u0000\u0019\u001a\u0003\u0002\u0001\u0000\u001a\u001b\u0005\u0002"+
		"\u0000\u0000\u001b\u0001\u0001\u0000\u0000\u0000\u001c\u001e\u0003\u0004"+
		"\u0002\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000"+
		"\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000"+
		" \u0003\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"(\u0003"+
		"\u0006\u0003\u0000#(\u0003\b\u0004\u0000$(\u0003\n\u0005\u0000%(\u0003"+
		"\u0012\t\u0000&(\u0003\u0016\u000b\u0000\'\"\u0001\u0000\u0000\u0000\'"+
		"#\u0001\u0000\u0000\u0000\'$\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000"+
		"\u0000\'&\u0001\u0000\u0000\u0000(\u0005\u0001\u0000\u0000\u0000)*\u0005"+
		" \u0000\u0000*+\u0005\u0019\u0000\u0000+0\u0005\u001a\u0000\u0000,-\u0005"+
		"\u0015\u0000\u0000-.\u0005\u0019\u0000\u0000.0\u0005\u001a\u0000\u0000"+
		"/)\u0001\u0000\u0000\u0000/,\u0001\u0000\u0000\u00000\u0007\u0001\u0000"+
		"\u0000\u000012\u0007\u0000\u0000\u00002\t\u0001\u0000\u0000\u000034\u0007"+
		"\u0001\u0000\u00004\u000b\u0001\u0000\u0000\u000056\u0005\u0019\u0000"+
		"\u000067\u0003\u000e\u0007\u000078\u0005\u001a\u0000\u00008\r\u0001\u0000"+
		"\u0000\u00009G\u0003\f\u0006\u0000:;\u0003\f\u0006\u0000;<\u0005\u0005"+
		"\u0000\u0000<=\u0003\f\u0006\u0000=G\u0001\u0000\u0000\u0000>?\u0003\n"+
		"\u0005\u0000?@\u0005\u0005\u0000\u0000@A\u0003\n\u0005\u0000AG\u0001\u0000"+
		"\u0000\u0000BC\u0003\b\u0004\u0000CD\u0005\u0005\u0000\u0000DE\u0003\n"+
		"\u0005\u0000EG\u0001\u0000\u0000\u0000F9\u0001\u0000\u0000\u0000F:\u0001"+
		"\u0000\u0000\u0000F>\u0001\u0000\u0000\u0000FB\u0001\u0000\u0000\u0000"+
		"G\u000f\u0001\u0000\u0000\u0000HP\u0005\u001d\u0000\u0000IJ\u0003\u0012"+
		"\t\u0000JK\u0005\u0006\u0000\u0000KL\u0003\u0012\t\u0000LP\u0001\u0000"+
		"\u0000\u0000MN\u0005\t\u0000\u0000NP\u0003\u0010\b\u0000OH\u0001\u0000"+
		"\u0000\u0000OI\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000P\u0011"+
		"\u0001\u0000\u0000\u0000Q_\u0003\b\u0004\u0000R_\u0005\u001d\u0000\u0000"+
		"S_\u0005\u0014\u0000\u0000T_\u0003\n\u0005\u0000U_\u0003\b\u0004\u0000"+
		"VW\u0005\u0019\u0000\u0000WX\u0003\u000e\u0007\u0000XY\u0005\u001a\u0000"+
		"\u0000Y_\u0001\u0000\u0000\u0000Z[\u0005\u0019\u0000\u0000[\\\u0003\u0010"+
		"\b\u0000\\]\u0005\u001a\u0000\u0000]_\u0001\u0000\u0000\u0000^Q\u0001"+
		"\u0000\u0000\u0000^R\u0001\u0000\u0000\u0000^S\u0001\u0000\u0000\u0000"+
		"^T\u0001\u0000\u0000\u0000^U\u0001\u0000\u0000\u0000^V\u0001\u0000\u0000"+
		"\u0000^Z\u0001\u0000\u0000\u0000_\u0013\u0001\u0000\u0000\u0000`d\u0003"+
		"\b\u0004\u0000ad\u0003\u0010\b\u0000bd\u0003\u000e\u0007\u0000c`\u0001"+
		"\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000"+
		"d\u0015\u0001\u0000\u0000\u0000ef\u0003\b\u0004\u0000fg\u0005\u0007\u0000"+
		"\u0000gh\u0003\u0014\n\u0000h\u0017\u0001\u0000\u0000\u0000\u0007\u001f"+
		"\'/FO^c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}