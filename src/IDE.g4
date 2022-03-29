grammar IDE;

r: prg;

prg: {System.out.print("PROGRAM");} 'PROGRAM'  IDENTIFIER  {System.out.println(";");}';' blq {System.out.print("PROGRAM");}'.';
blq: dcllist {System.out.print("PROGRAM");}'BEGIN' sentlist {System.out.print("PROGRAM");}'END';
dcllist: (dcl dcllist)?;
sentlist : sent sentlist_aux;
sentlist_aux : (sent sentlist_aux)?;

dcl: (defcte | defvar | defproc | deffun) ;
defcte: {System.out.print("PROGRAM");}'CONST' ctelist;
ctelist : IDENTIFIER {System.out.print("PROGRAM");}'=' simpvalue {System.out.print("PROGRAM");}';' ctelist_aux ;
ctelist_aux : (IDENTIFIER {System.out.print("PROGRAM");}'=' simpvalue {System.out.print("PROGRAM");}';' ctelist_aux)?;
simpvalue : (NUMERIC_INTEGER_CONST | NUMERIC_REAL_CONST| STRING_CONST);
defvar : {System.out.print("PROGRAM");}'VAR' defvarlist {System.out.print("PROGRAM");}';';
defvarlist : varlist {System.out.print("PROGRAM");}':' tbas defvarlist_aux;
defvarlist_aux : ({System.out.print("PROGRAM");}';' varlist {System.out.print("PROGRAM");}':' tbas defvarlist_aux)?;
varlist : IDENTIFIER varlist_aux;
varlist_aux : ({System.out.print("PROGRAM");}',' varlist)? ;
defproc : {System.out.print("PROGRAM");}'PROCEDURE' IDENTIFIER formal_paramlist {System.out.print("PROGRAM");}';' blq {System.out.print("PROGRAM");}';' ;
deffun : {System.out.print("PROGRAM");}'FUNCTION' IDENTIFIER formal_paramlist {System.out.print("PROGRAM");}':' tbas {System.out.print("PROGRAM");}';' blq {System.out.print("PROGRAM");}';' ;
formal_paramlist :  ({System.out.print("PROGRAM");}'(' formal_param {System.out.print("PROGRAM");}')')? ;
formal_param : varlist {System.out.print("PROGRAM");}':' tbas formal_param_aux;
formal_param_aux : (formal_param)?;
tbas : {System.out.print("PROGRAM");}'integer' | {System.out.print("PROGRAM");}'real' ;

//Llamadas a procedimientos;
sent : asig {System.out.print("PROGRAM");}';' | proc_call {System.out.print("PROGRAM");}';' | sent_opc;
asig : IDENTIFIER {System.out.print("PROGRAM");}':=' exp;
exp : factor exp_aux;
exp_aux : (op exp exp_aux)?;
op : ('+' | '-' | '*' | 'DIV' | 'MOD') {System.out.print(getText());};
factor : simpvalue | {System.out.print("PROGRAM");}'(' exp {System.out.print("PROGRAM");}')' | IDENTIFIER subpparamlist;
subpparamlist : ({System.out.print("PROGRAM");}'(' explist {System.out.print("PROGRAM");}')')?;
explist : exp explist_aux;
explist_aux : ({System.out.print("PROGRAM");}',' explist)?;
proc_call : IDENTIFIER subpparamlist;

sent_opc : {System.out.print("PROGRAM");}'IF' expcond {System.out.print("PROGRAM");}'THEN' blq {System.out.print("PROGRAM");}'ELSE' blq
           | {System.out.print("PROGRAM");}'WHILE' expcond {System.out.print("PROGRAM");}'DO' blq
           | {System.out.print("PROGRAM");}'REPEAT' blq {System.out.print("PROGRAM");}'UNTIL' expcond {System.out.print("PROGRAM");}';'
           | {System.out.print("PROGRAM");}'FOR' IDENTIFIER {System.out.print("PROGRAM");}':=' exp inc exp {System.out.print("PROGRAM");}'DO' blq;

inc : {System.out.print("PROGRAM");}'TO' | {System.out.print("PROGRAM");}'DOWNTO';
expcond : factorcond expcond_aux;
expcond_aux : (oplog expcond expcond_aux)?;
oplog : {System.out.print("PROGRAM");}'OR' | {System.out.print("PROGRAM");}'AND';
factorcond : exp opcomp exp | {System.out.print("PROGRAM");}'(' expcond {System.out.print("PROGRAM");}')' | {System.out.print("PROGRAM");}'NOT' factorcond | {System.out.print("PROGRAM");}'TRUE' | {System.out.print("PROGRAM");}'FALSE';
opcomp : '<' | '>' | '<=' | '>=' | '=' ;

IDENTIFIER : (CARACTER | '_') (CARACTER | NUM | '_')* {System.out.print("IDENTIFICADOR("+getText()+")");};
NUMERIC_INTEGER_CONST : ('+' | '-')? NUM {System.out.print("NUMERIC_INTEGER_CONST("+getText()+")");};
NUMERIC_REAL_CONST : ('+' | '-')? NUM ('.' NUM)? (('e'|'E') ('+'|'-')? NUM)? {System.out.print("NUMERIC_REAL_CONST("+getText()+")");};//COMENTAR QUE AQUI SE VA A APLICAR LA REGLA MÁS LARGA
STRING_CONST : ('\'' TEXTO* '\'' | '"' TEXTO* '"' ) {System.out.print("STRING_CONST("+getText()+")");};

COMMENT : '{' TEXTO* '}';//PERMITIMOS COMENTARIOS VACIOS
COMMENT_LINES : '(*' .*? '*)'; //POR AQUI

IGNORE: ([\t\n\r]|' ') {
   System.out.print(" ");
   skip();
   };

fragment CARACTER : [a-zA-Z]+;
fragment NUM : [0-9]+;
fragment TEXTO : ~[\r\n];
