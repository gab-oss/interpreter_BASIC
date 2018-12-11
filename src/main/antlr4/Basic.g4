grammar Basic;

program               : predefined* BEGIN NL instructions* END NL instructions* ;

predefined            : stringFunction | intFunction | procedure ;

intFunction           : INT_FUN call NL
                        instructions
                        RETURN (intArg | call) NL;

stringFunction        : STRING_FUN call NL
                        instructions
                        RETURN (stringArg | call) NL ;

procedure             : SUB call NL
                        instructions
                        RETURN NL ;

for                   : FOR intAssignment TO intArg NL
                        instructions
                        NEXT ID NL ;

if                    : IF condition THEN NL
                        instructions
                        ((ELSIF condition THEN NL
                        instructions+)*
                        ELSE NL
                        instructions+)?
                        ENDIF NL ;

instructions          : (label? instruction NL)+ ;

instruction           : intDefinition | stringDeclaration | intAssignment | stringAssignment | input | print
                      | read | goto | gosub | call | if | for ;

condition             : comp (LOG_OPERATOR comp)* ;

comp                  : term (COMP_OPERATOR term)* ;

artmExpr              : additiveExpr (ADD_OPERATOR additiveExpr)* ;

additiveExpr          : multExpression (MULTI_OPERATOR multExpression)* ;

multExpression        : term ;

term                  : NUMBER | ID | call | ( LEFT_PARENTHESES artmExpr RIGHT_PARENTHESES ) ;

intDefinition         : LET intAssignment (COMMA intAssignment)* ;

stringDeclaration     : DIM STRING_ID LEFT_PARENTHESES (intArg | call)  RIGHT_PARENTHESES ;

intAssignment         : ID ASSIGN (intArg | call) ;

stringAssignment      : STRING_ID ASSIGN (stringArg | call) ;

len                   : LEN LEFT_PARENTHESES (stringArg | call) RIGHT_PARENTHESES ;

input                 : INPUT ID (COMMA ID)* ;

print                 : PRINT arg (SEMICOLON arg)* SEMICOLON? ;

read                  : READ ID (COMMA ID)* ;

goto                  : GOTO ID ;

gosub                 : GOSUB ID ;

label                 : ID NUMBER_SIGN ;

call                  : ID callArgs ;

callArgs              : LEFT_BRACKET ((arg COMMA)* arg)? RIGHT_BRACKET ;

arg                   : intArg | stringArg | call;

intArg                : NUMBER | ID | artmExpr | len;

stringArg             : STRING | STRING_ID | substring ;

substring             : STRING_ID LEFT_PARENTHESES (ID | NUMBER) RIGHT_PARENTHESES ;

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

COMP_OPERATOR         : '==' | '<=' | '>='  | '<' | '>' ;

ADD_OPERATOR          : '+' | MINUS ;

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

NUMBER                : MINUS? DIGIT+ ;

fragment DIGIT        : [0-9] ;

fragment LETTER       : [A-Za-z] ;

NL                    : ('\r'? '\n' | '\r' | ':')+ ;

WH                    : (' ' | '\t') -> skip ;