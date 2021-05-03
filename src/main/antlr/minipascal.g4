grammar minipascal;
@header {
    //This header adds the lexer exactly to the package that de application are looking for
    package tcc.lexer.analyzer;
}

program: PROGRAM ID SEMICOLON
            sentence*?
         BEGIN
            (loops | console_actions | sentence | conditions)*?
         END;

console_actions: CONSOLE BRACKET_OPEN
                (string_declaration|ID(OPERATORS)?)*
                (COMMA ID)*?
                BRACKET_CLOSE
                SEMICOLON;

loops: WHILE BRACKET_OPEN ID COMPARATORS (string_declaration|ID) BRACKET_CLOSE DO
              BEGIN_EXECUTION
               (loops | console_actions | sentence | conditions)+?
              END_EXECUTION SEMICOLON;

conditions: IF (ID | CONTENT) COMPARATORS (ID | NUMBERS) THEN
            (loops | console_actions | sentence | conditions)*
            ELSE?
            (loops | console_actions | sentence | conditions)*
            END_EXECUTION;

sentence: variable_declaration | variable_assign | variable_inference | variable_inference_with_oprations;

variable_assign: TYPES ID EQUALS (CONTENT | NUMBERS) SEMICOLON;

variable_inference: ID ASSIGN (string_declaration | NUMBERS) SEMICOLON;

variable_inference_with_oprations: ID ASSIGN BRACKET_OPEN variables_operations* BRACKET_CLOSE OPERATORS? (NUMBERS|ID)? SEMICOLON;

variables_operations: ID OPERATORS (ID|NUMBERS)?;

variable_declaration: TYPES (ID COMMA?)* SEMICOLON;

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

TYPES : 'Int'| 'String' | 'Char' | 'Long' | 'Boolean' | 'Var';

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