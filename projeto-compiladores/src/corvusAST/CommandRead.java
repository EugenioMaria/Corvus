package corvusAST;

public class CommandRead extends CorvusAbstractCommand {
    @Override
    public String toString() {
        return "CommandRead";
    }

    @Override
    public String generateJava() {
        return "_scan.nextLine();";
    }
}
