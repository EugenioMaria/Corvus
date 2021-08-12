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

    public void setWarnings(){
        for(CorvusVariable curr: varTable.getAll()){
            if(curr.getValue() == null){
                System.out.println("@@ Warning -- Variable " + curr.getName() + " was declared, but has not been assigned.");
            } else {
                if (!curr.getRead()) {
                    System.out.println("@@ Warning -- Variable " + curr.getName() + " was declared and assigned, but has not been used.");
                }
            }
        }
    }

    public void generateTarget(){
        StringBuilder str = new StringBuilder();
        str.append("package main;\n");
        str.append("import java.util.List;\n");
        str.append("import java.util.Scanner;\n");
        str.append("public class corScript {\n");
        str.append("\tpublic static void main(String args[]){\n");
        str.append("\t\tScanner _scan = new Scanner(System.in);\n");
        for(CorvusVariable variable: varTable.getAll()){
            str.append(variable.generateJava(2)+"\n");
        }
        for(CorvusAbstractCommand command: cmd){
            str.append(command.generateJava(2) + "\n");
        }

        str.append("    }\n");
        str.append("}");
        try {
            FileWriter fr = new FileWriter(new File("projeto-compiladores/src/main/corScript.java"));
            fr.write(str.toString());
            fr.close();
            setWarnings();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
