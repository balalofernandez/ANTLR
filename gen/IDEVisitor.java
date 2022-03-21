// Generated from C:/Users/Chete/Desktop/PROCESADORES_DE_LENGUAJES/ANTLR/src\IDE.g4 by ANTLR 4.9.2
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
}