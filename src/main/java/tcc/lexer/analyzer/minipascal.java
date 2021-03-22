// Generated from minipascal.g4 by ANTLR 4.7.2

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
public class minipascal extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, TYPES=2, OPERATORS=3, COMPARATORS=4, NUMBERS=5, TEXT=6, COMMENTS=7, 
		CONSOLE=8, REPETITIONS=9, EXECUTIONS=10, SEPARATORS=11, BLOCKDEFINITION=12, 
		SPECCHARS=13, VARIABLES=14, SPECIAL=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROGRAM", "TYPES", "OPERATORS", "COMPARATORS", "NUMBERS", "TEXT", "COMMENTS", 
			"CONSOLE", "REPETITIONS", "EXECUTIONS", "SEPARATORS", "BLOCKDEFINITION", 
			"SPECCHARS", "VARIABLES", "SPECIAL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "TYPES", "OPERATORS", "COMPARATORS", "NUMBERS", "TEXT", 
			"COMMENTS", "CONSOLE", "REPETITIONS", "EXECUTIONS", "SEPARATORS", "BLOCKDEFINITION", 
			"SPECCHARS", "VARIABLES", "SPECIAL"
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


	public minipascal(CharStream input) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u00c6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\6\2,\n\2\r\2\16\2-\3\2\5\2\61\n\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3N\n\3\3\4\3\4\3\4\5\4S\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5_\n\5\3\6\5\6b\n\6\3\6\6\6e\n\6\r\6\16\6"+
		"f\3\7\3\7\5\7k\n\7\3\7\6\7n\n\7\r\7\16\7o\3\7\5\7s\n\7\6\7u\n\7\r\7\16"+
		"\7v\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b\u0080\n\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008f\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u0099\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u00a0\n\13\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ae\n\r\3\16\3\16\3\17\5"+
		"\17\u00b3\n\17\3\17\5\17\u00b6\n\17\3\17\6\17\u00b9\n\17\r\17\16\17\u00ba"+
		"\3\17\5\17\u00be\n\17\3\20\6\20\u00c1\n\20\r\20\16\20\u00c2\3\20\3\20"+
		"\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21\3\2\t\5\2\62;C\\c|\3\2..\5\2,-//\61\61\5\2--//~~\3\2\62;"+
		"\4\2C\\c|\5\2\13\f\17\17\"\"\2\u00e3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\3!\3\2\2\2\5M\3\2\2\2\7R\3\2\2\2\t^\3\2\2\2\13a\3\2"+
		"\2\2\rh\3\2\2\2\17\177\3\2\2\2\21\u008e\3\2\2\2\23\u0098\3\2\2\2\25\u009f"+
		"\3\2\2\2\27\u00a1\3\2\2\2\31\u00ad\3\2\2\2\33\u00af\3\2\2\2\35\u00b2\3"+
		"\2\2\2\37\u00c0\3\2\2\2!\"\7R\2\2\"#\7t\2\2#$\7q\2\2$%\7i\2\2%&\7t\2\2"+
		"&\'\7c\2\2\'(\7o\2\2()\3\2\2\2)+\7\"\2\2*,\t\2\2\2+*\3\2\2\2,-\3\2\2\2"+
		"-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/\61\t\3\2\2\60/\3\2\2\2\60\61\3\2\2\2"+
		"\61\4\3\2\2\2\62\63\7K\2\2\63\64\7p\2\2\64N\7v\2\2\65\66\7U\2\2\66\67"+
		"\7v\2\2\678\7t\2\289\7k\2\29:\7p\2\2:N\7i\2\2;<\7E\2\2<=\7j\2\2=>\7c\2"+
		"\2>N\7t\2\2?@\7N\2\2@A\7q\2\2AB\7p\2\2BN\7i\2\2CD\7D\2\2DE\7q\2\2EF\7"+
		"q\2\2FG\7n\2\2GH\7g\2\2HI\7c\2\2IN\7p\2\2JK\7X\2\2KL\7c\2\2LN\7t\2\2M"+
		"\62\3\2\2\2M\65\3\2\2\2M;\3\2\2\2M?\3\2\2\2MC\3\2\2\2MJ\3\2\2\2N\6\3\2"+
		"\2\2OP\7<\2\2PS\7?\2\2QS\t\4\2\2RO\3\2\2\2RQ\3\2\2\2S\b\3\2\2\2TU\7>\2"+
		"\2U_\7@\2\2VW\7?\2\2W_\7?\2\2XY\7>\2\2Y_\7?\2\2Z[\7@\2\2[_\7?\2\2\\]\7"+
		"#\2\2]_\7?\2\2^T\3\2\2\2^V\3\2\2\2^X\3\2\2\2^Z\3\2\2\2^\\\3\2\2\2_\n\3"+
		"\2\2\2`b\t\5\2\2a`\3\2\2\2ab\3\2\2\2bd\3\2\2\2ce\t\6\2\2dc\3\2\2\2ef\3"+
		"\2\2\2fd\3\2\2\2fg\3\2\2\2g\f\3\2\2\2ht\7$\2\2ik\7\"\2\2ji\3\2\2\2jk\3"+
		"\2\2\2km\3\2\2\2ln\t\7\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3"+
		"\2\2\2qs\7\"\2\2rq\3\2\2\2rs\3\2\2\2su\3\2\2\2tj\3\2\2\2uv\3\2\2\2vt\3"+
		"\2\2\2vw\3\2\2\2wx\3\2\2\2xy\7$\2\2y\16\3\2\2\2z\u0080\7^\2\2{|\7\61\2"+
		"\2|\u0080\7,\2\2}~\7,\2\2~\u0080\7\61\2\2\177z\3\2\2\2\177{\3\2\2\2\177"+
		"}\3\2\2\2\u0080\20\3\2\2\2\u0081\u0082\7t\2\2\u0082\u0083\7g\2\2\u0083"+
		"\u0084\7c\2\2\u0084\u0085\7f\2\2\u0085\u0086\7n\2\2\u0086\u008f\7p\2\2"+
		"\u0087\u0088\7y\2\2\u0088\u0089\7t\2\2\u0089\u008a\7k\2\2\u008a\u008b"+
		"\7v\2\2\u008b\u008c\7g\2\2\u008c\u008d\7n\2\2\u008d\u008f\7p\2\2\u008e"+
		"\u0081\3\2\2\2\u008e\u0087\3\2\2\2\u008f\22\3\2\2\2\u0090\u0091\7h\2\2"+
		"\u0091\u0092\7q\2\2\u0092\u0099\7t\2\2\u0093\u0094\7y\2\2\u0094\u0095"+
		"\7j\2\2\u0095\u0096\7k\2\2\u0096\u0097\7n\2\2\u0097\u0099\7g\2\2\u0098"+
		"\u0090\3\2\2\2\u0098\u0093\3\2\2\2\u0099\24\3\2\2\2\u009a\u009b\7f\2\2"+
		"\u009b\u00a0\7q\2\2\u009c\u009d\7g\2\2\u009d\u009e\7p\2\2\u009e\u00a0"+
		"\7f\2\2\u009f\u009a\3\2\2\2\u009f\u009c\3\2\2\2\u00a0\26\3\2\2\2\u00a1"+
		"\u00a2\7.\2\2\u00a2\30\3\2\2\2\u00a3\u00a4\7D\2\2\u00a4\u00a5\7g\2\2\u00a5"+
		"\u00a6\7i\2\2\u00a6\u00a7\7k\2\2\u00a7\u00ae\7p\2\2\u00a8\u00a9\7G\2\2"+
		"\u00a9\u00aa\7p\2\2\u00aa\u00ab\7f\2\2\u00ab\u00ae\7\60\2\2\u00ac\u00ae"+
		"\7=\2\2\u00ad\u00a3\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae"+
		"\32\3\2\2\2\u00af\u00b0\4*+\2\u00b0\34\3\2\2\2\u00b1\u00b3\5\5\3\2\u00b2"+
		"\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b6\7\""+
		"\2\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7"+
		"\u00b9\t\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00be\t\3\2\2\u00bd"+
		"\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\36\3\2\2\2\u00bf\u00c1\t\b\2"+
		"\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\b\20\2\2\u00c5 \3\2\2\2\30\2"+
		"-\60MR^afjorv\177\u008e\u0098\u009f\u00ad\u00b2\u00b5\u00ba\u00bd\u00c2"+
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