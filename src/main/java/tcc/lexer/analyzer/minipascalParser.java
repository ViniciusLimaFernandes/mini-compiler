// Generated from minipascal.g4 by ANTLR 4.7.2

    //This header adds the lexer exactly to the package that de application are looking for
    package tcc.lexer.analyzer;
    import tcc.lexer.data.MinipascalSymbol;
    import tcc.lexer.data.MinipascalSymbolTable;
    import tcc.lexer.data.MinipascalVariable;
    import tcc.lexer.exceptions.MinipascalSemanticException;
    import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class minipascalParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_console_actions = 1, RULE_loops = 2, RULE_conditions = 3, 
		RULE_sentence = 4, RULE_variable_assign = 5, RULE_variable_assign_with_oprations = 6, 
		RULE_variables_operations = 7, RULE_variable_declaration = 8, RULE_string_declaration = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "console_actions", "loops", "conditions", "sentence", "variable_assign", 
			"variable_assign_with_oprations", "variables_operations", "variable_declaration", 
			"string_declaration"
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

	@Override
	public String getGrammarFileName() { return "minipascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private int type;
	    private String varName;
	    private String varValue;
	    private MinipascalSymbolTable symbolTable = new MinipascalSymbolTable();
	    private MinipascalSymbol symbol;

	public minipascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(minipascalParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(minipascalParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(minipascalParser.SEMICOLON, 0); }
		public TerminalNode BEGIN() { return getToken(minipascalParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(minipascalParser.END, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public List<LoopsContext> loops() {
			return getRuleContexts(LoopsContext.class);
		}
		public LoopsContext loops(int i) {
			return getRuleContext(LoopsContext.class,i);
		}
		public List<Console_actionsContext> console_actions() {
			return getRuleContexts(Console_actionsContext.class);
		}
		public Console_actionsContext console_actions(int i) {
			return getRuleContext(Console_actionsContext.class,i);
		}
		public List<ConditionsContext> conditions() {
			return getRuleContexts(ConditionsContext.class);
		}
		public ConditionsContext conditions(int i) {
			return getRuleContext(ConditionsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(PROGRAM);
			setState(21);
			match(ID);
			setState(22);
			match(SEMICOLON);
			setState(26);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(23);
					sentence();
					}
					} 
				}
				setState(28);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(29);
			match(BEGIN);
			setState(36);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(34);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case WHILE:
						{
						setState(30);
						loops();
						}
						break;
					case CONSOLE:
						{
						setState(31);
						console_actions();
						}
						break;
					case TYPES:
					case ID:
						{
						setState(32);
						sentence();
						}
						break;
					case IF:
						{
						setState(33);
						conditions();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(38);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(39);
			match(END);
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

	public static class Console_actionsContext extends ParserRuleContext {
		public TerminalNode CONSOLE() { return getToken(minipascalParser.CONSOLE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(minipascalParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(minipascalParser.BRACKET_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(minipascalParser.SEMICOLON, 0); }
		public List<String_declarationContext> string_declaration() {
			return getRuleContexts(String_declarationContext.class);
		}
		public String_declarationContext string_declaration(int i) {
			return getRuleContext(String_declarationContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(minipascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(minipascalParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(minipascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(minipascalParser.COMMA, i);
		}
		public List<TerminalNode> OPERATORS() { return getTokens(minipascalParser.OPERATORS); }
		public TerminalNode OPERATORS(int i) {
			return getToken(minipascalParser.OPERATORS, i);
		}
		public Console_actionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_console_actions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterConsole_actions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitConsole_actions(this);
		}
	}

	public final Console_actionsContext console_actions() throws RecognitionException {
		Console_actionsContext _localctx = new Console_actionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_console_actions);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(CONSOLE);
			setState(42);
			match(BRACKET_OPEN);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==STRING_CONTENT) {
				{
				setState(49);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING_CONTENT:
					{
					setState(43);
					string_declaration();
					}
					break;
				case ID:
					{
					setState(44);
					match(ID);

					                          varName = _input.LT(-1).getText();
					                          varValue = null;
					                          symbol = new MinipascalVariable(varName,type, varValue);
					                          if (!symbolTable.exists(varName)) {
					                               throw new MinipascalSemanticException("The symbol " + varName + " aren't previously declared!");
					                          }
					                
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPERATORS) {
						{
						setState(46);
						match(OPERATORS);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(54);
					match(COMMA);
					setState(55);
					match(ID);

					                            varName = _input.LT(-1).getText();
					                            varValue = null;
					                            symbol = new MinipascalVariable(varName,type, varValue);
					                            if (!symbolTable.exists(varName)) {
					                                 throw new MinipascalSemanticException("The symbol " + varName + " aren't previously declared!");
					                            }
					                
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(62);
			match(BRACKET_CLOSE);
			setState(63);
			match(SEMICOLON);
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

	public static class LoopsContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(minipascalParser.WHILE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(minipascalParser.BRACKET_OPEN, 0); }
		public List<TerminalNode> ID() { return getTokens(minipascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(minipascalParser.ID, i);
		}
		public TerminalNode COMPARATORS() { return getToken(minipascalParser.COMPARATORS, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(minipascalParser.BRACKET_CLOSE, 0); }
		public TerminalNode DO() { return getToken(minipascalParser.DO, 0); }
		public TerminalNode BEGIN_EXECUTION() { return getToken(minipascalParser.BEGIN_EXECUTION, 0); }
		public TerminalNode END_EXECUTION() { return getToken(minipascalParser.END_EXECUTION, 0); }
		public TerminalNode SEMICOLON() { return getToken(minipascalParser.SEMICOLON, 0); }
		public String_declarationContext string_declaration() {
			return getRuleContext(String_declarationContext.class,0);
		}
		public List<LoopsContext> loops() {
			return getRuleContexts(LoopsContext.class);
		}
		public LoopsContext loops(int i) {
			return getRuleContext(LoopsContext.class,i);
		}
		public List<Console_actionsContext> console_actions() {
			return getRuleContexts(Console_actionsContext.class);
		}
		public Console_actionsContext console_actions(int i) {
			return getRuleContext(Console_actionsContext.class,i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public List<ConditionsContext> conditions() {
			return getRuleContexts(ConditionsContext.class);
		}
		public ConditionsContext conditions(int i) {
			return getRuleContext(ConditionsContext.class,i);
		}
		public LoopsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterLoops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitLoops(this);
		}
	}

	public final LoopsContext loops() throws RecognitionException {
		LoopsContext _localctx = new LoopsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_loops);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(WHILE);
			setState(66);
			match(BRACKET_OPEN);
			setState(67);
			match(ID);

			                       varName = _input.LT(-1).getText();
			                       varValue = null;
			                       symbol = new MinipascalVariable(varName,type, varValue);
			                       if (!symbolTable.exists(varName)) {
			                            throw new MinipascalSemanticException("The symbol " + varName + " aren't previously declared!");
			                       }
			              
			setState(69);
			match(COMPARATORS);
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_CONTENT:
				{
				setState(70);
				string_declaration();
				}
				break;
			case ID:
				{
				setState(71);
				match(ID);

				                       varName = _input.LT(-1).getText();
				                       varValue = null;
				                       symbol = new MinipascalVariable(varName,type, varValue);
				                       if (!symbolTable.exists(varName)) {
				                            throw new MinipascalSemanticException("The symbol " + varName + " aren't previously declared!");
				                       }
				              
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(75);
			match(BRACKET_CLOSE);
			setState(76);
			match(DO);
			setState(77);
			match(BEGIN_EXECUTION);
			setState(82); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					setState(82);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case WHILE:
						{
						setState(78);
						loops();
						}
						break;
					case CONSOLE:
						{
						setState(79);
						console_actions();
						}
						break;
					case TYPES:
					case ID:
						{
						setState(80);
						sentence();
						}
						break;
					case IF:
						{
						setState(81);
						conditions();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(84); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(86);
			match(END_EXECUTION);
			setState(87);
			match(SEMICOLON);
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

	public static class ConditionsContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(minipascalParser.IF, 0); }
		public TerminalNode COMPARATORS() { return getToken(minipascalParser.COMPARATORS, 0); }
		public TerminalNode THEN() { return getToken(minipascalParser.THEN, 0); }
		public TerminalNode END_EXECUTION() { return getToken(minipascalParser.END_EXECUTION, 0); }
		public List<TerminalNode> ID() { return getTokens(minipascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(minipascalParser.ID, i);
		}
		public TerminalNode CONTENT() { return getToken(minipascalParser.CONTENT, 0); }
		public TerminalNode NUMBERS() { return getToken(minipascalParser.NUMBERS, 0); }
		public List<LoopsContext> loops() {
			return getRuleContexts(LoopsContext.class);
		}
		public LoopsContext loops(int i) {
			return getRuleContext(LoopsContext.class,i);
		}
		public List<Console_actionsContext> console_actions() {
			return getRuleContexts(Console_actionsContext.class);
		}
		public Console_actionsContext console_actions(int i) {
			return getRuleContext(Console_actionsContext.class,i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public List<ConditionsContext> conditions() {
			return getRuleContexts(ConditionsContext.class);
		}
		public ConditionsContext conditions(int i) {
			return getRuleContext(ConditionsContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(minipascalParser.ELSE, 0); }
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitConditions(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_conditions);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(IF);
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(90);
				match(ID);

				                      varName = _input.LT(-1).getText();
				                      varValue = null;
				                      symbol = new MinipascalVariable(varName,type, varValue);
				                      if (!symbolTable.exists(varName)) {
				                           throw new MinipascalSemanticException("The symbol " + varName + " aren't previously declared!");
				                      }
				             
				}
				break;
			case CONTENT:
				{
				setState(92);
				match(CONTENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(95);
			match(COMPARATORS);
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(96);
				match(ID);

				                      varName = _input.LT(-1).getText();
				                      varValue = null;
				                      symbol = new MinipascalVariable(varName,type, varValue);
				                      if (!symbolTable.exists(varName)) {
				                           throw new MinipascalSemanticException("The symbol " + varName + " aren't previously declared!");
				                      }
				             
				}
				break;
			case NUMBERS:
				{
				setState(98);
				match(NUMBERS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(101);
			match(THEN);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(106);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case WHILE:
						{
						setState(102);
						loops();
						}
						break;
					case CONSOLE:
						{
						setState(103);
						console_actions();
						}
						break;
					case TYPES:
					case ID:
						{
						setState(104);
						sentence();
						}
						break;
					case IF:
						{
						setState(105);
						conditions();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(111);
				match(ELSE);
				}
			}

			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSOLE) | (1L << WHILE) | (1L << IF) | (1L << TYPES) | (1L << ID))) != 0)) {
				{
				setState(118);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WHILE:
					{
					setState(114);
					loops();
					}
					break;
				case CONSOLE:
					{
					setState(115);
					console_actions();
					}
					break;
				case TYPES:
				case ID:
					{
					setState(116);
					sentence();
					}
					break;
				case IF:
					{
					setState(117);
					conditions();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			match(END_EXECUTION);
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

	public static class SentenceContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Variable_assignContext variable_assign() {
			return getRuleContext(Variable_assignContext.class,0);
		}
		public Variable_assign_with_oprationsContext variable_assign_with_oprations() {
			return getRuleContext(Variable_assign_with_oprationsContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentence);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				variable_assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				variable_assign_with_oprations();
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

	public static class Variable_assignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(minipascalParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(minipascalParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(minipascalParser.SEMICOLON, 0); }
		public String_declarationContext string_declaration() {
			return getRuleContext(String_declarationContext.class,0);
		}
		public TerminalNode NUMBERS() { return getToken(minipascalParser.NUMBERS, 0); }
		public Variable_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterVariable_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitVariable_assign(this);
		}
	}

	public final Variable_assignContext variable_assign() throws RecognitionException {
		Variable_assignContext _localctx = new Variable_assignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(ID);

			                   varName = _input.LT(-1).getText();
			                   varValue = null;
			                   symbol = new MinipascalVariable(varName,type, varValue);
			                   if (!symbolTable.exists(varName)) {
			                        throw new MinipascalSemanticException("The symbol " + varName + " aren't previously declared!");
			                   }
			                
			setState(132);
			match(ASSIGN);
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_CONTENT:
				{
				setState(133);
				string_declaration();
				}
				break;
			case NUMBERS:
				{
				setState(134);
				match(NUMBERS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(137);
			match(SEMICOLON);
			 System.out.println("Variable value assign found.");
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

	public static class Variable_assign_with_oprationsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(minipascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(minipascalParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(minipascalParser.ASSIGN, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(minipascalParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(minipascalParser.BRACKET_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(minipascalParser.SEMICOLON, 0); }
		public List<Variables_operationsContext> variables_operations() {
			return getRuleContexts(Variables_operationsContext.class);
		}
		public Variables_operationsContext variables_operations(int i) {
			return getRuleContext(Variables_operationsContext.class,i);
		}
		public TerminalNode OPERATORS() { return getToken(minipascalParser.OPERATORS, 0); }
		public TerminalNode NUMBERS() { return getToken(minipascalParser.NUMBERS, 0); }
		public Variable_assign_with_oprationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_assign_with_oprations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterVariable_assign_with_oprations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitVariable_assign_with_oprations(this);
		}
	}

	public final Variable_assign_with_oprationsContext variable_assign_with_oprations() throws RecognitionException {
		Variable_assign_with_oprationsContext _localctx = new Variable_assign_with_oprationsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variable_assign_with_oprations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(ID);

			                                         varName = _input.LT(-1).getText();
			                                         varValue = null;
			                                         symbol = new MinipascalVariable(varName,type, varValue);
			                                         if (!symbolTable.exists(varName)) {
			                                              throw new MinipascalSemanticException("The symbol " + varName + " aren't previously declared!");
			                                         }
			                               
			setState(142);
			match(ASSIGN);
			setState(143);
			match(BRACKET_OPEN);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(144);
				variables_operations();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			match(BRACKET_CLOSE);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPERATORS) {
				{
				setState(151);
				match(OPERATORS);
				}
			}

			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBERS:
				{
				setState(154);
				match(NUMBERS);
				}
				break;
			case ID:
				{
				setState(155);
				match(ID);

				                                        varName = _input.LT(-1).getText();
				                                        varValue = null;
				                                        symbol = new MinipascalVariable(varName,type, varValue);
				                                        if (!symbolTable.exists(varName)) {
				                                             throw new MinipascalSemanticException("The symbol " + varName + " aren't previously declared!");
				                                        }
				                              
				}
				break;
			case SEMICOLON:
				break;
			default:
				break;
			}
			setState(159);
			match(SEMICOLON);
			 System.out.println("Variable value assign with operations found.");
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

	public static class Variables_operationsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(minipascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(minipascalParser.ID, i);
		}
		public TerminalNode OPERATORS() { return getToken(minipascalParser.OPERATORS, 0); }
		public TerminalNode NUMBERS() { return getToken(minipascalParser.NUMBERS, 0); }
		public Variables_operationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables_operations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterVariables_operations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitVariables_operations(this);
		}
	}

	public final Variables_operationsContext variables_operations() throws RecognitionException {
		Variables_operationsContext _localctx = new Variables_operationsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variables_operations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(ID);

			                            varName = _input.LT(-1).getText();
			                            varValue = null;
			                            symbol = new MinipascalVariable(varName,type, varValue);
			                            if (!symbolTable.exists(varName)) {
			                                 throw new MinipascalSemanticException("The symbol " + varName + " aren't previously declared!");
			                            }
			                   
			setState(164);
			match(OPERATORS);
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(165);
				match(ID);

				                             varName = _input.LT(-1).getText();
				                             varValue = null;
				                             symbol = new MinipascalVariable(varName,type, varValue);
				                             if (!symbolTable.exists(varName)) {
				                                  throw new MinipascalSemanticException("The symbol " + varName + " aren't previously declared!");
				                             }
				                    
				}
				break;
			case 2:
				{
				setState(167);
				match(NUMBERS);
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

	public static class Variable_declarationContext extends ParserRuleContext {
		public TerminalNode TYPES() { return getToken(minipascalParser.TYPES, 0); }
		public TerminalNode SEMICOLON() { return getToken(minipascalParser.SEMICOLON, 0); }
		public List<TerminalNode> ID() { return getTokens(minipascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(minipascalParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(minipascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(minipascalParser.COMMA, i);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitVariable_declaration(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(TYPES);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(171);
				match(ID);

				                        varName = _input.LT(-1).getText();
				                        varValue = null;
				                        symbol = new MinipascalVariable(varName,type, varValue);
				                        if (!symbolTable.exists(varName)) {
				                            symbolTable.add(symbol);
				                            System.out.println("Symbol " +  symbol.toString() + " added.");
				                        } else {
				                            throw new MinipascalSemanticException("The symbol " + varName + " already exists!");
				                        }
				                    
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(173);
					match(COMMA);
					}
				}

				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
			match(SEMICOLON);
			 System.out.println("Variable declaration found."); 
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

	public static class String_declarationContext extends ParserRuleContext {
		public TerminalNode STRING_CONTENT() { return getToken(minipascalParser.STRING_CONTENT, 0); }
		public String_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterString_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitString_declaration(this);
		}
	}

	public final String_declarationContext string_declaration() throws RecognitionException {
		String_declarationContext _localctx = new String_declarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_string_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(STRING_CONTENT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00bd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\3\2\3\2\3\2\3\2\7"+
		"\2%\n\2\f\2\16\2(\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\7\3"+
		"\64\n\3\f\3\16\3\67\13\3\3\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4L\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\6\4U\n\4\r\4\16\4V\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5`\n\5\3\5\3\5\3\5"+
		"\3\5\5\5f\n\5\3\5\3\5\3\5\3\5\3\5\7\5m\n\5\f\5\16\5p\13\5\3\5\5\5s\n\5"+
		"\3\5\3\5\3\5\3\5\7\5y\n\5\f\5\16\5|\13\5\3\5\3\5\3\6\3\6\3\6\5\6\u0083"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\5\7\u008a\n\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\7\b\u0094\n\b\f\b\16\b\u0097\13\b\3\b\3\b\5\b\u009b\n\b\3\b\3\b\3\b\5"+
		"\b\u00a0\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ab\n\t\3\n\3\n"+
		"\3\n\3\n\5\n\u00b1\n\n\7\n\u00b3\n\n\f\n\16\n\u00b6\13\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\6\34&=V\2\f\2\4\6\b\n\f\16\20\22\24\2\2\2\u00d6\2\26\3\2"+
		"\2\2\4+\3\2\2\2\6C\3\2\2\2\b[\3\2\2\2\n\u0082\3\2\2\2\f\u0084\3\2\2\2"+
		"\16\u008e\3\2\2\2\20\u00a4\3\2\2\2\22\u00ac\3\2\2\2\24\u00ba\3\2\2\2\26"+
		"\27\7\3\2\2\27\30\7\32\2\2\30\34\7!\2\2\31\33\5\n\6\2\32\31\3\2\2\2\33"+
		"\36\3\2\2\2\34\35\3\2\2\2\34\32\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37"+
		"&\7\4\2\2 %\5\6\4\2!%\5\4\3\2\"%\5\n\6\2#%\5\b\5\2$ \3\2\2\2$!\3\2\2\2"+
		"$\"\3\2\2\2$#\3\2\2\2%(\3\2\2\2&\'\3\2\2\2&$\3\2\2\2\')\3\2\2\2(&\3\2"+
		"\2\2)*\7\5\2\2*\3\3\2\2\2+,\7\t\2\2,\65\7\"\2\2-\64\5\24\13\2./\7\32\2"+
		"\2/\61\b\3\1\2\60\62\7\26\2\2\61\60\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2"+
		"\2\63-\3\2\2\2\63.\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66"+
		"=\3\2\2\2\67\65\3\2\2\289\7\36\2\29:\7\32\2\2:<\b\3\1\2;8\3\2\2\2<?\3"+
		"\2\2\2=>\3\2\2\2=;\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7#\2\2AB\7!\2\2B\5\3"+
		"\2\2\2CD\7\n\2\2DE\7\"\2\2EF\7\32\2\2FG\b\4\1\2GK\7\27\2\2HL\5\24\13\2"+
		"IJ\7\32\2\2JL\b\4\1\2KH\3\2\2\2KI\3\2\2\2LM\3\2\2\2MN\7#\2\2NO\7\b\2\2"+
		"OT\7\6\2\2PU\5\6\4\2QU\5\4\3\2RU\5\n\6\2SU\5\b\5\2TP\3\2\2\2TQ\3\2\2\2"+
		"TR\3\2\2\2TS\3\2\2\2UV\3\2\2\2VW\3\2\2\2VT\3\2\2\2WX\3\2\2\2XY\7\7\2\2"+
		"YZ\7!\2\2Z\7\3\2\2\2[_\7\f\2\2\\]\7\32\2\2]`\b\5\1\2^`\7\34\2\2_\\\3\2"+
		"\2\2_^\3\2\2\2`a\3\2\2\2ae\7\27\2\2bc\7\32\2\2cf\b\5\1\2df\7\30\2\2eb"+
		"\3\2\2\2ed\3\2\2\2fg\3\2\2\2gn\7\16\2\2hm\5\6\4\2im\5\4\3\2jm\5\n\6\2"+
		"km\5\b\5\2lh\3\2\2\2li\3\2\2\2lj\3\2\2\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2"+
		"no\3\2\2\2or\3\2\2\2pn\3\2\2\2qs\7\r\2\2rq\3\2\2\2rs\3\2\2\2sz\3\2\2\2"+
		"ty\5\6\4\2uy\5\4\3\2vy\5\n\6\2wy\5\b\5\2xt\3\2\2\2xu\3\2\2\2xv\3\2\2\2"+
		"xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7\7\2\2"+
		"~\t\3\2\2\2\177\u0083\5\22\n\2\u0080\u0083\5\f\7\2\u0081\u0083\5\16\b"+
		"\2\u0082\177\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\13"+
		"\3\2\2\2\u0084\u0085\7\32\2\2\u0085\u0086\b\7\1\2\u0086\u0089\7 \2\2\u0087"+
		"\u008a\5\24\13\2\u0088\u008a\7\30\2\2\u0089\u0087\3\2\2\2\u0089\u0088"+
		"\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7!\2\2\u008c\u008d\b\7\1\2\u008d"+
		"\r\3\2\2\2\u008e\u008f\7\32\2\2\u008f\u0090\b\b\1\2\u0090\u0091\7 \2\2"+
		"\u0091\u0095\7\"\2\2\u0092\u0094\5\20\t\2\u0093\u0092\3\2\2\2\u0094\u0097"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u009a\7#\2\2\u0099\u009b\7\26\2\2\u009a\u0099\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\u009f\3\2\2\2\u009c\u00a0\7\30\2\2\u009d"+
		"\u009e\7\32\2\2\u009e\u00a0\b\b\1\2\u009f\u009c\3\2\2\2\u009f\u009d\3"+
		"\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7!\2\2\u00a2"+
		"\u00a3\b\b\1\2\u00a3\17\3\2\2\2\u00a4\u00a5\7\32\2\2\u00a5\u00a6\b\t\1"+
		"\2\u00a6\u00aa\7\26\2\2\u00a7\u00a8\7\32\2\2\u00a8\u00ab\b\t\1\2\u00a9"+
		"\u00ab\7\30\2\2\u00aa\u00a7\3\2\2\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3"+
		"\2\2\2\u00ab\21\3\2\2\2\u00ac\u00b4\7\17\2\2\u00ad\u00ae\7\32\2\2\u00ae"+
		"\u00b0\b\n\1\2\u00af\u00b1\7\36\2\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3"+
		"\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b7\u00b8\7!\2\2\u00b8\u00b9\b\n\1\2\u00b9\23\3\2\2\2\u00ba\u00bb"+
		"\7\33\2\2\u00bb\25\3\2\2\2\33\34$&\61\63\65=KTV_elnrxz\u0082\u0089\u0095"+
		"\u009a\u009f\u00aa\u00b0\u00b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}