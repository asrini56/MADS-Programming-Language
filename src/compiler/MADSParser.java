// Generated from MADS.g4 by ANTLR 4.8

    package compiler;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MADSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		DataType=25, DataTypeValue=26, LogicalOperator=27, RelationalOperator=28, 
		String=29, DIGIT=30, Integer=31, Float=32, BOOL=33, IDENTIFIER=34, NumberValue=35, 
		Keyword=36, Whitespace=37, Newline=38, BlockComment=39, LineComment=40;
	public static final int
		RULE_program = 0, RULE_statementList = 1, RULE_statement = 2, RULE_declaration = 3, 
		RULE_initializeStatement = 4, RULE_expr = 5, RULE_expr_term = 6, RULE_expr_fact = 7, 
		RULE_unaryExpr = 8, RULE_conditionStmt = 9, RULE_relationalExpr = 10, 
		RULE_logicalExpr = 11, RULE_ternaryOperator = 12, RULE_ternaryStatement = 13, 
		RULE_loopStatement = 14, RULE_ifLoop = 15, RULE_whileLoop = 16, RULE_forLoop = 17, 
		RULE_printStatement = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statementList", "statement", "declaration", "initializeStatement", 
			"expr", "expr_term", "expr_fact", "unaryExpr", "conditionStmt", "relationalExpr", 
			"logicalExpr", "ternaryOperator", "ternaryStatement", "loopStatement", 
			"ifLoop", "whileLoop", "forLoop", "printStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'('", "')'", "'{'", "'}'", "';'", "'='", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'++'", "'--'", "'!'", "'?'", "':'", "'if'", "'else'", 
			"'while'", "'for'", "'in range'", "','", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "DataType", "DataTypeValue", "LogicalOperator", "RelationalOperator", 
			"String", "DIGIT", "Integer", "Float", "BOOL", "IDENTIFIER", "NumberValue", 
			"Keyword", "Whitespace", "Newline", "BlockComment", "LineComment"
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
	public String getGrammarFileName() { return "MADS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MADSParser(TokenStream input) {
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
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__0);
			setState(39);
			match(T__1);
			setState(40);
			match(T__2);
			setState(41);
			match(T__3);
			setState(42);
			statementList(0);
			setState(43);
			match(T__4);
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
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		return statementList(0);
	}

	private StatementListContext statementList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementListContext _localctx = new StatementListContext(_ctx, _parentState);
		StatementListContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_statementList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(46);
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statementList);
					setState(48);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(49);
					statement();
					}
					} 
				}
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public TernaryOperatorContext ternaryOperator() {
			return getRuleContext(TernaryOperatorContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				declaration();
				setState(56);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				unaryExpr();
				setState(59);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				expr(0);
				setState(62);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				printStatement();
				setState(65);
				match(T__5);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(67);
				ternaryOperator();
				setState(68);
				match(T__5);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(70);
				loopStatement();
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
		public TerminalNode DataType() { return getToken(MADSParser.DataType, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MADSParser.IDENTIFIER, 0); }
		public InitializeStatementContext initializeStatement() {
			return getRuleContext(InitializeStatementContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(DataType);
				setState(74);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
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
		public Token varName;
		public TerminalNode DataType() { return getToken(MADSParser.DataType, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MADSParser.IDENTIFIER, 0); }
		public TerminalNode DataTypeValue() { return getToken(MADSParser.DataTypeValue, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InitializeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterInitializeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitInitializeStatement(this);
		}
	}

	public final InitializeStatementContext initializeStatement() throws RecognitionException {
		InitializeStatementContext _localctx = new InitializeStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_initializeStatement);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(DataType);
				setState(79);
				match(IDENTIFIER);
				setState(80);
				match(T__6);
				setState(81);
				match(DataTypeValue);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				((InitializeStatementContext)_localctx).varName = match(IDENTIFIER);
				setState(83);
				match(T__6);
				setState(84);
				match(DataTypeValue);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				((InitializeStatementContext)_localctx).varName = match(IDENTIFIER);
				setState(86);
				match(T__6);
				setState(87);
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
		public Expr_termContext expr_term() {
			return getRuleContext(Expr_termContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitExpr(this);
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
			{
			setState(91);
			expr_term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(99);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(93);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(94);
						match(T__7);
						setState(95);
						expr_term(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(96);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(97);
						match(T__8);
						setState(98);
						expr_term(0);
						}
						break;
					}
					} 
				}
				setState(103);
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

	public static class Expr_termContext extends ParserRuleContext {
		public Expr_factContext expr_fact() {
			return getRuleContext(Expr_factContext.class,0);
		}
		public Expr_termContext expr_term() {
			return getRuleContext(Expr_termContext.class,0);
		}
		public Expr_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterExpr_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitExpr_term(this);
		}
	}

	public final Expr_termContext expr_term() throws RecognitionException {
		return expr_term(0);
	}

	private Expr_termContext expr_term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_termContext _localctx = new Expr_termContext(_ctx, _parentState);
		Expr_termContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(105);
			expr_fact();
			}
			_ctx.stop = _input.LT(-1);
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(116);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_termContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_term);
						setState(107);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(108);
						match(T__9);
						setState(109);
						expr_fact();
						}
						break;
					case 2:
						{
						_localctx = new Expr_termContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_term);
						setState(110);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(111);
						match(T__10);
						setState(112);
						expr_fact();
						}
						break;
					case 3:
						{
						_localctx = new Expr_termContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_term);
						setState(113);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(114);
						match(T__11);
						setState(115);
						expr_fact();
						}
						break;
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class Expr_factContext extends ParserRuleContext {
		public Token varName;
		public Token num;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MADSParser.IDENTIFIER, 0); }
		public TerminalNode DIGIT() { return getToken(MADSParser.DIGIT, 0); }
		public Expr_factContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_fact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterExpr_fact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitExpr_fact(this);
		}
	}

	public final Expr_factContext expr_fact() throws RecognitionException {
		Expr_factContext _localctx = new Expr_factContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr_fact);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(T__1);
				setState(122);
				expr(0);
				setState(123);
				match(T__2);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				((Expr_factContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				((Expr_factContext)_localctx).num = match(DIGIT);
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

	public static class UnaryExprContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MADSParser.IDENTIFIER, 0); }
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitUnaryExpr(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unaryExpr);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(T__12);
				setState(130);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(T__13);
				setState(132);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				match(IDENTIFIER);
				setState(134);
				match(T__12);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				match(IDENTIFIER);
				setState(136);
				match(T__13);
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

	public static class ConditionStmtContext extends ParserRuleContext {
		public List<ConditionStmtContext> conditionStmt() {
			return getRuleContexts(ConditionStmtContext.class);
		}
		public ConditionStmtContext conditionStmt(int i) {
			return getRuleContext(ConditionStmtContext.class,i);
		}
		public RelationalExprContext relationalExpr() {
			return getRuleContext(RelationalExprContext.class,0);
		}
		public LogicalExprContext logicalExpr() {
			return getRuleContext(LogicalExprContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(MADSParser.BOOL, 0); }
		public TerminalNode LogicalOperator() { return getToken(MADSParser.LogicalOperator, 0); }
		public ConditionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterConditionStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitConditionStmt(this);
		}
	}

	public final ConditionStmtContext conditionStmt() throws RecognitionException {
		return conditionStmt(0);
	}

	private ConditionStmtContext conditionStmt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionStmtContext _localctx = new ConditionStmtContext(_ctx, _parentState);
		ConditionStmtContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_conditionStmt, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(140);
				match(T__14);
				setState(141);
				conditionStmt(4);
				}
				break;
			case 2:
				{
				setState(142);
				relationalExpr();
				}
				break;
			case 3:
				{
				setState(143);
				logicalExpr();
				}
				break;
			case 4:
				{
				setState(144);
				match(BOOL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionStmtContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionStmt);
					setState(147);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(148);
					match(LogicalOperator);
					setState(149);
					conditionStmt(6);
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class RelationalExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RelationalOperator() { return getToken(MADSParser.RelationalOperator, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MADSParser.IDENTIFIER, 0); }
		public TerminalNode BOOL() { return getToken(MADSParser.BOOL, 0); }
		public RelationalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitRelationalExpr(this);
		}
	}

	public final RelationalExprContext relationalExpr() throws RecognitionException {
		RelationalExprContext _localctx = new RelationalExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_relationalExpr);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				expr(0);
				setState(156);
				match(RelationalOperator);
				setState(157);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(BOOL);
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

	public static class LogicalExprContext extends ParserRuleContext {
		public List<RelationalExprContext> relationalExpr() {
			return getRuleContexts(RelationalExprContext.class);
		}
		public RelationalExprContext relationalExpr(int i) {
			return getRuleContext(RelationalExprContext.class,i);
		}
		public TerminalNode LogicalOperator() { return getToken(MADSParser.LogicalOperator, 0); }
		public LogicalExprContext logicalExpr() {
			return getRuleContext(LogicalExprContext.class,0);
		}
		public LogicalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterLogicalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitLogicalExpr(this);
		}
	}

	public final LogicalExprContext logicalExpr() throws RecognitionException {
		LogicalExprContext _localctx = new LogicalExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_logicalExpr);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				relationalExpr();
				setState(164);
				match(LogicalOperator);
				setState(165);
				relationalExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				relationalExpr();
				setState(168);
				match(LogicalOperator);
				setState(169);
				logicalExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				match(T__14);
				setState(172);
				relationalExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				match(T__14);
				setState(174);
				logicalExpr();
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

	public static class TernaryOperatorContext extends ParserRuleContext {
		public ConditionStmtContext conditionStmt() {
			return getRuleContext(ConditionStmtContext.class,0);
		}
		public List<TernaryStatementContext> ternaryStatement() {
			return getRuleContexts(TernaryStatementContext.class);
		}
		public TernaryStatementContext ternaryStatement(int i) {
			return getRuleContext(TernaryStatementContext.class,i);
		}
		public TernaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterTernaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitTernaryOperator(this);
		}
	}

	public final TernaryOperatorContext ternaryOperator() throws RecognitionException {
		TernaryOperatorContext _localctx = new TernaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ternaryOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			conditionStmt(0);
			setState(178);
			match(T__15);
			setState(179);
			ternaryStatement();
			setState(180);
			match(T__16);
			setState(181);
			ternaryStatement();
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

	public static class TernaryStatementContext extends ParserRuleContext {
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public InitializeStatementContext initializeStatement() {
			return getRuleContext(InitializeStatementContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(MADSParser.BOOL, 0); }
		public TernaryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterTernaryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitTernaryStatement(this);
		}
	}

	public final TernaryStatementContext ternaryStatement() throws RecognitionException {
		TernaryStatementContext _localctx = new TernaryStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ternaryStatement);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				printStatement();
				}
				break;
			case DataType:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				initializeStatement();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				match(BOOL);
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

	public static class LoopStatementContext extends ParserRuleContext {
		public IfLoopContext ifLoop() {
			return getRuleContext(IfLoopContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitLoopStatement(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_loopStatement);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				ifLoop();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				whileLoop();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				forLoop();
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

	public static class IfLoopContext extends ParserRuleContext {
		public ConditionStmtContext conditionStmt() {
			return getRuleContext(ConditionStmtContext.class,0);
		}
		public List<StatementListContext> statementList() {
			return getRuleContexts(StatementListContext.class);
		}
		public StatementListContext statementList(int i) {
			return getRuleContext(StatementListContext.class,i);
		}
		public IfLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterIfLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitIfLoop(this);
		}
	}

	public final IfLoopContext ifLoop() throws RecognitionException {
		IfLoopContext _localctx = new IfLoopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ifLoop);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(T__17);
				setState(194);
				match(T__1);
				setState(195);
				conditionStmt(0);
				setState(196);
				match(T__2);
				setState(197);
				match(T__3);
				setState(198);
				statementList(0);
				setState(199);
				match(T__4);
				setState(200);
				match(T__18);
				setState(201);
				match(T__3);
				setState(202);
				statementList(0);
				setState(203);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(T__17);
				setState(206);
				match(T__1);
				setState(207);
				conditionStmt(0);
				setState(208);
				match(T__2);
				setState(209);
				match(T__3);
				setState(210);
				statementList(0);
				setState(211);
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

	public static class WhileLoopContext extends ParserRuleContext {
		public ConditionStmtContext conditionStmt() {
			return getRuleContext(ConditionStmtContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitWhileLoop(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(T__19);
			setState(216);
			match(T__1);
			setState(217);
			conditionStmt(0);
			setState(218);
			match(T__2);
			setState(219);
			match(T__3);
			setState(220);
			statementList(0);
			setState(221);
			match(T__4);
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

	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MADSParser.IDENTIFIER, 0); }
		public List<TerminalNode> NumberValue() { return getTokens(MADSParser.NumberValue); }
		public TerminalNode NumberValue(int i) {
			return getToken(MADSParser.NumberValue, i);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public InitializeStatementContext initializeStatement() {
			return getRuleContext(InitializeStatementContext.class,0);
		}
		public ConditionStmtContext conditionStmt() {
			return getRuleContext(ConditionStmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitForLoop(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forLoop);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(T__20);
				setState(224);
				match(IDENTIFIER);
				setState(225);
				match(T__21);
				setState(226);
				match(T__1);
				setState(227);
				match(NumberValue);
				setState(228);
				match(T__22);
				setState(229);
				match(NumberValue);
				setState(230);
				match(T__2);
				setState(231);
				match(T__3);
				setState(232);
				statementList(0);
				setState(233);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(T__20);
				setState(236);
				match(T__1);
				setState(237);
				initializeStatement();
				setState(238);
				match(T__5);
				setState(239);
				conditionStmt(0);
				setState(240);
				match(T__5);
				setState(241);
				expr(0);
				setState(242);
				match(T__2);
				setState(243);
				match(T__3);
				setState(244);
				statementList(0);
				setState(245);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				match(T__20);
				setState(248);
				match(T__1);
				setState(249);
				initializeStatement();
				setState(250);
				match(T__5);
				setState(251);
				conditionStmt(0);
				setState(252);
				match(T__5);
				setState(253);
				unaryExpr();
				setState(254);
				match(T__2);
				setState(255);
				match(T__3);
				setState(256);
				statementList(0);
				setState(257);
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

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MADSParser.IDENTIFIER, 0); }
		public TerminalNode String() { return getToken(MADSParser.String, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitPrintStatement(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_printStatement);
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(T__23);
				setState(262);
				match(T__1);
				setState(263);
				match(IDENTIFIER);
				setState(264);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(T__23);
				setState(266);
				match(T__1);
				setState(267);
				match(String);
				setState(268);
				match(T__2);
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
		case 1:
			return statementList_sempred((StatementListContext)_localctx, predIndex);
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 6:
			return expr_term_sempred((Expr_termContext)_localctx, predIndex);
		case 9:
			return conditionStmt_sempred((ConditionStmtContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean statementList_sempred(StatementListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_term_sempred(Expr_termContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean conditionStmt_sempred(ConditionStmtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u0112\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7"+
		"\3\65\n\3\f\3\16\38\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4J\n\4\3\5\3\5\3\5\5\5O\n\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6[\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7f\n"+
		"\7\f\7\16\7i\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b"+
		"w\n\b\f\b\16\bz\13\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0082\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u008c\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u0094\n\13\3\13\3\13\3\13\7\13\u0099\n\13\f\13\16\13\u009c\13\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u00a4\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u00b2\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\5\17\u00bd\n\17\3\20\3\20\3\20\5\20\u00c2\n\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\5\21\u00d8\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0106\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u0110\n\24\3\24\2\6\4\f\16\24\25\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&\2\2\2\u0122\2(\3\2\2\2\4/\3\2\2\2\6I"+
		"\3\2\2\2\bN\3\2\2\2\nZ\3\2\2\2\f\\\3\2\2\2\16j\3\2\2\2\20\u0081\3\2\2"+
		"\2\22\u008b\3\2\2\2\24\u0093\3\2\2\2\26\u00a3\3\2\2\2\30\u00b1\3\2\2\2"+
		"\32\u00b3\3\2\2\2\34\u00bc\3\2\2\2\36\u00c1\3\2\2\2 \u00d7\3\2\2\2\"\u00d9"+
		"\3\2\2\2$\u0105\3\2\2\2&\u010f\3\2\2\2()\7\3\2\2)*\7\4\2\2*+\7\5\2\2+"+
		",\7\6\2\2,-\5\4\3\2-.\7\7\2\2.\3\3\2\2\2/\60\b\3\1\2\60\61\5\6\4\2\61"+
		"\66\3\2\2\2\62\63\f\4\2\2\63\65\5\6\4\2\64\62\3\2\2\2\658\3\2\2\2\66\64"+
		"\3\2\2\2\66\67\3\2\2\2\67\5\3\2\2\28\66\3\2\2\29:\5\b\5\2:;\7\b\2\2;J"+
		"\3\2\2\2<=\5\22\n\2=>\7\b\2\2>J\3\2\2\2?@\5\f\7\2@A\7\b\2\2AJ\3\2\2\2"+
		"BC\5&\24\2CD\7\b\2\2DJ\3\2\2\2EF\5\32\16\2FG\7\b\2\2GJ\3\2\2\2HJ\5\36"+
		"\20\2I9\3\2\2\2I<\3\2\2\2I?\3\2\2\2IB\3\2\2\2IE\3\2\2\2IH\3\2\2\2J\7\3"+
		"\2\2\2KL\7\33\2\2LO\7$\2\2MO\5\n\6\2NK\3\2\2\2NM\3\2\2\2O\t\3\2\2\2PQ"+
		"\7\33\2\2QR\7$\2\2RS\7\t\2\2S[\7\34\2\2TU\7$\2\2UV\7\t\2\2V[\7\34\2\2"+
		"WX\7$\2\2XY\7\t\2\2Y[\5\f\7\2ZP\3\2\2\2ZT\3\2\2\2ZW\3\2\2\2[\13\3\2\2"+
		"\2\\]\b\7\1\2]^\5\16\b\2^g\3\2\2\2_`\f\5\2\2`a\7\n\2\2af\5\16\b\2bc\f"+
		"\4\2\2cd\7\13\2\2df\5\16\b\2e_\3\2\2\2eb\3\2\2\2fi\3\2\2\2ge\3\2\2\2g"+
		"h\3\2\2\2h\r\3\2\2\2ig\3\2\2\2jk\b\b\1\2kl\5\20\t\2lx\3\2\2\2mn\f\6\2"+
		"\2no\7\f\2\2ow\5\20\t\2pq\f\5\2\2qr\7\r\2\2rw\5\20\t\2st\f\4\2\2tu\7\16"+
		"\2\2uw\5\20\t\2vm\3\2\2\2vp\3\2\2\2vs\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3"+
		"\2\2\2y\17\3\2\2\2zx\3\2\2\2{|\7\4\2\2|}\5\f\7\2}~\7\5\2\2~\u0082\3\2"+
		"\2\2\177\u0082\7$\2\2\u0080\u0082\7 \2\2\u0081{\3\2\2\2\u0081\177\3\2"+
		"\2\2\u0081\u0080\3\2\2\2\u0082\21\3\2\2\2\u0083\u0084\7\17\2\2\u0084\u008c"+
		"\7$\2\2\u0085\u0086\7\20\2\2\u0086\u008c\7$\2\2\u0087\u0088\7$\2\2\u0088"+
		"\u008c\7\17\2\2\u0089\u008a\7$\2\2\u008a\u008c\7\20\2\2\u008b\u0083\3"+
		"\2\2\2\u008b\u0085\3\2\2\2\u008b\u0087\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\23\3\2\2\2\u008d\u008e\b\13\1\2\u008e\u008f\7\21\2\2\u008f\u0094\5\24"+
		"\13\6\u0090\u0094\5\26\f\2\u0091\u0094\5\30\r\2\u0092\u0094\7#\2\2\u0093"+
		"\u008d\3\2\2\2\u0093\u0090\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2"+
		"\2\2\u0094\u009a\3\2\2\2\u0095\u0096\f\7\2\2\u0096\u0097\7\35\2\2\u0097"+
		"\u0099\5\24\13\b\u0098\u0095\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3"+
		"\2\2\2\u009a\u009b\3\2\2\2\u009b\25\3\2\2\2\u009c\u009a\3\2\2\2\u009d"+
		"\u009e\5\f\7\2\u009e\u009f\7\36\2\2\u009f\u00a0\5\f\7\2\u00a0\u00a4\3"+
		"\2\2\2\u00a1\u00a4\7$\2\2\u00a2\u00a4\7#\2\2\u00a3\u009d\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\27\3\2\2\2\u00a5\u00a6\5\26\f"+
		"\2\u00a6\u00a7\7\35\2\2\u00a7\u00a8\5\26\f\2\u00a8\u00b2\3\2\2\2\u00a9"+
		"\u00aa\5\26\f\2\u00aa\u00ab\7\35\2\2\u00ab\u00ac\5\30\r\2\u00ac\u00b2"+
		"\3\2\2\2\u00ad\u00ae\7\21\2\2\u00ae\u00b2\5\26\f\2\u00af\u00b0\7\21\2"+
		"\2\u00b0\u00b2\5\30\r\2\u00b1\u00a5\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b1"+
		"\u00ad\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\31\3\2\2\2\u00b3\u00b4\5\24\13"+
		"\2\u00b4\u00b5\7\22\2\2\u00b5\u00b6\5\34\17\2\u00b6\u00b7\7\23\2\2\u00b7"+
		"\u00b8\5\34\17\2\u00b8\33\3\2\2\2\u00b9\u00bd\5&\24\2\u00ba\u00bd\5\n"+
		"\6\2\u00bb\u00bd\7#\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bb\3\2\2\2\u00bd\35\3\2\2\2\u00be\u00c2\5 \21\2\u00bf\u00c2\5\"\22"+
		"\2\u00c0\u00c2\5$\23\2\u00c1\u00be\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0"+
		"\3\2\2\2\u00c2\37\3\2\2\2\u00c3\u00c4\7\24\2\2\u00c4\u00c5\7\4\2\2\u00c5"+
		"\u00c6\5\24\13\2\u00c6\u00c7\7\5\2\2\u00c7\u00c8\7\6\2\2\u00c8\u00c9\5"+
		"\4\3\2\u00c9\u00ca\7\7\2\2\u00ca\u00cb\7\25\2\2\u00cb\u00cc\7\6\2\2\u00cc"+
		"\u00cd\5\4\3\2\u00cd\u00ce\7\7\2\2\u00ce\u00d8\3\2\2\2\u00cf\u00d0\7\24"+
		"\2\2\u00d0\u00d1\7\4\2\2\u00d1\u00d2\5\24\13\2\u00d2\u00d3\7\5\2\2\u00d3"+
		"\u00d4\7\6\2\2\u00d4\u00d5\5\4\3\2\u00d5\u00d6\7\7\2\2\u00d6\u00d8\3\2"+
		"\2\2\u00d7\u00c3\3\2\2\2\u00d7\u00cf\3\2\2\2\u00d8!\3\2\2\2\u00d9\u00da"+
		"\7\26\2\2\u00da\u00db\7\4\2\2\u00db\u00dc\5\24\13\2\u00dc\u00dd\7\5\2"+
		"\2\u00dd\u00de\7\6\2\2\u00de\u00df\5\4\3\2\u00df\u00e0\7\7\2\2\u00e0#"+
		"\3\2\2\2\u00e1\u00e2\7\27\2\2\u00e2\u00e3\7$\2\2\u00e3\u00e4\7\30\2\2"+
		"\u00e4\u00e5\7\4\2\2\u00e5\u00e6\7%\2\2\u00e6\u00e7\7\31\2\2\u00e7\u00e8"+
		"\7%\2\2\u00e8\u00e9\7\5\2\2\u00e9\u00ea\7\6\2\2\u00ea\u00eb\5\4\3\2\u00eb"+
		"\u00ec\7\7\2\2\u00ec\u0106\3\2\2\2\u00ed\u00ee\7\27\2\2\u00ee\u00ef\7"+
		"\4\2\2\u00ef\u00f0\5\n\6\2\u00f0\u00f1\7\b\2\2\u00f1\u00f2\5\24\13\2\u00f2"+
		"\u00f3\7\b\2\2\u00f3\u00f4\5\f\7\2\u00f4\u00f5\7\5\2\2\u00f5\u00f6\7\6"+
		"\2\2\u00f6\u00f7\5\4\3\2\u00f7\u00f8\7\7\2\2\u00f8\u0106\3\2\2\2\u00f9"+
		"\u00fa\7\27\2\2\u00fa\u00fb\7\4\2\2\u00fb\u00fc\5\n\6\2\u00fc\u00fd\7"+
		"\b\2\2\u00fd\u00fe\5\24\13\2\u00fe\u00ff\7\b\2\2\u00ff\u0100\5\22\n\2"+
		"\u0100\u0101\7\5\2\2\u0101\u0102\7\6\2\2\u0102\u0103\5\4\3\2\u0103\u0104"+
		"\7\7\2\2\u0104\u0106\3\2\2\2\u0105\u00e1\3\2\2\2\u0105\u00ed\3\2\2\2\u0105"+
		"\u00f9\3\2\2\2\u0106%\3\2\2\2\u0107\u0108\7\32\2\2\u0108\u0109\7\4\2\2"+
		"\u0109\u010a\7$\2\2\u010a\u0110\7\5\2\2\u010b\u010c\7\32\2\2\u010c\u010d"+
		"\7\4\2\2\u010d\u010e\7\37\2\2\u010e\u0110\7\5\2\2\u010f\u0107\3\2\2\2"+
		"\u010f\u010b\3\2\2\2\u0110\'\3\2\2\2\25\66INZegvx\u0081\u008b\u0093\u009a"+
		"\u00a3\u00b1\u00bc\u00c1\u00d7\u0105\u010f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}