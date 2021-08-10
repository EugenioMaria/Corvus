package corvusAST;

import java.util.ArrayList;

public class CommandVariable extends CorvusAbstractCommand {

    private String _varName;
    private String _varValue;
    private String _varType;

    public CommandVariable(String _varName, String _varValue, String _varType){
        this._varName = _varName;
        this._varValue = _varValue;
        this._varType = _varType;
    }

    @Override
    public String toString() {
        return "CommandCommandVariable{" +
                "_varName='" + _varName + '\'' +
                "_varValue='" + _varValue + '\'' +
                "_varType='" + _varType + '\'' +
                '}';
    }

    @Override
    public String generateJava() {
        if (_varType == "string")
            _varType = "str";

        return _varType + " " + _varName + " = " + _varValue + ";";
    }
}
