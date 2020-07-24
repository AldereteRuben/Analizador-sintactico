%option noyywrap

%{
#include<stdio.h>
#include "sintactico.tab.h"
#define YYSTYPE char *

int numLinea=1;
%}
D 	[0-9]
L 	[a-zA-Z]

%%
"int"			return(INT);
"main" 			return(MAIN);
"("				return(PARENTESISABRE);
")" 			return(PARENTESISCIERRA);
"{" 			return(LLAVEABRE);
"}" 			return(LLAVECIERRA);
{L}({L}|{D})*	return(ID);
"char"          return(CHAR);
"bool"          return(BOOL);
"float"         return(FLOAT);
"," 			return(COMA);
{D}+|{D}+(\.{D}+)?(E[\+|\-]?{D}+)+			return(NINT);  /*CHECAR*/
"["				return(CORCHETEABRE);
"]" 			return(CORCHETECIERRA);
"&" 			return(AMPERSAND);
"!"  			return(ADMIRACIONCIERRA);
"="  			return(SIGNOIGUAL);
";"				return(PUNTOYC);
"+" 			return(SIGNOMAS);
"-" 			return(SIGNOMENOS);
"/" 			return(DIAGONAL);
"*" 			return(ASTERISCO);
"++" 			return(INCREMENTO);
"--"			return(DECREMENTO);
"for" 			return(FOR);
"<" 			return(MENORQUE);
">" 			return(MAYORQUE);
"<=" 			return(MENORIGUAL);
">=" 			return(MAYORIGUAL);
"!=" 			return(DISTINTODE);
"==" 			return(IGUALQUE);
"else" 			return(ELSE);
"if"			return(IF);
"&&" 			return(AND);
"||" 			return(OR);
"while" 		return(WHILE);
"\"" 			return(COMILLA);   /*CHECAR*/
"switch" 		return(SWITCH);
"case" 			return(CASE);
"default"		return(DEFAULT);
"break" 		return(BREAK);
"do" 			return(DO);
"String" 		return(STRING);
":" 			return(DOSPUNTOS);
"printf" 		return(PRINTF);
"scanf" 		return(SCANF);
"return" 		return(RETURN);


				/*reconocimiento de otros caracteres*/
%%