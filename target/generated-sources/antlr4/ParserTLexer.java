// Generated from ParserT.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, BEGIN=8, END=9, 
		PRINT=10, TYPEDEFINE=11, OR=12, AND=13, SUMA=14, RESTA=15, MULTIPLICACION=16, 
		DIVISION=17, NAME=18, STRING=19, BOOL=20, INT=21, NUMBER=22, WS=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'"
	};
	public static final String[] ruleNames = {
		"T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "BEGIN", "END", 
		"PRINT", "TYPEDEFINE", "OR", "AND", "SUMA", "RESTA", "MULTIPLICACION", 
		"DIVISION", "NAME", "STRING", "BOOL", "INT", "NUMBER", "WS"
	};


	public ParserTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ParserT.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u00df\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\6\23\u00c1\n\23\r\23\16\23\u00c2\3\24\3\24\6\24\u00c7\n\24\r\24\16\24"+
		"\u00c8\3\24\3\24\3\25\3\25\3\26\6\26\u00d0\n\26\r\26\16\26\u00d1\3\27"+
		"\6\27\u00d5\n\27\r\27\16\27\u00d6\3\30\6\30\u00da\n\30\r\30\16\30\u00db"+
		"\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\7\3\2c|\5\2"+
		"\"\"C\\c|\4\2\62\63~~\3\2\62;\5\2\13\f\17\17\"\"\u00e3\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5"+
		"\64\3\2\2\2\7A\3\2\2\2\tG\3\2\2\2\13Y\3\2\2\2\r[\3\2\2\2\17]\3\2\2\2\21"+
		"c\3\2\2\2\23k\3\2\2\2\25t\3\2\2\2\27\u0080\3\2\2\2\31\u008a\3\2\2\2\33"+
		"\u0090\3\2\2\2\35\u0096\3\2\2\2\37\u00a0\3\2\2\2!\u00a9\3\2\2\2#\u00b2"+
		"\3\2\2\2%\u00c0\3\2\2\2\'\u00c4\3\2\2\2)\u00cc\3\2\2\2+\u00cf\3\2\2\2"+
		"-\u00d4\3\2\2\2/\u00d9\3\2\2\2\61\62\7?\2\2\62\63\7@\2\2\63\4\3\2\2\2"+
		"\64\65\7v\2\2\65\66\7k\2\2\66\67\7g\2\2\678\7p\2\289\7g\2\29:\7\"\2\2"+
		":;\7u\2\2;<\7c\2\2<=\7n\2\2=>\7w\2\2>?\7f\2\2?@\7\"\2\2@\6\3\2\2\2AB\7"+
		"v\2\2BC\7k\2\2CD\7g\2\2DE\7p\2\2EF\7g\2\2F\b\3\2\2\2GH\7g\2\2HI\7u\2\2"+
		"IJ\7\"\2\2JK\7f\2\2KL\7g\2\2LM\7\"\2\2MN\7n\2\2NO\7c\2\2OP\7\"\2\2PQ\7"+
		"g\2\2QR\7u\2\2RS\7r\2\2ST\7g\2\2TU\7e\2\2UV\7k\2\2VW\7g\2\2WX\7<\2\2X"+
		"\n\3\2\2\2YZ\7*\2\2Z\f\3\2\2\2[\\\7+\2\2\\\16\3\2\2\2]^\7j\2\2^_\7q\2"+
		"\2_`\7l\2\2`a\7c\2\2ab\7u\2\2b\20\3\2\2\2cd\7u\2\2de\7g\2\2ef\7o\2\2f"+
		"g\7d\2\2gh\7t\2\2hi\7c\2\2ij\7t\2\2j\22\3\2\2\2kl\7e\2\2lm\7q\2\2mn\7"+
		"u\2\2no\7g\2\2op\7e\2\2pq\7j\2\2qr\7c\2\2rs\7t\2\2s\24\3\2\2\2tu\7f\2"+
		"\2uv\7k\2\2vw\7c\2\2wx\7i\2\2xy\7p\2\2yz\7q\2\2z{\7u\2\2{|\7v\2\2|}\7"+
		"k\2\2}~\7e\2\2~\177\7q\2\2\177\26\3\2\2\2\u0080\u0081\7n\2\2\u0081\u0082"+
		"\7c\2\2\u0082\u0083\7\"\2\2\u0083\u0084\7r\2\2\u0084\u0085\7n\2\2\u0085"+
		"\u0086\7c\2\2\u0086\u0087\7p\2\2\u0087\u0088\7v\2\2\u0088\u0089\7c\2\2"+
		"\u0089\30\3\2\2\2\u008a\u008b\7r\2\2\u008b\u008c\7q\2\2\u008c\u008d\7"+
		"f\2\2\u008d\u008e\7c\2\2\u008e\u008f\7t\2\2\u008f\32\3\2\2\2\u0090\u0091"+
		"\7t\2\2\u0091\u0092\7g\2\2\u0092\u0093\7i\2\2\u0093\u0094\7c\2\2\u0094"+
		"\u0095\7t\2\2\u0095\34\3\2\2\2\u0096\u0097\7r\2\2\u0097\u0098\7t\2\2\u0098"+
		"\u0099\7k\2\2\u0099\u009a\7o\2\2\u009a\u009b\7c\2\2\u009b\u009c\7x\2\2"+
		"\u009c\u009d\7g\2\2\u009d\u009e\7t\2\2\u009e\u009f\7c\2\2\u009f\36\3\2"+
		"\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7x\2\2\u00a3\u00a4"+
		"\7k\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7p\2\2\u00a7"+
		"\u00a8\7q\2\2\u00a8 \3\2\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7p\2\2\u00ab"+
		"\u00ac\7l\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7v\2\2"+
		"\u00af\u00b0\7c\2\2\u00b0\u00b1\7t\2\2\u00b1\"\3\2\2\2\u00b2\u00b3\7v"+
		"\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7"+
		"\7u\2\2\u00b7\u00b8\7r\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba\7c\2\2\u00ba"+
		"\u00bb\7p\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7t\2\2"+
		"\u00be$\3\2\2\2\u00bf\u00c1\t\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3"+
		"\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3&\3\2\2\2\u00c4\u00c6"+
		"\7$\2\2\u00c5\u00c7\t\3\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\7$"+
		"\2\2\u00cb(\3\2\2\2\u00cc\u00cd\t\4\2\2\u00cd*\3\2\2\2\u00ce\u00d0\t\5"+
		"\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2,\3\2\2\2\u00d3\u00d5\t\5\2\2\u00d4\u00d3\3\2\2\2"+
		"\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7.\3"+
		"\2\2\2\u00d8\u00da\t\6\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\b\30"+
		"\2\2\u00de\60\3\2\2\2\b\2\u00c2\u00c8\u00d1\u00d6\u00db\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}