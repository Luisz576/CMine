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
		RULE_program = 0, RULE_prog = 1, RULE_expr = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "prog", "expr"
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
		public List<TerminalNode> T_VAL_INT() { return getTokens(TesteLangParser.T_VAL_INT); }
		public TerminalNode T_VAL_INT(int i) {
			return getToken(TesteLangParser.T_VAL_INT, i);
		}
		public TerminalNode T_OP_LOG() { return getToken(TesteLangParser.T_OP_LOG, 0); }
		public TerminalNode T_END_C() { return getToken(TesteLangParser.T_END_C, 0); }
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
			setState(6);
			match(T_VAL_INT);
			setState(7);
			match(T_OP_LOG);
			setState(8);
			match(T_VAL_INT);
			setState(9);
			match(T_END_C);
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
			setState(14);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_VAL_INT) {
				{
				{
				setState(11);
				expr();
				}
				}
				setState(16);
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
		public List<TerminalNode> T_VAL_INT() { return getTokens(TesteLangParser.T_VAL_INT); }
		public TerminalNode T_VAL_INT(int i) {
			return getToken(TesteLangParser.T_VAL_INT, i);
		}
		public TerminalNode T_OP_LOG() { return getToken(TesteLangParser.T_OP_LOG, 0); }
		public TerminalNode T_END_C() { return getToken(TesteLangParser.T_END_C, 0); }
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
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(T_VAL_INT);
			setState(18);
			match(T_OP_LOG);
			setState(19);
			match(T_VAL_INT);
			setState(20);
			match(T_END_C);
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
		"\u0004\u0001&\u0017\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0005\u0001\r\b\u0001\n\u0001\f\u0001\u0010\t\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0000\u0000\u0003\u0000\u0002\u0004\u0000\u0000\u0014\u0000\u0006\u0001"+
		"\u0000\u0000\u0000\u0002\u000e\u0001\u0000\u0000\u0000\u0004\u0011\u0001"+
		"\u0000\u0000\u0000\u0006\u0007\u0005!\u0000\u0000\u0007\b\u0005\b\u0000"+
		"\u0000\b\t\u0005!\u0000\u0000\t\n\u0005\u0016\u0000\u0000\n\u0001\u0001"+
		"\u0000\u0000\u0000\u000b\r\u0003\u0004\u0002\u0000\f\u000b\u0001\u0000"+
		"\u0000\u0000\r\u0010\u0001\u0000\u0000\u0000\u000e\f\u0001\u0000\u0000"+
		"\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f\u0003\u0001\u0000\u0000"+
		"\u0000\u0010\u000e\u0001\u0000\u0000\u0000\u0011\u0012\u0005!\u0000\u0000"+
		"\u0012\u0013\u0005\b\u0000\u0000\u0013\u0014\u0005!\u0000\u0000\u0014"+
		"\u0015\u0005\u0016\u0000\u0000\u0015\u0005\u0001\u0000\u0000\u0000\u0001"+
		"\u000e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}