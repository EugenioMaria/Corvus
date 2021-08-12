package corvusAST;

import main.CorvusUtils;

public class CommandAttr extends CorvusAbstractCommand{

    private String id;
    private String expr;

    public CommandAttr(String id, String expr){
        this.id = id;
        this.expr = expr;
    }

    @Override
    public String toString() {
        return "CommandAttr{" +
                "id='" + id + '\'' +
                ", expr='" + expr + '\'' +
                '}';
    }

    @Override
    public String generateJava(int index) {
        StringBuilder cmd = new StringBuilder();
        cmd.append(CorvusUtils.IdentationBuilder(index));
        cmd.append(id + " = " + expr + ";");
        if (index>2){
            cmd.append("\n");
        }
        return cmd.toString();
    }
}
