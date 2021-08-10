package corvusAST;

import java.util.ArrayList;

public class CommandWhile extends CorvusAbstractCommand {

    private String condition;
    private ArrayList<CorvusAbstractCommand> cmdList;

    public CommandWhile(String condition, ArrayList<CorvusAbstractCommand> cmdList){
        this.condition = condition;
        this.cmdList = cmdList;
    }

    @Override
    public String toString() {
        return "CommandWhile{" +
                "condition='" + condition + '\'' +
                ", cmdList=" + cmdList +
                '}';
    }

    @Override
    public String generateJava() {
        StringBuilder cmd = new StringBuilder();
        for (CorvusAbstractCommand curr : cmdList){
            cmd.append(curr.generateJava());
        }
        return "    while(" + condition + "){\n    " + cmd + "    }\n";
    }
}
