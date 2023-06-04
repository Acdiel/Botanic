grammar ParserT;
import LexerT;

program   : BEGIN statement* END;
          
statement : lectura | impresion | problemamatematico | ciclo ;


lectura : TYPEDEFINE NAME '=>' tipo;

tipo : entero | decimal | especie;
entero: 'tiene' INT 'hojas' ;
decimal: 'tiene edad' FLOAT; 
especie: 'es de la especie:' STRING;
constante: 'tierra' FLOAT;


impresion: PRINT '('NAME')';


problemamatematico : operacion | funcion;

operacion: NAME operador NAME;
operador: SUMA | RESTA | MULTIPLICACION | DIVISION;

funcion: seno | coseno | raizcuadrada | potencia;
seno: SENO NAME;
coseno: 'plantaremos de forma' COSENO 'a' NAME;
raizcuadrada: NAME 'tiene' SQRT VARCHAR;
potencia: POW 'en' NAME num 'veces';
num: INT | FLOAT;


ciclo: mientras | por | si;

mientras: WHILE 'mientras' condicion;
por: FOR 'desde' INT 'hasta' INT;
si: IF condicion;

condicion: afirmacion ( (AND | OR) afirmacion )*;
afirmacion: NAME oplogico NAME;
oplogico: MAYOR | MENOR | IGUAL;
