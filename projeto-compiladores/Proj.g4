grammar Proj;

prog:
    'program'
        codeBlock
    'end'
;

codeBlock:
    (command)+
;

command:
    read | write | attribute | if | ifElse
;

read:
    'read' OpenParentheses Identifier CloseParentheses Semicolon
;

write:
    'write' OpenParentheses Identifier CloseParentheses Semicolon
;

attribute:
    'attribute' Identifier Attribute expression Semicolon
;

expression:
    termo ( Operation termo )*
;

termo:
    Identifier | Integer | Float | string
;

OpenParentheses: '(' ;
CloseParentheses: ')' ;
OpenBraces: '{';
CloseBraces: '}';
Semicolon: ';' ;
WriteSpace: (' ' | '\t' | '\n' | '\r') -> skip;

Operation: '+' | '-' | '*' | '/' | '%';
Attribute: '=';

Identifier: [a-z] ( [a-z] | [A-Z] | [0 - 9] )*;

//Possuir 2 tipos de variáveis (pelo menos 1 deles String)
Integer: [0-9];
Float: [0-9]+ ( '.' [0-9]+ );
string: ( Char )+ ;
Char: ( '\'' | '"' ) ( [a-z] | [A-Z] ) ( '\'' | '"' );

//Possuir a instrução if-else
If: 'if' | 'IF';
Else: 'else' | 'ELSE';

if:
    If OpenParentheses expression CloseParentheses OpenBraces
        codeBlock
    CloseBraces
;
ifElse:
    if
    Else OpenBraces
        codeBlock
    CloseBraces
;
elseIf:
    if
    (Else if)+
;