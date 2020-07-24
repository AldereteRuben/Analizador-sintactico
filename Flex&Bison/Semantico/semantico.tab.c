
/* A Bison parser, made by GNU Bison 2.4.1.  */

/* Skeleton implementation for Bison's Yacc-like parsers in C
   
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

/* C LALR(1) parser skeleton written by Richard Stallman, by
   simplifying the original so-called "semantic" parser.  */

/* All symbols defined below should begin with yy or YY, to avoid
   infringing on user name space.  This should be done even for local
   variables, as they might otherwise be expanded by user macros.
   There are some unavoidable exceptions within include files to
   define necessary library symbols; they are noted "INFRINGES ON
   USER NAME SPACE" below.  */

/* Identify Bison output.  */
#define YYBISON 1

/* Bison version.  */
#define YYBISON_VERSION "2.4.1"

/* Skeleton name.  */
#define YYSKELETON_NAME "yacc.c"

/* Pure parsers.  */
#define YYPURE 0

/* Push parsers.  */
#define YYPUSH 0

/* Pull parsers.  */
#define YYPULL 1

/* Using locations.  */
#define YYLSP_NEEDED 0



/* Copy the first part of user declarations.  */

/* Line 189 of yacc.c  */
#line 1 "semantico.y"

#include<stdio.h>
#include<string.h>
#define YYSTYPE char *

char temp[100];


/* Line 189 of yacc.c  */
#line 82 "semantico.tab.c"

/* Enabling traces.  */
#ifndef YYDEBUG
# define YYDEBUG 0
#endif

/* Enabling verbose error messages.  */
#ifdef YYERROR_VERBOSE
# undef YYERROR_VERBOSE
# define YYERROR_VERBOSE 1
#else
# define YYERROR_VERBOSE 0
#endif

/* Enabling the token table.  */
#ifndef YYTOKEN_TABLE
# define YYTOKEN_TABLE 0
#endif


/* Tokens.  */
#ifndef YYTOKENTYPE
# define YYTOKENTYPE
   /* Put the tokens into the symbol table, so that GDB and other debuggers
      know about them.  */
   enum yytokentype {
     NINT = 258,
     ID = 259,
     INT = 260,
     MAIN = 261,
     PARENTESISABRE = 262,
     PARENTESISCIERRA = 263,
     LLAVEABRE = 264,
     LLAVECIERRA = 265,
     CHAR = 266,
     BOOL = 267,
     FLOAT = 268,
     COMA = 269,
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
typedef union YYSTYPE
{

/* Line 214 of yacc.c  */
#line 9 "semantico.y"

	int val;
	char trad[100];
	char trad2[100];
	


/* Line 214 of yacc.c  */
#line 175 "semantico.tab.c"
} YYSTYPE;
# define YYSTYPE_IS_TRIVIAL 1
# define yystype YYSTYPE /* obsolescent; will be withdrawn */
# define YYSTYPE_IS_DECLARED 1
#endif


/* Copy the second part of user declarations.  */


/* Line 264 of yacc.c  */
#line 187 "semantico.tab.c"

#ifdef short
# undef short
#endif

#ifdef YYTYPE_UINT8
typedef YYTYPE_UINT8 yytype_uint8;
#else
typedef unsigned char yytype_uint8;
#endif

#ifdef YYTYPE_INT8
typedef YYTYPE_INT8 yytype_int8;
#elif (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
typedef signed char yytype_int8;
#else
typedef short int yytype_int8;
#endif

#ifdef YYTYPE_UINT16
typedef YYTYPE_UINT16 yytype_uint16;
#else
typedef unsigned short int yytype_uint16;
#endif

#ifdef YYTYPE_INT16
typedef YYTYPE_INT16 yytype_int16;
#else
typedef short int yytype_int16;
#endif

#ifndef YYSIZE_T
# ifdef __SIZE_TYPE__
#  define YYSIZE_T __SIZE_TYPE__
# elif defined size_t
#  define YYSIZE_T size_t
# elif ! defined YYSIZE_T && (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
#  include <stddef.h> /* INFRINGES ON USER NAME SPACE */
#  define YYSIZE_T size_t
# else
#  define YYSIZE_T unsigned int
# endif
#endif

#define YYSIZE_MAXIMUM ((YYSIZE_T) -1)

#ifndef YY_
# if YYENABLE_NLS
#  if ENABLE_NLS
#   include <libintl.h> /* INFRINGES ON USER NAME SPACE */
#   define YY_(msgid) dgettext ("bison-runtime", msgid)
#  endif
# endif
# ifndef YY_
#  define YY_(msgid) msgid
# endif
#endif

/* Suppress unused-variable warnings by "using" E.  */
#if ! defined lint || defined __GNUC__
# define YYUSE(e) ((void) (e))
#else
# define YYUSE(e) /* empty */
#endif

/* Identity function, used to suppress warnings about constant conditions.  */
#ifndef lint
# define YYID(n) (n)
#else
#if (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
static int
YYID (int yyi)
#else
static int
YYID (yyi)
    int yyi;
#endif
{
  return yyi;
}
#endif

#if ! defined yyoverflow || YYERROR_VERBOSE

/* The parser invokes alloca or malloc; define the necessary symbols.  */

# ifdef YYSTACK_USE_ALLOCA
#  if YYSTACK_USE_ALLOCA
#   ifdef __GNUC__
#    define YYSTACK_ALLOC __builtin_alloca
#   elif defined __BUILTIN_VA_ARG_INCR
#    include <alloca.h> /* INFRINGES ON USER NAME SPACE */
#   elif defined _AIX
#    define YYSTACK_ALLOC __alloca
#   elif defined _MSC_VER
#    include <malloc.h> /* INFRINGES ON USER NAME SPACE */
#    define alloca _alloca
#   else
#    define YYSTACK_ALLOC alloca
#    if ! defined _ALLOCA_H && ! defined _STDLIB_H && (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
#     include <stdlib.h> /* INFRINGES ON USER NAME SPACE */
#     ifndef _STDLIB_H
#      define _STDLIB_H 1
#     endif
#    endif
#   endif
#  endif
# endif

# ifdef YYSTACK_ALLOC
   /* Pacify GCC's `empty if-body' warning.  */
#  define YYSTACK_FREE(Ptr) do { /* empty */; } while (YYID (0))
#  ifndef YYSTACK_ALLOC_MAXIMUM
    /* The OS might guarantee only one guard page at the bottom of the stack,
       and a page size can be as small as 4096 bytes.  So we cannot safely
       invoke alloca (N) if N exceeds 4096.  Use a slightly smaller number
       to allow for a few compiler-allocated temporary stack slots.  */
#   define YYSTACK_ALLOC_MAXIMUM 4032 /* reasonable circa 2006 */
#  endif
# else
#  define YYSTACK_ALLOC YYMALLOC
#  define YYSTACK_FREE YYFREE
#  ifndef YYSTACK_ALLOC_MAXIMUM
#   define YYSTACK_ALLOC_MAXIMUM YYSIZE_MAXIMUM
#  endif
#  if (defined __cplusplus && ! defined _STDLIB_H \
       && ! ((defined YYMALLOC || defined malloc) \
	     && (defined YYFREE || defined free)))
#   include <stdlib.h> /* INFRINGES ON USER NAME SPACE */
#   ifndef _STDLIB_H
#    define _STDLIB_H 1
#   endif
#  endif
#  ifndef YYMALLOC
#   define YYMALLOC malloc
#   if ! defined malloc && ! defined _STDLIB_H && (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
void *malloc (YYSIZE_T); /* INFRINGES ON USER NAME SPACE */
#   endif
#  endif
#  ifndef YYFREE
#   define YYFREE free
#   if ! defined free && ! defined _STDLIB_H && (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
void free (void *); /* INFRINGES ON USER NAME SPACE */
#   endif
#  endif
# endif
#endif /* ! defined yyoverflow || YYERROR_VERBOSE */


#if (! defined yyoverflow \
     && (! defined __cplusplus \
	 || (defined YYSTYPE_IS_TRIVIAL && YYSTYPE_IS_TRIVIAL)))

/* A type that is properly aligned for any stack member.  */
union yyalloc
{
  yytype_int16 yyss_alloc;
  YYSTYPE yyvs_alloc;
};

/* The size of the maximum gap between one aligned stack and the next.  */
# define YYSTACK_GAP_MAXIMUM (sizeof (union yyalloc) - 1)

/* The size of an array large to enough to hold all stacks, each with
   N elements.  */
# define YYSTACK_BYTES(N) \
     ((N) * (sizeof (yytype_int16) + sizeof (YYSTYPE)) \
      + YYSTACK_GAP_MAXIMUM)

/* Copy COUNT objects from FROM to TO.  The source and destination do
   not overlap.  */
# ifndef YYCOPY
#  if defined __GNUC__ && 1 < __GNUC__
#   define YYCOPY(To, From, Count) \
      __builtin_memcpy (To, From, (Count) * sizeof (*(From)))
#  else
#   define YYCOPY(To, From, Count)		\
      do					\
	{					\
	  YYSIZE_T yyi;				\
	  for (yyi = 0; yyi < (Count); yyi++)	\
	    (To)[yyi] = (From)[yyi];		\
	}					\
      while (YYID (0))
#  endif
# endif

/* Relocate STACK from its old location to the new one.  The
   local variables YYSIZE and YYSTACKSIZE give the old and new number of
   elements in the stack, and YYPTR gives the new location of the
   stack.  Advance YYPTR to a properly aligned location for the next
   stack.  */
# define YYSTACK_RELOCATE(Stack_alloc, Stack)				\
    do									\
      {									\
	YYSIZE_T yynewbytes;						\
	YYCOPY (&yyptr->Stack_alloc, Stack, yysize);			\
	Stack = &yyptr->Stack_alloc;					\
	yynewbytes = yystacksize * sizeof (*Stack) + YYSTACK_GAP_MAXIMUM; \
	yyptr += yynewbytes / sizeof (*yyptr);				\
      }									\
    while (YYID (0))

#endif

/* YYFINAL -- State number of the termination state.  */
#define YYFINAL  2
/* YYLAST -- Last index in YYTABLE.  */
#define YYLAST   223

/* YYNTOKENS -- Number of terminals.  */
#define YYNTOKENS  50
/* YYNNTS -- Number of nonterminals.  */
#define YYNNTS  55
/* YYNRULES -- Number of rules.  */
#define YYNRULES  113
/* YYNRULES -- Number of states.  */
#define YYNSTATES  206

/* YYTRANSLATE(YYLEX) -- Bison symbol number corresponding to YYLEX.  */
#define YYUNDEFTOK  2
#define YYMAXUTOK   304

#define YYTRANSLATE(YYX)						\
  ((unsigned int) (YYX) <= YYMAXUTOK ? yytranslate[YYX] : YYUNDEFTOK)

/* YYTRANSLATE[YYLEX] -- Bison symbol number corresponding to YYLEX.  */
static const yytype_uint8 yytranslate[] =
{
       0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     1,     2,     3,     4,
       5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,    23,    24,
      25,    26,    27,    28,    29,    30,    31,    32,    33,    34,
      35,    36,    37,    38,    39,    40,    41,    42,    43,    44,
      45,    46,    47,    48,    49
};

#if YYDEBUG
/* YYPRHS[YYN] -- Index of the first RHS symbol of rule number YYN in
   YYRHS.  */
static const yytype_uint16 yyprhs[] =
{
       0,     0,     3,     9,    10,    12,    13,    15,    19,    20,
      25,    27,    31,    32,    35,    38,    41,    44,    47,    50,
      51,    53,    54,    62,    63,    69,    70,    72,    74,    76,
      78,    81,    86,    87,    90,    95,    96,    98,   100,   102,
     104,   106,   107,   111,   112,   114,   116,   117,   119,   125,
     131,   132,   134,   137,   139,   141,   143,   145,   146,   148,
     152,   154,   156,   160,   162,   164,   176,   177,   182,   184,
     185,   187,   189,   191,   193,   195,   197,   199,   201,   203,
     206,   209,   218,   228,   231,   232,   234,   236,   238,   245,
     252,   258,   259,   264,   267,   268,   276,   277,   280,   281,
     283,   284,   286,   287,   289,   291,   295,   296,   303,   304,
     308,   310,   311,   321
};

/* YYRHS -- A `-1'-separated list of the rules' RHS.  */
static const yytype_int8 yyrhs[] =
{
      51,     0,    -1,    51,    52,    53,    54,    56,    -1,    -1,
       5,    -1,    -1,     6,    -1,     7,    55,     8,    -1,    -1,
       9,    57,    58,    10,    -1,    59,    -1,    49,     3,    20,
      -1,    -1,    60,    59,    -1,    82,    59,    -1,    73,    59,
      -1,   101,    59,    -1,   104,    59,    -1,    95,    59,    -1,
      -1,    61,    -1,    -1,    63,    72,    64,    66,    62,    20,
      61,    -1,    -1,    14,    72,    64,    66,    62,    -1,    -1,
      13,    -1,     5,    -1,    12,    -1,    11,    -1,     4,    65,
      -1,    15,    68,    16,    65,    -1,    -1,    67,    69,    -1,
       9,    71,    70,    10,    -1,    -1,    17,    -1,     3,    -1,
       3,    -1,     4,    -1,    64,    -1,    -1,    14,    71,    70,
      -1,    -1,     3,    -1,    24,    -1,    -1,    74,    -1,    69,
      76,    78,    20,    74,    -1,    69,    76,    75,    20,    74,
      -1,    -1,    45,    -1,    77,    19,    -1,    23,    -1,    24,
      -1,    21,    -1,    22,    -1,    -1,    79,    -1,    79,    81,
      80,    -1,    80,    -1,    68,    -1,     7,    79,     8,    -1,
      77,    -1,    83,    -1,    27,     7,    84,    90,    86,    89,
      20,    87,     8,    56,    83,    -1,    -1,    85,     4,    66,
      20,    -1,    63,    -1,    -1,    28,    -1,    30,    -1,    29,
      -1,    31,    -1,    18,    -1,    32,    -1,    33,    -1,    36,
      -1,    37,    -1,    64,    25,    -1,    64,    26,    -1,    38,
       7,    90,    86,    89,     8,    56,    83,    -1,    35,     7,
      90,    86,    89,     8,    56,    88,    83,    -1,    34,    56,
      -1,    -1,    90,    -1,    78,    -1,    68,    -1,    40,     7,
       4,     8,    93,    83,    -1,    41,     3,    46,    57,    43,
      20,    -1,    42,    46,    57,    43,    20,    -1,    -1,     9,
      94,    92,    10,    -1,    91,    94,    -1,    -1,    47,     7,
      97,    98,    96,     8,    20,    -1,    -1,    99,   100,    -1,
      -1,    45,    -1,    -1,    14,    -1,    -1,    64,    -1,    78,
      -1,    14,    99,   100,    -1,    -1,    48,     7,    45,   102,
       8,    20,    -1,    -1,    14,   103,     4,    -1,    17,    -1,
      -1,    44,    56,    38,     7,    90,    86,    89,     8,    20,
      -1,    -1
};

/* YYRLINE[YYN] -- source line where rule number YYN was defined.  */
static const yytype_uint16 yyrline[] =
{
       0,    26,    26,    32,    35,    35,    38,    41,    44,    47,
      53,    59,    59,    62,    62,    62,    62,    62,    62,    62,
      65,    65,    69,   103,   106,   119,   122,   122,   122,   122,
     125,   131,   136,   141,   144,   150,   153,   153,   159,   162,
     167,   170,   174,   179,   183,   187,   190,   194,   198,   205,
     212,   216,   221,   232,   235,   238,   241,   244,   248,   253,
     259,   263,   266,   273,   277,   281,   293,   297,   302,   305,
     309,   312,   315,   318,   321,   324,   327,   330,   333,   339,
     339,   343,   358,   372,   379,   384,   389,   391,   396,   406,
     415,   421,   424,   430,   433,   436,   444,   447,   450,   453,
     455,   458,   458,   460,   460,   463,   467,   470,   476,   479,
     485,   485,   487,   487
};
#endif

#if YYDEBUG || YYERROR_VERBOSE || YYTOKEN_TABLE
/* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
   First, the terminals, then, starting at YYNTOKENS, nonterminals.  */
static const char *const yytname[] =
{
  "$end", "error", "$undefined", "NINT", "ID", "INT", "MAIN",
  "PARENTESISABRE", "PARENTESISCIERRA", "LLAVEABRE", "LLAVECIERRA", "CHAR",
  "BOOL", "FLOAT", "COMA", "CORCHETEABRE", "CORCHETECIERRA", "AMPERSAND",
  "ADMIRACIONCIERRA", "SIGNOIGUAL", "PUNTOYC", "SIGNOMAS", "SIGNOMENOS",
  "DIAGONAL", "ASTERISCO", "INCREMENTO", "DECREMENTO", "FOR", "MENORQUE",
  "MAYORQUE", "MENORIGUAL", "MAYORIGUAL", "DISTINTODE", "IGUALQUE", "ELSE",
  "IF", "AND", "OR", "WHILE", "COMILLA", "SWITCH", "CASE", "DEFAULT",
  "BREAK", "DO", "STRING", "DOSPUNTOS", "PRINTF", "SCANF", "RETURN",
  "$accept", "A", "B", "C", "D", "F", "E", "GN", "AJ", "G", "AZ", "H", "L",
  "J", "K", "AL", "M", "N", "NN", "R", "P", "DD", "Q", "FI", "I", "IDX",
  "S", "U", "SIG", "T", "W", "V", "YF", "Y", "X", "BB", "AB", "AA", "AC",
  "AE", "AD", "AI", "AH", "AF", "AG", "PQ", "JJ", "BA", "CO", "JP", "NXT",
  "PR", "KR", "AM", "PL", 0
};
#endif

# ifdef YYPRINT
/* YYTOKNUM[YYLEX-NUM] -- Internal token number corresponding to
   token YYLEX-NUM.  */
static const yytype_uint16 yytoknum[] =
{
       0,   256,   257,   258,   259,   260,   261,   262,   263,   264,
     265,   266,   267,   268,   269,   270,   271,   272,   273,   274,
     275,   276,   277,   278,   279,   280,   281,   282,   283,   284,
     285,   286,   287,   288,   289,   290,   291,   292,   293,   294,
     295,   296,   297,   298,   299,   300,   301,   302,   303,   304
};
# endif

/* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
static const yytype_uint8 yyr1[] =
{
       0,    50,    51,    51,    52,    52,    53,    54,    55,    56,
      57,    58,    58,    59,    59,    59,    59,    59,    59,    59,
      60,    60,    61,    61,    62,    62,    63,    63,    63,    63,
      64,    65,    65,    66,    66,    66,    67,    67,    68,    68,
      69,    69,    70,    70,    71,    72,    72,    73,    74,    74,
      74,    75,    76,    77,    77,    77,    77,    77,    78,    79,
      79,    80,    80,    81,    82,    83,    83,    84,    85,    85,
      86,    86,    86,    86,    86,    86,    86,    86,    86,    87,
      87,    83,    83,    88,    88,    89,    90,    90,    83,    91,
      92,    92,    93,    94,    94,    95,    95,    96,    96,    97,
      97,    98,    98,    99,    99,   100,   100,   101,   101,   102,
     103,   103,   104,   104
};

/* YYR2[YYN] -- Number of symbols composing right hand side of rule YYN.  */
static const yytype_uint8 yyr2[] =
{
       0,     2,     5,     0,     1,     0,     1,     3,     0,     4,
       1,     3,     0,     2,     2,     2,     2,     2,     2,     0,
       1,     0,     7,     0,     5,     0,     1,     1,     1,     1,
       2,     4,     0,     2,     4,     0,     1,     1,     1,     1,
       1,     0,     3,     0,     1,     1,     0,     1,     5,     5,
       0,     1,     2,     1,     1,     1,     1,     0,     1,     3,
       1,     1,     3,     1,     1,    11,     0,     4,     1,     0,
       1,     1,     1,     1,     1,     1,     1,     1,     1,     2,
       2,     8,     9,     2,     0,     1,     1,     1,     6,     6,
       5,     0,     4,     2,     0,     7,     0,     2,     0,     1,
       0,     1,     0,     1,     1,     3,     0,     6,     0,     3,
       1,     0,     9,     0
};

/* YYDEFACT[STATE-NAME] -- Default rule to reduce with in state
   STATE-NUM when YYTABLE doesn't specify something else to do.  Zero
   means the default is an error.  */
static const yytype_uint8 yydefact[] =
{
       3,     5,     1,     4,     0,     6,     0,     8,     0,     0,
      21,     2,     7,    32,    27,    29,    28,    26,     0,     0,
       0,     0,     0,     0,     0,    12,    10,    21,    20,    46,
      40,    57,    21,    47,    21,    64,    21,    21,    21,     0,
      30,    69,     0,     0,     0,     0,   100,     0,     0,     0,
      13,    45,     0,    55,    56,    53,    54,     0,     0,    15,
      14,    18,    16,    17,    38,    39,     0,    68,     0,     0,
       0,    61,    86,    58,    60,     0,     0,     0,     0,    99,
     102,     0,     0,     9,    35,    51,    61,     0,     0,    52,
      32,     0,    35,    57,    63,     0,    74,    70,    72,    71,
      73,    75,    76,    77,    78,     0,     0,     0,     0,   101,
      98,   111,     0,    11,    37,     0,    36,    25,    41,    50,
      50,    31,     0,     0,    62,    59,     0,    85,     0,    94,
      66,     0,    39,   103,   104,     0,   106,   110,     0,     0,
      44,    43,    46,     0,    33,    49,    48,     0,    67,     0,
       0,     0,    94,    91,    88,     0,     0,     0,    97,   109,
     107,     0,     0,     0,    23,     0,    84,    66,     0,    93,
       0,     0,     0,    95,   106,    43,    34,    35,    22,     0,
       0,     0,    66,    81,    21,    21,    92,     0,   105,    42,
      25,    79,    80,     0,    83,    82,     0,     0,   112,    24,
      66,     0,     0,    65,    89,    90
};

/* YYDEFGOTO[NTERM-NUM].  */
static const yytype_int16 yydefgoto[] =
{
      -1,     1,     4,     6,     8,     9,    11,    25,    49,    26,
      27,    28,   143,    29,    30,    40,   117,   118,    71,    31,
     162,   141,    52,    32,    33,    87,    57,    94,    72,    73,
      74,    95,    34,    35,    68,    69,   105,   180,   182,   126,
     127,   152,   171,   130,   153,    36,   135,    80,   110,   136,
     158,    37,   112,   138,    38
};

/* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
   STATE-NUM.  */
#define YYPACT_NINF -125
static const yytype_int16 yypact[] =
{
    -125,    48,  -125,  -125,    16,  -125,     6,  -125,    19,    43,
     113,  -125,  -125,     0,  -125,  -125,  -125,  -125,    52,    56,
      58,    64,    19,    71,    73,    34,  -125,    57,  -125,    31,
    -125,    87,    57,  -125,    57,  -125,    57,    57,    57,    46,
    -125,    18,    83,    83,    81,    50,    51,    69,    88,   106,
    -125,  -125,   108,  -125,  -125,  -125,  -125,     7,   110,  -125,
    -125,  -125,  -125,  -125,  -125,  -125,   121,  -125,    83,   138,
      83,  -125,  -125,    13,  -125,   102,   102,   136,   145,  -125,
     140,   141,   143,  -125,     9,  -125,  -125,   144,   147,  -125,
       0,   102,     9,    17,  -125,    83,  -125,  -125,  -125,  -125,
    -125,  -125,  -125,  -125,  -125,    83,    83,   149,    83,  -125,
      95,   139,   160,  -125,  -125,   166,  -125,   156,   108,    23,
      23,  -125,    83,   155,  -125,  -125,   168,  -125,   169,   137,
      39,   102,    67,  -125,  -125,   171,   167,  -125,   176,   162,
    -125,   170,    31,   163,  -125,  -125,  -125,   165,  -125,    19,
      19,   183,   137,   148,  -125,    83,   172,    95,  -125,  -125,
    -125,   166,   177,   108,    18,   108,   157,    39,   151,  -125,
     152,   179,   185,  -125,   167,   170,  -125,     9,  -125,    68,
     186,    19,    39,  -125,   161,   161,  -125,   175,  -125,  -125,
     156,  -125,  -125,    19,  -125,  -125,   159,   164,  -125,  -125,
      39,   180,   190,  -125,  -125,  -125
};

/* YYPGOTO[NTERM-NUM].  */
static const yytype_int16 yypgoto[] =
{
    -125,  -125,  -125,  -125,  -125,  -125,   -22,   -63,  -125,   109,
    -125,    42,    21,   173,   -50,   122,   -88,  -125,   -38,    85,
      38,    54,    74,  -125,    30,  -125,  -125,   187,   -54,   150,
     124,  -125,  -125,  -124,  -125,  -125,   -67,  -125,  -125,  -101,
     -35,  -125,  -125,  -125,    65,  -125,  -125,  -125,  -125,    66,
      47,  -125,  -125,  -125,  -125
};

/* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
   positive, shift that token.  If negative, reduce the rule which
   number is the opposite.  If zero, do what YYDEFACT says.
   If YYTABLE_NINF, syntax error.  */
#define YYTABLE_NINF -58
static const yytype_int16 yytable[] =
{
      45,    66,    84,    88,   123,   128,   154,    75,    76,   106,
      64,    65,   114,     7,    70,    39,   -57,   -57,   115,    86,
     -57,   147,     5,    14,   122,   124,   116,    13,    10,    15,
      16,    17,    86,    91,    53,    54,    55,    56,    53,    54,
      55,    56,   -41,   183,   -41,   -41,   -41,   -41,     2,    64,
      65,    12,    85,     3,   172,    51,   134,    86,   195,    41,
     133,    13,    14,    42,   155,    43,    18,   -19,    15,    16,
      17,    44,    86,   131,    19,   -32,   203,    20,    46,    21,
      47,   -32,    39,    48,    18,    77,    64,    65,    78,   190,
      70,    82,    19,   191,   192,    20,    79,    21,    64,   132,
     -19,    22,    70,   134,    23,    24,   -19,   133,    53,    54,
      55,    56,    13,   177,    81,   179,    83,    13,    14,    86,
      96,   196,   197,   -19,    15,    16,    17,   166,   167,    89,
      97,    98,    99,   100,   101,   102,    50,    90,   103,   104,
      18,    59,    92,    60,   107,    61,    62,    63,    19,   145,
     146,    20,   108,    21,   109,   111,   137,    22,   129,   194,
      23,    24,   -19,   113,   119,    13,    14,   120,   139,   140,
     142,   200,    15,    16,    17,   148,   149,   150,   151,   156,
     159,   157,   160,   164,   161,   165,   168,   176,    18,   186,
     170,   181,   173,   187,   193,   198,    19,   184,   185,    20,
     204,    21,   201,   144,   -19,    22,   178,   202,    23,    24,
     205,   199,   121,   189,    67,   175,   163,   169,    58,   125,
      93,   188,     0,   174
};

static const yytype_int16 yycheck[] =
{
      22,    39,    52,    57,    92,   106,   130,    42,    43,    76,
       3,     4,     3,     7,     7,    15,     3,     4,     9,    57,
       7,   122,     6,     5,    91,     8,    17,     4,     9,    11,
      12,    13,    70,    68,    21,    22,    23,    24,    21,    22,
      23,    24,    19,   167,    21,    22,    23,    24,     0,     3,
       4,     8,    45,     5,   155,    24,   110,    95,   182,     7,
     110,     4,     5,     7,   131,     7,    27,    10,    11,    12,
      13,     7,   110,   108,    35,     8,   200,    38,     7,    40,
       7,    14,    15,    49,    27,     4,     3,     4,    38,   177,
       7,     3,    35,    25,    26,    38,    45,    40,     3,     4,
      43,    44,     7,   157,    47,    48,    49,   157,    21,    22,
      23,    24,     4,   163,    45,   165,    10,     4,     5,   157,
      18,   184,   185,    10,    11,    12,    13,   149,   150,    19,
      28,    29,    30,    31,    32,    33,    27,    16,    36,    37,
      27,    32,     4,    34,     8,    36,    37,    38,    35,   119,
     120,    38,     7,    40,    14,    14,    17,    44,     9,   181,
      47,    48,    49,    20,    20,     4,     5,    20,     8,     3,
      14,   193,    11,    12,    13,    20,     8,     8,    41,     8,
       4,    14,    20,    20,    14,    20,     3,    10,    27,    10,
      42,    34,    20,     8,     8,    20,    35,    46,    46,    38,
      20,    40,    43,   118,    43,    44,   164,    43,    47,    48,
      20,   190,    90,   175,    41,   161,   142,   152,    31,    95,
      70,   174,    -1,   157
};

/* YYSTOS[STATE-NUM] -- The (internal number of the) accessing
   symbol of state STATE-NUM.  */
static const yytype_uint8 yystos[] =
{
       0,    51,     0,     5,    52,     6,    53,     7,    54,    55,
       9,    56,     8,     4,     5,    11,    12,    13,    27,    35,
      38,    40,    44,    47,    48,    57,    59,    60,    61,    63,
      64,    69,    73,    74,    82,    83,    95,   101,   104,    15,
      65,     7,     7,     7,     7,    56,     7,     7,    49,    58,
      59,    24,    72,    21,    22,    23,    24,    76,    77,    59,
      59,    59,    59,    59,     3,     4,    68,    63,    84,    85,
       7,    68,    78,    79,    80,    90,    90,     4,    38,    45,
      97,    45,     3,    10,    64,    45,    68,    75,    78,    19,
      16,    90,     4,    79,    77,    81,    18,    28,    29,    30,
      31,    32,    33,    36,    37,    86,    86,     8,     7,    14,
      98,    14,   102,    20,     3,     9,    17,    66,    67,    20,
      20,    65,    86,    66,     8,    80,    89,    90,    89,     9,
      93,    90,     4,    64,    78,    96,    99,    17,   103,     8,
       3,    71,    14,    62,    69,    74,    74,    89,    20,     8,
       8,    41,    91,    94,    83,    86,     8,    14,   100,     4,
      20,    14,    70,    72,    20,    20,    56,    56,     3,    94,
      42,    92,    89,    20,    99,    71,    10,    64,    61,    64,
      87,    34,    88,    83,    46,    46,    10,     8,   100,    70,
      66,    25,    26,     8,    56,    83,    57,    57,    20,    62,
      56,    43,    43,    83,    20,    20
};

#define yyerrok		(yyerrstatus = 0)
#define yyclearin	(yychar = YYEMPTY)
#define YYEMPTY		(-2)
#define YYEOF		0

#define YYACCEPT	goto yyacceptlab
#define YYABORT		goto yyabortlab
#define YYERROR		goto yyerrorlab


/* Like YYERROR except do call yyerror.  This remains here temporarily
   to ease the transition to the new meaning of YYERROR, for GCC.
   Once GCC version 2 has supplanted version 1, this can go.  */

#define YYFAIL		goto yyerrlab

#define YYRECOVERING()  (!!yyerrstatus)

#define YYBACKUP(Token, Value)					\
do								\
  if (yychar == YYEMPTY && yylen == 1)				\
    {								\
      yychar = (Token);						\
      yylval = (Value);						\
      yytoken = YYTRANSLATE (yychar);				\
      YYPOPSTACK (1);						\
      goto yybackup;						\
    }								\
  else								\
    {								\
      yyerror (YY_("syntax error: cannot back up")); \
      YYERROR;							\
    }								\
while (YYID (0))


#define YYTERROR	1
#define YYERRCODE	256


/* YYLLOC_DEFAULT -- Set CURRENT to span from RHS[1] to RHS[N].
   If N is 0, then set CURRENT to the empty location which ends
   the previous symbol: RHS[0] (always defined).  */

#define YYRHSLOC(Rhs, K) ((Rhs)[K])
#ifndef YYLLOC_DEFAULT
# define YYLLOC_DEFAULT(Current, Rhs, N)				\
    do									\
      if (YYID (N))                                                    \
	{								\
	  (Current).first_line   = YYRHSLOC (Rhs, 1).first_line;	\
	  (Current).first_column = YYRHSLOC (Rhs, 1).first_column;	\
	  (Current).last_line    = YYRHSLOC (Rhs, N).last_line;		\
	  (Current).last_column  = YYRHSLOC (Rhs, N).last_column;	\
	}								\
      else								\
	{								\
	  (Current).first_line   = (Current).last_line   =		\
	    YYRHSLOC (Rhs, 0).last_line;				\
	  (Current).first_column = (Current).last_column =		\
	    YYRHSLOC (Rhs, 0).last_column;				\
	}								\
    while (YYID (0))
#endif


/* YY_LOCATION_PRINT -- Print the location on the stream.
   This macro was not mandated originally: define only if we know
   we won't break user code: when these are the locations we know.  */

#ifndef YY_LOCATION_PRINT
# if YYLTYPE_IS_TRIVIAL
#  define YY_LOCATION_PRINT(File, Loc)			\
     fprintf (File, "%d.%d-%d.%d",			\
	      (Loc).first_line, (Loc).first_column,	\
	      (Loc).last_line,  (Loc).last_column)
# else
#  define YY_LOCATION_PRINT(File, Loc) ((void) 0)
# endif
#endif


/* YYLEX -- calling `yylex' with the right arguments.  */

#ifdef YYLEX_PARAM
# define YYLEX yylex (YYLEX_PARAM)
#else
# define YYLEX yylex ()
#endif

/* Enable debugging if requested.  */
#if YYDEBUG

# ifndef YYFPRINTF
#  include <stdio.h> /* INFRINGES ON USER NAME SPACE */
#  define YYFPRINTF fprintf
# endif

# define YYDPRINTF(Args)			\
do {						\
  if (yydebug)					\
    YYFPRINTF Args;				\
} while (YYID (0))

# define YY_SYMBOL_PRINT(Title, Type, Value, Location)			  \
do {									  \
  if (yydebug)								  \
    {									  \
      YYFPRINTF (stderr, "%s ", Title);					  \
      yy_symbol_print (stderr,						  \
		  Type, Value); \
      YYFPRINTF (stderr, "\n");						  \
    }									  \
} while (YYID (0))


/*--------------------------------.
| Print this symbol on YYOUTPUT.  |
`--------------------------------*/

/*ARGSUSED*/
#if (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
static void
yy_symbol_value_print (FILE *yyoutput, int yytype, YYSTYPE const * const yyvaluep)
#else
static void
yy_symbol_value_print (yyoutput, yytype, yyvaluep)
    FILE *yyoutput;
    int yytype;
    YYSTYPE const * const yyvaluep;
#endif
{
  if (!yyvaluep)
    return;
# ifdef YYPRINT
  if (yytype < YYNTOKENS)
    YYPRINT (yyoutput, yytoknum[yytype], *yyvaluep);
# else
  YYUSE (yyoutput);
# endif
  switch (yytype)
    {
      default:
	break;
    }
}


/*--------------------------------.
| Print this symbol on YYOUTPUT.  |
`--------------------------------*/

#if (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
static void
yy_symbol_print (FILE *yyoutput, int yytype, YYSTYPE const * const yyvaluep)
#else
static void
yy_symbol_print (yyoutput, yytype, yyvaluep)
    FILE *yyoutput;
    int yytype;
    YYSTYPE const * const yyvaluep;
#endif
{
  if (yytype < YYNTOKENS)
    YYFPRINTF (yyoutput, "token %s (", yytname[yytype]);
  else
    YYFPRINTF (yyoutput, "nterm %s (", yytname[yytype]);

  yy_symbol_value_print (yyoutput, yytype, yyvaluep);
  YYFPRINTF (yyoutput, ")");
}

/*------------------------------------------------------------------.
| yy_stack_print -- Print the state stack from its BOTTOM up to its |
| TOP (included).                                                   |
`------------------------------------------------------------------*/

#if (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
static void
yy_stack_print (yytype_int16 *yybottom, yytype_int16 *yytop)
#else
static void
yy_stack_print (yybottom, yytop)
    yytype_int16 *yybottom;
    yytype_int16 *yytop;
#endif
{
  YYFPRINTF (stderr, "Stack now");
  for (; yybottom <= yytop; yybottom++)
    {
      int yybot = *yybottom;
      YYFPRINTF (stderr, " %d", yybot);
    }
  YYFPRINTF (stderr, "\n");
}

# define YY_STACK_PRINT(Bottom, Top)				\
do {								\
  if (yydebug)							\
    yy_stack_print ((Bottom), (Top));				\
} while (YYID (0))


/*------------------------------------------------.
| Report that the YYRULE is going to be reduced.  |
`------------------------------------------------*/

#if (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
static void
yy_reduce_print (YYSTYPE *yyvsp, int yyrule)
#else
static void
yy_reduce_print (yyvsp, yyrule)
    YYSTYPE *yyvsp;
    int yyrule;
#endif
{
  int yynrhs = yyr2[yyrule];
  int yyi;
  unsigned long int yylno = yyrline[yyrule];
  YYFPRINTF (stderr, "Reducing stack by rule %d (line %lu):\n",
	     yyrule - 1, yylno);
  /* The symbols being reduced.  */
  for (yyi = 0; yyi < yynrhs; yyi++)
    {
      YYFPRINTF (stderr, "   $%d = ", yyi + 1);
      yy_symbol_print (stderr, yyrhs[yyprhs[yyrule] + yyi],
		       &(yyvsp[(yyi + 1) - (yynrhs)])
		       		       );
      YYFPRINTF (stderr, "\n");
    }
}

# define YY_REDUCE_PRINT(Rule)		\
do {					\
  if (yydebug)				\
    yy_reduce_print (yyvsp, Rule); \
} while (YYID (0))

/* Nonzero means print parse trace.  It is left uninitialized so that
   multiple parsers can coexist.  */
int yydebug;
#else /* !YYDEBUG */
# define YYDPRINTF(Args)
# define YY_SYMBOL_PRINT(Title, Type, Value, Location)
# define YY_STACK_PRINT(Bottom, Top)
# define YY_REDUCE_PRINT(Rule)
#endif /* !YYDEBUG */


/* YYINITDEPTH -- initial size of the parser's stacks.  */
#ifndef	YYINITDEPTH
# define YYINITDEPTH 200
#endif

/* YYMAXDEPTH -- maximum size the stacks can grow to (effective only
   if the built-in stack extension method is used).

   Do not make this value too large; the results are undefined if
   YYSTACK_ALLOC_MAXIMUM < YYSTACK_BYTES (YYMAXDEPTH)
   evaluated with infinite-precision integer arithmetic.  */

#ifndef YYMAXDEPTH
# define YYMAXDEPTH 10000
#endif



#if YYERROR_VERBOSE

# ifndef yystrlen
#  if defined __GLIBC__ && defined _STRING_H
#   define yystrlen strlen
#  else
/* Return the length of YYSTR.  */
#if (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
static YYSIZE_T
yystrlen (const char *yystr)
#else
static YYSIZE_T
yystrlen (yystr)
    const char *yystr;
#endif
{
  YYSIZE_T yylen;
  for (yylen = 0; yystr[yylen]; yylen++)
    continue;
  return yylen;
}
#  endif
# endif

# ifndef yystpcpy
#  if defined __GLIBC__ && defined _STRING_H && defined _GNU_SOURCE
#   define yystpcpy stpcpy
#  else
/* Copy YYSRC to YYDEST, returning the address of the terminating '\0' in
   YYDEST.  */
#if (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
static char *
yystpcpy (char *yydest, const char *yysrc)
#else
static char *
yystpcpy (yydest, yysrc)
    char *yydest;
    const char *yysrc;
#endif
{
  char *yyd = yydest;
  const char *yys = yysrc;

  while ((*yyd++ = *yys++) != '\0')
    continue;

  return yyd - 1;
}
#  endif
# endif

# ifndef yytnamerr
/* Copy to YYRES the contents of YYSTR after stripping away unnecessary
   quotes and backslashes, so that it's suitable for yyerror.  The
   heuristic is that double-quoting is unnecessary unless the string
   contains an apostrophe, a comma, or backslash (other than
   backslash-backslash).  YYSTR is taken from yytname.  If YYRES is
   null, do not copy; instead, return the length of what the result
   would have been.  */
static YYSIZE_T
yytnamerr (char *yyres, const char *yystr)
{
  if (*yystr == '"')
    {
      YYSIZE_T yyn = 0;
      char const *yyp = yystr;

      for (;;)
	switch (*++yyp)
	  {
	  case '\'':
	  case ',':
	    goto do_not_strip_quotes;

	  case '\\':
	    if (*++yyp != '\\')
	      goto do_not_strip_quotes;
	    /* Fall through.  */
	  default:
	    if (yyres)
	      yyres[yyn] = *yyp;
	    yyn++;
	    break;

	  case '"':
	    if (yyres)
	      yyres[yyn] = '\0';
	    return yyn;
	  }
    do_not_strip_quotes: ;
    }

  if (! yyres)
    return yystrlen (yystr);

  return yystpcpy (yyres, yystr) - yyres;
}
# endif

/* Copy into YYRESULT an error message about the unexpected token
   YYCHAR while in state YYSTATE.  Return the number of bytes copied,
   including the terminating null byte.  If YYRESULT is null, do not
   copy anything; just return the number of bytes that would be
   copied.  As a special case, return 0 if an ordinary "syntax error"
   message will do.  Return YYSIZE_MAXIMUM if overflow occurs during
   size calculation.  */
static YYSIZE_T
yysyntax_error (char *yyresult, int yystate, int yychar)
{
  int yyn = yypact[yystate];

  if (! (YYPACT_NINF < yyn && yyn <= YYLAST))
    return 0;
  else
    {
      int yytype = YYTRANSLATE (yychar);
      YYSIZE_T yysize0 = yytnamerr (0, yytname[yytype]);
      YYSIZE_T yysize = yysize0;
      YYSIZE_T yysize1;
      int yysize_overflow = 0;
      enum { YYERROR_VERBOSE_ARGS_MAXIMUM = 5 };
      char const *yyarg[YYERROR_VERBOSE_ARGS_MAXIMUM];
      int yyx;

# if 0
      /* This is so xgettext sees the translatable formats that are
	 constructed on the fly.  */
      YY_("syntax error, unexpected %s");
      YY_("syntax error, unexpected %s, expecting %s");
      YY_("syntax error, unexpected %s, expecting %s or %s");
      YY_("syntax error, unexpected %s, expecting %s or %s or %s");
      YY_("syntax error, unexpected %s, expecting %s or %s or %s or %s");
# endif
      char *yyfmt;
      char const *yyf;
      static char const yyunexpected[] = "syntax error, unexpected %s";
      static char const yyexpecting[] = ", expecting %s";
      static char const yyor[] = " or %s";
      char yyformat[sizeof yyunexpected
		    + sizeof yyexpecting - 1
		    + ((YYERROR_VERBOSE_ARGS_MAXIMUM - 2)
		       * (sizeof yyor - 1))];
      char const *yyprefix = yyexpecting;

      /* Start YYX at -YYN if negative to avoid negative indexes in
	 YYCHECK.  */
      int yyxbegin = yyn < 0 ? -yyn : 0;

      /* Stay within bounds of both yycheck and yytname.  */
      int yychecklim = YYLAST - yyn + 1;
      int yyxend = yychecklim < YYNTOKENS ? yychecklim : YYNTOKENS;
      int yycount = 1;

      yyarg[0] = yytname[yytype];
      yyfmt = yystpcpy (yyformat, yyunexpected);

      for (yyx = yyxbegin; yyx < yyxend; ++yyx)
	if (yycheck[yyx + yyn] == yyx && yyx != YYTERROR)
	  {
	    if (yycount == YYERROR_VERBOSE_ARGS_MAXIMUM)
	      {
		yycount = 1;
		yysize = yysize0;
		yyformat[sizeof yyunexpected - 1] = '\0';
		break;
	      }
	    yyarg[yycount++] = yytname[yyx];
	    yysize1 = yysize + yytnamerr (0, yytname[yyx]);
	    yysize_overflow |= (yysize1 < yysize);
	    yysize = yysize1;
	    yyfmt = yystpcpy (yyfmt, yyprefix);
	    yyprefix = yyor;
	  }

      yyf = YY_(yyformat);
      yysize1 = yysize + yystrlen (yyf);
      yysize_overflow |= (yysize1 < yysize);
      yysize = yysize1;

      if (yysize_overflow)
	return YYSIZE_MAXIMUM;

      if (yyresult)
	{
	  /* Avoid sprintf, as that infringes on the user's name space.
	     Don't have undefined behavior even if the translation
	     produced a string with the wrong number of "%s"s.  */
	  char *yyp = yyresult;
	  int yyi = 0;
	  while ((*yyp = *yyf) != '\0')
	    {
	      if (*yyp == '%' && yyf[1] == 's' && yyi < yycount)
		{
		  yyp += yytnamerr (yyp, yyarg[yyi++]);
		  yyf += 2;
		}
	      else
		{
		  yyp++;
		  yyf++;
		}
	    }
	}
      return yysize;
    }
}
#endif /* YYERROR_VERBOSE */


/*-----------------------------------------------.
| Release the memory associated to this symbol.  |
`-----------------------------------------------*/

/*ARGSUSED*/
#if (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
static void
yydestruct (const char *yymsg, int yytype, YYSTYPE *yyvaluep)
#else
static void
yydestruct (yymsg, yytype, yyvaluep)
    const char *yymsg;
    int yytype;
    YYSTYPE *yyvaluep;
#endif
{
  YYUSE (yyvaluep);

  if (!yymsg)
    yymsg = "Deleting";
  YY_SYMBOL_PRINT (yymsg, yytype, yyvaluep, yylocationp);

  switch (yytype)
    {

      default:
	break;
    }
}

/* Prevent warnings from -Wmissing-prototypes.  */
#ifdef YYPARSE_PARAM
#if defined __STDC__ || defined __cplusplus
int yyparse (void *YYPARSE_PARAM);
#else
int yyparse ();
#endif
#else /* ! YYPARSE_PARAM */
#if defined __STDC__ || defined __cplusplus
int yyparse (void);
#else
int yyparse ();
#endif
#endif /* ! YYPARSE_PARAM */


/* The lookahead symbol.  */
int yychar;

/* The semantic value of the lookahead symbol.  */
YYSTYPE yylval;

/* Number of syntax errors so far.  */
int yynerrs;



/*-------------------------.
| yyparse or yypush_parse.  |
`-------------------------*/

#ifdef YYPARSE_PARAM
#if (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
int
yyparse (void *YYPARSE_PARAM)
#else
int
yyparse (YYPARSE_PARAM)
    void *YYPARSE_PARAM;
#endif
#else /* ! YYPARSE_PARAM */
#if (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
int
yyparse (void)
#else
int
yyparse ()

#endif
#endif
{


    int yystate;
    /* Number of tokens to shift before error messages enabled.  */
    int yyerrstatus;

    /* The stacks and their tools:
       `yyss': related to states.
       `yyvs': related to semantic values.

       Refer to the stacks thru separate pointers, to allow yyoverflow
       to reallocate them elsewhere.  */

    /* The state stack.  */
    yytype_int16 yyssa[YYINITDEPTH];
    yytype_int16 *yyss;
    yytype_int16 *yyssp;

    /* The semantic value stack.  */
    YYSTYPE yyvsa[YYINITDEPTH];
    YYSTYPE *yyvs;
    YYSTYPE *yyvsp;

    YYSIZE_T yystacksize;

  int yyn;
  int yyresult;
  /* Lookahead token as an internal (translated) token number.  */
  int yytoken;
  /* The variables used to return semantic value and location from the
     action routines.  */
  YYSTYPE yyval;

#if YYERROR_VERBOSE
  /* Buffer for error messages, and its allocated size.  */
  char yymsgbuf[128];
  char *yymsg = yymsgbuf;
  YYSIZE_T yymsg_alloc = sizeof yymsgbuf;
#endif

#define YYPOPSTACK(N)   (yyvsp -= (N), yyssp -= (N))

  /* The number of symbols on the RHS of the reduced rule.
     Keep to zero when no symbol should be popped.  */
  int yylen = 0;

  yytoken = 0;
  yyss = yyssa;
  yyvs = yyvsa;
  yystacksize = YYINITDEPTH;

  YYDPRINTF ((stderr, "Starting parse\n"));

  yystate = 0;
  yyerrstatus = 0;
  yynerrs = 0;
  yychar = YYEMPTY; /* Cause a token to be read.  */

  /* Initialize stack pointers.
     Waste one element of value and location stack
     so that they stay on the same level as the state stack.
     The wasted elements are never initialized.  */
  yyssp = yyss;
  yyvsp = yyvs;

  goto yysetstate;

/*------------------------------------------------------------.
| yynewstate -- Push a new state, which is found in yystate.  |
`------------------------------------------------------------*/
 yynewstate:
  /* In all cases, when you get here, the value and location stacks
     have just been pushed.  So pushing a state here evens the stacks.  */
  yyssp++;

 yysetstate:
  *yyssp = yystate;

  if (yyss + yystacksize - 1 <= yyssp)
    {
      /* Get the current used size of the three stacks, in elements.  */
      YYSIZE_T yysize = yyssp - yyss + 1;

#ifdef yyoverflow
      {
	/* Give user a chance to reallocate the stack.  Use copies of
	   these so that the &'s don't force the real ones into
	   memory.  */
	YYSTYPE *yyvs1 = yyvs;
	yytype_int16 *yyss1 = yyss;

	/* Each stack pointer address is followed by the size of the
	   data in use in that stack, in bytes.  This used to be a
	   conditional around just the two extra args, but that might
	   be undefined if yyoverflow is a macro.  */
	yyoverflow (YY_("memory exhausted"),
		    &yyss1, yysize * sizeof (*yyssp),
		    &yyvs1, yysize * sizeof (*yyvsp),
		    &yystacksize);

	yyss = yyss1;
	yyvs = yyvs1;
      }
#else /* no yyoverflow */
# ifndef YYSTACK_RELOCATE
      goto yyexhaustedlab;
# else
      /* Extend the stack our own way.  */
      if (YYMAXDEPTH <= yystacksize)
	goto yyexhaustedlab;
      yystacksize *= 2;
      if (YYMAXDEPTH < yystacksize)
	yystacksize = YYMAXDEPTH;

      {
	yytype_int16 *yyss1 = yyss;
	union yyalloc *yyptr =
	  (union yyalloc *) YYSTACK_ALLOC (YYSTACK_BYTES (yystacksize));
	if (! yyptr)
	  goto yyexhaustedlab;
	YYSTACK_RELOCATE (yyss_alloc, yyss);
	YYSTACK_RELOCATE (yyvs_alloc, yyvs);
#  undef YYSTACK_RELOCATE
	if (yyss1 != yyssa)
	  YYSTACK_FREE (yyss1);
      }
# endif
#endif /* no yyoverflow */

      yyssp = yyss + yysize - 1;
      yyvsp = yyvs + yysize - 1;

      YYDPRINTF ((stderr, "Stack size increased to %lu\n",
		  (unsigned long int) yystacksize));

      if (yyss + yystacksize - 1 <= yyssp)
	YYABORT;
    }

  YYDPRINTF ((stderr, "Entering state %d\n", yystate));

  if (yystate == YYFINAL)
    YYACCEPT;

  goto yybackup;

/*-----------.
| yybackup.  |
`-----------*/
yybackup:

  /* Do appropriate processing given the current state.  Read a
     lookahead token if we need one and don't already have one.  */

  /* First try to decide what to do without reference to lookahead token.  */
  yyn = yypact[yystate];
  if (yyn == YYPACT_NINF)
    goto yydefault;

  /* Not known => get a lookahead token if don't already have one.  */

  /* YYCHAR is either YYEMPTY or YYEOF or a valid lookahead symbol.  */
  if (yychar == YYEMPTY)
    {
      YYDPRINTF ((stderr, "Reading a token: "));
      yychar = YYLEX;
    }

  if (yychar <= YYEOF)
    {
      yychar = yytoken = YYEOF;
      YYDPRINTF ((stderr, "Now at end of input.\n"));
    }
  else
    {
      yytoken = YYTRANSLATE (yychar);
      YY_SYMBOL_PRINT ("Next token is", yytoken, &yylval, &yylloc);
    }

  /* If the proper action on seeing token YYTOKEN is to reduce or to
     detect an error, take that action.  */
  yyn += yytoken;
  if (yyn < 0 || YYLAST < yyn || yycheck[yyn] != yytoken)
    goto yydefault;
  yyn = yytable[yyn];
  if (yyn <= 0)
    {
      if (yyn == 0 || yyn == YYTABLE_NINF)
	goto yyerrlab;
      yyn = -yyn;
      goto yyreduce;
    }

  /* Count tokens shifted since error; after three, turn off error
     status.  */
  if (yyerrstatus)
    yyerrstatus--;

  /* Shift the lookahead token.  */
  YY_SYMBOL_PRINT ("Shifting", yytoken, &yylval, &yylloc);

  /* Discard the shifted token.  */
  yychar = YYEMPTY;

  yystate = yyn;
  *++yyvsp = yylval;

  goto yynewstate;


/*-----------------------------------------------------------.
| yydefault -- do the default action for the current state.  |
`-----------------------------------------------------------*/
yydefault:
  yyn = yydefact[yystate];
  if (yyn == 0)
    goto yyerrlab;
  goto yyreduce;


/*-----------------------------.
| yyreduce -- Do a reduction.  |
`-----------------------------*/
yyreduce:
  /* yyn is the number of a rule to reduce with.  */
  yylen = yyr2[yyn];

  /* If YYLEN is nonzero, implement the default value of the action:
     `$$ = $1'.

     Otherwise, the following line sets YYVAL to garbage.
     This behavior is undocumented and Bison
     users should not rely upon it.  Assigning to YYVAL
     unconditionally makes the parser a bit smaller, and it avoids a
     GCC warning that YYVAL may be used uninitialized.  */
  yyval = yyvsp[1-yylen];


  YY_REDUCE_PRINT (yyn);
  switch (yyn)
    {
        case 2:

/* Line 1455 of yacc.c  */
#line 26 "semantico.y"
    {
strcpy((yyval.trad),(yyvsp[(2) - (5)].trad));
strcat((yyval.trad),(yyvsp[(3) - (5)].trad));
strcat((yyval.trad),(yyvsp[(4) - (5)].trad));
strcat((yyval.trad),(yyvsp[(5) - (5)].trad));
printf("%s \n", (yyval.trad));
;}
    break;

  case 3:

/* Line 1455 of yacc.c  */
#line 32 "semantico.y"
    {strcpy((yyval.trad),"");;}
    break;

  case 4:

/* Line 1455 of yacc.c  */
#line 35 "semantico.y"
    { ;}
    break;

  case 5:

/* Line 1455 of yacc.c  */
#line 35 "semantico.y"
    {strcpy((yyval.trad),"");;}
    break;

  case 6:

/* Line 1455 of yacc.c  */
#line 38 "semantico.y"
    {strcpy((yyval.trad),"begin ");;}
    break;

  case 7:

/* Line 1455 of yacc.c  */
#line 41 "semantico.y"
    {;}
    break;

  case 8:

/* Line 1455 of yacc.c  */
#line 44 "semantico.y"
    {strcpy((yyval.trad),"");;}
    break;

  case 9:

/* Line 1455 of yacc.c  */
#line 47 "semantico.y"
    {
strcpy((yyval.trad),(yyvsp[(2) - (4)].trad));
strcat((yyval.trad),(yyvsp[(3) - (4)].trad));
;}
    break;

  case 10:

/* Line 1455 of yacc.c  */
#line 53 "semantico.y"
    {
	strcpy((yyval.trad),(yyvsp[(1) - (1)].trad));
;}
    break;

  case 11:

/* Line 1455 of yacc.c  */
#line 59 "semantico.y"
    {strcpy((yyval.trad)," end.");;}
    break;

  case 12:

/* Line 1455 of yacc.c  */
#line 59 "semantico.y"
    {strcpy((yyval.trad),"");;}
    break;

  case 13:

/* Line 1455 of yacc.c  */
#line 62 "semantico.y"
    {strcpy((yyval.trad),(yyvsp[(1) - (2)].trad)); strcat((yyval.trad),(yyvsp[(2) - (2)].trad));;}
    break;

  case 14:

/* Line 1455 of yacc.c  */
#line 62 "semantico.y"
    {strcpy((yyval.trad),(yyvsp[(1) - (2)].trad)); strcat((yyval.trad),(yyvsp[(2) - (2)].trad));;}
    break;

  case 15:

/* Line 1455 of yacc.c  */
#line 62 "semantico.y"
    {strcpy((yyval.trad),(yyvsp[(1) - (2)].trad)); strcat((yyval.trad),(yyvsp[(2) - (2)].trad));;}
    break;

  case 16:

/* Line 1455 of yacc.c  */
#line 62 "semantico.y"
    {strcpy((yyval.trad),(yyvsp[(1) - (2)].trad)); strcat((yyval.trad),(yyvsp[(2) - (2)].trad));;}
    break;

  case 17:

/* Line 1455 of yacc.c  */
#line 62 "semantico.y"
    {strcpy((yyval.trad),(yyvsp[(1) - (2)].trad)); strcat((yyval.trad),(yyvsp[(2) - (2)].trad));;}
    break;

  case 18:

/* Line 1455 of yacc.c  */
#line 62 "semantico.y"
    {strcpy((yyval.trad),(yyvsp[(1) - (2)].trad)); strcat((yyval.trad),(yyvsp[(2) - (2)].trad));;}
    break;

  case 19:

/* Line 1455 of yacc.c  */
#line 62 "semantico.y"
    {strcpy((yyval.trad),"");;}
    break;

  case 20:

/* Line 1455 of yacc.c  */
#line 65 "semantico.y"
    {strcpy((yyval.trad),(yyvsp[(1) - (1)].trad));;}
    break;

  case 21:

/* Line 1455 of yacc.c  */
#line 65 "semantico.y"
    {strcpy((yyval.trad),"");;}
    break;

  case 22:

/* Line 1455 of yacc.c  */
#line 69 "semantico.y"
    {
if(strcmp((yyvsp[(2) - (7)].trad),"*")==1){
		strcpy((yyval.trad),"type");
		strcat((yyval.trad),(yyvsp[(3) - (7)].trad));
		strcat((yyval.trad),(yyvsp[(1) - (7)].trad));
		strcat((yyval.trad),";");
		strcat((yyval.trad),(yyvsp[(7) - (7)].trad));
}
if(strcmp((yyvsp[(3) - (7)].trad),"")==0){ /*CHECAR*/
	strcpy((yyval.trad)," var ");
	strcat((yyval.trad),(yyvsp[(3) - (7)].trad));
	strcat((yyval.trad)," : ");
	strcat((yyval.trad)," array ");
	strcat((yyval.trad)," [ ");
	strcat((yyval.trad)," 0 ");
	strcat((yyval.trad)," .. ");
	strcat((yyval.trad)," : ");
	strcat((yyval.trad)," nint ");
	strcat((yyval.trad), (yyvsp[(5) - (7)].trad));
	strcat((yyval.trad)," of ");
	strcat((yyval.trad), (yyvsp[(1) - (7)].trad));
	strcat((yyval.trad)," ; ");
	strcat((yyval.trad),(yyvsp[(7) - (7)].trad));
}
else{
	strcpy((yyval.trad),"var ");
	strcat((yyval.trad),(yyvsp[(3) - (7)].trad));
	strcat((yyval.trad),(yyvsp[(5) - (7)].trad));
	strcat((yyval.trad)," : ");
	strcat((yyval.trad) ,(yyvsp[(1) - (7)].trad));
	strcat((yyval.trad)," ; ");
	strcat((yyval.trad),(yyvsp[(7) - (7)].trad));
}

;}
    break;

  case 23:

/* Line 1455 of yacc.c  */
#line 103 "semantico.y"
    {strcpy((yyval.trad),"");;}
    break;

  case 24:

/* Line 1455 of yacc.c  */
#line 106 "semantico.y"
    {
	if(strcmp((yyvsp[(3) - (5)].trad),"")==1){
		strcpy((yyval.trad),",");
		strcat((yyval.trad),"nombredelID");
		strcat((yyval.trad),(yyvsp[(5) - (5)].trad));
	}
	else{
		strcpy((yyval.trad),",");
		strcat((yyval.trad),"0");
		strcat((yyval.trad),"..");
		strcat((yyval.trad),(yyvsp[(3) - (5)].trad));
		strcat((yyval.trad),(yyvsp[(5) - (5)].trad));
	}
;}
    break;

  case 25:

/* Line 1455 of yacc.c  */
#line 119 "semantico.y"
    {strcpy((yyval.trad),"");;}
    break;

  case 26:

/* Line 1455 of yacc.c  */
#line 122 "semantico.y"
    {strcpy((yyval.trad)," real ");;}
    break;

  case 27:

/* Line 1455 of yacc.c  */
#line 122 "semantico.y"
    {strcpy((yyval.trad)," integer ");;}
    break;

  case 28:

/* Line 1455 of yacc.c  */
#line 122 "semantico.y"
    {strcpy((yyval.trad)," boolean ");;}
    break;

  case 29:

/* Line 1455 of yacc.c  */
#line 122 "semantico.y"
    {strcpy((yyval.trad)," char ");;}
    break;

  case 30:

/* Line 1455 of yacc.c  */
#line 125 "semantico.y"
    {
strcpy((yyval.trad),(yyvsp[(1) - (2)].trad));
strcat((yyval.trad),(yyvsp[(2) - (2)].trad));
;}
    break;

  case 31:

/* Line 1455 of yacc.c  */
#line 131 "semantico.y"
    {
strcpy((yyval.trad)," [ ");
strcat((yyval.trad), (yyvsp[(2) - (4)].trad));
strcat((yyval.trad)," ] ");
strcat((yyval.trad), (yyvsp[(4) - (4)].trad));
;}
    break;

  case 32:

/* Line 1455 of yacc.c  */
#line 136 "semantico.y"
    {
strcpy((yyval.trad),"");
;}
    break;

  case 33:

/* Line 1455 of yacc.c  */
#line 141 "semantico.y"
    {
strcpy((yyval.trad)," := ");
strcat((yyval.trad),(yyvsp[(1) - (2)].trad));
;}
    break;

  case 34:

/* Line 1455 of yacc.c  */
#line 144 "semantico.y"
    {
strcpy((yyval.trad)," := ");
strcat((yyval.trad)," ( ");
strcat((yyval.trad),(yyvsp[(2) - (4)].trad));
strcat((yyval.trad),(yyvsp[(3) - (4)].trad));
strcat((yyval.trad)," ) ");
;}
    break;

  case 35:

/* Line 1455 of yacc.c  */
#line 150 "semantico.y"
    {strcpy((yyval.trad),"");;}
    break;

  case 36:

/* Line 1455 of yacc.c  */
#line 153 "semantico.y"
    {;}
    break;

  case 37:

/* Line 1455 of yacc.c  */
#line 153 "semantico.y"
    {
itoa((yyvsp[(1) - (1)].val),temp,100);
strcpy((yyval.trad),temp);
;;}
    break;

  case 38:

/* Line 1455 of yacc.c  */
#line 159 "semantico.y"
    {
itoa((yyvsp[(1) - (1)].val),temp,100);
strcopy((yyval.trad),temp);
;}
    break;

  case 39:

/* Line 1455 of yacc.c  */
#line 162 "semantico.y"
    {strcpy((yyval.trad),(yyvsp[(1) - (1)].trad));;}
    break;

  case 40:

/* Line 1455 of yacc.c  */
#line 167 "semantico.y"
    {
	strcpy((yyval.trad),(yyvsp[(1) - (1)].trad));
;}
    break;

  case 41:

/* Line 1455 of yacc.c  */
#line 170 "semantico.y"
    {
	strcpy((yyval.trad),""); /*epsilon*/
;}
    break;

  case 42:

/* Line 1455 of yacc.c  */
#line 174 "semantico.y"
    {
	strcpy((yyval.trad)," , ");
	strcat((yyval.trad),(yyvsp[(2) - (3)].trad));
	strcat((yyval.trad),(yyvsp[(3) - (3)].trad));
;}
    break;

  case 43:

/* Line 1455 of yacc.c  */
#line 179 "semantico.y"
    {
	strcpy((yyval.trad),""); /*epsilon*/
;}
    break;

  case 44:

/* Line 1455 of yacc.c  */
#line 183 "semantico.y"
    {
	strcpy((yyval.trad),(yyvsp[(1) - (1)].val));
;}
    break;

  case 45:

/* Line 1455 of yacc.c  */
#line 187 "semantico.y"
    {
	strcpy((yyval.trad)," * ");
;}
    break;

  case 46:

/* Line 1455 of yacc.c  */
#line 190 "semantico.y"
    {
	strcpy((yyval.trad),""); /*epsilon*/
;}
    break;

  case 47:

/* Line 1455 of yacc.c  */
#line 194 "semantico.y"
    {
	strcpy((yyval.trad),(yyvsp[(1) - (1)].trad));
;}
    break;

  case 48:

/* Line 1455 of yacc.c  */
#line 198 "semantico.y"
    {
	strcpy((yyval.trad),(yyvsp[(1) - (5)].trad));
	strcat((yyval.trad),(yyvsp[(2) - (5)].trad));
	strcat((yyval.trad),(yyvsp[(3) - (5)].trad));
	strcat((yyval.trad)," ; ");
	strcat((yyval.trad),(yyvsp[(5) - (5)].trad));
;}
    break;

  case 49:

/* Line 1455 of yacc.c  */
#line 205 "semantico.y"
    {
	strcpy((yyval.trad),(yyvsp[(1) - (5)].trad));
	strcat((yyval.trad),(yyvsp[(2) - (5)].trad));
	strcat((yyval.trad),(yyvsp[(3) - (5)].trad));
	strcat((yyval.trad)," ; ");
	strcat((yyval.trad),(yyvsp[(5) - (5)].trad));
;}
    break;

  case 50:

/* Line 1455 of yacc.c  */
#line 212 "semantico.y"
    {
	strcpy((yyval.trad),"");
;}
    break;

  case 51:

/* Line 1455 of yacc.c  */
#line 216 "semantico.y"
    {
	strcpy((yyval.trad),"STRING");

;}
    break;

  case 52:

/* Line 1455 of yacc.c  */
#line 221 "semantico.y"
    {
	if((strcmp((yyvsp[(1) - (2)].trad),"")==0)){
		strcpy((yyval.trad),(yyvsp[(1) - (2)].trad));
		strcat((yyval.trad)," := ");
	}
	else {
		strcpy((yyval.trad),(yyvsp[(1) - (2)].trad));
		strcat((yyval.trad)," = ");
	}
;}
    break;

  case 53:

/* Line 1455 of yacc.c  */
#line 232 "semantico.y"
    {
	strcpy((yyval.trad)," / ");
;}
    break;

  case 54:

/* Line 1455 of yacc.c  */
#line 235 "semantico.y"
    {
	strcpy((yyval.trad)," * ");
;}
    break;

  case 55:

/* Line 1455 of yacc.c  */
#line 238 "semantico.y"
    {
	strcpy((yyval.trad)," + ");
;}
    break;

  case 56:

/* Line 1455 of yacc.c  */
#line 241 "semantico.y"
    {
	strcpy((yyval.trad)," - ");
;}
    break;

  case 57:

/* Line 1455 of yacc.c  */
#line 244 "semantico.y"
    {
	strcpy((yyval.trad),""); /*EPSILON*/
;}
    break;

  case 58:

/* Line 1455 of yacc.c  */
#line 248 "semantico.y"
    {
	strcpy((yyval.trad),(yyvsp[(1) - (1)].trad));
;}
    break;

  case 59:

/* Line 1455 of yacc.c  */
#line 253 "semantico.y"
    {

	strcpy((yyval.trad),(yyvsp[(1) - (3)].trad));
	strcat((yyval.trad),(yyvsp[(2) - (3)].trad));
	strcat((yyval.trad),(yyvsp[(3) - (3)].trad));
;}
    break;

  case 60:

/* Line 1455 of yacc.c  */
#line 259 "semantico.y"
    {
	strcpy((yyval.trad),(yyvsp[(1) - (1)].trad));
;}
    break;

  case 61:

/* Line 1455 of yacc.c  */
#line 263 "semantico.y"
    {
	strcpy((yyval.trad),(yyvsp[(1) - (1)].trad));
;}
    break;

  case 62:

/* Line 1455 of yacc.c  */
#line 266 "semantico.y"
    {
	strcpy((yyval.trad)," ( ");
	strcat((yyval.trad),(yyvsp[(2) - (3)].trad));
	strcat((yyval.trad)," ) ");
	
;}
    break;

  case 63:

/* Line 1455 of yacc.c  */
#line 273 "semantico.y"
    {
	strcpy((yyval.trad),(yyvsp[(1) - (1)].trad));
;}
    break;

  case 64:

/* Line 1455 of yacc.c  */
#line 277 "semantico.y"
    {
	strcpy((yyval.trad),(yyvsp[(1) - (1)].trad));
;}
    break;

  case 65:

/* Line 1455 of yacc.c  */
#line 281 "semantico.y"
    {
	strcpy((yyval.trad)," for ")
	strcat((yyval.trad),(yyvsp[(3) - (11)].trad));
	strcat((yyval.trad)," to ");
	strcat((yyval.trad),(yyvsp[(6) - (11)].trad));
	strcat((yyval.trad)," begin ");
	strcat((yyval.trad),(yyvsp[(10) - (11)].trad));
	strcat((yyval.trad)," end ");
	strcat((yyval.trad),";");
	strcat((yyval.trad),(yyvsp[(11) - (11)].trad));

;}
    break;

  case 66:

/* Line 1455 of yacc.c  */
#line 293 "semantico.y"
    {
	strcpy((yyval.trad),""); /*EPSIOLOOOOOOON*/
;}
    break;

  case 67:

/* Line 1455 of yacc.c  */
#line 297 "semantico.y"
    {
	strcpy((yyval.trad),(yyvsp[(2) - (4)].trad));
	strcat((yyval.trad),(yyvsp[(3) - (4)].trad));
;}
    break;

  case 68:

/* Line 1455 of yacc.c  */
#line 302 "semantico.y"
    {
	strcpy((yyval.trad),(yyvsp[(1) - (1)].trad));
;}
    break;

  case 69:

/* Line 1455 of yacc.c  */
#line 305 "semantico.y"
    {
	strcpy((yyval.trad),"");
;}
    break;

  case 70:

/* Line 1455 of yacc.c  */
#line 309 "semantico.y"
    {
	strcpy((yyval.trad)," < ");
;}
    break;

  case 71:

/* Line 1455 of yacc.c  */
#line 312 "semantico.y"
    {
	strcpy((yyval.trad)," <= ");
;}
    break;

  case 72:

/* Line 1455 of yacc.c  */
#line 315 "semantico.y"
    {
	strcpy((yyval.trad)," > ");
;}
    break;

  case 73:

/* Line 1455 of yacc.c  */
#line 318 "semantico.y"
    {
	strcpy((yyval.trad)," >= ");
;}
    break;

  case 74:

/* Line 1455 of yacc.c  */
#line 321 "semantico.y"
    {
	strcpy((yyval.trad)," not ");
;}
    break;

  case 75:

/* Line 1455 of yacc.c  */
#line 324 "semantico.y"
    {
	strcpy((yyval.trad)," <> ");
;}
    break;

  case 76:

/* Line 1455 of yacc.c  */
#line 327 "semantico.y"
    {
	strcpy((yyval.trad)," = ");
;}
    break;

  case 77:

/* Line 1455 of yacc.c  */
#line 330 "semantico.y"
    {
	strcpy((yyval.trad)," and ");
;}
    break;

  case 78:

/* Line 1455 of yacc.c  */
#line 333 "semantico.y"
    {
	strcpy((yyval.trad)," or ");
;}
    break;

  case 79:

/* Line 1455 of yacc.c  */
#line 339 "semantico.y"
    {;}
    break;

  case 80:

/* Line 1455 of yacc.c  */
#line 339 "semantico.y"
    {
;}
    break;

  case 81:

/* Line 1455 of yacc.c  */
#line 343 "semantico.y"
    {
	strcpy((yyval.trad),"while");
	strcat((yyval.trad),(yyvsp[(3) - (8)].trad));
	strcat((yyval.trad),(yyvsp[(4) - (8)].trad));
	strcat((yyval.trad),(yyvsp[(5) - (8)].trad));
	strcpy((yyval.trad),"do");
	strcpy((yyval.trad),"begin");
	strcat((yyval.trad),(yyvsp[(7) - (8)].trad));
	strcpy((yyval.trad),"end");
	strcat((yyval.trad),";");
	strcat((yyval.trad),(yyvsp[(8) - (8)].trad));
	printf("%s",(yyval.trad));
;}
    break;

  case 82:

/* Line 1455 of yacc.c  */
#line 358 "semantico.y"
    {
	strcpy((yyval.trad),"if");
	strcat((yyval.trad),(yyvsp[(3) - (9)].trad));
	strcat((yyval.trad),(yyvsp[(4) - (9)].trad));
	strcat((yyval.trad),(yyvsp[(5) - (9)].trad));
	strcpy((yyval.trad),"then");
	strcpy((yyval.trad),"begin");
	strcpy((yyval.trad),(yyvsp[(7) - (9)].trad));
	strcpy((yyval.trad),"end");
	strcat((yyval.trad),(yyvsp[(8) - (9)].trad));
	strcat((yyval.trad),(yyvsp[(9) - (9)].trad));
	printf("%s",(yyval.trad));
;}
    break;

  case 83:

/* Line 1455 of yacc.c  */
#line 372 "semantico.y"
    {
	strcpy((yyval.trad),"else");
	strcpy((yyval.trad),"begin");
	strcat((yyval.trad),(yyvsp[(2) - (2)].trad));
	strcpy((yyval.trad),"end");
	strcat((yyval.trad),";");
	printf("%s",(yyval.trad));
;}
    break;

  case 84:

/* Line 1455 of yacc.c  */
#line 379 "semantico.y"
    {
	strcat((yyval.trad),"");
;}
    break;

  case 85:

/* Line 1455 of yacc.c  */
#line 384 "semantico.y"
    {
	strcat((yyval.trad),(yyvsp[(1) - (1)].trad));
;}
    break;

  case 86:

/* Line 1455 of yacc.c  */
#line 389 "semantico.y"
    {
	strcat((yyval.trad),(yyvsp[(1) - (1)].trad));
;}
    break;

  case 87:

/* Line 1455 of yacc.c  */
#line 391 "semantico.y"
    {
	strcat((yyval.trad),(yyvsp[(1) - (1)].trad));
;}
    break;

  case 88:

/* Line 1455 of yacc.c  */
#line 396 "semantico.y"
    {
	strcpy((yyval.trad),"case");
	strcpy((yyval.trad),(yyvsp[(3) - (6)].trad));
	strcpy((yyval.trad),"of");
	strcat((yyval.trad),(yyvsp[(5) - (6)].trad));
	strcat((yyval.trad),(yyvsp[(6) - (6)].trad));
	printf("%s",(yyval.trad));
;}
    break;

  case 89:

/* Line 1455 of yacc.c  */
#line 406 "semantico.y"
    {
	strcpy((yyval.trad),(yyvsp[(2) - (6)].val));
	strcat((yyval.trad),":");
	strcpy((yyval.trad),"begin");
	strcat((yyval.trad),(yyvsp[(4) - (6)].trad));
	strcpy((yyval.trad),"end");
;}
    break;

  case 90:

/* Line 1455 of yacc.c  */
#line 415 "semantico.y"
    {
	strcpy((yyval.trad),"else");
	strcpy((yyval.trad),"begin");
	strcat((yyval.trad),(yyvsp[(3) - (5)].trad));
	strcpy((yyval.trad),"end");
	strcat((yyval.trad),";");
;}
    break;

  case 91:

/* Line 1455 of yacc.c  */
#line 421 "semantico.y"
    { strcat((yyval.trad),""); ;}
    break;

  case 92:

/* Line 1455 of yacc.c  */
#line 424 "semantico.y"
    {
	strcat((yyval.trad),(yyvsp[(2) - (4)].trad));
	strcat((yyval.trad),(yyvsp[(3) - (4)].trad));
;}
    break;

  case 93:

/* Line 1455 of yacc.c  */
#line 430 "semantico.y"
    {
	strcat((yyval.trad),(yyvsp[(1) - (2)].trad));
	strcat((yyval.trad),(yyvsp[(2) - (2)].trad));
;}
    break;

  case 94:

/* Line 1455 of yacc.c  */
#line 433 "semantico.y"
    { strcat((yyval.trad),""); ;}
    break;

  case 95:

/* Line 1455 of yacc.c  */
#line 436 "semantico.y"
    {
	strcpy((yyval.trad),"write");
	strcat((yyval.trad),"(");
	strcat((yyval.trad),(yyvsp[(3) - (7)].trad));
	strcat((yyval.trad),(yyvsp[(4) - (7)].trad));
	strcat((yyval.trad),(yyvsp[(5) - (7)].trad));
	strcat((yyval.trad),")");
	strcat((yyval.trad),";");
;}
    break;

  case 96:

/* Line 1455 of yacc.c  */
#line 444 "semantico.y"
    { strcat((yyval.trad),""); ;}
    break;

  case 97:

/* Line 1455 of yacc.c  */
#line 447 "semantico.y"
    {
	strcat((yyval.trad),(yyvsp[(1) - (2)].trad));
	strcat((yyval.trad),(yyvsp[(2) - (2)].trad));
;}
    break;

  case 98:

/* Line 1455 of yacc.c  */
#line 450 "semantico.y"
    { strcat((yyval.trad),""); ;}
    break;

  case 99:

/* Line 1455 of yacc.c  */
#line 453 "semantico.y"
    {
	strcpy((yyval.trad),"STRING");
;}
    break;

  case 100:

/* Line 1455 of yacc.c  */
#line 455 "semantico.y"
    { strcat((yyval.trad),""); ;}
    break;

  case 101:

/* Line 1455 of yacc.c  */
#line 458 "semantico.y"
    { strcat((yyval.trad),","); ;}
    break;

  case 102:

/* Line 1455 of yacc.c  */
#line 458 "semantico.y"
    { strcat((yyval.trad),""); ;}
    break;

  case 103:

/* Line 1455 of yacc.c  */
#line 460 "semantico.y"
    { strcat((yyval.trad),(yyvsp[(1) - (1)].trad)); ;}
    break;

  case 104:

/* Line 1455 of yacc.c  */
#line 460 "semantico.y"
    { strcat((yyval.trad),(yyvsp[(1) - (1)].trad)); ;}
    break;

  case 105:

/* Line 1455 of yacc.c  */
#line 463 "semantico.y"
    {
	strcat((yyval.trad),",");
	strcat((yyval.trad),(yyvsp[(2) - (3)].trad));
	strcat((yyval.trad),(yyvsp[(3) - (3)].trad));
;}
    break;

  case 106:

/* Line 1455 of yacc.c  */
#line 467 "semantico.y"
    { strcat((yyval.trad),""); ;}
    break;

  case 107:

/* Line 1455 of yacc.c  */
#line 470 "semantico.y"
    {
	strcpy((yyval.trad),"read");
	strcat((yyval.trad),"(");
	strcat((yyval.trad),(yyvsp[(4) - (6)].trad));
	strcat((yyval.trad),")");
	strcat((yyval.trad),";");
;}
    break;

  case 108:

/* Line 1455 of yacc.c  */
#line 476 "semantico.y"
    { strcpy((yyval.trad),""); ;}
    break;

  case 109:

/* Line 1455 of yacc.c  */
#line 479 "semantico.y"
    {
	/*CHECAR*/
	strcpy((yyval.trad),"id");
;}
    break;

  case 110:

/* Line 1455 of yacc.c  */
#line 485 "semantico.y"
    {;}
    break;

  case 111:

/* Line 1455 of yacc.c  */
#line 485 "semantico.y"
    { strcpy((yyval.trad),""); ;}
    break;

  case 112:

/* Line 1455 of yacc.c  */
#line 487 "semantico.y"
    {;}
    break;

  case 113:

/* Line 1455 of yacc.c  */
#line 487 "semantico.y"
    { strcpy((yyval.trad),""); ;}
    break;



/* Line 1455 of yacc.c  */
#line 2644 "semantico.tab.c"
      default: break;
    }
  YY_SYMBOL_PRINT ("-> $$ =", yyr1[yyn], &yyval, &yyloc);

  YYPOPSTACK (yylen);
  yylen = 0;
  YY_STACK_PRINT (yyss, yyssp);

  *++yyvsp = yyval;

  /* Now `shift' the result of the reduction.  Determine what state
     that goes to, based on the state we popped back to and the rule
     number reduced by.  */

  yyn = yyr1[yyn];

  yystate = yypgoto[yyn - YYNTOKENS] + *yyssp;
  if (0 <= yystate && yystate <= YYLAST && yycheck[yystate] == *yyssp)
    yystate = yytable[yystate];
  else
    yystate = yydefgoto[yyn - YYNTOKENS];

  goto yynewstate;


/*------------------------------------.
| yyerrlab -- here on detecting error |
`------------------------------------*/
yyerrlab:
  /* If not already recovering from an error, report this error.  */
  if (!yyerrstatus)
    {
      ++yynerrs;
#if ! YYERROR_VERBOSE
      yyerror (YY_("syntax error"));
#else
      {
	YYSIZE_T yysize = yysyntax_error (0, yystate, yychar);
	if (yymsg_alloc < yysize && yymsg_alloc < YYSTACK_ALLOC_MAXIMUM)
	  {
	    YYSIZE_T yyalloc = 2 * yysize;
	    if (! (yysize <= yyalloc && yyalloc <= YYSTACK_ALLOC_MAXIMUM))
	      yyalloc = YYSTACK_ALLOC_MAXIMUM;
	    if (yymsg != yymsgbuf)
	      YYSTACK_FREE (yymsg);
	    yymsg = (char *) YYSTACK_ALLOC (yyalloc);
	    if (yymsg)
	      yymsg_alloc = yyalloc;
	    else
	      {
		yymsg = yymsgbuf;
		yymsg_alloc = sizeof yymsgbuf;
	      }
	  }

	if (0 < yysize && yysize <= yymsg_alloc)
	  {
	    (void) yysyntax_error (yymsg, yystate, yychar);
	    yyerror (yymsg);
	  }
	else
	  {
	    yyerror (YY_("syntax error"));
	    if (yysize != 0)
	      goto yyexhaustedlab;
	  }
      }
#endif
    }



  if (yyerrstatus == 3)
    {
      /* If just tried and failed to reuse lookahead token after an
	 error, discard it.  */

      if (yychar <= YYEOF)
	{
	  /* Return failure if at end of input.  */
	  if (yychar == YYEOF)
	    YYABORT;
	}
      else
	{
	  yydestruct ("Error: discarding",
		      yytoken, &yylval);
	  yychar = YYEMPTY;
	}
    }

  /* Else will try to reuse lookahead token after shifting the error
     token.  */
  goto yyerrlab1;


/*---------------------------------------------------.
| yyerrorlab -- error raised explicitly by YYERROR.  |
`---------------------------------------------------*/
yyerrorlab:

  /* Pacify compilers like GCC when the user code never invokes
     YYERROR and the label yyerrorlab therefore never appears in user
     code.  */
  if (/*CONSTCOND*/ 0)
     goto yyerrorlab;

  /* Do not reclaim the symbols of the rule which action triggered
     this YYERROR.  */
  YYPOPSTACK (yylen);
  yylen = 0;
  YY_STACK_PRINT (yyss, yyssp);
  yystate = *yyssp;
  goto yyerrlab1;


/*-------------------------------------------------------------.
| yyerrlab1 -- common code for both syntax error and YYERROR.  |
`-------------------------------------------------------------*/
yyerrlab1:
  yyerrstatus = 3;	/* Each real token shifted decrements this.  */

  for (;;)
    {
      yyn = yypact[yystate];
      if (yyn != YYPACT_NINF)
	{
	  yyn += YYTERROR;
	  if (0 <= yyn && yyn <= YYLAST && yycheck[yyn] == YYTERROR)
	    {
	      yyn = yytable[yyn];
	      if (0 < yyn)
		break;
	    }
	}

      /* Pop the current state because it cannot handle the error token.  */
      if (yyssp == yyss)
	YYABORT;


      yydestruct ("Error: popping",
		  yystos[yystate], yyvsp);
      YYPOPSTACK (1);
      yystate = *yyssp;
      YY_STACK_PRINT (yyss, yyssp);
    }

  *++yyvsp = yylval;


  /* Shift the error token.  */
  YY_SYMBOL_PRINT ("Shifting", yystos[yyn], yyvsp, yylsp);

  yystate = yyn;
  goto yynewstate;


/*-------------------------------------.
| yyacceptlab -- YYACCEPT comes here.  |
`-------------------------------------*/
yyacceptlab:
  yyresult = 0;
  goto yyreturn;

/*-----------------------------------.
| yyabortlab -- YYABORT comes here.  |
`-----------------------------------*/
yyabortlab:
  yyresult = 1;
  goto yyreturn;

#if !defined(yyoverflow) || YYERROR_VERBOSE
/*-------------------------------------------------.
| yyexhaustedlab -- memory exhaustion comes here.  |
`-------------------------------------------------*/
yyexhaustedlab:
  yyerror (YY_("memory exhausted"));
  yyresult = 2;
  /* Fall through.  */
#endif

yyreturn:
  if (yychar != YYEMPTY)
     yydestruct ("Cleanup: discarding lookahead",
		 yytoken, &yylval);
  /* Do not reclaim the symbols of the rule which action triggered
     this YYABORT or YYACCEPT.  */
  YYPOPSTACK (yylen);
  YY_STACK_PRINT (yyss, yyssp);
  while (yyssp != yyss)
    {
      yydestruct ("Cleanup: popping",
		  yystos[*yyssp], yyvsp);
      YYPOPSTACK (1);
    }
#ifndef yyoverflow
  if (yyss != yyssa)
    YYSTACK_FREE (yyss);
#endif
#if YYERROR_VERBOSE
  if (yymsg != yymsgbuf)
    YYSTACK_FREE (yymsg);
#endif
  /* Make sure YYID is used.  */
  return YYID (yyresult);
}



/* Line 1675 of yacc.c  */
#line 494 "semantico.y"

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
