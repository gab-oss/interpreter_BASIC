grammar Basic;

program               : (stringFunction | intFunction | procedure)* BEGIN NL r_instructions END NL ;

intFunction           : INT_FUN ID LEFT_BRACKET ((ID | STRING_ID) (COMMA (ID | STRING_ID))*)? RIGHT_BRACKET NL
                        r_instructions
                        intReturn NL;

stringFunction        : STRING_FUN ID LEFT_BRACKET ((ID | STRING_ID) (COMMA (ID | STRING_ID))*)? RIGHT_BRACKET NL
                        r_instructions
                        stringReturn NL ;

procedure             : SUB ID LEFT_BRACKET ((ID | STRING_ID) (COMMA (ID | STRING_ID))*)? RIGHT_BRACKET NL
                        r_instructions
                        RETURN NL ;

r_for                 : FOR intAssignment TO artmExpr NL
                        r_instructions
                        NEXT ID ;

r_if                  : IF condition THEN NL
                        r_instructions
                        ((ELSIF condition THEN NL
                        r_instructions)*
                        ELSE NL
                        r_instructions)?
                        ENDIF ;

intReturn             : RETURN artmExpr ;

stringReturn          : RETURN (stringArg | funCall) ;

r_instructions          : (r_instruction NL)+ ;

r_instruction           : intDefinition | stringDeclaration | intAssignment | stringAssignment | input | print
                      | read | funCall | r_if | r_for ;

condition             : comp (LOG_OPERATOR comp)* ;

comp                  : logTerm (COMP_OPERATOR logTerm)* ;

logTerm               : artmExpr | ( LEFT_PARENTHESES condition RIGHT_PARENTHESES ) ;

artmExpr              : additiveExpr ((PLUS | MINUS) additiveExpr)* ;

additiveExpr          : multExpression (MULTI_OPERATOR multExpression)* ;

multExpression        : MINUS? term ;

term                  : NUMBER | ID | funCall | len | ( LEFT_PARENTHESES artmExpr RIGHT_PARENTHESES ) ;

intDefinition         : LET intAssignment (COMMA intAssignment)* ;

stringDeclaration     : DIM STRING_ID LEFT_PARENTHESES artmExpr RIGHT_PARENTHESES (COMMA STRING_ID LEFT_PARENTHESES artmExpr RIGHT_PARENTHESES)* ;

intAssignment         : ID ASSIGN artmExpr;

stringAssignment      : (STRING_ID | substring) ASSIGN (stringArg | funCall) ;

len                   : LEN  LEFT_PARENTHESES (stringArg | funCall) RIGHT_PARENTHESES;

input                 : INPUT ID (COMMA ID)* ;

print                 : PRINT arg (SEMICOLON arg)* SEMICOLON? ;

read                  : READ STRING_ID (COMMA STRING_ID)* ;

//r_goto                : GOTO ID ;
//
//gosub                 : GOSUB ID ;
//
//label                 : ID NUMBER_SIGN ;

funCall               : ID LEFT_BRACKET ((arg COMMA)* arg)? RIGHT_BRACKET ;

arg                   : artmExpr | stringArg;

stringArg             : STRING | STRING_ID | substring ;

substring             : STRING_ID LEFT_PARENTHESES artmExpr RIGHT_PARENTHESES ;

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