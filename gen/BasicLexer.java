// Generated from C:/Users/gabos/IdeaProjects/basic/src/main/antlr4\Basic.g4 by ANTLR 4.7
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
		PLUS=25, MINUS=26, MULTI_OPERATOR=27, ASSIGN=28, SEMICOLON=29, NUMBER_SIGN=30, 
		DOLLAR=31, LEFT_PARENTHESES=32, RIGHT_PARENTHESES=33, COMMA=34, LEFT_BRACKET=35, 
		RIGHT_BRACKET=36, STRING=37, STRING_ID=38, ID=39, NUMBER=40, NL=41, WH=42, 
		COMMENT=43;
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
		"MINUS", "MULTI_OPERATOR", "ASSIGN", "SEMICOLON", "NUMBER_SIGN", "DOLLAR", 
		"LEFT_PARENTHESES", "RIGHT_PARENTHESES", "COMMA", "LEFT_BRACKET", "RIGHT_BRACKET", 
		"STRING", "STRING_ID", "ID", "NUMBER", "DIGIT", "LETTER", "NL", "WH", 
		"COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0137\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u00be\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u00da\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u00e5\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\7&\u0101\n"+
		"&\f&\16&\u0104\13&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\7(\u010f\n(\f(\16(\u0112"+
		"\13(\3)\6)\u0115\n)\r)\16)\u0116\3*\3*\3+\3+\3,\5,\u011e\n,\3,\3,\6,\u0122"+
		"\n,\r,\16,\u0123\3-\3-\3-\3-\3.\3.\3.\3.\3.\7.\u012f\n.\f.\16.\u0132\13"+
		".\3.\3.\3.\3.\2\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S\2U\2W+Y,[-\3\2\n\4\2>>@"+
		"@\4\2,,\61\61\3\2$$\3\2\62;\4\2C\\c|\4\2\17\17<<\4\2\13\13\"\"\5\2\f\f"+
		"\17\17<<\2\u0143\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5c\3\2\2\2\7g\3\2\2\2"+
		"\tp\3\2\2\2\13z\3\2\2\2\r\u0081\3\2\2\2\17\u0085\3\2\2\2\21\u0089\3\2"+
		"\2\2\23\u008e\3\2\2\2\25\u0091\3\2\2\2\27\u0094\3\2\2\2\31\u0099\3\2\2"+
		"\2\33\u009f\3\2\2\2\35\u00a4\3\2\2\2\37\u00aa\3\2\2\2!\u00ae\3\2\2\2#"+
		"\u00b2\3\2\2\2%\u00bd\3\2\2\2\'\u00bf\3\2\2\2)\u00c5\3\2\2\2+\u00c9\3"+
		"\2\2\2-\u00ce\3\2\2\2/\u00d9\3\2\2\2\61\u00e4\3\2\2\2\63\u00e6\3\2\2\2"+
		"\65\u00e8\3\2\2\2\67\u00ea\3\2\2\29\u00ec\3\2\2\2;\u00ee\3\2\2\2=\u00f0"+
		"\3\2\2\2?\u00f2\3\2\2\2A\u00f4\3\2\2\2C\u00f6\3\2\2\2E\u00f8\3\2\2\2G"+
		"\u00fa\3\2\2\2I\u00fc\3\2\2\2K\u00fe\3\2\2\2M\u0107\3\2\2\2O\u010a\3\2"+
		"\2\2Q\u0114\3\2\2\2S\u0118\3\2\2\2U\u011a\3\2\2\2W\u0121\3\2\2\2Y\u0125"+
		"\3\2\2\2[\u0129\3\2\2\2]^\7D\2\2^_\7G\2\2_`\7I\2\2`a\7K\2\2ab\7P\2\2b"+
		"\4\3\2\2\2cd\7G\2\2de\7P\2\2ef\7F\2\2f\6\3\2\2\2gh\7H\2\2hi\7W\2\2ij\7"+
		"P\2\2jk\7E\2\2kl\7V\2\2lm\7K\2\2mn\7Q\2\2no\7P\2\2o\b\3\2\2\2pq\7H\2\2"+
		"qr\7W\2\2rs\7P\2\2st\7E\2\2tu\7V\2\2uv\7K\2\2vw\7Q\2\2wx\7P\2\2xy\7&\2"+
		"\2y\n\3\2\2\2z{\7T\2\2{|\7G\2\2|}\7V\2\2}~\7W\2\2~\177\7T\2\2\177\u0080"+
		"\7P\2\2\u0080\f\3\2\2\2\u0081\u0082\7U\2\2\u0082\u0083\7W\2\2\u0083\u0084"+
		"\7D\2\2\u0084\16\3\2\2\2\u0085\u0086\7H\2\2\u0086\u0087\7Q\2\2\u0087\u0088"+
		"\7T\2\2\u0088\20\3\2\2\2\u0089\u008a\7P\2\2\u008a\u008b\7G\2\2\u008b\u008c"+
		"\7Z\2\2\u008c\u008d\7V\2\2\u008d\22\3\2\2\2\u008e\u008f\7V\2\2\u008f\u0090"+
		"\7Q\2\2\u0090\24\3\2\2\2\u0091\u0092\7K\2\2\u0092\u0093\7H\2\2\u0093\26"+
		"\3\2\2\2\u0094\u0095\7V\2\2\u0095\u0096\7J\2\2\u0096\u0097\7G\2\2\u0097"+
		"\u0098\7P\2\2\u0098\30\3\2\2\2\u0099\u009a\7G\2\2\u009a\u009b\7N\2\2\u009b"+
		"\u009c\7U\2\2\u009c\u009d\7K\2\2\u009d\u009e\7H\2\2\u009e\32\3\2\2\2\u009f"+
		"\u00a0\7G\2\2\u00a0\u00a1\7N\2\2\u00a1\u00a2\7U\2\2\u00a2\u00a3\7G\2\2"+
		"\u00a3\34\3\2\2\2\u00a4\u00a5\7G\2\2\u00a5\u00a6\7P\2\2\u00a6\u00a7\7"+
		"F\2\2\u00a7\u00a8\7K\2\2\u00a8\u00a9\7H\2\2\u00a9\36\3\2\2\2\u00aa\u00ab"+
		"\7N\2\2\u00ab\u00ac\7G\2\2\u00ac\u00ad\7V\2\2\u00ad \3\2\2\2\u00ae\u00af"+
		"\7F\2\2\u00af\u00b0\7K\2\2\u00b0\u00b1\7O\2\2\u00b1\"\3\2\2\2\u00b2\u00b3"+
		"\7T\2\2\u00b3\u00b4\7G\2\2\u00b4\u00b5\7C\2\2\u00b5\u00b6\7F\2\2\u00b6"+
		"$\3\2\2\2\u00b7\u00b8\7R\2\2\u00b8\u00b9\7T\2\2\u00b9\u00ba\7K\2\2\u00ba"+
		"\u00bb\7P\2\2\u00bb\u00be\7V\2\2\u00bc\u00be\7A\2\2\u00bd\u00b7\3\2\2"+
		"\2\u00bd\u00bc\3\2\2\2\u00be&\3\2\2\2\u00bf\u00c0\7K\2\2\u00c0\u00c1\7"+
		"P\2\2\u00c1\u00c2\7R\2\2\u00c2\u00c3\7W\2\2\u00c3\u00c4\7V\2\2\u00c4("+
		"\3\2\2\2\u00c5\u00c6\7N\2\2\u00c6\u00c7\7G\2\2\u00c7\u00c8\7P\2\2\u00c8"+
		"*\3\2\2\2\u00c9\u00ca\7I\2\2\u00ca\u00cb\7Q\2\2\u00cb\u00cc\7V\2\2\u00cc"+
		"\u00cd\7Q\2\2\u00cd,\3\2\2\2\u00ce\u00cf\7I\2\2\u00cf\u00d0\7Q\2\2\u00d0"+
		"\u00d1\7U\2\2\u00d1\u00d2\7W\2\2\u00d2\u00d3\7D\2\2\u00d3.\3\2\2\2\u00d4"+
		"\u00d5\7C\2\2\u00d5\u00d6\7P\2\2\u00d6\u00da\7F\2\2\u00d7\u00d8\7Q\2\2"+
		"\u00d8\u00da\7T\2\2\u00d9\u00d4\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\60\3"+
		"\2\2\2\u00db\u00e5\t\2\2\2\u00dc\u00dd\7>\2\2\u00dd\u00e5\7@\2\2\u00de"+
		"\u00df\7?\2\2\u00df\u00e5\7?\2\2\u00e0\u00e1\7>\2\2\u00e1\u00e5\7?\2\2"+
		"\u00e2\u00e3\7@\2\2\u00e3\u00e5\7?\2\2\u00e4\u00db\3\2\2\2\u00e4\u00dc"+
		"\3\2\2\2\u00e4\u00de\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\62\3\2\2\2\u00e6\u00e7\7-\2\2\u00e7\64\3\2\2\2\u00e8\u00e9\7/\2\2\u00e9"+
		"\66\3\2\2\2\u00ea\u00eb\t\3\2\2\u00eb8\3\2\2\2\u00ec\u00ed\7?\2\2\u00ed"+
		":\3\2\2\2\u00ee\u00ef\7=\2\2\u00ef<\3\2\2\2\u00f0\u00f1\7%\2\2\u00f1>"+
		"\3\2\2\2\u00f2\u00f3\7&\2\2\u00f3@\3\2\2\2\u00f4\u00f5\7*\2\2\u00f5B\3"+
		"\2\2\2\u00f6\u00f7\7+\2\2\u00f7D\3\2\2\2\u00f8\u00f9\7.\2\2\u00f9F\3\2"+
		"\2\2\u00fa\u00fb\7]\2\2\u00fbH\3\2\2\2\u00fc\u00fd\7_\2\2\u00fdJ\3\2\2"+
		"\2\u00fe\u0102\7$\2\2\u00ff\u0101\n\4\2\2\u0100\u00ff\3\2\2\2\u0101\u0104"+
		"\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0105\u0106\7$\2\2\u0106L\3\2\2\2\u0107\u0108\5O(\2\u0108"+
		"\u0109\5? \2\u0109N\3\2\2\2\u010a\u0110\5U+\2\u010b\u010f\5U+\2\u010c"+
		"\u010f\5S*\2\u010d\u010f\7a\2\2\u010e\u010b\3\2\2\2\u010e\u010c\3\2\2"+
		"\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111"+
		"\3\2\2\2\u0111P\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0115\5S*\2\u0114\u0113"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"R\3\2\2\2\u0118\u0119\t\5\2\2\u0119T\3\2\2\2\u011a\u011b\t\6\2\2\u011b"+
		"V\3\2\2\2\u011c\u011e\7\17\2\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2"+
		"\u011e\u011f\3\2\2\2\u011f\u0122\7\f\2\2\u0120\u0122\t\7\2\2\u0121\u011d"+
		"\3\2\2\2\u0121\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124X\3\2\2\2\u0125\u0126\t\b\2\2\u0126\u0127\3\2\2\2"+
		"\u0127\u0128\b-\2\2\u0128Z\3\2\2\2\u0129\u012a\7T\2\2\u012a\u012b\7G\2"+
		"\2\u012b\u012c\7O\2\2\u012c\u0130\3\2\2\2\u012d\u012f\n\t\2\2\u012e\u012d"+
		"\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\5W,\2\u0134\u0135\3\2\2"+
		"\2\u0135\u0136\b.\2\2\u0136\\\3\2\2\2\16\2\u00bd\u00d9\u00e4\u0102\u010e"+
		"\u0110\u0116\u011d\u0121\u0123\u0130\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}