// Generated from D:/Universidad/Lenguajes/ANTLR/src\IDE.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IDEParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IDEVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IDEParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(IDEParser.RContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#prg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrg(IDEParser.PrgContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#blq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlq(IDEParser.BlqContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#dcllist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcllist(IDEParser.DcllistContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#sentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlist(IDEParser.SentlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#sentlist_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlist_aux(IDEParser.Sentlist_auxContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(IDEParser.DclContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#defcte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefcte(IDEParser.DefcteContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#ctelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtelist(IDEParser.CtelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#ctelist_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtelist_aux(IDEParser.Ctelist_auxContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#simpvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpvalue(IDEParser.SimpvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#defvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvar(IDEParser.DefvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#defvarlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvarlist(IDEParser.DefvarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#defvarlist_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvarlist_aux(IDEParser.Defvarlist_auxContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(IDEParser.VarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#varlist_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist_aux(IDEParser.Varlist_auxContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#defproc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefproc(IDEParser.DefprocContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#deffun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeffun(IDEParser.DeffunContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#formal_paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_paramlist(IDEParser.Formal_paramlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#formal_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_param(IDEParser.Formal_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#formal_param_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_param_aux(IDEParser.Formal_param_auxContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#tbas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTbas(IDEParser.TbasContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent(IDEParser.SentContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#asig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsig(IDEParser.AsigContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(IDEParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#exp_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_aux(IDEParser.Exp_auxContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(IDEParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(IDEParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#subpparamlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpparamlist(IDEParser.SubpparamlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#explist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist(IDEParser.ExplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#explist_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist_aux(IDEParser.Explist_auxContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#proc_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_call(IDEParser.Proc_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#sent_opc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent_opc(IDEParser.Sent_opcContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#inc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc(IDEParser.IncContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#expcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpcond(IDEParser.ExpcondContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#expcond_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpcond_aux(IDEParser.Expcond_auxContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#oplog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOplog(IDEParser.OplogContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#factorcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorcond(IDEParser.FactorcondContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDEParser#opcomp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcomp(IDEParser.OpcompContext ctx);
}