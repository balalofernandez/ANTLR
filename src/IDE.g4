grammar IDE;
r: (IDENTIFIER)+;

IDENTIFIER : (CHAR | '_') (CHAR | NUM | '_')* {System.out.print(getText());};
NUMERIC_INTEGER_CONST : ('+' | '-')? NUM ;
NUMERIC_REAL_CONST : ('+' | '-')? NUM ('.' NUM)? (('e'|'E') ('+'|'-') NUM)? ;//COMENTAR QUE AQUI SE VA A APLICAR LA REGLA MÁS LARGA
STRING_CONST : ('\'' TEXT* '\'' | '"' TEXT* '"' );

COMMENT : '{' TEXT* '}';//PERMITIMOS COMENTARIOS VACIOS
COMMENT_LINES : '(*' .*? '*)'; //POR AQUI

IGNORE: [\t\n\r ] -> skip;

fragment CHAR : [a-zA-Z];
fragment NUM : [0-9];
fragment TEXT : ~[\r\n];

