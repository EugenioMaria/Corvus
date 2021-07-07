grammar Proj;

prog : 'program' OpenBraces codeBlock CloseBraces 'end'
;

codeBlock :
    (command)+
;

command:
    read | write | attribute | ifCMD | ifElseCMD | elseIfCMD
;

read:
    'read' OpenParentheses termo CloseParentheses Semicolon
;

write:
    'write' OpenParentheses termo CloseParentheses Semicolon
;

attribute:
    Identifier Attribute expression Semicolon
;

expression:
    termo ( Operation termo )*
;

boolExpression:
    termo (LogicalOperator termo)*
;

termo:
    Identifier | Integer | Float | string
;


OpenParentheses: '(' ;
CloseParentheses: ')' ;
OpenBraces: '{';
CloseBraces: '}';
Semicolon: ';' ;
WhiteSpace: (' ' | '\t' | '\n' | '\r') -> skip;

Operation: '+' | '-' | '*' | '/' | '%';
LogicalOperator: '||' | '&&' | '!=' | '!' |'==' ;
Attribute: '=';

Identifier: [a-z] ( [a-z] | [A-Z] | [0 - 9] )*?;

//Possuir 2 tipos de variáveis (pelo menos 1 deles String)
Integer: [0-9];
Float: [0-9]+ ( '.' [0-9]+ )?;
string: ( '\'' | '"' ) (Char)+? ( '\'' | '"' ) ;
Char: ( [a-z] | [A-Z] | [0-9]) ;

//Possuir a instrução if-else
IfSintax: 'if' | 'IF';
ElseSintax: 'else' | 'ELSE';

ifCMD:
    IfSintax OpenParentheses boolExpression CloseParentheses OpenBraces codeBlock CloseBraces
;
ifElseCMD:
    ifCMD ElseSintax OpenBraces codeBlock CloseBraces
;
elseIfCMD:
    ifCMD (ElseSintax ifCMD)+
;
