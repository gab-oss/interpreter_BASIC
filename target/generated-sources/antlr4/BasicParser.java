// Generated from Basic.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BasicParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, END=2, INT_FUN=3, STRING_FUN=4, RETURN=5, SUB=6, FOR=7, NEXT=8, 
		TO=9, IF=10, THEN=11, ELSIF=12, ELSE=13, ENDIF=14, LET=15, DIM=16, READ=17, 
		PRINT=18, LEN=19, GOTO=20, GOSUB=21, LOG_OPERATOR=22, COMP_OPERATOR=23, 
		ADD_OPERATOR=24, MINUS=25, MULTI_OPERATOR=26, ASSIGN=27, SEMICOLON=28, 
		NUMBER_SIGN=29, DOLLAR=30, LEFT_PARENTHESES=31, RIGHT_PARENTHESES=32, 
		COMMA=33, LEFT_BRACKET=34, RIGHT_BRACKET=35, STRING=36, STRING_ID=37, 
		ID=38, NUMBER=39, NL=40, WH=41, COMMENT=42;
	public static final int
		RULE_program = 0, RULE_intFunction = 1, RULE_stringFunction = 2, RULE_procedure = 3, 
		RULE_r_for = 4, RULE_r_if = 5, RULE_intReturn = 6, RULE_stringReturn = 7, 
		RULE_r_instructions = 8, RULE_r_instruction = 9, RULE_condition = 10, 
		RULE_comp = 11, RULE_artmExpr = 12, RULE_additiveExpr = 13, RULE_multExpression = 14, 
		RULE_term = 15, RULE_intDefinition = 16, RULE_stringDeclaration = 17, 
		RULE_intAssignment = 18, RULE_stringAssignment = 19, RULE_len = 20, RULE_print = 21, 
		RULE_read = 22, RULE_funCall = 23, RULE_arg = 24, RULE_stringArg = 25, 
		RULE_substring = 26;
	public static final String[] ruleNames = {
		"program", "intFunction", "stringFunction", "procedure", "r_for", "r_if", 
		"intReturn", "stringReturn", "r_instructions", "r_instruction", "condition", 
		"comp", "artmExpr", "additiveExpr", "multExpression", "term", "intDefinition", 
		"stringDeclaration", "intAssignment", "stringAssignment", "len", "print", 
		"read", "funCall", "arg", "stringArg", "substring"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'BEGIN'", "'END'", "'FUNCTION'", "'FUNCTION$'", "'RETURN'", "'SUB'", 
		"'FOR'", "'NEXT'", "'TO'", "'IF'", "'THEN'", "'ELSIF'", "'ELSE'", "'ENDIF'", 
		"'LET'", "'DIM'", "'READ'", null, "'LEN'", "'GOTO'", "'GOSUB'", null, 
		null, null, "'-'", null, "'='", "';'", "'#'", "'$'", "'('", "')'", "','", 
		"'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGIN", "END", "INT_FUN", "STRING_FUN", "RETURN", "SUB", "FOR", 
		"NEXT", "TO", "IF", "THEN", "ELSIF", "ELSE", "ENDIF", "LET", "DIM", "READ", 
		"PRINT", "LEN", "GOTO", "GOSUB", "LOG_OPERATOR", "COMP_OPERATOR", "ADD_OPERATOR", 
		"MINUS", "MULTI_OPERATOR", "ASSIGN", "SEMICOLON", "NUMBER_SIGN", "DOLLAR", 
		"LEFT_PARENTHESES", "RIGHT_PARENTHESES", "COMMA", "LEFT_BRACKET", "RIGHT_BRACKET", 
		"STRING", "STRING_ID", "ID", "NUMBER", "NL", "WH", "COMMENT"
	};
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
	public String getGrammarFileName() { return "Basic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BasicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(BasicParser.BEGIN, 0); }
		public List<TerminalNode> NL() { return getTokens(BasicParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(BasicParser.NL, i);
		}
		public R_instructionsContext r_instructions() {
			return getRuleContext(R_instructionsContext.class,0);
		}
		public TerminalNode END() { return getToken(BasicParser.END, 0); }
		public List<StringFunctionContext> stringFunction() {
			return getRuleContexts(StringFunctionContext.class);
		}
		public StringFunctionContext stringFunction(int i) {
			return getRuleContext(StringFunctionContext.class,i);
		}
		public List<IntFunctionContext> intFunction() {
			return getRuleContexts(IntFunctionContext.class);
		}
		public IntFunctionContext intFunction(int i) {
			return getRuleContext(IntFunctionContext.class,i);
		}
		public List<ProcedureContext> procedure() {
			return getRuleContexts(ProcedureContext.class);
		}
		public ProcedureContext procedure(int i) {
			return getRuleContext(ProcedureContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_FUN) | (1L << STRING_FUN) | (1L << SUB))) != 0)) {
				{
				setState(57);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING_FUN:
					{
					setState(54);
					stringFunction();
					}
					break;
				case INT_FUN:
					{
					setState(55);
					intFunction();
					}
					break;
				case SUB:
					{
					setState(56);
					procedure();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(BEGIN);
			setState(63);
			match(NL);
			setState(64);
			r_instructions();
			setState(65);
			match(END);
			setState(66);
			match(NL);
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

	public static class IntFunctionContext extends ParserRuleContext {
		public TerminalNode INT_FUN() { return getToken(BasicParser.INT_FUN, 0); }
		public List<TerminalNode> ID() { return getTokens(BasicParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BasicParser.ID, i);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(BasicParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(BasicParser.RIGHT_BRACKET, 0); }
		public List<TerminalNode> NL() { return getTokens(BasicParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(BasicParser.NL, i);
		}
		public R_instructionsContext r_instructions() {
			return getRuleContext(R_instructionsContext.class,0);
		}
		public IntReturnContext intReturn() {
			return getRuleContext(IntReturnContext.class,0);
		}
		public List<TerminalNode> STRING_ID() { return getTokens(BasicParser.STRING_ID); }
		public TerminalNode STRING_ID(int i) {
			return getToken(BasicParser.STRING_ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public IntFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterIntFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitIntFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitIntFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntFunctionContext intFunction() throws RecognitionException {
		IntFunctionContext _localctx = new IntFunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_intFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(INT_FUN);
			setState(69);
			match(ID);
			setState(70);
			match(LEFT_BRACKET);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_ID || _la==ID) {
				{
				setState(71);
				_la = _input.LA(1);
				if ( !(_la==STRING_ID || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(72);
					match(COMMA);
					setState(73);
					_la = _input.LA(1);
					if ( !(_la==STRING_ID || _la==ID) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(81);
			match(RIGHT_BRACKET);
			setState(82);
			match(NL);
			setState(83);
			r_instructions();
			setState(84);
			intReturn();
			setState(85);
			match(NL);
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

	public static class StringFunctionContext extends ParserRuleContext {
		public TerminalNode STRING_FUN() { return getToken(BasicParser.STRING_FUN, 0); }
		public List<TerminalNode> ID() { return getTokens(BasicParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BasicParser.ID, i);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(BasicParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(BasicParser.RIGHT_BRACKET, 0); }
		public List<TerminalNode> NL() { return getTokens(BasicParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(BasicParser.NL, i);
		}
		public R_instructionsContext r_instructions() {
			return getRuleContext(R_instructionsContext.class,0);
		}
		public StringReturnContext stringReturn() {
			return getRuleContext(StringReturnContext.class,0);
		}
		public List<TerminalNode> STRING_ID() { return getTokens(BasicParser.STRING_ID); }
		public TerminalNode STRING_ID(int i) {
			return getToken(BasicParser.STRING_ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public StringFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterStringFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitStringFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitStringFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringFunctionContext stringFunction() throws RecognitionException {
		StringFunctionContext _localctx = new StringFunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stringFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(STRING_FUN);
			setState(88);
			match(ID);
			setState(89);
			match(LEFT_BRACKET);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_ID || _la==ID) {
				{
				setState(90);
				_la = _input.LA(1);
				if ( !(_la==STRING_ID || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(91);
					match(COMMA);
					setState(92);
					_la = _input.LA(1);
					if ( !(_la==STRING_ID || _la==ID) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(100);
			match(RIGHT_BRACKET);
			setState(101);
			match(NL);
			setState(102);
			r_instructions();
			setState(103);
			stringReturn();
			setState(104);
			match(NL);
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

	public static class ProcedureContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(BasicParser.SUB, 0); }
		public List<TerminalNode> ID() { return getTokens(BasicParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BasicParser.ID, i);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(BasicParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(BasicParser.RIGHT_BRACKET, 0); }
		public List<TerminalNode> NL() { return getTokens(BasicParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(BasicParser.NL, i);
		}
		public R_instructionsContext r_instructions() {
			return getRuleContext(R_instructionsContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(BasicParser.RETURN, 0); }
		public List<TerminalNode> STRING_ID() { return getTokens(BasicParser.STRING_ID); }
		public TerminalNode STRING_ID(int i) {
			return getToken(BasicParser.STRING_ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_procedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(SUB);
			setState(107);
			match(ID);
			setState(108);
			match(LEFT_BRACKET);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_ID || _la==ID) {
				{
				setState(109);
				_la = _input.LA(1);
				if ( !(_la==STRING_ID || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(110);
					match(COMMA);
					setState(111);
					_la = _input.LA(1);
					if ( !(_la==STRING_ID || _la==ID) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(119);
			match(RIGHT_BRACKET);
			setState(120);
			match(NL);
			setState(121);
			r_instructions();
			setState(122);
			match(RETURN);
			setState(123);
			match(NL);
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

	public static class R_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(BasicParser.FOR, 0); }
		public IntAssignmentContext intAssignment() {
			return getRuleContext(IntAssignmentContext.class,0);
		}
		public TerminalNode TO() { return getToken(BasicParser.TO, 0); }
		public ArtmExprContext artmExpr() {
			return getRuleContext(ArtmExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(BasicParser.NL, 0); }
		public R_instructionsContext r_instructions() {
			return getRuleContext(R_instructionsContext.class,0);
		}
		public TerminalNode NEXT() { return getToken(BasicParser.NEXT, 0); }
		public TerminalNode ID() { return getToken(BasicParser.ID, 0); }
		public R_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterR_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitR_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitR_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_forContext r_for() throws RecognitionException {
		R_forContext _localctx = new R_forContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_r_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(FOR);
			setState(126);
			intAssignment();
			setState(127);
			match(TO);
			setState(128);
			artmExpr();
			setState(129);
			match(NL);
			setState(130);
			r_instructions();
			setState(131);
			match(NEXT);
			setState(132);
			match(ID);
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

	public static class R_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(BasicParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(BasicParser.THEN, 0); }
		public TerminalNode NL() { return getToken(BasicParser.NL, 0); }
		public R_instructionsContext r_instructions() {
			return getRuleContext(R_instructionsContext.class,0);
		}
		public TerminalNode ENDIF() { return getToken(BasicParser.ENDIF, 0); }
		public R_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterR_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitR_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitR_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_ifContext r_if() throws RecognitionException {
		R_ifContext _localctx = new R_ifContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_r_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(IF);
			setState(135);
			condition();
			setState(136);
			match(THEN);
			setState(137);
			match(NL);
			setState(138);
			r_instructions();
			setState(139);
			match(ENDIF);
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

	public static class IntReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(BasicParser.RETURN, 0); }
		public ArtmExprContext artmExpr() {
			return getRuleContext(ArtmExprContext.class,0);
		}
		public IntReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterIntReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitIntReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitIntReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntReturnContext intReturn() throws RecognitionException {
		IntReturnContext _localctx = new IntReturnContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_intReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(RETURN);
			setState(142);
			artmExpr();
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

	public static class StringReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(BasicParser.RETURN, 0); }
		public StringArgContext stringArg() {
			return getRuleContext(StringArgContext.class,0);
		}
		public FunCallContext funCall() {
			return getRuleContext(FunCallContext.class,0);
		}
		public StringReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterStringReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitStringReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitStringReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringReturnContext stringReturn() throws RecognitionException {
		StringReturnContext _localctx = new StringReturnContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stringReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(RETURN);
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case STRING_ID:
				{
				setState(145);
				stringArg();
				}
				break;
			case ID:
				{
				setState(146);
				funCall();
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

	public static class R_instructionsContext extends ParserRuleContext {
		public List<R_instructionContext> r_instruction() {
			return getRuleContexts(R_instructionContext.class);
		}
		public R_instructionContext r_instruction(int i) {
			return getRuleContext(R_instructionContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(BasicParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(BasicParser.NL, i);
		}
		public R_instructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterR_instructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitR_instructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitR_instructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_instructionsContext r_instructions() throws RecognitionException {
		R_instructionsContext _localctx = new R_instructionsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_r_instructions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(149);
				r_instruction();
				setState(150);
				match(NL);
				}
				}
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IF) | (1L << LET) | (1L << DIM) | (1L << READ) | (1L << PRINT) | (1L << STRING_ID) | (1L << ID))) != 0) );
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

	public static class R_instructionContext extends ParserRuleContext {
		public IntDefinitionContext intDefinition() {
			return getRuleContext(IntDefinitionContext.class,0);
		}
		public StringDeclarationContext stringDeclaration() {
			return getRuleContext(StringDeclarationContext.class,0);
		}
		public IntAssignmentContext intAssignment() {
			return getRuleContext(IntAssignmentContext.class,0);
		}
		public StringAssignmentContext stringAssignment() {
			return getRuleContext(StringAssignmentContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public FunCallContext funCall() {
			return getRuleContext(FunCallContext.class,0);
		}
		public R_ifContext r_if() {
			return getRuleContext(R_ifContext.class,0);
		}
		public R_forContext r_for() {
			return getRuleContext(R_forContext.class,0);
		}
		public R_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterR_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitR_instruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitR_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_instructionContext r_instruction() throws RecognitionException {
		R_instructionContext _localctx = new R_instructionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_r_instruction);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				intDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				stringDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				intAssignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				stringAssignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(160);
				print();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(161);
				read();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(162);
				funCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(163);
				r_if();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(164);
				r_for();
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

	public static class ConditionContext extends ParserRuleContext {
		public List<CompContext> comp() {
			return getRuleContexts(CompContext.class);
		}
		public CompContext comp(int i) {
			return getRuleContext(CompContext.class,i);
		}
		public List<TerminalNode> LOG_OPERATOR() { return getTokens(BasicParser.LOG_OPERATOR); }
		public TerminalNode LOG_OPERATOR(int i) {
			return getToken(BasicParser.LOG_OPERATOR, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			comp();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOG_OPERATOR) {
				{
				{
				setState(168);
				match(LOG_OPERATOR);
				setState(169);
				comp();
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class CompContext extends ParserRuleContext {
		public List<ArtmExprContext> artmExpr() {
			return getRuleContexts(ArtmExprContext.class);
		}
		public ArtmExprContext artmExpr(int i) {
			return getRuleContext(ArtmExprContext.class,i);
		}
		public List<TerminalNode> COMP_OPERATOR() { return getTokens(BasicParser.COMP_OPERATOR); }
		public TerminalNode COMP_OPERATOR(int i) {
			return getToken(BasicParser.COMP_OPERATOR, i);
		}
		public TerminalNode LEFT_PARENTHESES() { return getToken(BasicParser.LEFT_PARENTHESES, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESES() { return getToken(BasicParser.RIGHT_PARENTHESES, 0); }
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comp);
		int _la;
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				artmExpr();
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMP_OPERATOR) {
					{
					{
					setState(176);
					match(COMP_OPERATOR);
					setState(177);
					artmExpr();
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(183);
				match(LEFT_PARENTHESES);
				setState(184);
				condition();
				setState(185);
				match(RIGHT_PARENTHESES);
				}
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

	public static class ArtmExprContext extends ParserRuleContext {
		public List<AdditiveExprContext> additiveExpr() {
			return getRuleContexts(AdditiveExprContext.class);
		}
		public AdditiveExprContext additiveExpr(int i) {
			return getRuleContext(AdditiveExprContext.class,i);
		}
		public List<TerminalNode> ADD_OPERATOR() { return getTokens(BasicParser.ADD_OPERATOR); }
		public TerminalNode ADD_OPERATOR(int i) {
			return getToken(BasicParser.ADD_OPERATOR, i);
		}
		public ArtmExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_artmExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterArtmExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitArtmExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitArtmExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArtmExprContext artmExpr() throws RecognitionException {
		ArtmExprContext _localctx = new ArtmExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_artmExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			additiveExpr();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD_OPERATOR) {
				{
				{
				setState(190);
				match(ADD_OPERATOR);
				setState(191);
				additiveExpr();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class AdditiveExprContext extends ParserRuleContext {
		public List<MultExpressionContext> multExpression() {
			return getRuleContexts(MultExpressionContext.class);
		}
		public MultExpressionContext multExpression(int i) {
			return getRuleContext(MultExpressionContext.class,i);
		}
		public List<TerminalNode> MULTI_OPERATOR() { return getTokens(BasicParser.MULTI_OPERATOR); }
		public TerminalNode MULTI_OPERATOR(int i) {
			return getToken(BasicParser.MULTI_OPERATOR, i);
		}
		public AdditiveExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitAdditiveExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExprContext additiveExpr() throws RecognitionException {
		AdditiveExprContext _localctx = new AdditiveExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_additiveExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			multExpression();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTI_OPERATOR) {
				{
				{
				setState(198);
				match(MULTI_OPERATOR);
				setState(199);
				multExpression();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class MultExpressionContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public MultExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterMultExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitMultExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitMultExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultExpressionContext multExpression() throws RecognitionException {
		MultExpressionContext _localctx = new MultExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_multExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(205);
				match(MINUS);
				}
			}

			setState(208);
			term();
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

	public static class TermContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(BasicParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(BasicParser.ID, 0); }
		public FunCallContext funCall() {
			return getRuleContext(FunCallContext.class,0);
		}
		public LenContext len() {
			return getRuleContext(LenContext.class,0);
		}
		public TerminalNode LEFT_PARENTHESES() { return getToken(BasicParser.LEFT_PARENTHESES, 0); }
		public ArtmExprContext artmExpr() {
			return getRuleContext(ArtmExprContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESES() { return getToken(BasicParser.RIGHT_PARENTHESES, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_term);
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				funCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				len();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(214);
				match(LEFT_PARENTHESES);
				setState(215);
				artmExpr();
				setState(216);
				match(RIGHT_PARENTHESES);
				}
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

	public static class IntDefinitionContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(BasicParser.LET, 0); }
		public List<IntAssignmentContext> intAssignment() {
			return getRuleContexts(IntAssignmentContext.class);
		}
		public IntAssignmentContext intAssignment(int i) {
			return getRuleContext(IntAssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public IntDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterIntDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitIntDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitIntDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntDefinitionContext intDefinition() throws RecognitionException {
		IntDefinitionContext _localctx = new IntDefinitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_intDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(LET);
			setState(221);
			intAssignment();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(222);
				match(COMMA);
				setState(223);
				intAssignment();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class StringDeclarationContext extends ParserRuleContext {
		public TerminalNode DIM() { return getToken(BasicParser.DIM, 0); }
		public List<TerminalNode> STRING_ID() { return getTokens(BasicParser.STRING_ID); }
		public TerminalNode STRING_ID(int i) {
			return getToken(BasicParser.STRING_ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public StringDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterStringDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitStringDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitStringDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringDeclarationContext stringDeclaration() throws RecognitionException {
		StringDeclarationContext _localctx = new StringDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_stringDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(DIM);
			setState(230);
			match(STRING_ID);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(231);
				match(COMMA);
				setState(232);
				match(STRING_ID);
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class IntAssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BasicParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(BasicParser.ASSIGN, 0); }
		public ArtmExprContext artmExpr() {
			return getRuleContext(ArtmExprContext.class,0);
		}
		public IntAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterIntAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitIntAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitIntAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntAssignmentContext intAssignment() throws RecognitionException {
		IntAssignmentContext _localctx = new IntAssignmentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_intAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(ID);
			setState(239);
			match(ASSIGN);
			setState(240);
			artmExpr();
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

	public static class StringAssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(BasicParser.ASSIGN, 0); }
		public TerminalNode STRING_ID() { return getToken(BasicParser.STRING_ID, 0); }
		public SubstringContext substring() {
			return getRuleContext(SubstringContext.class,0);
		}
		public StringArgContext stringArg() {
			return getRuleContext(StringArgContext.class,0);
		}
		public FunCallContext funCall() {
			return getRuleContext(FunCallContext.class,0);
		}
		public StringAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterStringAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitStringAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitStringAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringAssignmentContext stringAssignment() throws RecognitionException {
		StringAssignmentContext _localctx = new StringAssignmentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_stringAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(242);
				match(STRING_ID);
				}
				break;
			case 2:
				{
				setState(243);
				substring();
				}
				break;
			}
			setState(246);
			match(ASSIGN);
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case STRING_ID:
				{
				setState(247);
				stringArg();
				}
				break;
			case ID:
				{
				setState(248);
				funCall();
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

	public static class LenContext extends ParserRuleContext {
		public TerminalNode LEN() { return getToken(BasicParser.LEN, 0); }
		public TerminalNode LEFT_PARENTHESES() { return getToken(BasicParser.LEFT_PARENTHESES, 0); }
		public TerminalNode RIGHT_PARENTHESES() { return getToken(BasicParser.RIGHT_PARENTHESES, 0); }
		public StringArgContext stringArg() {
			return getRuleContext(StringArgContext.class,0);
		}
		public FunCallContext funCall() {
			return getRuleContext(FunCallContext.class,0);
		}
		public LenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_len; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterLen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitLen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitLen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LenContext len() throws RecognitionException {
		LenContext _localctx = new LenContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(LEN);
			setState(252);
			match(LEFT_PARENTHESES);
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case STRING_ID:
				{
				setState(253);
				stringArg();
				}
				break;
			case ID:
				{
				setState(254);
				funCall();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(257);
			match(RIGHT_PARENTHESES);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(BasicParser.PRINT, 0); }
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(BasicParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(BasicParser.SEMICOLON, i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_print);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(PRINT);
			setState(260);
			arg();
			setState(265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(261);
					match(SEMICOLON);
					setState(262);
					arg();
					}
					} 
				}
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(268);
				match(SEMICOLON);
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(BasicParser.READ, 0); }
		public List<TerminalNode> STRING_ID() { return getTokens(BasicParser.STRING_ID); }
		public TerminalNode STRING_ID(int i) {
			return getToken(BasicParser.STRING_ID, i);
		}
		public List<TerminalNode> ID() { return getTokens(BasicParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BasicParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_read);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(READ);
			setState(272);
			_la = _input.LA(1);
			if ( !(_la==STRING_ID || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(273);
				match(COMMA);
				setState(274);
				_la = _input.LA(1);
				if ( !(_la==STRING_ID || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FunCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BasicParser.ID, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(BasicParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(BasicParser.RIGHT_BRACKET, 0); }
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public FunCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterFunCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitFunCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitFunCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunCallContext funCall() throws RecognitionException {
		FunCallContext _localctx = new FunCallContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_funCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(ID);
			setState(281);
			match(LEFT_BRACKET);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEN) | (1L << MINUS) | (1L << LEFT_PARENTHESES) | (1L << STRING) | (1L << STRING_ID) | (1L << ID) | (1L << NUMBER))) != 0)) {
				{
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(282);
						arg();
						setState(283);
						match(COMMA);
						}
						} 
					}
					setState(289);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				setState(290);
				arg();
				}
			}

			setState(293);
			match(RIGHT_BRACKET);
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

	public static class ArgContext extends ParserRuleContext {
		public ArtmExprContext artmExpr() {
			return getRuleContext(ArtmExprContext.class,0);
		}
		public StringArgContext stringArg() {
			return getRuleContext(StringArgContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arg);
		try {
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEN:
			case MINUS:
			case LEFT_PARENTHESES:
			case ID:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				artmExpr();
				}
				break;
			case STRING:
			case STRING_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				stringArg();
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

	public static class StringArgContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(BasicParser.STRING, 0); }
		public TerminalNode STRING_ID() { return getToken(BasicParser.STRING_ID, 0); }
		public SubstringContext substring() {
			return getRuleContext(SubstringContext.class,0);
		}
		public StringArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterStringArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitStringArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitStringArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringArgContext stringArg() throws RecognitionException {
		StringArgContext _localctx = new StringArgContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_stringArg);
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(STRING_ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
				substring();
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

	public static class SubstringContext extends ParserRuleContext {
		public TerminalNode STRING_ID() { return getToken(BasicParser.STRING_ID, 0); }
		public TerminalNode LEFT_PARENTHESES() { return getToken(BasicParser.LEFT_PARENTHESES, 0); }
		public ArtmExprContext artmExpr() {
			return getRuleContext(ArtmExprContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESES() { return getToken(BasicParser.RIGHT_PARENTHESES, 0); }
		public SubstringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterSubstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitSubstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitSubstring(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubstringContext substring() throws RecognitionException {
		SubstringContext _localctx = new SubstringContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_substring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(STRING_ID);
			setState(305);
			match(LEFT_PARENTHESES);
			setState(306);
			artmExpr();
			setState(307);
			match(RIGHT_PARENTHESES);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0138\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3M\n\3\f\3\16\3P\13\3\5"+
		"\3R\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4`\n\4\f\4\16"+
		"\4c\13\4\5\4e\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5"+
		"s\n\5\f\5\16\5v\13\5\5\5x\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\5\t\u0096\n\t\3\n\3\n\3\n\6\n\u009b\n\n\r\n\16\n\u009c\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a8\n\13\3\f\3\f\3\f\7\f\u00ad"+
		"\n\f\f\f\16\f\u00b0\13\f\3\r\3\r\3\r\7\r\u00b5\n\r\f\r\16\r\u00b8\13\r"+
		"\3\r\3\r\3\r\3\r\5\r\u00be\n\r\3\16\3\16\3\16\7\16\u00c3\n\16\f\16\16"+
		"\16\u00c6\13\16\3\17\3\17\3\17\7\17\u00cb\n\17\f\17\16\17\u00ce\13\17"+
		"\3\20\5\20\u00d1\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00dd\n\21\3\22\3\22\3\22\3\22\7\22\u00e3\n\22\f\22\16\22\u00e6"+
		"\13\22\3\23\3\23\3\23\3\23\7\23\u00ec\n\23\f\23\16\23\u00ef\13\23\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\5\25\u00f7\n\25\3\25\3\25\3\25\5\25\u00fc\n"+
		"\25\3\26\3\26\3\26\3\26\5\26\u0102\n\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\7\27\u010a\n\27\f\27\16\27\u010d\13\27\3\27\5\27\u0110\n\27\3\30\3\30"+
		"\3\30\3\30\7\30\u0116\n\30\f\30\16\30\u0119\13\30\3\31\3\31\3\31\3\31"+
		"\3\31\7\31\u0120\n\31\f\31\16\31\u0123\13\31\3\31\5\31\u0126\n\31\3\31"+
		"\3\31\3\32\3\32\5\32\u012c\n\32\3\33\3\33\3\33\5\33\u0131\n\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\66\2\3\3\2\'(\2\u0146\2=\3\2\2\2\4F\3\2\2\2\6Y\3\2"+
		"\2\2\bl\3\2\2\2\n\177\3\2\2\2\f\u0088\3\2\2\2\16\u008f\3\2\2\2\20\u0092"+
		"\3\2\2\2\22\u009a\3\2\2\2\24\u00a7\3\2\2\2\26\u00a9\3\2\2\2\30\u00bd\3"+
		"\2\2\2\32\u00bf\3\2\2\2\34\u00c7\3\2\2\2\36\u00d0\3\2\2\2 \u00dc\3\2\2"+
		"\2\"\u00de\3\2\2\2$\u00e7\3\2\2\2&\u00f0\3\2\2\2(\u00f6\3\2\2\2*\u00fd"+
		"\3\2\2\2,\u0105\3\2\2\2.\u0111\3\2\2\2\60\u011a\3\2\2\2\62\u012b\3\2\2"+
		"\2\64\u0130\3\2\2\2\66\u0132\3\2\2\28<\5\6\4\29<\5\4\3\2:<\5\b\5\2;8\3"+
		"\2\2\2;9\3\2\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3"+
		"\2\2\2@A\7\3\2\2AB\7*\2\2BC\5\22\n\2CD\7\4\2\2DE\7*\2\2E\3\3\2\2\2FG\7"+
		"\5\2\2GH\7(\2\2HQ\7$\2\2IN\t\2\2\2JK\7#\2\2KM\t\2\2\2LJ\3\2\2\2MP\3\2"+
		"\2\2NL\3\2\2\2NO\3\2\2\2OR\3\2\2\2PN\3\2\2\2QI\3\2\2\2QR\3\2\2\2RS\3\2"+
		"\2\2ST\7%\2\2TU\7*\2\2UV\5\22\n\2VW\5\16\b\2WX\7*\2\2X\5\3\2\2\2YZ\7\6"+
		"\2\2Z[\7(\2\2[d\7$\2\2\\a\t\2\2\2]^\7#\2\2^`\t\2\2\2_]\3\2\2\2`c\3\2\2"+
		"\2a_\3\2\2\2ab\3\2\2\2be\3\2\2\2ca\3\2\2\2d\\\3\2\2\2de\3\2\2\2ef\3\2"+
		"\2\2fg\7%\2\2gh\7*\2\2hi\5\22\n\2ij\5\20\t\2jk\7*\2\2k\7\3\2\2\2lm\7\b"+
		"\2\2mn\7(\2\2nw\7$\2\2ot\t\2\2\2pq\7#\2\2qs\t\2\2\2rp\3\2\2\2sv\3\2\2"+
		"\2tr\3\2\2\2tu\3\2\2\2ux\3\2\2\2vt\3\2\2\2wo\3\2\2\2wx\3\2\2\2xy\3\2\2"+
		"\2yz\7%\2\2z{\7*\2\2{|\5\22\n\2|}\7\7\2\2}~\7*\2\2~\t\3\2\2\2\177\u0080"+
		"\7\t\2\2\u0080\u0081\5&\24\2\u0081\u0082\7\13\2\2\u0082\u0083\5\32\16"+
		"\2\u0083\u0084\7*\2\2\u0084\u0085\5\22\n\2\u0085\u0086\7\n\2\2\u0086\u0087"+
		"\7(\2\2\u0087\13\3\2\2\2\u0088\u0089\7\f\2\2\u0089\u008a\5\26\f\2\u008a"+
		"\u008b\7\r\2\2\u008b\u008c\7*\2\2\u008c\u008d\5\22\n\2\u008d\u008e\7\20"+
		"\2\2\u008e\r\3\2\2\2\u008f\u0090\7\7\2\2\u0090\u0091\5\32\16\2\u0091\17"+
		"\3\2\2\2\u0092\u0095\7\7\2\2\u0093\u0096\5\64\33\2\u0094\u0096\5\60\31"+
		"\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\21\3\2\2\2\u0097\u0098"+
		"\5\24\13\2\u0098\u0099\7*\2\2\u0099\u009b\3\2\2\2\u009a\u0097\3\2\2\2"+
		"\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\23"+
		"\3\2\2\2\u009e\u00a8\5\"\22\2\u009f\u00a8\5$\23\2\u00a0\u00a8\5&\24\2"+
		"\u00a1\u00a8\5(\25\2\u00a2\u00a8\5,\27\2\u00a3\u00a8\5.\30\2\u00a4\u00a8"+
		"\5\60\31\2\u00a5\u00a8\5\f\7\2\u00a6\u00a8\5\n\6\2\u00a7\u009e\3\2\2\2"+
		"\u00a7\u009f\3\2\2\2\u00a7\u00a0\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a2"+
		"\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\25\3\2\2\2\u00a9\u00ae\5\30\r\2\u00aa\u00ab\7\30"+
		"\2\2\u00ab\u00ad\5\30\r\2\u00ac\u00aa\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\27\3\2\2\2\u00b0\u00ae\3\2\2"+
		"\2\u00b1\u00b6\5\32\16\2\u00b2\u00b3\7\31\2\2\u00b3\u00b5\5\32\16\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00be\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\7!\2\2\u00ba"+
		"\u00bb\5\26\f\2\u00bb\u00bc\7\"\2\2\u00bc\u00be\3\2\2\2\u00bd\u00b1\3"+
		"\2\2\2\u00bd\u00b9\3\2\2\2\u00be\31\3\2\2\2\u00bf\u00c4\5\34\17\2\u00c0"+
		"\u00c1\7\32\2\2\u00c1\u00c3\5\34\17\2\u00c2\u00c0\3\2\2\2\u00c3\u00c6"+
		"\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\33\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c7\u00cc\5\36\20\2\u00c8\u00c9\7\34\2\2\u00c9\u00cb"+
		"\5\36\20\2\u00ca\u00c8\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2"+
		"\u00cc\u00cd\3\2\2\2\u00cd\35\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d1"+
		"\7\33\2\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2"+
		"\u00d2\u00d3\5 \21\2\u00d3\37\3\2\2\2\u00d4\u00dd\7)\2\2\u00d5\u00dd\7"+
		"(\2\2\u00d6\u00dd\5\60\31\2\u00d7\u00dd\5*\26\2\u00d8\u00d9\7!\2\2\u00d9"+
		"\u00da\5\32\16\2\u00da\u00db\7\"\2\2\u00db\u00dd\3\2\2\2\u00dc\u00d4\3"+
		"\2\2\2\u00dc\u00d5\3\2\2\2\u00dc\u00d6\3\2\2\2\u00dc\u00d7\3\2\2\2\u00dc"+
		"\u00d8\3\2\2\2\u00dd!\3\2\2\2\u00de\u00df\7\21\2\2\u00df\u00e4\5&\24\2"+
		"\u00e0\u00e1\7#\2\2\u00e1\u00e3\5&\24\2\u00e2\u00e0\3\2\2\2\u00e3\u00e6"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5#\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e7\u00e8\7\22\2\2\u00e8\u00ed\7\'\2\2\u00e9\u00ea\7"+
		"#\2\2\u00ea\u00ec\7\'\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee%\3\2\2\2\u00ef\u00ed\3\2\2\2"+
		"\u00f0\u00f1\7(\2\2\u00f1\u00f2\7\35\2\2\u00f2\u00f3\5\32\16\2\u00f3\'"+
		"\3\2\2\2\u00f4\u00f7\7\'\2\2\u00f5\u00f7\5\66\34\2\u00f6\u00f4\3\2\2\2"+
		"\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fb\7\35\2\2\u00f9\u00fc"+
		"\5\64\33\2\u00fa\u00fc\5\60\31\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2"+
		"\2\u00fc)\3\2\2\2\u00fd\u00fe\7\25\2\2\u00fe\u0101\7!\2\2\u00ff\u0102"+
		"\5\64\33\2\u0100\u0102\5\60\31\2\u0101\u00ff\3\2\2\2\u0101\u0100\3\2\2"+
		"\2\u0102\u0103\3\2\2\2\u0103\u0104\7\"\2\2\u0104+\3\2\2\2\u0105\u0106"+
		"\7\24\2\2\u0106\u010b\5\62\32\2\u0107\u0108\7\36\2\2\u0108\u010a\5\62"+
		"\32\2\u0109\u0107\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0110\7\36"+
		"\2\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110-\3\2\2\2\u0111\u0112"+
		"\7\23\2\2\u0112\u0117\t\2\2\2\u0113\u0114\7#\2\2\u0114\u0116\t\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2"+
		"\2\2\u0118/\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011b\7(\2\2\u011b\u0125"+
		"\7$\2\2\u011c\u011d\5\62\32\2\u011d\u011e\7#\2\2\u011e\u0120\3\2\2\2\u011f"+
		"\u011c\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0126\5\62\32\2\u0125"+
		"\u0121\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\7%"+
		"\2\2\u0128\61\3\2\2\2\u0129\u012c\5\32\16\2\u012a\u012c\5\64\33\2\u012b"+
		"\u0129\3\2\2\2\u012b\u012a\3\2\2\2\u012c\63\3\2\2\2\u012d\u0131\7&\2\2"+
		"\u012e\u0131\7\'\2\2\u012f\u0131\5\66\34\2\u0130\u012d\3\2\2\2\u0130\u012e"+
		"\3\2\2\2\u0130\u012f\3\2\2\2\u0131\65\3\2\2\2\u0132\u0133\7\'\2\2\u0133"+
		"\u0134\7!\2\2\u0134\u0135\5\32\16\2\u0135\u0136\7\"\2\2\u0136\67\3\2\2"+
		"\2 ;=NQadtw\u0095\u009c\u00a7\u00ae\u00b6\u00bd\u00c4\u00cc\u00d0\u00dc"+
		"\u00e4\u00ed\u00f6\u00fb\u0101\u010b\u010f\u0117\u0121\u0125\u012b\u0130";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}