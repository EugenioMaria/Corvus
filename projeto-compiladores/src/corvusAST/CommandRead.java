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
        type = type.substring(0, 1).toUpperCase() + type.substring(1);
        cmd.append("_scan.next"+type+"()");
        return cmd.toString();
    }
}
