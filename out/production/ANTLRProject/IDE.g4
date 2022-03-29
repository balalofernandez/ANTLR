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
varlist : IDENTIFIER | IDENTIFIER {System.out.print("PROGRAM");}',' varlist ;
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
subpparamlist : ('(' explist ')')?;
explist : exp explist_aux;
explist_aux : (',' explist)?;
proc_call : IDENTIFIER subpparamlist;

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

IGNORE: ([\t\n\r]|' ') {
   System.out.print(" ");
   skip();
   };

fragment CARACTER : [a-zA-Z]+;
fragment NUM : [0-9]+;
fragment TEXTO : ~[\r\n];
