// Generated from C:/Users/gabos/IdeaProjects/basic/src/main/antlr4\Basic.g4 by ANTLR 4.7
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
		RULE_funReturn = 8, RULE_intReturn = 9, RULE_stringReturn = 10, RULE_instructions = 11, 
		RULE_instruction = 12, RULE_condition = 13, RULE_comp = 14, RULE_logTerm = 15, 
		RULE_artmExpr = 16, RULE_additiveExpr = 17, RULE_multExpression = 18, 
		RULE_term = 19, RULE_intDefinition = 20, RULE_stringDeclaration = 21, 
		RULE_intAssignment = 22, RULE_stringAssignment = 23, RULE_len = 24, RULE_input = 25, 
		RULE_print = 26, RULE_read = 27, RULE_r_goto = 28, RULE_gosub = 29, RULE_label = 30, 
		RULE_funSignature = 31, RULE_callArgs = 32, RULE_callArg = 33, RULE_arg = 34, 
		RULE_intArg = 35, RULE_stringArg = 36, RULE_substringOrDecl = 37;
	public static final String[] ruleNames = {
		"program", "predefined", "intFunction", "stringFunction", "procedure", 
		"r_for", "r_if", "procReturn", "funReturn", "intReturn", "stringReturn", 
		"instructions", "instruction", "condition", "comp", "logTerm", "artmExpr", 
		"additiveExpr", "multExpression", "term", "intDefinition", "stringDeclaration", 
		"intAssignment", "stringAssignment", "len", "input", "print", "read", 
		"r_goto", "gosub", "label", "funSignature", "callArgs", "callArg", "arg", 
		"intArg", "stringArg", "substringOrDecl"
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
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_FUN) | (1L << STRING_FUN) | (1L << SUB))) != 0)) {
				{
				{
				setState(76);
				predefined();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(BEGIN);
			setState(83);
			match(NL);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IF) | (1L << LET) | (1L << DIM) | (1L << READ) | (1L << PRINT) | (1L << INPUT) | (1L << GOTO) | (1L << GOSUB) | (1L << STRING_ID) | (1L << ID))) != 0)) {
				{
				{
				setState(84);
				instructions();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			match(END);
			setState(91);
			match(NL);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << FOR) | (1L << IF) | (1L << LET) | (1L << DIM) | (1L << READ) | (1L << PRINT) | (1L << INPUT) | (1L << GOTO) | (1L << GOSUB) | (1L << STRING_ID) | (1L << ID))) != 0)) {
				{
				setState(94);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FOR:
				case IF:
				case LET:
				case DIM:
				case READ:
				case PRINT:
				case INPUT:
				case GOTO:
				case GOSUB:
				case STRING_ID:
				case ID:
					{
					setState(92);
					instructions();
					}
					break;
				case RETURN:
					{
					setState(93);
					procReturn();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(98);
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
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_FUN:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				stringFunction();
				}
				break;
			case INT_FUN:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				intFunction();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
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
			setState(104);
			match(INT_FUN);
			setState(105);
			funSignature();
			setState(106);
			match(NL);
			setState(107);
			instructions();
			setState(108);
			intReturn();
			setState(109);
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
			setState(111);
			match(STRING_FUN);
			setState(112);
			funSignature();
			setState(113);
			match(NL);
			setState(114);
			instructions();
			setState(115);
			stringReturn();
			setState(116);
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
			setState(118);
			match(SUB);
			setState(119);
			funSignature();
			setState(120);
			match(NL);
			setState(121);
			instructions();
			setState(122);
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
		public IntArgContext intArg() {
			return getRuleContext(IntArgContext.class,0);
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
			setState(124);
			match(FOR);
			setState(125);
			intAssignment();
			setState(126);
			match(TO);
			setState(127);
			intArg();
			setState(128);
			match(NL);
			setState(129);
			instructions();
			setState(130);
			match(NEXT);
			setState(131);
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
			setState(133);
			match(IF);
			setState(134);
			condition();
			setState(135);
			match(THEN);
			setState(136);
			match(NL);
			setState(137);
			instructions();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSIF || _la==ELSE) {
				{
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSIF) {
					{
					{
					setState(138);
					match(ELSIF);
					setState(139);
					condition();
					setState(140);
					match(THEN);
					setState(141);
					match(NL);
					setState(143); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(142);
						instructions();
						}
						}
						setState(145); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IF) | (1L << LET) | (1L << DIM) | (1L << READ) | (1L << PRINT) | (1L << INPUT) | (1L << GOTO) | (1L << GOSUB) | (1L << STRING_ID) | (1L << ID))) != 0) );
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(152);
				match(ELSE);
				setState(153);
				match(NL);
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(154);
					instructions();
					}
					}
					setState(157); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IF) | (1L << LET) | (1L << DIM) | (1L << READ) | (1L << PRINT) | (1L << INPUT) | (1L << GOTO) | (1L << GOSUB) | (1L << STRING_ID) | (1L << ID))) != 0) );
				}
			}

			setState(161);
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
			setState(163);
			match(RETURN);
			setState(164);
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

	public static class FunReturnContext extends ParserRuleContext {
		public IntReturnContext intReturn() {
			return getRuleContext(IntReturnContext.class,0);
		}
		public StringReturnContext stringReturn() {
			return getRuleContext(StringReturnContext.class,0);
		}
		public FunReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterFunReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitFunReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitFunReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunReturnContext funReturn() throws RecognitionException {
		FunReturnContext _localctx = new FunReturnContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funReturn);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				intReturn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
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

	public static class IntReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(BasicParser.RETURN, 0); }
		public IntArgContext intArg() {
			return getRuleContext(IntArgContext.class,0);
		}
		public FunSignatureContext funSignature() {
			return getRuleContext(FunSignatureContext.class,0);
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
		enterRule(_localctx, 18, RULE_intReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(RETURN);
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(171);
				intArg();
				}
				break;
			case 2:
				{
				setState(172);
				funSignature();
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
		enterRule(_localctx, 20, RULE_stringReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(RETURN);
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case STRING_ID:
				{
				setState(176);
				stringArg();
				}
				break;
			case ID:
				{
				setState(177);
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
		enterRule(_localctx, 22, RULE_instructions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(181);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						setState(180);
						label();
						}
						break;
					}
					setState(183);
					instruction();
					setState(184);
					match(NL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(188); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		enterRule(_localctx, 24, RULE_instruction);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				intDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				stringDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				intAssignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				stringAssignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				input();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(195);
				print();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(196);
				read();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(197);
				r_goto();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(198);
				gosub();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(199);
				funSignature();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(200);
				r_if();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(201);
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
		enterRule(_localctx, 26, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			comp();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOG_OPERATOR) {
				{
				{
				setState(205);
				match(LOG_OPERATOR);
				setState(206);
				comp();
				}
				}
				setState(211);
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
		enterRule(_localctx, 28, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			logTerm();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMP_OPERATOR) {
				{
				{
				setState(213);
				match(COMP_OPERATOR);
				setState(214);
				logTerm();
				}
				}
				setState(219);
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
		public TerminalNode NUMBER() { return getToken(BasicParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(BasicParser.ID, 0); }
		public FunSignatureContext funSignature() {
			return getRuleContext(FunSignatureContext.class,0);
		}
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
		enterRule(_localctx, 30, RULE_logTerm);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				funSignature();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(223);
				artmExpr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(224);
				match(LEFT_PARENTHESES);
				setState(225);
				condition();
				setState(226);
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
		enterRule(_localctx, 32, RULE_artmExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			additiveExpr();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(231);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(232);
				additiveExpr();
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
		enterRule(_localctx, 34, RULE_additiveExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			multExpression();
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTI_OPERATOR) {
				{
				{
				setState(239);
				match(MULTI_OPERATOR);
				setState(240);
				multExpression();
				}
				}
				setState(245);
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
		enterRule(_localctx, 36, RULE_multExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(246);
				match(MINUS);
				}
			}

			setState(249);
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
		enterRule(_localctx, 38, RULE_term);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				funSignature();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(254);
				len();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(255);
				match(LEFT_PARENTHESES);
				setState(256);
				artmExpr();
				setState(257);
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
		enterRule(_localctx, 40, RULE_intDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(LET);
			setState(262);
			intAssignment();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(263);
				match(COMMA);
				setState(264);
				intAssignment();
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
		enterRule(_localctx, 42, RULE_stringDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(DIM);
			setState(271);
			substringOrDecl();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(272);
				match(COMMA);
				setState(273);
				substringOrDecl();
				}
				}
				setState(278);
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
		public IntArgContext intArg() {
			return getRuleContext(IntArgContext.class,0);
		}
		public FunSignatureContext funSignature() {
			return getRuleContext(FunSignatureContext.class,0);
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
		enterRule(_localctx, 44, RULE_intAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(ID);
			setState(280);
			match(ASSIGN);
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(281);
				intArg();
				}
				break;
			case 2:
				{
				setState(282);
				funSignature();
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
		enterRule(_localctx, 46, RULE_stringAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(285);
				match(STRING_ID);
				}
				break;
			case 2:
				{
				setState(286);
				substringOrDecl();
				}
				break;
			}
			setState(289);
			match(ASSIGN);
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case STRING_ID:
				{
				setState(290);
				stringArg();
				}
				break;
			case ID:
				{
				setState(291);
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
		enterRule(_localctx, 48, RULE_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(LEN);
			setState(295);
			match(LEFT_PARENTHESES);
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case STRING_ID:
				{
				setState(296);
				stringArg();
				}
				break;
			case ID:
				{
				setState(297);
				funSignature();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(300);
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
		enterRule(_localctx, 50, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(INPUT);
			setState(303);
			match(ID);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(304);
				match(COMMA);
				setState(305);
				match(ID);
				}
				}
				setState(310);
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
		enterRule(_localctx, 52, RULE_print);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(PRINT);
			setState(312);
			arg();
			setState(317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(313);
					match(SEMICOLON);
					setState(314);
					arg();
					}
					} 
				}
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(320);
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
		enterRule(_localctx, 54, RULE_read);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(READ);
			setState(324);
			match(STRING_ID);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(325);
				match(COMMA);
				setState(326);
				match(STRING_ID);
				}
				}
				setState(331);
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
		enterRule(_localctx, 56, RULE_r_goto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(GOTO);
			setState(333);
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
		enterRule(_localctx, 58, RULE_gosub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(GOSUB);
			setState(336);
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
		enterRule(_localctx, 60, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(ID);
			setState(339);
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
		enterRule(_localctx, 62, RULE_funSignature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(ID);
			setState(342);
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
		enterRule(_localctx, 64, RULE_callArgs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(LEFT_BRACKET);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEN) | (1L << MINUS) | (1L << LEFT_PARENTHESES) | (1L << STRING) | (1L << STRING_ID) | (1L << ID) | (1L << NUMBER))) != 0)) {
				{
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(345);
						arg();
						setState(346);
						match(COMMA);
						}
						} 
					}
					setState(352);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				setState(353);
				arg();
				}
			}

			setState(356);
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
		public TerminalNode RIGHT_PARENTHESES() { return getToken(BasicParser.RIGHT_PARENTHESES, 0); }
		public IntArgContext intArg() {
			return getRuleContext(IntArgContext.class,0);
		}
		public FunSignatureContext funSignature() {
			return getRuleContext(FunSignatureContext.class,0);
		}
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
		enterRule(_localctx, 66, RULE_callArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(LEFT_PARENTHESES);
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(359);
				intArg();
				}
				break;
			case 2:
				{
				setState(360);
				funSignature();
				}
				break;
			}
			setState(363);
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
		public IntArgContext intArg() {
			return getRuleContext(IntArgContext.class,0);
		}
		public StringArgContext stringArg() {
			return getRuleContext(StringArgContext.class,0);
		}
		public FunSignatureContext funSignature() {
			return getRuleContext(FunSignatureContext.class,0);
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
		enterRule(_localctx, 68, RULE_arg);
		try {
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				intArg();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				stringArg();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				funSignature();
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

	public static class IntArgContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(BasicParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(BasicParser.ID, 0); }
		public ArtmExprContext artmExpr() {
			return getRuleContext(ArtmExprContext.class,0);
		}
		public LenContext len() {
			return getRuleContext(LenContext.class,0);
		}
		public IntArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterIntArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitIntArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitIntArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntArgContext intArg() throws RecognitionException {
		IntArgContext _localctx = new IntArgContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_intArg);
		try {
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(372);
				artmExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(373);
				len();
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
		enterRule(_localctx, 72, RULE_stringArg);
		try {
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				match(STRING_ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
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
		enterRule(_localctx, 74, RULE_substringOrDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(STRING_ID);
			setState(382);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0183\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\7\2P\n\2\f\2\16\2S\13"+
		"\2\3\2\3\2\3\2\7\2X\n\2\f\2\16\2[\13\2\3\2\3\2\3\2\3\2\7\2a\n\2\f\2\16"+
		"\2d\13\2\3\3\3\3\3\3\5\3i\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u0092\n\b\r\b\16\b"+
		"\u0093\7\b\u0096\n\b\f\b\16\b\u0099\13\b\3\b\3\b\3\b\6\b\u009e\n\b\r\b"+
		"\16\b\u009f\5\b\u00a2\n\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\5\n\u00ab\n\n\3"+
		"\13\3\13\3\13\5\13\u00b0\n\13\3\f\3\f\3\f\5\f\u00b5\n\f\3\r\5\r\u00b8"+
		"\n\r\3\r\3\r\3\r\6\r\u00bd\n\r\r\r\16\r\u00be\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00cd\n\16\3\17\3\17\3\17\7\17"+
		"\u00d2\n\17\f\17\16\17\u00d5\13\17\3\20\3\20\3\20\7\20\u00da\n\20\f\20"+
		"\16\20\u00dd\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00e7"+
		"\n\21\3\22\3\22\3\22\7\22\u00ec\n\22\f\22\16\22\u00ef\13\22\3\23\3\23"+
		"\3\23\7\23\u00f4\n\23\f\23\16\23\u00f7\13\23\3\24\5\24\u00fa\n\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0106\n\25\3\26\3\26"+
		"\3\26\3\26\7\26\u010c\n\26\f\26\16\26\u010f\13\26\3\27\3\27\3\27\3\27"+
		"\7\27\u0115\n\27\f\27\16\27\u0118\13\27\3\30\3\30\3\30\3\30\5\30\u011e"+
		"\n\30\3\31\3\31\5\31\u0122\n\31\3\31\3\31\3\31\5\31\u0127\n\31\3\32\3"+
		"\32\3\32\3\32\5\32\u012d\n\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u0135"+
		"\n\33\f\33\16\33\u0138\13\33\3\34\3\34\3\34\3\34\7\34\u013e\n\34\f\34"+
		"\16\34\u0141\13\34\3\34\5\34\u0144\n\34\3\35\3\35\3\35\3\35\7\35\u014a"+
		"\n\35\f\35\16\35\u014d\13\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\7\"\u015f\n\"\f\"\16\"\u0162\13\"\3\"\5\"\u0165"+
		"\n\"\3\"\3\"\3#\3#\3#\5#\u016c\n#\3#\3#\3$\3$\3$\5$\u0173\n$\3%\3%\3%"+
		"\3%\5%\u0179\n%\3&\3&\3&\5&\u017e\n&\3\'\3\'\3\'\3\'\2\2(\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\3\3\2\33"+
		"\34\2\u0197\2Q\3\2\2\2\4h\3\2\2\2\6j\3\2\2\2\bq\3\2\2\2\nx\3\2\2\2\f~"+
		"\3\2\2\2\16\u0087\3\2\2\2\20\u00a5\3\2\2\2\22\u00aa\3\2\2\2\24\u00ac\3"+
		"\2\2\2\26\u00b1\3\2\2\2\30\u00bc\3\2\2\2\32\u00cc\3\2\2\2\34\u00ce\3\2"+
		"\2\2\36\u00d6\3\2\2\2 \u00e6\3\2\2\2\"\u00e8\3\2\2\2$\u00f0\3\2\2\2&\u00f9"+
		"\3\2\2\2(\u0105\3\2\2\2*\u0107\3\2\2\2,\u0110\3\2\2\2.\u0119\3\2\2\2\60"+
		"\u0121\3\2\2\2\62\u0128\3\2\2\2\64\u0130\3\2\2\2\66\u0139\3\2\2\28\u0145"+
		"\3\2\2\2:\u014e\3\2\2\2<\u0151\3\2\2\2>\u0154\3\2\2\2@\u0157\3\2\2\2B"+
		"\u015a\3\2\2\2D\u0168\3\2\2\2F\u0172\3\2\2\2H\u0178\3\2\2\2J\u017d\3\2"+
		"\2\2L\u017f\3\2\2\2NP\5\4\3\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2"+
		"RT\3\2\2\2SQ\3\2\2\2TU\7\3\2\2UY\7+\2\2VX\5\30\r\2WV\3\2\2\2X[\3\2\2\2"+
		"YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7\4\2\2]b\7+\2\2^a\5\30\r"+
		"\2_a\5\20\t\2`^\3\2\2\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\3\3\2"+
		"\2\2db\3\2\2\2ei\5\b\5\2fi\5\6\4\2gi\5\n\6\2he\3\2\2\2hf\3\2\2\2hg\3\2"+
		"\2\2i\5\3\2\2\2jk\7\5\2\2kl\5@!\2lm\7+\2\2mn\5\30\r\2no\5\24\13\2op\7"+
		"+\2\2p\7\3\2\2\2qr\7\6\2\2rs\5@!\2st\7+\2\2tu\5\30\r\2uv\5\26\f\2vw\7"+
		"+\2\2w\t\3\2\2\2xy\7\b\2\2yz\5@!\2z{\7+\2\2{|\5\30\r\2|}\5\20\t\2}\13"+
		"\3\2\2\2~\177\7\t\2\2\177\u0080\5.\30\2\u0080\u0081\7\13\2\2\u0081\u0082"+
		"\5H%\2\u0082\u0083\7+\2\2\u0083\u0084\5\30\r\2\u0084\u0085\7\n\2\2\u0085"+
		"\u0086\7)\2\2\u0086\r\3\2\2\2\u0087\u0088\7\f\2\2\u0088\u0089\5\34\17"+
		"\2\u0089\u008a\7\r\2\2\u008a\u008b\7+\2\2\u008b\u00a1\5\30\r\2\u008c\u008d"+
		"\7\16\2\2\u008d\u008e\5\34\17\2\u008e\u008f\7\r\2\2\u008f\u0091\7+\2\2"+
		"\u0090\u0092\5\30\r\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u008c\3\2\2\2\u0096"+
		"\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2"+
		"\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7\17\2\2\u009b\u009d\7+\2\2\u009c"+
		"\u009e\5\30\r\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3"+
		"\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u0097\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7\20\2\2\u00a4\17\3\2\2"+
		"\2\u00a5\u00a6\7\7\2\2\u00a6\u00a7\7+\2\2\u00a7\21\3\2\2\2\u00a8\u00ab"+
		"\5\24\13\2\u00a9\u00ab\5\26\f\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2"+
		"\2\u00ab\23\3\2\2\2\u00ac\u00af\7\7\2\2\u00ad\u00b0\5H%\2\u00ae\u00b0"+
		"\5@!\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\25\3\2\2\2\u00b1"+
		"\u00b4\7\7\2\2\u00b2\u00b5\5J&\2\u00b3\u00b5\5@!\2\u00b4\u00b2\3\2\2\2"+
		"\u00b4\u00b3\3\2\2\2\u00b5\27\3\2\2\2\u00b6\u00b8\5> \2\u00b7\u00b6\3"+
		"\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\5\32\16\2\u00ba"+
		"\u00bb\7+\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\31\3\2\2\2\u00c0\u00cd"+
		"\5*\26\2\u00c1\u00cd\5,\27\2\u00c2\u00cd\5.\30\2\u00c3\u00cd\5\60\31\2"+
		"\u00c4\u00cd\5\64\33\2\u00c5\u00cd\5\66\34\2\u00c6\u00cd\58\35\2\u00c7"+
		"\u00cd\5:\36\2\u00c8\u00cd\5<\37\2\u00c9\u00cd\5@!\2\u00ca\u00cd\5\16"+
		"\b\2\u00cb\u00cd\5\f\7\2\u00cc\u00c0\3\2\2\2\u00cc\u00c1\3\2\2\2\u00cc"+
		"\u00c2\3\2\2\2\u00cc\u00c3\3\2\2\2\u00cc\u00c4\3\2\2\2\u00cc\u00c5\3\2"+
		"\2\2\u00cc\u00c6\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cc"+
		"\u00c9\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\33\3\2\2"+
		"\2\u00ce\u00d3\5\36\20\2\u00cf\u00d0\7\31\2\2\u00d0\u00d2\5\36\20\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\35\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00db\5 \21\2\u00d7\u00d8"+
		"\7\32\2\2\u00d8\u00da\5 \21\2\u00d9\u00d7\3\2\2\2\u00da\u00dd\3\2\2\2"+
		"\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\37\3\2\2\2\u00dd\u00db"+
		"\3\2\2\2\u00de\u00e7\7*\2\2\u00df\u00e7\7)\2\2\u00e0\u00e7\5@!\2\u00e1"+
		"\u00e7\5\"\22\2\u00e2\u00e3\7\"\2\2\u00e3\u00e4\5\34\17\2\u00e4\u00e5"+
		"\7#\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00de\3\2\2\2\u00e6\u00df\3\2\2\2\u00e6"+
		"\u00e0\3\2\2\2\u00e6\u00e1\3\2\2\2\u00e6\u00e2\3\2\2\2\u00e7!\3\2\2\2"+
		"\u00e8\u00ed\5$\23\2\u00e9\u00ea\t\2\2\2\u00ea\u00ec\5$\23\2\u00eb\u00e9"+
		"\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"#\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f5\5&\24\2\u00f1\u00f2\7\35\2\2"+
		"\u00f2\u00f4\5&\24\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6%\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u00fa\7\34\2\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3"+
		"\2\2\2\u00fb\u00fc\5(\25\2\u00fc\'\3\2\2\2\u00fd\u0106\7*\2\2\u00fe\u0106"+
		"\7)\2\2\u00ff\u0106\5@!\2\u0100\u0106\5\62\32\2\u0101\u0102\7\"\2\2\u0102"+
		"\u0103\5\"\22\2\u0103\u0104\7#\2\2\u0104\u0106\3\2\2\2\u0105\u00fd\3\2"+
		"\2\2\u0105\u00fe\3\2\2\2\u0105\u00ff\3\2\2\2\u0105\u0100\3\2\2\2\u0105"+
		"\u0101\3\2\2\2\u0106)\3\2\2\2\u0107\u0108\7\21\2\2\u0108\u010d\5.\30\2"+
		"\u0109\u010a\7$\2\2\u010a\u010c\5.\30\2\u010b\u0109\3\2\2\2\u010c\u010f"+
		"\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e+\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0111\7\22\2\2\u0111\u0116\5L\'\2\u0112\u0113\7$"+
		"\2\2\u0113\u0115\5L\'\2\u0114\u0112\3\2\2\2\u0115\u0118\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117-\3\2\2\2\u0118\u0116\3\2\2\2"+
		"\u0119\u011a\7)\2\2\u011a\u011d\7\36\2\2\u011b\u011e\5H%\2\u011c\u011e"+
		"\5@!\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e/\3\2\2\2\u011f\u0122"+
		"\7(\2\2\u0120\u0122\5L\'\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0126\7\36\2\2\u0124\u0127\5J&\2\u0125\u0127\5@!"+
		"\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127\61\3\2\2\2\u0128\u0129"+
		"\7\26\2\2\u0129\u012c\7\"\2\2\u012a\u012d\5J&\2\u012b\u012d\5@!\2\u012c"+
		"\u012a\3\2\2\2\u012c\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\7#"+
		"\2\2\u012f\63\3\2\2\2\u0130\u0131\7\25\2\2\u0131\u0136\7)\2\2\u0132\u0133"+
		"\7$\2\2\u0133\u0135\7)\2\2\u0134\u0132\3\2\2\2\u0135\u0138\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\65\3\2\2\2\u0138\u0136\3\2\2"+
		"\2\u0139\u013a\7\24\2\2\u013a\u013f\5F$\2\u013b\u013c\7\37\2\2\u013c\u013e"+
		"\5F$\2\u013d\u013b\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0144\7\37"+
		"\2\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\67\3\2\2\2\u0145\u0146"+
		"\7\23\2\2\u0146\u014b\7(\2\2\u0147\u0148\7$\2\2\u0148\u014a\7(\2\2\u0149"+
		"\u0147\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2"+
		"\2\2\u014c9\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f\7\27\2\2\u014f\u0150"+
		"\7)\2\2\u0150;\3\2\2\2\u0151\u0152\7\30\2\2\u0152\u0153\7)\2\2\u0153="+
		"\3\2\2\2\u0154\u0155\7)\2\2\u0155\u0156\7 \2\2\u0156?\3\2\2\2\u0157\u0158"+
		"\7)\2\2\u0158\u0159\5B\"\2\u0159A\3\2\2\2\u015a\u0164\7%\2\2\u015b\u015c"+
		"\5F$\2\u015c\u015d\7$\2\2\u015d\u015f\3\2\2\2\u015e\u015b\3\2\2\2\u015f"+
		"\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0163\3\2"+
		"\2\2\u0162\u0160\3\2\2\2\u0163\u0165\5F$\2\u0164\u0160\3\2\2\2\u0164\u0165"+
		"\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\7&\2\2\u0167C\3\2\2\2\u0168\u016b"+
		"\7\"\2\2\u0169\u016c\5H%\2\u016a\u016c\5@!\2\u016b\u0169\3\2\2\2\u016b"+
		"\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\7#\2\2\u016eE\3\2\2\2\u016f"+
		"\u0173\5H%\2\u0170\u0173\5J&\2\u0171\u0173\5@!\2\u0172\u016f\3\2\2\2\u0172"+
		"\u0170\3\2\2\2\u0172\u0171\3\2\2\2\u0173G\3\2\2\2\u0174\u0179\7*\2\2\u0175"+
		"\u0179\7)\2\2\u0176\u0179\5\"\22\2\u0177\u0179\5\62\32\2\u0178\u0174\3"+
		"\2\2\2\u0178\u0175\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0177\3\2\2\2\u0179"+
		"I\3\2\2\2\u017a\u017e\7\'\2\2\u017b\u017e\7(\2\2\u017c\u017e\5L\'\2\u017d"+
		"\u017a\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017c\3\2\2\2\u017eK\3\2\2\2"+
		"\u017f\u0180\7(\2\2\u0180\u0181\5D#\2\u0181M\3\2\2\2(QY`bh\u0093\u0097"+
		"\u009f\u00a1\u00aa\u00af\u00b4\u00b7\u00be\u00cc\u00d3\u00db\u00e6\u00ed"+
		"\u00f5\u00f9\u0105\u010d\u0116\u011d\u0121\u0126\u012c\u0136\u013f\u0143"+
		"\u014b\u0160\u0164\u016b\u0172\u0178\u017d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}