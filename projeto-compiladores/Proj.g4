grammar Proj;

@header{
    import corvusDataStructures.CorvusSymbol;
    import corvusDataStructures.CorvusVariable;
    import corvusDataStructures.CorvusSymbolTable;
    import corvusExceptions.CorvusSemanticException;
    import corvusAST.CorvusAbstractCommand;
    import corvusAST.CorvusProgram;
    import corvusAST.CommandRead;
    import corvusAST.CommandWrite;
    import corvusAST.CommandAttr;
    import java.util.ArrayList;
}

@members{
    private int _varType;
    private String _varName;
    private String _varValue;
    private CorvusSymbolTable symbolTable = new CorvusSymbolTable();
    private CorvusSymbol symbol;
    private CorvusProgram program = new CorvusProgram();
    private ArrayList<CorvusAbstractCommand> curThread = new ArrayList<CorvusAbstractCommand>();

    private String _readId;
    private String _writeId;
    private String _attrId;
    private String _attrContent;

    private void verifyId(String id){
        if(!symbolTable.exists(id)){
            throw new CorvusSemanticException("Variable '" + id + "' has not been declared");
        }
    }

    public void printCMD(){
        for(CorvusAbstractCommand cur : program.getCmd()){
            System.out.println(cur.toString());
        }
    }
}

prog :
    'program' OpenBraces decl codeBlock CloseBraces 'end' { program.setCmd(curThread);}
;

decl :
    (varDeclaration)+
;

varDeclaration :
    type Identifier {
                        _varName = _input.LT(-1).getText();
                        _varValue = null;
                        symbol = new CorvusVariable(_varName,_varValue,_varType);
                        symbolTable.add(symbol);
                    } (Colon Identifier
                    {
                        _varName = _input.LT(-1).getText();
                        _varValue = null;
                        symbol = new CorvusVariable(_varName,_varValue,_varType);
                        symbolTable.add(symbol);
                    }
                    )* Semicolon
;

type :
    'int'   { _varType = CorvusVariable.intVar; }
    | 'float' { _varType = CorvusVariable.floatVar; }
    | 'string' { _varType = CorvusVariable.stringVar; }
    | 'list' { _varType = CorvusVariable.listVar; }
    | 'obj' { _varType = CorvusVariable.objVar; }
;
codeBlock :
    (command)*
;

command:
    read | write | attribute | ifCMD | ifElseCMD | elseIfCMD | whileCMD | varDeclaration
;

read:
    'read' OpenParentheses Identifier
    {
        verifyId(_input.LT(-1).getText());
        _readId = _input.LT(-1).getText();
    }
        CloseParentheses Semicolon
    {
        CommandRead cmd = new CommandRead(_readId);
        curThread.add(cmd);
    }
;

write:
    'write' OpenParentheses termo {
        _writeId = _input.LT(-1).getText();
    } CloseParentheses Semicolon {
        CommandWrite cmd = new CommandWrite(_writeId);
        curThread.add(cmd);
    }
;

attribute:
    Identifier {
      verifyId(_input.LT(-1).getText());
      _varName = _input.LT(-1).getText();
      _attrId = _varName;
    }
    Attribute {
      _attrContent = "";
    } expression {
        CommandAttr cmd = new CommandAttr(_attrId,_attrContent);
        curThread.add(cmd);
    } Semicolon
;

expression:
    termo ( Operation {_attrContent += _input.LT(-1).getText();} termo )*
;

boolExpression:
    termo (LogicalOperator termo)*
;

termo:
    Identifier {
        verifyId(_input.LT(-1).getText());
        _varName = _input.LT(-1).getText();
        _attrContent += _input.LT(-1).getText();
    }
    | Integer {_attrContent += _input.LT(-1).getText();} | Float {_attrContent += _input.LT(-1).getText();} | String {_attrContent += _input.LT(-1).getText();}
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