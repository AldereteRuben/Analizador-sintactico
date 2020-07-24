
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
#line 1 "sintactico.y"

#include<stdio.h>
#define YYSTYPE char *


/* Line 189 of yacc.c  */
#line 79 "sintactico.tab.c"

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


/* Copy the second part of user declarations.  */


/* Line 264 of yacc.c  */
#line 170 "sintactico.tab.c"

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
#define YYLAST   226

/* YYNTOKENS -- Number of terminals.  */
#define YYNTOKENS  50
/* YYNNTS -- Number of nonterminals.  */
#define YYNNTS  54
/* YYNRULES -- Number of rules.  */
#define YYNRULES  111
/* YYNRULES -- Number of states.  */
#define YYNSTATES  203

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
      25,    27,    30,    33,    36,    39,    42,    45,    46,    48,
      49,    53,    54,    62,    63,    69,    70,    72,    74,    76,
      78,    81,    86,    87,    90,    95,    96,    98,   100,   102,
     104,   106,   107,   111,   112,   114,   116,   117,   119,   125,
     131,   132,   134,   137,   139,   141,   143,   145,   146,   148,
     152,   154,   156,   160,   162,   164,   176,   177,   186,   195,
     202,   207,   209,   210,   212,   215,   217,   219,   221,   223,
     225,   227,   229,   232,   234,   236,   238,   240,   247,   253,
     254,   259,   262,   263,   271,   272,   275,   276,   278,   279,
     281,   283,   287,   288,   290,   291,   298,   299,   303,   305,
     306,   316
};

/* YYRHS -- A `-1'-separated list of the rules' RHS.  */
static const yytype_int8 yyrhs[] =
{
      51,     0,    -1,    51,    52,    53,    54,    56,    -1,    -1,
       3,    -1,    -1,     4,    -1,     5,    55,     6,    -1,    -1,
       7,    57,    60,     8,    -1,    58,    -1,    59,    58,    -1,
      82,    58,    -1,    73,    58,    -1,   100,    58,    -1,   103,
      58,    -1,    94,    58,    -1,    -1,    61,    -1,    -1,    49,
      14,    20,    -1,    -1,    63,    72,    64,    66,    62,    20,
      61,    -1,    -1,    13,    72,    64,    66,    62,    -1,    -1,
      12,    -1,     3,    -1,    11,    -1,    10,    -1,     9,    65,
      -1,    15,    68,    16,    65,    -1,    -1,    67,    69,    -1,
       7,    71,    70,     8,    -1,    -1,    17,    -1,    14,    -1,
      14,    -1,     9,    -1,    64,    -1,    -1,    13,    71,    70,
      -1,    -1,    14,    -1,    24,    -1,    -1,    74,    -1,    69,
      76,    78,    20,    74,    -1,    69,    76,    75,    20,    74,
      -1,    -1,    45,    -1,    77,    19,    -1,    23,    -1,    24,
      -1,    21,    -1,    22,    -1,    -1,    79,    -1,    79,    81,
      80,    -1,    80,    -1,    68,    -1,     5,    79,     6,    -1,
      77,    -1,    83,    -1,    27,     5,    84,    89,    86,    88,
      20,    87,     6,    56,    83,    -1,    -1,    38,     5,    89,
      86,    88,     6,    56,    83,    -1,    35,     5,    89,    86,
      88,     6,    56,    83,    -1,    40,     5,     9,     6,    92,
      83,    -1,    85,     9,    66,    20,    -1,    63,    -1,    -1,
      28,    -1,    86,    30,    -1,    29,    -1,    31,    -1,    18,
      -1,    32,    -1,    33,    -1,    36,    -1,    37,    -1,    64,
      25,    -1,    26,    -1,    89,    -1,    78,    -1,    68,    -1,
      41,    14,    46,    57,    43,    20,    -1,    42,    46,    57,
      43,    20,    -1,    -1,     7,    93,    91,     8,    -1,    90,
      93,    -1,    -1,    47,     5,    96,    99,    95,     6,    20,
      -1,    -1,    97,    98,    -1,    -1,    45,    -1,    -1,    64,
      -1,    78,    -1,    13,    97,    98,    -1,    -1,    13,    -1,
      -1,    48,     5,    45,   101,     6,    20,    -1,    -1,    13,
     102,     9,    -1,    17,    -1,    -1,    44,    56,    38,     5,
      89,    86,    88,     6,    20,    -1,    -1
};

/* YYRLINE[YYN] -- source line where rule number YYN was defined.  */
static const yytype_uint8 yyrline[] =
{
       0,    14,    14,    17,    20,    20,    23,    26,    29,    32,
      35,    38,    38,    38,    38,    38,    38,    38,    41,    41,
      44,    44,    47,    47,    50,    50,    53,    53,    53,    53,
      56,    59,    59,    62,    62,    62,    65,    65,    68,    68,
      71,    71,    74,    74,    77,    80,    80,    83,    86,    86,
      86,    92,    95,   100,   100,   100,   100,   100,   103,   106,
     106,   109,   109,   112,   115,   118,   118,   118,   118,   118,
     121,   124,   124,   127,   127,   127,   127,   127,   127,   127,
     127,   127,   130,   130,   136,   139,   139,   142,   145,   145,
     148,   151,   151,   154,   154,   157,   157,   160,   160,   163,
     163,   166,   166,   169,   169,   173,   173,   176,   179,   179,
     182,   182
};
#endif

#if YYDEBUG || YYERROR_VERBOSE || YYTOKEN_TABLE
/* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
   First, the terminals, then, starting at YYNTOKENS, nonterminals.  */
static const char *const yytname[] =
{
  "$end", "error", "$undefined", "INT", "MAIN", "PARENTESISABRE",
  "PARENTESISCIERRA", "LLAVEABRE", "LLAVECIERRA", "ID", "CHAR", "BOOL",
  "FLOAT", "COMA", "NINT", "CORCHETEABRE", "CORCHETECIERRA", "AMPERSAND",
  "ADMIRACIONCIERRA", "SIGNOIGUAL", "PUNTOYC", "SIGNOMAS", "SIGNOMENOS",
  "DIAGONAL", "ASTERISCO", "INCREMENTO", "DECREMENTO", "FOR", "MENORQUE",
  "MAYORQUE", "MENORIGUAL", "MAYORIGUAL", "DISTINTODE", "IGUALQUE", "ELSE",
  "IF", "AND", "OR", "WHILE", "COMILLA", "SWITCH", "CASE", "DEFAULT",
  "BREAK", "DO", "STRING", "DOSPUNTOS", "PRINTF", "SCANF", "RETURN",
  "$accept", "A", "B", "C", "D", "F", "E", "GN", "G", "AZ", "AJ", "H", "L",
  "J", "K", "AL", "M", "N", "NN", "R", "P", "DD", "Q", "FI", "I", "IDX",
  "S", "U", "SIG", "T", "W", "V", "YF", "Y", "X", "BB", "AB", "AA", "AE",
  "AD", "AI", "AH", "AF", "AG", "PQ", "JJ", "BA", "JP", "NXT", "CO", "PR",
  "KR", "AM", "PL", 0
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
      57,    58,    58,    58,    58,    58,    58,    58,    59,    59,
      60,    60,    61,    61,    62,    62,    63,    63,    63,    63,
      64,    65,    65,    66,    66,    66,    67,    67,    68,    68,
      69,    69,    70,    70,    71,    72,    72,    73,    74,    74,
      74,    75,    76,    77,    77,    77,    77,    77,    78,    79,
      79,    80,    80,    81,    82,    83,    83,    83,    83,    83,
      84,    85,    85,    86,    86,    86,    86,    86,    86,    86,
      86,    86,    87,    87,    88,    89,    89,    90,    91,    91,
      92,    93,    93,    94,    94,    95,    95,    96,    96,    97,
      97,    98,    98,    99,    99,   100,   100,   101,   102,   102,
     103,   103
};

/* YYR2[YYN] -- Number of symbols composing right hand side of rule YYN.  */
static const yytype_uint8 yyr2[] =
{
       0,     2,     5,     0,     1,     0,     1,     3,     0,     4,
       1,     2,     2,     2,     2,     2,     2,     0,     1,     0,
       3,     0,     7,     0,     5,     0,     1,     1,     1,     1,
       2,     4,     0,     2,     4,     0,     1,     1,     1,     1,
       1,     0,     3,     0,     1,     1,     0,     1,     5,     5,
       0,     1,     2,     1,     1,     1,     1,     0,     1,     3,
       1,     1,     3,     1,     1,    11,     0,     8,     8,     6,
       4,     1,     0,     1,     2,     1,     1,     1,     1,     1,
       1,     1,     2,     1,     1,     1,     1,     6,     5,     0,
       4,     2,     0,     7,     0,     2,     0,     1,     0,     1,
       1,     3,     0,     1,     0,     6,     0,     3,     1,     0,
       9,     0
};

/* YYDEFACT[STATE-NAME] -- Default rule to reduce with in state
   STATE-NUM when YYTABLE doesn't specify something else to do.  Zero
   means the default is an error.  */
static const yytype_uint8 yydefact[] =
{
       3,     5,     1,     4,     0,     6,     0,     8,     0,     0,
      19,     2,     7,    27,    32,    29,    28,    26,     0,     0,
       0,     0,     0,     0,     0,    21,    10,    19,    18,    46,
      40,    57,    19,    47,    19,    64,    19,    19,    19,     0,
      30,    72,     0,     0,     0,     0,    98,     0,     0,     0,
      11,    45,     0,    55,    56,    53,    54,     0,     0,    13,
      12,    16,    14,    15,    39,    38,     0,    71,     0,     0,
       0,    61,    85,    58,    60,     0,     0,     0,     0,    97,
     104,     0,     0,     9,    35,    51,    61,     0,     0,    52,
      32,     0,    35,    57,    63,     0,    77,    73,    75,    76,
      78,    79,    80,    81,     0,     0,     0,     0,   103,    96,
     109,     0,    20,     0,    37,    36,    25,    41,    50,    50,
      31,     0,     0,    62,    59,    74,     0,    84,     0,    92,
      66,     0,    39,    99,   100,     0,   102,   108,     0,     0,
      44,    43,    46,     0,    33,    49,    48,     0,    70,     0,
       0,     0,    92,    89,    69,     0,     0,     0,    95,   107,
     105,     0,     0,     0,    23,     0,    66,    66,     0,    91,
       0,     0,     0,    93,   102,    43,    34,    35,    22,    83,
       0,     0,    68,    67,    19,    19,    90,     0,   101,    42,
      25,    82,     0,     0,     0,   110,    24,    66,     0,     0,
      65,    87,    88
};

/* YYDEFGOTO[NTERM-NUM].  */
static const yytype_int16 yydefgoto[] =
{
      -1,     1,     4,     6,     8,     9,    11,    25,    26,    27,
      49,    28,   143,    29,    30,    40,   116,   117,    71,    31,
     162,   141,    52,    32,    33,    87,    57,    94,    72,    73,
      74,    95,    34,    35,    68,    69,   104,   181,   126,   127,
     152,   171,   130,   153,    36,   135,    80,   136,   158,   109,
      37,   111,   138,    38
};

/* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
   STATE-NUM.  */
#define YYPACT_NINF -161
static const yytype_int16 yypact[] =
{
    -161,    36,  -161,  -161,    11,  -161,    15,  -161,    30,    38,
     127,  -161,  -161,  -161,    48,  -161,  -161,  -161,    46,    51,
      53,    69,    30,    70,    73,    31,  -161,    74,  -161,    64,
    -161,   124,    74,  -161,    74,  -161,    74,    74,    74,     9,
    -161,   121,    86,    86,    81,    55,    54,    59,    91,   100,
    -161,  -161,   101,  -161,  -161,  -161,  -161,     2,   107,  -161,
    -161,  -161,  -161,  -161,  -161,  -161,   104,  -161,    86,   131,
      86,  -161,  -161,   120,  -161,    17,    17,   110,   145,  -161,
     138,   139,   133,  -161,    26,  -161,  -161,   140,   141,  -161,
      48,    17,    26,     6,  -161,    86,  -161,  -161,  -161,  -161,
    -161,  -161,  -161,  -161,     8,     8,   156,    86,  -161,    97,
     147,   163,  -161,   158,  -161,  -161,   164,   101,    43,    43,
    -161,     8,   159,  -161,  -161,  -161,   172,  -161,   174,   142,
      41,    17,   153,  -161,  -161,   176,   175,  -161,   178,   165,
    -161,   179,    64,   171,  -161,  -161,  -161,   177,  -161,    30,
      30,   181,   142,   154,  -161,     8,   180,    97,  -161,  -161,
    -161,   158,   190,   101,   121,     5,    41,    41,   155,  -161,
     157,   191,   196,  -161,   175,   179,  -161,    26,  -161,  -161,
     182,   198,  -161,  -161,   146,   146,  -161,   185,  -161,  -161,
     164,  -161,    30,   166,   167,  -161,  -161,    41,   186,   188,
    -161,  -161,  -161
};

/* YYPGOTO[NTERM-NUM].  */
static const yytype_int16 yypgoto[] =
{
    -161,  -161,  -161,  -161,  -161,  -161,   -22,  -160,    60,  -161,
    -161,    47,    22,   173,   -50,   123,   -88,  -161,   -38,    98,
      42,    57,    77,  -161,   -49,  -161,  -161,   189,   -54,   151,
     128,  -161,  -161,  -125,  -161,  -161,   -70,  -161,   -95,   -34,
    -161,  -161,  -161,    72,  -161,  -161,  -161,    65,    52,  -161,
    -161,  -161,  -161,  -161
};

/* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
   positive, shift that token.  If negative, reduce the rule which
   number is the opposite.  If zero, do what YYDEFACT says.
   If YYTABLE_NINF, syntax error.  */
#define YYTABLE_NINF -58
static const yytype_int16 yytable[] =
{
      45,    66,    84,    88,   122,   154,   105,    70,    75,    76,
     128,    64,   123,    70,    14,     5,    65,    64,    64,    86,
       7,   121,    65,    65,   193,   194,   147,    53,    54,    55,
      56,   179,    86,   113,    91,    96,     2,    10,   125,     3,
     114,   182,   183,   115,    12,    97,    98,    85,    99,   100,
     101,    41,    14,   102,   103,   134,    42,    86,    43,   133,
     172,   155,   -41,    39,   -41,   -41,   -41,   -41,    18,   145,
     146,    86,   200,   131,    44,    46,    19,    13,    47,    20,
      48,    21,   -17,    14,    15,    16,    17,    50,    51,   190,
      77,    70,    59,    78,    60,    64,    61,    62,    63,    79,
      65,    18,    70,   134,    81,    82,   132,   133,    83,    19,
      14,    65,    20,   177,    21,   180,   106,   -17,    22,    86,
      90,    23,    24,   -17,    13,   -57,    89,   166,   167,   -57,
      13,    15,    16,    17,   -57,   -17,    14,    15,    16,    17,
      92,    53,    54,    55,    56,    53,    54,    55,    56,    13,
     107,   108,   110,   112,    18,    14,    15,    16,    17,   -32,
     118,   119,    19,   129,   137,    20,   -32,    21,    39,   139,
     197,    22,   140,    18,    23,    24,   -17,   142,   149,   148,
     150,    19,   156,   151,    20,   160,    21,   159,   157,   -17,
      22,   164,   161,    23,    24,   168,   170,   165,   176,   186,
     173,   184,   187,   185,   192,   195,   201,   191,   202,   198,
     199,   178,   196,   120,    67,   144,     0,   189,   175,   163,
      58,    93,   174,   124,   169,     0,   188
};

static const yytype_int16 yycheck[] =
{
      22,    39,    52,    57,    92,   130,    76,     5,    42,    43,
     105,     9,     6,     5,     9,     4,    14,     9,     9,    57,
       5,    91,    14,    14,   184,   185,   121,    21,    22,    23,
      24,    26,    70,     7,    68,    18,     0,     7,    30,     3,
      14,   166,   167,    17,     6,    28,    29,    45,    31,    32,
      33,     5,     9,    36,    37,   109,     5,    95,     5,   109,
     155,   131,    19,    15,    21,    22,    23,    24,    27,   118,
     119,   109,   197,   107,     5,     5,    35,     3,     5,    38,
      49,    40,     8,     9,    10,    11,    12,    27,    24,   177,
       9,     5,    32,    38,    34,     9,    36,    37,    38,    45,
      14,    27,     5,   157,    45,    14,     9,   157,     8,    35,
       9,    14,    38,   163,    40,   165,     6,    43,    44,   157,
      16,    47,    48,    49,     3,     5,    19,   149,   150,     9,
       3,    10,    11,    12,    14,     8,     9,    10,    11,    12,
       9,    21,    22,    23,    24,    21,    22,    23,    24,     3,
       5,    13,    13,    20,    27,     9,    10,    11,    12,     6,
      20,    20,    35,     7,    17,    38,    13,    40,    15,     6,
     192,    44,    14,    27,    47,    48,    49,    13,     6,    20,
       6,    35,     6,    41,    38,    20,    40,     9,    13,    43,
      44,    20,    13,    47,    48,    14,    42,    20,     8,     8,
      20,    46,     6,    46,     6,    20,    20,    25,    20,    43,
      43,   164,   190,    90,    41,   117,    -1,   175,   161,   142,
      31,    70,   157,    95,   152,    -1,   174
};

/* YYSTOS[STATE-NUM] -- The (internal number of the) accessing
   symbol of state STATE-NUM.  */
static const yytype_uint8 yystos[] =
{
       0,    51,     0,     3,    52,     4,    53,     5,    54,    55,
       7,    56,     6,     3,     9,    10,    11,    12,    27,    35,
      38,    40,    44,    47,    48,    57,    58,    59,    61,    63,
      64,    69,    73,    74,    82,    83,    94,   100,   103,    15,
      65,     5,     5,     5,     5,    56,     5,     5,    49,    60,
      58,    24,    72,    21,    22,    23,    24,    76,    77,    58,
      58,    58,    58,    58,     9,    14,    68,    63,    84,    85,
       5,    68,    78,    79,    80,    89,    89,     9,    38,    45,
      96,    45,    14,     8,    64,    45,    68,    75,    78,    19,
      16,    89,     9,    79,    77,    81,    18,    28,    29,    31,
      32,    33,    36,    37,    86,    86,     6,     5,    13,    99,
      13,   101,    20,     7,    14,    17,    66,    67,    20,    20,
      65,    86,    66,     6,    80,    30,    88,    89,    88,     7,
      92,    89,     9,    64,    78,    95,    97,    17,   102,     6,
      14,    71,    13,    62,    69,    74,    74,    88,    20,     6,
       6,    41,    90,    93,    83,    86,     6,    13,    98,     9,
      20,    13,    70,    72,    20,    20,    56,    56,    14,    93,
      42,    91,    88,    20,    97,    71,     8,    64,    61,    26,
      64,    87,    83,    83,    46,    46,     8,     6,    98,    70,
      66,    25,     6,    57,    57,    20,    62,    56,    43,    43,
      83,    20,    20
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
#line 14 "sintactico.y"
    {printf("A -> A B C D E \n");;}
    break;

  case 3:

/* Line 1455 of yacc.c  */
#line 17 "sintactico.y"
    {printf("A -> epsilon \n");;}
    break;

  case 4:

/* Line 1455 of yacc.c  */
#line 20 "sintactico.y"
    {printf("B -> int \n");;}
    break;

  case 5:

/* Line 1455 of yacc.c  */
#line 20 "sintactico.y"
    {printf("B -> epsilon \n");;}
    break;

  case 6:

/* Line 1455 of yacc.c  */
#line 23 "sintactico.y"
    {printf("C -> main \n");;}
    break;

  case 7:

/* Line 1455 of yacc.c  */
#line 26 "sintactico.y"
    {printf("D -> ( F ) \n");;}
    break;

  case 8:

/* Line 1455 of yacc.c  */
#line 29 "sintactico.y"
    {printf("F -> epsilon\n");;}
    break;

  case 9:

/* Line 1455 of yacc.c  */
#line 32 "sintactico.y"
    {printf("E -> { GN AJ } \n");;}
    break;

  case 10:

/* Line 1455 of yacc.c  */
#line 35 "sintactico.y"
    {printf("GN -> G \n");;}
    break;

  case 11:

/* Line 1455 of yacc.c  */
#line 38 "sintactico.y"
    {printf("G -> AZ G \n");;}
    break;

  case 12:

/* Line 1455 of yacc.c  */
#line 38 "sintactico.y"
    {printf("G -> YF G \n");;}
    break;

  case 13:

/* Line 1455 of yacc.c  */
#line 38 "sintactico.y"
    {printf("G -> FI G \n");;}
    break;

  case 14:

/* Line 1455 of yacc.c  */
#line 38 "sintactico.y"
    {printf("G -> PR G \n");;}
    break;

  case 15:

/* Line 1455 of yacc.c  */
#line 38 "sintactico.y"
    {printf("G -> PL G \n");;}
    break;

  case 16:

/* Line 1455 of yacc.c  */
#line 38 "sintactico.y"
    {printf("G -> PQ G \n");;}
    break;

  case 17:

/* Line 1455 of yacc.c  */
#line 38 "sintactico.y"
    {printf("G -> epsilon \n");;}
    break;

  case 18:

/* Line 1455 of yacc.c  */
#line 41 "sintactico.y"
    {printf("AZ -> H \n");;}
    break;

  case 19:

/* Line 1455 of yacc.c  */
#line 41 "sintactico.y"
    {printf("AZ -> epsilon \n");;}
    break;

  case 20:

/* Line 1455 of yacc.c  */
#line 44 "sintactico.y"
    {printf("AJ -> return nint ; \n");;}
    break;

  case 21:

/* Line 1455 of yacc.c  */
#line 44 "sintactico.y"
    {printf("AJ -> epsilon \n");;}
    break;

  case 22:

/* Line 1455 of yacc.c  */
#line 47 "sintactico.y"
    {printf("H -> J Q K M L ; H \n");;}
    break;

  case 23:

/* Line 1455 of yacc.c  */
#line 47 "sintactico.y"
    {printf("H -> epsilon \n");;}
    break;

  case 24:

/* Line 1455 of yacc.c  */
#line 50 "sintactico.y"
    {printf("L -> , Q K M L \n");;}
    break;

  case 25:

/* Line 1455 of yacc.c  */
#line 50 "sintactico.y"
    {printf("L -> epsilon \n");;}
    break;

  case 26:

/* Line 1455 of yacc.c  */
#line 53 "sintactico.y"
    {printf("J -> float \n");;}
    break;

  case 27:

/* Line 1455 of yacc.c  */
#line 53 "sintactico.y"
    {printf("J -> int \n");;}
    break;

  case 28:

/* Line 1455 of yacc.c  */
#line 53 "sintactico.y"
    {printf("J -> bool \n");;}
    break;

  case 29:

/* Line 1455 of yacc.c  */
#line 53 "sintactico.y"
    {printf("J -> char");;}
    break;

  case 30:

/* Line 1455 of yacc.c  */
#line 56 "sintactico.y"
    {printf("K -> id AL \n");;}
    break;

  case 31:

/* Line 1455 of yacc.c  */
#line 59 "sintactico.y"
    {printf("AL -> [ NN ] \n");;}
    break;

  case 32:

/* Line 1455 of yacc.c  */
#line 59 "sintactico.y"
    {printf("AL -> epsilon \n");;}
    break;

  case 33:

/* Line 1455 of yacc.c  */
#line 62 "sintactico.y"
    {printf("M -> N R \n");;}
    break;

  case 34:

/* Line 1455 of yacc.c  */
#line 62 "sintactico.y"
    {printf("M -> { DD P } \n");;}
    break;

  case 35:

/* Line 1455 of yacc.c  */
#line 62 "sintactico.y"
    {printf("M -> epsilon \n");;}
    break;

  case 36:

/* Line 1455 of yacc.c  */
#line 65 "sintactico.y"
    {printf("N -> & \n");;}
    break;

  case 37:

/* Line 1455 of yacc.c  */
#line 65 "sintactico.y"
    {printf("N -> nint \n");;}
    break;

  case 38:

/* Line 1455 of yacc.c  */
#line 68 "sintactico.y"
    {printf("NN -> nint \n");;}
    break;

  case 39:

/* Line 1455 of yacc.c  */
#line 68 "sintactico.y"
    {printf("NN -> id \n");;}
    break;

  case 40:

/* Line 1455 of yacc.c  */
#line 71 "sintactico.y"
    {printf("R -> K \n");;}
    break;

  case 41:

/* Line 1455 of yacc.c  */
#line 71 "sintactico.y"
    {printf("R -> epsilon \n");;}
    break;

  case 42:

/* Line 1455 of yacc.c  */
#line 74 "sintactico.y"
    {printf("P -> , DD P \n");;}
    break;

  case 43:

/* Line 1455 of yacc.c  */
#line 74 "sintactico.y"
    {printf("P -> epsilon \n");;}
    break;

  case 44:

/* Line 1455 of yacc.c  */
#line 77 "sintactico.y"
    {printf("DD -> nint");;}
    break;

  case 45:

/* Line 1455 of yacc.c  */
#line 80 "sintactico.y"
    {printf("Q -> * \n");;}
    break;

  case 46:

/* Line 1455 of yacc.c  */
#line 80 "sintactico.y"
    {printf("Q -> epsilon \n");;}
    break;

  case 47:

/* Line 1455 of yacc.c  */
#line 83 "sintactico.y"
    {printf("FI -> I \n");;}
    break;

  case 48:

/* Line 1455 of yacc.c  */
#line 86 "sintactico.y"
    {printf("I -> R S SIG ; I \n");;}
    break;

  case 49:

/* Line 1455 of yacc.c  */
#line 86 "sintactico.y"
    {printf("I -> R S IDX ; I \n");;}
    break;

  case 50:

/* Line 1455 of yacc.c  */
#line 86 "sintactico.y"
    {printf("I -> epsilon \n");;}
    break;

  case 51:

/* Line 1455 of yacc.c  */
#line 92 "sintactico.y"
    {printf("IDX -> String \n");;}
    break;

  case 52:

/* Line 1455 of yacc.c  */
#line 95 "sintactico.y"
    {printf("S -> U = \n");;}
    break;

  case 53:

/* Line 1455 of yacc.c  */
#line 100 "sintactico.y"
    {printf("U -> / \n");;}
    break;

  case 54:

/* Line 1455 of yacc.c  */
#line 100 "sintactico.y"
    {printf("U -> * \n");;}
    break;

  case 55:

/* Line 1455 of yacc.c  */
#line 100 "sintactico.y"
    {printf("U -> + \n");;}
    break;

  case 56:

/* Line 1455 of yacc.c  */
#line 100 "sintactico.y"
    {printf("U -> - \n");;}
    break;

  case 57:

/* Line 1455 of yacc.c  */
#line 100 "sintactico.y"
    {printf("U -> epsilon \n");;}
    break;

  case 58:

/* Line 1455 of yacc.c  */
#line 103 "sintactico.y"
    {printf("SIG -> T \n");;}
    break;

  case 59:

/* Line 1455 of yacc.c  */
#line 106 "sintactico.y"
    {printf("T -> T V W\n");;}
    break;

  case 60:

/* Line 1455 of yacc.c  */
#line 106 "sintactico.y"
    {printf(" T -> W \n");;}
    break;

  case 61:

/* Line 1455 of yacc.c  */
#line 109 "sintactico.y"
    {printf("W -> NN \n");;}
    break;

  case 62:

/* Line 1455 of yacc.c  */
#line 109 "sintactico.y"
    {printf("W -> ( T ) \n");;}
    break;

  case 63:

/* Line 1455 of yacc.c  */
#line 112 "sintactico.y"
    {printf("V -> U \n");;}
    break;

  case 64:

/* Line 1455 of yacc.c  */
#line 115 "sintactico.y"
    {printf("YF -> Y \n");;}
    break;

  case 65:

/* Line 1455 of yacc.c  */
#line 118 "sintactico.y"
    {printf("Y -> for ( X AD AB AE ; AA ) E Y \n");;}
    break;

  case 66:

/* Line 1455 of yacc.c  */
#line 118 "sintactico.y"
    {printf("Y -> epsilon \n");;}
    break;

  case 67:

/* Line 1455 of yacc.c  */
#line 118 "sintactico.y"
    {printf("Y -> while ( AD AB AE ) E Y \n");;}
    break;

  case 68:

/* Line 1455 of yacc.c  */
#line 118 "sintactico.y"
    {printf("Y -> if ( AD AB AE ) E Y \n");;}
    break;

  case 69:

/* Line 1455 of yacc.c  */
#line 118 "sintactico.y"
    {printf("switch ( id ) AF Y \n");;}
    break;

  case 70:

/* Line 1455 of yacc.c  */
#line 121 "sintactico.y"
    {printf("X -> BB id M ; \n");;}
    break;

  case 71:

/* Line 1455 of yacc.c  */
#line 124 "sintactico.y"
    {printf("BB -> J \n");;}
    break;

  case 72:

/* Line 1455 of yacc.c  */
#line 124 "sintactico.y"
    {printf("BB -> epsilon \n");;}
    break;

  case 73:

/* Line 1455 of yacc.c  */
#line 127 "sintactico.y"
    {printf("AB -> < \n");;}
    break;

  case 74:

/* Line 1455 of yacc.c  */
#line 127 "sintactico.y"
    {printf("AB -> <= \n");;}
    break;

  case 75:

/* Line 1455 of yacc.c  */
#line 127 "sintactico.y"
    {printf("AB -> > \n");;}
    break;

  case 76:

/* Line 1455 of yacc.c  */
#line 127 "sintactico.y"
    {printf("AB -> >= \n");;}
    break;

  case 77:

/* Line 1455 of yacc.c  */
#line 127 "sintactico.y"
    {printf("AB -> ! \n");;}
    break;

  case 78:

/* Line 1455 of yacc.c  */
#line 127 "sintactico.y"
    {printf("AB -> != \n");;}
    break;

  case 79:

/* Line 1455 of yacc.c  */
#line 127 "sintactico.y"
    {printf("AB -> == \n");;}
    break;

  case 80:

/* Line 1455 of yacc.c  */
#line 127 "sintactico.y"
    {printf("AB -> && \n");;}
    break;

  case 81:

/* Line 1455 of yacc.c  */
#line 127 "sintactico.y"
    {printf("Ab - > || \n");;}
    break;

  case 82:

/* Line 1455 of yacc.c  */
#line 130 "sintactico.y"
    {printf("AA -> ++ \n");;}
    break;

  case 83:

/* Line 1455 of yacc.c  */
#line 130 "sintactico.y"
    {printf("AA -> -- \n");;}
    break;

  case 84:

/* Line 1455 of yacc.c  */
#line 136 "sintactico.y"
    {printf("AE -> AD \n");;}
    break;

  case 85:

/* Line 1455 of yacc.c  */
#line 139 "sintactico.y"
    {printf("AD -> SIG \n");;}
    break;

  case 86:

/* Line 1455 of yacc.c  */
#line 139 "sintactico.y"
    {printf("AD -> NN \n");;}
    break;

  case 87:

/* Line 1455 of yacc.c  */
#line 142 "sintactico.y"
    {printf("AI -> case nint : GN break ; \n");;}
    break;

  case 88:

/* Line 1455 of yacc.c  */
#line 145 "sintactico.y"
    {printf("AH -> default : GN break ; \n");;}
    break;

  case 89:

/* Line 1455 of yacc.c  */
#line 145 "sintactico.y"
    {printf("AH -> epsilon \n");;}
    break;

  case 90:

/* Line 1455 of yacc.c  */
#line 148 "sintactico.y"
    {printf("AF -> { AG AH } \n");;}
    break;

  case 91:

/* Line 1455 of yacc.c  */
#line 151 "sintactico.y"
    {printf("AG -> AI AG \n");;}
    break;

  case 92:

/* Line 1455 of yacc.c  */
#line 151 "sintactico.y"
    {printf("AG -> epsilon \n");;}
    break;

  case 93:

/* Line 1455 of yacc.c  */
#line 154 "sintactico.y"
    {printf("PQ -> printf ( BA CO JJ ) \n");;}
    break;

  case 94:

/* Line 1455 of yacc.c  */
#line 154 "sintactico.y"
    {printf("PQ -> epsilon \n");;}
    break;

  case 95:

/* Line 1455 of yacc.c  */
#line 157 "sintactico.y"
    {printf("JJ -> JP NXT \n");;}
    break;

  case 97:

/* Line 1455 of yacc.c  */
#line 160 "sintactico.y"
    {printf("BA -> string \n");;}
    break;

  case 98:

/* Line 1455 of yacc.c  */
#line 160 "sintactico.y"
    {printf("BA -> epsilon \n");;}
    break;

  case 99:

/* Line 1455 of yacc.c  */
#line 163 "sintactico.y"
    {printf("JP -> K \n");;}
    break;

  case 100:

/* Line 1455 of yacc.c  */
#line 163 "sintactico.y"
    {printf("JP -> SIG \n");;}
    break;

  case 101:

/* Line 1455 of yacc.c  */
#line 166 "sintactico.y"
    {printf("NXT -> , JP NXT \n");;}
    break;

  case 102:

/* Line 1455 of yacc.c  */
#line 166 "sintactico.y"
    {printf("NXT -> epsilon \n");;}
    break;

  case 103:

/* Line 1455 of yacc.c  */
#line 169 "sintactico.y"
    {printf("CO -> , \n");;}
    break;

  case 104:

/* Line 1455 of yacc.c  */
#line 169 "sintactico.y"
    {printf("epsilon \n");;}
    break;

  case 105:

/* Line 1455 of yacc.c  */
#line 173 "sintactico.y"
    {printf("PR -> scanf ( String KR ) ; \n");;}
    break;

  case 106:

/* Line 1455 of yacc.c  */
#line 173 "sintactico.y"
    {printf("epsilon \n");;}
    break;

  case 107:

/* Line 1455 of yacc.c  */
#line 176 "sintactico.y"
    {printf("KR -> , AM id \n");;}
    break;

  case 108:

/* Line 1455 of yacc.c  */
#line 179 "sintactico.y"
    {printf("AM -> & \n");;}
    break;

  case 109:

/* Line 1455 of yacc.c  */
#line 179 "sintactico.y"
    {printf("AM -> epsilon \n");;}
    break;

  case 110:

/* Line 1455 of yacc.c  */
#line 182 "sintactico.y"
    {printf("PL -> do E while ( AD AB AE ) ; \n");;}
    break;

  case 111:

/* Line 1455 of yacc.c  */
#line 182 "sintactico.y"
    {printf("PL -> epsilon \n");;}
    break;



/* Line 1455 of yacc.c  */
#line 2319 "sintactico.tab.c"
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
#line 185 "sintactico.y"

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
