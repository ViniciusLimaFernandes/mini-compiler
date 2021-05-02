// Generated from minipascal.g4 by ANTLR 4.7.2

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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, BEGIN=2, END=3, BEGIN_EXECUTION=4, END_EXECUTION=5, CONSOLE=6, 
		REPETITIONS=7, TYPES=8, OPERATORS=9, COMPARATORS=10, NUMBERS=11, QUOTES=12, 
		ID=13, CONTENT=14, COMMENTS=15, DO=16, COMMA=17, EQUALS=18, ASSIGN=19, 
		SEMICOLON=20, BRACKET_OPEN=21, BRACKET_CLOSE=22, SPECIAL=23;
	public static final int
		RULE_program = 0, RULE_console_actions = 1, RULE_loops = 2, RULE_sentence = 3, 
		RULE_variable_assign = 4, RULE_variable_inference = 5, RULE_variable_declaration = 6, 
		RULE_string_declaration = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "console_actions", "loops", "sentence", "variable_assign", 
			"variable_inference", "variable_declaration", "string_declaration"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Program'", "'Begin'", "'End.'", "'begin'", "'end'", null, null, 
			null, null, null, null, "'\"'", null, null, null, "'do'", "','", "'='", 
			"':='", "';'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "BEGIN", "END", "BEGIN_EXECUTION", "END_EXECUTION", 
			"CONSOLE", "REPETITIONS", "TYPES", "OPERATORS", "COMPARATORS", "NUMBERS", 
			"QUOTES", "ID", "CONTENT", "COMMENTS", "DO", "COMMA", "EQUALS", "ASSIGN", 
			"SEMICOLON", "BRACKET_OPEN", "BRACKET_CLOSE", "SPECIAL"
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
			setState(16);
			match(PROGRAM);
			setState(17);
			match(ID);
			setState(18);
			match(SEMICOLON);
			setState(22);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(19);
					sentence();
					}
					} 
				}
				setState(24);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(25);
			match(BEGIN);
			setState(29);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(26);
					loops();
					}
					} 
				}
				setState(31);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(32);
					console_actions();
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(38);
					sentence();
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(44);
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
		public String_declarationContext string_declaration() {
			return getRuleContext(String_declarationContext.class,0);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(minipascalParser.BRACKET_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(minipascalParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(minipascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(minipascalParser.COMMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(minipascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(minipascalParser.ID, i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(CONSOLE);
			setState(47);
			match(BRACKET_OPEN);
			setState(48);
			string_declaration();
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(49);
					match(COMMA);
					setState(50);
					match(ID);
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(56);
			match(BRACKET_CLOSE);
			setState(57);
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
		public TerminalNode REPETITIONS() { return getToken(minipascalParser.REPETITIONS, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(minipascalParser.BRACKET_OPEN, 0); }
		public TerminalNode ID() { return getToken(minipascalParser.ID, 0); }
		public TerminalNode COMPARATORS() { return getToken(minipascalParser.COMPARATORS, 0); }
		public TerminalNode CONTENT() { return getToken(minipascalParser.CONTENT, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(minipascalParser.BRACKET_CLOSE, 0); }
		public TerminalNode DO() { return getToken(minipascalParser.DO, 0); }
		public TerminalNode BEGIN_EXECUTION() { return getToken(minipascalParser.BEGIN_EXECUTION, 0); }
		public TerminalNode END_EXECUTION() { return getToken(minipascalParser.END_EXECUTION, 0); }
		public TerminalNode SEMICOLON() { return getToken(minipascalParser.SEMICOLON, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public List<Console_actionsContext> console_actions() {
			return getRuleContexts(Console_actionsContext.class);
		}
		public Console_actionsContext console_actions(int i) {
			return getRuleContext(Console_actionsContext.class,i);
		}
		public List<LoopsContext> loops() {
			return getRuleContexts(LoopsContext.class);
		}
		public LoopsContext loops(int i) {
			return getRuleContext(LoopsContext.class,i);
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
			setState(59);
			match(REPETITIONS);
			setState(60);
			match(BRACKET_OPEN);
			setState(61);
			match(ID);
			setState(62);
			match(COMPARATORS);
			setState(63);
			match(CONTENT);
			setState(64);
			match(BRACKET_CLOSE);
			setState(65);
			match(DO);
			setState(66);
			match(BEGIN_EXECUTION);
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(67);
					sentence();
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(73);
					console_actions();
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(79);
					loops();
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(85);
			match(END_EXECUTION);
			setState(86);
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
		enterRule(_localctx, 6, RULE_sentence);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				variable_assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				variable_inference();
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
		enterRule(_localctx, 8, RULE_variable_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(TYPES);
			setState(94);
			match(ID);
			setState(95);
			match(EQUALS);
			setState(96);
			_la = _input.LA(1);
			if ( !(_la==NUMBERS || _la==CONTENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(97);
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
		public TerminalNode CONTENT() { return getToken(minipascalParser.CONTENT, 0); }
		public TerminalNode NUMBERS() { return getToken(minipascalParser.NUMBERS, 0); }
		public Variable_inferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_inference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterVariable_inference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitVariable_inference(this);
		}
	}

	public final Variable_inferenceContext variable_inference() throws RecognitionException {
		Variable_inferenceContext _localctx = new Variable_inferenceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable_inference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(ID);
			setState(100);
			match(ASSIGN);
			setState(101);
			_la = _input.LA(1);
			if ( !(_la==NUMBERS || _la==CONTENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(102);
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
		enterRule(_localctx, 12, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(TYPES);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(105);
				match(ID);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(106);
					match(COMMA);
					}
				}

				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
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
		public TerminalNode CONTENT() { return getToken(minipascalParser.CONTENT, 0); }
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
		enterRule(_localctx, 14, RULE_string_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(CONTENT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31y\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\7\2"+
		"\27\n\2\f\2\16\2\32\13\2\3\2\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\7\2$\n"+
		"\2\f\2\16\2\'\13\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\7\3\66\n\3\f\3\16\39\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\7\4G\n\4\f\4\16\4J\13\4\3\4\7\4M\n\4\f\4\16\4P\13\4\3\4\7\4S"+
		"\n\4\f\4\16\4V\13\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5^\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\bn\n\b\7\bp\n\b\f\b\16\bs\13"+
		"\b\3\b\3\b\3\t\3\t\3\t\n\30\37%+\67HNT\2\n\2\4\6\b\n\f\16\20\2\3\4\2\r"+
		"\r\20\20\2|\2\22\3\2\2\2\4\60\3\2\2\2\6=\3\2\2\2\b]\3\2\2\2\n_\3\2\2\2"+
		"\fe\3\2\2\2\16j\3\2\2\2\20v\3\2\2\2\22\23\7\3\2\2\23\24\7\17\2\2\24\30"+
		"\7\26\2\2\25\27\5\b\5\2\26\25\3\2\2\2\27\32\3\2\2\2\30\31\3\2\2\2\30\26"+
		"\3\2\2\2\31\33\3\2\2\2\32\30\3\2\2\2\33\37\7\4\2\2\34\36\5\6\4\2\35\34"+
		"\3\2\2\2\36!\3\2\2\2\37 \3\2\2\2\37\35\3\2\2\2 %\3\2\2\2!\37\3\2\2\2\""+
		"$\5\4\3\2#\"\3\2\2\2$\'\3\2\2\2%&\3\2\2\2%#\3\2\2\2&+\3\2\2\2\'%\3\2\2"+
		"\2(*\5\b\5\2)(\3\2\2\2*-\3\2\2\2+,\3\2\2\2+)\3\2\2\2,.\3\2\2\2-+\3\2\2"+
		"\2./\7\5\2\2/\3\3\2\2\2\60\61\7\b\2\2\61\62\7\27\2\2\62\67\5\20\t\2\63"+
		"\64\7\23\2\2\64\66\7\17\2\2\65\63\3\2\2\2\669\3\2\2\2\678\3\2\2\2\67\65"+
		"\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\7\30\2\2;<\7\26\2\2<\5\3\2\2\2=>\7\t"+
		"\2\2>?\7\27\2\2?@\7\17\2\2@A\7\f\2\2AB\7\20\2\2BC\7\30\2\2CD\7\22\2\2"+
		"DH\7\6\2\2EG\5\b\5\2FE\3\2\2\2GJ\3\2\2\2HI\3\2\2\2HF\3\2\2\2IN\3\2\2\2"+
		"JH\3\2\2\2KM\5\4\3\2LK\3\2\2\2MP\3\2\2\2NO\3\2\2\2NL\3\2\2\2OT\3\2\2\2"+
		"PN\3\2\2\2QS\5\6\4\2RQ\3\2\2\2SV\3\2\2\2TU\3\2\2\2TR\3\2\2\2UW\3\2\2\2"+
		"VT\3\2\2\2WX\7\7\2\2XY\7\26\2\2Y\7\3\2\2\2Z^\5\16\b\2[^\5\n\6\2\\^\5\f"+
		"\7\2]Z\3\2\2\2][\3\2\2\2]\\\3\2\2\2^\t\3\2\2\2_`\7\n\2\2`a\7\17\2\2ab"+
		"\7\24\2\2bc\t\2\2\2cd\7\26\2\2d\13\3\2\2\2ef\7\17\2\2fg\7\25\2\2gh\t\2"+
		"\2\2hi\7\26\2\2i\r\3\2\2\2jq\7\n\2\2km\7\17\2\2ln\7\23\2\2ml\3\2\2\2m"+
		"n\3\2\2\2np\3\2\2\2ok\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2"+
		"sq\3\2\2\2tu\7\26\2\2u\17\3\2\2\2vw\7\20\2\2w\21\3\2\2\2\r\30\37%+\67"+
		"HNT]mq";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}