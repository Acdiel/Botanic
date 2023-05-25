lexer grammar LexerT;

BEGIN: 'sembrar';
END: 'cosechar';
PRINT: 'diagnostico';
TYPEDEFINE:'la planta';
 
//operadores logicos
OR: 'podar';
AND:'regar'; 
//operadores matematicos
SUMA :'primavera';
RESTA:'invierno';
MULTIPLICACION:'injertar';
DIVISION:'transplantar';
 
 //variables y tipos de datos
NAME:[a-z]+;//nombre de variable en minusculas
STRING:'"'[ A-Za-z]+'"';//string
BOOL :[0|1];//bool
INT : [0-9]+ ;//int

NUMBER : [0-9]+ ;
WS : [ \t\r\n]+ -> skip ;