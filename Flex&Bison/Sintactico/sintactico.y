%{
#include<stdio.h>
#define YYSTYPE char *
%}

%token INT MAIN PARENTESISABRE PARENTESISCIERRA LLAVEABRE LLAVECIERRA ID CHAR BOOL FLOAT COMA NINT CORCHETEABRE CORCHETECIERRA AMPERSAND ADMIRACIONCIERRA SIGNOIGUAL PUNTOYC SIGNOMAS SIGNOMENOS DIAGONAL ASTERISCO INCREMENTO DECREMENTO FOR MENORQUE MAYORQUE MENORIGUAL MAYORIGUAL DISTINTODE IGUALQUE ELSE IF AND OR WHILE COMILLA SWITCH CASE DEFAULT BREAK DO STRING DOSPUNTOS PRINTF SCANF RETURN
/*El no terminal CARACTER no fue incluido por posibles conflictos de identificacion de tipos*/

%start A /*simbolo inicial de la gramatica*/

%%
/*Gramatica*/

A: A B C D E {printf("A -> A B C D E \n");}
;

A: /*epsilon*/ {printf("A -> epsilon \n");}
;

B: INT {printf("B -> int \n");} | /*epsilon*/ {printf("B -> epsilon \n");}
;

C: MAIN {printf("C -> main \n");}
;

D: PARENTESISABRE F PARENTESISCIERRA {printf("D -> ( F ) \n");}
;

F: /*epsilon*/ {printf("F -> epsilon\n");}
;

E: LLAVEABRE GN AJ LLAVECIERRA {printf("E -> { GN AJ } \n");}
;

GN: G {printf("GN -> G \n");}
;

G: AZ G {printf("G -> AZ G \n");}| YF G {printf("G -> YF G \n");} | FI G {printf("G -> FI G \n");} | PR G {printf("G -> PR G \n");} | PL G {printf("G -> PL G \n");} | PQ G {printf("G -> PQ G \n");} | /*epsilon*/ {printf("G -> epsilon \n");}
;

AZ: H {printf("AZ -> H \n");} | /*epsilon*/ {printf("AZ -> epsilon \n");} 
;

AJ: RETURN NINT PUNTOYC {printf("AJ -> return nint ; \n");} | /*epsilon*/ {printf("AJ -> epsilon \n");}
;

H: J Q K M L PUNTOYC H {printf("H -> J Q K M L ; H \n");} | /*epsilon*/ {printf("H -> epsilon \n");}
;

L: COMA Q K M L {printf("L -> , Q K M L \n");} | /*epsilon*/ {printf("L -> epsilon \n");}
;

J: FLOAT {printf("J -> float \n");} | INT {printf("J -> int \n");} | BOOL {printf("J -> bool \n");} | CHAR {printf("J -> char");}
;

K: ID AL {printf("K -> id AL \n");}
;

AL: CORCHETEABRE NN CORCHETECIERRA AL {printf("AL -> [ NN ] \n");} | /*epsilon*/{printf("AL -> epsilon \n");}
;

M: N R {printf("M -> N R \n");} | LLAVEABRE DD P LLAVECIERRA {printf("M -> { DD P } \n");} | /*epsilon*/ {printf("M -> epsilon \n");}
;

N: AMPERSAND {printf("N -> & \n");} | NINT {printf("N -> nint \n");}
;

NN: NINT {printf("NN -> nint \n");} | ID {printf("NN -> id \n");}
;

R: K {printf("R -> K \n");} | /*epsilon*/ {printf("R -> epsilon \n");}
;

P: COMA DD P {printf("P -> , DD P \n");} | /*epsilon*/ {printf("P -> epsilon \n");}
;

DD: NINT {printf("DD -> nint");}
;

Q: ASTERISCO {printf("Q -> * \n");} | /*epsilon*/ {printf("Q -> epsilon \n");}
;

FI: I {printf("FI -> I \n");}
;

I: R S SIG PUNTOYC I {printf("I -> R S SIG ; I \n");} | R S IDX PUNTOYC I {printf("I -> R S IDX ; I \n");} | /*epsilon*/ {printf("I -> epsilon \n");}
;


/*Se renombró la regla de producción "ID" de la gramática original por "IDX" para evitar posibles conflictos con el token "ID"*/

IDX: STRING {printf("IDX -> String \n");}
;

S: U SIGNOIGUAL {printf("S -> U = \n");}
;

/*Andro de la U para abajo*/

U: DIAGONAL {printf("U -> / \n");} | ASTERISCO {printf("U -> * \n");} | SIGNOMAS {printf("U -> + \n");} | SIGNOMENOS {printf("U -> - \n");} | /*epsilon*/ {printf("U -> epsilon \n");}
;

SIG: T {printf("SIG -> T \n");}
;

T: T V W {printf("T -> T V W\n");} | W {printf(" T -> W \n");}
;

W: NN {printf("W -> NN \n");} | PARENTESISABRE T PARENTESISCIERRA {printf("W -> ( T ) \n");}
;

V: U {printf("V -> U \n");}
;

YF: Y {printf("YF -> Y \n");}
;

Y: FOR PARENTESISABRE X AD AB AE PUNTOYC AA PARENTESISCIERRA E Y {printf("Y -> for ( X AD AB AE ; AA ) E Y \n");} | /*epsilon*/ {printf("Y -> epsilon \n");} | WHILE PARENTESISABRE AD AB AE PARENTESISCIERRA E Y {printf("Y -> while ( AD AB AE ) E Y \n");} | IF PARENTESISABRE AD AB AE PARENTESISCIERRA E Y {printf("Y -> if ( AD AB AE ) E Y \n");} | SWITCH PARENTESISABRE ID PARENTESISCIERRA AF Y {printf("switch ( id ) AF Y \n");}
;

X: BB ID M PUNTOYC {printf("X -> BB id M ; \n");}
;

BB: J {printf("BB -> J \n");} | /*epsilon*/ {printf("BB -> epsilon \n");}
;

AB: MENORQUE {printf("AB -> < \n");} | AB MENORIGUAL {printf("AB -> <= \n");} | MAYORQUE {printf("AB -> > \n");} | MAYORIGUAL {printf("AB -> >= \n");} | ADMIRACIONCIERRA {printf("AB -> ! \n");} | DISTINTODE {printf("AB -> != \n");} | IGUALQUE {printf("AB -> == \n");} | AND {printf("AB -> && \n");} | OR {printf("Ab - > || \n");}
;

AA: K INCREMENTO {printf("AA -> ++ \n");} | DECREMENTO {printf("AA -> -- \n");}
;

AC: ELSE E {printf("AC -> else E \n");} | /*epsilon*/ {printf("AC -> epsilon \n");}
;

AE: AD {printf("AE -> AD \n");}
;

AD: SIG {printf("AD -> SIG \n");} | NN {printf("AD -> NN \n");}
;

AI: CASE NINT DOSPUNTOS GN BREAK PUNTOYC {printf("AI -> case nint : GN break ; \n");}
;

AH: DEFAULT DOSPUNTOS GN BREAK PUNTOYC {printf("AH -> default : GN break ; \n");} | /*epsilon*/ {printf("AH -> epsilon \n");}
;

AF: LLAVEABRE AG AH LLAVECIERRA {printf("AF -> { AG AH } \n");}
;

AG: AI AG {printf("AG -> AI AG \n");} | /*epsilon*/ {printf("AG -> epsilon \n");}
;

PQ: PRINTF PARENTESISABRE BA CO JJ PARENTESISCIERRA PUNTOYC {printf("PQ -> printf ( BA CO JJ ) \n");} | /*epsilon*/ {printf("PQ -> epsilon \n");}
;

JJ: JP NXT {printf("JJ -> JP NXT \n");} | /*epsilon*/
;

BA: STRING {printf("BA -> string \n");} | /*epsilon*/ {printf("BA -> epsilon \n");}
;

JP: K {printf("JP -> K \n");} | SIG {printf("JP -> SIG \n");}
;

NXT: COMA JP NXT {printf("NXT -> , JP NXT \n");} | /*epsilon*/ {printf("NXT -> epsilon \n");}
;

CO: COMA {printf("CO -> , \n");} | /*epsilon*/ {printf("epsilon \n");}
;


PR: SCANF PARENTESISABRE STRING KR PARENTESISCIERRA PUNTOYC {printf("PR -> scanf ( String KR ) ; \n");} | /*epsilon*/ {printf("epsilon \n");}
;

KR: COMA AM ID {printf("KR -> , AM id \n");}
;

AM: AMPERSAND {printf("AM -> & \n");} | /*epsilon*/ {printf("AM -> epsilon \n");}
;

PL: DO E WHILE PARENTESISABRE AD AB AE PARENTESISCIERRA PUNTOYC {printf("PL -> do E while ( AD AB AE ) ; \n");} | /*epsilon*/ {printf("PL -> epsilon \n");}
;

%%
extern FILE *yyin;

yyerror(s)
char *s;
{
	fflush(stdout);
	printf("\n%s\n", s);
}

main(int argc, char *argv[]){
yyin = fopen("Prueba1.c", "r");
if(yyin!=NULL)
	yyparse();
else
	printf("No se pudo abrir el archivo");
}