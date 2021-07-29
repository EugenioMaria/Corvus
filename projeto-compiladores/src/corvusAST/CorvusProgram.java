package corvusAST;

import corvusDataStructures.CorvusSymbolTable;

import java.util.ArrayList;

public class CorvusProgram {
    private CorvusSymbolTable varTable;
    private ArrayList<CorvusAbstractCommand> cmd;
    private String programName;

    public CorvusSymbolTable getVarTable() {
        return varTable;
    }

    public void setVarTable(CorvusSymbolTable varTable) {
        this.varTable = varTable;
    }

    public ArrayList<CorvusAbstractCommand> getCmd() {
        return cmd;
    }

    public void setCmd(ArrayList<CorvusAbstractCommand> cmd) {
        this.cmd = cmd;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public void generateTarget(){

    }
}
