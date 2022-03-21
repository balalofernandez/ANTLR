grammar IDE;
r: (IDENTIFIER | NUMERIC_INTEGER_CONST | NUMERIC_REAL_CONST | STRING_CONST | COMMENT | COMMENT_LINES)+;
prg: 'PROGRAM' IDENTIFIER ';' blq '.';
blq: dcllist 'BEGIN' sentlist 'END';
dcllist: (dcllist)? dcl;
sentlist : sent | sentlist sent ;
dcl: (defcte | defvar | defproc | deffun) ;
defcte: 'CONST' ctelist;
ctelist : IDENTIFIER '=' simpvalue ';' | ctelist IDENTIFIER '=' simpvalue ';' ;
simpvalue : (NUMERIC_INTEGER_CONST | NUMERIC_REAL_CONST| STRING_CONST);
defvar : 'VAR' defvarlist ';';
defvarlist : varlist ':' tbas | defvarlist ';' varlist ':' tbas;
varlist : IDENTIFIER | IDENTIFIER ',' varlist ;
defproc : 'PROCEDURE' IDENTIFIER formal_paramlist ';' blq ';' ;
deffun : 'FUNCTION' IDENTIFIER formal_paramlist ':' tbas ';' blq ';' ;
formal_paramlist :  ('(' formal_param ')')? ;
formal_param : varlist ':' tbas | varlist ':' tbas ';' formal_param ;
tbas : 'integer' | 'real' ;



//Llamadas a procedimientos;
sent : asig ';' | proc_call ';';
asig : IDENTIFIER ':=' exp;
exp : exp op exp | factor;
op : '+' | '-' | '*' | 'DIV' | 'MOD';
factor : simpvalue | '(' exp ')' | IDENTIFIER subpparamlist;
subpparamlist : ʎ | '(' explist ')';
explist : exp | exp ',' explist;
proc_call : IDENTIFIER subpparamlist;

IDENTIFIER : (CARACTER | '_') (CARACTER | NUM | '_')* {System.out.print("IDENTIFICADOR("+getText()+")");};
NUMERIC_INTEGER_CONST : ('+' | '-')? NUM {System.out.print("NUMERIC_INTEGER_CONST("+getText()+")");};
NUMERIC_REAL_CONST : ('+' | '-')? NUM ('.' NUM)? (('e'|'E') ('+'|'-')? NUM)? {System.out.print("NUMERIC_REAL_CONST("+getText()+")");};//COMENTAR QUE AQUI SE VA A APLICAR LA REGLA MÁS LARGA
STRING_CONST : ('\'' TEXTO* '\'' | '"' TEXTO* '"' ) {System.out.print("STRING_CONST("+getText()+")");};

COMMENT : '{' TEXTO* '}';//PERMITIMOS COMENTARIOS VACIOS
COMMENT_LINES : '(*' .*? '*)'; //POR AQUI

IGNORE: [\t\n\r] -> skip;


fragment CARACTER : [a-zA-Z]+;
fragment NUM : [0-9]+;
fragment TEXTO : ~[\r\n];