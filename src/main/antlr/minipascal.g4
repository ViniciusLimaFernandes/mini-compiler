lexer grammar minipascal;
@header {
    //This header adds the lexer exactly to the package that de application are looking for
    package tcc.lexer.analyzer;
}

PROGRAM: 'Program'(' '[a-zA-Z0-9]+[,]?);

TYPES : 'Int'| 'String' | 'Char' | 'Long' | 'Boolean' | 'Var';

OPERATORS : ':=' | '-' | '+' | '*' | '/';

COMPARATORS : '<>' | '==' | '<=' | '>=' | '!=';

NUMBERS  : [+|-]?[0-9]+;

TEXT : '"'((' ')?[a-zA-Z]+(' ')?)+'"';

COMMENTS : '\\' | '/*' | '*/';

CONSOLE: 'readln' | 'writeln';

REPETITIONS: 'for' | 'while';

EXECUTIONS : 'do' | 'end';

SEPARATORS: ',';

BLOCKDEFINITION: 'Begin' | 'End.' | ';';

SPECCHARS : '(' | ')';

VARIABLES : TYPES? (' ')? ([a-zA-Z0-9]+[,]?);

SPECIAL  : [ \t\r\n]+ -> skip;