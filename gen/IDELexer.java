// Generated from D:/Universidad/Lenguajes/ANTLR/src\IDE.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IDELexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, IDENTIFIER=42, NUMERIC_INTEGER_CONST=43, 
		NUMERIC_REAL_CONST=44, STRING_CONST=45, COMMENT=46, COMMENT_LINES=47, 
		IGNORE=48, SPACE=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"IDENTIFIER", "NUMERIC_INTEGER_CONST", "NUMERIC_REAL_CONST", "STRING_CONST", 
			"COMMENT", "COMMENT_LINES", "IGNORE", "SPACE", "CARACTER", "NUM", "TEXTO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "';'", "'.'", "'BEGIN'", "'END'", "'CONST'", "'='", 
			"'VAR'", "':'", "','", "'PROCEDURE'", "'FUNCTION'", "'('", "')'", "'integer'", 
			"'real'", "':='", "'+'", "'-'", "'*'", "'DIV'", "'MOD'", "'IF'", "'THEN'", 
			"'ELSE'", "'WHILE'", "'DO'", "'REPEAT'", "'UNTIL'", "'FOR'", "'TO'", 
			"'DOWNTO'", "'OR'", "'AND'", "'NOT'", "'TRUE'", "'FALSE'", "'<'", "'>'", 
			"'<='", "'>='", null, null, null, null, null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "IDENTIFIER", "NUMERIC_INTEGER_CONST", 
			"NUMERIC_REAL_CONST", "STRING_CONST", "COMMENT", "COMMENT_LINES", "IGNORE", 
			"SPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public IDELexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IDE.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 41:
			IDENTIFIER_action((RuleContext)_localctx, actionIndex);
			break;
		case 42:
			NUMERIC_INTEGER_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 43:
			NUMERIC_REAL_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 44:
			STRING_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 47:
			IGNORE_action((RuleContext)_localctx, actionIndex);
			break;
		case 48:
			SPACE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void IDENTIFIER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.print("IDENTIFICADOR("+getText()+")");
			break;
		}
	}
	private void NUMERIC_INTEGER_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.print("NUMERIC_INTEGER_CONST("+getText()+")");
			break;
		}
	}
	private void NUMERIC_REAL_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			System.out.print("NUMERIC_REAL_CONST("+getText()+")");
			break;
		}
	}
	private void STRING_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			System.out.print("STRING_CONST("+getText()+")");
			break;
		}
	}
	private void IGNORE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:

			   skip();
			   
			break;
		}
	}
	private void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:

			              System.out.print(getText());
			              skip();
			              
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u0177\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3"+
		"&\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\5+\u011a\n+\3+\3+\3+"+
		"\7+\u011f\n+\f+\16+\u0122\13+\3+\3+\3,\5,\u0127\n,\3,\3,\3,\3-\5-\u012d"+
		"\n-\3-\3-\3-\5-\u0132\n-\3-\3-\5-\u0136\n-\3-\5-\u0139\n-\3-\3-\3.\3."+
		"\7.\u013f\n.\f.\16.\u0142\13.\3.\3.\3.\7.\u0147\n.\f.\16.\u014a\13.\3"+
		".\5.\u014d\n.\3.\3.\3/\3/\7/\u0153\n/\f/\16/\u0156\13/\3/\3/\3\60\3\60"+
		"\3\60\3\60\7\60\u015e\n\60\f\60\16\60\u0161\13\60\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\63\6\63\u016d\n\63\r\63\16\63\u016e\3\64\6"+
		"\64\u0172\n\64\r\64\16\64\u0173\3\65\3\65\3\u015f\2\66\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\2g\2i\2\3\2\b\4\2--//\4\2GGgg\4\2"+
		"\13\f\17\17\4\2C\\c|\3\2\62;\4\2\f\f\17\17\2\u0183\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3k\3"+
		"\2\2\2\5s\3\2\2\2\7u\3\2\2\2\tw\3\2\2\2\13}\3\2\2\2\r\u0081\3\2\2\2\17"+
		"\u0087\3\2\2\2\21\u0089\3\2\2\2\23\u008d\3\2\2\2\25\u008f\3\2\2\2\27\u0091"+
		"\3\2\2\2\31\u009b\3\2\2\2\33\u00a4\3\2\2\2\35\u00a6\3\2\2\2\37\u00a8\3"+
		"\2\2\2!\u00b0\3\2\2\2#\u00b5\3\2\2\2%\u00b8\3\2\2\2\'\u00ba\3\2\2\2)\u00bc"+
		"\3\2\2\2+\u00be\3\2\2\2-\u00c2\3\2\2\2/\u00c6\3\2\2\2\61\u00c9\3\2\2\2"+
		"\63\u00ce\3\2\2\2\65\u00d3\3\2\2\2\67\u00d9\3\2\2\29\u00dc\3\2\2\2;\u00e3"+
		"\3\2\2\2=\u00e9\3\2\2\2?\u00ed\3\2\2\2A\u00f0\3\2\2\2C\u00f7\3\2\2\2E"+
		"\u00fa\3\2\2\2G\u00fe\3\2\2\2I\u0102\3\2\2\2K\u0107\3\2\2\2M\u010d\3\2"+
		"\2\2O\u010f\3\2\2\2Q\u0111\3\2\2\2S\u0114\3\2\2\2U\u0119\3\2\2\2W\u0126"+
		"\3\2\2\2Y\u012c\3\2\2\2[\u014c\3\2\2\2]\u0150\3\2\2\2_\u0159\3\2\2\2a"+
		"\u0165\3\2\2\2c\u0168\3\2\2\2e\u016c\3\2\2\2g\u0171\3\2\2\2i\u0175\3\2"+
		"\2\2kl\7R\2\2lm\7T\2\2mn\7Q\2\2no\7I\2\2op\7T\2\2pq\7C\2\2qr\7O\2\2r\4"+
		"\3\2\2\2st\7=\2\2t\6\3\2\2\2uv\7\60\2\2v\b\3\2\2\2wx\7D\2\2xy\7G\2\2y"+
		"z\7I\2\2z{\7K\2\2{|\7P\2\2|\n\3\2\2\2}~\7G\2\2~\177\7P\2\2\177\u0080\7"+
		"F\2\2\u0080\f\3\2\2\2\u0081\u0082\7E\2\2\u0082\u0083\7Q\2\2\u0083\u0084"+
		"\7P\2\2\u0084\u0085\7U\2\2\u0085\u0086\7V\2\2\u0086\16\3\2\2\2\u0087\u0088"+
		"\7?\2\2\u0088\20\3\2\2\2\u0089\u008a\7X\2\2\u008a\u008b\7C\2\2\u008b\u008c"+
		"\7T\2\2\u008c\22\3\2\2\2\u008d\u008e\7<\2\2\u008e\24\3\2\2\2\u008f\u0090"+
		"\7.\2\2\u0090\26\3\2\2\2\u0091\u0092\7R\2\2\u0092\u0093\7T\2\2\u0093\u0094"+
		"\7Q\2\2\u0094\u0095\7E\2\2\u0095\u0096\7G\2\2\u0096\u0097\7F\2\2\u0097"+
		"\u0098\7W\2\2\u0098\u0099\7T\2\2\u0099\u009a\7G\2\2\u009a\30\3\2\2\2\u009b"+
		"\u009c\7H\2\2\u009c\u009d\7W\2\2\u009d\u009e\7P\2\2\u009e\u009f\7E\2\2"+
		"\u009f\u00a0\7V\2\2\u00a0\u00a1\7K\2\2\u00a1\u00a2\7Q\2\2\u00a2\u00a3"+
		"\7P\2\2\u00a3\32\3\2\2\2\u00a4\u00a5\7*\2\2\u00a5\34\3\2\2\2\u00a6\u00a7"+
		"\7+\2\2\u00a7\36\3\2\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab"+
		"\7v\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7i\2\2\u00ad\u00ae\7g\2\2\u00ae"+
		"\u00af\7t\2\2\u00af \3\2\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7g\2\2\u00b2"+
		"\u00b3\7c\2\2\u00b3\u00b4\7n\2\2\u00b4\"\3\2\2\2\u00b5\u00b6\7<\2\2\u00b6"+
		"\u00b7\7?\2\2\u00b7$\3\2\2\2\u00b8\u00b9\7-\2\2\u00b9&\3\2\2\2\u00ba\u00bb"+
		"\7/\2\2\u00bb(\3\2\2\2\u00bc\u00bd\7,\2\2\u00bd*\3\2\2\2\u00be\u00bf\7"+
		"F\2\2\u00bf\u00c0\7K\2\2\u00c0\u00c1\7X\2\2\u00c1,\3\2\2\2\u00c2\u00c3"+
		"\7O\2\2\u00c3\u00c4\7Q\2\2\u00c4\u00c5\7F\2\2\u00c5.\3\2\2\2\u00c6\u00c7"+
		"\7K\2\2\u00c7\u00c8\7H\2\2\u00c8\60\3\2\2\2\u00c9\u00ca\7V\2\2\u00ca\u00cb"+
		"\7J\2\2\u00cb\u00cc\7G\2\2\u00cc\u00cd\7P\2\2\u00cd\62\3\2\2\2\u00ce\u00cf"+
		"\7G\2\2\u00cf\u00d0\7N\2\2\u00d0\u00d1\7U\2\2\u00d1\u00d2\7G\2\2\u00d2"+
		"\64\3\2\2\2\u00d3\u00d4\7Y\2\2\u00d4\u00d5\7J\2\2\u00d5\u00d6\7K\2\2\u00d6"+
		"\u00d7\7N\2\2\u00d7\u00d8\7G\2\2\u00d8\66\3\2\2\2\u00d9\u00da\7F\2\2\u00da"+
		"\u00db\7Q\2\2\u00db8\3\2\2\2\u00dc\u00dd\7T\2\2\u00dd\u00de\7G\2\2\u00de"+
		"\u00df\7R\2\2\u00df\u00e0\7G\2\2\u00e0\u00e1\7C\2\2\u00e1\u00e2\7V\2\2"+
		"\u00e2:\3\2\2\2\u00e3\u00e4\7W\2\2\u00e4\u00e5\7P\2\2\u00e5\u00e6\7V\2"+
		"\2\u00e6\u00e7\7K\2\2\u00e7\u00e8\7N\2\2\u00e8<\3\2\2\2\u00e9\u00ea\7"+
		"H\2\2\u00ea\u00eb\7Q\2\2\u00eb\u00ec\7T\2\2\u00ec>\3\2\2\2\u00ed\u00ee"+
		"\7V\2\2\u00ee\u00ef\7Q\2\2\u00ef@\3\2\2\2\u00f0\u00f1\7F\2\2\u00f1\u00f2"+
		"\7Q\2\2\u00f2\u00f3\7Y\2\2\u00f3\u00f4\7P\2\2\u00f4\u00f5\7V\2\2\u00f5"+
		"\u00f6\7Q\2\2\u00f6B\3\2\2\2\u00f7\u00f8\7Q\2\2\u00f8\u00f9\7T\2\2\u00f9"+
		"D\3\2\2\2\u00fa\u00fb\7C\2\2\u00fb\u00fc\7P\2\2\u00fc\u00fd\7F\2\2\u00fd"+
		"F\3\2\2\2\u00fe\u00ff\7P\2\2\u00ff\u0100\7Q\2\2\u0100\u0101\7V\2\2\u0101"+
		"H\3\2\2\2\u0102\u0103\7V\2\2\u0103\u0104\7T\2\2\u0104\u0105\7W\2\2\u0105"+
		"\u0106\7G\2\2\u0106J\3\2\2\2\u0107\u0108\7H\2\2\u0108\u0109\7C\2\2\u0109"+
		"\u010a\7N\2\2\u010a\u010b\7U\2\2\u010b\u010c\7G\2\2\u010cL\3\2\2\2\u010d"+
		"\u010e\7>\2\2\u010eN\3\2\2\2\u010f\u0110\7@\2\2\u0110P\3\2\2\2\u0111\u0112"+
		"\7>\2\2\u0112\u0113\7?\2\2\u0113R\3\2\2\2\u0114\u0115\7@\2\2\u0115\u0116"+
		"\7?\2\2\u0116T\3\2\2\2\u0117\u011a\5e\63\2\u0118\u011a\7a\2\2\u0119\u0117"+
		"\3\2\2\2\u0119\u0118\3\2\2\2\u011a\u0120\3\2\2\2\u011b\u011f\5e\63\2\u011c"+
		"\u011f\5g\64\2\u011d\u011f\7a\2\2\u011e\u011b\3\2\2\2\u011e\u011c\3\2"+
		"\2\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\b+"+
		"\2\2\u0124V\3\2\2\2\u0125\u0127\t\2\2\2\u0126\u0125\3\2\2\2\u0126\u0127"+
		"\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\5g\64\2\u0129\u012a\b,\3\2\u012a"+
		"X\3\2\2\2\u012b\u012d\t\2\2\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2"+
		"\u012d\u012e\3\2\2\2\u012e\u0131\5g\64\2\u012f\u0130\7\60\2\2\u0130\u0132"+
		"\5g\64\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0138\3\2\2\2\u0133"+
		"\u0135\t\3\2\2\u0134\u0136\t\2\2\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2"+
		"\2\2\u0136\u0137\3\2\2\2\u0137\u0139\5g\64\2\u0138\u0133\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\b-\4\2\u013bZ\3\2\2\2\u013c"+
		"\u0140\7)\2\2\u013d\u013f\5i\65\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2"+
		"\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0143\u014d\7)\2\2\u0144\u0148\7$\2\2\u0145\u0147\5i\65"+
		"\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149"+
		"\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014d\7$\2\2\u014c"+
		"\u013c\3\2\2\2\u014c\u0144\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\b."+
		"\5\2\u014f\\\3\2\2\2\u0150\u0154\7}\2\2\u0151\u0153\5i\65\2\u0152\u0151"+
		"\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158\7\177\2\2\u0158^\3\2\2"+
		"\2\u0159\u015a\7*\2\2\u015a\u015b\7,\2\2\u015b\u015f\3\2\2\2\u015c\u015e"+
		"\13\2\2\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u0160\3\2\2\2"+
		"\u015f\u015d\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0163"+
		"\7,\2\2\u0163\u0164\7+\2\2\u0164`\3\2\2\2\u0165\u0166\t\4\2\2\u0166\u0167"+
		"\b\61\6\2\u0167b\3\2\2\2\u0168\u0169\7\"\2\2\u0169\u016a\b\62\7\2\u016a"+
		"d\3\2\2\2\u016b\u016d\t\5\2\2\u016c\u016b\3\2\2\2\u016d\u016e\3\2\2\2"+
		"\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016ff\3\2\2\2\u0170\u0172\t"+
		"\6\2\2\u0171\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0171\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174h\3\2\2\2\u0175\u0176\n\7\2\2\u0176j\3\2\2\2\22\2"+
		"\u0119\u011e\u0120\u0126\u012c\u0131\u0135\u0138\u0140\u0148\u014c\u0154"+
		"\u015f\u016e\u0173\b\3+\2\3,\3\3-\4\3.\5\3\61\6\3\62\7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}