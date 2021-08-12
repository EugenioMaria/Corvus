package corvusAST;

import main.CorvusUtils;

public class CommandWrite extends CorvusAbstractCommand {
    private String id;

    public CommandWrite(String id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "CommandWrite{" +
                "id='" + id + '\'' +
                '}';
    }

    @Override
    public String generateJava(int index) {
        StringBuilder cmd = new StringBuilder();
        cmd.append(CorvusUtils.IdentationBuilder(index));
        cmd.append("System.out.println(" + id + ");\n");
        return cmd.toString();
    }
}
