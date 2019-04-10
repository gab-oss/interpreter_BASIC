grammar Basic;

program               : predefined* BEGIN NL instructions* END NL (instructions procReturn)* ;

predefined            : stringFunction | intFunction | procedure ;

intFunction           : INT_FUN funSignature NL
                        instructions
                        intReturn NL;

stringFunction        : STRING_FUN funSignature NL
                        instructions
                        stringReturn NL ;

procedure             : SUB funSignature NL
                        instructions
                        procReturn ;

r_for                 : FOR intAssignment TO artmExpr NL
                        instructions
                        NEXT ID ;

r_if                  : IF condition THEN NL
                        instructions
                        ((ELSIF condition THEN NL
                        instructions+)*
                        ELSE NL
                        instructions+)?
                        ENDIF ;

procReturn            : RETURN NL ;

intReturn             : RETURN artmExpr ;

stringReturn          : RETURN (stringArg | funSignature) ;

instructions          : (label? instruction NL)+ ;

instruction           : intDefinition | stringDeclaration | intAssignment | stringAssignment | input | print
                      | read | r_goto | gosub | funSignature | r_if | r_for | procReturn | intReturn | stringReturn;

condition             : comp (LOG_OPERATOR comp)* ;

comp                  : logTerm (COMP_OPERATOR logTerm)* ;

logTerm               : artmExpr | ( LEFT_PARENTHESES condition RIGHT_PARENTHESES ) ;

artmExpr              : additiveExpr ((PLUS | MINUS) additiveExpr)* ;

additiveExpr          : multExpression (MULTI_OPERATOR multExpression)* ;

multExpression        : MINUS? term ;

term                  : NUMBER | ID | funSignature | len | ( LEFT_PARENTHESES artmExpr RIGHT_PARENTHESES ) ;

intDefinition         : LET intAssignment (COMMA intAssignment)* ;

stringDeclaration     : DIM substringOrDecl (COMMA substringOrDecl)* ;

intAssignment         : ID ASSIGN artmExpr;

stringAssignment      : (STRING_ID | substringOrDecl) ASSIGN (stringArg | funSignature) ;

len                   : LEN  LEFT_PARENTHESES (stringArg | funSignature) RIGHT_PARENTHESES;

input                 : INPUT ID (COMMA ID)* ;

print                 : PRINT arg (SEMICOLON arg)* SEMICOLON? ;

read                  : READ STRING_ID (COMMA STRING_ID)* ;

r_goto                : GOTO ID ;

gosub                 : GOSUB ID ;

label                 : ID NUMBER_SIGN ;

funSignature          : ID callArgs ;

callArgs              : LEFT_BRACKET ((arg COMMA)* arg)? RIGHT_BRACKET ;

callArg               : LEFT_PARENTHESES artmExpr RIGHT_PARENTHESES ;

arg                   : artmExpr | stringArg;

stringArg             : STRING | STRING_ID | substringOrDecl ;

substringOrDecl       : STRING_ID callArg ;

BEGIN                 : 'BEGIN' ;

END                   : 'END' ;

INT_FUN               : 'FUNCTION' ;

STRING_FUN            : 'FUNCTION$' ;

RETURN                : 'RETURN' ;

SUB                   : 'SUB' ;

FOR                   : 'FOR' ;

NEXT                  : 'NEXT' ;

TO                    : 'TO' ;

IF                    : 'IF' ;

THEN                  : 'THEN' ;

ELSIF                 : 'ELSIF' ;

ELSE                  : 'ELSE' ;

ENDIF                 : 'ENDIF' ;

LET                   : 'LET' ;

DIM                   : 'DIM' ;

READ                  : 'READ'  ;

PRINT                 : 'PRINT' | '?' ;

INPUT                 : 'INPUT' ;

LEN                   : 'LEN' ;

GOTO                  : 'GOTO' ;

GOSUB                 : 'GOSUB' ;

LOG_OPERATOR          : 'AND' | 'OR' ;

COMP_OPERATOR         : '<' | '>' | '<>' | '==' | '<=' | '>='  ;

PLUS                  : '+' ;

//ADD_OPERATOR        : '+' | MINUS ;

MINUS                 : '-' ;

MULTI_OPERATOR        : '*' | '/' ;

ASSIGN                : '=' ;

SEMICOLON             : ';' ;

NUMBER_SIGN           : '#' ;

DOLLAR                : '$';

LEFT_PARENTHESES      : '(' ;

RIGHT_PARENTHESES     : ')' ;

COMMA                 : ',' ;

LEFT_BRACKET          : '[' ;

RIGHT_BRACKET         : ']' ;

STRING                : '"'  ~('"')* '"' ;

STRING_ID             : ID DOLLAR ;

ID                    : LETTER (LETTER | DIGIT | '_')* ;

NUMBER                : DIGIT+ ;

fragment DIGIT        : [0-9] ;

fragment LETTER       : [A-Za-z] ;

NL                    : ('\r'? '\n' | '\r' | ':')+ ;

WH                    : (' ' | '\t') -> skip ;

COMMENT               : ('REM' ~( '\n' | '\r' | ':')* NL ) -> skip ;