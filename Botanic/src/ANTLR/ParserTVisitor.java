package ANTLR;

// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ParserTParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ParserTParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#lectura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLectura(ParserTParser.LecturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(ParserTParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#entero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntero(ParserTParser.EnteroContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#decimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal(ParserTParser.DecimalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#especie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEspecie(ParserTParser.EspecieContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#impresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresion(ParserTParser.ImpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#problemamatematico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProblemamatematico(ParserTParser.ProblemamatematicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(ParserTParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#operador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador(ParserTParser.OperadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(ParserTParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#seno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeno(ParserTParser.SenoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#coseno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoseno(ParserTParser.CosenoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#raizcuadrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaizcuadrada(ParserTParser.RaizcuadradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#ciclo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo(ParserTParser.CicloContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(ParserTParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#por}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPor(ParserTParser.PorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(ParserTParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(ParserTParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#afirmacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAfirmacion(ParserTParser.AfirmacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#oplogico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOplogico(ParserTParser.OplogicoContext ctx);
}