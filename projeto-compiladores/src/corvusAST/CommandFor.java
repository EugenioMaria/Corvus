package corvusAST;
import main.CorvusUtils;

import java.util.ArrayList;

public class CommandFor extends CorvusAbstractCommand {

    private String condition;
    private String iterator;
    private String incrementExpression;
    private ArrayList<CorvusAbstractCommand> cmdList;
    private String startValue;

    public CommandFor( String startValue, String iterator, String condition, String incrementExpression, ArrayList<CorvusAbstractCommand> cmdList) {
        this.condition = condition;
        this.iterator = iterator;
        this.incrementExpression = incrementExpression;
        this.cmdList = cmdList;
        this.startValue = startValue;
    }

    @Override
    public String toString() {
        return "CommandFor{" +
                "condition='" + condition + '\'' +
                ", iterator='" + iterator + '\'' +
                ", incrementExpression='" + incrementExpression + '\'' +
                '}';
    }

    @Override
    public String generateJava(int index) {
        StringBuilder cmd = new StringBuilder();
        String tbs = CorvusUtils.IdentationBuilder(index);
        cmd.append(tbs);
        cmd.append("for(" + iterator + " = " + startValue + ";" + condition + ";" + iterator + " = " + incrementExpression + "){\n");
        for (CorvusAbstractCommand curr : cmdList){
            cmd.append(curr.generateJava(index + 1));
        }
        cmd.append(tbs + "}\n");

        return cmd.toString();
    }
}
