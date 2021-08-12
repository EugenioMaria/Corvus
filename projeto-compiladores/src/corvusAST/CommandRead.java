package corvusAST;

import main.CorvusUtils;

public class CommandRead extends CorvusAbstractCommand {
    String type;

    public CommandRead(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CommandRead";
    }

    @Override
    public String generateJava(int index) {
        StringBuilder cmd = new StringBuilder();
        String scanFunction="";
        switch (type){
            case "int":
                scanFunction = "Int";
                break;
            case "double":
                scanFunction = "Double";
                break;
            case "String":
                scanFunction="Line";
                break;
            case "Boolean":
                scanFunction="Boolean";
                break;
        }
        cmd.append("_scan.next" + scanFunction +"()");
        return cmd.toString();
    }
}
