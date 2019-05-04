// Generated from Basic.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BasicLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, END=2, INT_FUN=3, STRING_FUN=4, RETURN=5, SUB=6, FOR=7, NEXT=8, 
		TO=9, IF=10, THEN=11, ELSIF=12, ELSE=13, ENDIF=14, LET=15, DIM=16, READ=17, 
		PRINT=18, INPUT=19, LEN=20, GOTO=21, GOSUB=22, LOG_OPERATOR=23, COMP_OPERATOR=24, 
		PLUS=25, ADD_OPERATOR=26, MINUS=27, MULTI_OPERATOR=28, ASSIGN=29, SEMICOLON=30, 
		NUMBER_SIGN=31, DOLLAR=32, LEFT_PARENTHESES=33, RIGHT_PARENTHESES=34, 
		COMMA=35, LEFT_BRACKET=36, RIGHT_BRACKET=37, STRING=38, STRING_ID=39, 
		ID=40, NUMBER=41, NL=42, WH=43, COMMENT=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BEGIN", "END", "INT_FUN", "STRING_FUN", "RETURN", "SUB", "FOR", "NEXT", 
		"TO", "IF", "THEN", "ELSIF", "ELSE", "ENDIF", "LET", "DIM", "READ", "PRINT", 
		"INPUT", "LEN", "GOTO", "GOSUB", "LOG_OPERATOR", "COMP_OPERATOR", "PLUS", 
		"ADD_OPERATOR", "MINUS", "MULTI_OPERATOR", "ASSIGN", "SEMICOLON", "NUMBER_SIGN", 
		"DOLLAR", "LEFT_PARENTHESES", "RIGHT_PARENTHESES", "COMMA", "LEFT_BRACKET", 
		"RIGHT_BRACKET", "STRING", "STRING_ID", "ID", "NUMBER", "DIGIT", "LETTER", 
		"NL", "WH", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'BEGIN'", "'END'", "'FUNCTION'", "'FUNCTION$'", "'RETURN'", "'SUB'", 
		"'FOR'", "'NEXT'", "'TO'", "'IF'", "'THEN'", "'ELSIF'", "'ELSE'", "'ENDIF'", 
		"'LET'", "'DIM'", "'READ'", null, "'INPUT'", "'LEN'", "'GOTO'", "'GOSUB'", 
		null, null, "'+'", null, "'-'", null, "'='", "';'", "'#'", "'$'", "'('", 
		"')'", "','", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGIN", "END", "INT_FUN", "STRING_FUN", "RETURN", "SUB", "FOR", 
		"NEXT", "TO", "IF", "THEN", "ELSIF", "ELSE", "ENDIF", "LET", "DIM", "READ", 
		"PRINT", "INPUT", "LEN", "GOTO", "GOSUB", "LOG_OPERATOR", "COMP_OPERATOR", 
		"PLUS", "ADD_OPERATOR", "MINUS", "MULTI_OPERATOR", "ASSIGN", "SEMICOLON", 
		"NUMBER_SIGN", "DOLLAR", "LEFT_PARENTHESES", "RIGHT_PARENTHESES", "COMMA", 
		"LEFT_BRACKET", "RIGHT_BRACKET", "STRING", "STRING_ID", "ID", "NUMBER", 
		"NL", "WH", "COMMENT"
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


	public BasicLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Basic.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u013d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u00c0\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u00dc\n\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u00e7\n\31\3\32\3\32\3\33\3\33\5\33\u00ed\n\33\3"+
		"\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3"+
		"$\3%\3%\3&\3&\3\'\3\'\7\'\u0107\n\'\f\'\16\'\u010a\13\'\3\'\3\'\3(\3("+
		"\3(\3)\3)\3)\3)\7)\u0115\n)\f)\16)\u0118\13)\3*\6*\u011b\n*\r*\16*\u011c"+
		"\3+\3+\3,\3,\3-\5-\u0124\n-\3-\3-\6-\u0128\n-\r-\16-\u0129\3.\3.\3.\3"+
		".\3/\3/\3/\3/\3/\7/\u0135\n/\f/\16/\u0138\13/\3/\3/\3/\3/\2\2\60\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U\2W\2Y,[-].\3\2\n\4\2>>@@\4\2,,\61\61\3\2$$\3\2"+
		"\62;\4\2C\\c|\4\2\17\17<<\4\2\13\13\"\"\5\2\f\f\17\17<<\2\u014a\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2Y\3\2"+
		"\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5e\3\2\2\2\7i\3\2\2\2\tr\3\2\2\2"+
		"\13|\3\2\2\2\r\u0083\3\2\2\2\17\u0087\3\2\2\2\21\u008b\3\2\2\2\23\u0090"+
		"\3\2\2\2\25\u0093\3\2\2\2\27\u0096\3\2\2\2\31\u009b\3\2\2\2\33\u00a1\3"+
		"\2\2\2\35\u00a6\3\2\2\2\37\u00ac\3\2\2\2!\u00b0\3\2\2\2#\u00b4\3\2\2\2"+
		"%\u00bf\3\2\2\2\'\u00c1\3\2\2\2)\u00c7\3\2\2\2+\u00cb\3\2\2\2-\u00d0\3"+
		"\2\2\2/\u00db\3\2\2\2\61\u00e6\3\2\2\2\63\u00e8\3\2\2\2\65\u00ec\3\2\2"+
		"\2\67\u00ee\3\2\2\29\u00f0\3\2\2\2;\u00f2\3\2\2\2=\u00f4\3\2\2\2?\u00f6"+
		"\3\2\2\2A\u00f8\3\2\2\2C\u00fa\3\2\2\2E\u00fc\3\2\2\2G\u00fe\3\2\2\2I"+
		"\u0100\3\2\2\2K\u0102\3\2\2\2M\u0104\3\2\2\2O\u010d\3\2\2\2Q\u0110\3\2"+
		"\2\2S\u011a\3\2\2\2U\u011e\3\2\2\2W\u0120\3\2\2\2Y\u0127\3\2\2\2[\u012b"+
		"\3\2\2\2]\u012f\3\2\2\2_`\7D\2\2`a\7G\2\2ab\7I\2\2bc\7K\2\2cd\7P\2\2d"+
		"\4\3\2\2\2ef\7G\2\2fg\7P\2\2gh\7F\2\2h\6\3\2\2\2ij\7H\2\2jk\7W\2\2kl\7"+
		"P\2\2lm\7E\2\2mn\7V\2\2no\7K\2\2op\7Q\2\2pq\7P\2\2q\b\3\2\2\2rs\7H\2\2"+
		"st\7W\2\2tu\7P\2\2uv\7E\2\2vw\7V\2\2wx\7K\2\2xy\7Q\2\2yz\7P\2\2z{\7&\2"+
		"\2{\n\3\2\2\2|}\7T\2\2}~\7G\2\2~\177\7V\2\2\177\u0080\7W\2\2\u0080\u0081"+
		"\7T\2\2\u0081\u0082\7P\2\2\u0082\f\3\2\2\2\u0083\u0084\7U\2\2\u0084\u0085"+
		"\7W\2\2\u0085\u0086\7D\2\2\u0086\16\3\2\2\2\u0087\u0088\7H\2\2\u0088\u0089"+
		"\7Q\2\2\u0089\u008a\7T\2\2\u008a\20\3\2\2\2\u008b\u008c\7P\2\2\u008c\u008d"+
		"\7G\2\2\u008d\u008e\7Z\2\2\u008e\u008f\7V\2\2\u008f\22\3\2\2\2\u0090\u0091"+
		"\7V\2\2\u0091\u0092\7Q\2\2\u0092\24\3\2\2\2\u0093\u0094\7K\2\2\u0094\u0095"+
		"\7H\2\2\u0095\26\3\2\2\2\u0096\u0097\7V\2\2\u0097\u0098\7J\2\2\u0098\u0099"+
		"\7G\2\2\u0099\u009a\7P\2\2\u009a\30\3\2\2\2\u009b\u009c\7G\2\2\u009c\u009d"+
		"\7N\2\2\u009d\u009e\7U\2\2\u009e\u009f\7K\2\2\u009f\u00a0\7H\2\2\u00a0"+
		"\32\3\2\2\2\u00a1\u00a2\7G\2\2\u00a2\u00a3\7N\2\2\u00a3\u00a4\7U\2\2\u00a4"+
		"\u00a5\7G\2\2\u00a5\34\3\2\2\2\u00a6\u00a7\7G\2\2\u00a7\u00a8\7P\2\2\u00a8"+
		"\u00a9\7F\2\2\u00a9\u00aa\7K\2\2\u00aa\u00ab\7H\2\2\u00ab\36\3\2\2\2\u00ac"+
		"\u00ad\7N\2\2\u00ad\u00ae\7G\2\2\u00ae\u00af\7V\2\2\u00af \3\2\2\2\u00b0"+
		"\u00b1\7F\2\2\u00b1\u00b2\7K\2\2\u00b2\u00b3\7O\2\2\u00b3\"\3\2\2\2\u00b4"+
		"\u00b5\7T\2\2\u00b5\u00b6\7G\2\2\u00b6\u00b7\7C\2\2\u00b7\u00b8\7F\2\2"+
		"\u00b8$\3\2\2\2\u00b9\u00ba\7R\2\2\u00ba\u00bb\7T\2\2\u00bb\u00bc\7K\2"+
		"\2\u00bc\u00bd\7P\2\2\u00bd\u00c0\7V\2\2\u00be\u00c0\7A\2\2\u00bf\u00b9"+
		"\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0&\3\2\2\2\u00c1\u00c2\7K\2\2\u00c2\u00c3"+
		"\7P\2\2\u00c3\u00c4\7R\2\2\u00c4\u00c5\7W\2\2\u00c5\u00c6\7V\2\2\u00c6"+
		"(\3\2\2\2\u00c7\u00c8\7N\2\2\u00c8\u00c9\7G\2\2\u00c9\u00ca\7P\2\2\u00ca"+
		"*\3\2\2\2\u00cb\u00cc\7I\2\2\u00cc\u00cd\7Q\2\2\u00cd\u00ce\7V\2\2\u00ce"+
		"\u00cf\7Q\2\2\u00cf,\3\2\2\2\u00d0\u00d1\7I\2\2\u00d1\u00d2\7Q\2\2\u00d2"+
		"\u00d3\7U\2\2\u00d3\u00d4\7W\2\2\u00d4\u00d5\7D\2\2\u00d5.\3\2\2\2\u00d6"+
		"\u00d7\7C\2\2\u00d7\u00d8\7P\2\2\u00d8\u00dc\7F\2\2\u00d9\u00da\7Q\2\2"+
		"\u00da\u00dc\7T\2\2\u00db\u00d6\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\60\3"+
		"\2\2\2\u00dd\u00e7\t\2\2\2\u00de\u00df\7>\2\2\u00df\u00e7\7@\2\2\u00e0"+
		"\u00e1\7?\2\2\u00e1\u00e7\7?\2\2\u00e2\u00e3\7>\2\2\u00e3\u00e7\7?\2\2"+
		"\u00e4\u00e5\7@\2\2\u00e5\u00e7\7?\2\2\u00e6\u00dd\3\2\2\2\u00e6\u00de"+
		"\3\2\2\2\u00e6\u00e0\3\2\2\2\u00e6\u00e2\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7"+
		"\62\3\2\2\2\u00e8\u00e9\7-\2\2\u00e9\64\3\2\2\2\u00ea\u00ed\7-\2\2\u00eb"+
		"\u00ed\5\67\34\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\66\3\2"+
		"\2\2\u00ee\u00ef\7/\2\2\u00ef8\3\2\2\2\u00f0\u00f1\t\3\2\2\u00f1:\3\2"+
		"\2\2\u00f2\u00f3\7?\2\2\u00f3<\3\2\2\2\u00f4\u00f5\7=\2\2\u00f5>\3\2\2"+
		"\2\u00f6\u00f7\7%\2\2\u00f7@\3\2\2\2\u00f8\u00f9\7&\2\2\u00f9B\3\2\2\2"+
		"\u00fa\u00fb\7*\2\2\u00fbD\3\2\2\2\u00fc\u00fd\7+\2\2\u00fdF\3\2\2\2\u00fe"+
		"\u00ff\7.\2\2\u00ffH\3\2\2\2\u0100\u0101\7]\2\2\u0101J\3\2\2\2\u0102\u0103"+
		"\7_\2\2\u0103L\3\2\2\2\u0104\u0108\7$\2\2\u0105\u0107\n\4\2\2\u0106\u0105"+
		"\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c\7$\2\2\u010cN\3\2\2\2\u010d"+
		"\u010e\5Q)\2\u010e\u010f\5A!\2\u010fP\3\2\2\2\u0110\u0116\5W,\2\u0111"+
		"\u0115\5W,\2\u0112\u0115\5U+\2\u0113\u0115\7a\2\2\u0114\u0111\3\2\2\2"+
		"\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117R\3\2\2\2\u0118\u0116\3\2\2\2\u0119"+
		"\u011b\5U+\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a\3\2\2"+
		"\2\u011c\u011d\3\2\2\2\u011dT\3\2\2\2\u011e\u011f\t\5\2\2\u011fV\3\2\2"+
		"\2\u0120\u0121\t\6\2\2\u0121X\3\2\2\2\u0122\u0124\7\17\2\2\u0123\u0122"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0128\7\f\2\2\u0126"+
		"\u0128\t\7\2\2\u0127\u0123\3\2\2\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012aZ\3\2\2\2\u012b\u012c"+
		"\t\b\2\2\u012c\u012d\3\2\2\2\u012d\u012e\b.\2\2\u012e\\\3\2\2\2\u012f"+
		"\u0130\7T\2\2\u0130\u0131\7G\2\2\u0131\u0132\7O\2\2\u0132\u0136\3\2\2"+
		"\2\u0133\u0135\n\t\2\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134"+
		"\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u0136\3\2\2\2\u0139"+
		"\u013a\5Y-\2\u013a\u013b\3\2\2\2\u013b\u013c\b/\2\2\u013c^\3\2\2\2\17"+
		"\2\u00bf\u00db\u00e6\u00ec\u0108\u0114\u0116\u011c\u0123\u0127\u0129\u0136"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}