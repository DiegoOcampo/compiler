/* Analizador lexico para el lenguaje Jay - Tucker y Noonan */
//package co.edu.eafit.dis.st0270.p20151.dije.p10.lexer;

//import co.edu.eafit.dis.st0270.p20151.dije.p10.Token.EnumToken;

%%
%class dijeJFlexLexer
%unicode
%line
%column
%function getNextToken
%int
%public
%{
public int getLine() {
   return yyline + 1;
}

public int getColumn() {
   return yycolumn + 1;
}
%}

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\n\f]

Identifier = [:jletter:][:jletterdigit:"_"]*

DecIntegerLiteral = 0 | [1-9][0-9]*
Keyword           = "if" | "then" | "while" | "do" | "odd" | "const" | "var" | "procedure" | "call" | "begin" | "end"

%%


<YYINITIAL> {
   {Keyword}                     { return EnumToken.keyword.ordinal(); }
   {Identifier}                  { return EnumToken.Identifier.ordinal(); }
   {DecIntegerLiteral}           { return EnumToken.DecIntegerLiteral.ordinal(); }
   "(" | ")" | ";" | "," | "."
                                 { return EnumToken.Separator.ordinal(); }
   ":=" | "+" | "-" | "*" | "/" | "<" | "<=" | ">" | ">=" | "=" | "<>"
                                 { return EnumToken.Operator.ordinal(); }
   {WhiteSpace}                  { /* Ignore */ }
}

.|\n                             { throw new Error("Illegal character <" + yytext() + "> at line: " + (yyline + 1) + " column: " + yycolumn); }
