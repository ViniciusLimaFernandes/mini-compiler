grammar minipascal;
@header {
    //This header adds the lexer exactly to the package that de application are looking for
    package tcc.lexer.analyzer;
    import tcc.lexer.data.MinipascalSymbol;
    import tcc.lexer.data.MinipascalSymbolTable;
    import tcc.lexer.data.MinipascalVariable;
    import tcc.lexer.exceptions.MinipascalSemanticException;
    import java.util.ArrayList;
}

@members{
    private int type;
    private String varName;
    private String varValue;
    private MinipascalSymbolTable symbolTable = new MinipascalSymbolTable();
    private MinipascalSymbol symbol;
}

program: PROGRAM ID SEMICOLON
            sentence*?
         BEGIN
            (loops | console_actions | sentence | conditions)*?
         END;

console_actions: CONSOLE BRACKET_OPEN
                (string_declaration|ID {
                          varName = _input.LT(-1).getText();
                          varValue = null;
                          symbol = new MinipascalVariable(varName,type, varValue);
                          if (!symbolTable.exists(varName)) {
                               throw new MinipascalSemanticException("The symbol " + varName + " aren't previously declared!");
                          }
                }
                (OPERATORS)?)*
                (COMMA ID {
                            varName = _input.LT(-1).getText();
                            varValue = null;
                            symbol = new MinipascalVariable(varName,type, varValue);
                            if (!symbolTable.exists(varName)) {
                                 throw new MinipascalSemanticException("The symbol " + varName + " aren't previously declared!");
                            }
                })*?
                BRACKET_CLOSE
                SEMICOLON;

loops: WHILE BRACKET_OPEN ID {
                       varName = _input.LT(-1).getText();
                       varValue = null;
                       symbol = new MinipascalVariable(varName,type, varValue);
                       if (!symbolTable.exists(varName)) {
                            throw new MinipascalSemanticException("The symbol " + varName + " aren't previously declared!");
                       }
              }
              COMPARATORS (string_declaration|ID {
                       varName = _input.LT(-1).getText();
                       varValue = null;
                       symbol = new MinipascalVariable(varName,type, varValue);
                       if (!symbolTable.exists(varName)) {
                            throw new MinipascalSemanticException("The symbol " + varName + " aren't previously declared!");
                       }
              })
              BRACKET_CLOSE DO
              BEGIN_EXECUTION
               (loops | console_actions | sentence | conditions)+?
              END_EXECUTION SEMICOLON;

conditions: IF (ID {
                      varName = _input.LT(-1).getText();
                      varValue = null;
                      symbol = new MinipascalVariable(varName,type, varValue);
                      if (!symbolTable.exists(varName)) {
                           throw new MinipascalSemanticException("The symbol " + varName + " aren't previously declared!");
                      }
             }
            | CONTENT) COMPARATORS (ID {
                      varName = _input.LT(-1).getText();
                      varValue = null;
                      symbol = new MinipascalVariable(varName,type, varValue);
                      if (!symbolTable.exists(varName)) {
                           throw new MinipascalSemanticException("The symbol " + varName + " aren't previously declared!");
                      }
             }
            | NUMBERS) THEN
            (loops | console_actions | sentence | conditions)*
            ELSE?
            (loops | console_actions | sentence | conditions)*
            END_EXECUTION;

sentence: variable_declaration | variable_assign  | variable_assign_with_oprations;

variable_assign: ID{
                   varName = _input.LT(-1).getText();
                   varValue = null;
                   symbol = new MinipascalVariable(varName,type, varValue);
                   if (!symbolTable.exists(varName)) {
                        throw new MinipascalSemanticException("The symbol " + varName + " aren't previously declared!");
                   }
                }
                ASSIGN (string_declaration | NUMBERS) SEMICOLON { System.out.println("Variable value assign found.");}
               ;

variable_assign_with_oprations: ID {
                                         varName = _input.LT(-1).getText();
                                         varValue = null;
                                         symbol = new MinipascalVariable(varName,type, varValue);
                                         if (!symbolTable.exists(varName)) {
                                              throw new MinipascalSemanticException("The symbol " + varName + " aren't previously declared!");
                                         }
                               }
                              ASSIGN BRACKET_OPEN variables_operations* BRACKET_CLOSE OPERATORS? (NUMBERS|ID {
                                        varName = _input.LT(-1).getText();
                                        varValue = null;
                                        symbol = new MinipascalVariable(varName,type, varValue);
                                        if (!symbolTable.exists(varName)) {
                                             throw new MinipascalSemanticException("The symbol " + varName + " aren't previously declared!");
                                        }
                              })?
                              SEMICOLON { System.out.println("Variable value assign with operations found.");}
                              ;

variables_operations: ID {
                            varName = _input.LT(-1).getText();
                            varValue = null;
                            symbol = new MinipascalVariable(varName,type, varValue);
                            if (!symbolTable.exists(varName)) {
                                 throw new MinipascalSemanticException("The symbol " + varName + " aren't previously declared!");
                            }
                   }
                    OPERATORS (ID {
                             varName = _input.LT(-1).getText();
                             varValue = null;
                             symbol = new MinipascalVariable(varName,type, varValue);
                             if (!symbolTable.exists(varName)) {
                                  throw new MinipascalSemanticException("The symbol " + varName + " aren't previously declared!");
                             }
                    }
                    |NUMBERS)?
                    ;

variable_declaration: TYPES (ID {
                        varName = _input.LT(-1).getText();
                        varValue = null;
                        symbol = new MinipascalVariable(varName,type, varValue);
                        if (!symbolTable.exists(varName)) {
                            symbolTable.add(symbol);
                            System.out.println("Symbol " +  symbol.toString() + " added.");
                        } else {
                            throw new MinipascalSemanticException("The symbol " + varName + " already exists!");
                        }
                    }
                    COMMA?)* SEMICOLON { System.out.println("Variable declaration found."); }
                    ;

string_declaration: STRING_CONTENT;

PROGRAM: 'Program';

BEGIN: 'Begin';

END: 'End.';

BEGIN_EXECUTION : 'begin';

END_EXECUTION: 'end';

DO: 'do';

CONSOLE: 'readln' | 'writeln';

WHILE: 'while';

FOR: 'for';

IF: 'if';

ELSE: 'else';

THEN: 'then';

TYPES : INTEGER| STRING | CHAR | LONG | BOOLEAN | VAR
      ;

INTEGER: 'Int' { type = MinipascalVariable.NUMBER; }
       ;

STRING: 'String' { type = MinipascalVariable.TEXT; }
       ;

CHAR: 'Char' { type = MinipascalVariable.TEXT; }
    ;

LONG: 'Long' { type = MinipascalVariable.NUMBER; }
    ;

BOOLEAN: 'Boolean' { type = MinipascalVariable.NUMBER; }
       ;

VAR: 'Var' { type = MinipascalVariable.TEXT; }
   ;

OPERATORS : '-' | '+' | '*' | '/';

COMPARATORS : '<>' | '==' | '<=' | '>=' | '!=' | '>' | '<';

NUMBERS  : [+|-]?[0-9]+;

QUOTES: '"';

ID: [0-9A-Za-z]+;

STRING_CONTENT: QUOTES .*? QUOTES;

CONTENT : (('"')?[0-9A-Za-z]('"')?)+;

COMMENTS : '\\' | '/*' | '*/';

COMMA: ',';

EQUALS: '=';

ASSIGN: ':=';

SEMICOLON: ';';

BRACKET_OPEN : '(';

BRACKET_CLOSE:  ')';

SPECIAL  : [\t\r\n ]+ -> skip;