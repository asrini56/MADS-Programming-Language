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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, TypeSpecifier=8, 
		DigitSequence=9, FractionalSequence=10, Identifier=11, Constant=12, BoolConstant=13, 
		NumberConstant=14, Float=15, Int=16, String=17, Bool=18, True=19, False=20, 
		LeftParen=21, RightParen=22, LeftBrace=23, RightBrace=24, Less=25, LessEqual=26, 
		Greater=27, GreaterEqual=28, Plus=29, PlusPlus=30, Minus=31, MinusMinus=32, 
		Star=33, Div=34, Mod=35, And=36, Or=37, Not=38, Question=39, Colon=40, 
		Semi=41, Comma=42, Assign=43, Equal=44, NotEqual=45, Dot=46, StringLiteral=47, 
		Whitespace=48, Newline=49, BlockComment=50, LineComment=51;
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
			"NumberConstant", "Digit", "Float", "Int", "String", "Bool", "True", 
			"False", "LeftParen", "RightParen", "LeftBrace", "RightBrace", "Less", 
			"LessEqual", "Greater", "GreaterEqual", "Plus", "PlusPlus", "Minus", 
			"MinusMinus", "Star", "Div", "Mod", "And", "Or", "Not", "Question", "Colon", 
			"Semi", "Comma", "Assign", "Equal", "NotEqual", "Dot", "IdentifierNondigit", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u01b1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\5\t\u00b6\n\t\3\n\6\n\u00b9\n\n\r\n\16\n\u00ba\3\13\5\13\u00be"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\5\13\u00c5\n\13\3\f\3\f\3\f\7\f\u00ca\n"+
		"\f\f\f\16\f\u00cd\13\f\3\r\3\r\3\r\5\r\u00d2\n\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u00dd\n\16\3\17\3\17\5\17\u00e1\n\17\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3 "+
		"\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*"+
		"\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\7\64\u0149\n\64\f\64\16\64\u014c\13\64\3\65\3\65"+
		"\3\66\3\66\3\67\3\67\5\67\u0154\n\67\38\58\u0157\n8\38\38\38\38\38\58"+
		"\u015e\n8\39\39\3:\3:\3:\3:\3;\7;\u0167\n;\f;\16;\u016a\13;\3<\3<\5<\u016e"+
		"\n<\3=\3=\3>\3>\3>\3?\3?\5?\u0177\n?\3?\3?\3@\6@\u017c\n@\r@\16@\u017d"+
		"\3A\3A\3A\3A\3A\3A\3A\5A\u0187\nA\3B\6B\u018a\nB\rB\16B\u018b\3B\3B\3"+
		"C\3C\5C\u0192\nC\3C\5C\u0195\nC\3C\3C\3D\3D\3D\3D\7D\u019d\nD\fD\16D\u01a0"+
		"\13D\3D\3D\3D\3D\3D\3E\3E\3E\3E\7E\u01ab\nE\fE\16E\u01ae\13E\3E\3E\3\u019e"+
		"\2F\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\2!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35"+
		";\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\2c\2e\2g\2i\2k\2m\2o\2"+
		"q\2s\2u\2w\2y\2{\2}\61\177\2\u0081\2\u0083\62\u0085\63\u0087\64\u0089"+
		"\65\3\2\13\3\2\62;\5\2C\\aac|\3\2\63;\4\2--//\6\2\f\f\17\17))^^\f\2$$"+
		"))AA^^cdhhppttvvxx\6\2\f\f\17\17$$^^\4\2\13\13\"\"\4\2\f\f\17\17\2\u01bb"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2}\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\3\u008b\3\2\2"+
		"\2\5\u0090\3\2\2\2\7\u0093\3\2\2\2\t\u0098\3\2\2\2\13\u009e\3\2\2\2\r"+
		"\u00a2\3\2\2\2\17\u00ab\3\2\2\2\21\u00b5\3\2\2\2\23\u00b8\3\2\2\2\25\u00c4"+
		"\3\2\2\2\27\u00c6\3\2\2\2\31\u00d1\3\2\2\2\33\u00dc\3\2\2\2\35\u00e0\3"+
		"\2\2\2\37\u00e2\3\2\2\2!\u00e4\3\2\2\2#\u00ea\3\2\2\2%\u00ee\3\2\2\2\'"+
		"\u00f5\3\2\2\2)\u00fa\3\2\2\2+\u00ff\3\2\2\2-\u0105\3\2\2\2/\u0107\3\2"+
		"\2\2\61\u0109\3\2\2\2\63\u010b\3\2\2\2\65\u010d\3\2\2\2\67\u010f\3\2\2"+
		"\29\u0112\3\2\2\2;\u0114\3\2\2\2=\u0117\3\2\2\2?\u0119\3\2\2\2A\u011c"+
		"\3\2\2\2C\u011e\3\2\2\2E\u0121\3\2\2\2G\u0123\3\2\2\2I\u0125\3\2\2\2K"+
		"\u0127\3\2\2\2M\u0129\3\2\2\2O\u012c\3\2\2\2Q\u012e\3\2\2\2S\u0130\3\2"+
		"\2\2U\u0132\3\2\2\2W\u0134\3\2\2\2Y\u0136\3\2\2\2[\u0138\3\2\2\2]\u013b"+
		"\3\2\2\2_\u013e\3\2\2\2a\u0140\3\2\2\2c\u0142\3\2\2\2e\u0144\3\2\2\2g"+
		"\u0146\3\2\2\2i\u014d\3\2\2\2k\u014f\3\2\2\2m\u0153\3\2\2\2o\u015d\3\2"+
		"\2\2q\u015f\3\2\2\2s\u0161\3\2\2\2u\u0168\3\2\2\2w\u016d\3\2\2\2y\u016f"+
		"\3\2\2\2{\u0171\3\2\2\2}\u0174\3\2\2\2\177\u017b\3\2\2\2\u0081\u0186\3"+
		"\2\2\2\u0083\u0189\3\2\2\2\u0085\u0194\3\2\2\2\u0087\u0198\3\2\2\2\u0089"+
		"\u01a6\3\2\2\2\u008b\u008c\7o\2\2\u008c\u008d\7c\2\2\u008d\u008e\7k\2"+
		"\2\u008e\u008f\7p\2\2\u008f\4\3\2\2\2\u0090\u0091\7k\2\2\u0091\u0092\7"+
		"h\2\2\u0092\6\3\2\2\2\u0093\u0094\7g\2\2\u0094\u0095\7n\2\2\u0095\u0096"+
		"\7u\2\2\u0096\u0097\7g\2\2\u0097\b\3\2\2\2\u0098\u0099\7y\2\2\u0099\u009a"+
		"\7j\2\2\u009a\u009b\7k\2\2\u009b\u009c\7n\2\2\u009c\u009d\7g\2\2\u009d"+
		"\n\3\2\2\2\u009e\u009f\7h\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7t\2\2\u00a1"+
		"\f\3\2\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7\"\2\2\u00a5"+
		"\u00a6\7t\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7i\2\2"+
		"\u00a9\u00aa\7g\2\2\u00aa\16\3\2\2\2\u00ab\u00ac\7r\2\2\u00ac\u00ad\7"+
		"t\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7p\2\2\u00af\u00b0\7v\2\2\u00b0\20"+
		"\3\2\2\2\u00b1\u00b6\5#\22\2\u00b2\u00b6\5!\21\2\u00b3\u00b6\5\'\24\2"+
		"\u00b4\u00b6\5%\23\2\u00b5\u00b1\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\22\3\2\2\2\u00b7\u00b9\5\37\20\2\u00b8"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb\24\3\2\2\2\u00bc\u00be\5\23\n\2\u00bd\u00bc\3\2\2\2\u00bd\u00be"+
		"\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\7\60\2\2\u00c0\u00c5\5\23\n\2"+
		"\u00c1\u00c2\5\23\n\2\u00c2\u00c3\7\60\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00bd"+
		"\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c5\26\3\2\2\2\u00c6\u00cb\5a\61\2\u00c7"+
		"\u00ca\5a\61\2\u00c8\u00ca\5\37\20\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3"+
		"\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\30\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d2\5\35\17\2\u00cf\u00d2\5\33"+
		"\16\2\u00d0\u00d2\5s:\2\u00d1\u00ce\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d0\3\2\2\2\u00d2\32\3\2\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7t\2\2"+
		"\u00d5\u00d6\7w\2\2\u00d6\u00dd\7g\2\2\u00d7\u00d8\7h\2\2\u00d8\u00d9"+
		"\7c\2\2\u00d9\u00da\7n\2\2\u00da\u00db\7u\2\2\u00db\u00dd\7g\2\2\u00dc"+
		"\u00d3\3\2\2\2\u00dc\u00d7\3\2\2\2\u00dd\34\3\2\2\2\u00de\u00e1\5e\63"+
		"\2\u00df\u00e1\5k\66\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\36"+
		"\3\2\2\2\u00e2\u00e3\t\2\2\2\u00e3 \3\2\2\2\u00e4\u00e5\7h\2\2\u00e5\u00e6"+
		"\7n\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9\7v\2\2\u00e9"+
		"\"\3\2\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec\7p\2\2\u00ec\u00ed\7v\2\2\u00ed"+
		"$\3\2\2\2\u00ee\u00ef\7u\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7t\2\2\u00f1"+
		"\u00f2\7k\2\2\u00f2\u00f3\7p\2\2\u00f3\u00f4\7i\2\2\u00f4&\3\2\2\2\u00f5"+
		"\u00f6\7d\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7n\2\2"+
		"\u00f9(\3\2\2\2\u00fa\u00fb\7v\2\2\u00fb\u00fc\7t\2\2\u00fc\u00fd\7w\2"+
		"\2\u00fd\u00fe\7g\2\2\u00fe*\3\2\2\2\u00ff\u0100\7h\2\2\u0100\u0101\7"+
		"c\2\2\u0101\u0102\7n\2\2\u0102\u0103\7u\2\2\u0103\u0104\7g\2\2\u0104,"+
		"\3\2\2\2\u0105\u0106\7*\2\2\u0106.\3\2\2\2\u0107\u0108\7+\2\2\u0108\60"+
		"\3\2\2\2\u0109\u010a\7}\2\2\u010a\62\3\2\2\2\u010b\u010c\7\177\2\2\u010c"+
		"\64\3\2\2\2\u010d\u010e\7>\2\2\u010e\66\3\2\2\2\u010f\u0110\7>\2\2\u0110"+
		"\u0111\7?\2\2\u01118\3\2\2\2\u0112\u0113\7@\2\2\u0113:\3\2\2\2\u0114\u0115"+
		"\7@\2\2\u0115\u0116\7?\2\2\u0116<\3\2\2\2\u0117\u0118\7-\2\2\u0118>\3"+
		"\2\2\2\u0119\u011a\7-\2\2\u011a\u011b\7-\2\2\u011b@\3\2\2\2\u011c\u011d"+
		"\7/\2\2\u011dB\3\2\2\2\u011e\u011f\7/\2\2\u011f\u0120\7/\2\2\u0120D\3"+
		"\2\2\2\u0121\u0122\7,\2\2\u0122F\3\2\2\2\u0123\u0124\7\61\2\2\u0124H\3"+
		"\2\2\2\u0125\u0126\7\'\2\2\u0126J\3\2\2\2\u0127\u0128\7(\2\2\u0128L\3"+
		"\2\2\2\u0129\u012a\7~\2\2\u012a\u012b\7~\2\2\u012bN\3\2\2\2\u012c\u012d"+
		"\7#\2\2\u012dP\3\2\2\2\u012e\u012f\7A\2\2\u012fR\3\2\2\2\u0130\u0131\7"+
		"<\2\2\u0131T\3\2\2\2\u0132\u0133\7=\2\2\u0133V\3\2\2\2\u0134\u0135\7."+
		"\2\2\u0135X\3\2\2\2\u0136\u0137\7?\2\2\u0137Z\3\2\2\2\u0138\u0139\7?\2"+
		"\2\u0139\u013a\7?\2\2\u013a\\\3\2\2\2\u013b\u013c\7#\2\2\u013c\u013d\7"+
		"?\2\2\u013d^\3\2\2\2\u013e\u013f\7\60\2\2\u013f`\3\2\2\2\u0140\u0141\5"+
		"c\62\2\u0141b\3\2\2\2\u0142\u0143\t\3\2\2\u0143d\3\2\2\2\u0144\u0145\5"+
		"g\64\2\u0145f\3\2\2\2\u0146\u014a\5i\65\2\u0147\u0149\5\37\20\2\u0148"+
		"\u0147\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014bh\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\t\4\2\2\u014ej\3\2"+
		"\2\2\u014f\u0150\5m\67\2\u0150l\3\2\2\2\u0151\u0154\5o8\2\u0152\u0154"+
		"\5\23\n\2\u0153\u0151\3\2\2\2\u0153\u0152\3\2\2\2\u0154n\3\2\2\2\u0155"+
		"\u0157\5\23\n\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3"+
		"\2\2\2\u0158\u0159\7\60\2\2\u0159\u015e\5\23\n\2\u015a\u015b\5\23\n\2"+
		"\u015b\u015c\7\60\2\2\u015c\u015e\3\2\2\2\u015d\u0156\3\2\2\2\u015d\u015a"+
		"\3\2\2\2\u015ep\3\2\2\2\u015f\u0160\t\5\2\2\u0160r\3\2\2\2\u0161\u0162"+
		"\7$\2\2\u0162\u0163\5u;\2\u0163\u0164\7$\2\2\u0164t\3\2\2\2\u0165\u0167"+
		"\5w<\2\u0166\u0165\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169v\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016e\n\6\2\2"+
		"\u016c\u016e\5y=\2\u016d\u016b\3\2\2\2\u016d\u016c\3\2\2\2\u016ex\3\2"+
		"\2\2\u016f\u0170\5{>\2\u0170z\3\2\2\2\u0171\u0172\7^\2\2\u0172\u0173\t"+
		"\7\2\2\u0173|\3\2\2\2\u0174\u0176\7$\2\2\u0175\u0177\5\177@\2\u0176\u0175"+
		"\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\7$\2\2\u0179"+
		"~\3\2\2\2\u017a\u017c\5\u0081A\2\u017b\u017a\3\2\2\2\u017c\u017d\3\2\2"+
		"\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0080\3\2\2\2\u017f\u0187"+
		"\n\b\2\2\u0180\u0187\5y=\2\u0181\u0182\7^\2\2\u0182\u0187\7\f\2\2\u0183"+
		"\u0184\7^\2\2\u0184\u0185\7\17\2\2\u0185\u0187\7\f\2\2\u0186\u017f\3\2"+
		"\2\2\u0186\u0180\3\2\2\2\u0186\u0181\3\2\2\2\u0186\u0183\3\2\2\2\u0187"+
		"\u0082\3\2\2\2\u0188\u018a\t\t\2\2\u0189\u0188\3\2\2\2\u018a\u018b\3\2"+
		"\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\u018e\bB\2\2\u018e\u0084\3\2\2\2\u018f\u0191\7\17\2\2\u0190\u0192\7\f"+
		"\2\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0195\3\2\2\2\u0193"+
		"\u0195\7\f\2\2\u0194\u018f\3\2\2\2\u0194\u0193\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196\u0197\bC\2\2\u0197\u0086\3\2\2\2\u0198\u0199\7\61\2\2\u0199"+
		"\u019a\7,\2\2\u019a\u019e\3\2\2\2\u019b\u019d\13\2\2\2\u019c\u019b\3\2"+
		"\2\2\u019d\u01a0\3\2\2\2\u019e\u019f\3\2\2\2\u019e\u019c\3\2\2\2\u019f"+
		"\u01a1\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a2\7,\2\2\u01a2\u01a3\7\61"+
		"\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\bD\2\2\u01a5\u0088\3\2\2\2\u01a6"+
		"\u01a7\7\61\2\2\u01a7\u01a8\7\61\2\2\u01a8\u01ac\3\2\2\2\u01a9\u01ab\n"+
		"\n\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac"+
		"\u01ad\3\2\2\2\u01ad\u01af\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b0\bE"+
		"\2\2\u01b0\u008a\3\2\2\2\32\2\u00b5\u00ba\u00bd\u00c4\u00c9\u00cb\u00d1"+
		"\u00dc\u00e0\u014a\u0153\u0156\u015d\u0168\u016d\u0176\u017d\u0186\u018b"+
		"\u0191\u0194\u019e\u01ac\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}