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
		RULE_program = 0, RULE_predefined = 1, RULE_intFunction = 2, RULE_stringFunction = 3, 
		RULE_procedure = 4, RULE_r_for = 5, RULE_r_if = 6, RULE_procReturn = 7, 
		RULE_intReturn = 8, RULE_stringReturn = 9, RULE_instructions = 10, RULE_instruction = 11, 
		RULE_condition = 12, RULE_comp = 13, RULE_logTerm = 14, RULE_artmExpr = 15, 
		RULE_additiveExpr = 16, RULE_multExpression = 17, RULE_term = 18, RULE_intDefinition = 19, 
		RULE_stringDeclaration = 20, RULE_intAssignment = 21, RULE_stringAssignment = 22, 
		RULE_len = 23, RULE_input = 24, RULE_print = 25, RULE_read = 26, RULE_r_goto = 27, 
		RULE_gosub = 28, RULE_label = 29, RULE_funSignature = 30, RULE_callArgs = 31, 
		RULE_callArg = 32, RULE_arg = 33, RULE_stringArg = 34, RULE_substringOrDecl = 35;
	public static final String[] ruleNames = {
		"program", "predefined", "intFunction", "stringFunction", "procedure", 
		"r_for", "r_if", "procReturn", "intReturn", "stringReturn", "instructions", 
		"instruction", "condition", "comp", "logTerm", "artmExpr", "additiveExpr", 
		"multExpression", "term", "intDefinition", "stringDeclaration", "intAssignment", 
		"stringAssignment", "len", "input", "print", "read", "r_goto", "gosub", 
		"label", "funSignature", "callArgs", "callArg", "arg", "stringArg", "substringOrDecl"
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
		public TerminalNode END() { return getToken(BasicParser.END, 0); }
		public List<PredefinedContext> predefined() {
			return getRuleContexts(PredefinedContext.class);
		}
		public PredefinedContext predefined(int i) {
			return getRuleContext(PredefinedContext.class,i);
		}
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public List<ProcReturnContext> procReturn() {
			return getRuleContexts(ProcReturnContext.class);
		}
		public ProcReturnContext procReturn(int i) {
			return getRuleContext(ProcReturnContext.class,i);
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
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_FUN) | (1L << STRING_FUN) | (1L << SUB))) != 0)) {
				{
				{
				setState(72);
				predefined();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(BEGIN);
			setState(79);
			match(NL);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << FOR) | (1L << IF) | (1L << LET) | (1L << DIM) | (1L << READ) | (1L << PRINT) | (1L << INPUT) | (1L << GOTO) | (1L << GOSUB) | (1L << STRING_ID) | (1L << ID))) != 0)) {
				{
				{
				setState(80);
				instructions();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			match(END);
			setState(87);
			match(NL);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << FOR) | (1L << IF) | (1L << LET) | (1L << DIM) | (1L << READ) | (1L << PRINT) | (1L << INPUT) | (1L << GOTO) | (1L << GOSUB) | (1L << STRING_ID) | (1L << ID))) != 0)) {
				{
				{
				setState(88);
				instructions();
				setState(89);
				procReturn();
				}
				}
				setState(95);
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

	public static class PredefinedContext extends ParserRuleContext {
		public StringFunctionContext stringFunction() {
			return getRuleContext(StringFunctionContext.class,0);
		}
		public IntFunctionContext intFunction() {
			return getRuleContext(IntFunctionContext.class,0);
		}
		public ProcedureContext procedure() {
			return getRuleContext(ProcedureContext.class,0);
		}
		public PredefinedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predefined; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterPredefined(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitPredefined(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitPredefined(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredefinedContext predefined() throws RecognitionException {
		PredefinedContext _localctx = new PredefinedContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_predefined);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_FUN:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				stringFunction();
				}
				break;
			case INT_FUN:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				intFunction();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				procedure();
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

	public static class IntFunctionContext extends ParserRuleContext {
		public TerminalNode INT_FUN() { return getToken(BasicParser.INT_FUN, 0); }
		public FunSignatureContext funSignature() {
			return getRuleContext(FunSignatureContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(BasicParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(BasicParser.NL, i);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public IntReturnContext intReturn() {
			return getRuleContext(IntReturnContext.class,0);
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
		enterRule(_localctx, 4, RULE_intFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(INT_FUN);
			setState(102);
			funSignature();
			setState(103);
			match(NL);
			setState(104);
			instructions();
			setState(105);
			intReturn();
			setState(106);
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
		public FunSignatureContext funSignature() {
			return getRuleContext(FunSignatureContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(BasicParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(BasicParser.NL, i);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public StringReturnContext stringReturn() {
			return getRuleContext(StringReturnContext.class,0);
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
		enterRule(_localctx, 6, RULE_stringFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(STRING_FUN);
			setState(109);
			funSignature();
			setState(110);
			match(NL);
			setState(111);
			instructions();
			setState(112);
			stringReturn();
			setState(113);
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
		public FunSignatureContext funSignature() {
			return getRuleContext(FunSignatureContext.class,0);
		}
		public TerminalNode NL() { return getToken(BasicParser.NL, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public ProcReturnContext procReturn() {
			return getRuleContext(ProcReturnContext.class,0);
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
		enterRule(_localctx, 8, RULE_procedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(SUB);
			setState(116);
			funSignature();
			setState(117);
			match(NL);
			setState(118);
			instructions();
			setState(119);
			procReturn();
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
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
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
		enterRule(_localctx, 10, RULE_r_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(FOR);
			setState(122);
			intAssignment();
			setState(123);
			match(TO);
			setState(124);
			artmExpr();
			setState(125);
			match(NL);
			setState(126);
			instructions();
			setState(127);
			match(NEXT);
			setState(128);
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
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
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
		enterRule(_localctx, 12, RULE_r_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(IF);
			setState(131);
			condition();
			setState(132);
			match(THEN);
			setState(133);
			match(NL);
			setState(134);
			instructions();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSIF || _la==ELSE) {
				{
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSIF) {
					{
					{
					setState(135);
					match(ELSIF);
					setState(136);
					condition();
					setState(137);
					match(THEN);
					setState(138);
					match(NL);
					setState(140); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(139);
						instructions();
						}
						}
						setState(142); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << FOR) | (1L << IF) | (1L << LET) | (1L << DIM) | (1L << READ) | (1L << PRINT) | (1L << INPUT) | (1L << GOTO) | (1L << GOSUB) | (1L << STRING_ID) | (1L << ID))) != 0) );
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(149);
				match(ELSE);
				setState(150);
				match(NL);
				setState(152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(151);
					instructions();
					}
					}
					setState(154); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << FOR) | (1L << IF) | (1L << LET) | (1L << DIM) | (1L << READ) | (1L << PRINT) | (1L << INPUT) | (1L << GOTO) | (1L << GOSUB) | (1L << STRING_ID) | (1L << ID))) != 0) );
				}
			}

			setState(158);
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

	public static class ProcReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(BasicParser.RETURN, 0); }
		public TerminalNode NL() { return getToken(BasicParser.NL, 0); }
		public ProcReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterProcReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitProcReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitProcReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcReturnContext procReturn() throws RecognitionException {
		ProcReturnContext _localctx = new ProcReturnContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_procReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(RETURN);
			setState(161);
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
		enterRule(_localctx, 16, RULE_intReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(RETURN);
			setState(164);
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
		public FunSignatureContext funSignature() {
			return getRuleContext(FunSignatureContext.class,0);
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
		enterRule(_localctx, 18, RULE_stringReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(RETURN);
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case STRING_ID:
				{
				setState(167);
				stringArg();
				}
				break;
			case ID:
				{
				setState(168);
				funSignature();
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

	public static class InstructionsContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(BasicParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(BasicParser.NL, i);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitInstructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitInstructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_instructions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(172);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(171);
						label();
						}
						break;
					}
					setState(174);
					instruction();
					setState(175);
					match(NL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(179); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class InstructionContext extends ParserRuleContext {
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
		public R_gotoContext r_goto() {
			return getRuleContext(R_gotoContext.class,0);
		}
		public GosubContext gosub() {
			return getRuleContext(GosubContext.class,0);
		}
		public FunSignatureContext funSignature() {
			return getRuleContext(FunSignatureContext.class,0);
		}
		public R_ifContext r_if() {
			return getRuleContext(R_ifContext.class,0);
		}
		public R_forContext r_for() {
			return getRuleContext(R_forContext.class,0);
		}
		public ProcReturnContext procReturn() {
			return getRuleContext(ProcReturnContext.class,0);
		}
		public IntReturnContext intReturn() {
			return getRuleContext(IntReturnContext.class,0);
		}
		public StringReturnContext stringReturn() {
			return getRuleContext(StringReturnContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_instruction);
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				intDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				stringDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				intAssignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				stringAssignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(185);
				input();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(186);
				print();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(187);
				read();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(188);
				r_goto();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(189);
				gosub();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(190);
				funSignature();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(191);
				r_if();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(192);
				r_for();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(193);
				procReturn();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(194);
				intReturn();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(195);
				stringReturn();
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
		enterRule(_localctx, 24, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			comp();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOG_OPERATOR) {
				{
				{
				setState(199);
				match(LOG_OPERATOR);
				setState(200);
				comp();
				}
				}
				setState(205);
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
		enterRule(_localctx, 26, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			logTerm();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMP_OPERATOR) {
				{
				{
				setState(207);
				match(COMP_OPERATOR);
				setState(208);
				logTerm();
				}
				}
				setState(213);
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
		enterRule(_localctx, 28, RULE_logTerm);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				artmExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(215);
				match(LEFT_PARENTHESES);
				setState(216);
				condition();
				setState(217);
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
		enterRule(_localctx, 30, RULE_artmExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			additiveExpr();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(222);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(223);
				additiveExpr();
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
		enterRule(_localctx, 32, RULE_additiveExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			multExpression();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTI_OPERATOR) {
				{
				{
				setState(230);
				match(MULTI_OPERATOR);
				setState(231);
				multExpression();
				}
				}
				setState(236);
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
		enterRule(_localctx, 34, RULE_multExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(237);
				match(MINUS);
				}
			}

			setState(240);
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
		public FunSignatureContext funSignature() {
			return getRuleContext(FunSignatureContext.class,0);
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
		enterRule(_localctx, 36, RULE_term);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				funSignature();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				len();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(246);
				match(LEFT_PARENTHESES);
				setState(247);
				artmExpr();
				setState(248);
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
		enterRule(_localctx, 38, RULE_intDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(LET);
			setState(253);
			intAssignment();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(254);
				match(COMMA);
				setState(255);
				intAssignment();
				}
				}
				setState(260);
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
		public List<SubstringOrDeclContext> substringOrDecl() {
			return getRuleContexts(SubstringOrDeclContext.class);
		}
		public SubstringOrDeclContext substringOrDecl(int i) {
			return getRuleContext(SubstringOrDeclContext.class,i);
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
		enterRule(_localctx, 40, RULE_stringDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(DIM);
			setState(262);
			substringOrDecl();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(263);
				match(COMMA);
				setState(264);
				substringOrDecl();
				}
				}
				setState(269);
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
		enterRule(_localctx, 42, RULE_intAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(ID);
			setState(271);
			match(ASSIGN);
			setState(272);
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
		public SubstringOrDeclContext substringOrDecl() {
			return getRuleContext(SubstringOrDeclContext.class,0);
		}
		public StringArgContext stringArg() {
			return getRuleContext(StringArgContext.class,0);
		}
		public FunSignatureContext funSignature() {
			return getRuleContext(FunSignatureContext.class,0);
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
		enterRule(_localctx, 44, RULE_stringAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(274);
				match(STRING_ID);
				}
				break;
			case 2:
				{
				setState(275);
				substringOrDecl();
				}
				break;
			}
			setState(278);
			match(ASSIGN);
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case STRING_ID:
				{
				setState(279);
				stringArg();
				}
				break;
			case ID:
				{
				setState(280);
				funSignature();
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
		public FunSignatureContext funSignature() {
			return getRuleContext(FunSignatureContext.class,0);
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
		enterRule(_localctx, 46, RULE_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(LEN);
			setState(284);
			match(LEFT_PARENTHESES);
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case STRING_ID:
				{
				setState(285);
				stringArg();
				}
				break;
			case ID:
				{
				setState(286);
				funSignature();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(289);
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
		enterRule(_localctx, 48, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(INPUT);
			setState(292);
			match(ID);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(293);
				match(COMMA);
				setState(294);
				match(ID);
				}
				}
				setState(299);
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
		enterRule(_localctx, 50, RULE_print);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(PRINT);
			setState(301);
			arg();
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(302);
					match(SEMICOLON);
					setState(303);
					arg();
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(309);
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
		enterRule(_localctx, 52, RULE_read);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(READ);
			setState(313);
			match(STRING_ID);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(314);
				match(COMMA);
				setState(315);
				match(STRING_ID);
				}
				}
				setState(320);
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

	public static class R_gotoContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(BasicParser.GOTO, 0); }
		public TerminalNode ID() { return getToken(BasicParser.ID, 0); }
		public R_gotoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_goto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterR_goto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitR_goto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitR_goto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_gotoContext r_goto() throws RecognitionException {
		R_gotoContext _localctx = new R_gotoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_r_goto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(GOTO);
			setState(322);
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

	public static class GosubContext extends ParserRuleContext {
		public TerminalNode GOSUB() { return getToken(BasicParser.GOSUB, 0); }
		public TerminalNode ID() { return getToken(BasicParser.ID, 0); }
		public GosubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gosub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterGosub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitGosub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitGosub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GosubContext gosub() throws RecognitionException {
		GosubContext _localctx = new GosubContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_gosub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(GOSUB);
			setState(325);
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BasicParser.ID, 0); }
		public TerminalNode NUMBER_SIGN() { return getToken(BasicParser.NUMBER_SIGN, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(ID);
			setState(328);
			match(NUMBER_SIGN);
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

	public static class FunSignatureContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BasicParser.ID, 0); }
		public CallArgsContext callArgs() {
			return getRuleContext(CallArgsContext.class,0);
		}
		public FunSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterFunSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitFunSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitFunSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunSignatureContext funSignature() throws RecognitionException {
		FunSignatureContext _localctx = new FunSignatureContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_funSignature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(ID);
			setState(331);
			callArgs();
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

	public static class CallArgsContext extends ParserRuleContext {
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
		public CallArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterCallArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitCallArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitCallArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallArgsContext callArgs() throws RecognitionException {
		CallArgsContext _localctx = new CallArgsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_callArgs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(LEFT_BRACKET);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEN) | (1L << MINUS) | (1L << LEFT_PARENTHESES) | (1L << STRING) | (1L << STRING_ID) | (1L << ID) | (1L << NUMBER))) != 0)) {
				{
				setState(339);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(334);
						arg();
						setState(335);
						match(COMMA);
						}
						} 
					}
					setState(341);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(342);
				arg();
				}
			}

			setState(345);
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

	public static class CallArgContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESES() { return getToken(BasicParser.LEFT_PARENTHESES, 0); }
		public ArtmExprContext artmExpr() {
			return getRuleContext(ArtmExprContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESES() { return getToken(BasicParser.RIGHT_PARENTHESES, 0); }
		public CallArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterCallArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitCallArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitCallArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallArgContext callArg() throws RecognitionException {
		CallArgContext _localctx = new CallArgContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_callArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(LEFT_PARENTHESES);
			setState(348);
			artmExpr();
			setState(349);
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
		enterRule(_localctx, 66, RULE_arg);
		try {
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEN:
			case MINUS:
			case LEFT_PARENTHESES:
			case ID:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				artmExpr();
				}
				break;
			case STRING:
			case STRING_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
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
		public SubstringOrDeclContext substringOrDecl() {
			return getRuleContext(SubstringOrDeclContext.class,0);
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
		enterRule(_localctx, 68, RULE_stringArg);
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				match(STRING_ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(357);
				substringOrDecl();
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

	public static class SubstringOrDeclContext extends ParserRuleContext {
		public TerminalNode STRING_ID() { return getToken(BasicParser.STRING_ID, 0); }
		public CallArgContext callArg() {
			return getRuleContext(CallArgContext.class,0);
		}
		public SubstringOrDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substringOrDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterSubstringOrDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitSubstringOrDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitSubstringOrDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubstringOrDeclContext substringOrDecl() throws RecognitionException {
		SubstringOrDeclContext _localctx = new SubstringOrDeclContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_substringOrDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(STRING_ID);
			setState(361);
			callArg();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u016e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\7\2L\n\2\f\2\16\2O\13\2\3\2\3\2\3\2"+
		"\7\2T\n\2\f\2\16\2W\13\2\3\2\3\2\3\2\3\2\3\2\7\2^\n\2\f\2\16\2a\13\2\3"+
		"\3\3\3\3\3\5\3f\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u008f\n\b\r\b\16\b\u0090\7\b"+
		"\u0093\n\b\f\b\16\b\u0096\13\b\3\b\3\b\3\b\6\b\u009b\n\b\r\b\16\b\u009c"+
		"\5\b\u009f\n\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\5\13\u00ac"+
		"\n\13\3\f\5\f\u00af\n\f\3\f\3\f\3\f\6\f\u00b4\n\f\r\f\16\f\u00b5\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c7\n\r\3"+
		"\16\3\16\3\16\7\16\u00cc\n\16\f\16\16\16\u00cf\13\16\3\17\3\17\3\17\7"+
		"\17\u00d4\n\17\f\17\16\17\u00d7\13\17\3\20\3\20\3\20\3\20\3\20\5\20\u00de"+
		"\n\20\3\21\3\21\3\21\7\21\u00e3\n\21\f\21\16\21\u00e6\13\21\3\22\3\22"+
		"\3\22\7\22\u00eb\n\22\f\22\16\22\u00ee\13\22\3\23\5\23\u00f1\n\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00fd\n\24\3\25\3\25"+
		"\3\25\3\25\7\25\u0103\n\25\f\25\16\25\u0106\13\25\3\26\3\26\3\26\3\26"+
		"\7\26\u010c\n\26\f\26\16\26\u010f\13\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\5\30\u0117\n\30\3\30\3\30\3\30\5\30\u011c\n\30\3\31\3\31\3\31\3\31\5"+
		"\31\u0122\n\31\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u012a\n\32\f\32\16\32"+
		"\u012d\13\32\3\33\3\33\3\33\3\33\7\33\u0133\n\33\f\33\16\33\u0136\13\33"+
		"\3\33\5\33\u0139\n\33\3\34\3\34\3\34\3\34\7\34\u013f\n\34\f\34\16\34\u0142"+
		"\13\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!"+
		"\3!\7!\u0154\n!\f!\16!\u0157\13!\3!\5!\u015a\n!\3!\3!\3\"\3\"\3\"\3\""+
		"\3#\3#\5#\u0164\n#\3$\3$\3$\5$\u0169\n$\3%\3%\3%\3%\2\2&\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\3\3\2\33\34\2"+
		"\u017b\2M\3\2\2\2\4e\3\2\2\2\6g\3\2\2\2\bn\3\2\2\2\nu\3\2\2\2\f{\3\2\2"+
		"\2\16\u0084\3\2\2\2\20\u00a2\3\2\2\2\22\u00a5\3\2\2\2\24\u00a8\3\2\2\2"+
		"\26\u00b3\3\2\2\2\30\u00c6\3\2\2\2\32\u00c8\3\2\2\2\34\u00d0\3\2\2\2\36"+
		"\u00dd\3\2\2\2 \u00df\3\2\2\2\"\u00e7\3\2\2\2$\u00f0\3\2\2\2&\u00fc\3"+
		"\2\2\2(\u00fe\3\2\2\2*\u0107\3\2\2\2,\u0110\3\2\2\2.\u0116\3\2\2\2\60"+
		"\u011d\3\2\2\2\62\u0125\3\2\2\2\64\u012e\3\2\2\2\66\u013a\3\2\2\28\u0143"+
		"\3\2\2\2:\u0146\3\2\2\2<\u0149\3\2\2\2>\u014c\3\2\2\2@\u014f\3\2\2\2B"+
		"\u015d\3\2\2\2D\u0163\3\2\2\2F\u0168\3\2\2\2H\u016a\3\2\2\2JL\5\4\3\2"+
		"KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\3\2\2"+
		"QU\7+\2\2RT\5\26\f\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2"+
		"WU\3\2\2\2XY\7\4\2\2Y_\7+\2\2Z[\5\26\f\2[\\\5\20\t\2\\^\3\2\2\2]Z\3\2"+
		"\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\3\3\2\2\2a_\3\2\2\2bf\5\b\5\2cf\5"+
		"\6\4\2df\5\n\6\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2f\5\3\2\2\2gh\7\5\2\2hi"+
		"\5> \2ij\7+\2\2jk\5\26\f\2kl\5\22\n\2lm\7+\2\2m\7\3\2\2\2no\7\6\2\2op"+
		"\5> \2pq\7+\2\2qr\5\26\f\2rs\5\24\13\2st\7+\2\2t\t\3\2\2\2uv\7\b\2\2v"+
		"w\5> \2wx\7+\2\2xy\5\26\f\2yz\5\20\t\2z\13\3\2\2\2{|\7\t\2\2|}\5,\27\2"+
		"}~\7\13\2\2~\177\5 \21\2\177\u0080\7+\2\2\u0080\u0081\5\26\f\2\u0081\u0082"+
		"\7\n\2\2\u0082\u0083\7)\2\2\u0083\r\3\2\2\2\u0084\u0085\7\f\2\2\u0085"+
		"\u0086\5\32\16\2\u0086\u0087\7\r\2\2\u0087\u0088\7+\2\2\u0088\u009e\5"+
		"\26\f\2\u0089\u008a\7\16\2\2\u008a\u008b\5\32\16\2\u008b\u008c\7\r\2\2"+
		"\u008c\u008e\7+\2\2\u008d\u008f\5\26\f\2\u008e\u008d\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092"+
		"\u0089\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7\17\2\2\u0098"+
		"\u009a\7+\2\2\u0099\u009b\5\26\f\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e"+
		"\u0094\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\7\20"+
		"\2\2\u00a1\17\3\2\2\2\u00a2\u00a3\7\7\2\2\u00a3\u00a4\7+\2\2\u00a4\21"+
		"\3\2\2\2\u00a5\u00a6\7\7\2\2\u00a6\u00a7\5 \21\2\u00a7\23\3\2\2\2\u00a8"+
		"\u00ab\7\7\2\2\u00a9\u00ac\5F$\2\u00aa\u00ac\5> \2\u00ab\u00a9\3\2\2\2"+
		"\u00ab\u00aa\3\2\2\2\u00ac\25\3\2\2\2\u00ad\u00af\5<\37\2\u00ae\u00ad"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\5\30\r\2"+
		"\u00b1\u00b2\7+\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b4\u00b5"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\27\3\2\2\2\u00b7"+
		"\u00c7\5(\25\2\u00b8\u00c7\5*\26\2\u00b9\u00c7\5,\27\2\u00ba\u00c7\5."+
		"\30\2\u00bb\u00c7\5\62\32\2\u00bc\u00c7\5\64\33\2\u00bd\u00c7\5\66\34"+
		"\2\u00be\u00c7\58\35\2\u00bf\u00c7\5:\36\2\u00c0\u00c7\5> \2\u00c1\u00c7"+
		"\5\16\b\2\u00c2\u00c7\5\f\7\2\u00c3\u00c7\5\20\t\2\u00c4\u00c7\5\22\n"+
		"\2\u00c5\u00c7\5\24\13\2\u00c6\u00b7\3\2\2\2\u00c6\u00b8\3\2\2\2\u00c6"+
		"\u00b9\3\2\2\2\u00c6\u00ba\3\2\2\2\u00c6\u00bb\3\2\2\2\u00c6\u00bc\3\2"+
		"\2\2\u00c6\u00bd\3\2\2\2\u00c6\u00be\3\2\2\2\u00c6\u00bf\3\2\2\2\u00c6"+
		"\u00c0\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c6\u00c2\3\2\2\2\u00c6\u00c3\3\2"+
		"\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\31\3\2\2\2\u00c8\u00cd"+
		"\5\34\17\2\u00c9\u00ca\7\31\2\2\u00ca\u00cc\5\34\17\2\u00cb\u00c9\3\2"+
		"\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\33\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d5\5\36\20\2\u00d1\u00d2\7\32"+
		"\2\2\u00d2\u00d4\5\36\20\2\u00d3\u00d1\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\35\3\2\2\2\u00d7\u00d5\3\2\2"+
		"\2\u00d8\u00de\5 \21\2\u00d9\u00da\7\"\2\2\u00da\u00db\5\32\16\2\u00db"+
		"\u00dc\7#\2\2\u00dc\u00de\3\2\2\2\u00dd\u00d8\3\2\2\2\u00dd\u00d9\3\2"+
		"\2\2\u00de\37\3\2\2\2\u00df\u00e4\5\"\22\2\u00e0\u00e1\t\2\2\2\u00e1\u00e3"+
		"\5\"\22\2\u00e2\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2"+
		"\u00e4\u00e5\3\2\2\2\u00e5!\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00ec\5"+
		"$\23\2\u00e8\u00e9\7\35\2\2\u00e9\u00eb\5$\23\2\u00ea\u00e8\3\2\2\2\u00eb"+
		"\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed#\3\2\2\2"+
		"\u00ee\u00ec\3\2\2\2\u00ef\u00f1\7\34\2\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\5&\24\2\u00f3%\3\2\2\2\u00f4"+
		"\u00fd\7*\2\2\u00f5\u00fd\7)\2\2\u00f6\u00fd\5> \2\u00f7\u00fd\5\60\31"+
		"\2\u00f8\u00f9\7\"\2\2\u00f9\u00fa\5 \21\2\u00fa\u00fb\7#\2\2\u00fb\u00fd"+
		"\3\2\2\2\u00fc\u00f4\3\2\2\2\u00fc\u00f5\3\2\2\2\u00fc\u00f6\3\2\2\2\u00fc"+
		"\u00f7\3\2\2\2\u00fc\u00f8\3\2\2\2\u00fd\'\3\2\2\2\u00fe\u00ff\7\21\2"+
		"\2\u00ff\u0104\5,\27\2\u0100\u0101\7$\2\2\u0101\u0103\5,\27\2\u0102\u0100"+
		"\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		")\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\7\22\2\2\u0108\u010d\5H%\2\u0109"+
		"\u010a\7$\2\2\u010a\u010c\5H%\2\u010b\u0109\3\2\2\2\u010c\u010f\3\2\2"+
		"\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e+\3\2\2\2\u010f\u010d"+
		"\3\2\2\2\u0110\u0111\7)\2\2\u0111\u0112\7\36\2\2\u0112\u0113\5 \21\2\u0113"+
		"-\3\2\2\2\u0114\u0117\7(\2\2\u0115\u0117\5H%\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011b\7\36\2\2\u0119\u011c\5"+
		"F$\2\u011a\u011c\5> \2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c/"+
		"\3\2\2\2\u011d\u011e\7\26\2\2\u011e\u0121\7\"\2\2\u011f\u0122\5F$\2\u0120"+
		"\u0122\5> \2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122\u0123\3\2\2"+
		"\2\u0123\u0124\7#\2\2\u0124\61\3\2\2\2\u0125\u0126\7\25\2\2\u0126\u012b"+
		"\7)\2\2\u0127\u0128\7$\2\2\u0128\u012a\7)\2\2\u0129\u0127\3\2\2\2\u012a"+
		"\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\63\3\2\2"+
		"\2\u012d\u012b\3\2\2\2\u012e\u012f\7\24\2\2\u012f\u0134\5D#\2\u0130\u0131"+
		"\7\37\2\2\u0131\u0133\5D#\2\u0132\u0130\3\2\2\2\u0133\u0136\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0137\u0139\7\37\2\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\65\3\2\2\2\u013a\u013b\7\23\2\2\u013b\u0140\7(\2\2\u013c\u013d\7$\2\2"+
		"\u013d\u013f\7(\2\2\u013e\u013c\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e"+
		"\3\2\2\2\u0140\u0141\3\2\2\2\u0141\67\3\2\2\2\u0142\u0140\3\2\2\2\u0143"+
		"\u0144\7\27\2\2\u0144\u0145\7)\2\2\u01459\3\2\2\2\u0146\u0147\7\30\2\2"+
		"\u0147\u0148\7)\2\2\u0148;\3\2\2\2\u0149\u014a\7)\2\2\u014a\u014b\7 \2"+
		"\2\u014b=\3\2\2\2\u014c\u014d\7)\2\2\u014d\u014e\5@!\2\u014e?\3\2\2\2"+
		"\u014f\u0159\7%\2\2\u0150\u0151\5D#\2\u0151\u0152\7$\2\2\u0152\u0154\3"+
		"\2\2\2\u0153\u0150\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u015a\5D"+
		"#\2\u0159\u0155\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u015c\7&\2\2\u015cA\3\2\2\2\u015d\u015e\7\"\2\2\u015e\u015f\5 \21\2\u015f"+
		"\u0160\7#\2\2\u0160C\3\2\2\2\u0161\u0164\5 \21\2\u0162\u0164\5F$\2\u0163"+
		"\u0161\3\2\2\2\u0163\u0162\3\2\2\2\u0164E\3\2\2\2\u0165\u0169\7\'\2\2"+
		"\u0166\u0169\7(\2\2\u0167\u0169\5H%\2\u0168\u0165\3\2\2\2\u0168\u0166"+
		"\3\2\2\2\u0168\u0167\3\2\2\2\u0169G\3\2\2\2\u016a\u016b\7(\2\2\u016b\u016c"+
		"\5B\"\2\u016cI\3\2\2\2\"MU_e\u0090\u0094\u009c\u009e\u00ab\u00ae\u00b5"+
		"\u00c6\u00cd\u00d5\u00dd\u00e4\u00ec\u00f0\u00fc\u0104\u010d\u0116\u011b"+
		"\u0121\u012b\u0134\u0138\u0140\u0155\u0159\u0163\u0168";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}