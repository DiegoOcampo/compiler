lexer grammar dijeAntlrLexer;

//@lexer::header{
//package co.edu.eafit.dis.st0270.p20151.dije.p10.lexer;
//}

@lexer::rulecatch {
   catch (RecognitionException e) {
      throw e;
   }   
}
SEPARATORS
        : '(' 
        | ')' 
        | ';' 
        | ',' 
        | '.' 
        ;
OPERATORS
        : ':=' 
        | '+' 
        | '-' 
        | '*' 
        | '/' 
        | '<' 
        | '<='
        | '>' 
        | '>='
        | '=' 
        | '<>'
        ;
KEYWORDS
    : 'if'
    | 'then'
    | 'while'
    | 'do'
    | 'odd'
    | 'const'
    | 'var'
    | 'procedure'
    | 'call'
    | 'begin'
    | 'end'
    ;

ID  :   ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :   ('1'..'9')+ ('0')* | '0'
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        | '\f'
        ) -> skip
    ;
