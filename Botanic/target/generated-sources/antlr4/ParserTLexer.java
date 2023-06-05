// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		BEGIN=18, END=19, TYPEDEFINE=20, PRINT=21, OR=22, AND=23, MAYOR=24, MENOR=25, 
		IGUAL=26, SUMA=27, RESTA=28, MULTIPLICACION=29, DIVISION=30, COSENO=31, 
		SENO=32, SQRT=33, IF=34, WHILE=35, FOR=36, INT=37, FLOAT=38, STRING=39, 
		NAME=40, WS=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"BEGIN", "END", "TYPEDEFINE", "PRINT", "OR", "AND", "MAYOR", "MENOR", 
		"IGUAL", "SUMA", "RESTA", "MULTIPLICACION", "DIVISION", "COSENO", "SENO", 
		"SQRT", "IF", "WHILE", "FOR", "INT", "FLOAT", "STRING", "NAME", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'=>'", "'tiene '", "' hojas'", "'tiene edad '", "'es de la especie:'", 
		"'tierra '", "'('", "')'", "'le afecta'", "'en'", "'plantaremos de forma '", 
		"'a'", "'tiene'", "'mientras'", "'.'", "'desde'", "'hasta'", "'sembrar'", 
		"'cosechar'", "'la planta'", "'diagnostico'", "'podar'", "'regar'", "'mas largo'", 
		"'menos largo'", "'mismo largo'", "'primavera'", "'invierno'", "'injertar'", 
		"'transplantar'", "'sistematica'", "'albuca'", "'raiz'", "'plantaremos'", 
		"'abonaremos'", "'cavaremos'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "BEGIN", "END", "TYPEDEFINE", "PRINT", 
		"OR", "AND", "MAYOR", "MENOR", "IGUAL", "SUMA", "RESTA", "MULTIPLICACION", 
		"DIVISION", "COSENO", "SENO", "SQRT", "IF", "WHILE", "FOR", "INT", "FLOAT", 
		"STRING", "NAME", "WS"
	};
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


	public ParserTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ParserT.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u01ad\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3&\6&\u018b\n&\r&\16&\u018c\3\'\6\'\u0190\n\'\r\'\16\'\u0191\3\'\3"+
		"\'\6\'\u0196\n\'\r\'\16\'\u0197\3(\3(\6(\u019c\n(\r(\16(\u019d\3(\3(\3"+
		")\6)\u01a3\n)\r)\16)\u01a4\3*\6*\u01a8\n*\r*\16*\u01a9\3*\3*\2\2+\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+\3\2\6\3\2\62;\4\2C\\c|\3\2c|\5\2\13\f\17\17\"\""+
		"\2\u01b2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\3U\3\2\2\2\5X\3\2\2\2\7_\3\2\2\2\tf\3\2\2\2\13r\3\2\2\2\r\u0084"+
		"\3\2\2\2\17\u008c\3\2\2\2\21\u008e\3\2\2\2\23\u0090\3\2\2\2\25\u009a\3"+
		"\2\2\2\27\u009d\3\2\2\2\31\u00b3\3\2\2\2\33\u00b5\3\2\2\2\35\u00bb\3\2"+
		"\2\2\37\u00c4\3\2\2\2!\u00c6\3\2\2\2#\u00cc\3\2\2\2%\u00d2\3\2\2\2\'\u00da"+
		"\3\2\2\2)\u00e3\3\2\2\2+\u00ed\3\2\2\2-\u00f9\3\2\2\2/\u00ff\3\2\2\2\61"+
		"\u0105\3\2\2\2\63\u010f\3\2\2\2\65\u011b\3\2\2\2\67\u0127\3\2\2\29\u0131"+
		"\3\2\2\2;\u013a\3\2\2\2=\u0143\3\2\2\2?\u0150\3\2\2\2A\u015c\3\2\2\2C"+
		"\u0163\3\2\2\2E\u0168\3\2\2\2G\u0174\3\2\2\2I\u017f\3\2\2\2K\u018a\3\2"+
		"\2\2M\u018f\3\2\2\2O\u0199\3\2\2\2Q\u01a2\3\2\2\2S\u01a7\3\2\2\2UV\7?"+
		"\2\2VW\7@\2\2W\4\3\2\2\2XY\7v\2\2YZ\7k\2\2Z[\7g\2\2[\\\7p\2\2\\]\7g\2"+
		"\2]^\7\"\2\2^\6\3\2\2\2_`\7\"\2\2`a\7j\2\2ab\7q\2\2bc\7l\2\2cd\7c\2\2"+
		"de\7u\2\2e\b\3\2\2\2fg\7v\2\2gh\7k\2\2hi\7g\2\2ij\7p\2\2jk\7g\2\2kl\7"+
		"\"\2\2lm\7g\2\2mn\7f\2\2no\7c\2\2op\7f\2\2pq\7\"\2\2q\n\3\2\2\2rs\7g\2"+
		"\2st\7u\2\2tu\7\"\2\2uv\7f\2\2vw\7g\2\2wx\7\"\2\2xy\7n\2\2yz\7c\2\2z{"+
		"\7\"\2\2{|\7g\2\2|}\7u\2\2}~\7r\2\2~\177\7g\2\2\177\u0080\7e\2\2\u0080"+
		"\u0081\7k\2\2\u0081\u0082\7g\2\2\u0082\u0083\7<\2\2\u0083\f\3\2\2\2\u0084"+
		"\u0085\7v\2\2\u0085\u0086\7k\2\2\u0086\u0087\7g\2\2\u0087\u0088\7t\2\2"+
		"\u0088\u0089\7t\2\2\u0089\u008a\7c\2\2\u008a\u008b\7\"\2\2\u008b\16\3"+
		"\2\2\2\u008c\u008d\7*\2\2\u008d\20\3\2\2\2\u008e\u008f\7+\2\2\u008f\22"+
		"\3\2\2\2\u0090\u0091\7n\2\2\u0091\u0092\7g\2\2\u0092\u0093\7\"\2\2\u0093"+
		"\u0094\7c\2\2\u0094\u0095\7h\2\2\u0095\u0096\7g\2\2\u0096\u0097\7e\2\2"+
		"\u0097\u0098\7v\2\2\u0098\u0099\7c\2\2\u0099\24\3\2\2\2\u009a\u009b\7"+
		"g\2\2\u009b\u009c\7p\2\2\u009c\26\3\2\2\2\u009d\u009e\7r\2\2\u009e\u009f"+
		"\7n\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7v\2\2\u00a2"+
		"\u00a3\7c\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7o\2\2"+
		"\u00a6\u00a7\7q\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7\"\2\2\u00a9\u00aa"+
		"\7f\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7\"\2\2\u00ac\u00ad\7h\2\2\u00ad"+
		"\u00ae\7q\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7o\2\2\u00b0\u00b1\7c\2\2"+
		"\u00b1\u00b2\7\"\2\2\u00b2\30\3\2\2\2\u00b3\u00b4\7c\2\2\u00b4\32\3\2"+
		"\2\2\u00b5\u00b6\7v\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9"+
		"\7p\2\2\u00b9\u00ba\7g\2\2\u00ba\34\3\2\2\2\u00bb\u00bc\7o\2\2\u00bc\u00bd"+
		"\7k\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0\7v\2\2\u00c0"+
		"\u00c1\7t\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7u\2\2\u00c3\36\3\2\2\2\u00c4"+
		"\u00c5\7\60\2\2\u00c5 \3\2\2\2\u00c6\u00c7\7f\2\2\u00c7\u00c8\7g\2\2\u00c8"+
		"\u00c9\7u\2\2\u00c9\u00ca\7f\2\2\u00ca\u00cb\7g\2\2\u00cb\"\3\2\2\2\u00cc"+
		"\u00cd\7j\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d0\7v\2\2"+
		"\u00d0\u00d1\7c\2\2\u00d1$\3\2\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d4\7g\2"+
		"\2\u00d4\u00d5\7o\2\2\u00d5\u00d6\7d\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8"+
		"\7c\2\2\u00d8\u00d9\7t\2\2\u00d9&\3\2\2\2\u00da\u00db\7e\2\2\u00db\u00dc"+
		"\7q\2\2\u00dc\u00dd\7u\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7e\2\2\u00df"+
		"\u00e0\7j\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7t\2\2\u00e2(\3\2\2\2\u00e3"+
		"\u00e4\7n\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7\"\2\2\u00e6\u00e7\7r\2"+
		"\2\u00e7\u00e8\7n\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb"+
		"\7v\2\2\u00eb\u00ec\7c\2\2\u00ec*\3\2\2\2\u00ed\u00ee\7f\2\2\u00ee\u00ef"+
		"\7k\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7i\2\2\u00f1\u00f2\7p\2\2\u00f2"+
		"\u00f3\7q\2\2\u00f3\u00f4\7u\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7k\2\2"+
		"\u00f6\u00f7\7e\2\2\u00f7\u00f8\7q\2\2\u00f8,\3\2\2\2\u00f9\u00fa\7r\2"+
		"\2\u00fa\u00fb\7q\2\2\u00fb\u00fc\7f\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe"+
		"\7t\2\2\u00fe.\3\2\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7g\2\2\u0101\u0102"+
		"\7i\2\2\u0102\u0103\7c\2\2\u0103\u0104\7t\2\2\u0104\60\3\2\2\2\u0105\u0106"+
		"\7o\2\2\u0106\u0107\7c\2\2\u0107\u0108\7u\2\2\u0108\u0109\7\"\2\2\u0109"+
		"\u010a\7n\2\2\u010a\u010b\7c\2\2\u010b\u010c\7t\2\2\u010c\u010d\7i\2\2"+
		"\u010d\u010e\7q\2\2\u010e\62\3\2\2\2\u010f\u0110\7o\2\2\u0110\u0111\7"+
		"g\2\2\u0111\u0112\7p\2\2\u0112\u0113\7q\2\2\u0113\u0114\7u\2\2\u0114\u0115"+
		"\7\"\2\2\u0115\u0116\7n\2\2\u0116\u0117\7c\2\2\u0117\u0118\7t\2\2\u0118"+
		"\u0119\7i\2\2\u0119\u011a\7q\2\2\u011a\64\3\2\2\2\u011b\u011c\7o\2\2\u011c"+
		"\u011d\7k\2\2\u011d\u011e\7u\2\2\u011e\u011f\7o\2\2\u011f\u0120\7q\2\2"+
		"\u0120\u0121\7\"\2\2\u0121\u0122\7n\2\2\u0122\u0123\7c\2\2\u0123\u0124"+
		"\7t\2\2\u0124\u0125\7i\2\2\u0125\u0126\7q\2\2\u0126\66\3\2\2\2\u0127\u0128"+
		"\7r\2\2\u0128\u0129\7t\2\2\u0129\u012a\7k\2\2\u012a\u012b\7o\2\2\u012b"+
		"\u012c\7c\2\2\u012c\u012d\7x\2\2\u012d\u012e\7g\2\2\u012e\u012f\7t\2\2"+
		"\u012f\u0130\7c\2\2\u01308\3\2\2\2\u0131\u0132\7k\2\2\u0132\u0133\7p\2"+
		"\2\u0133\u0134\7x\2\2\u0134\u0135\7k\2\2\u0135\u0136\7g\2\2\u0136\u0137"+
		"\7t\2\2\u0137\u0138\7p\2\2\u0138\u0139\7q\2\2\u0139:\3\2\2\2\u013a\u013b"+
		"\7k\2\2\u013b\u013c\7p\2\2\u013c\u013d\7l\2\2\u013d\u013e\7g\2\2\u013e"+
		"\u013f\7t\2\2\u013f\u0140\7v\2\2\u0140\u0141\7c\2\2\u0141\u0142\7t\2\2"+
		"\u0142<\3\2\2\2\u0143\u0144\7v\2\2\u0144\u0145\7t\2\2\u0145\u0146\7c\2"+
		"\2\u0146\u0147\7p\2\2\u0147\u0148\7u\2\2\u0148\u0149\7r\2\2\u0149\u014a"+
		"\7n\2\2\u014a\u014b\7c\2\2\u014b\u014c\7p\2\2\u014c\u014d\7v\2\2\u014d"+
		"\u014e\7c\2\2\u014e\u014f\7t\2\2\u014f>\3\2\2\2\u0150\u0151\7u\2\2\u0151"+
		"\u0152\7k\2\2\u0152\u0153\7u\2\2\u0153\u0154\7v\2\2\u0154\u0155\7g\2\2"+
		"\u0155\u0156\7o\2\2\u0156\u0157\7c\2\2\u0157\u0158\7v\2\2\u0158\u0159"+
		"\7k\2\2\u0159\u015a\7e\2\2\u015a\u015b\7c\2\2\u015b@\3\2\2\2\u015c\u015d"+
		"\7c\2\2\u015d\u015e\7n\2\2\u015e\u015f\7d\2\2\u015f\u0160\7w\2\2\u0160"+
		"\u0161\7e\2\2\u0161\u0162\7c\2\2\u0162B\3\2\2\2\u0163\u0164\7t\2\2\u0164"+
		"\u0165\7c\2\2\u0165\u0166\7k\2\2\u0166\u0167\7|\2\2\u0167D\3\2\2\2\u0168"+
		"\u0169\7r\2\2\u0169\u016a\7n\2\2\u016a\u016b\7c\2\2\u016b\u016c\7p\2\2"+
		"\u016c\u016d\7v\2\2\u016d\u016e\7c\2\2\u016e\u016f\7t\2\2\u016f\u0170"+
		"\7g\2\2\u0170\u0171\7o\2\2\u0171\u0172\7q\2\2\u0172\u0173\7u\2\2\u0173"+
		"F\3\2\2\2\u0174\u0175\7c\2\2\u0175\u0176\7d\2\2\u0176\u0177\7q\2\2\u0177"+
		"\u0178\7p\2\2\u0178\u0179\7c\2\2\u0179\u017a\7t\2\2\u017a\u017b\7g\2\2"+
		"\u017b\u017c\7o\2\2\u017c\u017d\7q\2\2\u017d\u017e\7u\2\2\u017eH\3\2\2"+
		"\2\u017f\u0180\7e\2\2\u0180\u0181\7c\2\2\u0181\u0182\7x\2\2\u0182\u0183"+
		"\7c\2\2\u0183\u0184\7t\2\2\u0184\u0185\7g\2\2\u0185\u0186\7o\2\2\u0186"+
		"\u0187\7q\2\2\u0187\u0188\7u\2\2\u0188J\3\2\2\2\u0189\u018b\t\2\2\2\u018a"+
		"\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2"+
		"\2\2\u018dL\3\2\2\2\u018e\u0190\t\2\2\2\u018f\u018e\3\2\2\2\u0190\u0191"+
		"\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u0195\7.\2\2\u0194\u0196\t\2\2\2\u0195\u0194\3\2\2\2\u0196\u0197\3\2"+
		"\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198N\3\2\2\2\u0199\u019b"+
		"\7$\2\2\u019a\u019c\t\3\2\2\u019b\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\7$"+
		"\2\2\u01a0P\3\2\2\2\u01a1\u01a3\t\4\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a4"+
		"\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5R\3\2\2\2\u01a6"+
		"\u01a8\t\5\2\2\u01a7\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01a7\3\2"+
		"\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\b*\2\2\u01ac"+
		"T\3\2\2\2\t\2\u018c\u0191\u0197\u019d\u01a4\u01a9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}