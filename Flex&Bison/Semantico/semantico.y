%{
#include<stdio.h>
#include<string.h>
#define YYSTYPE char *

char temp[100];
%}

%union{
	int val;
	char trad[100];
	char trad2[100];
	}

%token <val> NINT
%token <trad> ID 
%token INT MAIN PARENTESISABRE PARENTESISCIERRA LLAVEABRE LLAVECIERRA CHAR BOOL FLOAT COMA CORCHETEABRE CORCHETECIERRA AMPERSAND ADMIRACIONCIERRA SIGNOIGUAL PUNTOYC SIGNOMAS SIGNOMENOS DIAGONAL ASTERISCO INCREMENTO DECREMENTO FOR MENORQUE MAYORQUE MENORIGUAL MAYORIGUAL DISTINTODE IGUALQUE ELSE IF AND OR WHILE COMILLA SWITCH CASE DEFAULT BREAK DO STRING DOSPUNTOS PRINTF SCANF RETURN
/*El no terminal CARACTER no fue incluido por posibles conflictos de identificacion de tipos*/
%type <trad> A B C D E F G H I J K L M N NN P Q R S T U V W Y X AA AB AC BB AD AE AF AG AH AI AJ AZ AL PR PL PQ JP BA AM KR IDX CO DD SIG GN FI YF NXT JJ /*No terminales de la gramatica*/

%start A /*simbolo inicial de la gramatica*/

%%
/*Gramatica*/

A: A B C D E {
strcpy($$,$2);
strcat($$,$3);
strcat($$,$4);
strcat($$,$5);
printf("%s \n", $$);
} | /*epsilon*/ {strcpy($$,"");}
;

B: INT { } | /*epsilon*/ {strcpy($$,"");}
;

C: MAIN {strcpy($$,"begin ");}
;

D: PARENTESISABRE F PARENTESISCIERRA {}
;

F: /*epsilon*/ {strcpy($$,"");}
;

E: LLAVEABRE GN AJ LLAVECIERRA {
strcpy($$,$2);
strcat($$,$3);
}
;

GN: G {
	strcpy($$,$1);
}
;


AJ: RETURN NINT PUNTOYC {strcpy($$," end.");} | /*epsilon*/ {strcpy($$,"");}
;

G: AZ G {strcpy($$,$1); strcat($$,$2);}| YF G {strcpy($$,$1); strcat($$,$2);} | FI G {strcpy($$,$1); strcat($$,$2);} | PR G {strcpy($$,$1); strcat($$,$2);} | PL G {strcpy($$,$1); strcat($$,$2);} | PQ G {strcpy($$,$1); strcat($$,$2);} | /*epsilon*/ {strcpy($$,"");}
;

AZ: H {strcpy($$,$1);} | /*epsilon*/ {strcpy($$,"");} 
;


H: J Q K M L PUNTOYC H {
if(strcmp($2,"*")==1){
		strcpy($$,"type");
		strcat($$,$3);
		strcat($$,$1);
		strcat($$,";");
		strcat($$,$7);
}
if(strcmp($3,"")==0){ /*CHECAR*/
	strcpy($$," var ");
	strcat($$,$3);
	strcat($$," : ");
	strcat($$," array ");
	strcat($$," [ ");
	strcat($$," 0 ");
	strcat($$," .. ");
	strcat($$," : ");
	strcat($$," nint ");
	strcat($$, $5);
	strcat($$," of ");
	strcat($$, $1);
	strcat($$," ; ");
	strcat($$,$7);
}
else{
	strcpy($$,"var ");
	strcat($$,$3);
	strcat($$,$5);
	strcat($$," : ");
	strcat($$ ,$1);
	strcat($$," ; ");
	strcat($$,$7);
}

} | /*epsilon*/ {strcpy($$,"");}
;

L: COMA Q K M L {
	if(strcmp($3,"")==1){
		strcpy($$,",");
		strcat($$,"nombredelID");
		strcat($$,$5);
	}
	else{
		strcpy($$,",");
		strcat($$,"0");
		strcat($$,"..");
		strcat($$,$3);
		strcat($$,$5);
	}
} | /*epsilon*/ {strcpy($$,"");}
;

J: FLOAT {strcpy($$," real ");} | INT {strcpy($$," integer ");} | BOOL {strcpy($$," boolean ");} | CHAR {strcpy($$," char ");}
;

K: ID AL {
strcpy($$,$1);
strcat($$,$2);
}
;

AL: CORCHETEABRE NN CORCHETECIERRA AL {
strcpy($$," [ ");
strcat($$, $2);
strcat($$," ] ");
strcat($$, $4);
} | /*epsilon*/{
strcpy($$,"");
}
;

M: N R {
strcpy($$," := ");
strcat($$,$1);
} | LLAVEABRE DD P LLAVECIERRA {
strcpy($$," := ");
strcat($$," ( ");
strcat($$,$2);
strcat($$,$3);
strcat($$," ) ");
} | /*epsilon*/ {strcpy($$,"");}
;

N: AMPERSAND {} | NINT {
itoa($1,temp,100);
strcpy($$,temp);
;}
;

NN: NINT {
itoa($1,temp,100);
strcopy($$,temp);
} | ID {strcpy($$,$1);}
;

/*Bloque Andro*/

R: K {
	strcpy($$,$1);
} 
| {
	strcpy($$,""); /*epsilon*/
};

P: COMA DD P{
	strcpy($$," , ");
	strcat($$,$2);
	strcat($$,$3);
}
| {
	strcpy($$,""); /*epsilon*/
};

DD: NINT {
	strcpy($$,$1);
};

Q: ASTERISCO{
	strcpy($$," * ");
}
| {
	strcpy($$,""); /*epsilon*/
};

FI: I {
	strcpy($$,$1);
};

I: R S SIG PUNTOYC I {
	strcpy($$,$1);
	strcat($$,$2);
	strcat($$,$3);
	strcat($$," ; ");
	strcat($$,$5);
}
| R S IDX PUNTOYC I {
	strcpy($$,$1);
	strcat($$,$2);
	strcat($$,$3);
	strcat($$," ; ");
	strcat($$,$5);
}
| {
	strcpy($$,"");
};

IDX: STRING {
	strcpy($$,"STRING");

};

S: U SIGNOIGUAL {
	if((strcmp($1,"")==0)){
		strcpy($$,$1);
		strcat($$," := ");
	}
	else {
		strcpy($$,$1);
		strcat($$," = ");
	}
};

U: DIAGONAL {
	strcpy($$," / ");
}
| ASTERISCO {
	strcpy($$," * ");
}
| SIGNOMAS {
	strcpy($$," + ");
}
| SIGNOMENOS {
	strcpy($$," - ");
}
| {
	strcpy($$,""); /*EPSILON*/
};

SIG: T {
	strcpy($$,$1);
};


T: T V W {

	strcpy($$,$1);
	strcat($$,$2);
	strcat($$,$3);
}
| W {
	strcpy($$,$1);
};

W: NN{
	strcpy($$,$1);
}
| PARENTESISABRE T PARENTESISCIERRA {
	strcpy($$," ( ");
	strcat($$,$2);
	strcat($$," ) ");
	
};

V: U {
	strcpy($$,$1);
};

YF: Y {
	strcpy($$,$1);
};

Y: FOR PARENTESISABRE X AD AB AE PUNTOYC AA PARENTESISCIERRA E Y {
	strcpy($$," for ")
	strcat($$,$3);
	strcat($$," to ");
	strcat($$,$6);
	strcat($$," begin ");
	strcat($$,$10);
	strcat($$," end ");
	strcat($$,";");
	strcat($$,$11);

}
| {
	strcpy($$,""); /*EPSIOLOOOOOOON*/
};

X: BB ID M PUNTOYC {
	strcpy($$,$2);
	strcat($$,$3);
};

BB: J {
	strcpy($$,$1);
}
| {
	strcpy($$,"");
};

AB: MENORQUE {
	strcpy($$," < ");
}
| MENORIGUAL {
	strcpy($$," <= ");
}
| MAYORQUE {
	strcpy($$," > ");
}
| MAYORIGUAL {
	strcpy($$," >= ");
}
| ADMIRACIONCIERRA {
	strcpy($$," not ");
}
| DISTINTODE {
	strcpy($$," <> ");
}
| IGUALQUE {
	strcpy($$," = ");
}
| AND {
	strcpy($$," and ");
}
| OR {
	strcpy($$," or ");
};


/*Bloque Vale*/
AA: K INCREMENTO {} | K DECREMENTO {
}
;

Y: WHILE PARENTESISABRE AD AB AE PARENTESISCIERRA E Y {
	strcpy($$,"while");
	strcat($$,$3);
	strcat($$,$4);
	strcat($$,$5);
	strcpy($$,"do");
	strcpy($$,"begin");
	strcat($$,$7);
	strcpy($$,"end");
	strcat($$,";");
	strcat($$,$8);
	printf("%s",$$);
}
;

Y: IF PARENTESISABRE AD AB AE PARENTESISCIERRA E AC Y {
	strcpy($$,"if");
	strcat($$,$3);
	strcat($$,$4);
	strcat($$,$5);
	strcpy($$,"then");
	strcpy($$,"begin");
	strcpy($$,$7);
	strcpy($$,"end");
	strcat($$,$8);
	strcat($$,$9);
	printf("%s",$$);
}

AC: ELSE E {
	strcpy($$,"else");
	strcpy($$,"begin");
	strcat($$,$2);
	strcpy($$,"end");
	strcat($$,";");
	printf("%s",$$);
} | /*EPSILON*/ {
	strcat($$,"");
}
;

AE: AD {
	strcat($$,$1);
}
;

AD: SIG {
	strcat($$,$1);
} | NN {
	strcat($$,$1);
}
;

Y: SWITCH PARENTESISABRE ID PARENTESISCIERRA AF Y {
	strcpy($$,"case");
	strcpy($$,$3);
	strcpy($$,"of");
	strcat($$,$5);
	strcat($$,$6);
	printf("%s",$$);
}
;

AI: CASE NINT DOSPUNTOS GN BREAK PUNTOYC {
	strcpy($$,$2);
	strcat($$,":");
	strcpy($$,"begin");
	strcat($$,$4);
	strcpy($$,"end");
}
;

AH: DEFAULT DOSPUNTOS GN BREAK PUNTOYC {
	strcpy($$,"else");
	strcpy($$,"begin");
	strcat($$,$3);
	strcpy($$,"end");
	strcat($$,";");
} | /*EPSILON*/ { strcat($$,""); }
;

AF: LLAVEABRE AG AH LLAVECIERRA {
	strcat($$,$2);
	strcat($$,$3);
}
;

AG: AI AG {
	strcat($$,$1);
	strcat($$,$2);
} | /*EPSILON*/ { strcat($$,""); }
;

PQ: PRINTF PARENTESISABRE BA CO JJ PARENTESISCIERRA PUNTOYC {
	strcpy($$,"write");
	strcat($$,"(");
	strcat($$,$3);
	strcat($$,$4);
	strcat($$,$5);
	strcat($$,")");
	strcat($$,";");
} | /*EPSILON*/ { strcat($$,""); }
;

JJ: JP NXT {
	strcat($$,$1);
	strcat($$,$2);
} | /*EPSILON*/ { strcat($$,""); }
;

BA: STRING {
	strcpy($$,"STRING");
} | /*EPSILON*/ { strcat($$,""); }
;

CO: COMA { strcat($$,","); } | /*EPSILON*/ { strcat($$,""); }

JP: K { strcat($$,$1); } | SIG { strcat($$,$1); }
;

NXT: COMA JP NXT {
	strcat($$,",");
	strcat($$,$2);
	strcat($$,$3);
} | /*EPSILON*/ { strcat($$,""); }
;

PR: SCANF PARENTESISABRE STRING KR PARENTESISCIERRA PUNTOYC {
	strcpy($$,"read");
	strcat($$,"(");
	strcat($$,$4);
	strcat($$,")");
	strcat($$,";");
} | /* EPSILON */ { strcpy($$,""); }
;

KR: COMA AM ID {
	/*CHECAR*/
	strcpy($$,"id");
}
;

AM: AMPERSAND {} | /* EPSILON */ { strcpy($$,""); };

PL: DO E WHILE PARENTESISABRE AD AB AE PARENTESISCIERRA PUNTOYC {} | { strcpy($$,""); }
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