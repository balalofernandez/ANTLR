// Generated from C:/Users/Chete/Desktop/PROCESADORES_DE_LENGUAJES/ANTLR/src\IDE.g4 by ANTLR 4.9.2
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
		IDENTIFIER=1, NUMERIC_INTEGER_CONST=2, NUMERIC_REAL_CONST=3, STRING_CONST=4, 
		COMMENT=5, COMMENT_LINES=6, IGNORE=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IDENTIFIER", "NUMERIC_INTEGER_CONST", "NUMERIC_REAL_CONST", "STRING_CONST", 
			"COMMENT", "COMMENT_LINES", "IGNORE", "CARACTER", "NUM", "TEXTO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IDENTIFIER", "NUMERIC_INTEGER_CONST", "NUMERIC_REAL_CONST", "STRING_CONST", 
			"COMMENT", "COMMENT_LINES", "IGNORE"
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
		case 0:
			IDENTIFIER_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			NUMERIC_INTEGER_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			NUMERIC_REAL_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			STRING_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			COMMENT_LINES_action((RuleContext)_localctx, actionIndex);
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
			System.out.print("NUMERIC_INTEGER_CONST("+getText()+")")
			break;
		}
	}
	private void NUMERIC_REAL_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			System.out.print("NUMERIC_REAL_CONST("+getText()+")")
			break;
		}
	}
	private void STRING_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			System.out.print("STRING_CONST("+getText()+")")
			break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			System.out.print("COMENTARIO("+getText()+")")
			break;
		}
	}
	private void COMMENT_LINES_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			System.out.print("COMENTARIO_MULTILINEA("+getText()+")")
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\tx\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\5\2\32\n\2\3\2\3\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\3\2\3\2"+
		"\3\3\5\3\'\n\3\3\3\3\3\3\3\3\4\5\4-\n\4\3\4\3\4\3\4\5\4\62\n\4\3\4\3\4"+
		"\5\4\66\n\4\3\4\5\49\n\4\3\4\3\4\3\5\3\5\7\5?\n\5\f\5\16\5B\13\5\3\5\3"+
		"\5\3\5\7\5G\n\5\f\5\16\5J\13\5\3\5\5\5M\n\5\3\5\3\5\3\6\3\6\7\6S\n\6\f"+
		"\6\16\6V\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7_\n\7\f\7\16\7b\13\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\6\tn\n\t\r\t\16\to\3\n\6\ns\n\n\r"+
		"\n\16\nt\3\13\3\13\3`\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\2\23\2\25\2"+
		"\3\2\b\4\2--//\4\2GGgg\4\2\13\f\17\17\4\2C\\c|\3\2\62;\4\2\f\f\17\17\2"+
		"\u0084\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\3\31\3\2\2\2\5&\3\2\2\2\7,\3\2\2\2\tL\3\2\2\2"+
		"\13P\3\2\2\2\rZ\3\2\2\2\17h\3\2\2\2\21m\3\2\2\2\23r\3\2\2\2\25v\3\2\2"+
		"\2\27\32\5\21\t\2\30\32\7a\2\2\31\27\3\2\2\2\31\30\3\2\2\2\32 \3\2\2\2"+
		"\33\37\5\21\t\2\34\37\5\23\n\2\35\37\7a\2\2\36\33\3\2\2\2\36\34\3\2\2"+
		"\2\36\35\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!#\3\2\2\2\" \3\2\2"+
		"\2#$\b\2\2\2$\4\3\2\2\2%\'\t\2\2\2&%\3\2\2\2&\'\3\2\2\2\'(\3\2\2\2()\5"+
		"\23\n\2)*\b\3\3\2*\6\3\2\2\2+-\t\2\2\2,+\3\2\2\2,-\3\2\2\2-.\3\2\2\2."+
		"\61\5\23\n\2/\60\7\60\2\2\60\62\5\23\n\2\61/\3\2\2\2\61\62\3\2\2\2\62"+
		"8\3\2\2\2\63\65\t\3\2\2\64\66\t\2\2\2\65\64\3\2\2\2\65\66\3\2\2\2\66\67"+
		"\3\2\2\2\679\5\23\n\28\63\3\2\2\289\3\2\2\29:\3\2\2\2:;\b\4\4\2;\b\3\2"+
		"\2\2<@\7)\2\2=?\5\25\13\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3"+
		"\2\2\2B@\3\2\2\2CM\7)\2\2DH\7$\2\2EG\5\25\13\2FE\3\2\2\2GJ\3\2\2\2HF\3"+
		"\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KM\7$\2\2L<\3\2\2\2LD\3\2\2\2MN\3"+
		"\2\2\2NO\b\5\5\2O\n\3\2\2\2PT\7}\2\2QS\5\25\13\2RQ\3\2\2\2SV\3\2\2\2T"+
		"R\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7\177\2\2XY\b\6\6\2Y\f\3\2\2"+
		"\2Z[\7*\2\2[\\\7,\2\2\\`\3\2\2\2]_\13\2\2\2^]\3\2\2\2_b\3\2\2\2`a\3\2"+
		"\2\2`^\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\7,\2\2de\7+\2\2ef\3\2\2\2fg\b\7\7"+
		"\2g\16\3\2\2\2hi\t\4\2\2ij\3\2\2\2jk\b\b\b\2k\20\3\2\2\2ln\t\5\2\2ml\3"+
		"\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2p\22\3\2\2\2qs\t\6\2\2rq\3\2\2\2s"+
		"t\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\24\3\2\2\2vw\n\7\2\2w\26\3\2\2\2\22\2\31"+
		"\36 &,\61\658@HLT`ot\t\3\2\2\3\3\3\3\4\4\3\5\5\3\6\6\3\7\7\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}