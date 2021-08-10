package corvusAST;

public class CommandRead extends CorvusAbstractCommand {
    private String id;

    public CommandRead(String id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "CommandRead{" +
                "id='" + id + '\'' +
                '}';
    }

    @Override
    public String generateJava() {
        return null;
    }
}
