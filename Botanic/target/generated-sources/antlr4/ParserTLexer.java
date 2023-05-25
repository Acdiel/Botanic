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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, BEGIN=8, END=9, 
		PRINT=10, TYPEDEFINE=11, OR=12, AND=13, SUMA=14, RESTA=15, MULTIPLICACION=16, 
		DIVISION=17, COSENO=18, SENO=19, SQRT=20, IF=21, WHILE=22, FOR=23, NAME=24, 
		STRING=25, INT=26, FLOAT=27, WS=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "BEGIN", "END", 
		"PRINT", "TYPEDEFINE", "OR", "AND", "SUMA", "RESTA", "MULTIPLICACION", 
		"DIVISION", "COSENO", "SENO", "SQRT", "IF", "WHILE", "FOR", "NAME", "STRING", 
		"INT", "FLOAT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'=>'", "'tiene'", "'hojas'", "'tiene edad'", "'es de la especie:'", 
		"'('", "')'", "'sembrar'", "'cosechar'", "'diagnostico'", "'la planta'", 
		"'podar'", "'regar'", "'primavera'", "'invierno'", "'injertar'", "'transplantar'", 
		"'corcho'", "'albuca'", "'raiz'", "'plantaremos'", "'abonaremos'", "'cavaremos'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "BEGIN", "END", "PRINT", 
		"TYPEDEFINE", "OR", "AND", "SUMA", "RESTA", "MULTIPLICACION", "DIVISION", 
		"COSENO", "SENO", "SQRT", "IF", "WHILE", "FOR", "NAME", "STRING", "INT", 
		"FLOAT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u011f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\6\31\u00fd\n\31\r\31\16\31\u00fe\3\32\3\32\6\32\u0103"+
		"\n\32\r\32\16\32\u0104\3\32\3\32\3\33\6\33\u010a\n\33\r\33\16\33\u010b"+
		"\3\34\6\34\u010f\n\34\r\34\16\34\u0110\3\34\3\34\6\34\u0115\n\34\r\34"+
		"\16\34\u0116\3\35\6\35\u011a\n\35\r\35\16\35\u011b\3\35\3\35\2\2\36\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36\3\2\6"+
		"\3\2c|\5\2\"\"C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u0124\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5>\3\2\2\2"+
		"\7D\3\2\2\2\tJ\3\2\2\2\13U\3\2\2\2\rg\3\2\2\2\17i\3\2\2\2\21k\3\2\2\2"+
		"\23s\3\2\2\2\25|\3\2\2\2\27\u0088\3\2\2\2\31\u0092\3\2\2\2\33\u0098\3"+
		"\2\2\2\35\u009e\3\2\2\2\37\u00a8\3\2\2\2!\u00b1\3\2\2\2#\u00ba\3\2\2\2"+
		"%\u00c7\3\2\2\2\'\u00ce\3\2\2\2)\u00d5\3\2\2\2+\u00da\3\2\2\2-\u00e6\3"+
		"\2\2\2/\u00f1\3\2\2\2\61\u00fc\3\2\2\2\63\u0100\3\2\2\2\65\u0109\3\2\2"+
		"\2\67\u010e\3\2\2\29\u0119\3\2\2\2;<\7?\2\2<=\7@\2\2=\4\3\2\2\2>?\7v\2"+
		"\2?@\7k\2\2@A\7g\2\2AB\7p\2\2BC\7g\2\2C\6\3\2\2\2DE\7j\2\2EF\7q\2\2FG"+
		"\7l\2\2GH\7c\2\2HI\7u\2\2I\b\3\2\2\2JK\7v\2\2KL\7k\2\2LM\7g\2\2MN\7p\2"+
		"\2NO\7g\2\2OP\7\"\2\2PQ\7g\2\2QR\7f\2\2RS\7c\2\2ST\7f\2\2T\n\3\2\2\2U"+
		"V\7g\2\2VW\7u\2\2WX\7\"\2\2XY\7f\2\2YZ\7g\2\2Z[\7\"\2\2[\\\7n\2\2\\]\7"+
		"c\2\2]^\7\"\2\2^_\7g\2\2_`\7u\2\2`a\7r\2\2ab\7g\2\2bc\7e\2\2cd\7k\2\2"+
		"de\7g\2\2ef\7<\2\2f\f\3\2\2\2gh\7*\2\2h\16\3\2\2\2ij\7+\2\2j\20\3\2\2"+
		"\2kl\7u\2\2lm\7g\2\2mn\7o\2\2no\7d\2\2op\7t\2\2pq\7c\2\2qr\7t\2\2r\22"+
		"\3\2\2\2st\7e\2\2tu\7q\2\2uv\7u\2\2vw\7g\2\2wx\7e\2\2xy\7j\2\2yz\7c\2"+
		"\2z{\7t\2\2{\24\3\2\2\2|}\7f\2\2}~\7k\2\2~\177\7c\2\2\177\u0080\7i\2\2"+
		"\u0080\u0081\7p\2\2\u0081\u0082\7q\2\2\u0082\u0083\7u\2\2\u0083\u0084"+
		"\7v\2\2\u0084\u0085\7k\2\2\u0085\u0086\7e\2\2\u0086\u0087\7q\2\2\u0087"+
		"\26\3\2\2\2\u0088\u0089\7n\2\2\u0089\u008a\7c\2\2\u008a\u008b\7\"\2\2"+
		"\u008b\u008c\7r\2\2\u008c\u008d\7n\2\2\u008d\u008e\7c\2\2\u008e\u008f"+
		"\7p\2\2\u008f\u0090\7v\2\2\u0090\u0091\7c\2\2\u0091\30\3\2\2\2\u0092\u0093"+
		"\7r\2\2\u0093\u0094\7q\2\2\u0094\u0095\7f\2\2\u0095\u0096\7c\2\2\u0096"+
		"\u0097\7t\2\2\u0097\32\3\2\2\2\u0098\u0099\7t\2\2\u0099\u009a\7g\2\2\u009a"+
		"\u009b\7i\2\2\u009b\u009c\7c\2\2\u009c\u009d\7t\2\2\u009d\34\3\2\2\2\u009e"+
		"\u009f\7r\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7o\2\2"+
		"\u00a2\u00a3\7c\2\2\u00a3\u00a4\7x\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6"+
		"\7t\2\2\u00a6\u00a7\7c\2\2\u00a7\36\3\2\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa"+
		"\7p\2\2\u00aa\u00ab\7x\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7g\2\2\u00ad"+
		"\u00ae\7t\2\2\u00ae\u00af\7p\2\2\u00af\u00b0\7q\2\2\u00b0 \3\2\2\2\u00b1"+
		"\u00b2\7k\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7l\2\2\u00b4\u00b5\7g\2\2"+
		"\u00b5\u00b6\7t\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9"+
		"\7t\2\2\u00b9\"\3\2\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd"+
		"\7c\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7r\2\2\u00c0"+
		"\u00c1\7n\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7v\2\2"+
		"\u00c4\u00c5\7c\2\2\u00c5\u00c6\7t\2\2\u00c6$\3\2\2\2\u00c7\u00c8\7e\2"+
		"\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\7e\2\2\u00cb\u00cc"+
		"\7j\2\2\u00cc\u00cd\7q\2\2\u00cd&\3\2\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0"+
		"\7n\2\2\u00d0\u00d1\7d\2\2\u00d1\u00d2\7w\2\2\u00d2\u00d3\7e\2\2\u00d3"+
		"\u00d4\7c\2\2\u00d4(\3\2\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7c\2\2\u00d7"+
		"\u00d8\7k\2\2\u00d8\u00d9\7|\2\2\u00d9*\3\2\2\2\u00da\u00db\7r\2\2\u00db"+
		"\u00dc\7n\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7p\2\2\u00de\u00df\7v\2\2"+
		"\u00df\u00e0\7c\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3"+
		"\7o\2\2\u00e3\u00e4\7q\2\2\u00e4\u00e5\7u\2\2\u00e5,\3\2\2\2\u00e6\u00e7"+
		"\7c\2\2\u00e7\u00e8\7d\2\2\u00e8\u00e9\7q\2\2\u00e9\u00ea\7p\2\2\u00ea"+
		"\u00eb\7c\2\2\u00eb\u00ec\7t\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7o\2\2"+
		"\u00ee\u00ef\7q\2\2\u00ef\u00f0\7u\2\2\u00f0.\3\2\2\2\u00f1\u00f2\7e\2"+
		"\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7x\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6"+
		"\7t\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7o\2\2\u00f8\u00f9\7q\2\2\u00f9"+
		"\u00fa\7u\2\2\u00fa\60\3\2\2\2\u00fb\u00fd\t\2\2\2\u00fc\u00fb\3\2\2\2"+
		"\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\62"+
		"\3\2\2\2\u0100\u0102\7$\2\2\u0101\u0103\t\3\2\2\u0102\u0101\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\u0107\7$\2\2\u0107\64\3\2\2\2\u0108\u010a\t\4\2\2\u0109\u0108"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\66\3\2\2\2\u010d\u010f\t\4\2\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2"+
		"\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114"+
		"\7.\2\2\u0113\u0115\t\4\2\2\u0114\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u01178\3\2\2\2\u0118\u011a\t\5\2\2"+
		"\u0119\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\b\35\2\2\u011e:\3\2\2\2\t\2\u00fe"+
		"\u0104\u010b\u0110\u0116\u011b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}