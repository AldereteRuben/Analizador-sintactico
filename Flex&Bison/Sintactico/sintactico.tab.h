
/* A Bison parser, made by GNU Bison 2.4.1.  */

/* Skeleton interface for Bison's Yacc-like parsers in C
   
      Copyright (C) 1984, 1989, 1990, 2000, 2001, 2002, 2003, 2004, 2005, 2006
   Free Software Foundation, Inc.
   
   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.
   
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.
   
   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.
   
   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */


/* Tokens.  */
#ifndef YYTOKENTYPE
# define YYTOKENTYPE
   /* Put the tokens into the symbol table, so that GDB and other debuggers
      know about them.  */
   enum yytokentype {
     INT = 258,
     MAIN = 259,
     PARENTESISABRE = 260,
     PARENTESISCIERRA = 261,
     LLAVEABRE = 262,
     LLAVECIERRA = 263,
     ID = 264,
     CHAR = 265,
     BOOL = 266,
     FLOAT = 267,
     COMA = 268,
     NINT = 269,
     CORCHETEABRE = 270,
     CORCHETECIERRA = 271,
     AMPERSAND = 272,
     ADMIRACIONCIERRA = 273,
     SIGNOIGUAL = 274,
     PUNTOYC = 275,
     SIGNOMAS = 276,
     SIGNOMENOS = 277,
     DIAGONAL = 278,
     ASTERISCO = 279,
     INCREMENTO = 280,
     DECREMENTO = 281,
     FOR = 282,
     MENORQUE = 283,
     MAYORQUE = 284,
     MENORIGUAL = 285,
     MAYORIGUAL = 286,
     DISTINTODE = 287,
     IGUALQUE = 288,
     ELSE = 289,
     IF = 290,
     AND = 291,
     OR = 292,
     WHILE = 293,
     COMILLA = 294,
     SWITCH = 295,
     CASE = 296,
     DEFAULT = 297,
     BREAK = 298,
     DO = 299,
     STRING = 300,
     DOSPUNTOS = 301,
     PRINTF = 302,
     SCANF = 303,
     RETURN = 304
   };
#endif



#if ! defined YYSTYPE && ! defined YYSTYPE_IS_DECLARED
typedef int YYSTYPE;
# define YYSTYPE_IS_TRIVIAL 1
# define yystype YYSTYPE /* obsolescent; will be withdrawn */
# define YYSTYPE_IS_DECLARED 1
#endif

extern YYSTYPE yylval;


