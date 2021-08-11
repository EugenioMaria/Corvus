package corvusAST;

import corvusDataStructures.CorvusSymbol;
import corvusDataStructures.CorvusSymbolTable;
import corvusDataStructures.CorvusVariable;

import java.io.File;
import java.io.FileWriter;
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
        StringBuilder str = new StringBuilder();
        str.append("import java.util.List;\n");
        str.append("import java.util.Scanner;\n");
        str.append("public class MainClass {\n");
        str.append("    public static void main(String args[]){\n");
        str.append("        Scanner _scan = new Scanner(System.in);\n");
        for(CorvusVariable variable: varTable.getAll()){
            str.append("\t\t"+variable.generateJava().replaceAll("\n","\n\t")+"\n");
        }
        for(CorvusAbstractCommand command: cmd){
            str.append("\t\t"+command.generateJava().replaceAll("\n","\n\t")+"\n");
        }

        str.append("    }\n");
        str.append("}");
        try {
            FileWriter fr = new FileWriter(new File("corScript.java"));
            fr.write(str.toString());
            fr.close();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
