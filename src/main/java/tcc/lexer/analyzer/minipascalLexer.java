// Generated from minipascal.g4 by ANTLR 4.7.2

    //This header adds the lexer exactly to the package that de application are looking for
    package tcc.lexer.analyzer;
    import tcc.lexer.data.MinipascalSymbol;
    import tcc.lexer.data.MinipascalSymbolTable;
    import tcc.lexer.data.MinipascalVariable;
    import tcc.lexer.exceptions.MinipascalSemanticException;
    import java.util.ArrayList;

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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, BEGIN=2, END=3, BEGIN_EXECUTION=4, END_EXECUTION=5, DO=6, CONSOLE=7, 
		WHILE=8, FOR=9, IF=10, ELSE=11, THEN=12, TYPES=13, INTEGER=14, STRING=15, 
		CHAR=16, LONG=17, BOOLEAN=18, VAR=19, OPERATORS=20, COMPARATORS=21, NUMBERS=22, 
		QUOTES=23, ID=24, STRING_CONTENT=25, CONTENT=26, COMMENTS=27, COMMA=28, 
		EQUALS=29, ASSIGN=30, SEMICOLON=31, BRACKET_OPEN=32, BRACKET_CLOSE=33, 
		SPECIAL=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROGRAM", "BEGIN", "END", "BEGIN_EXECUTION", "END_EXECUTION", "DO", 
			"CONSOLE", "WHILE", "FOR", "IF", "ELSE", "THEN", "TYPES", "INTEGER", 
			"STRING", "CHAR", "LONG", "BOOLEAN", "VAR", "OPERATORS", "COMPARATORS", 
			"NUMBERS", "QUOTES", "ID", "STRING_CONTENT", "CONTENT", "COMMENTS", "COMMA", 
			"EQUALS", "ASSIGN", "SEMICOLON", "BRACKET_OPEN", "BRACKET_CLOSE", "SPECIAL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Program'", "'Begin'", "'End.'", "'begin'", "'end'", "'do'", null, 
			"'while'", "'for'", "'if'", "'else'", "'then'", null, "'Int'", "'String'", 
			"'Char'", "'Long'", "'Boolean'", "'Var'", null, null, null, "'\"'", null, 
			null, null, null, "','", "'='", "':='", "';'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "BEGIN", "END", "BEGIN_EXECUTION", "END_EXECUTION", 
			"DO", "CONSOLE", "WHILE", "FOR", "IF", "ELSE", "THEN", "TYPES", "INTEGER", 
			"STRING", "CHAR", "LONG", "BOOLEAN", "VAR", "OPERATORS", "COMPARATORS", 
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


	    private int type;
	    private String varName;
	    private String varValue;
	    private MinipascalSymbolTable symbolTable = new MinipascalSymbolTable();
	    private MinipascalSymbol symbol;


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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 13:
			INTEGER_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 15:
			CHAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 16:
			LONG_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
			BOOLEAN_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
			VAR_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void INTEGER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 type = MinipascalVariable.NUMBER; 
			break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 type = MinipascalVariable.TEXT; 
			break;
		}
	}
	private void CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			 type = MinipascalVariable.TEXT; 
			break;
		}
	}
	private void LONG_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 type = MinipascalVariable.NUMBER; 
			break;
		}
	}
	private void BOOLEAN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			 type = MinipascalVariable.NUMBER; 
			break;
		}
	}
	private void VAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			 type = MinipascalVariable.TEXT; 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u010f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bu\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0094\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u00d0\n\26\3\27\5\27\u00d3\n\27\3\27\6\27\u00d6\n\27\r"+
		"\27\16\27\u00d7\3\30\3\30\3\31\6\31\u00dd\n\31\r\31\16\31\u00de\3\32\3"+
		"\32\7\32\u00e3\n\32\f\32\16\32\u00e6\13\32\3\32\3\32\3\33\5\33\u00eb\n"+
		"\33\3\33\3\33\5\33\u00ef\n\33\6\33\u00f1\n\33\r\33\16\33\u00f2\3\34\3"+
		"\34\3\34\3\34\3\34\5\34\u00fa\n\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37"+
		"\3 \3 \3!\3!\3\"\3\"\3#\6#\u010a\n#\r#\16#\u010b\3#\3#\3\u00e4\2$\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$\3\2\b\5\2,-//\61\61\4\2>>@@\5\2--//~~\3\2\62;\5\2\62;C\\c|\5\2"+
		"\13\f\17\17\"\"\2\u0123\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\3G\3\2\2\2\5O\3\2\2\2\7U\3\2\2\2\tZ\3\2\2\2\13`\3\2\2\2"+
		"\rd\3\2\2\2\17t\3\2\2\2\21v\3\2\2\2\23|\3\2\2\2\25\u0080\3\2\2\2\27\u0083"+
		"\3\2\2\2\31\u0088\3\2\2\2\33\u0093\3\2\2\2\35\u0095\3\2\2\2\37\u009b\3"+
		"\2\2\2!\u00a4\3\2\2\2#\u00ab\3\2\2\2%\u00b2\3\2\2\2\'\u00bc\3\2\2\2)\u00c2"+
		"\3\2\2\2+\u00cf\3\2\2\2-\u00d2\3\2\2\2/\u00d9\3\2\2\2\61\u00dc\3\2\2\2"+
		"\63\u00e0\3\2\2\2\65\u00f0\3\2\2\2\67\u00f9\3\2\2\29\u00fb\3\2\2\2;\u00fd"+
		"\3\2\2\2=\u00ff\3\2\2\2?\u0102\3\2\2\2A\u0104\3\2\2\2C\u0106\3\2\2\2E"+
		"\u0109\3\2\2\2GH\7R\2\2HI\7t\2\2IJ\7q\2\2JK\7i\2\2KL\7t\2\2LM\7c\2\2M"+
		"N\7o\2\2N\4\3\2\2\2OP\7D\2\2PQ\7g\2\2QR\7i\2\2RS\7k\2\2ST\7p\2\2T\6\3"+
		"\2\2\2UV\7G\2\2VW\7p\2\2WX\7f\2\2XY\7\60\2\2Y\b\3\2\2\2Z[\7d\2\2[\\\7"+
		"g\2\2\\]\7i\2\2]^\7k\2\2^_\7p\2\2_\n\3\2\2\2`a\7g\2\2ab\7p\2\2bc\7f\2"+
		"\2c\f\3\2\2\2de\7f\2\2ef\7q\2\2f\16\3\2\2\2gh\7t\2\2hi\7g\2\2ij\7c\2\2"+
		"jk\7f\2\2kl\7n\2\2lu\7p\2\2mn\7y\2\2no\7t\2\2op\7k\2\2pq\7v\2\2qr\7g\2"+
		"\2rs\7n\2\2su\7p\2\2tg\3\2\2\2tm\3\2\2\2u\20\3\2\2\2vw\7y\2\2wx\7j\2\2"+
		"xy\7k\2\2yz\7n\2\2z{\7g\2\2{\22\3\2\2\2|}\7h\2\2}~\7q\2\2~\177\7t\2\2"+
		"\177\24\3\2\2\2\u0080\u0081\7k\2\2\u0081\u0082\7h\2\2\u0082\26\3\2\2\2"+
		"\u0083\u0084\7g\2\2\u0084\u0085\7n\2\2\u0085\u0086\7u\2\2\u0086\u0087"+
		"\7g\2\2\u0087\30\3\2\2\2\u0088\u0089\7v\2\2\u0089\u008a\7j\2\2\u008a\u008b"+
		"\7g\2\2\u008b\u008c\7p\2\2\u008c\32\3\2\2\2\u008d\u0094\5\35\17\2\u008e"+
		"\u0094\5\37\20\2\u008f\u0094\5!\21\2\u0090\u0094\5#\22\2\u0091\u0094\5"+
		"%\23\2\u0092\u0094\5\'\24\2\u0093\u008d\3\2\2\2\u0093\u008e\3\2\2\2\u0093"+
		"\u008f\3\2\2\2\u0093\u0090\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2"+
		"\2\2\u0094\34\3\2\2\2\u0095\u0096\7K\2\2\u0096\u0097\7p\2\2\u0097\u0098"+
		"\7v\2\2\u0098\u0099\3\2\2\2\u0099\u009a\b\17\2\2\u009a\36\3\2\2\2\u009b"+
		"\u009c\7U\2\2\u009c\u009d\7v\2\2\u009d\u009e\7t\2\2\u009e\u009f\7k\2\2"+
		"\u009f\u00a0\7p\2\2\u00a0\u00a1\7i\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3"+
		"\b\20\3\2\u00a3 \3\2\2\2\u00a4\u00a5\7E\2\2\u00a5\u00a6\7j\2\2\u00a6\u00a7"+
		"\7c\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\b\21\4\2\u00aa"+
		"\"\3\2\2\2\u00ab\u00ac\7N\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7p\2\2\u00ae"+
		"\u00af\7i\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\b\22\5\2\u00b1$\3\2\2\2"+
		"\u00b2\u00b3\7D\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6"+
		"\7n\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7p\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bb\b\23\6\2\u00bb&\3\2\2\2\u00bc\u00bd\7X\2\2"+
		"\u00bd\u00be\7c\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1"+
		"\b\24\7\2\u00c1(\3\2\2\2\u00c2\u00c3\t\2\2\2\u00c3*\3\2\2\2\u00c4\u00c5"+
		"\7>\2\2\u00c5\u00d0\7@\2\2\u00c6\u00c7\7?\2\2\u00c7\u00d0\7?\2\2\u00c8"+
		"\u00c9\7>\2\2\u00c9\u00d0\7?\2\2\u00ca\u00cb\7@\2\2\u00cb\u00d0\7?\2\2"+
		"\u00cc\u00cd\7#\2\2\u00cd\u00d0\7?\2\2\u00ce\u00d0\t\3\2\2\u00cf\u00c4"+
		"\3\2\2\2\u00cf\u00c6\3\2\2\2\u00cf\u00c8\3\2\2\2\u00cf\u00ca\3\2\2\2\u00cf"+
		"\u00cc\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0,\3\2\2\2\u00d1\u00d3\t\4\2\2"+
		"\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d6"+
		"\t\5\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8.\3\2\2\2\u00d9\u00da\7$\2\2\u00da\60\3\2\2\2\u00db"+
		"\u00dd\t\6\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\62\3\2\2\2\u00e0\u00e4\5/\30\2\u00e1\u00e3"+
		"\13\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e5\3\2\2\2"+
		"\u00e4\u00e2\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8"+
		"\5/\30\2\u00e8\64\3\2\2\2\u00e9\u00eb\7$\2\2\u00ea\u00e9\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\t\6\2\2\u00ed\u00ef\7$"+
		"\2\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0"+
		"\u00ea\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2"+
		"\2\2\u00f3\66\3\2\2\2\u00f4\u00fa\7^\2\2\u00f5\u00f6\7\61\2\2\u00f6\u00fa"+
		"\7,\2\2\u00f7\u00f8\7,\2\2\u00f8\u00fa\7\61\2\2\u00f9\u00f4\3\2\2\2\u00f9"+
		"\u00f5\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa8\3\2\2\2\u00fb\u00fc\7.\2\2\u00fc"+
		":\3\2\2\2\u00fd\u00fe\7?\2\2\u00fe<\3\2\2\2\u00ff\u0100\7<\2\2\u0100\u0101"+
		"\7?\2\2\u0101>\3\2\2\2\u0102\u0103\7=\2\2\u0103@\3\2\2\2\u0104\u0105\7"+
		"*\2\2\u0105B\3\2\2\2\u0106\u0107\7+\2\2\u0107D\3\2\2\2\u0108\u010a\t\7"+
		"\2\2\u0109\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\b#\b\2\u010eF\3\2\2\2\17"+
		"\2t\u0093\u00cf\u00d2\u00d7\u00de\u00e4\u00ea\u00ee\u00f2\u00f9\u010b"+
		"\t\3\17\2\3\20\3\3\21\4\3\22\5\3\23\6\3\24\7\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}