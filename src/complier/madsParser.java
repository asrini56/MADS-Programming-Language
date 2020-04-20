// Generated from mads.g4 by ANTLR 4.8

	package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class madsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, DataType=11, DataTypeValue=12, LogicalOperator=13, RelationalOperator=14, 
		String=15, Digit=16, Integer=17, Float=18, Bool=19, Identifier=20, NumberValue=21, 
		Keyword=22;
	public static final int
		RULE_program = 0, RULE_statementList = 1, RULE_statement = 2, RULE_declaration = 3, 
		RULE_initializeStatement = 4, RULE_expr = 5, RULE_printStatement = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statementList", "statement", "declaration", "initializeStatement", 
			"expr", "printStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'start'", "'{'", "'}'", "'end'", "';'", "'='", "'+'", "'print'", 
			"'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "DataType", 
			"DataTypeValue", "LogicalOperator", "RelationalOperator", "String", "Digit", 
			"Integer", "Float", "Bool", "Identifier", "NumberValue", "Keyword"
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
	public String getGrammarFileName() { return "mads.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public madsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof madsListener ) ((madsListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof madsListener ) ((madsListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(T__0);
			setState(15);
			match(T__1);
			setState(16);
			statementList();
			setState(17);
			match(T__2);
			setState(18);
			match(T__3);
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

	public static class StatementListContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof madsListener ) ((madsListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof madsListener ) ((madsListener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statementList);
		try {
			setState(24);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				statement();
				setState(21);
				statementList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				statement();
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

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof madsListener ) ((madsListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof madsListener ) ((madsListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				declaration();
				setState(27);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				expr(0);
				setState(30);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				printStatement();
				setState(33);
				match(T__4);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode DataType() { return getToken(madsParser.DataType, 0); }
		public TerminalNode Identifier() { return getToken(madsParser.Identifier, 0); }
		public InitializeStatementContext initializeStatement() {
			return getRuleContext(InitializeStatementContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof madsListener ) ((madsListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof madsListener ) ((madsListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				match(DataType);
				setState(38);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				initializeStatement();
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

	public static class InitializeStatementContext extends ParserRuleContext {
		public TerminalNode DataType() { return getToken(madsParser.DataType, 0); }
		public TerminalNode Identifier() { return getToken(madsParser.Identifier, 0); }
		public TerminalNode DataTypeValue() { return getToken(madsParser.DataTypeValue, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InitializeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof madsListener ) ((madsListener)listener).enterInitializeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof madsListener ) ((madsListener)listener).exitInitializeStatement(this);
		}
	}

	public final InitializeStatementContext initializeStatement() throws RecognitionException {
		InitializeStatementContext _localctx = new InitializeStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_initializeStatement);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(DataType);
				setState(43);
				match(Identifier);
				setState(44);
				match(T__5);
				setState(45);
				match(DataTypeValue);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				match(Identifier);
				setState(47);
				match(T__5);
				setState(48);
				match(DataTypeValue);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				match(Identifier);
				setState(50);
				match(T__5);
				setState(51);
				expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(madsParser.Identifier, 0); }
		public TerminalNode Digit() { return getToken(madsParser.Digit, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof madsListener ) ((madsListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof madsListener ) ((madsListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(55);
				match(Identifier);
				}
				break;
			case Digit:
				{
				setState(56);
				match(Digit);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(59);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(60);
					match(T__6);
					setState(61);
					expr(4);
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(madsParser.Identifier, 0); }
		public TerminalNode String() { return getToken(madsParser.String, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof madsListener ) ((madsListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof madsListener ) ((madsListener)listener).exitPrintStatement(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_printStatement);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(T__7);
				setState(68);
				match(T__8);
				setState(69);
				match(Identifier);
				setState(70);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(T__7);
				setState(72);
				match(T__8);
				setState(73);
				match(String);
				setState(74);
				match(T__9);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30P\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4&\n\4\3"+
		"\5\3\5\3\5\5\5+\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\67\n\6"+
		"\3\7\3\7\3\7\5\7<\n\7\3\7\3\7\3\7\7\7A\n\7\f\7\16\7D\13\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\bN\n\b\3\b\2\3\f\t\2\4\6\b\n\f\16\2\2\2Q\2\20\3"+
		"\2\2\2\4\32\3\2\2\2\6%\3\2\2\2\b*\3\2\2\2\n\66\3\2\2\2\f;\3\2\2\2\16M"+
		"\3\2\2\2\20\21\7\3\2\2\21\22\7\4\2\2\22\23\5\4\3\2\23\24\7\5\2\2\24\25"+
		"\7\6\2\2\25\3\3\2\2\2\26\27\5\6\4\2\27\30\5\4\3\2\30\33\3\2\2\2\31\33"+
		"\5\6\4\2\32\26\3\2\2\2\32\31\3\2\2\2\33\5\3\2\2\2\34\35\5\b\5\2\35\36"+
		"\7\7\2\2\36&\3\2\2\2\37 \5\f\7\2 !\7\7\2\2!&\3\2\2\2\"#\5\16\b\2#$\7\7"+
		"\2\2$&\3\2\2\2%\34\3\2\2\2%\37\3\2\2\2%\"\3\2\2\2&\7\3\2\2\2\'(\7\r\2"+
		"\2(+\7\26\2\2)+\5\n\6\2*\'\3\2\2\2*)\3\2\2\2+\t\3\2\2\2,-\7\r\2\2-.\7"+
		"\26\2\2./\7\b\2\2/\67\7\16\2\2\60\61\7\26\2\2\61\62\7\b\2\2\62\67\7\16"+
		"\2\2\63\64\7\26\2\2\64\65\7\b\2\2\65\67\5\f\7\2\66,\3\2\2\2\66\60\3\2"+
		"\2\2\66\63\3\2\2\2\67\13\3\2\2\289\b\7\1\29<\7\26\2\2:<\7\22\2\2;8\3\2"+
		"\2\2;:\3\2\2\2<B\3\2\2\2=>\f\5\2\2>?\7\t\2\2?A\5\f\7\6@=\3\2\2\2AD\3\2"+
		"\2\2B@\3\2\2\2BC\3\2\2\2C\r\3\2\2\2DB\3\2\2\2EF\7\n\2\2FG\7\13\2\2GH\7"+
		"\26\2\2HN\7\f\2\2IJ\7\n\2\2JK\7\13\2\2KL\7\21\2\2LN\7\f\2\2ME\3\2\2\2"+
		"MI\3\2\2\2N\17\3\2\2\2\t\32%*\66;BM";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}