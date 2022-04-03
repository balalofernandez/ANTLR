grammar IDE;

r: prg;

prg: {System.out.print("PROGRAM");} 'PROGRAM'  IDENTIFIER  {System.out.print(";");}';' blq {System.out.print(".");}'.';
blq: dcllist {System.out.print("BEGIN");}'BEGIN' sentlist {System.out.print("END");}'END';
dcllist: (dcl dcllist)?;
sentlist : sent sentlist_aux;
sentlist_aux : (sent sentlist_aux)?;

dcl: (defcte | defvar | defproc | deffun) ;
defcte: {System.out.print("CONST");}'CONST' ctelist;
ctelist : IDENTIFIER {System.out.print("=");}'=' simpvalue {System.out.print(";");}';' ctelist_aux ;
ctelist_aux : (IDENTIFIER {System.out.print("=");}'=' simpvalue {System.out.print(";");}';' ctelist_aux)?;
simpvalue : (NUMERIC_INTEGER_CONST | NUMERIC_REAL_CONST| STRING_CONST);
defvar : {System.out.print("VAR");}'VAR' defvarlist {System.out.print("este;");}';';
defvarlist : varlist {System.out.print(":");}':' tbas defvarlist_aux;
defvarlist_aux : ({System.out.print(";");}';' varlist {System.out.print(":");}':' tbas defvarlist_aux)?;
varlist : IDENTIFIER varlist_aux;
varlist_aux : ({System.out.print(",");}',' varlist)? ;
defproc : {System.out.print("PROCEDURE");}'PROCEDURE' IDENTIFIER formal_paramlist {System.out.print(";");}';' blq {System.out.print(";");}';' ;
deffun : {System.out.print("FUNCTION");}'FUNCTION' IDENTIFIER formal_paramlist {System.out.print(":");}':' tbas {System.out.print(";");}';' blq {System.out.print(";");}';' ;
formal_paramlist :  ({System.out.print("(");}'(' formal_param {System.out.print(")");}')')? ;
formal_param : varlist {System.out.print(":");}':' tbas formal_param_aux;
formal_param_aux : (formal_param)?;
tbas : {System.out.print("integer");}'integer' | {System.out.print("real");}'real' ;

//Llamadas a procedimientos;
sent : asig {System.out.print(";");}';' | proc_call {System.out.print(";");}';' | sent_opc;
asig : IDENTIFIER {System.out.print(":=");}':=' exp;
exp : factor exp_aux;
exp_aux : (op exp exp_aux)?;
op : {System.out.print("+");} '+' | {System.out.print("-");} '-' | {System.out.print("*");}'*' | {System.out.print("DIV");}'DIV' | {System.out.print("MOD");}'MOD';
factor : simpvalue | {System.out.print("(");}'(' exp {System.out.print(")");}')' | IDENTIFIER subpparamlist;
subpparamlist : ({System.out.print("(");}'(' explist {System.out.print(")");}')')?;
explist : exp explist_aux;
explist_aux : ({System.out.print(",");}',' explist)?;
proc_call : IDENTIFIER subpparamlist;

sent_opc : {System.out.print("IF");}'IF' expcond {System.out.print("THEN");}'THEN' blq {System.out.print("ELSE");}'ELSE' blq
           | {System.out.print("WHILE");}'WHILE' expcond {System.out.print("DO");}'DO' blq
           | {System.out.print("REPEAT");}'REPEAT' blq {System.out.print("UNTIL");}'UNTIL' expcond {System.out.print(";");}';'
           | {System.out.print("FOR");}'FOR' IDENTIFIER {System.out.print(":=");}':=' exp inc exp {System.out.print("DO");}'DO' blq;

inc : {System.out.print("TO");}'TO' | {System.out.print("DOWNTO");}'DOWNTO';
expcond : factorcond expcond_aux;
expcond_aux : (oplog expcond expcond_aux)?;
oplog : {System.out.print("OR");}'OR' | {System.out.print("AND");}'AND';
factorcond : exp opcomp exp | {System.out.print("(");}'(' expcond {System.out.print(")");}')' | {System.out.print("NOT");}'NOT' factorcond | {System.out.print("TRUE");}'TRUE' | {System.out.print("FALSE");}'FALSE';
opcomp : {System.out.print("<");}'<' | {System.out.print(">");}'>' | {System.out.print("<=");}'<=' | {System.out.print(">=");}'>=' | {System.out.print("=");}'=' ;

IDENTIFIER : (CARACTER | '_') (CARACTER | NUM | '_')* {System.out.print("IDENTIFICADOR("+getText()+")");};
NUMERIC_INTEGER_CONST : ('+' | '-')? NUM {System.out.print("NUMERIC_INTEGER_CONST("+getText()+")");};
NUMERIC_REAL_CONST : ('+' | '-')? NUM ('.' NUM)? (('e'|'E') ('+'|'-')? NUM)? {System.out.print("NUMERIC_REAL_CONST("+getText()+")");};//COMENTAR QUE AQUI SE VA A APLICAR LA REGLA MÁS LARGA
STRING_CONST : ('\'' TEXTO* '\'' | '"' TEXTO* '"' ) {System.out.print("STRING_CONST("+getText()+")");};

COMMENT : '{' TEXTO* '}';//PERMITIMOS COMENTARIOS VACIOS
COMMENT_LINES : '(*' .*? '*)'; //POR AQUI

IGNORE: [\t\n\r]{
   skip();
   };
SPACE: ' ' {
              System.out.print(getText());
              skip();
              };
fragment CARACTER : [a-zA-Z]+;
fragment NUM : [0-9]+;
fragment TEXTO : ~[\r\n];
