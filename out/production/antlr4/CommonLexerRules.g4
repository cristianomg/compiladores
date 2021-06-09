lexer grammar CommonLexerRules;

MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
EQ: '=';
APARE: '(';
FPARE: ')';
ID: [a-zA-Z]+;
INT: [0-9]+;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;
IF: 'if';
ELSE: 'else';
ABCHV: '{';
FCHV: '}';
PRINTLN: 'println';
MAIOR: '>';
MENOR: '<';
EQUALS: '==';
DIF: '!=';
MAIOREQ: '>=';
MENOREQ: '<=';
WHILE: 'while';

