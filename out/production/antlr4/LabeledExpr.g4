grammar LabeledExpr;

import CommonLexerRules;

prog: stat+;

stat: expr NEWLINE  # none
    | ID EQ expr NEWLINE # assign
    | NEWLINE # blank
    | println # none
    | if_definition NEWLINE #none
    | boolean_op NEWLINE #none
    | while_definition NEWLINE #none
    ;

if_definition : IF APARE boolean_op FPARE ABCHV prog FCHV ELSE ABCHV prog FCHV
;

while_definition : WHILE APARE boolean_op FPARE ABCHV prog FCHV
    ;
println: PRINTLN APARE expr FPARE
    ;

boolean_op: expr MAIOR expr #MaiorQ
    | expr MAIOREQ expr #MaiorEQ
    | expr MENOR expr #MenorQ
    | expr MENOREQ expr #MenorEQ
    | expr EQUALS expr #Equals
    | expr DIF expr #Dif
    ;


expr: expr op=(MUL | DIV) expr # MulDiv
    | expr op=(ADD | SUB) expr # AddSub
    | INT # int
    | ID # id
    | APARE expr FPARE # parens
    ;
