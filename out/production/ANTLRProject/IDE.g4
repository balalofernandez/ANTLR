grammar IDE;
r: (IDENTIFIER | NUMERIC_INTEGER_CONST | NUMERIC_REAL_CONST | STRING_CONST | COMMENT | COMMENT_LINES)+;
prg: 'PROGRAM' IDENTIFIER ';' blq '.';
blq: dcllist 'BEGIN' sentlist
dcllist : dcllist dcl
IDENTIFIER : (CARACTER | '_') (CARACTER | NUM | '_')* {System.out.print("IDENTIFICADOR("+getText()+")")};
NUMERIC_INTEGER_CONST : ('+' | '-')? NUM {System.out.print("NUMERIC_INTEGER_CONST("+getText()+")")};
NUMERIC_REAL_CONST : ('+' | '-')? NUM ('.' NUM)? (('e'|'E') ('+'|'-')? NUM)? {System.out.print("NUMERIC_REAL_CONST("+getText()+")")};//COMENTAR QUE AQUI SE VA A APLICAR LA REGLA MÁS LARGA
STRING_CONST : ('\'' TEXTO* '\'' | '"' TEXTO* '"' ) {System.out.print("STRING_CONST("+getText()+")")};

COMMENT : '{' TEXTO* '}' {System.out.print("COMENTARIO("+getText()+")")};//PERMITIMOS COMENTARIOS VACIOS
COMMENT_LINES : '(*' .*? '*)' {System.out.print("COMENTARIO_MULTILINEA("+getText()+")")}; //POR AQUI

IGNORE: [\t\n\r] -> skip;


fragment CARACTER : [a-zA-Z]+;
fragment NUM : [0-9]+;
fragment TEXTO : ~[\r\n];