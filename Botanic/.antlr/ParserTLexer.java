// Generated from c:\Users\lucas\Desktop\Botanic\Botanic\ParserT.g4 by ANTLR 4.9.2
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, BEGIN=20, END=21, TYPEDEFINE=22, PRINT=23, OR=24, 
		AND=25, MAYOR=26, MENOR=27, IGUAL=28, SUMA=29, RESTA=30, MULTIPLICACION=31, 
		DIVISION=32, COSENO=33, SENO=34, SQRT=35, IF=36, WHILE=37, FOR=38, INT=39, 
		FLOAT=40, STRING=41, NAME=42, WS=43;
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
			"T__17", "T__18", "BEGIN", "END", "TYPEDEFINE", "PRINT", "OR", "AND", 
			"MAYOR", "MENOR", "IGUAL", "SUMA", "RESTA", "MULTIPLICACION", "DIVISION", 
			"COSENO", "SENO", "SQRT", "IF", "WHILE", "FOR", "INT", "FLOAT", "STRING", 
			"NAME", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'=>'", "'tiene'", "'hojas'", "'tiene edad'", "'es de la especie:'", 
			"'('", "')'", "'<='", "'le afecta'", "'en'", "'plantaremos de forma'", 
			"'a'", "'posee'", "'mientras'", "'.'", "'desde'", "'hasta'", "'si'", 
			"'es'", "'sembrar'", "'cosechar'", "'la planta'", "'diagnostico'", "'podar'", 
			"'regar'", "'mas largo'", "'menos largo'", "'mismo largo'", "'primavera'", 
			"'invierno'", "'injertar'", "'transplantar'", "'sistematica'", "'albuca'", 
			"'raiz'", "'plantaremos'", "'abonaremos'", "'cavaremos'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "BEGIN", "END", "TYPEDEFINE", 
			"PRINT", "OR", "AND", "MAYOR", "MENOR", "IGUAL", "SUMA", "RESTA", "MULTIPLICACION", 
			"DIVISION", "COSENO", "SENO", "SQRT", "IF", "WHILE", "FOR", "INT", "FLOAT", 
			"STRING", "NAME", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u01b4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3"+
		"$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\5(\u018c\n(\3(\6"+
		"(\u018f\n(\r(\16(\u0190\3)\5)\u0194\n)\3)\6)\u0197\n)\r)\16)\u0198\3)"+
		"\3)\6)\u019d\n)\r)\16)\u019e\3*\3*\6*\u01a3\n*\r*\16*\u01a4\3*\3*\3+\6"+
		"+\u01aa\n+\r+\16+\u01ab\3,\6,\u01af\n,\r,\16,\u01b0\3,\3,\2\2-\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-\3\2\6\3\2\62;\5\2\"\"C\\c|\4\2aac|\5\2\13\f\17"+
		"\17\"\"\2\u01bb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5\\\3\2\2\2\7b\3\2\2\2"+
		"\th\3\2\2\2\13s\3\2\2\2\r\u0085\3\2\2\2\17\u0087\3\2\2\2\21\u0089\3\2"+
		"\2\2\23\u008c\3\2\2\2\25\u0096\3\2\2\2\27\u0099\3\2\2\2\31\u00ae\3\2\2"+
		"\2\33\u00b0\3\2\2\2\35\u00b6\3\2\2\2\37\u00bf\3\2\2\2!\u00c1\3\2\2\2#"+
		"\u00c7\3\2\2\2%\u00cd\3\2\2\2\'\u00d0\3\2\2\2)\u00d3\3\2\2\2+\u00db\3"+
		"\2\2\2-\u00e4\3\2\2\2/\u00ee\3\2\2\2\61\u00fa\3\2\2\2\63\u0100\3\2\2\2"+
		"\65\u0106\3\2\2\2\67\u0110\3\2\2\29\u011c\3\2\2\2;\u0128\3\2\2\2=\u0132"+
		"\3\2\2\2?\u013b\3\2\2\2A\u0144\3\2\2\2C\u0151\3\2\2\2E\u015d\3\2\2\2G"+
		"\u0164\3\2\2\2I\u0169\3\2\2\2K\u0175\3\2\2\2M\u0180\3\2\2\2O\u018b\3\2"+
		"\2\2Q\u0193\3\2\2\2S\u01a0\3\2\2\2U\u01a9\3\2\2\2W\u01ae\3\2\2\2YZ\7?"+
		"\2\2Z[\7@\2\2[\4\3\2\2\2\\]\7v\2\2]^\7k\2\2^_\7g\2\2_`\7p\2\2`a\7g\2\2"+
		"a\6\3\2\2\2bc\7j\2\2cd\7q\2\2de\7l\2\2ef\7c\2\2fg\7u\2\2g\b\3\2\2\2hi"+
		"\7v\2\2ij\7k\2\2jk\7g\2\2kl\7p\2\2lm\7g\2\2mn\7\"\2\2no\7g\2\2op\7f\2"+
		"\2pq\7c\2\2qr\7f\2\2r\n\3\2\2\2st\7g\2\2tu\7u\2\2uv\7\"\2\2vw\7f\2\2w"+
		"x\7g\2\2xy\7\"\2\2yz\7n\2\2z{\7c\2\2{|\7\"\2\2|}\7g\2\2}~\7u\2\2~\177"+
		"\7r\2\2\177\u0080\7g\2\2\u0080\u0081\7e\2\2\u0081\u0082\7k\2\2\u0082\u0083"+
		"\7g\2\2\u0083\u0084\7<\2\2\u0084\f\3\2\2\2\u0085\u0086\7*\2\2\u0086\16"+
		"\3\2\2\2\u0087\u0088\7+\2\2\u0088\20\3\2\2\2\u0089\u008a\7>\2\2\u008a"+
		"\u008b\7?\2\2\u008b\22\3\2\2\2\u008c\u008d\7n\2\2\u008d\u008e\7g\2\2\u008e"+
		"\u008f\7\"\2\2\u008f\u0090\7c\2\2\u0090\u0091\7h\2\2\u0091\u0092\7g\2"+
		"\2\u0092\u0093\7e\2\2\u0093\u0094\7v\2\2\u0094\u0095\7c\2\2\u0095\24\3"+
		"\2\2\2\u0096\u0097\7g\2\2\u0097\u0098\7p\2\2\u0098\26\3\2\2\2\u0099\u009a"+
		"\7r\2\2\u009a\u009b\7n\2\2\u009b\u009c\7c\2\2\u009c\u009d\7p\2\2\u009d"+
		"\u009e\7v\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7g\2\2"+
		"\u00a1\u00a2\7o\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a5"+
		"\7\"\2\2\u00a5\u00a6\7f\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7\"\2\2\u00a8"+
		"\u00a9\7h\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7o\2\2"+
		"\u00ac\u00ad\7c\2\2\u00ad\30\3\2\2\2\u00ae\u00af\7c\2\2\u00af\32\3\2\2"+
		"\2\u00b0\u00b1\7r\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7u\2\2\u00b3\u00b4"+
		"\7g\2\2\u00b4\u00b5\7g\2\2\u00b5\34\3\2\2\2\u00b6\u00b7\7o\2\2\u00b7\u00b8"+
		"\7k\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7v\2\2\u00bb"+
		"\u00bc\7t\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7u\2\2\u00be\36\3\2\2\2\u00bf"+
		"\u00c0\7\60\2\2\u00c0 \3\2\2\2\u00c1\u00c2\7f\2\2\u00c2\u00c3\7g\2\2\u00c3"+
		"\u00c4\7u\2\2\u00c4\u00c5\7f\2\2\u00c5\u00c6\7g\2\2\u00c6\"\3\2\2\2\u00c7"+
		"\u00c8\7j\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7u\2\2\u00ca\u00cb\7v\2\2"+
		"\u00cb\u00cc\7c\2\2\u00cc$\3\2\2\2\u00cd\u00ce\7u\2\2\u00ce\u00cf\7k\2"+
		"\2\u00cf&\3\2\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7u\2\2\u00d2(\3\2\2\2"+
		"\u00d3\u00d4\7u\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7o\2\2\u00d6\u00d7"+
		"\7d\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7t\2\2\u00da"+
		"*\3\2\2\2\u00db\u00dc\7e\2\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7u\2\2\u00de"+
		"\u00df\7g\2\2\u00df\u00e0\7e\2\2\u00e0\u00e1\7j\2\2\u00e1\u00e2\7c\2\2"+
		"\u00e2\u00e3\7t\2\2\u00e3,\3\2\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6\7c\2"+
		"\2\u00e6\u00e7\7\"\2\2\u00e7\u00e8\7r\2\2\u00e8\u00e9\7n\2\2\u00e9\u00ea"+
		"\7c\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7c\2\2\u00ed"+
		".\3\2\2\2\u00ee\u00ef\7f\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7c\2\2\u00f1"+
		"\u00f2\7i\2\2\u00f2\u00f3\7p\2\2\u00f3\u00f4\7q\2\2\u00f4\u00f5\7u\2\2"+
		"\u00f5\u00f6\7v\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8\7e\2\2\u00f8\u00f9"+
		"\7q\2\2\u00f9\60\3\2\2\2\u00fa\u00fb\7r\2\2\u00fb\u00fc\7q\2\2\u00fc\u00fd"+
		"\7f\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7t\2\2\u00ff\62\3\2\2\2\u0100\u0101"+
		"\7t\2\2\u0101\u0102\7g\2\2\u0102\u0103\7i\2\2\u0103\u0104\7c\2\2\u0104"+
		"\u0105\7t\2\2\u0105\64\3\2\2\2\u0106\u0107\7o\2\2\u0107\u0108\7c\2\2\u0108"+
		"\u0109\7u\2\2\u0109\u010a\7\"\2\2\u010a\u010b\7n\2\2\u010b\u010c\7c\2"+
		"\2\u010c\u010d\7t\2\2\u010d\u010e\7i\2\2\u010e\u010f\7q\2\2\u010f\66\3"+
		"\2\2\2\u0110\u0111\7o\2\2\u0111\u0112\7g\2\2\u0112\u0113\7p\2\2\u0113"+
		"\u0114\7q\2\2\u0114\u0115\7u\2\2\u0115\u0116\7\"\2\2\u0116\u0117\7n\2"+
		"\2\u0117\u0118\7c\2\2\u0118\u0119\7t\2\2\u0119\u011a\7i\2\2\u011a\u011b"+
		"\7q\2\2\u011b8\3\2\2\2\u011c\u011d\7o\2\2\u011d\u011e\7k\2\2\u011e\u011f"+
		"\7u\2\2\u011f\u0120\7o\2\2\u0120\u0121\7q\2\2\u0121\u0122\7\"\2\2\u0122"+
		"\u0123\7n\2\2\u0123\u0124\7c\2\2\u0124\u0125\7t\2\2\u0125\u0126\7i\2\2"+
		"\u0126\u0127\7q\2\2\u0127:\3\2\2\2\u0128\u0129\7r\2\2\u0129\u012a\7t\2"+
		"\2\u012a\u012b\7k\2\2\u012b\u012c\7o\2\2\u012c\u012d\7c\2\2\u012d\u012e"+
		"\7x\2\2\u012e\u012f\7g\2\2\u012f\u0130\7t\2\2\u0130\u0131\7c\2\2\u0131"+
		"<\3\2\2\2\u0132\u0133\7k\2\2\u0133\u0134\7p\2\2\u0134\u0135\7x\2\2\u0135"+
		"\u0136\7k\2\2\u0136\u0137\7g\2\2\u0137\u0138\7t\2\2\u0138\u0139\7p\2\2"+
		"\u0139\u013a\7q\2\2\u013a>\3\2\2\2\u013b\u013c\7k\2\2\u013c\u013d\7p\2"+
		"\2\u013d\u013e\7l\2\2\u013e\u013f\7g\2\2\u013f\u0140\7t\2\2\u0140\u0141"+
		"\7v\2\2\u0141\u0142\7c\2\2\u0142\u0143\7t\2\2\u0143@\3\2\2\2\u0144\u0145"+
		"\7v\2\2\u0145\u0146\7t\2\2\u0146\u0147\7c\2\2\u0147\u0148\7p\2\2\u0148"+
		"\u0149\7u\2\2\u0149\u014a\7r\2\2\u014a\u014b\7n\2\2\u014b\u014c\7c\2\2"+
		"\u014c\u014d\7p\2\2\u014d\u014e\7v\2\2\u014e\u014f\7c\2\2\u014f\u0150"+
		"\7t\2\2\u0150B\3\2\2\2\u0151\u0152\7u\2\2\u0152\u0153\7k\2\2\u0153\u0154"+
		"\7u\2\2\u0154\u0155\7v\2\2\u0155\u0156\7g\2\2\u0156\u0157\7o\2\2\u0157"+
		"\u0158\7c\2\2\u0158\u0159\7v\2\2\u0159\u015a\7k\2\2\u015a\u015b\7e\2\2"+
		"\u015b\u015c\7c\2\2\u015cD\3\2\2\2\u015d\u015e\7c\2\2\u015e\u015f\7n\2"+
		"\2\u015f\u0160\7d\2\2\u0160\u0161\7w\2\2\u0161\u0162\7e\2\2\u0162\u0163"+
		"\7c\2\2\u0163F\3\2\2\2\u0164\u0165\7t\2\2\u0165\u0166\7c\2\2\u0166\u0167"+
		"\7k\2\2\u0167\u0168\7|\2\2\u0168H\3\2\2\2\u0169\u016a\7r\2\2\u016a\u016b"+
		"\7n\2\2\u016b\u016c\7c\2\2\u016c\u016d\7p\2\2\u016d\u016e\7v\2\2\u016e"+
		"\u016f\7c\2\2\u016f\u0170\7t\2\2\u0170\u0171\7g\2\2\u0171\u0172\7o\2\2"+
		"\u0172\u0173\7q\2\2\u0173\u0174\7u\2\2\u0174J\3\2\2\2\u0175\u0176\7c\2"+
		"\2\u0176\u0177\7d\2\2\u0177\u0178\7q\2\2\u0178\u0179\7p\2\2\u0179\u017a"+
		"\7c\2\2\u017a\u017b\7t\2\2\u017b\u017c\7g\2\2\u017c\u017d\7o\2\2\u017d"+
		"\u017e\7q\2\2\u017e\u017f\7u\2\2\u017fL\3\2\2\2\u0180\u0181\7e\2\2\u0181"+
		"\u0182\7c\2\2\u0182\u0183\7x\2\2\u0183\u0184\7c\2\2\u0184\u0185\7t\2\2"+
		"\u0185\u0186\7g\2\2\u0186\u0187\7o\2\2\u0187\u0188\7q\2\2\u0188\u0189"+
		"\7u\2\2\u0189N\3\2\2\2\u018a\u018c\7/\2\2\u018b\u018a\3\2\2\2\u018b\u018c"+
		"\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u018f\t\2\2\2\u018e\u018d\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191P\3\2\2\2"+
		"\u0192\u0194\7/\2\2\u0193\u0192\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196"+
		"\3\2\2\2\u0195\u0197\t\2\2\2\u0196\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019c\7."+
		"\2\2\u019b\u019d\t\2\2\2\u019c\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019fR\3\2\2\2\u01a0\u01a2\7$\2\2\u01a1"+
		"\u01a3\t\3\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a2\3\2"+
		"\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\7$\2\2\u01a7"+
		"T\3\2\2\2\u01a8\u01aa\t\4\2\2\u01a9\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2"+
		"\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01acV\3\2\2\2\u01ad\u01af\t"+
		"\5\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0"+
		"\u01b1\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\b,\2\2\u01b3X\3\2\2\2\r"+
		"\2\u018b\u0190\u0193\u0198\u019e\u01a2\u01a4\u01a9\u01ab\u01b0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}