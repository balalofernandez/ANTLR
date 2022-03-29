// Generated from D:/Universidad/Lenguajes/ANTLR/src\IDE.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IDEParser}.
 */
public interface IDEListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IDEParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(IDEParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(IDEParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#prg}.
	 * @param ctx the parse tree
	 */
	void enterPrg(IDEParser.PrgContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#prg}.
	 * @param ctx the parse tree
	 */
	void exitPrg(IDEParser.PrgContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#blq}.
	 * @param ctx the parse tree
	 */
	void enterBlq(IDEParser.BlqContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#blq}.
	 * @param ctx the parse tree
	 */
	void exitBlq(IDEParser.BlqContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#dcllist}.
	 * @param ctx the parse tree
	 */
	void enterDcllist(IDEParser.DcllistContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#dcllist}.
	 * @param ctx the parse tree
	 */
	void exitDcllist(IDEParser.DcllistContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void enterSentlist(IDEParser.SentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void exitSentlist(IDEParser.SentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#sentlist_aux}.
	 * @param ctx the parse tree
	 */
	void enterSentlist_aux(IDEParser.Sentlist_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#sentlist_aux}.
	 * @param ctx the parse tree
	 */
	void exitSentlist_aux(IDEParser.Sentlist_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterDcl(IDEParser.DclContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitDcl(IDEParser.DclContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#defcte}.
	 * @param ctx the parse tree
	 */
	void enterDefcte(IDEParser.DefcteContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#defcte}.
	 * @param ctx the parse tree
	 */
	void exitDefcte(IDEParser.DefcteContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#ctelist}.
	 * @param ctx the parse tree
	 */
	void enterCtelist(IDEParser.CtelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#ctelist}.
	 * @param ctx the parse tree
	 */
	void exitCtelist(IDEParser.CtelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#ctelist_aux}.
	 * @param ctx the parse tree
	 */
	void enterCtelist_aux(IDEParser.Ctelist_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#ctelist_aux}.
	 * @param ctx the parse tree
	 */
	void exitCtelist_aux(IDEParser.Ctelist_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void enterSimpvalue(IDEParser.SimpvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void exitSimpvalue(IDEParser.SimpvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#defvar}.
	 * @param ctx the parse tree
	 */
	void enterDefvar(IDEParser.DefvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#defvar}.
	 * @param ctx the parse tree
	 */
	void exitDefvar(IDEParser.DefvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#defvarlist}.
	 * @param ctx the parse tree
	 */
	void enterDefvarlist(IDEParser.DefvarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#defvarlist}.
	 * @param ctx the parse tree
	 */
	void exitDefvarlist(IDEParser.DefvarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#defvarlist_aux}.
	 * @param ctx the parse tree
	 */
	void enterDefvarlist_aux(IDEParser.Defvarlist_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#defvarlist_aux}.
	 * @param ctx the parse tree
	 */
	void exitDefvarlist_aux(IDEParser.Defvarlist_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(IDEParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(IDEParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#defproc}.
	 * @param ctx the parse tree
	 */
	void enterDefproc(IDEParser.DefprocContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#defproc}.
	 * @param ctx the parse tree
	 */
	void exitDefproc(IDEParser.DefprocContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#deffun}.
	 * @param ctx the parse tree
	 */
	void enterDeffun(IDEParser.DeffunContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#deffun}.
	 * @param ctx the parse tree
	 */
	void exitDeffun(IDEParser.DeffunContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#formal_paramlist}.
	 * @param ctx the parse tree
	 */
	void enterFormal_paramlist(IDEParser.Formal_paramlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#formal_paramlist}.
	 * @param ctx the parse tree
	 */
	void exitFormal_paramlist(IDEParser.Formal_paramlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#formal_param}.
	 * @param ctx the parse tree
	 */
	void enterFormal_param(IDEParser.Formal_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#formal_param}.
	 * @param ctx the parse tree
	 */
	void exitFormal_param(IDEParser.Formal_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#formal_param_aux}.
	 * @param ctx the parse tree
	 */
	void enterFormal_param_aux(IDEParser.Formal_param_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#formal_param_aux}.
	 * @param ctx the parse tree
	 */
	void exitFormal_param_aux(IDEParser.Formal_param_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#tbas}.
	 * @param ctx the parse tree
	 */
	void enterTbas(IDEParser.TbasContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#tbas}.
	 * @param ctx the parse tree
	 */
	void exitTbas(IDEParser.TbasContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#sent}.
	 * @param ctx the parse tree
	 */
	void enterSent(IDEParser.SentContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#sent}.
	 * @param ctx the parse tree
	 */
	void exitSent(IDEParser.SentContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#asig}.
	 * @param ctx the parse tree
	 */
	void enterAsig(IDEParser.AsigContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#asig}.
	 * @param ctx the parse tree
	 */
	void exitAsig(IDEParser.AsigContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(IDEParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(IDEParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#exp_aux}.
	 * @param ctx the parse tree
	 */
	void enterExp_aux(IDEParser.Exp_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#exp_aux}.
	 * @param ctx the parse tree
	 */
	void exitExp_aux(IDEParser.Exp_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(IDEParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(IDEParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(IDEParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(IDEParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#subpparamlist}.
	 * @param ctx the parse tree
	 */
	void enterSubpparamlist(IDEParser.SubpparamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#subpparamlist}.
	 * @param ctx the parse tree
	 */
	void exitSubpparamlist(IDEParser.SubpparamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(IDEParser.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(IDEParser.ExplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#explist_aux}.
	 * @param ctx the parse tree
	 */
	void enterExplist_aux(IDEParser.Explist_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#explist_aux}.
	 * @param ctx the parse tree
	 */
	void exitExplist_aux(IDEParser.Explist_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#proc_call}.
	 * @param ctx the parse tree
	 */
	void enterProc_call(IDEParser.Proc_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#proc_call}.
	 * @param ctx the parse tree
	 */
	void exitProc_call(IDEParser.Proc_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#sent_opc}.
	 * @param ctx the parse tree
	 */
	void enterSent_opc(IDEParser.Sent_opcContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#sent_opc}.
	 * @param ctx the parse tree
	 */
	void exitSent_opc(IDEParser.Sent_opcContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#inc}.
	 * @param ctx the parse tree
	 */
	void enterInc(IDEParser.IncContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#inc}.
	 * @param ctx the parse tree
	 */
	void exitInc(IDEParser.IncContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#expcond}.
	 * @param ctx the parse tree
	 */
	void enterExpcond(IDEParser.ExpcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#expcond}.
	 * @param ctx the parse tree
	 */
	void exitExpcond(IDEParser.ExpcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#expcond_aux}.
	 * @param ctx the parse tree
	 */
	void enterExpcond_aux(IDEParser.Expcond_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#expcond_aux}.
	 * @param ctx the parse tree
	 */
	void exitExpcond_aux(IDEParser.Expcond_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#oplog}.
	 * @param ctx the parse tree
	 */
	void enterOplog(IDEParser.OplogContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#oplog}.
	 * @param ctx the parse tree
	 */
	void exitOplog(IDEParser.OplogContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#factorcond}.
	 * @param ctx the parse tree
	 */
	void enterFactorcond(IDEParser.FactorcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#factorcond}.
	 * @param ctx the parse tree
	 */
	void exitFactorcond(IDEParser.FactorcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDEParser#opcomp}.
	 * @param ctx the parse tree
	 */
	void enterOpcomp(IDEParser.OpcompContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDEParser#opcomp}.
	 * @param ctx the parse tree
	 */
	void exitOpcomp(IDEParser.OpcompContext ctx);
}