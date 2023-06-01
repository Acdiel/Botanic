grammar ParserT;
import LexerT;

program   : BEGIN statement+ END;
          
statement : diagnostico | lectura | operar ;


lectura : TYPEDEFINE NAME '=>' tipo;

tipo : entero | decimal | string;

entero: 'tiene' INT 'hojas' ;
decimal: 'tiene edad' FLOAT; 
string: 'es de la especie:' STRING;
const: 'tierra' CONST;

operar : sumar | restar | dividir | multiplicar;
sumar : NAME SUMA NAME;
restar: NAME RESTA NAME;
multiplicar: NAME MULTIPLICACION NAME;
dividir: NAME DIVISION NAME;


diagnostico     : PRINT '('NAME')';
