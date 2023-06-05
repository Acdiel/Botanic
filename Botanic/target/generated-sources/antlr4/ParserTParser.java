// Generated from ParserT.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__17=1, T__16=2, T__15=3, T__14=4, T__13=5, T__12=6, T__11=7, T__10=8, 
		T__9=9, T__8=10, T__7=11, T__6=12, T__5=13, T__4=14, T__3=15, T__2=16, 
		T__1=17, T__0=18, BEGIN=19, END=20, TYPEDEFINE=21, PRINT=22, OR=23, AND=24, 
		MAYOR=25, MENOR=26, IGUAL=27, SUMA=28, RESTA=29, MULTIPLICACION=30, DIVISION=31, 
		COSENO=32, SENO=33, SQRT=34, IF=35, WHILE=36, FOR=37, INT=38, FLOAT=39, 
		STRING=40, NAME=41, WS=42;
	public static final String[] tokenNames = {
		"<INVALID>", "'plantaremos de forma'", "'mientras'", "'si'", "'posee'", 
		"'es de la especie:'", "'tiene '", "'le afecta'", "'hasta'", "' hojas'", 
		"'a'", "'=>'", "'desde'", "'('", "')'", "'en'", "'es'", "'.'", "'tiene edad '", 
		"'sembrar'", "'cosechar'", "'la planta'", "'diagnostico'", "'podar'", 
		"'regar'", "'mas largo'", "'menos largo'", "'mismo largo'", "'primavera'", 
		"'invierno'", "'injertar'", "'transplantar'", "'sistematica'", "'albuca'", 
		"'raiz'", "'plantaremos'", "'abonaremos'", "'cavaremos'", "INT", "FLOAT", 
		"STRING", "NAME", "WS"
	};
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_lectura = 2, RULE_tipo = 3, 
		RULE_entero = 4, RULE_decimal = 5, RULE_especie = 6, RULE_impresion = 7, 
		RULE_problemamatematico = 8, RULE_operacion = 9, RULE_operador = 10, RULE_funcion = 11, 
		RULE_seno = 12, RULE_coseno = 13, RULE_raizcuadrada = 14, RULE_ciclo = 15, 
		RULE_mientras = 16, RULE_por = 17, RULE_si = 18, RULE_condicion = 19, 
		RULE_afirmacion = 20, RULE_oplogico = 21;
	public static final String[] ruleNames = {
		"program", "statement", "lectura", "tipo", "entero", "decimal", "especie", 
		"impresion", "problemamatematico", "operacion", "operador", "funcion", 
		"seno", "coseno", "raizcuadrada", "ciclo", "mientras", "por", "si", "condicion", 
		"afirmacion", "oplogico"
	};

	@Override
	public String getGrammarFileName() { return "ParserT.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
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
			setState(44); match(BEGIN);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << TYPEDEFINE) | (1L << PRINT) | (1L << SENO) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NAME))) != 0)) {
				{
				{
				setState(45); statement();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51); match(END);
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
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public ImpresionContext impresion() {
			return getRuleContext(ImpresionContext.class,0);
		}
		public LecturaContext lectura() {
			return getRuleContext(LecturaContext.class,0);
		}
		public ProblemamatematicoContext problemamatematico() {
			return getRuleContext(ProblemamatematicoContext.class,0);
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
			setState(57);
			switch (_input.LA(1)) {
			case TYPEDEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(53); lectura();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(54); impresion();
				}
				break;
			case T__17:
			case SENO:
			case NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(55); problemamatematico();
				}
				break;
			case IF:
			case WHILE:
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(56); ciclo();
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
		public TerminalNode NAME() { return getToken(ParserTParser.NAME, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode TYPEDEFINE() { return getToken(ParserTParser.TYPEDEFINE, 0); }
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
			setState(59); match(TYPEDEFINE);
			setState(60); match(NAME);
			setState(61); match(T__7);
			setState(62); tipo();
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
		public EspecieContext especie() {
			return getRuleContext(EspecieContext.class,0);
		}
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public EnteroContext entero() {
			return getRuleContext(EnteroContext.class,0);
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
			setState(67);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(64); entero();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(65); decimal();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(66); especie();
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
			setState(69); match(T__12);
			setState(70); match(INT);
			setState(71); match(T__9);
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
			setState(73); match(T__0);
			setState(74); match(FLOAT);
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
			setState(76); match(T__13);
			setState(77); match(STRING);
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
		enterRule(_localctx, 14, RULE_impresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); match(PRINT);
			setState(80); match(T__5);
			setState(81); match(NAME);
			setState(82); match(T__4);
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
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
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
		enterRule(_localctx, 16, RULE_problemamatematico);
		try {
			setState(86);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84); operacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85); funcion();
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
		public TerminalNode NAME(int i) {
			return getToken(ParserTParser.NAME, i);
		}
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public List<TerminalNode> NAME() { return getTokens(ParserTParser.NAME); }
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
		enterRule(_localctx, 18, RULE_operacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); match(NAME);
			setState(89); match(T__11);
			setState(90); operador();
			setState(91); match(T__3);
			setState(92); match(NAME);
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
		public TerminalNode DIVISION() { return getToken(ParserTParser.DIVISION, 0); }
		public TerminalNode MULTIPLICACION() { return getToken(ParserTParser.MULTIPLICACION, 0); }
		public TerminalNode RESTA() { return getToken(ParserTParser.RESTA, 0); }
		public TerminalNode SUMA() { return getToken(ParserTParser.SUMA, 0); }
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
		enterRule(_localctx, 20, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESTA) | (1L << MULTIPLICACION) | (1L << DIVISION))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public CosenoContext coseno() {
			return getRuleContext(CosenoContext.class,0);
		}
		public RaizcuadradaContext raizcuadrada() {
			return getRuleContext(RaizcuadradaContext.class,0);
		}
		public SenoContext seno() {
			return getRuleContext(SenoContext.class,0);
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
		enterRule(_localctx, 22, RULE_funcion);
		try {
			setState(99);
			switch (_input.LA(1)) {
			case SENO:
				enterOuterAlt(_localctx, 1);
				{
				setState(96); seno();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(97); coseno();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(98); raizcuadrada();
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
		public TerminalNode NAME(int i) {
			return getToken(ParserTParser.NAME, i);
		}
		public TerminalNode SENO() { return getToken(ParserTParser.SENO, 0); }
		public List<TerminalNode> NAME() { return getTokens(ParserTParser.NAME); }
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
		enterRule(_localctx, 24, RULE_seno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); match(SENO);
			setState(102); match(NAME);
			setState(103); match(T__3);
			setState(104); match(NAME);
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
		public TerminalNode NAME(int i) {
			return getToken(ParserTParser.NAME, i);
		}
		public List<TerminalNode> NAME() { return getTokens(ParserTParser.NAME); }
		public TerminalNode COSENO() { return getToken(ParserTParser.COSENO, 0); }
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
		enterRule(_localctx, 26, RULE_coseno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); match(T__17);
			setState(107); match(COSENO);
			setState(108); match(T__8);
			setState(109); match(NAME);
			setState(110); match(T__3);
			setState(111); match(NAME);
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
		public TerminalNode NAME(int i) {
			return getToken(ParserTParser.NAME, i);
		}
		public List<TerminalNode> NAME() { return getTokens(ParserTParser.NAME); }
		public TerminalNode SQRT() { return getToken(ParserTParser.SQRT, 0); }
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
		enterRule(_localctx, 28, RULE_raizcuadrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(NAME);
			setState(114); match(T__14);
			setState(115); match(SQRT);
			setState(116); match(T__3);
			setState(117); match(NAME);
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
		public PorContext por() {
			return getRuleContext(PorContext.class,0);
		}
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
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
		enterRule(_localctx, 30, RULE_ciclo);
		try {
			setState(122);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(119); mientras();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(120); por();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(121); si();
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
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode WHILE() { return getToken(ParserTParser.WHILE, 0); }
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
		enterRule(_localctx, 32, RULE_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(WHILE);
			setState(125); match(T__16);
			setState(126); condicion();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << TYPEDEFINE) | (1L << PRINT) | (1L << SENO) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NAME))) != 0)) {
				{
				{
				setState(127); statement();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133); match(T__1);
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
		public TerminalNode NAME(int i) {
			return getToken(ParserTParser.NAME, i);
		}
		public List<TerminalNode> NAME() { return getTokens(ParserTParser.NAME); }
		public TerminalNode FOR() { return getToken(ParserTParser.FOR, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
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
		enterRule(_localctx, 34, RULE_por);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); match(FOR);
			setState(136); match(T__6);
			setState(137); match(NAME);
			setState(138); match(T__10);
			setState(139); match(NAME);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << TYPEDEFINE) | (1L << PRINT) | (1L << SENO) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NAME))) != 0)) {
				{
				{
				setState(140); statement();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146); match(T__1);
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
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
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
		enterRule(_localctx, 36, RULE_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(IF);
			setState(149); match(T__15);
			setState(150); condicion();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << TYPEDEFINE) | (1L << PRINT) | (1L << SENO) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NAME))) != 0)) {
				{
				{
				setState(151); statement();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157); match(T__1);
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
		public TerminalNode AND(int i) {
			return getToken(ParserTParser.AND, i);
		}
		public List<AfirmacionContext> afirmacion() {
			return getRuleContexts(AfirmacionContext.class);
		}
		public AfirmacionContext afirmacion(int i) {
			return getRuleContext(AfirmacionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(ParserTParser.AND); }
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
		enterRule(_localctx, 38, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); afirmacion();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(160);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(161); afirmacion();
				}
				}
				setState(166);
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
		public TerminalNode NAME(int i) {
			return getToken(ParserTParser.NAME, i);
		}
		public List<TerminalNode> NAME() { return getTokens(ParserTParser.NAME); }
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
		enterRule(_localctx, 40, RULE_afirmacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); match(NAME);
			setState(168); match(T__2);
			setState(169); oplogico();
			setState(170); match(T__8);
			setState(171); match(NAME);
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
		enterRule(_localctx, 42, RULE_oplogico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYOR) | (1L << MENOR) | (1L << IGUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\u00b2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\7\2\61\n\2"+
		"\f\2\16\2\64\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\5\5F\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\5\nY\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\r\5\rf\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21}\n\21\3\22"+
		"\3\22\3\22\3\22\7\22\u0083\n\22\f\22\16\22\u0086\13\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\7\23\u0090\n\23\f\23\16\23\u0093\13\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\7\24\u009b\n\24\f\24\16\24\u009e\13\24\3\24"+
		"\3\24\3\25\3\25\3\25\7\25\u00a5\n\25\f\25\16\25\u00a8\13\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,\2\5\3\2\36!\3\2\31\32\3\2\33\35\u00aa\2.\3\2\2\2"+
		"\4;\3\2\2\2\6=\3\2\2\2\bE\3\2\2\2\nG\3\2\2\2\fK\3\2\2\2\16N\3\2\2\2\20"+
		"Q\3\2\2\2\22X\3\2\2\2\24Z\3\2\2\2\26`\3\2\2\2\30e\3\2\2\2\32g\3\2\2\2"+
		"\34l\3\2\2\2\36s\3\2\2\2 |\3\2\2\2\"~\3\2\2\2$\u0089\3\2\2\2&\u0096\3"+
		"\2\2\2(\u00a1\3\2\2\2*\u00a9\3\2\2\2,\u00af\3\2\2\2.\62\7\25\2\2/\61\5"+
		"\4\3\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2"+
		"\2\2\64\62\3\2\2\2\65\66\7\26\2\2\66\3\3\2\2\2\67<\5\6\4\28<\5\20\t\2"+
		"9<\5\22\n\2:<\5 \21\2;\67\3\2\2\2;8\3\2\2\2;9\3\2\2\2;:\3\2\2\2<\5\3\2"+
		"\2\2=>\7\27\2\2>?\7+\2\2?@\7\r\2\2@A\5\b\5\2A\7\3\2\2\2BF\5\n\6\2CF\5"+
		"\f\7\2DF\5\16\b\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2F\t\3\2\2\2GH\7\b\2\2H"+
		"I\7(\2\2IJ\7\13\2\2J\13\3\2\2\2KL\7\24\2\2LM\7)\2\2M\r\3\2\2\2NO\7\7\2"+
		"\2OP\7*\2\2P\17\3\2\2\2QR\7\30\2\2RS\7\17\2\2ST\7+\2\2TU\7\20\2\2U\21"+
		"\3\2\2\2VY\5\24\13\2WY\5\30\r\2XV\3\2\2\2XW\3\2\2\2Y\23\3\2\2\2Z[\7+\2"+
		"\2[\\\7\t\2\2\\]\5\26\f\2]^\7\21\2\2^_\7+\2\2_\25\3\2\2\2`a\t\2\2\2a\27"+
		"\3\2\2\2bf\5\32\16\2cf\5\34\17\2df\5\36\20\2eb\3\2\2\2ec\3\2\2\2ed\3\2"+
		"\2\2f\31\3\2\2\2gh\7#\2\2hi\7+\2\2ij\7\21\2\2jk\7+\2\2k\33\3\2\2\2lm\7"+
		"\3\2\2mn\7\"\2\2no\7\f\2\2op\7+\2\2pq\7\21\2\2qr\7+\2\2r\35\3\2\2\2st"+
		"\7+\2\2tu\7\6\2\2uv\7$\2\2vw\7\21\2\2wx\7+\2\2x\37\3\2\2\2y}\5\"\22\2"+
		"z}\5$\23\2{}\5&\24\2|y\3\2\2\2|z\3\2\2\2|{\3\2\2\2}!\3\2\2\2~\177\7&\2"+
		"\2\177\u0080\7\4\2\2\u0080\u0084\5(\25\2\u0081\u0083\5\4\3\2\u0082\u0081"+
		"\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7\23\2\2\u0088#\3\2\2\2"+
		"\u0089\u008a\7\'\2\2\u008a\u008b\7\16\2\2\u008b\u008c\7+\2\2\u008c\u008d"+
		"\7\n\2\2\u008d\u0091\7+\2\2\u008e\u0090\5\4\3\2\u008f\u008e\3\2\2\2\u0090"+
		"\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2"+
		"\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7\23\2\2\u0095%\3\2\2\2\u0096\u0097"+
		"\7%\2\2\u0097\u0098\7\5\2\2\u0098\u009c\5(\25\2\u0099\u009b\5\4\3\2\u009a"+
		"\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\23\2\2\u00a0"+
		"\'\3\2\2\2\u00a1\u00a6\5*\26\2\u00a2\u00a3\t\3\2\2\u00a3\u00a5\5*\26\2"+
		"\u00a4\u00a2\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7)\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7+\2\2\u00aa\u00ab"+
		"\7\22\2\2\u00ab\u00ac\5,\27\2\u00ac\u00ad\7\f\2\2\u00ad\u00ae\7+\2\2\u00ae"+
		"+\3\2\2\2\u00af\u00b0\t\4\2\2\u00b0-\3\2\2\2\f\62;EXe|\u0084\u0091\u009c"+
		"\u00a6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}