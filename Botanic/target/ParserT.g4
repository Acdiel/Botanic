grammar ParserT;
import LexerT;

program   : BEGIN statement* END;
          
statement : lectura | impresion | problemamatematico | ciclo ;


lectura : TYPEDEFINE NAME '=>' tipo;

tipo : entero | decimal | especie;
entero: 'tiene ' INT ' hojas' ;
decimal: 'tiene edad ' FLOAT; 
especie: 'es de la especie:' STRING;
constante: 'tierra ' FLOAT;


impresion: PRINT '('NAME')';


problemamatematico : operacion | funcion;

operacion: NAME 'le afecta' operador 'en' NAME;
operador: SUMA | RESTA | MULTIPLICACION | DIVISION;

funcion: seno | coseno | raizcuadrada;
seno: SENO NAME 'en' NAME;
coseno: 'plantaremos de forma' COSENO 'a' NAME 'en' NAME;
raizcuadrada: NAME 'tiene' SQRT 'en' NAME;


ciclo: mientras | por | si;

mientras: WHILE 'mientras' condicion statement* '.';
por: FOR 'desde' NAME 'hasta' NAME statement* '.';
si: IF 'si' condicion statement* '.';

condicion: afirmacion ( (AND | OR) afirmacion )*;
afirmacion: NAME 'es' oplogico 'a' NAME;
oplogico: MAYOR | MENOR | IGUAL;
