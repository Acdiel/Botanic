// Generated from LexerT.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, END=2, PRINT=3, TYPEDEFINE=4, OR=5, AND=6, SUMA=7, RESTA=8, MULTIPLICACION=9, 
		DIVISION=10, NAME=11, STRING=12, BOOL=13, INT=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BEGIN", "END", "PRINT", "TYPEDEFINE", "OR", "AND", "SUMA", "RESTA", "MULTIPLICACION", 
		"DIVISION", "NAME", "STRING", "BOOL", "INT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'sembrar'", "'cosechar'", "'diagnostico'", "'la planta'", "'podar'", 
		"'regar'", "'primavera'", "'invierno'", "'injertar'", "'transplantar'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGIN", "END", "PRINT", "TYPEDEFINE", "OR", "AND", "SUMA", "RESTA", 
		"MULTIPLICACION", "DIVISION", "NAME", "STRING", "BOOL", "INT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u0098\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\6\f\177\n\f\r\f\16\f\u0080\3\r\3\r\6\r\u0085\n\r\r"+
		"\r\16\r\u0086\3\r\3\r\3\16\3\16\3\17\6\17\u008e\n\17\r\17\16\17\u008f"+
		"\3\20\6\20\u0093\n\20\r\20\16\20\u0094\3\20\3\20\2\2\21\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\7\3"+
		"\2c|\5\2\"\"C\\c|\4\2\62\63~~\3\2\62;\5\2\13\f\17\17\"\"\2\u009b\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5)\3\2\2\2\7"+
		"\62\3\2\2\2\t>\3\2\2\2\13H\3\2\2\2\rN\3\2\2\2\17T\3\2\2\2\21^\3\2\2\2"+
		"\23g\3\2\2\2\25p\3\2\2\2\27~\3\2\2\2\31\u0082\3\2\2\2\33\u008a\3\2\2\2"+
		"\35\u008d\3\2\2\2\37\u0092\3\2\2\2!\"\7u\2\2\"#\7g\2\2#$\7o\2\2$%\7d\2"+
		"\2%&\7t\2\2&\'\7c\2\2\'(\7t\2\2(\4\3\2\2\2)*\7e\2\2*+\7q\2\2+,\7u\2\2"+
		",-\7g\2\2-.\7e\2\2./\7j\2\2/\60\7c\2\2\60\61\7t\2\2\61\6\3\2\2\2\62\63"+
		"\7f\2\2\63\64\7k\2\2\64\65\7c\2\2\65\66\7i\2\2\66\67\7p\2\2\678\7q\2\2"+
		"89\7u\2\29:\7v\2\2:;\7k\2\2;<\7e\2\2<=\7q\2\2=\b\3\2\2\2>?\7n\2\2?@\7"+
		"c\2\2@A\7\"\2\2AB\7r\2\2BC\7n\2\2CD\7c\2\2DE\7p\2\2EF\7v\2\2FG\7c\2\2"+
		"G\n\3\2\2\2HI\7r\2\2IJ\7q\2\2JK\7f\2\2KL\7c\2\2LM\7t\2\2M\f\3\2\2\2NO"+
		"\7t\2\2OP\7g\2\2PQ\7i\2\2QR\7c\2\2RS\7t\2\2S\16\3\2\2\2TU\7r\2\2UV\7t"+
		"\2\2VW\7k\2\2WX\7o\2\2XY\7c\2\2YZ\7x\2\2Z[\7g\2\2[\\\7t\2\2\\]\7c\2\2"+
		"]\20\3\2\2\2^_\7k\2\2_`\7p\2\2`a\7x\2\2ab\7k\2\2bc\7g\2\2cd\7t\2\2de\7"+
		"p\2\2ef\7q\2\2f\22\3\2\2\2gh\7k\2\2hi\7p\2\2ij\7l\2\2jk\7g\2\2kl\7t\2"+
		"\2lm\7v\2\2mn\7c\2\2no\7t\2\2o\24\3\2\2\2pq\7v\2\2qr\7t\2\2rs\7c\2\2s"+
		"t\7p\2\2tu\7u\2\2uv\7r\2\2vw\7n\2\2wx\7c\2\2xy\7p\2\2yz\7v\2\2z{\7c\2"+
		"\2{|\7t\2\2|\26\3\2\2\2}\177\t\2\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\30\3\2\2\2\u0082\u0084\7$\2\2\u0083"+
		"\u0085\t\3\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7$\2\2\u0089"+
		"\32\3\2\2\2\u008a\u008b\t\4\2\2\u008b\34\3\2\2\2\u008c\u008e\t\5\2\2\u008d"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\36\3\2\2\2\u0091\u0093\t\6\2\2\u0092\u0091\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0097\b\20\2\2\u0097 \3\2\2\2\7\2\u0080\u0086\u008f\u0094\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}