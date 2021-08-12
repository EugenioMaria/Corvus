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
    import corvusAST.CommandDecider;
    import corvusAST.CommandWhile;
    import java.util.ArrayList;
    import java.util.Stack;
}

@members{
    private CorvusSymbolTable symbolTable = new CorvusSymbolTable();
    private Stack<ArrayList<CorvusAbstractCommand>> cmdStack = new Stack<ArrayList<CorvusAbstractCommand>>();
    private Stack<String> conditionStack = new Stack<String>();
    private CorvusVariable symbol;
    private CorvusProgram program = new CorvusProgram();
    private ArrayList<CorvusAbstractCommand> curThread;
    private ArrayList<CorvusAbstractCommand> cmdTrue;
    private ArrayList<CorvusAbstractCommand> cmdFalse;
    private ArrayList<CorvusAbstractCommand> cmdWhile;

    private String _readId;
    private String _writeId;
    private String _attrId;
    private String _attrContent;
    private String _exprDecision;
    private int _varType;
    private int _attrType;
    private String _varName;
    private String _varValue;
    private Boolean isAttr;
    private String [] varTypeStrings = CorvusVariable.typeList;
    private int line;

    private void verifyId(String id){
        if(!symbolTable.exists(id)){
            throw new CorvusSemanticException("Variable '" + id + "' has not been declared at Line " + line);
        }
    }

    public void printCMD(){
        for(CorvusAbstractCommand cur : program.getCmd()){
            System.out.println(cur.toString());
        }
    }

    public void verifyType(int attrType, int expressionType){
        if(attrType!=expressionType && isAttr){
            throw new CorvusSemanticException("Illegal attribution from " + varTypeStrings[attrType] + " to " + varTypeStrings[expressionType] + " at line " + line);
        }
    }

	public void generateCode(){
		program.generateTarget();
	}
}

prog :
    'program' OpenBraces decl codeBlock CloseBraces 'end'
    {
        program.setVarTable(symbolTable);
        program.setCmd(cmdStack.pop());
    }
;

decl :
    (varDeclaration)+
;

varDeclaration :
    type
        {
//            _varType = _input.LT(-1).getText();
        }
    Identifier
        {
            _varName = _input.LT(-1).getText();
            _varValue = null;
            symbol = new CorvusVariable(_varName,_varValue,_varType);
            symbolTable.add(symbol);

//            CommandVariable cmd = new CommandVariable(_varName,_varValue,_varType);
//            cmdStack.peek().add(cmd);
        }

    (Colon Identifier
        {
            _varName = _input.LT(-1).getText();
            _varValue = null;
            symbol = new CorvusVariable(_varName,_varValue,_varType);
            symbolTable.add(symbol);

//            CommandVariable cmd = new CommandVariable(_varName,_varValue,_varType);
//            cmdStack.peek().add(cmd);
        }
    )* Semicolon
;

type :
    'int'   { _varType = CorvusVariable.intVar; }
    | 'float' { _varType = CorvusVariable.floatVar; }
    | 'string' { _varType = CorvusVariable.stringVar; }
    | 'list' { _varType = CorvusVariable.listVar; }
    | 'boolean' { _varType = CorvusVariable.booleanVar;}
;
codeBlock :
    {
        curThread = new ArrayList<CorvusAbstractCommand>();
        cmdStack.push(curThread);
    }
    (command)*
;

command:
    read | write | attribute | ifCMD | ifElseCMD | whileCMD | varDeclaration // | elseIfCMD
;

read:
    'read' OpenParentheses CloseParentheses Semicolon?
;

write:
    'write' OpenParentheses termo {
        _writeId = _input.LT(-1).getText();
    } CloseParentheses Semicolon {
        CommandWrite cmd = new CommandWrite(_writeId);
        cmdStack.peek().add(cmd);
    }
;

attribute:
    Identifier {
      verifyId(_input.LT(-1).getText());
      _varName = _input.LT(-1).getText();
      line = _input.LT(-1).getLine();
      _attrId = _varName;
      isAttr = true;
      _attrType = symbolTable.getType(_varName);
    }
    Attribute {
      _attrContent = "";
    }
    (
        expression {
            CommandAttr cmd = new CommandAttr(_attrId,_attrContent);
            cmdStack.peek().add(cmd);
        }
        | read {
            CommandRead cmdRead = new CommandRead(symbolTable.get(_varName).getTypeString());
            CommandAttr cmd = new CommandAttr(_attrId,cmdRead.generateJava(0));
            cmdStack.peek().add(cmd);
        }
        | OpenParentheses
            {
              verifyType(_attrType,3);
              isAttr = false;
            }
          boolExpression
           {
             CommandAttr cmd = new CommandAttr(_attrId,_attrContent);
             cmdStack.peek().add(cmd);

           }
        CloseParentheses
    )
    Semicolon
    {
      symbolTable.setValue(_varName, _attrContent);
      isAttr = false;
    }
;

expression:
    termo ( Operation {_attrContent += _input.LT(-1).getText();} termo )*
;

boolExpression:
    termo (LogicalOperator {_attrContent += _input.LT(-1).getText();} termo)
;

termo:
    Identifier {
        verifyId(_input.LT(-1).getText());
        _varName = _input.LT(-1).getText();
        _attrContent += _input.LT(-1).getText();
        _varType  = symbolTable.getType(_varName);
        verifyType(_attrType,_varType);
        symbolTable.setRead(_varName);
    }
    | Integer {
        _attrContent += _input.LT(-1).getText();
        verifyType(_attrType, 0);
    }
    | Float {
        _attrContent += _input.LT(-1).getText();
        verifyType(_attrType, 4);
    }
    | String {
        _attrContent += _input.LT(-1).getText();
        verifyType(_attrType,1);
    }
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
Integer: [0-9]+;
Float: [0-9]+ ( '.' [0-9]+ )?;
String: ( '"' ) (Char)* ( '"' );

//Possuir a instrução if-else
IfSintax: 'if' | 'IF';
ElseSintax: 'else' | 'ELSE';

ifCMD:
    IfSintax
    {_attrContent = "";}
    OpenParentheses
    (boolExpression {_exprDecision = _attrContent;}| Identifier
                {
                    _varName = _input.LT(-1).getText();
                    _varType  = symbolTable.getType(_varName);
                    _exprDecision = _varName;
                    symbolTable.setRead(_varName);
                    verifyType(3,_varType);
                }
             | 'true' {_exprDecision = "true";}
             | 'false'{_exprDecision = "false";}
    )
    CloseParentheses
    {
        conditionStack.push(_exprDecision);
    }
    OpenBraces
    codeBlock
    CloseBraces
    {
        cmdTrue = cmdStack.pop();
        CommandDecider cmd = new CommandDecider(conditionStack.pop(), cmdTrue, null);
        cmdStack.peek().add(cmd);
    }
;
ifElseCMD:
    IfSintax
    {_attrContent = "";}
    OpenParentheses
    (boolExpression {_exprDecision = _attrContent;}| Identifier
            {
                _varName = _input.LT(-1).getText();
                _varType  = symbolTable.getType(_varName);
                _exprDecision = _varName;
                symbolTable.setRead(_varName);
                verifyType(3,_varType);
            }
         | 'true' {_exprDecision = "true";}
         | 'false'{_exprDecision = "false";})
    CloseParentheses
    {
        conditionStack.push(_exprDecision);
    }
    OpenBraces
    codeBlock
    CloseBraces
    {
        cmdTrue = cmdStack.pop();
    }
    ElseSintax
    OpenBraces
    codeBlock
    CloseBraces
    {
        cmdFalse = cmdStack.pop();
        CommandDecider cmd = new CommandDecider(conditionStack.pop(), cmdTrue, cmdFalse);
        cmdStack.peek().add(cmd);
    }
;


WhileSintax: 'while' | 'WHILE';

whileCMD:
    WhileSintax
    OpenParentheses
    {_attrContent = "";}
    (
     boolExpression {_exprDecision = _attrContent;}| Identifier
        {
            _varName = _input.LT(-1).getText();
            _varType  = symbolTable.getType(_varName);
            _exprDecision = _varName;
            symbolTable.setRead(_varName);
            verifyType(3,_varType);
        }
     | 'true' {_exprDecision = "true";}
     | 'false'{_exprDecision = "false";}
    )
    CloseParentheses
    {
        conditionStack.push(_exprDecision);
    }
    OpenBraces
    codeBlock
    CloseBraces
    {
        cmdWhile = cmdStack.pop();
        CommandWhile cmd  = new CommandWhile(conditionStack.pop(),cmdWhile);
        cmdStack.peek().add(cmd);
    }
;

//Deixar aqui para não idenficar um "if", "while", etc como Identifier
Identifier: [a-z] ( [a-z] | [A-Z] | [0-9] )*;
Char: ( [a-z] | [A-Z] | [0-9]) ;

//Question mark stands for: zero or one
//Plus stands for: one or more
//Star stands for: zero or more