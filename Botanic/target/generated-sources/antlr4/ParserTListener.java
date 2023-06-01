// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserTParser}.
 */
public interface ParserTListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ParserTParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ParserTParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ParserTParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ParserTParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#lectura}.
	 * @param ctx the parse tree
	 */
	void enterLectura(ParserTParser.LecturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#lectura}.
	 * @param ctx the parse tree
	 */
	void exitLectura(ParserTParser.LecturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(ParserTParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(ParserTParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#entero}.
	 * @param ctx the parse tree
	 */
	void enterEntero(ParserTParser.EnteroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#entero}.
	 * @param ctx the parse tree
	 */
	void exitEntero(ParserTParser.EnteroContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#decimal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(ParserTParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#decimal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(ParserTParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(ParserTParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(ParserTParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#operar}.
	 * @param ctx the parse tree
	 */
	void enterOperar(ParserTParser.OperarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#operar}.
	 * @param ctx the parse tree
	 */
	void exitOperar(ParserTParser.OperarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#sumar}.
	 * @param ctx the parse tree
	 */
	void enterSumar(ParserTParser.SumarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#sumar}.
	 * @param ctx the parse tree
	 */
	void exitSumar(ParserTParser.SumarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#restar}.
	 * @param ctx the parse tree
	 */
	void enterRestar(ParserTParser.RestarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#restar}.
	 * @param ctx the parse tree
	 */
	void exitRestar(ParserTParser.RestarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#multiplicar}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicar(ParserTParser.MultiplicarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#multiplicar}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicar(ParserTParser.MultiplicarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#dividir}.
	 * @param ctx the parse tree
	 */
	void enterDividir(ParserTParser.DividirContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#dividir}.
	 * @param ctx the parse tree
	 */
	void exitDividir(ParserTParser.DividirContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#diagnostico}.
	 * @param ctx the parse tree
	 */
	void enterDiagnostico(ParserTParser.DiagnosticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#diagnostico}.
	 * @param ctx the parse tree
	 */
	void exitDiagnostico(ParserTParser.DiagnosticoContext ctx);
}