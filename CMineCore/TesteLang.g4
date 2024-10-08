grammar TesteLang;

/// EXPRESSIONS ///
program: T_CODE_S prog T_CODE_E ;

prog: (expr)* ;

// EXPRESSÕES MÍNIMAS (ou seja, se não estar aqui, não pode ter comparação solta sem ';' por exemplo)
expr: (exp_assign T_END_C)
    | (exp_value T_END_C)
    | (exp_arith T_END_C)
    | (exp_return T_END_C)
    | (exp_loop)
    | (exp_cond)
    | (exp_try)
    | (exp_func) ;

exp_try: T_EX_TRY T_BRAC_OPEN (expr)* T_BRAC_CLOSE T_EX_CATCH T_PAR_OPEN exp_req_params T_PAR_CLOSE T_BRAC_OPEN (expr)* T_BRAC_CLOSE ;

exp_req_params: exp_req_param (T_COMMA exp_req_param)* ;
exp_req_param: T_CV_TYPE T_ID_VAR ;

exp_params: exp_param (T_COMMA exp_param)* ;
exp_param: exp_value ;

exp_return: T_FUNC_RET exp_value? ;

exp_func: exp_def_func T_BRAC_OPEN (expr)* T_BRAC_CLOSE ;
exp_def_func: T_FUNC_DEF T_ID_FUNC T_PAR_OPEN exp_req_params? T_PAR_CLOSE ;

exp_func_called: (T_ID_FUNC T_PAR_OPEN exp_params? T_PAR_CLOSE)
                    | (T_SYS_FUNC T_PAR_OPEN exp_params? T_PAR_CLOSE) ;

exp_stored_value: T_ID_VAR
                    | T_ID_CONST
                    | exp_unary ;

exp_cond: exp_cond_assign T_BRAC_OPEN (expr)* T_BRAC_CLOSE (T_COND_ELSE T_BRAC_OPEN (expr)* T_BRAC_CLOSE)? ;
exp_cond_assign: (T_COND_IF T_PAR_OPEN exp_boolean T_PAR_CLOSE) ;

exp_unary: (T_ID_VAR T_OP_UN)
            | (T_OP_UN T_ID_VAR) ;

exp_loop: exp_loop_assign T_BRAC_OPEN (expr)* T_BRAC_CLOSE;
exp_loop_assign: T_REP_FOR T_PAR_OPEN exp_assign? T_END_C exp_boolean T_END_C exp_assign? T_PAR_CLOSE
                | T_REP_WHILE T_PAR_OPEN exp_boolean T_PAR_CLOSE ;

exp_number: T_VAL_INT | T_VAL_DOUBLE ;

exp_arith_paren: T_PAR_OPEN exp_arith T_PAR_CLOSE ;

exp_arith: exp_arith_paren
           | exp_number
           | (exp_arith_paren T_OP_MATH exp_arith_paren)
           | (exp_arith_paren T_OP_MATH exp_arith)
           | (exp_number T_OP_MATH exp_number)
           | (exp_stored_value T_OP_MATH exp_number)
           | (exp_stored_value T_OP_MATH exp_stored_value)
           | (exp_number T_OP_MATH exp_stored_value) ;

exp_boolean: T_VAL_BOOL
             | (exp_comparable T_OP_REL exp_comparable)
             | exp_boolean_compared
             | (T_OP_NOT exp_boolean) ;
exp_boolean_compared: (exp_comparable T_OP_REL exp_comparable) ;

exp_comparable: exp_stored_value
                | T_VAL_BOOL
                | T_SYS_VAR
                | exp_number
                | exp_stored_value
                | (T_PAR_OPEN  exp_arith T_PAR_CLOSE)
                | (T_PAR_OPEN exp_boolean T_PAR_CLOSE) ;

exp_value: exp_func_called
            | exp_stored_value
            | exp_boolean
            | exp_arith
            | T_VAL_STRING ;

exp_assign: (T_CV_TYPE? exp_stored_value T_OP_ATR exp_value)
           | exp_unary ;

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
