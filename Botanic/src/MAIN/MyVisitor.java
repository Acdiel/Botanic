package MAIN;

import java.util.*;

import org.antlr.v4.parse.ANTLRParser.range_return;
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

	public boolean isNum(String variable)
	{
		try {
            Integer.parseInt(variable);
			return true;
        } catch (NumberFormatException excepcion) { }

		try {
            Double.parseDouble(variable);
			return true;
        } catch (NumberFormatException excepcion) { }

		return false;
	}

	public String d_Str(Double numero)
	{
		return String.format("%.4f", numero).replace(",", ".");
	}

	/************************ OPERACION FUNCIONES ********************/
	public void realizarGuardarOperacion(String value1, String value2, String operador, String key){
		Double valor1 = Double.parseDouble(value1);
		Double valor2 = Double.parseDouble(value2);
		Double valorFinal = 0.0;
		
		if(operador.equals("primavera"))
		{
			valorFinal = valor1 + valor2;
			variables.put("operacion" + key, d_Str(valorFinal)+" = " + d_Str(valor1) + " + " +d_Str(valor2));;
		}
		else if(operador.equals("invierno"))
		{
			valorFinal = valor1 - valor2;
			variables.put("operacion" + key, d_Str(valorFinal)+" = " + d_Str(valor1) + " - " +d_Str(valor2));;
		}
		else if(operador.equals("injertar"))
		{
			valorFinal = valor1 * valor2;
			variables.put("operacion" + key, d_Str(valorFinal)+" = "+ d_Str(valor1) + " * " +d_Str(valor2));;
		}
		else if(operador.equals("transplantar"))
		{
			if(valor2 == 0.0){
				System.out.println("No se puede tener 0.0 de divisor.");
				variables.put(key, null);
				variables.put("operacion" + key, d_Str(valorFinal) + " = " + d_Str(valor1) + " / " + d_Str(valor2));
				return;
			}
			valorFinal = valor1 / valor2;
			variables.put("operacion" + key, d_Str(valorFinal)+" = " +  d_Str(valor1) + " / " + d_Str(valor2));
		}
		else{
			System.out.println("No existe el operador.");
			variables.put(key, null);;
			return;
		}

		String resultado = d_Str(valorFinal);
		// Transforma la coma en punto (Double es con punto)
		resultado = resultado.replace(",", ".");
		variables.put(key, resultado);
	}
	/************************ FIN OPERACION FUNCIONES ********************/
	/************************ CICLO FUNCIONES ********************/
	// Funciones que usan los nodos de ciclo
	public boolean visitCondicionNodo(ParserTParser.CondicionContext ctx)
	{
		boolean afirmacion = visitAfirmacionNodo( (ParserTParser.AfirmacionContext) ctx.getChild(0) );
		String and_or;

		for( int i = 2; true; i+=2){
			try {
				and_or = ctx.getChild(i-1).getText();

				if(and_or.equals("regar")) // regar es AND
				{
					afirmacion = afirmacion && visitAfirmacionNodo( (ParserTParser.AfirmacionContext) ctx.getChild(i) );
					continue;
				}

				if(and_or.equals("podar")) // podar es OR
				{
					afirmacion = afirmacion || visitAfirmacionNodo( (ParserTParser.AfirmacionContext) ctx.getChild(i) );
					continue;
				}

			} catch (Exception e) {
				break;
			}
		}

		return afirmacion;
	}
	public boolean visitAfirmacionNodo(ParserTParser.AfirmacionContext ctx)
	{
		String value1 = variables.get( ctx.getChild(0).getText() );
		String value2 = variables.get( ctx.getChild(4).getText() );
		String opLogico = ctx.getChild(2).getText();

		try{ // Si es numero entra
			Double valor1 = Double.parseDouble(value1);
			Double valor2 = Double.parseDouble(value2);

			if(opLogico.equals("mas largo")){
				if(Double.compare(valor1, valor2) > 0){
					return true;
				}
			}

			if(opLogico.equals("menos largo")){
				if(Double.compare(valor1, valor2) < 0){
					return true;
				}
			}

			if(opLogico.equals("mismo largo")){
				if(Double.compare(valor1, valor2) == 0){
					return true;
				}
			}

		} catch (Exception e){}

		try { // el string no puede ser mayor o menor a otro string
			if(opLogico.equals("mismo largo")){
				if(value1.equals(value2)){
					return true;
				}
			}
		} catch (Exception e) {}

		return false;
	}
	/************************ FIN CICLO FUNCIONES ********************/
	

	/*****************************************************************************************
		LECTURA
	******************************************************************************************/
	@Override
	public Integer visitLectura(ParserTParser.LecturaContext ctx) {
		String nombreVariable = ctx.getChild(1).getText();
		String valorVariable = ctx.getChild(3).getText();
		
		variablesKeyInv.put(valorVariable, nombreVariable);

		return visitChildren(ctx);
	}

	@Override
	public Integer visitEntero(ParserTParser.EnteroContext ctx) 
	{
		// Obtiene la llave de la variable
		String key = variablesKeyInv.get(ctx.getText());
		
		variables.put(key, ctx.getChild(1).getText());

		return visitChildren(ctx);
	}
	
	@Override
	public Integer visitDecimal(ParserTParser.DecimalContext ctx) 
	{
		// Obtiene la llave de la variable
		String key = variablesKeyInv.get(ctx.getText());

		String value = ctx.getChild(1).getText();
		// Transforma la coma en punto (Double es con punto)
		value = value.replace(",", ".");
		variables.put(key, value);

		return visitChildren(ctx);
	}

	@Override
	public Integer visitEspecie(ParserTParser.EspecieContext ctx) 
	{
		// Obtiene la llave de la variable
		String key = variablesKeyInv.get(ctx.getText());

		String value = ctx.getChild(1).getText();
		// Le quita las comillas antes de guardarlo
		value = value.replace("\"", "");
		
		variables.put(key, value);
		
		return visitChildren(ctx);
	}


	/*****************************************************************************************
		OPERACIONES
	******************************************************************************************/
	@Override
	public Integer visitOperacion(ParserTParser.OperacionContext ctx)
	{
		String key = ctx.getChild(0).getText(); // Donde se guarda el resultado
		String value1 = variables.get( ctx.getChild(2).getText() ); // 1era variable de la operacion
		String operador = ctx.getChild(4).getText(); // operador
		String value2 = variables.get( ctx.getChild(6).getText() ); // 2da variable de la operacion
		
		if (!isNum(value1))
		{
			System.out.println(ctx.getChild(2).getText() + " no es un numero. No se puede realizar la operación.");
			variables.put(key, null);
			return visitChildren(ctx);
		}
		if (!isNum(value2))
		{
			System.out.println(ctx.getChild(6).getText() + " no es un numero. No se puede realizar la operación.");
			variables.put(key, null);
			return visitChildren(ctx);
		}
		
		realizarGuardarOperacion(value1, value2, operador, key);

		return visitChildren(ctx);
	}


	/*****************************************************************************************
		FUNCIONES
	******************************************************************************************/
	@Override
	public Integer visitSeno(ParserTParser.SenoContext ctx) 
	{
		String key = ctx.getChild(3).getText();
		String value = variables.get(ctx.getChild(1).getText());

		if (!isNum(value))
		{
			System.out.println(ctx.getChild(2).getText() + " no es un numero. No se puede realizar la función.");
			variables.put(key, null);
			return visitChildren(ctx);
		}

		Double valor = Double.parseDouble(value);
		Double seno_valor = Math.sin(valor);

		String resultado = d_Str(seno_valor);

		variables.put(key, resultado);
		variables.put("funcion"+key, resultado + " = " + "sen(" + d_Str(valor) + ")");

		return visitChildren(ctx);
	}

	@Override
	public Integer visitCoseno(ParserTParser.CosenoContext ctx) 
	{
		String key = ctx.getChild(5).getText();
		String value = variables.get(ctx.getChild(3).getText());
		
		if (!isNum(value))
		{
			System.out.println(ctx.getChild(2).getText() + " no es un numero. No se puede realizar la función.");
			variables.put(key, null);
			return visitChildren(ctx);
		}

		Double valor = Double.parseDouble(value);
		Double coseno_valor = Math.cos(valor);

		String resultado = d_Str(coseno_valor);

		variables.put(key, resultado);
		variables.put("funcion"+key, resultado + " = " + "cos(" + d_Str(valor) + ")");
		return visitChildren(ctx);
	}

	@Override
	public Integer visitRaizcuadrada(ParserTParser.RaizcuadradaContext ctx)
	{
		String key = ctx.getChild(4).getText();
		String value = variables.get(ctx.getChild(0).getText());

		if (!isNum(value))
		{
			System.out.println(ctx.getChild(2).getText() + " no es un numero. No se puede realizar la función.");
			variables.put(key, null);
			return visitChildren(ctx);
		}

		Double valor = Double.parseDouble(value);
		Double raiz_valor = Math.sqrt(valor);

		String resultado = d_Str(raiz_valor);

		variables.put(key, resultado);
		variables.put("funcion"+key, resultado + " = " + "sqrt(" + d_Str(valor) + ")");

		return visitChildren(ctx);
	}


	/*****************************************************************************************
		IF
	******************************************************************************************/
	@Override
	public Integer visitSi(ParserTParser.SiContext ctx)
	{
		boolean afirmacion =  visitCondicionNodo( (ParserTParser.CondicionContext) ctx.getChild(2) );

		if(afirmacion)
		{	
			for (int i = 3; true ; i++)
			{
				try {
					if(ctx.getChild(i).getText().equals("."))
					{break;}
					visitStatement( (ParserTParser.StatementContext) ctx.getChild(i) );
				} catch (Exception e) {
					break;
				}
				
			}
		}

		return 0;
	}


	/*****************************************************************************************
		WHILE
	******************************************************************************************/
	@Override
	public Integer visitMientras(ParserTParser.MientrasContext ctx) 
	{
		boolean afirmacion =  visitCondicionNodo( (ParserTParser.CondicionContext) ctx.getChild(2) );

		while(afirmacion)
		{	
			for (int i = 3; true ; i++)
			{
				try {
					if(ctx.getChild(i).getText().equals("."))
					{break;}
					visitStatement( (ParserTParser.StatementContext) ctx.getChild(i) );
				} catch (Exception e) {
					break;
				}
			
			}
			afirmacion =  visitCondicionNodo( (ParserTParser.CondicionContext) ctx.getChild(2) );
		}

		return 0;
	}

	/*****************************************************************************************
		FOR
	******************************************************************************************/
	@Override
	public Integer visitPor(ParserTParser.PorContext ctx) 
	{
		String inicio = variables.get( ctx.getChild(2).getText() );
		String fin = variables.get( ctx.getChild(4).getText() );

		if( !(isNum(inicio) && isNum(fin)) ){
			return 0;
		}

		int desde;
		int hasta;

		try {
			desde = Integer.parseInt(inicio);
			hasta = Integer.parseInt(fin);

			for (int j=desde ; j < hasta ; j++)
			{
				for (int i = 5; true ; i++)
				{
					try {
						if(ctx.getChild(i).getText().equals("."))
						{break;}
						visitStatement( (ParserTParser.StatementContext) ctx.getChild(i) );
					} catch (Exception e) {
						break;
					}
					
				}
			}
		} catch (Exception e) {}
		
		return 0;
	}

	/*****************************************************************************************
		IMPRESION
	******************************************************************************************/
	@Override
	public Integer visitImpresion(ParserTParser.ImpresionContext ctx)
	{
		System.out.println(variables.get(ctx.getChild(2).getText()));
		
		return visitChildren(ctx);
	}
}
