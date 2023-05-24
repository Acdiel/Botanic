grammar ParserT;
import LexerT;

program   : BEGIN statement+ END;
          
statement : diagnostico | lectura ;


tipo : entero | boleano | string;

entero: 'tiene' INT 'hojas' ;
boleano: 'tiene salud ' BOOL;
string: 'es de la especie:' STRING;

lectura : TYPEDEFINE NAME '=>' tipo;

diagnostico     : PRINT '('INT')' | PRINT '('BOOL')' | PRINT '('STRING')';
