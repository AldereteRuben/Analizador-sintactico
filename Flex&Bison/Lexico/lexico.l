%option noyywrap

%{
/*	
Ejemplo de entrada al generador lex
señala los números e identificadores
*/
#include <stdio.h>
FILE *tiraTokens=NULL, *errores=NULL;

int numLinea=1;
void escribirtiraTokenss(char token[]);
void escribirError();
%}

letra			[a-zA-z]
digito			[0-9]
alfanumerico	[a-zA-Z0-9]
identificador 	{letra}{alfanumerico}*
nint			{digito}+
nfloat			{digito}+(\.{digito}+)?(E[\+|\-]?{digito}+)+

%%
[\n]			++numLinea;

"["				{printf("%-15d%-20s%10s\n",numLinea, yytext, "\[");
escribirtiraTokenss("\[");}

"]"				{printf("%-15d%-20s%10s\n",numLinea, yytext, "]");
escribirtiraTokenss("]");}

["]			{printf("%-15d%-20s%10s\n",numLinea, yytext, "\"");
escribirtiraTokenss("\"");}

","				{printf("%-15d%-20s%10s\n",numLinea, yytext, ",");
escribirtiraTokenss(",");}

":"			{printf("%-15d%-20s%10s\n",numLinea, yytext, ":");
escribirtiraTokenss(":");}

";"				{printf("%-15d%-20s%10s\n",numLinea, yytext, ";");
escribirtiraTokenss(";");}

"("				{printf("%-15d%-20s%10s\n",numLinea, yytext, "(");
escribirtiraTokenss("(");}

")"				{printf("%-15d%-20s%10s\n",numLinea, yytext, ")");
escribirtiraTokenss(")");}

"{"				{printf("%-15d%-20s%10s\n",numLinea, yytext, "{");
escribirtiraTokenss("{");}

"}"				{printf("%-15d%-20s%10s\n",numLinea, yytext, "}");
escribirtiraTokenss("}");}

"+"				{printf("%-15d%-20s%10s\n",numLinea, yytext, "+");
escribirtiraTokenss("+");}

"-"				{printf("%-15d%-20s%10s\n",numLinea, yytext, "-");
escribirtiraTokenss("-");}

"/"				{printf("%-15d%-20s%10s\n",numLinea, yytext, "/");
escribirtiraTokenss("/");}

"*"				{printf("%-15d%-20s%10s\n",numLinea, yytext, "*");
escribirtiraTokenss("*");}

"%"				{printf("%-15d%-20s%10s\n",numLinea, yytext, "%");
escribirtiraTokenss("%");}

"="			{printf("%-15d%-20s%10s\n",numLinea, yytext, "=");
escribirtiraTokenss("=");}

"&"				{printf("%-15d%-20s%10s\n",numLinea, yytext, "&");
escribirtiraTokenss("&");}

"!"			{printf("%-15d%-20s%10s\n",numLinea, yytext, "!");
escribirtiraTokenss("!");}

"++"			{printf("%-15d%-20s%10s\n",numLinea, yytext, "++");
escribirtiraTokenss("++");}

"--"			{printf("%-15d%-20s%10s\n",numLinea, yytext, "--");
escribirtiraTokenss("--");}

"<"			{printf("%-15d%-20s%10s\n",numLinea, yytext, "<");
escribirtiraTokenss("<");}

">"			{printf("%-15d%-20s%10s\n",numLinea, yytext, ">");
escribirtiraTokenss(">");}

"<="			{printf("%-15d%-20s%10s\n",numLinea, yytext, "<=");
escribirtiraTokenss("<=");}

">="			{printf("%-15d%-20s%10s\n",numLinea, yytext, ">=");
escribirtiraTokenss(">=");}

"!="			{printf("%-15d%-20s%10s\n",numLinea, yytext, "!=");
escribirtiraTokenss("!=");}

"=="			{printf("%-15d%-20s%10s\n",numLinea, yytext, "==");
escribirtiraTokenss("==");}

"&&"			{printf("%-15d%-20s%10s\n",numLinea, yytext, "&&");
escribirtiraTokenss("&&");}

"||"			{printf("%-15d%-20s%10s\n",numLinea, yytext, "||");
escribirtiraTokenss("||");}

"if"			{printf("%-15d%-20s%10s\n",numLinea, yytext, "if");
escribirtiraTokenss("if");}

"else"			{printf("%-15d%-20s%10s\n",numLinea, yytext, "else");
escribirtiraTokenss("else");}

"while"			{printf("%-15d%-20s%10s\n",numLinea, yytext, "while");
escribirtiraTokenss("while");}

"do"			{printf("%-15d%-20s%10s\n",numLinea, yytext, "do");
escribirtiraTokenss("do");}

"switch"			{printf("%-15d%-20s%10s\n",numLinea, yytext, "switch");
escribirtiraTokenss("switch");}

"case"			{printf("%-15d%-20s%10s\n",numLinea, yytext, "case");
escribirtiraTokenss("case");}

"break"			{printf("%-15d%-20s%10s\n",numLinea, yytext, "break");
escribirtiraTokenss("break");}

"default"			{printf("%-15d%-20s%10s\n",numLinea, yytext, "default");
escribirtiraTokenss("default");}

"printf"			{printf("%-15d%-20s%10s\n",numLinea, yytext, "printf");
escribirtiraTokenss("printf");}

"scanf"			{printf("%-15d%-20s%10s\n",numLinea, yytext, "scanf");
escribirtiraTokenss("scanf");}

"String"			{printf("%-15d%-20s%10s\n",numLinea, yytext, "String");
escribirtiraTokenss("String");}

"Caracter"			{printf("%-15d%-20s%10s\n",numLinea, yytext, "Caracter");
escribirtiraTokenss("Caracter");}

"for"			{printf("%-15d%-20s%10s\n",numLinea, yytext, "for");
escribirtiraTokenss("for");}

"float"			{printf("%-15d%-20s%10s\n",numLinea, yytext, "float");
escribirtiraTokenss("float");}

"int"			{printf("%-15d%-20s%10s\n",numLinea, yytext, "int");
escribirtiraTokenss("int");}

"char"			{printf("%-15d%-20s%10s\n",numLinea, yytext, "char");
escribirtiraTokenss("char");}

"bool"			{printf("%-15d%-20s%10s\n",numLinea, yytext, "bool");
escribirtiraTokenss("bool");}

"main"			{printf("%-15d%-20s%10s\n",numLinea, yytext, "main");
escribirtiraTokenss("main");}

"return"		{printf("%-15d%-20s%10s\n",numLinea, yytext, "return");
escribirtiraTokenss("return");}

{identificador}	{printf("%-15d%-20s%10s\n",numLinea, yytext, "id");
escribirtiraTokenss("id");}

{nint}			{printf("%-15d%-20s%10s\n",numLinea, yytext, "nint");
escribirtiraTokenss("nint");}

{nfloat}		{printf("%-15d%-20s%10s\n",numLinea, yytext, "nfloat");
escribirtiraTokenss("nfloat");}

[ \t\v\f]		{/*ignorar*/}

.				{escribirError();}
%%

main(int argc, char *argv[]){
yyin = fopen("Prueba1.c","r");
tiraTokens=fopen("tiraTokens.txt","w");
errores=fopen("errores.txt","w");
if(yyin!=NULL){
	printf("%-15s%-20s%10s\n", "numlinea", "lexema", "token");
	fprintf(tiraTokens,"%-15s%-20s%10s\n","num linea", "lexema", "token");
	fprintf(errores, "Tabla de errores lexicos\n");
	yylex();
}
}

void escribirtiraTokenss(char token[]){
	fprintf(tiraTokens,"%-15d%-20s%10s\n",numLinea, yytext, token);
}

void escribirError(){
	fprintf(errores,"%-15d%s%s%s\n",numLinea, ": Error lexico \"", yytext, "\" no definido");
}