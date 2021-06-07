// Generated from minipascal.g4 by ANTLR 4.7.2

    //This header adds the lexer exactly to the package that de application are looking for
    package tcc.lexer.analyzer;
    import tcc.lexer.data.MinipascalSymbol;
    import tcc.lexer.data.MinipascalSymbolTable;
    import tcc.lexer.data.MinipascalVariable;
    import tcc.lexer.exceptions.MinipascalSemanticException;
    import java.util.ArrayList;

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
	 * Enter a parse tree produced by {@link minipascalParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions(minipascalParser.ConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions(minipascalParser.ConditionsContext ctx);
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
	 * Enter a parse tree produced by {@link minipascalParser#variable_assign_with_oprations}.
	 * @param ctx the parse tree
	 */
	void enterVariable_assign_with_oprations(minipascalParser.Variable_assign_with_oprationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#variable_assign_with_oprations}.
	 * @param ctx the parse tree
	 */
	void exitVariable_assign_with_oprations(minipascalParser.Variable_assign_with_oprationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#variables_operations}.
	 * @param ctx the parse tree
	 */
	void enterVariables_operations(minipascalParser.Variables_operationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#variables_operations}.
	 * @param ctx the parse tree
	 */
	void exitVariables_operations(minipascalParser.Variables_operationsContext ctx);
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