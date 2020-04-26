package compiler;

// Generated from MADS.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MADSLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, TypeSpecifier=8, 
		DigitSequence=9, FractionalSequence=10, Identifier=11, Constant=12, BoolConstant=13, 
		NumberConstant=14, RelationalOperator=15, EqualityOperator=16, LogicalOperator=17, 
		Float=18, Int=19, String=20, Bool=21, True=22, False=23, LeftParen=24, 
		RightParen=25, LeftBrace=26, RightBrace=27, Less=28, LessEqual=29, Greater=30, 
		GreaterEqual=31, Plus=32, PlusPlus=33, Minus=34, MinusMinus=35, Star=36, 
		Div=37, Mod=38, And=39, Or=40, Not=41, Question=42, Colon=43, Semi=44, 
		Comma=45, Assign=46, Equal=47, NotEqual=48, Dot=49, StringLiteral=50, 
		Whitespace=51, Newline=52, BlockComment=53, LineComment=54;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "TypeSpecifier", 
			"DigitSequence", "FractionalSequence", "Identifier", "Constant", "BoolConstant", 
			"NumberConstant", "Digit", "RelationalOperator", "EqualityOperator", 
			"LogicalOperator", "Float", "Int", "String", "Bool", "True", "False", 
			"LeftParen", "RightParen", "LeftBrace", "RightBrace", "Less", "LessEqual", 
			"Greater", "GreaterEqual", "Plus", "PlusPlus", "Minus", "MinusMinus", 
			"Star", "Div", "Mod", "And", "Or", "Not", "Question", "Colon", "Semi", 
			"Comma", "Assign", "Equal", "NotEqual", "Dot", "IdentifierNondigit", 
			"Nondigit", "IntegerConstant", "DecimalConstant", "NonzeroDigit", "FloatingConstant", 
			"DecimalFloatingConstant", "FractionalConstant", "Sign", "CharacterConstant", 
			"CCharSequence", "CChar", "EscapeSequence", "SimpleEscapeSequence", "StringLiteral", 
			"SCharSequence", "SChar", "Whitespace", "Newline", "BlockComment", "LineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'if'", "'else'", "'while'", "'for'", "'in range'", "'print'", 
			null, null, null, null, null, null, null, null, null, null, "'float'", 
			"'int'", "'string'", "'bool'", "'true'", "'false'", "'('", "')'", "'{'", 
			"'}'", "'<'", "'<='", "'>'", "'>='", "'+'", "'++'", "'-'", "'--'", "'*'", 
			"'/'", "'%'", "'&'", "'||'", "'!'", "'?'", "':'", "';'", "','", "'='", 
			"'=='", "'!='", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "TypeSpecifier", "DigitSequence", 
			"FractionalSequence", "Identifier", "Constant", "BoolConstant", "NumberConstant", 
			"RelationalOperator", "EqualityOperator", "LogicalOperator", "Float", 
			"Int", "String", "Bool", "True", "False", "LeftParen", "RightParen", 
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


	public MADSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MADS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u01cd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u00bc\n\t\3\n\6\n\u00bf\n\n\r\n\16\n\u00c0"+
		"\3\13\5\13\u00c4\n\13\3\13\3\13\3\13\3\13\3\13\5\13\u00cb\n\13\3\f\3\f"+
		"\3\f\7\f\u00d0\n\f\f\f\16\f\u00d3\13\f\3\r\3\r\3\r\5\r\u00d8\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e3\n\16\3\17\3\17\5\17"+
		"\u00e7\n\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u00f4\n\21\3\22\3\22\3\22\3\22\5\22\u00fa\n\22\3\23\3\23\3\23\5\23\u00ff"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\3%"+
		"\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3"+
		"\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3"+
		"\66\3\66\3\67\3\67\7\67\u0165\n\67\f\67\16\67\u0168\13\67\38\38\39\39"+
		"\3:\3:\5:\u0170\n:\3;\5;\u0173\n;\3;\3;\3;\3;\3;\5;\u017a\n;\3<\3<\3="+
		"\3=\3=\3=\3>\7>\u0183\n>\f>\16>\u0186\13>\3?\3?\5?\u018a\n?\3@\3@\3A\3"+
		"A\3A\3B\3B\5B\u0193\nB\3B\3B\3C\6C\u0198\nC\rC\16C\u0199\3D\3D\3D\3D\3"+
		"D\3D\3D\5D\u01a3\nD\3E\6E\u01a6\nE\rE\16E\u01a7\3E\3E\3F\3F\5F\u01ae\n"+
		"F\3F\5F\u01b1\nF\3F\3F\3G\3G\3G\3G\7G\u01b9\nG\fG\16G\u01bc\13G\3G\3G"+
		"\3G\3G\3G\3H\3H\3H\3H\7H\u01c7\nH\fH\16H\u01ca\13H\3H\3H\3\u01ba\2I\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\2!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37"+
		"? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62e\63g\2i\2k\2m\2o\2q\2s"+
		"\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\64\u0085\2\u0087\2\u0089\65\u008b"+
		"\66\u008d\67\u008f8\3\2\f\3\2\62;\4\2>>@@\5\2C\\aac|\3\2\63;\4\2--//\6"+
		"\2\f\f\17\17))^^\f\2$$))AA^^cdhhppttvvxx\6\2\f\f\17\17$$^^\4\2\13\13\""+
		"\"\4\2\f\f\17\17\2\u01dd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2\u0083\3\2\2\2\2\u0089\3\2\2\2"+
		"\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\3\u0091\3\2\2\2\5\u0096"+
		"\3\2\2\2\7\u0099\3\2\2\2\t\u009e\3\2\2\2\13\u00a4\3\2\2\2\r\u00a8\3\2"+
		"\2\2\17\u00b1\3\2\2\2\21\u00bb\3\2\2\2\23\u00be\3\2\2\2\25\u00ca\3\2\2"+
		"\2\27\u00cc\3\2\2\2\31\u00d7\3\2\2\2\33\u00e2\3\2\2\2\35\u00e6\3\2\2\2"+
		"\37\u00e8\3\2\2\2!\u00f3\3\2\2\2#\u00f9\3\2\2\2%\u00fe\3\2\2\2\'\u0100"+
		"\3\2\2\2)\u0106\3\2\2\2+\u010a\3\2\2\2-\u0111\3\2\2\2/\u0116\3\2\2\2\61"+
		"\u011b\3\2\2\2\63\u0121\3\2\2\2\65\u0123\3\2\2\2\67\u0125\3\2\2\29\u0127"+
		"\3\2\2\2;\u0129\3\2\2\2=\u012b\3\2\2\2?\u012e\3\2\2\2A\u0130\3\2\2\2C"+
		"\u0133\3\2\2\2E\u0135\3\2\2\2G\u0138\3\2\2\2I\u013a\3\2\2\2K\u013d\3\2"+
		"\2\2M\u013f\3\2\2\2O\u0141\3\2\2\2Q\u0143\3\2\2\2S\u0145\3\2\2\2U\u0148"+
		"\3\2\2\2W\u014a\3\2\2\2Y\u014c\3\2\2\2[\u014e\3\2\2\2]\u0150\3\2\2\2_"+
		"\u0152\3\2\2\2a\u0154\3\2\2\2c\u0157\3\2\2\2e\u015a\3\2\2\2g\u015c\3\2"+
		"\2\2i\u015e\3\2\2\2k\u0160\3\2\2\2m\u0162\3\2\2\2o\u0169\3\2\2\2q\u016b"+
		"\3\2\2\2s\u016f\3\2\2\2u\u0179\3\2\2\2w\u017b\3\2\2\2y\u017d\3\2\2\2{"+
		"\u0184\3\2\2\2}\u0189\3\2\2\2\177\u018b\3\2\2\2\u0081\u018d\3\2\2\2\u0083"+
		"\u0190\3\2\2\2\u0085\u0197\3\2\2\2\u0087\u01a2\3\2\2\2\u0089\u01a5\3\2"+
		"\2\2\u008b\u01b0\3\2\2\2\u008d\u01b4\3\2\2\2\u008f\u01c2\3\2\2\2\u0091"+
		"\u0092\7o\2\2\u0092\u0093\7c\2\2\u0093\u0094\7k\2\2\u0094\u0095\7p\2\2"+
		"\u0095\4\3\2\2\2\u0096\u0097\7k\2\2\u0097\u0098\7h\2\2\u0098\6\3\2\2\2"+
		"\u0099\u009a\7g\2\2\u009a\u009b\7n\2\2\u009b\u009c\7u\2\2\u009c\u009d"+
		"\7g\2\2\u009d\b\3\2\2\2\u009e\u009f\7y\2\2\u009f\u00a0\7j\2\2\u00a0\u00a1"+
		"\7k\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7g\2\2\u00a3\n\3\2\2\2\u00a4\u00a5"+
		"\7h\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7t\2\2\u00a7\f\3\2\2\2\u00a8\u00a9"+
		"\7k\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7\"\2\2\u00ab\u00ac\7t\2\2\u00ac"+
		"\u00ad\7c\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7i\2\2\u00af\u00b0\7g\2\2"+
		"\u00b0\16\3\2\2\2\u00b1\u00b2\7r\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7"+
		"k\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7v\2\2\u00b6\20\3\2\2\2\u00b7\u00bc"+
		"\5)\25\2\u00b8\u00bc\5\'\24\2\u00b9\u00bc\5-\27\2\u00ba\u00bc\5+\26\2"+
		"\u00bb\u00b7\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba"+
		"\3\2\2\2\u00bc\22\3\2\2\2\u00bd\u00bf\5\37\20\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\24\3\2\2"+
		"\2\u00c2\u00c4\5\23\n\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c6\7\60\2\2\u00c6\u00cb\5\23\n\2\u00c7\u00c8\5"+
		"\23\n\2\u00c8\u00c9\7\60\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c3\3\2\2\2\u00ca"+
		"\u00c7\3\2\2\2\u00cb\26\3\2\2\2\u00cc\u00d1\5g\64\2\u00cd\u00d0\5g\64"+
		"\2\u00ce\u00d0\5\37\20\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0"+
		"\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\30\3\2\2"+
		"\2\u00d3\u00d1\3\2\2\2\u00d4\u00d8\5\35\17\2\u00d5\u00d8\5\33\16\2\u00d6"+
		"\u00d8\5y=\2\u00d7\u00d4\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2\2"+
		"\2\u00d8\32\3\2\2\2\u00d9\u00da\7v\2\2\u00da\u00db\7t\2\2\u00db\u00dc"+
		"\7w\2\2\u00dc\u00e3\7g\2\2\u00dd\u00de\7h\2\2\u00de\u00df\7c\2\2\u00df"+
		"\u00e0\7n\2\2\u00e0\u00e1\7u\2\2\u00e1\u00e3\7g\2\2\u00e2\u00d9\3\2\2"+
		"\2\u00e2\u00dd\3\2\2\2\u00e3\34\3\2\2\2\u00e4\u00e7\5k\66\2\u00e5\u00e7"+
		"\5q9\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\36\3\2\2\2\u00e8"+
		"\u00e9\t\2\2\2\u00e9 \3\2\2\2\u00ea\u00f4\t\3\2\2\u00eb\u00ec\7@\2\2\u00ec"+
		"\u00f4\7?\2\2\u00ed\u00ee\7>\2\2\u00ee\u00f4\7?\2\2\u00ef\u00f0\7?\2\2"+
		"\u00f0\u00f4\7?\2\2\u00f1\u00f2\7#\2\2\u00f2\u00f4\7?\2\2\u00f3\u00ea"+
		"\3\2\2\2\u00f3\u00eb\3\2\2\2\u00f3\u00ed\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f4\"\3\2\2\2\u00f5\u00f6\7?\2\2\u00f6\u00fa\7?\2\2\u00f7"+
		"\u00f8\7#\2\2\u00f8\u00fa\7?\2\2\u00f9\u00f5\3\2\2\2\u00f9\u00f7\3\2\2"+
		"\2\u00fa$\3\2\2\2\u00fb\u00ff\7(\2\2\u00fc\u00fd\7~\2\2\u00fd\u00ff\7"+
		"~\2\2\u00fe\u00fb\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff&\3\2\2\2\u0100\u0101"+
		"\7h\2\2\u0101\u0102\7n\2\2\u0102\u0103\7q\2\2\u0103\u0104\7c\2\2\u0104"+
		"\u0105\7v\2\2\u0105(\3\2\2\2\u0106\u0107\7k\2\2\u0107\u0108\7p\2\2\u0108"+
		"\u0109\7v\2\2\u0109*\3\2\2\2\u010a\u010b\7u\2\2\u010b\u010c\7v\2\2\u010c"+
		"\u010d\7t\2\2\u010d\u010e\7k\2\2\u010e\u010f\7p\2\2\u010f\u0110\7i\2\2"+
		"\u0110,\3\2\2\2\u0111\u0112\7d\2\2\u0112\u0113\7q\2\2\u0113\u0114\7q\2"+
		"\2\u0114\u0115\7n\2\2\u0115.\3\2\2\2\u0116\u0117\7v\2\2\u0117\u0118\7"+
		"t\2\2\u0118\u0119\7w\2\2\u0119\u011a\7g\2\2\u011a\60\3\2\2\2\u011b\u011c"+
		"\7h\2\2\u011c\u011d\7c\2\2\u011d\u011e\7n\2\2\u011e\u011f\7u\2\2\u011f"+
		"\u0120\7g\2\2\u0120\62\3\2\2\2\u0121\u0122\7*\2\2\u0122\64\3\2\2\2\u0123"+
		"\u0124\7+\2\2\u0124\66\3\2\2\2\u0125\u0126\7}\2\2\u01268\3\2\2\2\u0127"+
		"\u0128\7\177\2\2\u0128:\3\2\2\2\u0129\u012a\7>\2\2\u012a<\3\2\2\2\u012b"+
		"\u012c\7>\2\2\u012c\u012d\7?\2\2\u012d>\3\2\2\2\u012e\u012f\7@\2\2\u012f"+
		"@\3\2\2\2\u0130\u0131\7@\2\2\u0131\u0132\7?\2\2\u0132B\3\2\2\2\u0133\u0134"+
		"\7-\2\2\u0134D\3\2\2\2\u0135\u0136\7-\2\2\u0136\u0137\7-\2\2\u0137F\3"+
		"\2\2\2\u0138\u0139\7/\2\2\u0139H\3\2\2\2\u013a\u013b\7/\2\2\u013b\u013c"+
		"\7/\2\2\u013cJ\3\2\2\2\u013d\u013e\7,\2\2\u013eL\3\2\2\2\u013f\u0140\7"+
		"\61\2\2\u0140N\3\2\2\2\u0141\u0142\7\'\2\2\u0142P\3\2\2\2\u0143\u0144"+
		"\7(\2\2\u0144R\3\2\2\2\u0145\u0146\7~\2\2\u0146\u0147\7~\2\2\u0147T\3"+
		"\2\2\2\u0148\u0149\7#\2\2\u0149V\3\2\2\2\u014a\u014b\7A\2\2\u014bX\3\2"+
		"\2\2\u014c\u014d\7<\2\2\u014dZ\3\2\2\2\u014e\u014f\7=\2\2\u014f\\\3\2"+
		"\2\2\u0150\u0151\7.\2\2\u0151^\3\2\2\2\u0152\u0153\7?\2\2\u0153`\3\2\2"+
		"\2\u0154\u0155\7?\2\2\u0155\u0156\7?\2\2\u0156b\3\2\2\2\u0157\u0158\7"+
		"#\2\2\u0158\u0159\7?\2\2\u0159d\3\2\2\2\u015a\u015b\7\60\2\2\u015bf\3"+
		"\2\2\2\u015c\u015d\5i\65\2\u015dh\3\2\2\2\u015e\u015f\t\4\2\2\u015fj\3"+
		"\2\2\2\u0160\u0161\5m\67\2\u0161l\3\2\2\2\u0162\u0166\5o8\2\u0163\u0165"+
		"\5\37\20\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2"+
		"\u0166\u0167\3\2\2\2\u0167n\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016a\t"+
		"\5\2\2\u016ap\3\2\2\2\u016b\u016c\5s:\2\u016cr\3\2\2\2\u016d\u0170\5u"+
		";\2\u016e\u0170\5\23\n\2\u016f\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170"+
		"t\3\2\2\2\u0171\u0173\5\23\n\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2"+
		"\u0173\u0174\3\2\2\2\u0174\u0175\7\60\2\2\u0175\u017a\5\23\n\2\u0176\u0177"+
		"\5\23\n\2\u0177\u0178\7\60\2\2\u0178\u017a\3\2\2\2\u0179\u0172\3\2\2\2"+
		"\u0179\u0176\3\2\2\2\u017av\3\2\2\2\u017b\u017c\t\6\2\2\u017cx\3\2\2\2"+
		"\u017d\u017e\7$\2\2\u017e\u017f\5{>\2\u017f\u0180\7$\2\2\u0180z\3\2\2"+
		"\2\u0181\u0183\5}?\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182"+
		"\3\2\2\2\u0184\u0185\3\2\2\2\u0185|\3\2\2\2\u0186\u0184\3\2\2\2\u0187"+
		"\u018a\n\7\2\2\u0188\u018a\5\177@\2\u0189\u0187\3\2\2\2\u0189\u0188\3"+
		"\2\2\2\u018a~\3\2\2\2\u018b\u018c\5\u0081A\2\u018c\u0080\3\2\2\2\u018d"+
		"\u018e\7^\2\2\u018e\u018f\t\b\2\2\u018f\u0082\3\2\2\2\u0190\u0192\7$\2"+
		"\2\u0191\u0193\5\u0085C\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194\u0195\7$\2\2\u0195\u0084\3\2\2\2\u0196\u0198\5\u0087"+
		"D\2\u0197\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u0197\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u0086\3\2\2\2\u019b\u01a3\n\t\2\2\u019c\u01a3\5\177"+
		"@\2\u019d\u019e\7^\2\2\u019e\u01a3\7\f\2\2\u019f\u01a0\7^\2\2\u01a0\u01a1"+
		"\7\17\2\2\u01a1\u01a3\7\f\2\2\u01a2\u019b\3\2\2\2\u01a2\u019c\3\2\2\2"+
		"\u01a2\u019d\3\2\2\2\u01a2\u019f\3\2\2\2\u01a3\u0088\3\2\2\2\u01a4\u01a6"+
		"\t\n\2\2\u01a5\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\bE\2\2\u01aa\u008a\3\2"+
		"\2\2\u01ab\u01ad\7\17\2\2\u01ac\u01ae\7\f\2\2\u01ad\u01ac\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01b1\7\f\2\2\u01b0\u01ab\3\2"+
		"\2\2\u01b0\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\bF\2\2\u01b3"+
		"\u008c\3\2\2\2\u01b4\u01b5\7\61\2\2\u01b5\u01b6\7,\2\2\u01b6\u01ba\3\2"+
		"\2\2\u01b7\u01b9\13\2\2\2\u01b8\u01b7\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba"+
		"\u01bb\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01ba\3\2"+
		"\2\2\u01bd\u01be\7,\2\2\u01be\u01bf\7\61\2\2\u01bf\u01c0\3\2\2\2\u01c0"+
		"\u01c1\bG\2\2\u01c1\u008e\3\2\2\2\u01c2\u01c3\7\61\2\2\u01c3\u01c4\7\61"+
		"\2\2\u01c4\u01c8\3\2\2\2\u01c5\u01c7\n\13\2\2\u01c6\u01c5\3\2\2\2\u01c7"+
		"\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cb\3\2"+
		"\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01cc\bH\2\2\u01cc\u0090\3\2\2\2\35\2\u00bb"+
		"\u00c0\u00c3\u00ca\u00cf\u00d1\u00d7\u00e2\u00e6\u00f3\u00f9\u00fe\u0166"+
		"\u016f\u0172\u0179\u0184\u0189\u0192\u0199\u01a2\u01a7\u01ad\u01b0\u01ba"+
		"\u01c8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}