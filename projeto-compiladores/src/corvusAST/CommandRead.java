package corvusAST;

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
    public String generateJava() {
        type = type.substring(0, 1).toUpperCase() + type.substring(1);
        return "_scan.next"+type+"()\n";
    }
}
