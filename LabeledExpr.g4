grammar LabeledExpr;

import CommonLexerRules;

prog: stat+;

stat: 'println' APARE expr FPARE # println
    | 'if' APARE expr FPARE ABCHV prog FCHV 'else' ABCHV prog FCHV # ifStat
    | 'while' APARE expr FPARE ABCHV prog FCHV # whileStat
    | ID EQ expr NEWLINE # assign
    | NEWLINE # blank
    | expr # none
    ;

expr: expr op=(MUL | DIV) expr # MulDiv
    | expr op=(ADD | SUB) expr # AddSub
    | INT # int
    | ID # id
    | APARE expr FPARE # parens
	| expr op = (LTEQ | GTEQ | LT | GT) expr	# RelationalExpr
	| expr op = (EQUALS | NEQ) expr					# EqualityExpr
	| expr AND expr								# AndExpr
	| expr OR expr								# OrExpr
    ;
