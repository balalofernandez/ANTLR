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
		IGNORE=48;
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
			"COMMENT", "COMMENT_LINES", "IGNORE", "CARACTER", "NUM", "TEXTO"
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
			"'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "IDENTIFIER", "NUMERIC_INTEGER_CONST", 
			"NUMERIC_REAL_CONST", "STRING_CONST", "COMMENT", "COMMENT_LINES", "IGNORE"
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

			   System.out.print(" ");
			   skip();
			   
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u0174\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3"+
		"&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\5+\u0118\n+\3+\3+\3+\7+\u011d"+
		"\n+\f+\16+\u0120\13+\3+\3+\3,\5,\u0125\n,\3,\3,\3,\3-\5-\u012b\n-\3-\3"+
		"-\3-\5-\u0130\n-\3-\3-\5-\u0134\n-\3-\5-\u0137\n-\3-\3-\3.\3.\7.\u013d"+
		"\n.\f.\16.\u0140\13.\3.\3.\3.\7.\u0145\n.\f.\16.\u0148\13.\3.\5.\u014b"+
		"\n.\3.\3.\3/\3/\7/\u0151\n/\f/\16/\u0154\13/\3/\3/\3\60\3\60\3\60\3\60"+
		"\7\60\u015c\n\60\f\60\16\60\u015f\13\60\3\60\3\60\3\60\3\61\5\61\u0165"+
		"\n\61\3\61\3\61\3\62\6\62\u016a\n\62\r\62\16\62\u016b\3\63\6\63\u016f"+
		"\n\63\r\63\16\63\u0170\3\64\3\64\3\u015d\2\65\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U,W-Y.[/]\60_\61a\62c\2e\2g\2\3\2\b\4\2--//\4\2GGgg\5\2\13\f\17\17\""+
		"\"\4\2C\\c|\3\2\62;\4\2\f\f\17\17\2\u0180\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2"+
		"\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3i\3\2\2\2\5q\3\2\2\2"+
		"\7s\3\2\2\2\tu\3\2\2\2\13{\3\2\2\2\r\177\3\2\2\2\17\u0085\3\2\2\2\21\u0087"+
		"\3\2\2\2\23\u008b\3\2\2\2\25\u008d\3\2\2\2\27\u008f\3\2\2\2\31\u0099\3"+
		"\2\2\2\33\u00a2\3\2\2\2\35\u00a4\3\2\2\2\37\u00a6\3\2\2\2!\u00ae\3\2\2"+
		"\2#\u00b3\3\2\2\2%\u00b6\3\2\2\2\'\u00b8\3\2\2\2)\u00ba\3\2\2\2+\u00bc"+
		"\3\2\2\2-\u00c0\3\2\2\2/\u00c4\3\2\2\2\61\u00c7\3\2\2\2\63\u00cc\3\2\2"+
		"\2\65\u00d1\3\2\2\2\67\u00d7\3\2\2\29\u00da\3\2\2\2;\u00e1\3\2\2\2=\u00e7"+
		"\3\2\2\2?\u00eb\3\2\2\2A\u00ee\3\2\2\2C\u00f5\3\2\2\2E\u00f8\3\2\2\2G"+
		"\u00fc\3\2\2\2I\u0100\3\2\2\2K\u0105\3\2\2\2M\u010b\3\2\2\2O\u010d\3\2"+
		"\2\2Q\u010f\3\2\2\2S\u0112\3\2\2\2U\u0117\3\2\2\2W\u0124\3\2\2\2Y\u012a"+
		"\3\2\2\2[\u014a\3\2\2\2]\u014e\3\2\2\2_\u0157\3\2\2\2a\u0164\3\2\2\2c"+
		"\u0169\3\2\2\2e\u016e\3\2\2\2g\u0172\3\2\2\2ij\7R\2\2jk\7T\2\2kl\7Q\2"+
		"\2lm\7I\2\2mn\7T\2\2no\7C\2\2op\7O\2\2p\4\3\2\2\2qr\7=\2\2r\6\3\2\2\2"+
		"st\7\60\2\2t\b\3\2\2\2uv\7D\2\2vw\7G\2\2wx\7I\2\2xy\7K\2\2yz\7P\2\2z\n"+
		"\3\2\2\2{|\7G\2\2|}\7P\2\2}~\7F\2\2~\f\3\2\2\2\177\u0080\7E\2\2\u0080"+
		"\u0081\7Q\2\2\u0081\u0082\7P\2\2\u0082\u0083\7U\2\2\u0083\u0084\7V\2\2"+
		"\u0084\16\3\2\2\2\u0085\u0086\7?\2\2\u0086\20\3\2\2\2\u0087\u0088\7X\2"+
		"\2\u0088\u0089\7C\2\2\u0089\u008a\7T\2\2\u008a\22\3\2\2\2\u008b\u008c"+
		"\7<\2\2\u008c\24\3\2\2\2\u008d\u008e\7.\2\2\u008e\26\3\2\2\2\u008f\u0090"+
		"\7R\2\2\u0090\u0091\7T\2\2\u0091\u0092\7Q\2\2\u0092\u0093\7E\2\2\u0093"+
		"\u0094\7G\2\2\u0094\u0095\7F\2\2\u0095\u0096\7W\2\2\u0096\u0097\7T\2\2"+
		"\u0097\u0098\7G\2\2\u0098\30\3\2\2\2\u0099\u009a\7H\2\2\u009a\u009b\7"+
		"W\2\2\u009b\u009c\7P\2\2\u009c\u009d\7E\2\2\u009d\u009e\7V\2\2\u009e\u009f"+
		"\7K\2\2\u009f\u00a0\7Q\2\2\u00a0\u00a1\7P\2\2\u00a1\32\3\2\2\2\u00a2\u00a3"+
		"\7*\2\2\u00a3\34\3\2\2\2\u00a4\u00a5\7+\2\2\u00a5\36\3\2\2\2\u00a6\u00a7"+
		"\7k\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7g\2\2\u00aa"+
		"\u00ab\7i\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7t\2\2\u00ad \3\2\2\2\u00ae"+
		"\u00af\7t\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7n\2\2"+
		"\u00b2\"\3\2\2\2\u00b3\u00b4\7<\2\2\u00b4\u00b5\7?\2\2\u00b5$\3\2\2\2"+
		"\u00b6\u00b7\7-\2\2\u00b7&\3\2\2\2\u00b8\u00b9\7/\2\2\u00b9(\3\2\2\2\u00ba"+
		"\u00bb\7,\2\2\u00bb*\3\2\2\2\u00bc\u00bd\7F\2\2\u00bd\u00be\7K\2\2\u00be"+
		"\u00bf\7X\2\2\u00bf,\3\2\2\2\u00c0\u00c1\7O\2\2\u00c1\u00c2\7Q\2\2\u00c2"+
		"\u00c3\7F\2\2\u00c3.\3\2\2\2\u00c4\u00c5\7K\2\2\u00c5\u00c6\7H\2\2\u00c6"+
		"\60\3\2\2\2\u00c7\u00c8\7V\2\2\u00c8\u00c9\7J\2\2\u00c9\u00ca\7G\2\2\u00ca"+
		"\u00cb\7P\2\2\u00cb\62\3\2\2\2\u00cc\u00cd\7G\2\2\u00cd\u00ce\7N\2\2\u00ce"+
		"\u00cf\7U\2\2\u00cf\u00d0\7G\2\2\u00d0\64\3\2\2\2\u00d1\u00d2\7Y\2\2\u00d2"+
		"\u00d3\7J\2\2\u00d3\u00d4\7K\2\2\u00d4\u00d5\7N\2\2\u00d5\u00d6\7G\2\2"+
		"\u00d6\66\3\2\2\2\u00d7\u00d8\7F\2\2\u00d8\u00d9\7Q\2\2\u00d98\3\2\2\2"+
		"\u00da\u00db\7T\2\2\u00db\u00dc\7G\2\2\u00dc\u00dd\7R\2\2\u00dd\u00de"+
		"\7G\2\2\u00de\u00df\7C\2\2\u00df\u00e0\7V\2\2\u00e0:\3\2\2\2\u00e1\u00e2"+
		"\7W\2\2\u00e2\u00e3\7P\2\2\u00e3\u00e4\7V\2\2\u00e4\u00e5\7K\2\2\u00e5"+
		"\u00e6\7N\2\2\u00e6<\3\2\2\2\u00e7\u00e8\7H\2\2\u00e8\u00e9\7Q\2\2\u00e9"+
		"\u00ea\7T\2\2\u00ea>\3\2\2\2\u00eb\u00ec\7V\2\2\u00ec\u00ed\7Q\2\2\u00ed"+
		"@\3\2\2\2\u00ee\u00ef\7F\2\2\u00ef\u00f0\7Q\2\2\u00f0\u00f1\7Y\2\2\u00f1"+
		"\u00f2\7P\2\2\u00f2\u00f3\7V\2\2\u00f3\u00f4\7Q\2\2\u00f4B\3\2\2\2\u00f5"+
		"\u00f6\7Q\2\2\u00f6\u00f7\7T\2\2\u00f7D\3\2\2\2\u00f8\u00f9\7C\2\2\u00f9"+
		"\u00fa\7P\2\2\u00fa\u00fb\7F\2\2\u00fbF\3\2\2\2\u00fc\u00fd\7P\2\2\u00fd"+
		"\u00fe\7Q\2\2\u00fe\u00ff\7V\2\2\u00ffH\3\2\2\2\u0100\u0101\7V\2\2\u0101"+
		"\u0102\7T\2\2\u0102\u0103\7W\2\2\u0103\u0104\7G\2\2\u0104J\3\2\2\2\u0105"+
		"\u0106\7H\2\2\u0106\u0107\7C\2\2\u0107\u0108\7N\2\2\u0108\u0109\7U\2\2"+
		"\u0109\u010a\7G\2\2\u010aL\3\2\2\2\u010b\u010c\7>\2\2\u010cN\3\2\2\2\u010d"+
		"\u010e\7@\2\2\u010eP\3\2\2\2\u010f\u0110\7>\2\2\u0110\u0111\7?\2\2\u0111"+
		"R\3\2\2\2\u0112\u0113\7@\2\2\u0113\u0114\7?\2\2\u0114T\3\2\2\2\u0115\u0118"+
		"\5c\62\2\u0116\u0118\7a\2\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118"+
		"\u011e\3\2\2\2\u0119\u011d\5c\62\2\u011a\u011d\5e\63\2\u011b\u011d\7a"+
		"\2\2\u011c\u0119\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d"+
		"\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2"+
		"\2\2\u0120\u011e\3\2\2\2\u0121\u0122\b+\2\2\u0122V\3\2\2\2\u0123\u0125"+
		"\t\2\2\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0127\5e\63\2\u0127\u0128\b,\3\2\u0128X\3\2\2\2\u0129\u012b\t\2\2\2\u012a"+
		"\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012f\5e"+
		"\63\2\u012d\u012e\7\60\2\2\u012e\u0130\5e\63\2\u012f\u012d\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u0136\3\2\2\2\u0131\u0133\t\3\2\2\u0132\u0134\t\2"+
		"\2\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0137\5e\63\2\u0136\u0131\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2"+
		"\2\2\u0138\u0139\b-\4\2\u0139Z\3\2\2\2\u013a\u013e\7)\2\2\u013b\u013d"+
		"\5g\64\2\u013c\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u014b\7)"+
		"\2\2\u0142\u0146\7$\2\2\u0143\u0145\5g\64\2\u0144\u0143\3\2\2\2\u0145"+
		"\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2"+
		"\2\2\u0148\u0146\3\2\2\2\u0149\u014b\7$\2\2\u014a\u013a\3\2\2\2\u014a"+
		"\u0142\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\b.\5\2\u014d\\\3\2\2\2"+
		"\u014e\u0152\7}\2\2\u014f\u0151\5g\64\2\u0150\u014f\3\2\2\2\u0151\u0154"+
		"\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0155\u0156\7\177\2\2\u0156^\3\2\2\2\u0157\u0158\7*\2\2"+
		"\u0158\u0159\7,\2\2\u0159\u015d\3\2\2\2\u015a\u015c\13\2\2\2\u015b\u015a"+
		"\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e"+
		"\u0160\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\7,\2\2\u0161\u0162\7+\2"+
		"\2\u0162`\3\2\2\2\u0163\u0165\t\4\2\2\u0164\u0163\3\2\2\2\u0165\u0166"+
		"\3\2\2\2\u0166\u0167\b\61\6\2\u0167b\3\2\2\2\u0168\u016a\t\5\2\2\u0169"+
		"\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2"+
		"\2\2\u016cd\3\2\2\2\u016d\u016f\t\6\2\2\u016e\u016d\3\2\2\2\u016f\u0170"+
		"\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171f\3\2\2\2\u0172"+
		"\u0173\n\7\2\2\u0173h\3\2\2\2\23\2\u0117\u011c\u011e\u0124\u012a\u012f"+
		"\u0133\u0136\u013e\u0146\u014a\u0152\u015d\u0164\u016b\u0170\7\3+\2\3"+
		",\3\3-\4\3.\5\3\61\6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}