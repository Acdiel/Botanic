// Generated from c:\Users\lucas\Desktop\Botanic\Botanic\LexerT.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexerT extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, END=2, TYPEDEFINE=3, PRINT=4, OR=5, AND=6, MAYOR=7, MENOR=8, 
		IGUAL=9, SUMA=10, RESTA=11, MULTIPLICACION=12, DIVISION=13, COSENO=14, 
		SENO=15, SQRT=16, IF=17, WHILE=18, FOR=19, INT=20, FLOAT=21, STRING=22, 
		NAME=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BEGIN", "END", "TYPEDEFINE", "PRINT", "OR", "AND", "MAYOR", "MENOR", 
			"IGUAL", "SUMA", "RESTA", "MULTIPLICACION", "DIVISION", "COSENO", "SENO", 
			"SQRT", "IF", "WHILE", "FOR", "INT", "FLOAT", "STRING", "NAME", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'sembrar'", "'cosechar'", "'la planta'", "'diagnostico'", "'podar'", 
			"'regar'", "'mas largo'", "'menos largo'", "'mismo largo'", "'primavera'", 
			"'invierno'", "'injertar'", "'transplantar'", "'sistematica'", "'albuca'", 
			"'raiz'", "'plantaremos'", "'abonaremos'", "'cavaremos'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BEGIN", "END", "TYPEDEFINE", "PRINT", "OR", "AND", "MAYOR", "MENOR", 
			"IGUAL", "SUMA", "RESTA", "MULTIPLICACION", "DIVISION", "COSENO", "SENO", 
			"SQRT", "IF", "WHILE", "FOR", "INT", "FLOAT", "STRING", "NAME", "WS"
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


	public LexerT(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexerT.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u0114\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\5\25\u00ec\n\25"+
		"\3\25\6\25\u00ef\n\25\r\25\16\25\u00f0\3\26\5\26\u00f4\n\26\3\26\6\26"+
		"\u00f7\n\26\r\26\16\26\u00f8\3\26\3\26\6\26\u00fd\n\26\r\26\16\26\u00fe"+
		"\3\27\3\27\6\27\u0103\n\27\r\27\16\27\u0104\3\27\3\27\3\30\6\30\u010a"+
		"\n\30\r\30\16\30\u010b\3\31\6\31\u010f\n\31\r\31\16\31\u0110\3\31\3\31"+
		"\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\6\3\2\62;\5\2"+
		"\"\"C\\c|\4\2aac|\5\2\13\f\17\17\"\"\2\u011b\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2"+
		"\2\5;\3\2\2\2\7D\3\2\2\2\tN\3\2\2\2\13Z\3\2\2\2\r`\3\2\2\2\17f\3\2\2\2"+
		"\21p\3\2\2\2\23|\3\2\2\2\25\u0088\3\2\2\2\27\u0092\3\2\2\2\31\u009b\3"+
		"\2\2\2\33\u00a4\3\2\2\2\35\u00b1\3\2\2\2\37\u00bd\3\2\2\2!\u00c4\3\2\2"+
		"\2#\u00c9\3\2\2\2%\u00d5\3\2\2\2\'\u00e0\3\2\2\2)\u00eb\3\2\2\2+\u00f3"+
		"\3\2\2\2-\u0100\3\2\2\2/\u0109\3\2\2\2\61\u010e\3\2\2\2\63\64\7u\2\2\64"+
		"\65\7g\2\2\65\66\7o\2\2\66\67\7d\2\2\678\7t\2\289\7c\2\29:\7t\2\2:\4\3"+
		"\2\2\2;<\7e\2\2<=\7q\2\2=>\7u\2\2>?\7g\2\2?@\7e\2\2@A\7j\2\2AB\7c\2\2"+
		"BC\7t\2\2C\6\3\2\2\2DE\7n\2\2EF\7c\2\2FG\7\"\2\2GH\7r\2\2HI\7n\2\2IJ\7"+
		"c\2\2JK\7p\2\2KL\7v\2\2LM\7c\2\2M\b\3\2\2\2NO\7f\2\2OP\7k\2\2PQ\7c\2\2"+
		"QR\7i\2\2RS\7p\2\2ST\7q\2\2TU\7u\2\2UV\7v\2\2VW\7k\2\2WX\7e\2\2XY\7q\2"+
		"\2Y\n\3\2\2\2Z[\7r\2\2[\\\7q\2\2\\]\7f\2\2]^\7c\2\2^_\7t\2\2_\f\3\2\2"+
		"\2`a\7t\2\2ab\7g\2\2bc\7i\2\2cd\7c\2\2de\7t\2\2e\16\3\2\2\2fg\7o\2\2g"+
		"h\7c\2\2hi\7u\2\2ij\7\"\2\2jk\7n\2\2kl\7c\2\2lm\7t\2\2mn\7i\2\2no\7q\2"+
		"\2o\20\3\2\2\2pq\7o\2\2qr\7g\2\2rs\7p\2\2st\7q\2\2tu\7u\2\2uv\7\"\2\2"+
		"vw\7n\2\2wx\7c\2\2xy\7t\2\2yz\7i\2\2z{\7q\2\2{\22\3\2\2\2|}\7o\2\2}~\7"+
		"k\2\2~\177\7u\2\2\177\u0080\7o\2\2\u0080\u0081\7q\2\2\u0081\u0082\7\""+
		"\2\2\u0082\u0083\7n\2\2\u0083\u0084\7c\2\2\u0084\u0085\7t\2\2\u0085\u0086"+
		"\7i\2\2\u0086\u0087\7q\2\2\u0087\24\3\2\2\2\u0088\u0089\7r\2\2\u0089\u008a"+
		"\7t\2\2\u008a\u008b\7k\2\2\u008b\u008c\7o\2\2\u008c\u008d\7c\2\2\u008d"+
		"\u008e\7x\2\2\u008e\u008f\7g\2\2\u008f\u0090\7t\2\2\u0090\u0091\7c\2\2"+
		"\u0091\26\3\2\2\2\u0092\u0093\7k\2\2\u0093\u0094\7p\2\2\u0094\u0095\7"+
		"x\2\2\u0095\u0096\7k\2\2\u0096\u0097\7g\2\2\u0097\u0098\7t\2\2\u0098\u0099"+
		"\7p\2\2\u0099\u009a\7q\2\2\u009a\30\3\2\2\2\u009b\u009c\7k\2\2\u009c\u009d"+
		"\7p\2\2\u009d\u009e\7l\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7t\2\2\u00a0"+
		"\u00a1\7v\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7t\2\2\u00a3\32\3\2\2\2\u00a4"+
		"\u00a5\7v\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7p\2\2"+
		"\u00a8\u00a9\7u\2\2\u00a9\u00aa\7r\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac"+
		"\7c\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7c\2\2\u00af"+
		"\u00b0\7t\2\2\u00b0\34\3\2\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3\7k\2\2\u00b3"+
		"\u00b4\7u\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7o\2\2"+
		"\u00b7\u00b8\7c\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb"+
		"\7e\2\2\u00bb\u00bc\7c\2\2\u00bc\36\3\2\2\2\u00bd\u00be\7c\2\2\u00be\u00bf"+
		"\7n\2\2\u00bf\u00c0\7d\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2\7e\2\2\u00c2"+
		"\u00c3\7c\2\2\u00c3 \3\2\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6\7c\2\2\u00c6"+
		"\u00c7\7k\2\2\u00c7\u00c8\7|\2\2\u00c8\"\3\2\2\2\u00c9\u00ca\7r\2\2\u00ca"+
		"\u00cb\7n\2\2\u00cb\u00cc\7c\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7v\2\2"+
		"\u00ce\u00cf\7c\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2"+
		"\7o\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4\7u\2\2\u00d4$\3\2\2\2\u00d5\u00d6"+
		"\7c\2\2\u00d6\u00d7\7d\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7p\2\2\u00d9"+
		"\u00da\7c\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7o\2\2"+
		"\u00dd\u00de\7q\2\2\u00de\u00df\7u\2\2\u00df&\3\2\2\2\u00e0\u00e1\7e\2"+
		"\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7x\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5"+
		"\7t\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7o\2\2\u00e7\u00e8\7q\2\2\u00e8"+
		"\u00e9\7u\2\2\u00e9(\3\2\2\2\u00ea\u00ec\7/\2\2\u00eb\u00ea\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00ef\t\2\2\2\u00ee\u00ed\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"*\3\2\2\2\u00f2\u00f4\7/\2\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f6\3\2\2\2\u00f5\u00f7\t\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fc\7.\2\2\u00fb\u00fd\t\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2"+
		"\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff,\3\2\2\2\u0100\u0102"+
		"\7$\2\2\u0101\u0103\t\3\2\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\7$"+
		"\2\2\u0107.\3\2\2\2\u0108\u010a\t\4\2\2\u0109\u0108\3\2\2\2\u010a\u010b"+
		"\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\60\3\2\2\2\u010d"+
		"\u010f\t\5\2\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\b\31\2\2\u0113"+
		"\62\3\2\2\2\r\2\u00eb\u00f0\u00f3\u00f8\u00fe\u0102\u0104\u0109\u010b"+
		"\u0110\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}