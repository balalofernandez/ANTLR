grammar IDE;

r: (IDENTIFIER | NUMERIC_INTEGER_CONST | NUMERIC_REAL_CONST | STRING_CONST | COMMENT | COMMENT_LINES)+;

prg: 'PROGRAM' IDENTIFIER ';' blq '.';
blq: dcllist 'BEGIN' sentlist 'END';
dcllist: (dcl dcllist)?;
sentlist : sent sentlist_aux;
sentlist_aux : (sent sentlist_aux)?;

dcl: (defcte | defvar | defproc | deffun) ;
defcte: 'CONST' ctelist;
ctelist : IDENTIFIER '=' simpvalue ';' ctelist_aux ;
ctelist_aux : (IDENTIFIER '=' simpvalue ';' ctelist_aux)?;
simpvalue : (NUMERIC_INTEGER_CONST | NUMERIC_REAL_CONST| STRING_CONST);
defvar : 'VAR' defvarlist ';';
defvarlist : varlist ':' tbas defvarlist_aux;
defvarlist_aux : (';' varlist ':' tbas defvarlist_aux)?;
varlist : IDENTIFIER | IDENTIFIER ',' varlist ;
defproc : 'PROCEDURE' IDENTIFIER formal_paramlist ';' blq ';' ;
deffun : 'FUNCTION' IDENTIFIER formal_paramlist ':' tbas ';' blq ';' ;
formal_paramlist :  ('(' formal_param ')')? ;
formal_param : varlist ':' tbas formal_param_aux;
formal_param_aux : (formal_param)?;
tbas : 'integer' | 'real' ;

//Llamadas a procedimientos;
//sent : asig ';' | proc_call ';' | sent_opc;
sent : IDENTIFIER sent_aux ';' | sent_opc;
sent_aux : asig | proc_call ;
//asig : IDENTIFIER ':=' exp;
asig : ':=' exp;
exp : factor exp_aux;
exp_aux : (op exp exp_aux)?;
op : '+' | '-' | '*' | 'DIV' | 'MOD';
factor : simpvalue | '(' exp ')' | IDENTIFIER subpparamlist;
subpparamlist : ('(' explist ')')?;
explist : exp explist_aux;
explist_aux : (',' explist)?;
//proc_call : IDENTIFIER subpparamlist;
proc_call : subpparamlist;

sent_opc : 'IF' expcond 'THEN' blq 'ELSE' blq
           | 'WHILE' expcond 'DO' blq
           | 'REPEAT' blq 'UNTIL' expcond ';'
           | 'FOR' IDENTIFIER ':=' exp inc exp 'DO' blq;

inc : 'TO' | 'DOWNTO';
expcond : factorcond expcond_aux;
expcond_aux : (oplog expcond expcond_aux)?;
oplog : 'OR' | 'AND';
factorcond : exp opcomp exp | '(' expcond ')' | 'NOT' factorcond | 'TRUE' | 'FALSE';
opcomp : '<' | '>' | '<=' | '>=' | '=' ;

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
