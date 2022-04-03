// Generated from D:/Universidad/Lenguajes/ANTLR/src\IDE.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IDEParser extends Parser {
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
	public static final int
		RULE_r = 0, RULE_prg = 1, RULE_blq = 2, RULE_dcllist = 3, RULE_sentlist = 4, 
		RULE_sentlist_aux = 5, RULE_dcl = 6, RULE_defcte = 7, RULE_ctelist = 8, 
		RULE_ctelist_aux = 9, RULE_simpvalue = 10, RULE_defvar = 11, RULE_defvarlist = 12, 
		RULE_defvarlist_aux = 13, RULE_varlist = 14, RULE_varlist_aux = 15, RULE_defproc = 16, 
		RULE_deffun = 17, RULE_formal_paramlist = 18, RULE_formal_param = 19, 
		RULE_formal_param_aux = 20, RULE_tbas = 21, RULE_sent = 22, RULE_asig = 23, 
		RULE_exp = 24, RULE_exp_aux = 25, RULE_op = 26, RULE_factor = 27, RULE_subpparamlist = 28, 
		RULE_explist = 29, RULE_explist_aux = 30, RULE_proc_call = 31, RULE_sent_opc = 32, 
		RULE_inc = 33, RULE_expcond = 34, RULE_expcond_aux = 35, RULE_oplog = 36, 
		RULE_factorcond = 37, RULE_opcomp = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"r", "prg", "blq", "dcllist", "sentlist", "sentlist_aux", "dcl", "defcte", 
			"ctelist", "ctelist_aux", "simpvalue", "defvar", "defvarlist", "defvarlist_aux", 
			"varlist", "varlist_aux", "defproc", "deffun", "formal_paramlist", "formal_param", 
			"formal_param_aux", "tbas", "sent", "asig", "exp", "exp_aux", "op", "factor", 
			"subpparamlist", "explist", "explist_aux", "proc_call", "sent_opc", "inc", 
			"expcond", "expcond_aux", "oplog", "factorcond", "opcomp"
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

	@Override
	public String getGrammarFileName() { return "IDE.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IDEParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RContext extends ParserRuleContext {
		public PrgContext prg() {
			return getRuleContext(PrgContext.class,0);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			prg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrgContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(IDEParser.IDENTIFIER, 0); }
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public PrgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterPrg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitPrg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitPrg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrgContext prg() throws RecognitionException {
		PrgContext _localctx = new PrgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.print("PROGRAM");
			setState(81);
			match(T__0);
			setState(82);
			match(IDENTIFIER);
			System.out.print(";");
			setState(84);
			match(T__1);
			setState(85);
			blq();
			System.out.print(".");
			setState(87);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlqContext extends ParserRuleContext {
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public BlqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterBlq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitBlq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitBlq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlqContext blq() throws RecognitionException {
		BlqContext _localctx = new BlqContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_blq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			dcllist();
			System.out.print("BEGIN");
			setState(91);
			match(T__3);
			setState(92);
			sentlist();
			System.out.print("END");
			setState(94);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DcllistContext extends ParserRuleContext {
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public DcllistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcllist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterDcllist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitDcllist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitDcllist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DcllistContext dcllist() throws RecognitionException {
		DcllistContext _localctx = new DcllistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dcllist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				setState(96);
				dcl();
				setState(97);
				dcllist();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentlistContext extends ParserRuleContext {
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public Sentlist_auxContext sentlist_aux() {
			return getRuleContext(Sentlist_auxContext.class,0);
		}
		public SentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterSentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitSentlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitSentlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentlistContext sentlist() throws RecognitionException {
		SentlistContext _localctx = new SentlistContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			sent();
			setState(102);
			sentlist_aux();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sentlist_auxContext extends ParserRuleContext {
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public Sentlist_auxContext sentlist_aux() {
			return getRuleContext(Sentlist_auxContext.class,0);
		}
		public Sentlist_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlist_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterSentlist_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitSentlist_aux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitSentlist_aux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentlist_auxContext sentlist_aux() throws RecognitionException {
		Sentlist_auxContext _localctx = new Sentlist_auxContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sentlist_aux);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(104);
				sent();
				setState(105);
				sentlist_aux();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DclContext extends ParserRuleContext {
		public DefcteContext defcte() {
			return getRuleContext(DefcteContext.class,0);
		}
		public DefvarContext defvar() {
			return getRuleContext(DefvarContext.class,0);
		}
		public DefprocContext defproc() {
			return getRuleContext(DefprocContext.class,0);
		}
		public DeffunContext deffun() {
			return getRuleContext(DeffunContext.class,0);
		}
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(109);
				defcte();
				}
				break;
			case T__7:
				{
				setState(110);
				defvar();
				}
				break;
			case T__10:
				{
				setState(111);
				defproc();
				}
				break;
			case T__11:
				{
				setState(112);
				deffun();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefcteContext extends ParserRuleContext {
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public DefcteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defcte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterDefcte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitDefcte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitDefcte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefcteContext defcte() throws RecognitionException {
		DefcteContext _localctx = new DefcteContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_defcte);
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.print("CONST");
			setState(116);
			match(T__5);
			setState(117);
			ctelist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CtelistContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(IDEParser.IDENTIFIER, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public Ctelist_auxContext ctelist_aux() {
			return getRuleContext(Ctelist_auxContext.class,0);
		}
		public CtelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterCtelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitCtelist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitCtelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtelistContext ctelist() throws RecognitionException {
		CtelistContext _localctx = new CtelistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ctelist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(IDENTIFIER);
			System.out.print("=");
			setState(121);
			match(T__6);
			setState(122);
			simpvalue();
			System.out.print(";");
			setState(124);
			match(T__1);
			setState(125);
			ctelist_aux();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ctelist_auxContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(IDEParser.IDENTIFIER, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public Ctelist_auxContext ctelist_aux() {
			return getRuleContext(Ctelist_auxContext.class,0);
		}
		public Ctelist_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctelist_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterCtelist_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitCtelist_aux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitCtelist_aux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ctelist_auxContext ctelist_aux() throws RecognitionException {
		Ctelist_auxContext _localctx = new Ctelist_auxContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ctelist_aux);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(127);
				match(IDENTIFIER);
				System.out.print("=");
				setState(129);
				match(T__6);
				setState(130);
				simpvalue();
				System.out.print(";");
				setState(132);
				match(T__1);
				setState(133);
				ctelist_aux();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpvalueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_INTEGER_CONST() { return getToken(IDEParser.NUMERIC_INTEGER_CONST, 0); }
		public TerminalNode NUMERIC_REAL_CONST() { return getToken(IDEParser.NUMERIC_REAL_CONST, 0); }
		public TerminalNode STRING_CONST() { return getToken(IDEParser.STRING_CONST, 0); }
		public SimpvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterSimpvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitSimpvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitSimpvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpvalueContext simpvalue() throws RecognitionException {
		SimpvalueContext _localctx = new SimpvalueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_simpvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_INTEGER_CONST) | (1L << NUMERIC_REAL_CONST) | (1L << STRING_CONST))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefvarContext extends ParserRuleContext {
		public DefvarlistContext defvarlist() {
			return getRuleContext(DefvarlistContext.class,0);
		}
		public DefvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterDefvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitDefvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitDefvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefvarContext defvar() throws RecognitionException {
		DefvarContext _localctx = new DefvarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_defvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.print("VAR");
			setState(140);
			match(T__7);
			setState(141);
			defvarlist();
			System.out.print("este;");
			setState(143);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefvarlistContext extends ParserRuleContext {
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public Defvarlist_auxContext defvarlist_aux() {
			return getRuleContext(Defvarlist_auxContext.class,0);
		}
		public DefvarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvarlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterDefvarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitDefvarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitDefvarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefvarlistContext defvarlist() throws RecognitionException {
		DefvarlistContext _localctx = new DefvarlistContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_defvarlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			varlist();
			System.out.print(":");
			setState(147);
			match(T__8);
			setState(148);
			tbas();
			setState(149);
			defvarlist_aux();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Defvarlist_auxContext extends ParserRuleContext {
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public Defvarlist_auxContext defvarlist_aux() {
			return getRuleContext(Defvarlist_auxContext.class,0);
		}
		public Defvarlist_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvarlist_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterDefvarlist_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitDefvarlist_aux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitDefvarlist_aux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Defvarlist_auxContext defvarlist_aux() throws RecognitionException {
		Defvarlist_auxContext _localctx = new Defvarlist_auxContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_defvarlist_aux);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				System.out.print(";");
				setState(152);
				match(T__1);
				setState(153);
				varlist();
				System.out.print(":");
				setState(155);
				match(T__8);
				setState(156);
				tbas();
				setState(157);
				defvarlist_aux();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarlistContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(IDEParser.IDENTIFIER, 0); }
		public Varlist_auxContext varlist_aux() {
			return getRuleContext(Varlist_auxContext.class,0);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitVarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitVarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_varlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(IDENTIFIER);
			setState(162);
			varlist_aux();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Varlist_auxContext extends ParserRuleContext {
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public Varlist_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterVarlist_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitVarlist_aux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitVarlist_aux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Varlist_auxContext varlist_aux() throws RecognitionException {
		Varlist_auxContext _localctx = new Varlist_auxContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_varlist_aux);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				System.out.print(",");
				setState(165);
				match(T__9);
				setState(166);
				varlist();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefprocContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(IDEParser.IDENTIFIER, 0); }
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public DefprocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defproc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterDefproc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitDefproc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitDefproc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefprocContext defproc() throws RecognitionException {
		DefprocContext _localctx = new DefprocContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_defproc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.print("PROCEDURE");
			setState(170);
			match(T__10);
			setState(171);
			match(IDENTIFIER);
			setState(172);
			formal_paramlist();
			System.out.print(";");
			setState(174);
			match(T__1);
			setState(175);
			blq();
			System.out.print(";");
			setState(177);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeffunContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(IDEParser.IDENTIFIER, 0); }
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public DeffunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deffun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterDeffun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitDeffun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitDeffun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeffunContext deffun() throws RecognitionException {
		DeffunContext _localctx = new DeffunContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_deffun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.print("FUNCTION");
			setState(180);
			match(T__11);
			setState(181);
			match(IDENTIFIER);
			setState(182);
			formal_paramlist();
			System.out.print(":");
			setState(184);
			match(T__8);
			setState(185);
			tbas();
			System.out.print(";");
			setState(187);
			match(T__1);
			setState(188);
			blq();
			System.out.print(";");
			setState(190);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formal_paramlistContext extends ParserRuleContext {
		public Formal_paramContext formal_param() {
			return getRuleContext(Formal_paramContext.class,0);
		}
		public Formal_paramlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterFormal_paramlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitFormal_paramlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitFormal_paramlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_paramlistContext formal_paramlist() throws RecognitionException {
		Formal_paramlistContext _localctx = new Formal_paramlistContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_formal_paramlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				System.out.print("(");
				setState(193);
				match(T__12);
				setState(194);
				formal_param();
				System.out.print(")");
				setState(196);
				match(T__13);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formal_paramContext extends ParserRuleContext {
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public Formal_param_auxContext formal_param_aux() {
			return getRuleContext(Formal_param_auxContext.class,0);
		}
		public Formal_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterFormal_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitFormal_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitFormal_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_paramContext formal_param() throws RecognitionException {
		Formal_paramContext _localctx = new Formal_paramContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_formal_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			varlist();
			System.out.print(":");
			setState(202);
			match(T__8);
			setState(203);
			tbas();
			setState(204);
			formal_param_aux();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formal_param_auxContext extends ParserRuleContext {
		public Formal_paramContext formal_param() {
			return getRuleContext(Formal_paramContext.class,0);
		}
		public Formal_param_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_param_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterFormal_param_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitFormal_param_aux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitFormal_param_aux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_param_auxContext formal_param_aux() throws RecognitionException {
		Formal_param_auxContext _localctx = new Formal_param_auxContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_formal_param_aux);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(206);
				formal_param();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TbasContext extends ParserRuleContext {
		public TbasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tbas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterTbas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitTbas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitTbas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TbasContext tbas() throws RecognitionException {
		TbasContext _localctx = new TbasContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tbas);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				System.out.print("integer");
				setState(210);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				System.out.print("real");
				setState(212);
				match(T__15);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentContext extends ParserRuleContext {
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public Proc_callContext proc_call() {
			return getRuleContext(Proc_callContext.class,0);
		}
		public Sent_opcContext sent_opc() {
			return getRuleContext(Sent_opcContext.class,0);
		}
		public SentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterSent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitSent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitSent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentContext sent() throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_sent);
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				asig();
				System.out.print(";");
				setState(217);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				proc_call();
				System.out.print(";");
				setState(221);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				sent_opc();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsigContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(IDEParser.IDENTIFIER, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AsigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterAsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitAsig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitAsig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsigContext asig() throws RecognitionException {
		AsigContext _localctx = new AsigContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(IDENTIFIER);
			System.out.print(":=");
			setState(228);
			match(T__16);
			setState(229);
			exp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Exp_auxContext exp_aux() {
			return getRuleContext(Exp_auxContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			factor();
			setState(232);
			exp_aux();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_auxContext extends ParserRuleContext {
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Exp_auxContext exp_aux() {
			return getRuleContext(Exp_auxContext.class,0);
		}
		public Exp_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterExp_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitExp_aux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitExp_aux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_auxContext exp_aux() throws RecognitionException {
		Exp_auxContext _localctx = new Exp_auxContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_exp_aux);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(234);
				op();
				setState(235);
				exp();
				setState(236);
				exp_aux();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpContext extends ParserRuleContext {
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_op);
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				System.out.print("+");
				setState(241);
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				System.out.print("-");
				setState(243);
				match(T__18);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				System.out.print("*");
				setState(245);
				match(T__19);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				System.out.print("DIV");
				setState(247);
				match(T__20);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 5);
				{
				System.out.print("MOD");
				setState(249);
				match(T__21);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(IDEParser.IDENTIFIER, 0); }
		public SubpparamlistContext subpparamlist() {
			return getRuleContext(SubpparamlistContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_factor);
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_INTEGER_CONST:
			case NUMERIC_REAL_CONST:
			case STRING_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				simpvalue();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				System.out.print("(");
				setState(254);
				match(T__12);
				setState(255);
				exp();
				System.out.print(")");
				setState(257);
				match(T__13);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				match(IDENTIFIER);
				setState(260);
				subpparamlist();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubpparamlistContext extends ParserRuleContext {
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public SubpparamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subpparamlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterSubpparamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitSubpparamlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitSubpparamlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubpparamlistContext subpparamlist() throws RecognitionException {
		SubpparamlistContext _localctx = new SubpparamlistContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_subpparamlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				System.out.print("(");
				setState(264);
				match(T__12);
				setState(265);
				explist();
				System.out.print(")");
				setState(267);
				match(T__13);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplistContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Explist_auxContext explist_aux() {
			return getRuleContext(Explist_auxContext.class,0);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterExplist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitExplist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitExplist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_explist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			exp();
			setState(272);
			explist_aux();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Explist_auxContext extends ParserRuleContext {
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public Explist_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterExplist_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitExplist_aux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitExplist_aux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Explist_auxContext explist_aux() throws RecognitionException {
		Explist_auxContext _localctx = new Explist_auxContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_explist_aux);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				System.out.print(",");
				setState(275);
				match(T__9);
				setState(276);
				explist();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Proc_callContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(IDEParser.IDENTIFIER, 0); }
		public SubpparamlistContext subpparamlist() {
			return getRuleContext(SubpparamlistContext.class,0);
		}
		public Proc_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterProc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitProc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitProc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_callContext proc_call() throws RecognitionException {
		Proc_callContext _localctx = new Proc_callContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_proc_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(IDENTIFIER);
			setState(280);
			subpparamlist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sent_opcContext extends ParserRuleContext {
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public List<BlqContext> blq() {
			return getRuleContexts(BlqContext.class);
		}
		public BlqContext blq(int i) {
			return getRuleContext(BlqContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(IDEParser.IDENTIFIER, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public IncContext inc() {
			return getRuleContext(IncContext.class,0);
		}
		public Sent_opcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent_opc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterSent_opc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitSent_opc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitSent_opc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sent_opcContext sent_opc() throws RecognitionException {
		Sent_opcContext _localctx = new Sent_opcContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_sent_opc);
		try {
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				System.out.print("IF");
				setState(283);
				match(T__22);
				setState(284);
				expcond();
				System.out.print("THEN");
				setState(286);
				match(T__23);
				setState(287);
				blq();
				System.out.print("ELSE");
				setState(289);
				match(T__24);
				setState(290);
				blq();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				System.out.print("WHILE");
				setState(293);
				match(T__25);
				setState(294);
				expcond();
				System.out.print("DO");
				setState(296);
				match(T__26);
				setState(297);
				blq();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				System.out.print("REPEAT");
				setState(300);
				match(T__27);
				setState(301);
				blq();
				System.out.print("UNTIL");
				setState(303);
				match(T__28);
				setState(304);
				expcond();
				System.out.print(";");
				setState(306);
				match(T__1);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 4);
				{
				System.out.print("FOR");
				setState(309);
				match(T__29);
				setState(310);
				match(IDENTIFIER);
				System.out.print(":=");
				setState(312);
				match(T__16);
				setState(313);
				exp();
				setState(314);
				inc();
				setState(315);
				exp();
				System.out.print("DO");
				setState(317);
				match(T__26);
				setState(318);
				blq();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncContext extends ParserRuleContext {
		public IncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitInc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncContext inc() throws RecognitionException {
		IncContext _localctx = new IncContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_inc);
		try {
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				System.out.print("TO");
				setState(323);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				System.out.print("DOWNTO");
				setState(325);
				match(T__31);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpcondContext extends ParserRuleContext {
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public Expcond_auxContext expcond_aux() {
			return getRuleContext(Expcond_auxContext.class,0);
		}
		public ExpcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterExpcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitExpcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitExpcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpcondContext expcond() throws RecognitionException {
		ExpcondContext _localctx = new ExpcondContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			factorcond();
			setState(329);
			expcond_aux();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expcond_auxContext extends ParserRuleContext {
		public OplogContext oplog() {
			return getRuleContext(OplogContext.class,0);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public Expcond_auxContext expcond_aux() {
			return getRuleContext(Expcond_auxContext.class,0);
		}
		public Expcond_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expcond_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterExpcond_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitExpcond_aux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitExpcond_aux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expcond_auxContext expcond_aux() throws RecognitionException {
		Expcond_auxContext _localctx = new Expcond_auxContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expcond_aux);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(331);
				oplog();
				setState(332);
				expcond();
				setState(333);
				expcond_aux();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OplogContext extends ParserRuleContext {
		public OplogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oplog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterOplog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitOplog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitOplog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OplogContext oplog() throws RecognitionException {
		OplogContext _localctx = new OplogContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_oplog);
		try {
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				System.out.print("OR");
				setState(338);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				System.out.print("AND");
				setState(340);
				match(T__33);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorcondContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OpcompContext opcomp() {
			return getRuleContext(OpcompContext.class,0);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public FactorcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterFactorcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitFactorcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitFactorcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorcondContext factorcond() throws RecognitionException {
		FactorcondContext _localctx = new FactorcondContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_factorcond);
		try {
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				exp();
				setState(344);
				opcomp();
				setState(345);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				System.out.print("(");
				setState(348);
				match(T__12);
				setState(349);
				expcond();
				System.out.print(")");
				setState(351);
				match(T__13);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				System.out.print("NOT");
				setState(354);
				match(T__34);
				setState(355);
				factorcond();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				System.out.print("TRUE");
				setState(357);
				match(T__35);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				System.out.print("FALSE");
				setState(359);
				match(T__36);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpcompContext extends ParserRuleContext {
		public OpcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).enterOpcomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDEListener ) ((IDEListener)listener).exitOpcomp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IDEVisitor ) return ((IDEVisitor<? extends T>)visitor).visitOpcomp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcompContext opcomp() throws RecognitionException {
		OpcompContext _localctx = new OpcompContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_opcomp);
		try {
			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				System.out.print("<");
				setState(363);
				match(T__37);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 2);
				{
				System.out.print(">");
				setState(365);
				match(T__38);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 3);
				{
				System.out.print("<=");
				setState(367);
				match(T__39);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 4);
				{
				System.out.print(">=");
				setState(369);
				match(T__40);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				System.out.print("=");
				setState(371);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u0179\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5f"+
		"\n\5\3\6\3\6\3\6\3\7\3\7\3\7\5\7n\n\7\3\b\3\b\3\b\3\b\5\bt\n\b\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u008a\n\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a2"+
		"\n\17\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u00aa\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00c9\n\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\5\26\u00d2\n\26\3\27\3\27\3\27\3\27"+
		"\5\27\u00d8\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00e3"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\5\33"+
		"\u00f1\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00fd"+
		"\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0108\n\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\5\36\u0110\n\36\3\37\3\37\3\37\3 \3 \3 \5 \u0118"+
		"\n \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0143\n\"\3#\3#\3#\3#\5#\u0149\n#\3$\3$\3"+
		"$\3%\3%\3%\3%\5%\u0152\n%\3&\3&\3&\3&\5&\u0158\n&\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u016b\n\'\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\5(\u0177\n(\3(\2\2)\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLN\2\3\3\2-/\2\u0175\2P\3\2"+
		"\2\2\4R\3\2\2\2\6[\3\2\2\2\be\3\2\2\2\ng\3\2\2\2\fm\3\2\2\2\16s\3\2\2"+
		"\2\20u\3\2\2\2\22y\3\2\2\2\24\u0089\3\2\2\2\26\u008b\3\2\2\2\30\u008d"+
		"\3\2\2\2\32\u0093\3\2\2\2\34\u00a1\3\2\2\2\36\u00a3\3\2\2\2 \u00a9\3\2"+
		"\2\2\"\u00ab\3\2\2\2$\u00b5\3\2\2\2&\u00c8\3\2\2\2(\u00ca\3\2\2\2*\u00d1"+
		"\3\2\2\2,\u00d7\3\2\2\2.\u00e2\3\2\2\2\60\u00e4\3\2\2\2\62\u00e9\3\2\2"+
		"\2\64\u00f0\3\2\2\2\66\u00fc\3\2\2\28\u0107\3\2\2\2:\u010f\3\2\2\2<\u0111"+
		"\3\2\2\2>\u0117\3\2\2\2@\u0119\3\2\2\2B\u0142\3\2\2\2D\u0148\3\2\2\2F"+
		"\u014a\3\2\2\2H\u0151\3\2\2\2J\u0157\3\2\2\2L\u016a\3\2\2\2N\u0176\3\2"+
		"\2\2PQ\5\4\3\2Q\3\3\2\2\2RS\b\3\1\2ST\7\3\2\2TU\7,\2\2UV\b\3\1\2VW\7\4"+
		"\2\2WX\5\6\4\2XY\b\3\1\2YZ\7\5\2\2Z\5\3\2\2\2[\\\5\b\5\2\\]\b\4\1\2]^"+
		"\7\6\2\2^_\5\n\6\2_`\b\4\1\2`a\7\7\2\2a\7\3\2\2\2bc\5\16\b\2cd\5\b\5\2"+
		"df\3\2\2\2eb\3\2\2\2ef\3\2\2\2f\t\3\2\2\2gh\5.\30\2hi\5\f\7\2i\13\3\2"+
		"\2\2jk\5.\30\2kl\5\f\7\2ln\3\2\2\2mj\3\2\2\2mn\3\2\2\2n\r\3\2\2\2ot\5"+
		"\20\t\2pt\5\30\r\2qt\5\"\22\2rt\5$\23\2so\3\2\2\2sp\3\2\2\2sq\3\2\2\2"+
		"sr\3\2\2\2t\17\3\2\2\2uv\b\t\1\2vw\7\b\2\2wx\5\22\n\2x\21\3\2\2\2yz\7"+
		",\2\2z{\b\n\1\2{|\7\t\2\2|}\5\26\f\2}~\b\n\1\2~\177\7\4\2\2\177\u0080"+
		"\5\24\13\2\u0080\23\3\2\2\2\u0081\u0082\7,\2\2\u0082\u0083\b\13\1\2\u0083"+
		"\u0084\7\t\2\2\u0084\u0085\5\26\f\2\u0085\u0086\b\13\1\2\u0086\u0087\7"+
		"\4\2\2\u0087\u0088\5\24\13\2\u0088\u008a\3\2\2\2\u0089\u0081\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\25\3\2\2\2\u008b\u008c\t\2\2\2\u008c\27\3\2\2\2\u008d"+
		"\u008e\b\r\1\2\u008e\u008f\7\n\2\2\u008f\u0090\5\32\16\2\u0090\u0091\b"+
		"\r\1\2\u0091\u0092\7\4\2\2\u0092\31\3\2\2\2\u0093\u0094\5\36\20\2\u0094"+
		"\u0095\b\16\1\2\u0095\u0096\7\13\2\2\u0096\u0097\5,\27\2\u0097\u0098\5"+
		"\34\17\2\u0098\33\3\2\2\2\u0099\u009a\b\17\1\2\u009a\u009b\7\4\2\2\u009b"+
		"\u009c\5\36\20\2\u009c\u009d\b\17\1\2\u009d\u009e\7\13\2\2\u009e\u009f"+
		"\5,\27\2\u009f\u00a0\5\34\17\2\u00a0\u00a2\3\2\2\2\u00a1\u0099\3\2\2\2"+
		"\u00a1\u00a2\3\2\2\2\u00a2\35\3\2\2\2\u00a3\u00a4\7,\2\2\u00a4\u00a5\5"+
		" \21\2\u00a5\37\3\2\2\2\u00a6\u00a7\b\21\1\2\u00a7\u00a8\7\f\2\2\u00a8"+
		"\u00aa\5\36\20\2\u00a9\u00a6\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa!\3\2\2"+
		"\2\u00ab\u00ac\b\22\1\2\u00ac\u00ad\7\r\2\2\u00ad\u00ae\7,\2\2\u00ae\u00af"+
		"\5&\24\2\u00af\u00b0\b\22\1\2\u00b0\u00b1\7\4\2\2\u00b1\u00b2\5\6\4\2"+
		"\u00b2\u00b3\b\22\1\2\u00b3\u00b4\7\4\2\2\u00b4#\3\2\2\2\u00b5\u00b6\b"+
		"\23\1\2\u00b6\u00b7\7\16\2\2\u00b7\u00b8\7,\2\2\u00b8\u00b9\5&\24\2\u00b9"+
		"\u00ba\b\23\1\2\u00ba\u00bb\7\13\2\2\u00bb\u00bc\5,\27\2\u00bc\u00bd\b"+
		"\23\1\2\u00bd\u00be\7\4\2\2\u00be\u00bf\5\6\4\2\u00bf\u00c0\b\23\1\2\u00c0"+
		"\u00c1\7\4\2\2\u00c1%\3\2\2\2\u00c2\u00c3\b\24\1\2\u00c3\u00c4\7\17\2"+
		"\2\u00c4\u00c5\5(\25\2\u00c5\u00c6\b\24\1\2\u00c6\u00c7\7\20\2\2\u00c7"+
		"\u00c9\3\2\2\2\u00c8\u00c2\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\'\3\2\2\2"+
		"\u00ca\u00cb\5\36\20\2\u00cb\u00cc\b\25\1\2\u00cc\u00cd\7\13\2\2\u00cd"+
		"\u00ce\5,\27\2\u00ce\u00cf\5*\26\2\u00cf)\3\2\2\2\u00d0\u00d2\5(\25\2"+
		"\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2+\3\2\2\2\u00d3\u00d4\b"+
		"\27\1\2\u00d4\u00d8\7\21\2\2\u00d5\u00d6\b\27\1\2\u00d6\u00d8\7\22\2\2"+
		"\u00d7\u00d3\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8-\3\2\2\2\u00d9\u00da\5"+
		"\60\31\2\u00da\u00db\b\30\1\2\u00db\u00dc\7\4\2\2\u00dc\u00e3\3\2\2\2"+
		"\u00dd\u00de\5@!\2\u00de\u00df\b\30\1\2\u00df\u00e0\7\4\2\2\u00e0\u00e3"+
		"\3\2\2\2\u00e1\u00e3\5B\"\2\u00e2\u00d9\3\2\2\2\u00e2\u00dd\3\2\2\2\u00e2"+
		"\u00e1\3\2\2\2\u00e3/\3\2\2\2\u00e4\u00e5\7,\2\2\u00e5\u00e6\b\31\1\2"+
		"\u00e6\u00e7\7\23\2\2\u00e7\u00e8\5\62\32\2\u00e8\61\3\2\2\2\u00e9\u00ea"+
		"\58\35\2\u00ea\u00eb\5\64\33\2\u00eb\63\3\2\2\2\u00ec\u00ed\5\66\34\2"+
		"\u00ed\u00ee\5\62\32\2\u00ee\u00ef\5\64\33\2\u00ef\u00f1\3\2\2\2\u00f0"+
		"\u00ec\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\65\3\2\2\2\u00f2\u00f3\b\34\1"+
		"\2\u00f3\u00fd\7\24\2\2\u00f4\u00f5\b\34\1\2\u00f5\u00fd\7\25\2\2\u00f6"+
		"\u00f7\b\34\1\2\u00f7\u00fd\7\26\2\2\u00f8\u00f9\b\34\1\2\u00f9\u00fd"+
		"\7\27\2\2\u00fa\u00fb\b\34\1\2\u00fb\u00fd\7\30\2\2\u00fc\u00f2\3\2\2"+
		"\2\u00fc\u00f4\3\2\2\2\u00fc\u00f6\3\2\2\2\u00fc\u00f8\3\2\2\2\u00fc\u00fa"+
		"\3\2\2\2\u00fd\67\3\2\2\2\u00fe\u0108\5\26\f\2\u00ff\u0100\b\35\1\2\u0100"+
		"\u0101\7\17\2\2\u0101\u0102\5\62\32\2\u0102\u0103\b\35\1\2\u0103\u0104"+
		"\7\20\2\2\u0104\u0108\3\2\2\2\u0105\u0106\7,\2\2\u0106\u0108\5:\36\2\u0107"+
		"\u00fe\3\2\2\2\u0107\u00ff\3\2\2\2\u0107\u0105\3\2\2\2\u01089\3\2\2\2"+
		"\u0109\u010a\b\36\1\2\u010a\u010b\7\17\2\2\u010b\u010c\5<\37\2\u010c\u010d"+
		"\b\36\1\2\u010d\u010e\7\20\2\2\u010e\u0110\3\2\2\2\u010f\u0109\3\2\2\2"+
		"\u010f\u0110\3\2\2\2\u0110;\3\2\2\2\u0111\u0112\5\62\32\2\u0112\u0113"+
		"\5> \2\u0113=\3\2\2\2\u0114\u0115\b \1\2\u0115\u0116\7\f\2\2\u0116\u0118"+
		"\5<\37\2\u0117\u0114\3\2\2\2\u0117\u0118\3\2\2\2\u0118?\3\2\2\2\u0119"+
		"\u011a\7,\2\2\u011a\u011b\5:\36\2\u011bA\3\2\2\2\u011c\u011d\b\"\1\2\u011d"+
		"\u011e\7\31\2\2\u011e\u011f\5F$\2\u011f\u0120\b\"\1\2\u0120\u0121\7\32"+
		"\2\2\u0121\u0122\5\6\4\2\u0122\u0123\b\"\1\2\u0123\u0124\7\33\2\2\u0124"+
		"\u0125\5\6\4\2\u0125\u0143\3\2\2\2\u0126\u0127\b\"\1\2\u0127\u0128\7\34"+
		"\2\2\u0128\u0129\5F$\2\u0129\u012a\b\"\1\2\u012a\u012b\7\35\2\2\u012b"+
		"\u012c\5\6\4\2\u012c\u0143\3\2\2\2\u012d\u012e\b\"\1\2\u012e\u012f\7\36"+
		"\2\2\u012f\u0130\5\6\4\2\u0130\u0131\b\"\1\2\u0131\u0132\7\37\2\2\u0132"+
		"\u0133\5F$\2\u0133\u0134\b\"\1\2\u0134\u0135\7\4\2\2\u0135\u0143\3\2\2"+
		"\2\u0136\u0137\b\"\1\2\u0137\u0138\7 \2\2\u0138\u0139\7,\2\2\u0139\u013a"+
		"\b\"\1\2\u013a\u013b\7\23\2\2\u013b\u013c\5\62\32\2\u013c\u013d\5D#\2"+
		"\u013d\u013e\5\62\32\2\u013e\u013f\b\"\1\2\u013f\u0140\7\35\2\2\u0140"+
		"\u0141\5\6\4\2\u0141\u0143\3\2\2\2\u0142\u011c\3\2\2\2\u0142\u0126\3\2"+
		"\2\2\u0142\u012d\3\2\2\2\u0142\u0136\3\2\2\2\u0143C\3\2\2\2\u0144\u0145"+
		"\b#\1\2\u0145\u0149\7!\2\2\u0146\u0147\b#\1\2\u0147\u0149\7\"\2\2\u0148"+
		"\u0144\3\2\2\2\u0148\u0146\3\2\2\2\u0149E\3\2\2\2\u014a\u014b\5L\'\2\u014b"+
		"\u014c\5H%\2\u014cG\3\2\2\2\u014d\u014e\5J&\2\u014e\u014f\5F$\2\u014f"+
		"\u0150\5H%\2\u0150\u0152\3\2\2\2\u0151\u014d\3\2\2\2\u0151\u0152\3\2\2"+
		"\2\u0152I\3\2\2\2\u0153\u0154\b&\1\2\u0154\u0158\7#\2\2\u0155\u0156\b"+
		"&\1\2\u0156\u0158\7$\2\2\u0157\u0153\3\2\2\2\u0157\u0155\3\2\2\2\u0158"+
		"K\3\2\2\2\u0159\u015a\5\62\32\2\u015a\u015b\5N(\2\u015b\u015c\5\62\32"+
		"\2\u015c\u016b\3\2\2\2\u015d\u015e\b\'\1\2\u015e\u015f\7\17\2\2\u015f"+
		"\u0160\5F$\2\u0160\u0161\b\'\1\2\u0161\u0162\7\20\2\2\u0162\u016b\3\2"+
		"\2\2\u0163\u0164\b\'\1\2\u0164\u0165\7%\2\2\u0165\u016b\5L\'\2\u0166\u0167"+
		"\b\'\1\2\u0167\u016b\7&\2\2\u0168\u0169\b\'\1\2\u0169\u016b\7\'\2\2\u016a"+
		"\u0159\3\2\2\2\u016a\u015d\3\2\2\2\u016a\u0163\3\2\2\2\u016a\u0166\3\2"+
		"\2\2\u016a\u0168\3\2\2\2\u016bM\3\2\2\2\u016c\u016d\b(\1\2\u016d\u0177"+
		"\7(\2\2\u016e\u016f\b(\1\2\u016f\u0177\7)\2\2\u0170\u0171\b(\1\2\u0171"+
		"\u0177\7*\2\2\u0172\u0173\b(\1\2\u0173\u0177\7+\2\2\u0174\u0175\b(\1\2"+
		"\u0175\u0177\7\t\2\2\u0176\u016c\3\2\2\2\u0176\u016e\3\2\2\2\u0176\u0170"+
		"\3\2\2\2\u0176\u0172\3\2\2\2\u0176\u0174\3\2\2\2\u0177O\3\2\2\2\27ems"+
		"\u0089\u00a1\u00a9\u00c8\u00d1\u00d7\u00e2\u00f0\u00fc\u0107\u010f\u0117"+
		"\u0142\u0148\u0151\u0157\u016a\u0176";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}