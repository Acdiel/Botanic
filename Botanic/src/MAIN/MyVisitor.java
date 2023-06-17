package MAIN;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import ANTLR.LexerT;
import ANTLR.ParserTBaseVisitor;
import ANTLR.ParserTParser;

public class MyVisitor extends ParserTBaseVisitor<Integer> {

	private Map<String, String> variables = new HashMap<String, String>();
	private Map<String, String> variablesKeyInv = new HashMap<String, String>();

	public String tokenName(Object nodo) {
		if (nodo instanceof TerminalNodeImpl) {
			TerminalNodeImpl nodoTerminal = ((TerminalNodeImpl) nodo);
			return LexerT.VOCABULARY.getSymbolicName(nodoTerminal.getSymbol().getType());
		}
		RuleContext nodoTerminal = (RuleContext) nodo;
		String nombre = nodoTerminal.getClass().getSimpleName();
		return nombre.substring(0, nombre.length() - 7);
	}
	
	@Override
	public Integer visitLectura(ParserTParser.LecturaContext ctx) {
		String nombreVariable = ctx.getChild(1).getText();
		String valorVariable = ctx.getChild(3).getText();
		
		variablesKeyInv.put(valorVariable, nombreVariable);

		return visitChildren(ctx);
	}

	
	// Con esto conseguimos los tipos
	@Override
	public Integer visitEntero(ParserTParser.EnteroContext ctx) 
	{
		// Obtiene la llave de la variable
		String key = variablesKeyInv.get(ctx.getText());
		
		variables.put(key, ctx.getChild(1).getText());
		//System.out.println(key + " = "+ ctx.getChild(1).getText()); // Muestra lo guardado

		return visitChildren(ctx);
	}
	
	@Override
	public Integer visitDecimal(ParserTParser.DecimalContext ctx) 
	{
		// Obtiene la llave de la variable
		String key = variablesKeyInv.get(ctx.getText());
		
		variables.put(key, ctx.getChild(1).getText());
		//System.out.println(key + " = "+ ctx.getChild(1).getText()); // Muestra lo guardado

		return visitChildren(ctx);
	}

	@Override
	public Integer visitEspecie(ParserTParser.EspecieContext ctx) 
	{
		// Obtiene la llave de la variable
		String key = variablesKeyInv.get(ctx.getText());
		
		variables.put(key, ctx.getChild(1).getText());
		//System.out.println(key + " = "+ ctx.getChild(1).getText()); // Muestra lo guardado
		
		return visitChildren(ctx);
	}


	@Override
	public Integer visitImpresion(ParserTParser.ImpresionContext ctx)
	{
		String output = variables.get( ctx.getChild(2).getText() );
		System.out.println(output);

		return visitChildren(ctx);
	}
}
