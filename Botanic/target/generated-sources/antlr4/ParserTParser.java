// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, BEGIN=8, END=9, 
		PRINT=10, TYPEDEFINE=11, OR=12, AND=13, SUMA=14, RESTA=15, MULTIPLICACION=16, 
		DIVISION=17, COSENO=18, SENO=19, SQRT=20, IF=21, WHILE=22, FOR=23, NAME=24, 
		STRING=25, INT=26, FLOAT=27, WS=28;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_lectura = 2, RULE_tipo = 3, 
		RULE_entero = 4, RULE_decimal = 5, RULE_string = 6, RULE_operar = 7, RULE_sumar = 8, 
		RULE_restar = 9, RULE_multiplicar = 10, RULE_dividir = 11, RULE_diagnostico = 12;
	public static final String[] ruleNames = {
		"program", "statement", "lectura", "tipo", "entero", "decimal", "string", 
		"operar", "sumar", "restar", "multiplicar", "dividir", "diagnostico"
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

	@Override
	public String getGrammarFileName() { return "ParserT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(ParserTParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(ParserTParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(BEGIN);
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27);
				statement();
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << TYPEDEFINE) | (1L << NAME))) != 0) );
			setState(32);
			match(END);
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

	public static class StatementContext extends ParserRuleContext {
		public DiagnosticoContext diagnostico() {
			return getRuleContext(DiagnosticoContext.class,0);
		}
		public LecturaContext lectura() {
			return getRuleContext(LecturaContext.class,0);
		}
		public OperarContext operar() {
			return getRuleContext(OperarContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				diagnostico();
				}
				break;
			case TYPEDEFINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				lectura();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				operar();
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

	public static class LecturaContext extends ParserRuleContext {
		public TerminalNode TYPEDEFINE() { return getToken(ParserTParser.TYPEDEFINE, 0); }
		public TerminalNode NAME() { return getToken(ParserTParser.NAME, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public LecturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lectura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterLectura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitLectura(this);
		}
	}

	public final LecturaContext lectura() throws RecognitionException {
		LecturaContext _localctx = new LecturaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lectura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(TYPEDEFINE);
			setState(40);
			match(NAME);
			setState(41);
			match(T__0);
			setState(42);
			tipo();
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

	public static class TipoContext extends ParserRuleContext {
		public EnteroContext entero() {
			return getRuleContext(EnteroContext.class,0);
		}
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				entero();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				decimal();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				string();
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

	public static class EnteroContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public EnteroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterEntero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitEntero(this);
		}
	}

	public final EnteroContext entero() throws RecognitionException {
		EnteroContext _localctx = new EnteroContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_entero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__1);
			setState(50);
			match(INT);
			setState(51);
			match(T__2);
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

	public static class DecimalContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public DecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitDecimal(this);
		}
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__3);
			setState(54);
			match(FLOAT);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ParserTParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__4);
			setState(57);
			match(STRING);
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

	public static class OperarContext extends ParserRuleContext {
		public SumarContext sumar() {
			return getRuleContext(SumarContext.class,0);
		}
		public RestarContext restar() {
			return getRuleContext(RestarContext.class,0);
		}
		public DividirContext dividir() {
			return getRuleContext(DividirContext.class,0);
		}
		public MultiplicarContext multiplicar() {
			return getRuleContext(MultiplicarContext.class,0);
		}
		public OperarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterOperar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitOperar(this);
		}
	}

	public final OperarContext operar() throws RecognitionException {
		OperarContext _localctx = new OperarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operar);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				sumar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				restar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				dividir();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				multiplicar();
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

	public static class SumarContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(ParserTParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ParserTParser.NAME, i);
		}
		public TerminalNode SUMA() { return getToken(ParserTParser.SUMA, 0); }
		public SumarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterSumar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitSumar(this);
		}
	}

	public final SumarContext sumar() throws RecognitionException {
		SumarContext _localctx = new SumarContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sumar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(NAME);
			setState(66);
			match(SUMA);
			setState(67);
			match(NAME);
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

	public static class RestarContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(ParserTParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ParserTParser.NAME, i);
		}
		public TerminalNode RESTA() { return getToken(ParserTParser.RESTA, 0); }
		public RestarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterRestar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitRestar(this);
		}
	}

	public final RestarContext restar() throws RecognitionException {
		RestarContext _localctx = new RestarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_restar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(NAME);
			setState(70);
			match(RESTA);
			setState(71);
			match(NAME);
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

	public static class MultiplicarContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(ParserTParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ParserTParser.NAME, i);
		}
		public TerminalNode MULTIPLICACION() { return getToken(ParserTParser.MULTIPLICACION, 0); }
		public MultiplicarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterMultiplicar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitMultiplicar(this);
		}
	}

	public final MultiplicarContext multiplicar() throws RecognitionException {
		MultiplicarContext _localctx = new MultiplicarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_multiplicar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(NAME);
			setState(74);
			match(MULTIPLICACION);
			setState(75);
			match(NAME);
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

	public static class DividirContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(ParserTParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ParserTParser.NAME, i);
		}
		public TerminalNode DIVISION() { return getToken(ParserTParser.DIVISION, 0); }
		public DividirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dividir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterDividir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitDividir(this);
		}
	}

	public final DividirContext dividir() throws RecognitionException {
		DividirContext _localctx = new DividirContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dividir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(NAME);
			setState(78);
			match(DIVISION);
			setState(79);
			match(NAME);
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

	public static class DiagnosticoContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ParserTParser.PRINT, 0); }
		public TerminalNode NAME() { return getToken(ParserTParser.NAME, 0); }
		public DiagnosticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diagnostico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterDiagnostico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitDiagnostico(this);
		}
	}

	public final DiagnosticoContext diagnostico() throws RecognitionException {
		DiagnosticoContext _localctx = new DiagnosticoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_diagnostico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(PRINT);
			setState(82);
			match(T__5);
			setState(83);
			match(NAME);
			setState(84);
			match(T__6);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36Y\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\6\2\37\n\2\r\2\16\2 \3\2\3\2\3\3\3\3"+
		"\3\3\5\3(\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5\62\n\5\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\tB\n\t\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\2\2S\2\34\3\2\2\2"+
		"\4\'\3\2\2\2\6)\3\2\2\2\b\61\3\2\2\2\n\63\3\2\2\2\f\67\3\2\2\2\16:\3\2"+
		"\2\2\20A\3\2\2\2\22C\3\2\2\2\24G\3\2\2\2\26K\3\2\2\2\30O\3\2\2\2\32S\3"+
		"\2\2\2\34\36\7\n\2\2\35\37\5\4\3\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3\2\2"+
		"\2 !\3\2\2\2!\"\3\2\2\2\"#\7\13\2\2#\3\3\2\2\2$(\5\32\16\2%(\5\6\4\2&"+
		"(\5\20\t\2\'$\3\2\2\2\'%\3\2\2\2\'&\3\2\2\2(\5\3\2\2\2)*\7\r\2\2*+\7\32"+
		"\2\2+,\7\3\2\2,-\5\b\5\2-\7\3\2\2\2.\62\5\n\6\2/\62\5\f\7\2\60\62\5\16"+
		"\b\2\61.\3\2\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\t\3\2\2\2\63\64\7\4\2\2"+
		"\64\65\7\34\2\2\65\66\7\5\2\2\66\13\3\2\2\2\678\7\6\2\289\7\35\2\29\r"+
		"\3\2\2\2:;\7\7\2\2;<\7\33\2\2<\17\3\2\2\2=B\5\22\n\2>B\5\24\13\2?B\5\30"+
		"\r\2@B\5\26\f\2A=\3\2\2\2A>\3\2\2\2A?\3\2\2\2A@\3\2\2\2B\21\3\2\2\2CD"+
		"\7\32\2\2DE\7\20\2\2EF\7\32\2\2F\23\3\2\2\2GH\7\32\2\2HI\7\21\2\2IJ\7"+
		"\32\2\2J\25\3\2\2\2KL\7\32\2\2LM\7\22\2\2MN\7\32\2\2N\27\3\2\2\2OP\7\32"+
		"\2\2PQ\7\23\2\2QR\7\32\2\2R\31\3\2\2\2ST\7\f\2\2TU\7\b\2\2UV\7\32\2\2"+
		"VW\7\t\2\2W\33\3\2\2\2\6 \'\61A";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}