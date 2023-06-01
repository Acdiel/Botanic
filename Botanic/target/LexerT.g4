lexer grammar LexerT;

BEGIN: 'sembrar';
END: 'cosechar';
//impresion de datos
PRINT: 'diagnostico';
//lectura de datos
TYPEDEFINE:'la planta';
   
//operadores logicos
OR: 'podar'; 
AND:'regar'; 
//operadores matematicos
SUMA :'primavera';
RESTA:'invierno';
MULTIPLICACION:'injertar';
DIVISION:'transplantar';
MAYOR:'mas largo';
MENOR:'menos largo';
IGUAL:'mismo largo';

//operaciones matematicas
COSENO :'corcho';
SENO :'albuca';
SQRT :'raiz';  

//operacion condicional

IF :'plantaremos';


//repetitiva

WHILE : 'abonaremos';
FOR: 'cavaremos';
 
 //variables y tipos de datos
NAME:[a-z]+;//nombre de variable en minusculas
STRING:'"'[ A-Za-z]+'"';//string
INT : [0-9]+ ;//int
FLOAT: [0-9]+','[0-9]+;
CONST: [0-9]+ ','[0-9]+;

WS : [ \t\r\n]+ -> skip ;
