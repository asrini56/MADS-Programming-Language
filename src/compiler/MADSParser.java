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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, TypeSpecifier=8, 
		DigitSequence=9, FractionalSequence=10, Identifier=11, Constant=12, BoolConstant=13, 
		NumberConstant=14, Float=15, Int=16, String=17, Bool=18, True=19, False=20, 
		LeftParen=21, RightParen=22, LeftBrace=23, RightBrace=24, Less=25, LessEqual=26, 
		Greater=27, GreaterEqual=28, Plus=29, PlusPlus=30, Minus=31, MinusMinus=32, 
		Star=33, Div=34, Mod=35, And=36, Or=37, Not=38, Question=39, Colon=40, 
		Semi=41, Comma=42, Assign=43, Equal=44, NotEqual=45, Dot=46, StringLiteral=47, 
		Whitespace=48, Newline=49, BlockComment=50, LineComment=51;
	public static final int
		RULE_program = 0, RULE_statementList = 1, RULE_statement = 2, RULE_declaration = 3, 
		RULE_initializeStatement = 4, RULE_assignmentStatement = 5, RULE_expr = 6, 
		RULE_expr_term = 7, RULE_expr_fact = 8, RULE_unaryExpr = 9, RULE_conditionStmt = 10, 
		RULE_relationalExpr = 11, RULE_logicalExpr = 12, RULE_ternaryOperator = 13, 
		RULE_ternaryStatement = 14, RULE_loopStatement = 15, RULE_ifLoop = 16, 
		RULE_whileLoop = 17, RULE_forLoop = 18, RULE_forIncrement = 19, RULE_numberValue = 20, 
		RULE_printStatement = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statementList", "statement", "declaration", "initializeStatement", 
			"assignmentStatement", "expr", "expr_term", "expr_fact", "unaryExpr", 
			"conditionStmt", "relationalExpr", "logicalExpr", "ternaryOperator", 
			"ternaryStatement", "loopStatement", "ifLoop", "whileLoop", "forLoop", 
			"forIncrement", "numberValue", "printStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'if'", "'else'", "'while'", "'for'", "'in range'", "'print'", 
			null, null, null, null, null, null, null, "'float'", "'int'", "'string'", 
			"'bool'", "'true'", "'false'", "'('", "')'", "'{'", "'}'", "'<'", "'<='", 
			"'>'", "'>='", "'+'", "'++'", "'-'", "'--'", "'*'", "'/'", "'%'", "'&'", 
			"'||'", "'!'", "'?'", "':'", "';'", "','", "'='", "'=='", "'!='", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "TypeSpecifier", "DigitSequence", 
			"FractionalSequence", "Identifier", "Constant", "BoolConstant", "NumberConstant", 
			"Float", "Int", "String", "Bool", "True", "False", "LeftParen", "RightParen", 
			"LeftBrace", "RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", 
			"Plus", "PlusPlus", "Minus", "MinusMinus", "Star", "Div", "Mod", "And", 
			"Or", "Not", "Question", "Colon", "Semi", "Comma", "Assign", "Equal", 
			"NotEqual", "Dot", "StringLiteral", "Whitespace", "Newline", "BlockComment", 
			"LineComment"
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
		public TerminalNode LeftParen() { return getToken(MADSParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(MADSParser.RightParen, 0); }
		public TerminalNode LeftBrace() { return getToken(MADSParser.LeftBrace, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(MADSParser.RightBrace, 0); }
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
			setState(44);
			match(T__0);
			setState(45);
			match(LeftParen);
			setState(46);
			match(RightParen);
			setState(47);
			match(LeftBrace);
			setState(48);
			statementList(0);
			setState(49);
			match(RightBrace);
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
			setState(52);
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(58);
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
					setState(54);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(55);
					statement();
					}
					} 
				}
				setState(60);
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
		public TerminalNode Semi() { return getToken(MADSParser.Semi, 0); }
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
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				declaration();
				setState(62);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				unaryExpr();
				setState(65);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				expr(0);
				setState(68);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				printStatement();
				setState(71);
				match(Semi);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				ternaryOperator();
				setState(74);
				match(Semi);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(76);
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
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InitializeStmtContext extends DeclarationContext {
		public InitializeStatementContext initializeStatement() {
			return getRuleContext(InitializeStatementContext.class,0);
		}
		public InitializeStmtContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterInitializeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitInitializeStmt(this);
		}
	}
	public static class DeclareIdentifierContext extends DeclarationContext {
		public TerminalNode TypeSpecifier() { return getToken(MADSParser.TypeSpecifier, 0); }
		public TerminalNode Identifier() { return getToken(MADSParser.Identifier, 0); }
		public DeclareIdentifierContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterDeclareIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitDeclareIdentifier(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new DeclareIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(TypeSpecifier);
				setState(80);
				match(Identifier);
				}
				break;
			case 2:
				_localctx = new InitializeStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
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
		public InitializeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializeStatement; }
	 
		public InitializeStatementContext() { }
		public void copyFrom(InitializeStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InitializeIdentifierContext extends InitializeStatementContext {
		public TerminalNode TypeSpecifier() { return getToken(MADSParser.TypeSpecifier, 0); }
		public List<TerminalNode> Identifier() { return getTokens(MADSParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MADSParser.Identifier, i);
		}
		public TerminalNode Assign() { return getToken(MADSParser.Assign, 0); }
		public InitializeIdentifierContext(InitializeStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterInitializeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitInitializeIdentifier(this);
		}
	}
	public static class InitializeConstantContext extends InitializeStatementContext {
		public TerminalNode TypeSpecifier() { return getToken(MADSParser.TypeSpecifier, 0); }
		public TerminalNode Identifier() { return getToken(MADSParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(MADSParser.Assign, 0); }
		public TerminalNode Constant() { return getToken(MADSParser.Constant, 0); }
		public InitializeConstantContext(InitializeStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterInitializeConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitInitializeConstant(this);
		}
	}
	public static class InitializeExprContext extends InitializeStatementContext {
		public TerminalNode TypeSpecifier() { return getToken(MADSParser.TypeSpecifier, 0); }
		public TerminalNode Identifier() { return getToken(MADSParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(MADSParser.Assign, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InitializeExprContext(InitializeStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterInitializeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitInitializeExpr(this);
		}
	}
	public static class AssignstmtContext extends InitializeStatementContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public AssignstmtContext(InitializeStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterAssignstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitAssignstmt(this);
		}
	}

	public final InitializeStatementContext initializeStatement() throws RecognitionException {
		InitializeStatementContext _localctx = new InitializeStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_initializeStatement);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new InitializeConstantContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(TypeSpecifier);
				setState(85);
				match(Identifier);
				setState(86);
				match(Assign);
				setState(87);
				match(Constant);
				}
				break;
			case 2:
				_localctx = new InitializeIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(TypeSpecifier);
				setState(89);
				match(Identifier);
				setState(90);
				match(Assign);
				setState(91);
				match(Identifier);
				}
				break;
			case 3:
				_localctx = new InitializeExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(TypeSpecifier);
				setState(93);
				match(Identifier);
				setState(94);
				match(Assign);
				setState(95);
				expr(0);
				}
				break;
			case 4:
				_localctx = new AssignstmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				assignmentStatement();
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
	 
		public AssignmentStatementContext() { }
		public void copyFrom(AssignmentStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignIdentifierContext extends AssignmentStatementContext {
		public Token varName;
		public TerminalNode Assign() { return getToken(MADSParser.Assign, 0); }
		public List<TerminalNode> Identifier() { return getTokens(MADSParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MADSParser.Identifier, i);
		}
		public AssignIdentifierContext(AssignmentStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterAssignIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitAssignIdentifier(this);
		}
	}
	public static class AssignExprContext extends AssignmentStatementContext {
		public Token varName;
		public TerminalNode Assign() { return getToken(MADSParser.Assign, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MADSParser.Identifier, 0); }
		public AssignExprContext(AssignmentStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitAssignExpr(this);
		}
	}
	public static class AssignConstContext extends AssignmentStatementContext {
		public Token varName;
		public TerminalNode Assign() { return getToken(MADSParser.Assign, 0); }
		public TerminalNode Constant() { return getToken(MADSParser.Constant, 0); }
		public TerminalNode Identifier() { return getToken(MADSParser.Identifier, 0); }
		public AssignConstContext(AssignmentStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterAssignConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitAssignConst(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignmentStatement);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new AssignConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				((AssignConstContext)_localctx).varName = match(Identifier);
				setState(100);
				match(Assign);
				setState(101);
				match(Constant);
				}
				break;
			case 2:
				_localctx = new AssignIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				((AssignIdentifierContext)_localctx).varName = match(Identifier);
				setState(103);
				match(Assign);
				setState(104);
				match(Identifier);
				}
				break;
			case 3:
				_localctx = new AssignExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				((AssignExprContext)_localctx).varName = match(Identifier);
				setState(106);
				match(Assign);
				setState(107);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddExpressionContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Plus() { return getToken(MADSParser.Plus, 0); }
		public Expr_termContext expr_term() {
			return getRuleContext(Expr_termContext.class,0);
		}
		public AddExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitAddExpression(this);
		}
	}
	public static class TermExpressionContext extends ExprContext {
		public Expr_termContext expr_term() {
			return getRuleContext(Expr_termContext.class,0);
		}
		public TermExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterTermExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitTermExpression(this);
		}
	}
	public static class SubExpressionContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Minus() { return getToken(MADSParser.Minus, 0); }
		public Expr_termContext expr_term() {
			return getRuleContext(Expr_termContext.class,0);
		}
		public SubExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitSubExpression(this);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TermExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(111);
			expr_term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(119);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new AddExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(113);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(114);
						match(Plus);
						setState(115);
						expr_term(0);
						}
						break;
					case 2:
						{
						_localctx = new SubExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(116);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(117);
						match(Minus);
						setState(118);
						expr_term(0);
						}
						break;
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		public Expr_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_term; }
	 
		public Expr_termContext() { }
		public void copyFrom(Expr_termContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FactExpressionContext extends Expr_termContext {
		public Expr_factContext expr_fact() {
			return getRuleContext(Expr_factContext.class,0);
		}
		public FactExpressionContext(Expr_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterFactExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitFactExpression(this);
		}
	}
	public static class ModExpressionContext extends Expr_termContext {
		public Expr_termContext expr_term() {
			return getRuleContext(Expr_termContext.class,0);
		}
		public TerminalNode Mod() { return getToken(MADSParser.Mod, 0); }
		public Expr_factContext expr_fact() {
			return getRuleContext(Expr_factContext.class,0);
		}
		public ModExpressionContext(Expr_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterModExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitModExpression(this);
		}
	}
	public static class DivExpressionContext extends Expr_termContext {
		public Expr_termContext expr_term() {
			return getRuleContext(Expr_termContext.class,0);
		}
		public TerminalNode Div() { return getToken(MADSParser.Div, 0); }
		public Expr_factContext expr_fact() {
			return getRuleContext(Expr_factContext.class,0);
		}
		public DivExpressionContext(Expr_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitDivExpression(this);
		}
	}
	public static class MulExpressionContext extends Expr_termContext {
		public Expr_termContext expr_term() {
			return getRuleContext(Expr_termContext.class,0);
		}
		public TerminalNode Star() { return getToken(MADSParser.Star, 0); }
		public Expr_factContext expr_fact() {
			return getRuleContext(Expr_factContext.class,0);
		}
		public MulExpressionContext(Expr_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterMulExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitMulExpression(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new FactExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(125);
			expr_fact();
			}
			_ctx.stop = _input.LT(-1);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(136);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MulExpressionContext(new Expr_termContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_term);
						setState(127);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(128);
						match(Star);
						setState(129);
						expr_fact();
						}
						break;
					case 2:
						{
						_localctx = new DivExpressionContext(new Expr_termContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_term);
						setState(130);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(131);
						match(Div);
						setState(132);
						expr_fact();
						}
						break;
					case 3:
						{
						_localctx = new ModExpressionContext(new Expr_termContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_term);
						setState(133);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(134);
						match(Mod);
						setState(135);
						expr_fact();
						}
						break;
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		public Expr_factContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_fact; }
	 
		public Expr_factContext() { }
		public void copyFrom(Expr_factContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumExpressionContext extends Expr_factContext {
		public Token num;
		public TerminalNode DigitSequence() { return getToken(MADSParser.DigitSequence, 0); }
		public NumExpressionContext(Expr_factContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterNumExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitNumExpression(this);
		}
	}
	public static class IdentifierExpressionContext extends Expr_factContext {
		public Token varName;
		public TerminalNode Identifier() { return getToken(MADSParser.Identifier, 0); }
		public IdentifierExpressionContext(Expr_factContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitIdentifierExpression(this);
		}
	}
	public static class BracketExpressionContext extends Expr_factContext {
		public TerminalNode LeftParen() { return getToken(MADSParser.LeftParen, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MADSParser.RightParen, 0); }
		public BracketExpressionContext(Expr_factContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterBracketExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitBracketExpression(this);
		}
	}
	public static class FloatExpressionContext extends Expr_factContext {
		public Token floatNum;
		public TerminalNode FractionalSequence() { return getToken(MADSParser.FractionalSequence, 0); }
		public FloatExpressionContext(Expr_factContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterFloatExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitFloatExpression(this);
		}
	}

	public final Expr_factContext expr_fact() throws RecognitionException {
		Expr_factContext _localctx = new Expr_factContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr_fact);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				_localctx = new BracketExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(LeftParen);
				setState(142);
				expr(0);
				setState(143);
				match(RightParen);
				}
				break;
			case Identifier:
				_localctx = new IdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				((IdentifierExpressionContext)_localctx).varName = match(Identifier);
				}
				break;
			case DigitSequence:
				_localctx = new NumExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				((NumExpressionContext)_localctx).num = match(DigitSequence);
				}
				break;
			case FractionalSequence:
				_localctx = new FloatExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				((FloatExpressionContext)_localctx).floatNum = match(FractionalSequence);
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
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
	 
		public UnaryExprContext() { }
		public void copyFrom(UnaryExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdPlusPlusContext extends UnaryExprContext {
		public TerminalNode Identifier() { return getToken(MADSParser.Identifier, 0); }
		public TerminalNode PlusPlus() { return getToken(MADSParser.PlusPlus, 0); }
		public IdPlusPlusContext(UnaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterIdPlusPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitIdPlusPlus(this);
		}
	}
	public static class MinusMinusIdContext extends UnaryExprContext {
		public TerminalNode MinusMinus() { return getToken(MADSParser.MinusMinus, 0); }
		public TerminalNode Identifier() { return getToken(MADSParser.Identifier, 0); }
		public MinusMinusIdContext(UnaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterMinusMinusId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitMinusMinusId(this);
		}
	}
	public static class IdMinusMinusContext extends UnaryExprContext {
		public TerminalNode Identifier() { return getToken(MADSParser.Identifier, 0); }
		public TerminalNode MinusMinus() { return getToken(MADSParser.MinusMinus, 0); }
		public IdMinusMinusContext(UnaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterIdMinusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitIdMinusMinus(this);
		}
	}
	public static class PlusPlusIdContext extends UnaryExprContext {
		public TerminalNode PlusPlus() { return getToken(MADSParser.PlusPlus, 0); }
		public TerminalNode Identifier() { return getToken(MADSParser.Identifier, 0); }
		public PlusPlusIdContext(UnaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterPlusPlusId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitPlusPlusId(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_unaryExpr);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new PlusPlusIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(PlusPlus);
				setState(151);
				match(Identifier);
				}
				break;
			case 2:
				_localctx = new MinusMinusIdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(MinusMinus);
				setState(153);
				match(Identifier);
				}
				break;
			case 3:
				_localctx = new IdPlusPlusContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				match(Identifier);
				setState(155);
				match(PlusPlus);
				}
				break;
			case 4:
				_localctx = new IdMinusMinusContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				match(Identifier);
				setState(157);
				match(MinusMinus);
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
		public RelationalExprContext relationalExpr() {
			return getRuleContext(RelationalExprContext.class,0);
		}
		public LogicalExprContext logicalExpr() {
			return getRuleContext(LogicalExprContext.class,0);
		}
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
		ConditionStmtContext _localctx = new ConditionStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_conditionStmt);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				relationalExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				logicalExpr(0);
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

	public static class RelationalExprContext extends ParserRuleContext {
		public RelationalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpr; }
	 
		public RelationalExprContext() { }
		public void copyFrom(RelationalExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualContext extends RelationalExprContext {
		public List<RelationalExprContext> relationalExpr() {
			return getRuleContexts(RelationalExprContext.class);
		}
		public RelationalExprContext relationalExpr(int i) {
			return getRuleContext(RelationalExprContext.class,i);
		}
		public TerminalNode Equal() { return getToken(MADSParser.Equal, 0); }
		public EqualContext(RelationalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitEqual(this);
		}
	}
	public static class LesserThanContext extends RelationalExprContext {
		public List<RelationalExprContext> relationalExpr() {
			return getRuleContexts(RelationalExprContext.class);
		}
		public RelationalExprContext relationalExpr(int i) {
			return getRuleContext(RelationalExprContext.class,i);
		}
		public TerminalNode Less() { return getToken(MADSParser.Less, 0); }
		public LesserThanContext(RelationalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterLesserThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitLesserThan(this);
		}
	}
	public static class GreaterOrEqualContext extends RelationalExprContext {
		public List<RelationalExprContext> relationalExpr() {
			return getRuleContexts(RelationalExprContext.class);
		}
		public RelationalExprContext relationalExpr(int i) {
			return getRuleContext(RelationalExprContext.class,i);
		}
		public TerminalNode GreaterEqual() { return getToken(MADSParser.GreaterEqual, 0); }
		public GreaterOrEqualContext(RelationalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterGreaterOrEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitGreaterOrEqual(this);
		}
	}
	public static class ExpressionContext extends RelationalExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpressionContext(RelationalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitExpression(this);
		}
	}
	public static class LesserOrEqualContext extends RelationalExprContext {
		public List<RelationalExprContext> relationalExpr() {
			return getRuleContexts(RelationalExprContext.class);
		}
		public RelationalExprContext relationalExpr(int i) {
			return getRuleContext(RelationalExprContext.class,i);
		}
		public TerminalNode LessEqual() { return getToken(MADSParser.LessEqual, 0); }
		public LesserOrEqualContext(RelationalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterLesserOrEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitLesserOrEqual(this);
		}
	}
	public static class TrueRltnContext extends RelationalExprContext {
		public TerminalNode True() { return getToken(MADSParser.True, 0); }
		public TrueRltnContext(RelationalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterTrueRltn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitTrueRltn(this);
		}
	}
	public static class NotEqualContext extends RelationalExprContext {
		public List<RelationalExprContext> relationalExpr() {
			return getRuleContexts(RelationalExprContext.class);
		}
		public RelationalExprContext relationalExpr(int i) {
			return getRuleContext(RelationalExprContext.class,i);
		}
		public TerminalNode NotEqual() { return getToken(MADSParser.NotEqual, 0); }
		public NotEqualContext(RelationalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterNotEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitNotEqual(this);
		}
	}
	public static class IdentifierRltnContext extends RelationalExprContext {
		public TerminalNode Identifier() { return getToken(MADSParser.Identifier, 0); }
		public IdentifierRltnContext(RelationalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterIdentifierRltn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitIdentifierRltn(this);
		}
	}
	public static class FalseRltnContext extends RelationalExprContext {
		public TerminalNode False() { return getToken(MADSParser.False, 0); }
		public FalseRltnContext(RelationalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterFalseRltn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitFalseRltn(this);
		}
	}
	public static class GreaterThanContext extends RelationalExprContext {
		public List<RelationalExprContext> relationalExpr() {
			return getRuleContexts(RelationalExprContext.class);
		}
		public RelationalExprContext relationalExpr(int i) {
			return getRuleContext(RelationalExprContext.class,i);
		}
		public TerminalNode Greater() { return getToken(MADSParser.Greater, 0); }
		public GreaterThanContext(RelationalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitGreaterThan(this);
		}
	}

	public final RelationalExprContext relationalExpr() throws RecognitionException {
		return relationalExpr(0);
	}

	private RelationalExprContext relationalExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExprContext _localctx = new RelationalExprContext(_ctx, _parentState);
		RelationalExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_relationalExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new IdentifierRltnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(165);
				match(Identifier);
				}
				break;
			case 2:
				{
				_localctx = new ExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				expr(0);
				}
				break;
			case 3:
				{
				_localctx = new TrueRltnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(True);
				}
				break;
			case 4:
				{
				_localctx = new FalseRltnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				match(False);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(189);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new GreaterThanContext(new RelationalExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpr);
						setState(171);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(172);
						match(Greater);
						setState(173);
						relationalExpr(11);
						}
						break;
					case 2:
						{
						_localctx = new LesserThanContext(new RelationalExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpr);
						setState(174);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(175);
						match(Less);
						setState(176);
						relationalExpr(10);
						}
						break;
					case 3:
						{
						_localctx = new GreaterOrEqualContext(new RelationalExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpr);
						setState(177);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(178);
						match(GreaterEqual);
						setState(179);
						relationalExpr(9);
						}
						break;
					case 4:
						{
						_localctx = new LesserOrEqualContext(new RelationalExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpr);
						setState(180);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(181);
						match(LessEqual);
						setState(182);
						relationalExpr(8);
						}
						break;
					case 5:
						{
						_localctx = new EqualContext(new RelationalExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpr);
						setState(183);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(184);
						match(Equal);
						setState(185);
						relationalExpr(7);
						}
						break;
					case 6:
						{
						_localctx = new NotEqualContext(new RelationalExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpr);
						setState(186);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(187);
						match(NotEqual);
						setState(188);
						relationalExpr(6);
						}
						break;
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class LogicalExprContext extends ParserRuleContext {
		public LogicalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpr; }
	 
		public LogicalExprContext() { }
		public void copyFrom(LogicalExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends LogicalExprContext {
		public TerminalNode Not() { return getToken(MADSParser.Not, 0); }
		public LogicalExprContext logicalExpr() {
			return getRuleContext(LogicalExprContext.class,0);
		}
		public LogicalNotContext(LogicalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitLogicalNot(this);
		}
	}
	public static class IdentifierLogicalContext extends LogicalExprContext {
		public TerminalNode Identifier() { return getToken(MADSParser.Identifier, 0); }
		public IdentifierLogicalContext(LogicalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterIdentifierLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitIdentifierLogical(this);
		}
	}
	public static class FalseLogicalContext extends LogicalExprContext {
		public TerminalNode False() { return getToken(MADSParser.False, 0); }
		public FalseLogicalContext(LogicalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterFalseLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitFalseLogical(this);
		}
	}
	public static class TrueLogicalContext extends LogicalExprContext {
		public TerminalNode True() { return getToken(MADSParser.True, 0); }
		public TrueLogicalContext(LogicalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterTrueLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitTrueLogical(this);
		}
	}
	public static class LogicalAndContext extends LogicalExprContext {
		public List<LogicalExprContext> logicalExpr() {
			return getRuleContexts(LogicalExprContext.class);
		}
		public LogicalExprContext logicalExpr(int i) {
			return getRuleContext(LogicalExprContext.class,i);
		}
		public TerminalNode And() { return getToken(MADSParser.And, 0); }
		public LogicalAndContext(LogicalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterLogicalAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitLogicalAnd(this);
		}
	}
	public static class LogicalOrContext extends LogicalExprContext {
		public List<LogicalExprContext> logicalExpr() {
			return getRuleContexts(LogicalExprContext.class);
		}
		public LogicalExprContext logicalExpr(int i) {
			return getRuleContext(LogicalExprContext.class,i);
		}
		public TerminalNode Or() { return getToken(MADSParser.Or, 0); }
		public LogicalOrContext(LogicalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterLogicalOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitLogicalOr(this);
		}
	}

	public final LogicalExprContext logicalExpr() throws RecognitionException {
		return logicalExpr(0);
	}

	private LogicalExprContext logicalExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalExprContext _localctx = new LogicalExprContext(_ctx, _parentState);
		LogicalExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_logicalExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(195);
				match(Not);
				setState(196);
				logicalExpr(4);
				}
				break;
			case Identifier:
				{
				_localctx = new IdentifierLogicalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197);
				match(Identifier);
				}
				break;
			case True:
				{
				_localctx = new TrueLogicalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				match(True);
				}
				break;
			case False:
				{
				_localctx = new FalseLogicalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				match(False);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(208);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalAndContext(new LogicalExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpr);
						setState(202);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(203);
						match(And);
						setState(204);
						logicalExpr(7);
						}
						break;
					case 2:
						{
						_localctx = new LogicalOrContext(new LogicalExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpr);
						setState(205);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(206);
						match(Or);
						setState(207);
						logicalExpr(6);
						}
						break;
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class TernaryOperatorContext extends ParserRuleContext {
		public ConditionStmtContext conditionStmt() {
			return getRuleContext(ConditionStmtContext.class,0);
		}
		public TerminalNode Question() { return getToken(MADSParser.Question, 0); }
		public List<TernaryStatementContext> ternaryStatement() {
			return getRuleContexts(TernaryStatementContext.class);
		}
		public TernaryStatementContext ternaryStatement(int i) {
			return getRuleContext(TernaryStatementContext.class,i);
		}
		public TerminalNode Colon() { return getToken(MADSParser.Colon, 0); }
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
		enterRule(_localctx, 26, RULE_ternaryOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			conditionStmt();
			setState(214);
			match(Question);
			setState(215);
			ternaryStatement();
			setState(216);
			match(Colon);
			setState(217);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		enterRule(_localctx, 28, RULE_ternaryStatement);
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				printStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				initializeStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
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
		enterRule(_localctx, 30, RULE_loopStatement);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				ifLoop();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				whileLoop();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
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
		public IfLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifLoop; }
	 
		public IfLoopContext() { }
		public void copyFrom(IfLoopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfElseConditionContext extends IfLoopContext {
		public TerminalNode LeftParen() { return getToken(MADSParser.LeftParen, 0); }
		public ConditionStmtContext conditionStmt() {
			return getRuleContext(ConditionStmtContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MADSParser.RightParen, 0); }
		public List<StatementListContext> statementList() {
			return getRuleContexts(StatementListContext.class);
		}
		public StatementListContext statementList(int i) {
			return getRuleContext(StatementListContext.class,i);
		}
		public List<TerminalNode> LeftBrace() { return getTokens(MADSParser.LeftBrace); }
		public TerminalNode LeftBrace(int i) {
			return getToken(MADSParser.LeftBrace, i);
		}
		public TerminalNode RightBrace() { return getToken(MADSParser.RightBrace, 0); }
		public IfElseConditionContext(IfLoopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterIfElseCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitIfElseCondition(this);
		}
	}
	public static class IfConditionContext extends IfLoopContext {
		public TerminalNode LeftParen() { return getToken(MADSParser.LeftParen, 0); }
		public ConditionStmtContext conditionStmt() {
			return getRuleContext(ConditionStmtContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MADSParser.RightParen, 0); }
		public TerminalNode LeftBrace() { return getToken(MADSParser.LeftBrace, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(MADSParser.RightBrace, 0); }
		public IfConditionContext(IfLoopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterIfCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitIfCondition(this);
		}
	}

	public final IfLoopContext ifLoop() throws RecognitionException {
		IfLoopContext _localctx = new IfLoopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifLoop);
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new IfElseConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(T__1);
				setState(230);
				match(LeftParen);
				setState(231);
				conditionStmt();
				setState(232);
				match(RightParen);
				setState(233);
				statementList(0);
				setState(234);
				match(LeftBrace);
				setState(235);
				match(T__2);
				setState(236);
				match(LeftBrace);
				setState(237);
				statementList(0);
				setState(238);
				match(RightBrace);
				}
				break;
			case 2:
				_localctx = new IfConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(T__1);
				setState(241);
				match(LeftParen);
				setState(242);
				conditionStmt();
				setState(243);
				match(RightParen);
				setState(244);
				match(LeftBrace);
				setState(245);
				statementList(0);
				setState(246);
				match(RightBrace);
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
		public TerminalNode LeftParen() { return getToken(MADSParser.LeftParen, 0); }
		public ConditionStmtContext conditionStmt() {
			return getRuleContext(ConditionStmtContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MADSParser.RightParen, 0); }
		public TerminalNode LeftBrace() { return getToken(MADSParser.LeftBrace, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(MADSParser.RightBrace, 0); }
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
		enterRule(_localctx, 34, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(T__3);
			setState(251);
			match(LeftParen);
			setState(252);
			conditionStmt();
			setState(253);
			match(RightParen);
			setState(254);
			match(LeftBrace);
			setState(255);
			statementList(0);
			setState(256);
			match(RightBrace);
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
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
	 
		public ForLoopContext() { }
		public void copyFrom(ForLoopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForAssignLoopContext extends ForLoopContext {
		public TerminalNode LeftParen() { return getToken(MADSParser.LeftParen, 0); }
		public InitializeStatementContext initializeStatement() {
			return getRuleContext(InitializeStatementContext.class,0);
		}
		public List<TerminalNode> Semi() { return getTokens(MADSParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(MADSParser.Semi, i);
		}
		public ConditionStmtContext conditionStmt() {
			return getRuleContext(ConditionStmtContext.class,0);
		}
		public ForIncrementContext forIncrement() {
			return getRuleContext(ForIncrementContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MADSParser.RightParen, 0); }
		public TerminalNode LeftBrace() { return getToken(MADSParser.LeftBrace, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(MADSParser.RightBrace, 0); }
		public ForAssignLoopContext(ForLoopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterForAssignLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitForAssignLoop(this);
		}
	}
	public static class ForRangeLoopContext extends ForLoopContext {
		public TerminalNode Identifier() { return getToken(MADSParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(MADSParser.LeftParen, 0); }
		public List<NumberValueContext> numberValue() {
			return getRuleContexts(NumberValueContext.class);
		}
		public NumberValueContext numberValue(int i) {
			return getRuleContext(NumberValueContext.class,i);
		}
		public TerminalNode Comma() { return getToken(MADSParser.Comma, 0); }
		public TerminalNode RightParen() { return getToken(MADSParser.RightParen, 0); }
		public TerminalNode LeftBrace() { return getToken(MADSParser.LeftBrace, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(MADSParser.RightBrace, 0); }
		public ForRangeLoopContext(ForLoopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterForRangeLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitForRangeLoop(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_forLoop);
		try {
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new ForRangeLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(T__4);
				setState(259);
				match(Identifier);
				setState(260);
				match(T__5);
				setState(261);
				match(LeftParen);
				setState(262);
				numberValue();
				setState(263);
				match(Comma);
				setState(264);
				numberValue();
				setState(265);
				match(RightParen);
				setState(266);
				match(LeftBrace);
				setState(267);
				statementList(0);
				setState(268);
				match(RightBrace);
				}
				break;
			case 2:
				_localctx = new ForAssignLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				match(T__4);
				setState(271);
				match(LeftParen);
				setState(272);
				initializeStatement();
				setState(273);
				match(Semi);
				setState(274);
				conditionStmt();
				setState(275);
				match(Semi);
				setState(276);
				forIncrement();
				setState(277);
				match(RightParen);
				setState(278);
				match(LeftBrace);
				setState(279);
				statementList(0);
				setState(280);
				match(RightBrace);
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

	public static class ForIncrementContext extends ParserRuleContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public ForIncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forIncrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterForIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitForIncrement(this);
		}
	}

	public final ForIncrementContext forIncrement() throws RecognitionException {
		ForIncrementContext _localctx = new ForIncrementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_forIncrement);
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				assignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
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

	public static class NumberValueContext extends ParserRuleContext {
		public NumberValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberValue; }
	 
		public NumberValueContext() { }
		public void copyFrom(NumberValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentifierNumberContext extends NumberValueContext {
		public TerminalNode Identifier() { return getToken(MADSParser.Identifier, 0); }
		public IdentifierNumberContext(NumberValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterIdentifierNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitIdentifierNumber(this);
		}
	}
	public static class DigitValueContext extends NumberValueContext {
		public TerminalNode DigitSequence() { return getToken(MADSParser.DigitSequence, 0); }
		public DigitValueContext(NumberValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterDigitValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitDigitValue(this);
		}
	}

	public final NumberValueContext numberValue() throws RecognitionException {
		NumberValueContext _localctx = new NumberValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_numberValue);
		try {
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				_localctx = new IdentifierNumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(Identifier);
				}
				break;
			case DigitSequence:
				_localctx = new DigitValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				match(DigitSequence);
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

	public static class PrintStatementContext extends ParserRuleContext {
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
	 
		public PrintStatementContext() { }
		public void copyFrom(PrintStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintIdentifierContext extends PrintStatementContext {
		public TerminalNode LeftParen() { return getToken(MADSParser.LeftParen, 0); }
		public TerminalNode Identifier() { return getToken(MADSParser.Identifier, 0); }
		public TerminalNode RightParen() { return getToken(MADSParser.RightParen, 0); }
		public PrintIdentifierContext(PrintStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterPrintIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitPrintIdentifier(this);
		}
	}
	public static class PrintStringContext extends PrintStatementContext {
		public TerminalNode LeftParen() { return getToken(MADSParser.LeftParen, 0); }
		public TerminalNode Constant() { return getToken(MADSParser.Constant, 0); }
		public TerminalNode RightParen() { return getToken(MADSParser.RightParen, 0); }
		public PrintStringContext(PrintStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).enterPrintString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MADSListener ) ((MADSListener)listener).exitPrintString(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_printStatement);
		try {
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new PrintIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(T__6);
				setState(293);
				match(LeftParen);
				setState(294);
				match(Identifier);
				setState(295);
				match(RightParen);
				}
				break;
			case 2:
				_localctx = new PrintStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(T__6);
				setState(297);
				match(LeftParen);
				setState(298);
				match(Constant);
				setState(299);
				match(RightParen);
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
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 7:
			return expr_term_sempred((Expr_termContext)_localctx, predIndex);
		case 11:
			return relationalExpr_sempred((RelationalExprContext)_localctx, predIndex);
		case 12:
			return logicalExpr_sempred((LogicalExprContext)_localctx, predIndex);
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
	private boolean relationalExpr_sempred(RelationalExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean logicalExpr_sempred(LogicalExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 6);
		case 13:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u0131\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3;\n\3\f\3\16\3>\13\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4P\n\4\3\5\3\5\3\5\5"+
		"\5U\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6d\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7o\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\7\bz\n\b\f\b\16\b}\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\7\t\u008b\n\t\f\t\16\t\u008e\13\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u0097\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a1"+
		"\n\13\3\f\3\f\5\f\u00a5\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u00ac\n\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00c0"+
		"\n\r\f\r\16\r\u00c3\13\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00cb\n\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00d3\n\16\f\16\16\16\u00d6\13\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\5\20\u00e1\n\20\3\21\3\21"+
		"\3\21\5\21\u00e6\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00fb\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u011d\n\24\3\25\3\25\5\25\u0121\n\25\3\26\3\26\5\26\u0125"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u012f\n\27\3\27\2\7"+
		"\4\16\20\30\32\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\2\2"+
		"\u0149\2.\3\2\2\2\4\65\3\2\2\2\6O\3\2\2\2\bT\3\2\2\2\nc\3\2\2\2\fn\3\2"+
		"\2\2\16p\3\2\2\2\20~\3\2\2\2\22\u0096\3\2\2\2\24\u00a0\3\2\2\2\26\u00a4"+
		"\3\2\2\2\30\u00ab\3\2\2\2\32\u00ca\3\2\2\2\34\u00d7\3\2\2\2\36\u00e0\3"+
		"\2\2\2 \u00e5\3\2\2\2\"\u00fa\3\2\2\2$\u00fc\3\2\2\2&\u011c\3\2\2\2(\u0120"+
		"\3\2\2\2*\u0124\3\2\2\2,\u012e\3\2\2\2./\7\3\2\2/\60\7\27\2\2\60\61\7"+
		"\30\2\2\61\62\7\31\2\2\62\63\5\4\3\2\63\64\7\32\2\2\64\3\3\2\2\2\65\66"+
		"\b\3\1\2\66\67\5\6\4\2\67<\3\2\2\289\f\4\2\29;\5\6\4\2:8\3\2\2\2;>\3\2"+
		"\2\2<:\3\2\2\2<=\3\2\2\2=\5\3\2\2\2><\3\2\2\2?@\5\b\5\2@A\7+\2\2AP\3\2"+
		"\2\2BC\5\24\13\2CD\7+\2\2DP\3\2\2\2EF\5\16\b\2FG\7+\2\2GP\3\2\2\2HI\5"+
		",\27\2IJ\7+\2\2JP\3\2\2\2KL\5\34\17\2LM\7+\2\2MP\3\2\2\2NP\5 \21\2O?\3"+
		"\2\2\2OB\3\2\2\2OE\3\2\2\2OH\3\2\2\2OK\3\2\2\2ON\3\2\2\2P\7\3\2\2\2QR"+
		"\7\n\2\2RU\7\r\2\2SU\5\n\6\2TQ\3\2\2\2TS\3\2\2\2U\t\3\2\2\2VW\7\n\2\2"+
		"WX\7\r\2\2XY\7-\2\2Yd\7\16\2\2Z[\7\n\2\2[\\\7\r\2\2\\]\7-\2\2]d\7\r\2"+
		"\2^_\7\n\2\2_`\7\r\2\2`a\7-\2\2ad\5\16\b\2bd\5\f\7\2cV\3\2\2\2cZ\3\2\2"+
		"\2c^\3\2\2\2cb\3\2\2\2d\13\3\2\2\2ef\7\r\2\2fg\7-\2\2go\7\16\2\2hi\7\r"+
		"\2\2ij\7-\2\2jo\7\r\2\2kl\7\r\2\2lm\7-\2\2mo\5\16\b\2ne\3\2\2\2nh\3\2"+
		"\2\2nk\3\2\2\2o\r\3\2\2\2pq\b\b\1\2qr\5\20\t\2r{\3\2\2\2st\f\5\2\2tu\7"+
		"\37\2\2uz\5\20\t\2vw\f\4\2\2wx\7!\2\2xz\5\20\t\2ys\3\2\2\2yv\3\2\2\2z"+
		"}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\17\3\2\2\2}{\3\2\2\2~\177\b\t\1\2\177\u0080"+
		"\5\22\n\2\u0080\u008c\3\2\2\2\u0081\u0082\f\6\2\2\u0082\u0083\7#\2\2\u0083"+
		"\u008b\5\22\n\2\u0084\u0085\f\5\2\2\u0085\u0086\7$\2\2\u0086\u008b\5\22"+
		"\n\2\u0087\u0088\f\4\2\2\u0088\u0089\7%\2\2\u0089\u008b\5\22\n\2\u008a"+
		"\u0081\3\2\2\2\u008a\u0084\3\2\2\2\u008a\u0087\3\2\2\2\u008b\u008e\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\21\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008f\u0090\7\27\2\2\u0090\u0091\5\16\b\2\u0091\u0092\7\30\2"+
		"\2\u0092\u0097\3\2\2\2\u0093\u0097\7\r\2\2\u0094\u0097\7\13\2\2\u0095"+
		"\u0097\7\f\2\2\u0096\u008f\3\2\2\2\u0096\u0093\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0095\3\2\2\2\u0097\23\3\2\2\2\u0098\u0099\7 \2\2\u0099\u00a1"+
		"\7\r\2\2\u009a\u009b\7\"\2\2\u009b\u00a1\7\r\2\2\u009c\u009d\7\r\2\2\u009d"+
		"\u00a1\7 \2\2\u009e\u009f\7\r\2\2\u009f\u00a1\7\"\2\2\u00a0\u0098\3\2"+
		"\2\2\u00a0\u009a\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\25\3\2\2\2\u00a2\u00a5\5\30\r\2\u00a3\u00a5\5\32\16\2\u00a4\u00a2\3\2"+
		"\2\2\u00a4\u00a3\3\2\2\2\u00a5\27\3\2\2\2\u00a6\u00a7\b\r\1\2\u00a7\u00ac"+
		"\7\r\2\2\u00a8\u00ac\5\16\b\2\u00a9\u00ac\7\25\2\2\u00aa\u00ac\7\26\2"+
		"\2\u00ab\u00a6\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa"+
		"\3\2\2\2\u00ac\u00c1\3\2\2\2\u00ad\u00ae\f\f\2\2\u00ae\u00af\7\35\2\2"+
		"\u00af\u00c0\5\30\r\r\u00b0\u00b1\f\13\2\2\u00b1\u00b2\7\33\2\2\u00b2"+
		"\u00c0\5\30\r\f\u00b3\u00b4\f\n\2\2\u00b4\u00b5\7\36\2\2\u00b5\u00c0\5"+
		"\30\r\13\u00b6\u00b7\f\t\2\2\u00b7\u00b8\7\34\2\2\u00b8\u00c0\5\30\r\n"+
		"\u00b9\u00ba\f\b\2\2\u00ba\u00bb\7.\2\2\u00bb\u00c0\5\30\r\t\u00bc\u00bd"+
		"\f\7\2\2\u00bd\u00be\7/\2\2\u00be\u00c0\5\30\r\b\u00bf\u00ad\3\2\2\2\u00bf"+
		"\u00b0\3\2\2\2\u00bf\u00b3\3\2\2\2\u00bf\u00b6\3\2\2\2\u00bf\u00b9\3\2"+
		"\2\2\u00bf\u00bc\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\31\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\b\16\1"+
		"\2\u00c5\u00c6\7(\2\2\u00c6\u00cb\5\32\16\6\u00c7\u00cb\7\r\2\2\u00c8"+
		"\u00cb\7\25\2\2\u00c9\u00cb\7\26\2\2\u00ca\u00c4\3\2\2\2\u00ca\u00c7\3"+
		"\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00d4\3\2\2\2\u00cc"+
		"\u00cd\f\b\2\2\u00cd\u00ce\7&\2\2\u00ce\u00d3\5\32\16\t\u00cf\u00d0\f"+
		"\7\2\2\u00d0\u00d1\7\'\2\2\u00d1\u00d3\5\32\16\b\u00d2\u00cc\3\2\2\2\u00d2"+
		"\u00cf\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\33\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\5\26\f\2\u00d8\u00d9"+
		"\7)\2\2\u00d9\u00da\5\36\20\2\u00da\u00db\7*\2\2\u00db\u00dc\5\36\20\2"+
		"\u00dc\35\3\2\2\2\u00dd\u00e1\5,\27\2\u00de\u00e1\5\n\6\2\u00df\u00e1"+
		"\5\16\b\2\u00e0\u00dd\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2"+
		"\u00e1\37\3\2\2\2\u00e2\u00e6\5\"\22\2\u00e3\u00e6\5$\23\2\u00e4\u00e6"+
		"\5&\24\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6"+
		"!\3\2\2\2\u00e7\u00e8\7\4\2\2\u00e8\u00e9\7\27\2\2\u00e9\u00ea\5\26\f"+
		"\2\u00ea\u00eb\7\30\2\2\u00eb\u00ec\5\4\3\2\u00ec\u00ed\7\31\2\2\u00ed"+
		"\u00ee\7\5\2\2\u00ee\u00ef\7\31\2\2\u00ef\u00f0\5\4\3\2\u00f0\u00f1\7"+
		"\32\2\2\u00f1\u00fb\3\2\2\2\u00f2\u00f3\7\4\2\2\u00f3\u00f4\7\27\2\2\u00f4"+
		"\u00f5\5\26\f\2\u00f5\u00f6\7\30\2\2\u00f6\u00f7\7\31\2\2\u00f7\u00f8"+
		"\5\4\3\2\u00f8\u00f9\7\32\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00e7\3\2\2\2"+
		"\u00fa\u00f2\3\2\2\2\u00fb#\3\2\2\2\u00fc\u00fd\7\6\2\2\u00fd\u00fe\7"+
		"\27\2\2\u00fe\u00ff\5\26\f\2\u00ff\u0100\7\30\2\2\u0100\u0101\7\31\2\2"+
		"\u0101\u0102\5\4\3\2\u0102\u0103\7\32\2\2\u0103%\3\2\2\2\u0104\u0105\7"+
		"\7\2\2\u0105\u0106\7\r\2\2\u0106\u0107\7\b\2\2\u0107\u0108\7\27\2\2\u0108"+
		"\u0109\5*\26\2\u0109\u010a\7,\2\2\u010a\u010b\5*\26\2\u010b\u010c\7\30"+
		"\2\2\u010c\u010d\7\31\2\2\u010d\u010e\5\4\3\2\u010e\u010f\7\32\2\2\u010f"+
		"\u011d\3\2\2\2\u0110\u0111\7\7\2\2\u0111\u0112\7\27\2\2\u0112\u0113\5"+
		"\n\6\2\u0113\u0114\7+\2\2\u0114\u0115\5\26\f\2\u0115\u0116\7+\2\2\u0116"+
		"\u0117\5(\25\2\u0117\u0118\7\30\2\2\u0118\u0119\7\31\2\2\u0119\u011a\5"+
		"\4\3\2\u011a\u011b\7\32\2\2\u011b\u011d\3\2\2\2\u011c\u0104\3\2\2\2\u011c"+
		"\u0110\3\2\2\2\u011d\'\3\2\2\2\u011e\u0121\5\f\7\2\u011f\u0121\5\24\13"+
		"\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121)\3\2\2\2\u0122\u0125"+
		"\7\r\2\2\u0123\u0125\7\13\2\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2\2\2"+
		"\u0125+\3\2\2\2\u0126\u0127\7\t\2\2\u0127\u0128\7\27\2\2\u0128\u0129\7"+
		"\r\2\2\u0129\u012f\7\30\2\2\u012a\u012b\7\t\2\2\u012b\u012c\7\27\2\2\u012c"+
		"\u012d\7\16\2\2\u012d\u012f\7\30\2\2\u012e\u0126\3\2\2\2\u012e\u012a\3"+
		"\2\2\2\u012f-\3\2\2\2\33<OTcny{\u008a\u008c\u0096\u00a0\u00a4\u00ab\u00bf"+
		"\u00c1\u00ca\u00d2\u00d4\u00e0\u00e5\u00fa\u011c\u0120\u0124\u012e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}