grammar Proj;

@header{
    import corvusDataStructures.corvusSymbol;
    import corvusDataStructures.corvusVariable;
    import corvusDataStructures.corvusSymbolTable;
    import corvusExceptions.corvusSemanticException;
}

@members{
    private int _varType;
    private String _varName;
    private String _varValue;
    private corvusSymbolTable symbolTable = new corvusSymbolTable();
    private corvusSymbol symbol;
}

prog :
    'program' OpenBraces decl codeBlock CloseBraces 'end'
;

decl :
    (varDeclaration)+
;

varDeclaration :
    type Identifier {
                        _varName = _input.LT(-1).getText();
                        _varValue = null;
                        symbol = new corvusVariable(_varName,_varValue,_varType);
                        symbolTable.add(symbol);
                    } (Colon Identifier
                    {
                        _varName = _input.LT(-1).getText();
                        _varValue = null;
                        symbol = new corvusVariable(_varName,_varValue,_varType);
                        symbolTable.add(symbol);
                    }
                    )* Semicolon
;

type :
    'int'   { _varType = corvusVariable.intVar; }
    | 'float' { _varType = corvusVariable.floatVar; }
    | 'string' { _varType = corvusVariable.stringVar; }
    | 'list' { _varType = corvusVariable.listVar; }
    | 'obj' { _varType = corvusVariable.objVar; }
;
codeBlock :
    (command)*
;

command:
    read | write | attribute | ifCMD | ifElseCMD | elseIfCMD | whileCMD | varDeclaration
;

read:
    'read' OpenParentheses termo CloseParentheses Semicolon
;

write:
    'write' OpenParentheses termo CloseParentheses Semicolon
;

attribute:
    Identifier {
      _varName = _input.LT(-1).getText();
      if(!symbolTable.exists(_varName)){
         throw new corvusSemanticException("Variable '" + _varName + "' has not been declared");
      }
    }
    Attribute expression Semicolon
;

expression:
    termo ( Operation termo )*
;

boolExpression:
    termo (LogicalOperator termo)*
;

termo:
    Identifier {
        _varName = _input.LT(-1).getText();
        if(!symbolTable.exists(_varName)){
            throw new corvusSemanticException("Variable '" + _varName + "' has not been declared");
        }
    }
    | Integer | Float | String
;

WhiteSpace: (' ' | '\t' | '\n' | '\r') -> skip;
OpenParentheses: '(' ;
CloseParentheses: ')' ;
OpenBraces: '{';
CloseBraces: '}';
Semicolon: ';' ;
Colon: ',';

Operation: '+' | '-' | '*' | '/' | '%';
LogicalOperator: '||' | '&&' | '!=' | '!' |'==' | '>' | '<' | '<=' | '>=' ;
Attribute: '=';

//Possuir 2 tipos de variáveis (pelo menos 1 deles String)
Integer: [0-9];
Float: [0-9]+ ( '.' [0-9]+ )?;
String: ( '\'' | '"' ) (Char)* ( '\'' | '"' );

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

WhileSintax: 'while' | 'WHILE';

whileCMD:
    WhileSintax OpenParentheses boolExpression CloseParentheses OpenBraces
        codeBlock
    CloseBraces
;

//Deixar aqui para não idenficar um "if", "while", etc como Identifier
Identifier: [a-z] ( [a-z] | [A-Z] | [0-9] )*;
Char: ( [a-z] | [A-Z] | [0-9]) ;

//Question mark stands for: zero or one
//Plus stands for: one or more
//Star stands for: zero or more