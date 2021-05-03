// Generated from c:\Users\vinil\Documents\workspace\mini-compiler\src\main\antlr\minipascal.g4 by ANTLR 4.8

    //This header adds the lexer exactly to the package that de application are looking for
    package tcc.lexer.analyzer;

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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, BEGIN=2, END=3, BEGIN_EXECUTION=4, END_EXECUTION=5, DO=6, CONSOLE=7, 
		WHILE=8, FOR=9, TYPES=10, OPERATORS=11, COMPARATORS=12, NUMBERS=13, QUOTES=14, 
		ID=15, STRING_CONTENT=16, CONTENT=17, COMMENTS=18, COMMA=19, EQUALS=20, 
		ASSIGN=21, SEMICOLON=22, BRACKET_OPEN=23, BRACKET_CLOSE=24, SPECIAL=25;
	public static final int
		RULE_program = 0, RULE_console_actions = 1, RULE_loops = 2, RULE_sentence = 3, 
		RULE_variable_assign = 4, RULE_variable_inference = 5, RULE_variable_inference_with_oprations = 6, 
		RULE_variables_operations = 7, RULE_variable_declaration = 8, RULE_string_declaration = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "console_actions", "loops", "sentence", "variable_assign", 
			"variable_inference", "variable_inference_with_oprations", "variables_operations", 
			"variable_declaration", "string_declaration"
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

	@Override
	public String getGrammarFileName() { return "minipascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

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
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
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
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(33);
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
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(38);
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
	}

	public final Console_actionsContext console_actions() throws RecognitionException {
		Console_actionsContext _localctx = new Console_actionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_console_actions);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(CONSOLE);
			setState(41);
			match(BRACKET_OPEN);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==STRING_CONTENT) {
				{
				setState(47);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING_CONTENT:
					{
					setState(42);
					string_declaration();
					}
					break;
				case ID:
					{
					setState(43);
					match(ID);
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPERATORS) {
						{
						setState(44);
						match(OPERATORS);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(52);
					match(COMMA);
					setState(53);
					match(ID);
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(59);
			match(BRACKET_CLOSE);
			setState(60);
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
		public LoopsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loops; }
	}

	public final LoopsContext loops() throws RecognitionException {
		LoopsContext _localctx = new LoopsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_loops);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(WHILE);
			setState(63);
			match(BRACKET_OPEN);
			setState(64);
			match(ID);
			setState(65);
			match(COMPARATORS);
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_CONTENT:
				{
				setState(66);
				string_declaration();
				}
				break;
			case ID:
				{
				setState(67);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(70);
			match(BRACKET_CLOSE);
			setState(71);
			match(DO);
			setState(72);
			match(BEGIN_EXECUTION);
			setState(76); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					setState(76);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case WHILE:
						{
						setState(73);
						loops();
						}
						break;
					case CONSOLE:
						{
						setState(74);
						console_actions();
						}
						break;
					case TYPES:
					case ID:
						{
						setState(75);
						sentence();
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
				setState(78); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(80);
			match(END_EXECUTION);
			setState(81);
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

	public static class SentenceContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Variable_assignContext variable_assign() {
			return getRuleContext(Variable_assignContext.class,0);
		}
		public Variable_inferenceContext variable_inference() {
			return getRuleContext(Variable_inferenceContext.class,0);
		}
		public Variable_inference_with_oprationsContext variable_inference_with_oprations() {
			return getRuleContext(Variable_inference_with_oprationsContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentence);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				variable_assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				variable_inference();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				variable_inference_with_oprations();
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
		public TerminalNode TYPES() { return getToken(minipascalParser.TYPES, 0); }
		public TerminalNode ID() { return getToken(minipascalParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(minipascalParser.EQUALS, 0); }
		public TerminalNode SEMICOLON() { return getToken(minipascalParser.SEMICOLON, 0); }
		public TerminalNode CONTENT() { return getToken(minipascalParser.CONTENT, 0); }
		public TerminalNode NUMBERS() { return getToken(minipascalParser.NUMBERS, 0); }
		public Variable_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_assign; }
	}

	public final Variable_assignContext variable_assign() throws RecognitionException {
		Variable_assignContext _localctx = new Variable_assignContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(TYPES);
			setState(90);
			match(ID);
			setState(91);
			match(EQUALS);
			setState(92);
			_la = _input.LA(1);
			if ( !(_la==NUMBERS || _la==CONTENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(93);
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

	public static class Variable_inferenceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(minipascalParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(minipascalParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(minipascalParser.SEMICOLON, 0); }
		public String_declarationContext string_declaration() {
			return getRuleContext(String_declarationContext.class,0);
		}
		public TerminalNode NUMBERS() { return getToken(minipascalParser.NUMBERS, 0); }
		public Variable_inferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_inference; }
	}

	public final Variable_inferenceContext variable_inference() throws RecognitionException {
		Variable_inferenceContext _localctx = new Variable_inferenceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable_inference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(ID);
			setState(96);
			match(ASSIGN);
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_CONTENT:
				{
				setState(97);
				string_declaration();
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

	public static class Variable_inference_with_oprationsContext extends ParserRuleContext {
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
		public Variable_inference_with_oprationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_inference_with_oprations; }
	}

	public final Variable_inference_with_oprationsContext variable_inference_with_oprations() throws RecognitionException {
		Variable_inference_with_oprationsContext _localctx = new Variable_inference_with_oprationsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variable_inference_with_oprations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(ID);
			setState(104);
			match(ASSIGN);
			setState(105);
			match(BRACKET_OPEN);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(106);
				variables_operations();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(BRACKET_CLOSE);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPERATORS) {
				{
				setState(113);
				match(OPERATORS);
				}
			}

			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBERS || _la==ID) {
				{
				setState(116);
				_la = _input.LA(1);
				if ( !(_la==NUMBERS || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(119);
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
	}

	public final Variables_operationsContext variables_operations() throws RecognitionException {
		Variables_operationsContext _localctx = new Variables_operationsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variables_operations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(ID);
			setState(122);
			match(OPERATORS);
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(123);
				_la = _input.LA(1);
				if ( !(_la==NUMBERS || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(TYPES);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(127);
				match(ID);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(128);
					match(COMMA);
					}
				}

				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
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

	public static class String_declarationContext extends ParserRuleContext {
		public TerminalNode STRING_CONTENT() { return getToken(minipascalParser.STRING_CONTENT, 0); }
		public String_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_declaration; }
	}

	public final String_declarationContext string_declaration() throws RecognitionException {
		String_declarationContext _localctx = new String_declarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_string_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u008f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\3\2\3\2\3\2\7\2"+
		"$\n\2\f\2\16\2\'\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\60\n\3\7\3\62\n"+
		"\3\f\3\16\3\65\13\3\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4G\n\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4O\n\4\r\4\16\4"+
		"P\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5Z\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\5\7f\n\7\3\7\3\7\3\b\3\b\3\b\3\b\7\bn\n\b\f\b\16\bq\13\b\3\b"+
		"\3\b\5\bu\n\b\3\b\5\bx\n\b\3\b\3\b\3\t\3\t\3\t\5\t\177\n\t\3\n\3\n\3\n"+
		"\5\n\u0084\n\n\7\n\u0086\n\n\f\n\16\n\u0089\13\n\3\n\3\n\3\13\3\13\3\13"+
		"\6\34%:P\2\f\2\4\6\b\n\f\16\20\22\24\2\4\4\2\17\17\23\23\4\2\17\17\21"+
		"\21\2\u009a\2\26\3\2\2\2\4*\3\2\2\2\6@\3\2\2\2\bY\3\2\2\2\n[\3\2\2\2\f"+
		"a\3\2\2\2\16i\3\2\2\2\20{\3\2\2\2\22\u0080\3\2\2\2\24\u008c\3\2\2\2\26"+
		"\27\7\3\2\2\27\30\7\21\2\2\30\34\7\30\2\2\31\33\5\b\5\2\32\31\3\2\2\2"+
		"\33\36\3\2\2\2\34\35\3\2\2\2\34\32\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2"+
		"\37%\7\4\2\2 $\5\6\4\2!$\5\4\3\2\"$\5\b\5\2# \3\2\2\2#!\3\2\2\2#\"\3\2"+
		"\2\2$\'\3\2\2\2%&\3\2\2\2%#\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\7\5\2\2)\3"+
		"\3\2\2\2*+\7\t\2\2+\63\7\31\2\2,\62\5\24\13\2-/\7\21\2\2.\60\7\r\2\2/"+
		".\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61,\3\2\2\2\61-\3\2\2\2\62\65\3\2"+
		"\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64:\3\2\2\2\65\63\3\2\2\2\66\67\7\25"+
		"\2\2\679\7\21\2\28\66\3\2\2\29<\3\2\2\2:;\3\2\2\2:8\3\2\2\2;=\3\2\2\2"+
		"<:\3\2\2\2=>\7\32\2\2>?\7\30\2\2?\5\3\2\2\2@A\7\n\2\2AB\7\31\2\2BC\7\21"+
		"\2\2CF\7\16\2\2DG\5\24\13\2EG\7\21\2\2FD\3\2\2\2FE\3\2\2\2GH\3\2\2\2H"+
		"I\7\32\2\2IJ\7\b\2\2JN\7\6\2\2KO\5\6\4\2LO\5\4\3\2MO\5\b\5\2NK\3\2\2\2"+
		"NL\3\2\2\2NM\3\2\2\2OP\3\2\2\2PQ\3\2\2\2PN\3\2\2\2QR\3\2\2\2RS\7\7\2\2"+
		"ST\7\30\2\2T\7\3\2\2\2UZ\5\22\n\2VZ\5\n\6\2WZ\5\f\7\2XZ\5\16\b\2YU\3\2"+
		"\2\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z\t\3\2\2\2[\\\7\f\2\2\\]\7\21\2\2]"+
		"^\7\26\2\2^_\t\2\2\2_`\7\30\2\2`\13\3\2\2\2ab\7\21\2\2be\7\27\2\2cf\5"+
		"\24\13\2df\7\17\2\2ec\3\2\2\2ed\3\2\2\2fg\3\2\2\2gh\7\30\2\2h\r\3\2\2"+
		"\2ij\7\21\2\2jk\7\27\2\2ko\7\31\2\2ln\5\20\t\2ml\3\2\2\2nq\3\2\2\2om\3"+
		"\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rt\7\32\2\2su\7\r\2\2ts\3\2\2\2tu"+
		"\3\2\2\2uw\3\2\2\2vx\t\3\2\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\30\2\2"+
		"z\17\3\2\2\2{|\7\21\2\2|~\7\r\2\2}\177\t\3\2\2~}\3\2\2\2~\177\3\2\2\2"+
		"\177\21\3\2\2\2\u0080\u0087\7\f\2\2\u0081\u0083\7\21\2\2\u0082\u0084\7"+
		"\25\2\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085"+
		"\u0081\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7\30\2\2\u008b"+
		"\23\3\2\2\2\u008c\u008d\7\22\2\2\u008d\25\3\2\2\2\24\34#%/\61\63:FNPY"+
		"eotw~\u0083\u0087";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}