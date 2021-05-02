// Generated from minipascal.g4 by ANTLR 4.7.2

    //This header adds the lexer exactly to the package that de application are looking for
    package tcc.lexer.analyzer;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link minipascalParser}.
 */
public interface minipascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link minipascalParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(minipascalParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(minipascalParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#console_actions}.
	 * @param ctx the parse tree
	 */
	void enterConsole_actions(minipascalParser.Console_actionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#console_actions}.
	 * @param ctx the parse tree
	 */
	void exitConsole_actions(minipascalParser.Console_actionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#loops}.
	 * @param ctx the parse tree
	 */
	void enterLoops(minipascalParser.LoopsContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#loops}.
	 * @param ctx the parse tree
	 */
	void exitLoops(minipascalParser.LoopsContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(minipascalParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(minipascalParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#variable_assign}.
	 * @param ctx the parse tree
	 */
	void enterVariable_assign(minipascalParser.Variable_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#variable_assign}.
	 * @param ctx the parse tree
	 */
	void exitVariable_assign(minipascalParser.Variable_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#variable_inference}.
	 * @param ctx the parse tree
	 */
	void enterVariable_inference(minipascalParser.Variable_inferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#variable_inference}.
	 * @param ctx the parse tree
	 */
	void exitVariable_inference(minipascalParser.Variable_inferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(minipascalParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(minipascalParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#string_declaration}.
	 * @param ctx the parse tree
	 */
	void enterString_declaration(minipascalParser.String_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#string_declaration}.
	 * @param ctx the parse tree
	 */
	void exitString_declaration(minipascalParser.String_declarationContext ctx);
}