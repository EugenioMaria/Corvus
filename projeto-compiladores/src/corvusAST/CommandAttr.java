package corvusAST;

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
    public String generateJava() {
        return "    " + id + " = " + expr + ";\n";
    }
}
