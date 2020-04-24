// Generated from MADS.g4 by ANTLR 4.8

    package compiler;

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		DataType=25, DataTypeValue=26, LogicalOperator=27, RelationalOperator=28, 
		String=29, DIGIT=30, Integer=31, Float=32, Bool=33, IDENTIFIER=34, NumberValue=35, 
		Keyword=36, Whitespace=37, Newline=38, BlockComment=39, LineComment=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "DataType", 
			"DataTypeValue", "LogicalOperator", "RelationalOperator", "String", "DIGIT", 
			"Integer", "Float", "Bool", "IDENTIFIER", "NumberValue", "Keyword", "Whitespace", 
			"Newline", "BlockComment", "LineComment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u0168\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u00b0\n\32\3\33\3\33\3\33\3\33\5\33\u00b6\n\33\3\34\3\34\3\34\3"+
		"\34\5\34\u00bc\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u00c7\n\35\3\36\3\36\7\36\u00cb\n\36\f\36\16\36\u00ce\13\36\3\36\3\36"+
		"\3\37\6\37\u00d3\n\37\r\37\16\37\u00d4\3 \3 \3 \5 \u00da\n \3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u00e8\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\5\"\u00f3\n\"\3#\3#\7#\u00f7\n#\f#\16#\u00fa\13#\3$\3$\5$\u00fe\n"+
		"$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u013e\n%\3&\6&\u0141"+
		"\n&\r&\16&\u0142\3&\3&\3\'\3\'\5\'\u0149\n\'\3\'\5\'\u014c\n\'\3\'\3\'"+
		"\3(\3(\3(\3(\7(\u0154\n(\f(\16(\u0157\13(\3(\3(\3(\3(\3(\3)\3)\3)\3)\7"+
		")\u0162\n)\f)\16)\u0165\13)\3)\3)\3\u0155\2*\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*\3"+
		"\2\t\4\2>>@@\5\2\62;C\\c|\3\2\62;\3\2c|\6\2\62;C\\aac|\4\2\13\13\"\"\4"+
		"\2\f\f\17\17\2\u018f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\3S\3\2\2\2\5X\3\2\2\2\7Z\3\2\2\2\t\\\3\2\2\2\13^\3\2\2\2\r`\3"+
		"\2\2\2\17b\3\2\2\2\21d\3\2\2\2\23f\3\2\2\2\25h\3\2\2\2\27j\3\2\2\2\31"+
		"l\3\2\2\2\33n\3\2\2\2\35q\3\2\2\2\37t\3\2\2\2!v\3\2\2\2#x\3\2\2\2%z\3"+
		"\2\2\2\'}\3\2\2\2)\u0082\3\2\2\2+\u0088\3\2\2\2-\u008c\3\2\2\2/\u0095"+
		"\3\2\2\2\61\u0097\3\2\2\2\63\u00af\3\2\2\2\65\u00b5\3\2\2\2\67\u00bb\3"+
		"\2\2\29\u00c6\3\2\2\2;\u00c8\3\2\2\2=\u00d2\3\2\2\2?\u00d9\3\2\2\2A\u00e7"+
		"\3\2\2\2C\u00f2\3\2\2\2E\u00f4\3\2\2\2G\u00fd\3\2\2\2I\u013d\3\2\2\2K"+
		"\u0140\3\2\2\2M\u014b\3\2\2\2O\u014f\3\2\2\2Q\u015d\3\2\2\2ST\7o\2\2T"+
		"U\7c\2\2UV\7k\2\2VW\7p\2\2W\4\3\2\2\2XY\7*\2\2Y\6\3\2\2\2Z[\7+\2\2[\b"+
		"\3\2\2\2\\]\7}\2\2]\n\3\2\2\2^_\7\177\2\2_\f\3\2\2\2`a\7=\2\2a\16\3\2"+
		"\2\2bc\7?\2\2c\20\3\2\2\2de\7-\2\2e\22\3\2\2\2fg\7/\2\2g\24\3\2\2\2hi"+
		"\7,\2\2i\26\3\2\2\2jk\7\61\2\2k\30\3\2\2\2lm\7\'\2\2m\32\3\2\2\2no\7-"+
		"\2\2op\7-\2\2p\34\3\2\2\2qr\7/\2\2rs\7/\2\2s\36\3\2\2\2tu\7#\2\2u \3\2"+
		"\2\2vw\7A\2\2w\"\3\2\2\2xy\7<\2\2y$\3\2\2\2z{\7k\2\2{|\7h\2\2|&\3\2\2"+
		"\2}~\7g\2\2~\177\7n\2\2\177\u0080\7u\2\2\u0080\u0081\7g\2\2\u0081(\3\2"+
		"\2\2\u0082\u0083\7y\2\2\u0083\u0084\7j\2\2\u0084\u0085\7k\2\2\u0085\u0086"+
		"\7n\2\2\u0086\u0087\7g\2\2\u0087*\3\2\2\2\u0088\u0089\7h\2\2\u0089\u008a"+
		"\7q\2\2\u008a\u008b\7t\2\2\u008b,\3\2\2\2\u008c\u008d\7k\2\2\u008d\u008e"+
		"\7p\2\2\u008e\u008f\7\"\2\2\u008f\u0090\7t\2\2\u0090\u0091\7c\2\2\u0091"+
		"\u0092\7p\2\2\u0092\u0093\7i\2\2\u0093\u0094\7g\2\2\u0094.\3\2\2\2\u0095"+
		"\u0096\7.\2\2\u0096\60\3\2\2\2\u0097\u0098\7r\2\2\u0098\u0099\7t\2\2\u0099"+
		"\u009a\7k\2\2\u009a\u009b\7p\2\2\u009b\u009c\7v\2\2\u009c\62\3\2\2\2\u009d"+
		"\u009e\7k\2\2\u009e\u009f\7p\2\2\u009f\u00b0\7v\2\2\u00a0\u00a1\7h\2\2"+
		"\u00a1\u00a2\7n\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7c\2\2\u00a4\u00b0"+
		"\7v\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7t\2\2\u00a8"+
		"\u00a9\7k\2\2\u00a9\u00aa\7p\2\2\u00aa\u00b0\7i\2\2\u00ab\u00ac\7d\2\2"+
		"\u00ac\u00ad\7q\2\2\u00ad\u00ae\7q\2\2\u00ae\u00b0\7n\2\2\u00af\u009d"+
		"\3\2\2\2\u00af\u00a0\3\2\2\2\u00af\u00a5\3\2\2\2\u00af\u00ab\3\2\2\2\u00b0"+
		"\64\3\2\2\2\u00b1\u00b6\5? \2\u00b2\u00b6\5A!\2\u00b3\u00b6\5;\36\2\u00b4"+
		"\u00b6\5C\"\2\u00b5\u00b1\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b5\u00b4\3\2\2\2\u00b6\66\3\2\2\2\u00b7\u00bc\7(\2\2\u00b8\u00b9"+
		"\7~\2\2\u00b9\u00ba\7\"\2\2\u00ba\u00bc\7~\2\2\u00bb\u00b7\3\2\2\2\u00bb"+
		"\u00b8\3\2\2\2\u00bc8\3\2\2\2\u00bd\u00c7\t\2\2\2\u00be\u00bf\7@\2\2\u00bf"+
		"\u00c7\7?\2\2\u00c0\u00c1\7>\2\2\u00c1\u00c7\7?\2\2\u00c2\u00c3\7?\2\2"+
		"\u00c3\u00c7\7?\2\2\u00c4\u00c5\7#\2\2\u00c5\u00c7\7?\2\2\u00c6\u00bd"+
		"\3\2\2\2\u00c6\u00be\3\2\2\2\u00c6\u00c0\3\2\2\2\u00c6\u00c2\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c7:\3\2\2\2\u00c8\u00cc\7\u201e\2\2\u00c9\u00cb\t\3"+
		"\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\7\u201f"+
		"\2\2\u00d0<\3\2\2\2\u00d1\u00d3\t\4\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5>\3\2\2\2\u00d6"+
		"\u00d7\7/\2\2\u00d7\u00da\5=\37\2\u00d8\u00da\5=\37\2\u00d9\u00d6\3\2"+
		"\2\2\u00d9\u00d8\3\2\2\2\u00da@\3\2\2\2\u00db\u00e8\5=\37\2\u00dc\u00dd"+
		"\5=\37\2\u00dd\u00de\7\60\2\2\u00de\u00df\5=\37\2\u00df\u00e8\3\2\2\2"+
		"\u00e0\u00e1\7/\2\2\u00e1\u00e8\5=\37\2\u00e2\u00e3\7/\2\2\u00e3\u00e4"+
		"\5=\37\2\u00e4\u00e5\7\60\2\2\u00e5\u00e6\5=\37\2\u00e6\u00e8\3\2\2\2"+
		"\u00e7\u00db\3\2\2\2\u00e7\u00dc\3\2\2\2\u00e7\u00e0\3\2\2\2\u00e7\u00e2"+
		"\3\2\2\2\u00e8B\3\2\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec"+
		"\7w\2\2\u00ec\u00f3\7g\2\2\u00ed\u00ee\7h\2\2\u00ee\u00ef\7c\2\2\u00ef"+
		"\u00f0\7n\2\2\u00f0\u00f1\7u\2\2\u00f1\u00f3\7g\2\2\u00f2\u00e9\3\2\2"+
		"\2\u00f2\u00ed\3\2\2\2\u00f3D\3\2\2\2\u00f4\u00f8\t\5\2\2\u00f5\u00f7"+
		"\t\6\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9F\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fe\5E#\2\u00fc"+
		"\u00fe\5=\37\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00feH\3\2\2\2"+
		"\u00ff\u0100\7u\2\2\u0100\u0101\7v\2\2\u0101\u0102\7c\2\2\u0102\u0103"+
		"\7t\2\2\u0103\u013e\7v\2\2\u0104\u0105\7g\2\2\u0105\u0106\7p\2\2\u0106"+
		"\u013e\7f\2\2\u0107\u0108\7k\2\2\u0108\u0109\7p\2\2\u0109\u013e\7v\2\2"+
		"\u010a\u010b\7h\2\2\u010b\u010c\7n\2\2\u010c\u010d\7q\2\2\u010d\u010e"+
		"\7c\2\2\u010e\u013e\7v\2\2\u010f\u0110\7u\2\2\u0110\u0111\7v\2\2\u0111"+
		"\u0112\7t\2\2\u0112\u0113\7k\2\2\u0113\u0114\7p\2\2\u0114\u013e\7i\2\2"+
		"\u0115\u0116\7d\2\2\u0116\u0117\7q\2\2\u0117\u0118\7q\2\2\u0118\u013e"+
		"\7n\2\2\u0119\u011a\7h\2\2\u011a\u011b\7q\2\2\u011b\u013e\7t\2\2\u011c"+
		"\u011d\7y\2\2\u011d\u011e\7j\2\2\u011e\u011f\7k\2\2\u011f\u0120\7n\2\2"+
		"\u0120\u013e\7g\2\2\u0121\u0122\7k\2\2\u0122\u013e\7h\2\2\u0123\u0124"+
		"\7g\2\2\u0124\u0125\7n\2\2\u0125\u0126\7u\2\2\u0126\u013e\7g\2\2\u0127"+
		"\u0128\7v\2\2\u0128\u0129\7t\2\2\u0129\u012a\7w\2\2\u012a\u013e\7g\2\2"+
		"\u012b\u012c\7h\2\2\u012c\u012d\7c\2\2\u012d\u012e\7n\2\2\u012e\u012f"+
		"\7u\2\2\u012f\u013e\7g\2\2\u0130\u0131\7r\2\2\u0131\u0132\7t\2\2\u0132"+
		"\u0133\7k\2\2\u0133\u0134\7p\2\2\u0134\u013e\7v\2\2\u0135\u0136\7c\2\2"+
		"\u0136\u0137\7p\2\2\u0137\u013e\7f\2\2\u0138\u0139\7q\2\2\u0139\u013e"+
		"\7t\2\2\u013a\u013b\7p\2\2\u013b\u013c\7q\2\2\u013c\u013e\7v\2\2\u013d"+
		"\u00ff\3\2\2\2\u013d\u0104\3\2\2\2\u013d\u0107\3\2\2\2\u013d\u010a\3\2"+
		"\2\2\u013d\u010f\3\2\2\2\u013d\u0115\3\2\2\2\u013d\u0119\3\2\2\2\u013d"+
		"\u011c\3\2\2\2\u013d\u0121\3\2\2\2\u013d\u0123\3\2\2\2\u013d\u0127\3\2"+
		"\2\2\u013d\u012b\3\2\2\2\u013d\u0130\3\2\2\2\u013d\u0135\3\2\2\2\u013d"+
		"\u0138\3\2\2\2\u013d\u013a\3\2\2\2\u013eJ\3\2\2\2\u013f\u0141\t\7\2\2"+
		"\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\b&\2\2\u0145L\3\2\2\2\u0146\u0148"+
		"\7\17\2\2\u0147\u0149\7\f\2\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2"+
		"\u0149\u014c\3\2\2\2\u014a\u014c\7\f\2\2\u014b\u0146\3\2\2\2\u014b\u014a"+
		"\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\b\'\2\2\u014eN\3\2\2\2\u014f"+
		"\u0150\7\61\2\2\u0150\u0151\7,\2\2\u0151\u0155\3\2\2\2\u0152\u0154\13"+
		"\2\2\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0156\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159\7,"+
		"\2\2\u0159\u015a\7\61\2\2\u015a\u015b\3\2\2\2\u015b\u015c\b(\2\2\u015c"+
		"P\3\2\2\2\u015d\u015e\7\61\2\2\u015e\u015f\7\61\2\2\u015f\u0163\3\2\2"+
		"\2\u0160\u0162\n\b\2\2\u0161\u0160\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161"+
		"\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166"+
		"\u0167\b)\2\2\u0167R\3\2\2\2\24\2\u00af\u00b5\u00bb\u00c6\u00cc\u00d4"+
		"\u00d9\u00e7\u00f2\u00f8\u00fd\u013d\u0142\u0148\u014b\u0155\u0163\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}