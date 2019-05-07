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
		PRINT=18, INPUT=19, LEN=20, GOTO=21, GOSUB=22, LOG_OPERATOR=23, COMP_OPERATOR=24, 
		PLUS=25, MINUS=26, MULTI_OPERATOR=27, ASSIGN=28, SEMICOLON=29, NUMBER_SIGN=30, 
		DOLLAR=31, LEFT_PARENTHESES=32, RIGHT_PARENTHESES=33, COMMA=34, LEFT_BRACKET=35, 
		RIGHT_BRACKET=36, STRING=37, STRING_ID=38, ID=39, NUMBER=40, NL=41, WH=42, 
		COMMENT=43;
	public static final int
		RULE_program = 0, RULE_intFunction = 1, RULE_stringFunction = 2, RULE_procedure = 3, 
		RULE_r_for = 4, RULE_r_if = 5, RULE_intReturn = 6, RULE_stringReturn = 7, 
		RULE_r_instructions = 8, RULE_r_instruction = 9, RULE_condition = 10, 
		RULE_comp = 11, RULE_logTerm = 12, RULE_artmExpr = 13, RULE_additiveExpr = 14, 
		RULE_multExpression = 15, RULE_term = 16, RULE_intDefinition = 17, RULE_stringDeclaration = 18, 
		RULE_intAssignment = 19, RULE_stringAssignment = 20, RULE_len = 21, RULE_input = 22, 
		RULE_print = 23, RULE_read = 24, RULE_funCall = 25, RULE_arg = 26, RULE_stringArg = 27, 
		RULE_substring = 28;
	public static final String[] ruleNames = {
		"program", "intFunction", "stringFunction", "procedure", "r_for", "r_if", 
		"intReturn", "stringReturn", "r_instructions", "r_instruction", "condition", 
		"comp", "logTerm", "artmExpr", "additiveExpr", "multExpression", "term", 
		"intDefinition", "stringDeclaration", "intAssignment", "stringAssignment", 
		"len", "input", "print", "read", "funCall", "arg", "stringArg", "substring"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'BEGIN'", "'END'", "'FUNCTION'", "'FUNCTION$'", "'RETURN'", "'SUB'", 
		"'FOR'", "'NEXT'", "'TO'", "'IF'", "'THEN'", "'ELSIF'", "'ELSE'", "'ENDIF'", 
		"'LET'", "'DIM'", "'READ'", null, "'INPUT'", "'LEN'", "'GOTO'", "'GOSUB'", 
		null, null, "'+'", "'-'", null, "'='", "';'", "'#'", "'$'", "'('", "')'", 
		"','", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGIN", "END", "INT_FUN", "STRING_FUN", "RETURN", "SUB", "FOR", 
		"NEXT", "TO", "IF", "THEN", "ELSIF", "ELSE", "ENDIF", "LET", "DIM", "READ", 
		"PRINT", "INPUT", "LEN", "GOTO", "GOSUB", "LOG_OPERATOR", "COMP_OPERATOR", 
		"PLUS", "MINUS", "MULTI_OPERATOR", "ASSIGN", "SEMICOLON", "NUMBER_SIGN", 
		"DOLLAR", "LEFT_PARENTHESES", "RIGHT_PARENTHESES", "COMMA", "LEFT_BRACKET", 
		"RIGHT_BRACKET", "STRING", "STRING_ID", "ID", "NUMBER", "NL", "WH", "COMMENT"
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
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_FUN) | (1L << STRING_FUN) | (1L << SUB))) != 0)) {
				{
				setState(61);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING_FUN:
					{
					setState(58);
					stringFunction();
					}
					break;
				case INT_FUN:
					{
					setState(59);
					intFunction();
					}
					break;
				case SUB:
					{
					setState(60);
					procedure();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(BEGIN);
			setState(67);
			match(NL);
			setState(68);
			r_instructions();
			setState(69);
			match(END);
			setState(70);
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
			setState(72);
			match(INT_FUN);
			setState(73);
			match(ID);
			setState(74);
			match(LEFT_BRACKET);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_ID || _la==ID) {
				{
				setState(75);
				_la = _input.LA(1);
				if ( !(_la==STRING_ID || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(76);
					match(COMMA);
					setState(77);
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
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(85);
			match(RIGHT_BRACKET);
			setState(86);
			match(NL);
			setState(87);
			r_instructions();
			setState(88);
			intReturn();
			setState(89);
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
			setState(91);
			match(STRING_FUN);
			setState(92);
			match(ID);
			setState(93);
			match(LEFT_BRACKET);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_ID || _la==ID) {
				{
				setState(94);
				_la = _input.LA(1);
				if ( !(_la==STRING_ID || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(95);
					match(COMMA);
					setState(96);
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
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(104);
			match(RIGHT_BRACKET);
			setState(105);
			match(NL);
			setState(106);
			r_instructions();
			setState(107);
			stringReturn();
			setState(108);
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
			setState(110);
			match(SUB);
			setState(111);
			match(ID);
			setState(112);
			match(LEFT_BRACKET);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_ID || _la==ID) {
				{
				setState(113);
				_la = _input.LA(1);
				if ( !(_la==STRING_ID || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(114);
					match(COMMA);
					setState(115);
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
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(123);
			match(RIGHT_BRACKET);
			setState(124);
			match(NL);
			setState(125);
			r_instructions();
			setState(126);
			match(RETURN);
			setState(127);
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
			setState(129);
			match(FOR);
			setState(130);
			intAssignment();
			setState(131);
			match(TO);
			setState(132);
			artmExpr();
			setState(133);
			match(NL);
			setState(134);
			r_instructions();
			setState(135);
			match(NEXT);
			setState(136);
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
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> THEN() { return getTokens(BasicParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(BasicParser.THEN, i);
		}
		public List<TerminalNode> NL() { return getTokens(BasicParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(BasicParser.NL, i);
		}
		public List<R_instructionsContext> r_instructions() {
			return getRuleContexts(R_instructionsContext.class);
		}
		public R_instructionsContext r_instructions(int i) {
			return getRuleContext(R_instructionsContext.class,i);
		}
		public TerminalNode ENDIF() { return getToken(BasicParser.ENDIF, 0); }
		public TerminalNode ELSE() { return getToken(BasicParser.ELSE, 0); }
		public List<TerminalNode> ELSIF() { return getTokens(BasicParser.ELSIF); }
		public TerminalNode ELSIF(int i) {
			return getToken(BasicParser.ELSIF, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(IF);
			setState(139);
			condition();
			setState(140);
			match(THEN);
			setState(141);
			match(NL);
			setState(142);
			r_instructions();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSIF || _la==ELSE) {
				{
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSIF) {
					{
					{
					setState(143);
					match(ELSIF);
					setState(144);
					condition();
					setState(145);
					match(THEN);
					setState(146);
					match(NL);
					setState(147);
					r_instructions();
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(154);
				match(ELSE);
				setState(155);
				match(NL);
				setState(156);
				r_instructions();
				}
			}

			setState(159);
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
			setState(161);
			match(RETURN);
			setState(162);
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
			setState(164);
			match(RETURN);
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case STRING_ID:
				{
				setState(165);
				stringArg();
				}
				break;
			case ID:
				{
				setState(166);
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
			setState(172); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(169);
				r_instruction();
				setState(170);
				match(NL);
				}
				}
				setState(174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IF) | (1L << LET) | (1L << DIM) | (1L << READ) | (1L << PRINT) | (1L << INPUT) | (1L << STRING_ID) | (1L << ID))) != 0) );
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
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
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
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				intDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				stringDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				intAssignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				stringAssignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(180);
				input();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(181);
				print();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(182);
				read();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(183);
				funCall();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(184);
				r_if();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(185);
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
			setState(188);
			comp();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOG_OPERATOR) {
				{
				{
				setState(189);
				match(LOG_OPERATOR);
				setState(190);
				comp();
				}
				}
				setState(195);
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
		public List<LogTermContext> logTerm() {
			return getRuleContexts(LogTermContext.class);
		}
		public LogTermContext logTerm(int i) {
			return getRuleContext(LogTermContext.class,i);
		}
		public List<TerminalNode> COMP_OPERATOR() { return getTokens(BasicParser.COMP_OPERATOR); }
		public TerminalNode COMP_OPERATOR(int i) {
			return getToken(BasicParser.COMP_OPERATOR, i);
		}
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
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			logTerm();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMP_OPERATOR) {
				{
				{
				setState(197);
				match(COMP_OPERATOR);
				setState(198);
				logTerm();
				}
				}
				setState(203);
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

	public static class LogTermContext extends ParserRuleContext {
		public ArtmExprContext artmExpr() {
			return getRuleContext(ArtmExprContext.class,0);
		}
		public TerminalNode LEFT_PARENTHESES() { return getToken(BasicParser.LEFT_PARENTHESES, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESES() { return getToken(BasicParser.RIGHT_PARENTHESES, 0); }
		public LogTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterLogTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitLogTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitLogTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogTermContext logTerm() throws RecognitionException {
		LogTermContext _localctx = new LogTermContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_logTerm);
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				artmExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(205);
				match(LEFT_PARENTHESES);
				setState(206);
				condition();
				setState(207);
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
		public List<TerminalNode> PLUS() { return getTokens(BasicParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(BasicParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(BasicParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(BasicParser.MINUS, i);
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
		enterRule(_localctx, 26, RULE_artmExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			additiveExpr();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(212);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(213);
				additiveExpr();
				}
				}
				setState(218);
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
		enterRule(_localctx, 28, RULE_additiveExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			multExpression();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTI_OPERATOR) {
				{
				{
				setState(220);
				match(MULTI_OPERATOR);
				setState(221);
				multExpression();
				}
				}
				setState(226);
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
		public TerminalNode MINUS() { return getToken(BasicParser.MINUS, 0); }
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
		enterRule(_localctx, 30, RULE_multExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(227);
				match(MINUS);
				}
			}

			setState(230);
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
		enterRule(_localctx, 32, RULE_term);
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				funCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				len();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(236);
				match(LEFT_PARENTHESES);
				setState(237);
				artmExpr();
				setState(238);
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
		enterRule(_localctx, 34, RULE_intDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(LET);
			setState(243);
			intAssignment();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(244);
				match(COMMA);
				setState(245);
				intAssignment();
				}
				}
				setState(250);
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
		public List<TerminalNode> LEFT_PARENTHESES() { return getTokens(BasicParser.LEFT_PARENTHESES); }
		public TerminalNode LEFT_PARENTHESES(int i) {
			return getToken(BasicParser.LEFT_PARENTHESES, i);
		}
		public List<ArtmExprContext> artmExpr() {
			return getRuleContexts(ArtmExprContext.class);
		}
		public ArtmExprContext artmExpr(int i) {
			return getRuleContext(ArtmExprContext.class,i);
		}
		public List<TerminalNode> RIGHT_PARENTHESES() { return getTokens(BasicParser.RIGHT_PARENTHESES); }
		public TerminalNode RIGHT_PARENTHESES(int i) {
			return getToken(BasicParser.RIGHT_PARENTHESES, i);
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
		enterRule(_localctx, 36, RULE_stringDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(DIM);
			setState(252);
			match(STRING_ID);
			setState(253);
			match(LEFT_PARENTHESES);
			setState(254);
			artmExpr();
			setState(255);
			match(RIGHT_PARENTHESES);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(256);
				match(COMMA);
				setState(257);
				match(STRING_ID);
				setState(258);
				match(LEFT_PARENTHESES);
				setState(259);
				artmExpr();
				setState(260);
				match(RIGHT_PARENTHESES);
				}
				}
				setState(266);
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
		enterRule(_localctx, 38, RULE_intAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(ID);
			setState(268);
			match(ASSIGN);
			setState(269);
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
		enterRule(_localctx, 40, RULE_stringAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(271);
				match(STRING_ID);
				}
				break;
			case 2:
				{
				setState(272);
				substring();
				}
				break;
			}
			setState(275);
			match(ASSIGN);
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case STRING_ID:
				{
				setState(276);
				stringArg();
				}
				break;
			case ID:
				{
				setState(277);
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
		enterRule(_localctx, 42, RULE_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(LEN);
			setState(281);
			match(LEFT_PARENTHESES);
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case STRING_ID:
				{
				setState(282);
				stringArg();
				}
				break;
			case ID:
				{
				setState(283);
				funCall();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(286);
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(BasicParser.INPUT, 0); }
		public List<TerminalNode> ID() { return getTokens(BasicParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BasicParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(INPUT);
			setState(289);
			match(ID);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(290);
				match(COMMA);
				setState(291);
				match(ID);
				}
				}
				setState(296);
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
		enterRule(_localctx, 46, RULE_print);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(PRINT);
			setState(298);
			arg();
			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(299);
					match(SEMICOLON);
					setState(300);
					arg();
					}
					} 
				}
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(306);
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
		enterRule(_localctx, 48, RULE_read);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(READ);
			setState(310);
			match(STRING_ID);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(311);
				match(COMMA);
				setState(312);
				match(STRING_ID);
				}
				}
				setState(317);
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
		enterRule(_localctx, 50, RULE_funCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(ID);
			setState(319);
			match(LEFT_BRACKET);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEN) | (1L << MINUS) | (1L << LEFT_PARENTHESES) | (1L << STRING) | (1L << STRING_ID) | (1L << ID) | (1L << NUMBER))) != 0)) {
				{
				setState(325);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(320);
						arg();
						setState(321);
						match(COMMA);
						}
						} 
					}
					setState(327);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				setState(328);
				arg();
				}
			}

			setState(331);
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
		enterRule(_localctx, 52, RULE_arg);
		try {
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEN:
			case MINUS:
			case LEFT_PARENTHESES:
			case ID:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				artmExpr();
				}
				break;
			case STRING:
			case STRING_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
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
		enterRule(_localctx, 54, RULE_stringArg);
		try {
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				match(STRING_ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(339);
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
		enterRule(_localctx, 56, RULE_substring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(STRING_ID);
			setState(343);
			match(LEFT_PARENTHESES);
			setState(344);
			artmExpr();
			setState(345);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u015e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\7\2@\n"+
		"\2\f\2\16\2C\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3"+
		"Q\n\3\f\3\16\3T\13\3\5\3V\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\7\4d\n\4\f\4\16\4g\13\4\5\4i\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\7\5w\n\5\f\5\16\5z\13\5\5\5|\n\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\7\7\u0098\n\7\f\7\16\7\u009b\13\7\3\7\3\7\3\7\5\7\u00a0"+
		"\n\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\5\t\u00aa\n\t\3\n\3\n\3\n\6\n\u00af"+
		"\n\n\r\n\16\n\u00b0\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00bd\n\13\3\f\3\f\3\f\7\f\u00c2\n\f\f\f\16\f\u00c5\13\f\3\r\3\r"+
		"\3\r\7\r\u00ca\n\r\f\r\16\r\u00cd\13\r\3\16\3\16\3\16\3\16\3\16\5\16\u00d4"+
		"\n\16\3\17\3\17\3\17\7\17\u00d9\n\17\f\17\16\17\u00dc\13\17\3\20\3\20"+
		"\3\20\7\20\u00e1\n\20\f\20\16\20\u00e4\13\20\3\21\5\21\u00e7\n\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00f3\n\22\3\23\3\23"+
		"\3\23\3\23\7\23\u00f9\n\23\f\23\16\23\u00fc\13\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0109\n\24\f\24\16\24\u010c\13"+
		"\24\3\25\3\25\3\25\3\25\3\26\3\26\5\26\u0114\n\26\3\26\3\26\3\26\5\26"+
		"\u0119\n\26\3\27\3\27\3\27\3\27\5\27\u011f\n\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\7\30\u0127\n\30\f\30\16\30\u012a\13\30\3\31\3\31\3\31\3\31\7"+
		"\31\u0130\n\31\f\31\16\31\u0133\13\31\3\31\5\31\u0136\n\31\3\32\3\32\3"+
		"\32\3\32\7\32\u013c\n\32\f\32\16\32\u013f\13\32\3\33\3\33\3\33\3\33\3"+
		"\33\7\33\u0146\n\33\f\33\16\33\u0149\13\33\3\33\5\33\u014c\n\33\3\33\3"+
		"\33\3\34\3\34\5\34\u0152\n\34\3\35\3\35\3\35\5\35\u0157\n\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:\2\4\3\2()\3\2\33\34\2\u016e\2A\3\2\2\2\4J\3\2\2\2"+
		"\6]\3\2\2\2\bp\3\2\2\2\n\u0083\3\2\2\2\f\u008c\3\2\2\2\16\u00a3\3\2\2"+
		"\2\20\u00a6\3\2\2\2\22\u00ae\3\2\2\2\24\u00bc\3\2\2\2\26\u00be\3\2\2\2"+
		"\30\u00c6\3\2\2\2\32\u00d3\3\2\2\2\34\u00d5\3\2\2\2\36\u00dd\3\2\2\2 "+
		"\u00e6\3\2\2\2\"\u00f2\3\2\2\2$\u00f4\3\2\2\2&\u00fd\3\2\2\2(\u010d\3"+
		"\2\2\2*\u0113\3\2\2\2,\u011a\3\2\2\2.\u0122\3\2\2\2\60\u012b\3\2\2\2\62"+
		"\u0137\3\2\2\2\64\u0140\3\2\2\2\66\u0151\3\2\2\28\u0156\3\2\2\2:\u0158"+
		"\3\2\2\2<@\5\6\4\2=@\5\4\3\2>@\5\b\5\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@"+
		"C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7\3\2\2EF\7+\2\2F"+
		"G\5\22\n\2GH\7\4\2\2HI\7+\2\2I\3\3\2\2\2JK\7\5\2\2KL\7)\2\2LU\7%\2\2M"+
		"R\t\2\2\2NO\7$\2\2OQ\t\2\2\2PN\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S"+
		"V\3\2\2\2TR\3\2\2\2UM\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7&\2\2XY\7+\2\2YZ"+
		"\5\22\n\2Z[\5\16\b\2[\\\7+\2\2\\\5\3\2\2\2]^\7\6\2\2^_\7)\2\2_h\7%\2\2"+
		"`e\t\2\2\2ab\7$\2\2bd\t\2\2\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2"+
		"fi\3\2\2\2ge\3\2\2\2h`\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\7&\2\2kl\7+\2\2l"+
		"m\5\22\n\2mn\5\20\t\2no\7+\2\2o\7\3\2\2\2pq\7\b\2\2qr\7)\2\2r{\7%\2\2"+
		"sx\t\2\2\2tu\7$\2\2uw\t\2\2\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2"+
		"y|\3\2\2\2zx\3\2\2\2{s\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7&\2\2~\177\7+\2"+
		"\2\177\u0080\5\22\n\2\u0080\u0081\7\7\2\2\u0081\u0082\7+\2\2\u0082\t\3"+
		"\2\2\2\u0083\u0084\7\t\2\2\u0084\u0085\5(\25\2\u0085\u0086\7\13\2\2\u0086"+
		"\u0087\5\34\17\2\u0087\u0088\7+\2\2\u0088\u0089\5\22\n\2\u0089\u008a\7"+
		"\n\2\2\u008a\u008b\7)\2\2\u008b\13\3\2\2\2\u008c\u008d\7\f\2\2\u008d\u008e"+
		"\5\26\f\2\u008e\u008f\7\r\2\2\u008f\u0090\7+\2\2\u0090\u009f\5\22\n\2"+
		"\u0091\u0092\7\16\2\2\u0092\u0093\5\26\f\2\u0093\u0094\7\r\2\2\u0094\u0095"+
		"\7+\2\2\u0095\u0096\5\22\n\2\u0096\u0098\3\2\2\2\u0097\u0091\3\2\2\2\u0098"+
		"\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7\17\2\2\u009d\u009e\7+\2\2\u009e"+
		"\u00a0\5\22\n\2\u009f\u0099\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3"+
		"\2\2\2\u00a1\u00a2\7\20\2\2\u00a2\r\3\2\2\2\u00a3\u00a4\7\7\2\2\u00a4"+
		"\u00a5\5\34\17\2\u00a5\17\3\2\2\2\u00a6\u00a9\7\7\2\2\u00a7\u00aa\58\35"+
		"\2\u00a8\u00aa\5\64\33\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"\21\3\2\2\2\u00ab\u00ac\5\24\13\2\u00ac\u00ad\7+\2\2\u00ad\u00af\3\2\2"+
		"\2\u00ae\u00ab\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1"+
		"\3\2\2\2\u00b1\23\3\2\2\2\u00b2\u00bd\5$\23\2\u00b3\u00bd\5&\24\2\u00b4"+
		"\u00bd\5(\25\2\u00b5\u00bd\5*\26\2\u00b6\u00bd\5.\30\2\u00b7\u00bd\5\60"+
		"\31\2\u00b8\u00bd\5\62\32\2\u00b9\u00bd\5\64\33\2\u00ba\u00bd\5\f\7\2"+
		"\u00bb\u00bd\5\n\6\2\u00bc\u00b2\3\2\2\2\u00bc\u00b3\3\2\2\2\u00bc\u00b4"+
		"\3\2\2\2\u00bc\u00b5\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bc"+
		"\u00b8\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2"+
		"\2\2\u00bd\25\3\2\2\2\u00be\u00c3\5\30\r\2\u00bf\u00c0\7\31\2\2\u00c0"+
		"\u00c2\5\30\r\2\u00c1\u00bf\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3"+
		"\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\27\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6"+
		"\u00cb\5\32\16\2\u00c7\u00c8\7\32\2\2\u00c8\u00ca\5\32\16\2\u00c9\u00c7"+
		"\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\31\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d4\5\34\17\2\u00cf\u00d0\7\""+
		"\2\2\u00d0\u00d1\5\26\f\2\u00d1\u00d2\7#\2\2\u00d2\u00d4\3\2\2\2\u00d3"+
		"\u00ce\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d4\33\3\2\2\2\u00d5\u00da\5\36\20"+
		"\2\u00d6\u00d7\t\3\2\2\u00d7\u00d9\5\36\20\2\u00d8\u00d6\3\2\2\2\u00d9"+
		"\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\35\3\2\2"+
		"\2\u00dc\u00da\3\2\2\2\u00dd\u00e2\5 \21\2\u00de\u00df\7\35\2\2\u00df"+
		"\u00e1\5 \21\2\u00e0\u00de\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e2\u00e3\3\2\2\2\u00e3\37\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e7"+
		"\7\34\2\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2"+
		"\u00e8\u00e9\5\"\22\2\u00e9!\3\2\2\2\u00ea\u00f3\7*\2\2\u00eb\u00f3\7"+
		")\2\2\u00ec\u00f3\5\64\33\2\u00ed\u00f3\5,\27\2\u00ee\u00ef\7\"\2\2\u00ef"+
		"\u00f0\5\34\17\2\u00f0\u00f1\7#\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00ea\3"+
		"\2\2\2\u00f2\u00eb\3\2\2\2\u00f2\u00ec\3\2\2\2\u00f2\u00ed\3\2\2\2\u00f2"+
		"\u00ee\3\2\2\2\u00f3#\3\2\2\2\u00f4\u00f5\7\21\2\2\u00f5\u00fa\5(\25\2"+
		"\u00f6\u00f7\7$\2\2\u00f7\u00f9\5(\25\2\u00f8\u00f6\3\2\2\2\u00f9\u00fc"+
		"\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb%\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fd\u00fe\7\22\2\2\u00fe\u00ff\7(\2\2\u00ff\u0100\7\""+
		"\2\2\u0100\u0101\5\34\17\2\u0101\u010a\7#\2\2\u0102\u0103\7$\2\2\u0103"+
		"\u0104\7(\2\2\u0104\u0105\7\"\2\2\u0105\u0106\5\34\17\2\u0106\u0107\7"+
		"#\2\2\u0107\u0109\3\2\2\2\u0108\u0102\3\2\2\2\u0109\u010c\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\'\3\2\2\2\u010c\u010a\3\2\2\2"+
		"\u010d\u010e\7)\2\2\u010e\u010f\7\36\2\2\u010f\u0110\5\34\17\2\u0110)"+
		"\3\2\2\2\u0111\u0114\7(\2\2\u0112\u0114\5:\36\2\u0113\u0111\3\2\2\2\u0113"+
		"\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0118\7\36\2\2\u0116\u0119\5"+
		"8\35\2\u0117\u0119\5\64\33\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2\2\2\u0119"+
		"+\3\2\2\2\u011a\u011b\7\26\2\2\u011b\u011e\7\"\2\2\u011c\u011f\58\35\2"+
		"\u011d\u011f\5\64\33\2\u011e\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011f\u0120"+
		"\3\2\2\2\u0120\u0121\7#\2\2\u0121-\3\2\2\2\u0122\u0123\7\25\2\2\u0123"+
		"\u0128\7)\2\2\u0124\u0125\7$\2\2\u0125\u0127\7)\2\2\u0126\u0124\3\2\2"+
		"\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129/"+
		"\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c\7\24\2\2\u012c\u0131\5\66\34"+
		"\2\u012d\u012e\7\37\2\2\u012e\u0130\5\66\34\2\u012f\u012d\3\2\2\2\u0130"+
		"\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0135\3\2"+
		"\2\2\u0133\u0131\3\2\2\2\u0134\u0136\7\37\2\2\u0135\u0134\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\61\3\2\2\2\u0137\u0138\7\23\2\2\u0138\u013d\7(\2"+
		"\2\u0139\u013a\7$\2\2\u013a\u013c\7(\2\2\u013b\u0139\3\2\2\2\u013c\u013f"+
		"\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\63\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u0140\u0141\7)\2\2\u0141\u014b\7%\2\2\u0142\u0143\5\66"+
		"\34\2\u0143\u0144\7$\2\2\u0144\u0146\3\2\2\2\u0145\u0142\3\2\2\2\u0146"+
		"\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2"+
		"\2\2\u0149\u0147\3\2\2\2\u014a\u014c\5\66\34\2\u014b\u0147\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\7&\2\2\u014e\65\3\2\2\2"+
		"\u014f\u0152\5\34\17\2\u0150\u0152\58\35\2\u0151\u014f\3\2\2\2\u0151\u0150"+
		"\3\2\2\2\u0152\67\3\2\2\2\u0153\u0157\7\'\2\2\u0154\u0157\7(\2\2\u0155"+
		"\u0157\5:\36\2\u0156\u0153\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0155\3\2"+
		"\2\2\u01579\3\2\2\2\u0158\u0159\7(\2\2\u0159\u015a\7\"\2\2\u015a\u015b"+
		"\5\34\17\2\u015b\u015c\7#\2\2\u015c;\3\2\2\2#?ARUehx{\u0099\u009f\u00a9"+
		"\u00b0\u00bc\u00c3\u00cb\u00d3\u00da\u00e2\u00e6\u00f2\u00fa\u010a\u0113"+
		"\u0118\u011e\u0128\u0131\u0135\u013d\u0147\u014b\u0151\u0156";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}