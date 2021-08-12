package corvusAST;

import main.CorvusUtils;

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
    public String generateJava(int index) {
        StringBuilder cmd = new StringBuilder();
        String tbs = CorvusUtils.IdentationBuilder(index);
        cmd.append(tbs);
        cmd.append("while(" + condition + "){\n");
        for (CorvusAbstractCommand curr : cmdList){
            cmd.append(curr.generateJava(index + 1));
        }
        cmd.append(tbs + "}\n");

        return cmd.toString();

    }
}
