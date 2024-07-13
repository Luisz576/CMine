lexer grammar CMineLang;

/// TOKENS ///
T_CODE_S: 'IFSULDEMINAS' ;
T_CODE_E: 'MUZ' ;

T_CV_TYPE: 'coin'
    | 'money'
    | 'text'
    | 'completed'
    | 'list'
    ;

T_OP_UN: '++' | '--' ;

T_OP_MATH: '+' | '-' | '*' | '/' | '%' | '^' ;

T_OP_REL: '<' | '>' | '<=' | '>=' | '==' | '!=' ;

T_OP_ATR: '=' ;

T_OP_LOG: '&&' | '||' ;

T_OP_NOT: '!' ;

T_COND_IF: 'check' ;

T_COND_ELSE: 'checked' ;

T_REP_FOR: 'task' ;

T_REP_WHILE: 'journey' ;

T_REP_CONT: 'respawn' ;

T_REP_BREAK: 'quit' ;

T_EX_TRY: 'play' ;

T_EX_CATCH: 'crash' ;

T_FUNC_DEF: 'quest' ;

T_FUNC_RET: 'loot' ;

T_SYS_VAR: 'DELTA' | 'PATH' | 'VERSION' | 'APP_NAME' ;

T_SYS_FUNC: 'SHOW_SCREEN' | 'KILL_APP' ;

T_END_C: ';' ;

T_COMMA: ',' ;

T_DOT: '.' ;

T_PAR_OPEN: '(' ;

T_PAR_CLOSE: ')' ;

T_BRAC_OPEN: '{' ;

T_BRAC_CLOSE: '}' ;

T_VAL_BOOL: True | False;

T_ID_VAR: BaseIdentifier ;

T_ID_CONST: '#' BaseIdentifier ;

T_ID_FUNC: '$' BaseIdentifier ;

T_VAL_INT: DigitSequence ;

T_VAL_DOUBLE: DigitSequence ('.' DigitSequence?) ;

T_VAL_STRING: '"' StringCharacters? '"';

/// Fragments ///
fragment BaseIdentifier: Identifiernondigit (Identifiernondigit | Digit)* ;
fragment Identifiernondigit: NonDigit;

fragment True: 'true' ;
fragment False: 'false' ;
fragment NonDigit: [a-zA-Z_];
fragment Digit: [0-9]+ ;
fragment DigitSequence: Digit (Digit)* ;

fragment StringCharacters: StringCharacter+;
fragment StringCharacter: ~["\\\r\n] | EscapeSequence;

fragment EscapeSequence:
    '\\' 'u005c'? [btnfr"'\\]
    | OctalEscape
    | UnicodeEscape
;

fragment OctalEscape:
    '\\' 'u005c'? OctalDigit
    | '\\' 'u005c'? OctalDigit OctalDigit
    | '\\' 'u005c'? ZeroToThree OctalDigit OctalDigit
;

fragment UnicodeEscape: '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit;

fragment OctalDigit: [0-7] ;
fragment ZeroToThree: [0-3] ;
fragment HexDigit: [0-9a-fA-F] ;

/// NON TOKENS ///
NEW_LINE: [\r\n]+ -> skip ;

SPACES: [ \t] -> skip ;

T_COMMENT: '//' ~ [\r\n]* -> skip ;
