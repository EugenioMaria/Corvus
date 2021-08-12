package corvusAST;


import main.CorvusUtils;

import java.util.ArrayList;

public class CommandDecider extends CorvusAbstractCommand{
    private String condition;
    private ArrayList<CorvusAbstractCommand> cmdTrue;
    private ArrayList<CorvusAbstractCommand> cmdFalse;

    public CommandDecider(String condition, ArrayList<CorvusAbstractCommand> lt,  ArrayList<CorvusAbstractCommand> lf){
        this.condition = condition;
        this.cmdTrue  = lt;
        this.cmdFalse = lf;
    }

    @Override
    public String toString() {
        return "CommandDecider{" +
                "condition='" + condition + '\'' +
                ", cmdTrue=" + cmdTrue +
                ", cmdFalse=" + cmdFalse +
                '}';
    }

    @Override
    public String generateJava(int index) {
        StringBuilder cmd = new StringBuilder();
        cmd.append(CorvusUtils.IdentationBuilder(index));
        cmd.append("if(" + condition +") {\n");
        for(CorvusAbstractCommand curr :cmdTrue){
            cmd.append(curr.generateJava(index + 1));
        }
        if(cmdFalse != null) {
            cmd.append('\n');
            cmd.append(CorvusUtils.IdentationBuilder(index) + "} else {\n");
            for (CorvusAbstractCommand curr : cmdFalse) {
                cmd.append(curr.generateJava(index + 1));
            }
        }
        cmd.append(CorvusUtils.IdentationBuilder(index));
        cmd.append("}\n");
        return cmd.toString();
    }
}
