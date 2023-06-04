lexer grammar LexerT;

BEGIN: 'sembrar';
END: 'cosechar';

//lectura de datos
TYPEDEFINE:'la planta';
//impresion de datos
PRINT: 'diagnostico';
   
//operadores logicos
OR: 'podar'; 
AND:'regar'; 
MAYOR:'mas largo';
MENOR:'menos largo';
IGUAL:'mismo largo';

//operadores matematicos
SUMA :'primavera';
RESTA:'invierno';
MULTIPLICACION:'injertar';
DIVISION:'transplantar';

//operaciones matematicas
COSENO: 'sistematica';
SENO :'albuca';
SQRT :'raiz';  
POW: 'usar fertilizante';

//operacion condicional
IF :'plantaremos';


//repetitiva
WHILE : 'abonaremos';
FOR: 'cavaremos';
 
 //variables y tipos de datos
VARCHAR:[ A-Za-z]+;
INT : [0-9]+ ;//int
FLOAT: [0-9]+ ',' [0-9]+;
NAME:[a-z]+;//nombre de variable en minusculas
STRING: '"' VARCHAR '"'; //string


WS : [ \t\r\n]+ -> skip ;
