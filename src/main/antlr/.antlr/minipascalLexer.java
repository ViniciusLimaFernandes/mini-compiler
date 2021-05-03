// Generated from c:\Users\vinil\Documents\workspace\mini-compiler\src\main\antlr\minipascal.g4 by ANTLR 4.8

    //This header adds the lexer exactly to the package that de application are looking for
    package tcc.lexer.analyzer;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class minipascalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, BEGIN=2, END=3, BEGIN_EXECUTION=4, END_EXECUTION=5, DO=6, CONSOLE=7, 
		WHILE=8, FOR=9, TYPES=10, OPERATORS=11, COMPARATORS=12, NUMBERS=13, QUOTES=14, 
		ID=15, STRING_CONTENT=16, CONTENT=17, COMMENTS=18, COMMA=19, EQUALS=20, 
		ASSIGN=21, SEMICOLON=22, BRACKET_OPEN=23, BRACKET_CLOSE=24, SPECIAL=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROGRAM", "BEGIN", "END", "BEGIN_EXECUTION", "END_EXECUTION", "DO", 
			"CONSOLE", "WHILE", "FOR", "TYPES", "OPERATORS", "COMPARATORS", "NUMBERS", 
			"QUOTES", "ID", "STRING_CONTENT", "CONTENT", "COMMENTS", "COMMA", "EQUALS", 
			"ASSIGN", "SEMICOLON", "BRACKET_OPEN", "BRACKET_CLOSE", "SPECIAL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Program'", "'Begin'", "'End.'", "'begin'", "'end'", "'do'", null, 
			"'while'", "'for'", null, null, null, null, "'\"'", null, null, null, 
			null, "','", "'='", "':='", "';'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "BEGIN", "END", "BEGIN_EXECUTION", "END_EXECUTION", 
			"DO", "CONSOLE", "WHILE", "FOR", "TYPES", "OPERATORS", "COMPARATORS", 
			"NUMBERS", "QUOTES", "ID", "STRING_CONTENT", "CONTENT", "COMMENTS", "COMMA", 
			"EQUALS", "ASSIGN", "SEMICOLON", "BRACKET_OPEN", "BRACKET_CLOSE", "SPECIAL"
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


	public minipascalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "minipascal.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00d7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bc\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008a\n\13\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0098\n\r\3\16\5\16\u009b\n\16\3\16\6\16"+
		"\u009e\n\16\r\16\16\16\u009f\3\17\3\17\3\20\6\20\u00a5\n\20\r\20\16\20"+
		"\u00a6\3\21\3\21\7\21\u00ab\n\21\f\21\16\21\u00ae\13\21\3\21\3\21\3\22"+
		"\5\22\u00b3\n\22\3\22\3\22\5\22\u00b7\n\22\6\22\u00b9\n\22\r\22\16\22"+
		"\u00ba\3\23\3\23\3\23\3\23\3\23\5\23\u00c2\n\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\6\32\u00d2\n\32\r\32"+
		"\16\32\u00d3\3\32\3\32\3\u00ac\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\3\2\7\5\2,-//\61\61\5\2--//~~\3\2\62;\5\2\62;C\\c|\5"+
		"\2\13\f\17\17\"\"\2\u00ea\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5=\3"+
		"\2\2\2\7C\3\2\2\2\tH\3\2\2\2\13N\3\2\2\2\rR\3\2\2\2\17b\3\2\2\2\21d\3"+
		"\2\2\2\23j\3\2\2\2\25\u0089\3\2\2\2\27\u008b\3\2\2\2\31\u0097\3\2\2\2"+
		"\33\u009a\3\2\2\2\35\u00a1\3\2\2\2\37\u00a4\3\2\2\2!\u00a8\3\2\2\2#\u00b8"+
		"\3\2\2\2%\u00c1\3\2\2\2\'\u00c3\3\2\2\2)\u00c5\3\2\2\2+\u00c7\3\2\2\2"+
		"-\u00ca\3\2\2\2/\u00cc\3\2\2\2\61\u00ce\3\2\2\2\63\u00d1\3\2\2\2\65\66"+
		"\7R\2\2\66\67\7t\2\2\678\7q\2\289\7i\2\29:\7t\2\2:;\7c\2\2;<\7o\2\2<\4"+
		"\3\2\2\2=>\7D\2\2>?\7g\2\2?@\7i\2\2@A\7k\2\2AB\7p\2\2B\6\3\2\2\2CD\7G"+
		"\2\2DE\7p\2\2EF\7f\2\2FG\7\60\2\2G\b\3\2\2\2HI\7d\2\2IJ\7g\2\2JK\7i\2"+
		"\2KL\7k\2\2LM\7p\2\2M\n\3\2\2\2NO\7g\2\2OP\7p\2\2PQ\7f\2\2Q\f\3\2\2\2"+
		"RS\7f\2\2ST\7q\2\2T\16\3\2\2\2UV\7t\2\2VW\7g\2\2WX\7c\2\2XY\7f\2\2YZ\7"+
		"n\2\2Zc\7p\2\2[\\\7y\2\2\\]\7t\2\2]^\7k\2\2^_\7v\2\2_`\7g\2\2`a\7n\2\2"+
		"ac\7p\2\2bU\3\2\2\2b[\3\2\2\2c\20\3\2\2\2de\7y\2\2ef\7j\2\2fg\7k\2\2g"+
		"h\7n\2\2hi\7g\2\2i\22\3\2\2\2jk\7h\2\2kl\7q\2\2lm\7t\2\2m\24\3\2\2\2n"+
		"o\7K\2\2op\7p\2\2p\u008a\7v\2\2qr\7U\2\2rs\7v\2\2st\7t\2\2tu\7k\2\2uv"+
		"\7p\2\2v\u008a\7i\2\2wx\7E\2\2xy\7j\2\2yz\7c\2\2z\u008a\7t\2\2{|\7N\2"+
		"\2|}\7q\2\2}~\7p\2\2~\u008a\7i\2\2\177\u0080\7D\2\2\u0080\u0081\7q\2\2"+
		"\u0081\u0082\7q\2\2\u0082\u0083\7n\2\2\u0083\u0084\7g\2\2\u0084\u0085"+
		"\7c\2\2\u0085\u008a\7p\2\2\u0086\u0087\7X\2\2\u0087\u0088\7c\2\2\u0088"+
		"\u008a\7t\2\2\u0089n\3\2\2\2\u0089q\3\2\2\2\u0089w\3\2\2\2\u0089{\3\2"+
		"\2\2\u0089\177\3\2\2\2\u0089\u0086\3\2\2\2\u008a\26\3\2\2\2\u008b\u008c"+
		"\t\2\2\2\u008c\30\3\2\2\2\u008d\u008e\7>\2\2\u008e\u0098\7@\2\2\u008f"+
		"\u0090\7?\2\2\u0090\u0098\7?\2\2\u0091\u0092\7>\2\2\u0092\u0098\7?\2\2"+
		"\u0093\u0094\7@\2\2\u0094\u0098\7?\2\2\u0095\u0096\7#\2\2\u0096\u0098"+
		"\7?\2\2\u0097\u008d\3\2\2\2\u0097\u008f\3\2\2\2\u0097\u0091\3\2\2\2\u0097"+
		"\u0093\3\2\2\2\u0097\u0095\3\2\2\2\u0098\32\3\2\2\2\u0099\u009b\t\3\2"+
		"\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009e"+
		"\t\4\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\34\3\2\2\2\u00a1\u00a2\7$\2\2\u00a2\36\3\2\2\2\u00a3"+
		"\u00a5\t\5\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7 \3\2\2\2\u00a8\u00ac\5\35\17\2\u00a9\u00ab"+
		"\13\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00ad\3\2\2\2"+
		"\u00ac\u00aa\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0"+
		"\5\35\17\2\u00b0\"\3\2\2\2\u00b1\u00b3\7$\2\2\u00b2\u00b1\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\t\5\2\2\u00b5\u00b7\7$"+
		"\2\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8"+
		"\u00b2\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb$\3\2\2\2\u00bc\u00c2\7^\2\2\u00bd\u00be\7\61\2\2\u00be\u00c2"+
		"\7,\2\2\u00bf\u00c0\7,\2\2\u00c0\u00c2\7\61\2\2\u00c1\u00bc\3\2\2\2\u00c1"+
		"\u00bd\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2&\3\2\2\2\u00c3\u00c4\7.\2\2\u00c4"+
		"(\3\2\2\2\u00c5\u00c6\7?\2\2\u00c6*\3\2\2\2\u00c7\u00c8\7<\2\2\u00c8\u00c9"+
		"\7?\2\2\u00c9,\3\2\2\2\u00ca\u00cb\7=\2\2\u00cb.\3\2\2\2\u00cc\u00cd\7"+
		"*\2\2\u00cd\60\3\2\2\2\u00ce\u00cf\7+\2\2\u00cf\62\3\2\2\2\u00d0\u00d2"+
		"\t\6\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\b\32\2\2\u00d6\64\3\2\2"+
		"\2\17\2b\u0089\u0097\u009a\u009f\u00a6\u00ac\u00b2\u00b6\u00ba\u00c1\u00d3"+
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