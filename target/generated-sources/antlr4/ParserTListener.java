// Generated from ParserT.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserTParser}.
 */
public interface ParserTListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserTParser#boleano}.
	 * @param ctx the parse tree
	 */
	void enterBoleano(@NotNull ParserTParser.BoleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#boleano}.
	 * @param ctx the parse tree
	 */
	void exitBoleano(@NotNull ParserTParser.BoleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(@NotNull ParserTParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(@NotNull ParserTParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull ParserTParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull ParserTParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#diagnostico}.
	 * @param ctx the parse tree
	 */
	void enterDiagnostico(@NotNull ParserTParser.DiagnosticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#diagnostico}.
	 * @param ctx the parse tree
	 */
	void exitDiagnostico(@NotNull ParserTParser.DiagnosticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull ParserTParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull ParserTParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#entero}.
	 * @param ctx the parse tree
	 */
	void enterEntero(@NotNull ParserTParser.EnteroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#entero}.
	 * @param ctx the parse tree
	 */
	void exitEntero(@NotNull ParserTParser.EnteroContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull ParserTParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull ParserTParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#lectura}.
	 * @param ctx the parse tree
	 */
	void enterLectura(@NotNull ParserTParser.LecturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#lectura}.
	 * @param ctx the parse tree
	 */
	void exitLectura(@NotNull ParserTParser.LecturaContext ctx);
}