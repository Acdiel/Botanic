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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, BEGIN=16, END=17, 
		TYPEDEFINE=18, PRINT=19, OR=20, AND=21, MAYOR=22, MENOR=23, IGUAL=24, 
		SUMA=25, RESTA=26, MULTIPLICACION=27, DIVISION=28, COSENO=29, SENO=30, 
		SQRT=31, POW=32, IF=33, WHILE=34, FOR=35, VARCHAR=36, INT=37, FLOAT=38, 
		NAME=39, STRING=40, WS=41;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_lectura = 2, RULE_tipo = 3, 
		RULE_entero = 4, RULE_decimal = 5, RULE_especie = 6, RULE_constante = 7, 
		RULE_impresion = 8, RULE_problemamatematico = 9, RULE_operacion = 10, 
		RULE_operador = 11, RULE_funcion = 12, RULE_seno = 13, RULE_coseno = 14, 
		RULE_raizcuadrada = 15, RULE_potencia = 16, RULE_num = 17, RULE_ciclo = 18, 
		RULE_mientras = 19, RULE_por = 20, RULE_si = 21, RULE_condicion = 22, 
		RULE_afirmacion = 23, RULE_oplogico = 24;
	public static final String[] ruleNames = {
		"program", "statement", "lectura", "tipo", "entero", "decimal", "especie", 
		"constante", "impresion", "problemamatematico", "operacion", "operador", 
		"funcion", "seno", "coseno", "raizcuadrada", "potencia", "num", "ciclo", 
		"mientras", "por", "si", "condicion", "afirmacion", "oplogico"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'=>'", "'tiene'", "'hojas'", "'tiene edad'", "'es de la especie:'", 
		"'tierra'", "'('", "')'", "'plantaremos de forma'", "'a'", "'en'", "'veces'", 
		"'mientras'", "'desde'", "'hasta'", "'sembrar'", "'cosechar'", "'la planta'", 
		"'diagnostico'", "'podar'", "'regar'", "'mas largo'", "'menos largo'", 
		"'mismo largo'", "'primavera'", "'invierno'", "'injertar'", "'transplantar'", 
		"'sistematica'", "'albuca'", "'raiz'", "'usar fertilizante'", "'plantaremos'", 
		"'abonaremos'", "'cavaremos'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "BEGIN", "END", "TYPEDEFINE", "PRINT", "OR", "AND", 
		"MAYOR", "MENOR", "IGUAL", "SUMA", "RESTA", "MULTIPLICACION", "DIVISION", 
		"COSENO", "SENO", "SQRT", "POW", "IF", "WHILE", "FOR", "VARCHAR", "INT", 
		"FLOAT", "NAME", "STRING", "WS"
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(BEGIN);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << TYPEDEFINE) | (1L << PRINT) | (1L << SENO) | (1L << POW) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NAME))) != 0)) {
				{
				{
				setState(51);
				statement();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
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
		public LecturaContext lectura() {
			return getRuleContext(LecturaContext.class,0);
		}
		public ImpresionContext impresion() {
			return getRuleContext(ImpresionContext.class,0);
		}
		public ProblemamatematicoContext problemamatematico() {
			return getRuleContext(ProblemamatematicoContext.class,0);
		}
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPEDEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				lectura();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				impresion();
				}
				break;
			case T__8:
			case SENO:
			case POW:
			case NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				problemamatematico();
				}
				break;
			case IF:
			case WHILE:
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				ciclo();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitLectura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LecturaContext lectura() throws RecognitionException {
		LecturaContext _localctx = new LecturaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lectura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(TYPEDEFINE);
			setState(66);
			match(NAME);
			setState(67);
			match(T__0);
			setState(68);
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
		public EspecieContext especie() {
			return getRuleContext(EspecieContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				entero();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				decimal();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				especie();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitEntero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnteroContext entero() throws RecognitionException {
		EnteroContext _localctx = new EnteroContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_entero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__1);
			setState(76);
			match(INT);
			setState(77);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDecimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__3);
			setState(80);
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

	public static class EspecieContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ParserTParser.STRING, 0); }
		public EspecieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_especie; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitEspecie(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EspecieContext especie() throws RecognitionException {
		EspecieContext _localctx = new EspecieContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_especie);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__4);
			setState(83);
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

	public static class ConstanteContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public ConstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constante; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitConstante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstanteContext constante() throws RecognitionException {
		ConstanteContext _localctx = new ConstanteContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__5);
			setState(86);
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

	public static class ImpresionContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ParserTParser.PRINT, 0); }
		public TerminalNode NAME() { return getToken(ParserTParser.NAME, 0); }
		public ImpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impresion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitImpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpresionContext impresion() throws RecognitionException {
		ImpresionContext _localctx = new ImpresionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_impresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(PRINT);
			setState(89);
			match(T__6);
			setState(90);
			match(NAME);
			setState(91);
			match(T__7);
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

	public static class ProblemamatematicoContext extends ParserRuleContext {
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public ProblemamatematicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_problemamatematico; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitProblemamatematico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProblemamatematicoContext problemamatematico() throws RecognitionException {
		ProblemamatematicoContext _localctx = new ProblemamatematicoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_problemamatematico);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				operacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				funcion();
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

	public static class OperacionContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(ParserTParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ParserTParser.NAME, i);
		}
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitOperacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(NAME);
			setState(98);
			operador();
			setState(99);
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

	public static class OperadorContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(ParserTParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(ParserTParser.RESTA, 0); }
		public TerminalNode MULTIPLICACION() { return getToken(ParserTParser.MULTIPLICACION, 0); }
		public TerminalNode DIVISION() { return getToken(ParserTParser.DIVISION, 0); }
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitOperador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESTA) | (1L << MULTIPLICACION) | (1L << DIVISION))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class FuncionContext extends ParserRuleContext {
		public SenoContext seno() {
			return getRuleContext(SenoContext.class,0);
		}
		public CosenoContext coseno() {
			return getRuleContext(CosenoContext.class,0);
		}
		public RaizcuadradaContext raizcuadrada() {
			return getRuleContext(RaizcuadradaContext.class,0);
		}
		public PotenciaContext potencia() {
			return getRuleContext(PotenciaContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcion);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SENO:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				seno();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				coseno();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				raizcuadrada();
				}
				break;
			case POW:
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
				potencia();
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

	public static class SenoContext extends ParserRuleContext {
		public TerminalNode SENO() { return getToken(ParserTParser.SENO, 0); }
		public TerminalNode NAME() { return getToken(ParserTParser.NAME, 0); }
		public SenoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seno; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitSeno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SenoContext seno() throws RecognitionException {
		SenoContext _localctx = new SenoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_seno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(SENO);
			setState(110);
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

	public static class CosenoContext extends ParserRuleContext {
		public TerminalNode COSENO() { return getToken(ParserTParser.COSENO, 0); }
		public TerminalNode NAME() { return getToken(ParserTParser.NAME, 0); }
		public CosenoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coseno; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCoseno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CosenoContext coseno() throws RecognitionException {
		CosenoContext _localctx = new CosenoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_coseno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__8);
			setState(113);
			match(COSENO);
			setState(114);
			match(T__9);
			setState(115);
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

	public static class RaizcuadradaContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ParserTParser.NAME, 0); }
		public TerminalNode SQRT() { return getToken(ParserTParser.SQRT, 0); }
		public TerminalNode VARCHAR() { return getToken(ParserTParser.VARCHAR, 0); }
		public RaizcuadradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raizcuadrada; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitRaizcuadrada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RaizcuadradaContext raizcuadrada() throws RecognitionException {
		RaizcuadradaContext _localctx = new RaizcuadradaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_raizcuadrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(NAME);
			setState(118);
			match(T__1);
			setState(119);
			match(SQRT);
			setState(120);
			match(VARCHAR);
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

	public static class PotenciaContext extends ParserRuleContext {
		public TerminalNode POW() { return getToken(ParserTParser.POW, 0); }
		public TerminalNode NAME() { return getToken(ParserTParser.NAME, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public PotenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_potencia; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitPotencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PotenciaContext potencia() throws RecognitionException {
		PotenciaContext _localctx = new PotenciaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_potencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(POW);
			setState(123);
			match(T__10);
			setState(124);
			match(NAME);
			setState(125);
			num();
			setState(126);
			match(T__11);
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

	public static class NumContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class CicloContext extends ParserRuleContext {
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public PorContext por() {
			return getRuleContext(PorContext.class,0);
		}
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public CicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCiclo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloContext ciclo() throws RecognitionException {
		CicloContext _localctx = new CicloContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ciclo);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				mientras();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				por();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				si();
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

	public static class MientrasContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ParserTParser.WHILE, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(WHILE);
			setState(136);
			match(T__12);
			setState(137);
			condicion();
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

	public static class PorContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ParserTParser.FOR, 0); }
		public List<TerminalNode> INT() { return getTokens(ParserTParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ParserTParser.INT, i);
		}
		public PorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_por; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitPor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PorContext por() throws RecognitionException {
		PorContext _localctx = new PorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_por);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(FOR);
			setState(140);
			match(T__13);
			setState(141);
			match(INT);
			setState(142);
			match(T__14);
			setState(143);
			match(INT);
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

	public static class SiContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ParserTParser.IF, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(IF);
			setState(146);
			condicion();
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

	public static class CondicionContext extends ParserRuleContext {
		public List<AfirmacionContext> afirmacion() {
			return getRuleContexts(AfirmacionContext.class);
		}
		public AfirmacionContext afirmacion(int i) {
			return getRuleContext(AfirmacionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(ParserTParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ParserTParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(ParserTParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ParserTParser.OR, i);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			afirmacion();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(149);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(150);
				afirmacion();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class AfirmacionContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(ParserTParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ParserTParser.NAME, i);
		}
		public OplogicoContext oplogico() {
			return getRuleContext(OplogicoContext.class,0);
		}
		public AfirmacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_afirmacion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitAfirmacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AfirmacionContext afirmacion() throws RecognitionException {
		AfirmacionContext _localctx = new AfirmacionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_afirmacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(NAME);
			setState(157);
			oplogico();
			setState(158);
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

	public static class OplogicoContext extends ParserRuleContext {
		public TerminalNode MAYOR() { return getToken(ParserTParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(ParserTParser.MENOR, 0); }
		public TerminalNode IGUAL() { return getToken(ParserTParser.IGUAL, 0); }
		public OplogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oplogico; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitOplogico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OplogicoContext oplogico() throws RecognitionException {
		OplogicoContext _localctx = new OplogicoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_oplogico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYOR) | (1L << MENOR) | (1L << IGUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00a5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5"+
		"\3B\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5L\n\5\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\5\13b\n\13"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\5\16n\n\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\24\5\24\u0088\n\24\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\7\30\u009a"+
		"\n\30\f\30\16\30\u009d\13\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\2\2\33"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\6\3\2\33\36\3"+
		"\2\'(\3\2\26\27\3\2\30\32\2\u0098\2\64\3\2\2\2\4A\3\2\2\2\6C\3\2\2\2\b"+
		"K\3\2\2\2\nM\3\2\2\2\fQ\3\2\2\2\16T\3\2\2\2\20W\3\2\2\2\22Z\3\2\2\2\24"+
		"a\3\2\2\2\26c\3\2\2\2\30g\3\2\2\2\32m\3\2\2\2\34o\3\2\2\2\36r\3\2\2\2"+
		" w\3\2\2\2\"|\3\2\2\2$\u0082\3\2\2\2&\u0087\3\2\2\2(\u0089\3\2\2\2*\u008d"+
		"\3\2\2\2,\u0093\3\2\2\2.\u0096\3\2\2\2\60\u009e\3\2\2\2\62\u00a2\3\2\2"+
		"\2\648\7\22\2\2\65\67\5\4\3\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289"+
		"\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7\23\2\2<\3\3\2\2\2=B\5\6\4\2>B\5\22\n"+
		"\2?B\5\24\13\2@B\5&\24\2A=\3\2\2\2A>\3\2\2\2A?\3\2\2\2A@\3\2\2\2B\5\3"+
		"\2\2\2CD\7\24\2\2DE\7)\2\2EF\7\3\2\2FG\5\b\5\2G\7\3\2\2\2HL\5\n\6\2IL"+
		"\5\f\7\2JL\5\16\b\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2L\t\3\2\2\2MN\7\4\2\2"+
		"NO\7\'\2\2OP\7\5\2\2P\13\3\2\2\2QR\7\6\2\2RS\7(\2\2S\r\3\2\2\2TU\7\7\2"+
		"\2UV\7*\2\2V\17\3\2\2\2WX\7\b\2\2XY\7(\2\2Y\21\3\2\2\2Z[\7\25\2\2[\\\7"+
		"\t\2\2\\]\7)\2\2]^\7\n\2\2^\23\3\2\2\2_b\5\26\f\2`b\5\32\16\2a_\3\2\2"+
		"\2a`\3\2\2\2b\25\3\2\2\2cd\7)\2\2de\5\30\r\2ef\7)\2\2f\27\3\2\2\2gh\t"+
		"\2\2\2h\31\3\2\2\2in\5\34\17\2jn\5\36\20\2kn\5 \21\2ln\5\"\22\2mi\3\2"+
		"\2\2mj\3\2\2\2mk\3\2\2\2ml\3\2\2\2n\33\3\2\2\2op\7 \2\2pq\7)\2\2q\35\3"+
		"\2\2\2rs\7\13\2\2st\7\37\2\2tu\7\f\2\2uv\7)\2\2v\37\3\2\2\2wx\7)\2\2x"+
		"y\7\4\2\2yz\7!\2\2z{\7&\2\2{!\3\2\2\2|}\7\"\2\2}~\7\r\2\2~\177\7)\2\2"+
		"\177\u0080\5$\23\2\u0080\u0081\7\16\2\2\u0081#\3\2\2\2\u0082\u0083\t\3"+
		"\2\2\u0083%\3\2\2\2\u0084\u0088\5(\25\2\u0085\u0088\5*\26\2\u0086\u0088"+
		"\5,\27\2\u0087\u0084\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088"+
		"\'\3\2\2\2\u0089\u008a\7$\2\2\u008a\u008b\7\17\2\2\u008b\u008c\5.\30\2"+
		"\u008c)\3\2\2\2\u008d\u008e\7%\2\2\u008e\u008f\7\20\2\2\u008f\u0090\7"+
		"\'\2\2\u0090\u0091\7\21\2\2\u0091\u0092\7\'\2\2\u0092+\3\2\2\2\u0093\u0094"+
		"\7#\2\2\u0094\u0095\5.\30\2\u0095-\3\2\2\2\u0096\u009b\5\60\31\2\u0097"+
		"\u0098\t\4\2\2\u0098\u009a\5\60\31\2\u0099\u0097\3\2\2\2\u009a\u009d\3"+
		"\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c/\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009e\u009f\7)\2\2\u009f\u00a0\5\62\32\2\u00a0\u00a1\7)\2\2\u00a1"+
		"\61\3\2\2\2\u00a2\u00a3\t\5\2\2\u00a3\63\3\2\2\2\t8AKam\u0087\u009b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}