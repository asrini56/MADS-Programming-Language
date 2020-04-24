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
		String=29, DIGIT=30, Integer=31, Float=32, Bool=33, IDENTIFIER=34, NumberValue=35, 
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
			"String", "DIGIT", "Integer", "Float", "Bool", "IDENTIFIER", "NumberValue", 
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
			statementList();
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
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statementList);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				statement();
				setState(46);
				statementList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
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
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public TernaryOperatorContext ternaryOperator() {
			return getRuleContext(TernaryOperatorContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
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
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				declaration();
				setState(52);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				printStatement();
				setState(55);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				ternaryOperator();
				setState(58);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				loopStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				unaryExpr();
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
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(DataType);
				setState(65);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
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
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(DataType);
				setState(70);
				match(IDENTIFIER);
				setState(71);
				match(T__6);
				setState(72);
				match(DataTypeValue);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				((InitializeStatementContext)_localctx).varName = match(IDENTIFIER);
				setState(74);
				match(T__6);
				setState(75);
				match(DataTypeValue);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				((InitializeStatementContext)_localctx).varName = match(IDENTIFIER);
				setState(77);
				match(T__6);
				setState(78);
				expr();
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
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				expr_term();
				setState(82);
				match(T__7);
				setState(83);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				expr_term();
				setState(86);
				match(T__8);
				setState(87);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				expr_term();
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
		Expr_termContext _localctx = new Expr_termContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr_term);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				expr_fact();
				setState(93);
				match(T__9);
				setState(94);
				expr_term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				expr_fact();
				setState(97);
				match(T__10);
				setState(98);
				expr_term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				expr_fact();
				setState(101);
				match(T__11);
				setState(102);
				expr_term();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				expr_fact();
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
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(T__1);
				setState(108);
				expr();
				setState(109);
				match(T__2);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				((Expr_factContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
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
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(T__12);
				setState(116);
				match(IDENTIFIER);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(T__13);
				setState(118);
				match(IDENTIFIER);
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
		public TerminalNode Bool() { return getToken(MADSParser.Bool, 0); }
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
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(122);
				match(T__14);
				setState(123);
				conditionStmt(4);
				}
				break;
			case 2:
				{
				setState(124);
				relationalExpr();
				}
				break;
			case 3:
				{
				setState(125);
				logicalExpr();
				}
				break;
			case 4:
				{
				setState(126);
				match(Bool);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionStmtContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionStmt);
					setState(129);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(130);
					match(LogicalOperator);
					setState(131);
					conditionStmt(6);
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		public TerminalNode Bool() { return getToken(MADSParser.Bool, 0); }
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
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				expr();
				setState(138);
				match(RelationalOperator);
				setState(139);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				match(Bool);
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
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				relationalExpr();
				setState(146);
				match(LogicalOperator);
				setState(147);
				relationalExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				relationalExpr();
				setState(150);
				match(LogicalOperator);
				setState(151);
				logicalExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				match(T__14);
				setState(154);
				relationalExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				match(T__14);
				setState(156);
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
			setState(159);
			conditionStmt(0);
			setState(160);
			match(T__15);
			setState(161);
			ternaryStatement();
			setState(162);
			match(T__16);
			setState(163);
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
		public TerminalNode Bool() { return getToken(MADSParser.Bool, 0); }
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
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				printStatement();
				}
				break;
			case DataType:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				initializeStatement();
				}
				break;
			case Bool:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(Bool);
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
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				ifLoop();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				whileLoop();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__17);
			setState(176);
			match(T__1);
			setState(177);
			conditionStmt(0);
			setState(178);
			match(T__2);
			setState(179);
			match(T__3);
			setState(180);
			statement();
			setState(181);
			match(T__4);
			setState(182);
			match(T__18);
			setState(183);
			match(T__3);
			setState(184);
			statement();
			setState(185);
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

	public static class WhileLoopContext extends ParserRuleContext {
		public ConditionStmtContext conditionStmt() {
			return getRuleContext(ConditionStmtContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
			setState(187);
			match(T__19);
			setState(188);
			match(T__1);
			setState(189);
			conditionStmt(0);
			setState(190);
			match(T__2);
			setState(191);
			match(T__3);
			setState(192);
			statement();
			setState(193);
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(T__20);
				setState(196);
				match(IDENTIFIER);
				setState(197);
				match(T__21);
				setState(198);
				match(T__1);
				setState(199);
				match(NumberValue);
				setState(200);
				match(T__22);
				setState(201);
				match(NumberValue);
				setState(202);
				match(T__2);
				setState(203);
				match(T__3);
				setState(204);
				statement();
				setState(205);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(T__20);
				setState(208);
				match(T__1);
				setState(209);
				initializeStatement();
				setState(210);
				match(T__5);
				setState(211);
				conditionStmt(0);
				setState(212);
				match(T__5);
				setState(213);
				expr();
				setState(214);
				match(T__2);
				setState(215);
				match(T__3);
				setState(216);
				statement();
				setState(217);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				match(T__20);
				setState(220);
				match(T__1);
				setState(221);
				initializeStatement();
				setState(222);
				match(T__5);
				setState(223);
				conditionStmt(0);
				setState(224);
				match(T__5);
				setState(225);
				unaryExpr();
				setState(226);
				match(T__2);
				setState(227);
				match(T__3);
				setState(228);
				statement();
				setState(229);
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
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(T__23);
				setState(234);
				match(T__1);
				setState(235);
				match(IDENTIFIER);
				setState(236);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(T__23);
				setState(238);
				match(T__1);
				setState(239);
				match(String);
				setState(240);
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
		case 9:
			return conditionStmt_sempred((ConditionStmtContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean conditionStmt_sempred(ConditionStmtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00f6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\64"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4A\n\4\3\5\3\5\3\5"+
		"\5\5F\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6R\n\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7]\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\bl\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tt\n\t\3\n\3\n\3\n"+
		"\3\n\5\nz\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0082\n\13\3\13\3\13"+
		"\3\13\7\13\u0087\n\13\f\13\16\13\u008a\13\13\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u0092\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a0"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\5\17\u00ab\n\17\3\20"+
		"\3\20\3\20\5\20\u00b0\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u00ea\n\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u00f4\n\24\3\24\2\3\24\25\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&\2\2\2\u0102\2(\3\2\2\2\4\63\3\2\2\2\6@\3\2\2\2\bE\3\2\2"+
		"\2\nQ\3\2\2\2\f\\\3\2\2\2\16k\3\2\2\2\20s\3\2\2\2\22y\3\2\2\2\24\u0081"+
		"\3\2\2\2\26\u0091\3\2\2\2\30\u009f\3\2\2\2\32\u00a1\3\2\2\2\34\u00aa\3"+
		"\2\2\2\36\u00af\3\2\2\2 \u00b1\3\2\2\2\"\u00bd\3\2\2\2$\u00e9\3\2\2\2"+
		"&\u00f3\3\2\2\2()\7\3\2\2)*\7\4\2\2*+\7\5\2\2+,\7\6\2\2,-\5\4\3\2-.\7"+
		"\7\2\2.\3\3\2\2\2/\60\5\6\4\2\60\61\5\4\3\2\61\64\3\2\2\2\62\64\5\6\4"+
		"\2\63/\3\2\2\2\63\62\3\2\2\2\64\5\3\2\2\2\65\66\5\b\5\2\66\67\7\b\2\2"+
		"\67A\3\2\2\289\5&\24\29:\7\b\2\2:A\3\2\2\2;<\5\32\16\2<=\7\b\2\2=A\3\2"+
		"\2\2>A\5\36\20\2?A\5\22\n\2@\65\3\2\2\2@8\3\2\2\2@;\3\2\2\2@>\3\2\2\2"+
		"@?\3\2\2\2A\7\3\2\2\2BC\7\33\2\2CF\7$\2\2DF\5\n\6\2EB\3\2\2\2ED\3\2\2"+
		"\2F\t\3\2\2\2GH\7\33\2\2HI\7$\2\2IJ\7\t\2\2JR\7\34\2\2KL\7$\2\2LM\7\t"+
		"\2\2MR\7\34\2\2NO\7$\2\2OP\7\t\2\2PR\5\f\7\2QG\3\2\2\2QK\3\2\2\2QN\3\2"+
		"\2\2R\13\3\2\2\2ST\5\16\b\2TU\7\n\2\2UV\5\f\7\2V]\3\2\2\2WX\5\16\b\2X"+
		"Y\7\13\2\2YZ\5\f\7\2Z]\3\2\2\2[]\5\16\b\2\\S\3\2\2\2\\W\3\2\2\2\\[\3\2"+
		"\2\2]\r\3\2\2\2^_\5\20\t\2_`\7\f\2\2`a\5\16\b\2al\3\2\2\2bc\5\20\t\2c"+
		"d\7\r\2\2de\5\16\b\2el\3\2\2\2fg\5\20\t\2gh\7\16\2\2hi\5\16\b\2il\3\2"+
		"\2\2jl\5\20\t\2k^\3\2\2\2kb\3\2\2\2kf\3\2\2\2kj\3\2\2\2l\17\3\2\2\2mn"+
		"\7\4\2\2no\5\f\7\2op\7\5\2\2pt\3\2\2\2qt\7$\2\2rt\7 \2\2sm\3\2\2\2sq\3"+
		"\2\2\2sr\3\2\2\2t\21\3\2\2\2uv\7\17\2\2vz\7$\2\2wx\7\20\2\2xz\7$\2\2y"+
		"u\3\2\2\2yw\3\2\2\2z\23\3\2\2\2{|\b\13\1\2|}\7\21\2\2}\u0082\5\24\13\6"+
		"~\u0082\5\26\f\2\177\u0082\5\30\r\2\u0080\u0082\7#\2\2\u0081{\3\2\2\2"+
		"\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\u0088\3\2"+
		"\2\2\u0083\u0084\f\7\2\2\u0084\u0085\7\35\2\2\u0085\u0087\5\24\13\b\u0086"+
		"\u0083\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\25\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\5\f\7\2\u008c\u008d"+
		"\7\36\2\2\u008d\u008e\5\f\7\2\u008e\u0092\3\2\2\2\u008f\u0092\7$\2\2\u0090"+
		"\u0092\7#\2\2\u0091\u008b\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2"+
		"\2\2\u0092\27\3\2\2\2\u0093\u0094\5\26\f\2\u0094\u0095\7\35\2\2\u0095"+
		"\u0096\5\26\f\2\u0096\u00a0\3\2\2\2\u0097\u0098\5\26\f\2\u0098\u0099\7"+
		"\35\2\2\u0099\u009a\5\30\r\2\u009a\u00a0\3\2\2\2\u009b\u009c\7\21\2\2"+
		"\u009c\u00a0\5\26\f\2\u009d\u009e\7\21\2\2\u009e\u00a0\5\30\r\2\u009f"+
		"\u0093\3\2\2\2\u009f\u0097\3\2\2\2\u009f\u009b\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u00a0\31\3\2\2\2\u00a1\u00a2\5\24\13\2\u00a2\u00a3\7\22\2\2\u00a3"+
		"\u00a4\5\34\17\2\u00a4\u00a5\7\23\2\2\u00a5\u00a6\5\34\17\2\u00a6\33\3"+
		"\2\2\2\u00a7\u00ab\5&\24\2\u00a8\u00ab\5\n\6\2\u00a9\u00ab\7#\2\2\u00aa"+
		"\u00a7\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\35\3\2\2"+
		"\2\u00ac\u00b0\5 \21\2\u00ad\u00b0\5\"\22\2\u00ae\u00b0\5$\23\2\u00af"+
		"\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\37\3\2\2"+
		"\2\u00b1\u00b2\7\24\2\2\u00b2\u00b3\7\4\2\2\u00b3\u00b4\5\24\13\2\u00b4"+
		"\u00b5\7\5\2\2\u00b5\u00b6\7\6\2\2\u00b6\u00b7\5\6\4\2\u00b7\u00b8\7\7"+
		"\2\2\u00b8\u00b9\7\25\2\2\u00b9\u00ba\7\6\2\2\u00ba\u00bb\5\6\4\2\u00bb"+
		"\u00bc\7\7\2\2\u00bc!\3\2\2\2\u00bd\u00be\7\26\2\2\u00be\u00bf\7\4\2\2"+
		"\u00bf\u00c0\5\24\13\2\u00c0\u00c1\7\5\2\2\u00c1\u00c2\7\6\2\2\u00c2\u00c3"+
		"\5\6\4\2\u00c3\u00c4\7\7\2\2\u00c4#\3\2\2\2\u00c5\u00c6\7\27\2\2\u00c6"+
		"\u00c7\7$\2\2\u00c7\u00c8\7\30\2\2\u00c8\u00c9\7\4\2\2\u00c9\u00ca\7%"+
		"\2\2\u00ca\u00cb\7\31\2\2\u00cb\u00cc\7%\2\2\u00cc\u00cd\7\5\2\2\u00cd"+
		"\u00ce\7\6\2\2\u00ce\u00cf\5\6\4\2\u00cf\u00d0\7\7\2\2\u00d0\u00ea\3\2"+
		"\2\2\u00d1\u00d2\7\27\2\2\u00d2\u00d3\7\4\2\2\u00d3\u00d4\5\n\6\2\u00d4"+
		"\u00d5\7\b\2\2\u00d5\u00d6\5\24\13\2\u00d6\u00d7\7\b\2\2\u00d7\u00d8\5"+
		"\f\7\2\u00d8\u00d9\7\5\2\2\u00d9\u00da\7\6\2\2\u00da\u00db\5\6\4\2\u00db"+
		"\u00dc\7\7\2\2\u00dc\u00ea\3\2\2\2\u00dd\u00de\7\27\2\2\u00de\u00df\7"+
		"\4\2\2\u00df\u00e0\5\n\6\2\u00e0\u00e1\7\b\2\2\u00e1\u00e2\5\24\13\2\u00e2"+
		"\u00e3\7\b\2\2\u00e3\u00e4\5\22\n\2\u00e4\u00e5\7\5\2\2\u00e5\u00e6\7"+
		"\6\2\2\u00e6\u00e7\5\6\4\2\u00e7\u00e8\7\7\2\2\u00e8\u00ea\3\2\2\2\u00e9"+
		"\u00c5\3\2\2\2\u00e9\u00d1\3\2\2\2\u00e9\u00dd\3\2\2\2\u00ea%\3\2\2\2"+
		"\u00eb\u00ec\7\32\2\2\u00ec\u00ed\7\4\2\2\u00ed\u00ee\7$\2\2\u00ee\u00f4"+
		"\7\5\2\2\u00ef\u00f0\7\32\2\2\u00f0\u00f1\7\4\2\2\u00f1\u00f2\7\37\2\2"+
		"\u00f2\u00f4\7\5\2\2\u00f3\u00eb\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f4\'\3"+
		"\2\2\2\22\63@EQ\\ksy\u0081\u0088\u0091\u009f\u00aa\u00af\u00e9\u00f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}