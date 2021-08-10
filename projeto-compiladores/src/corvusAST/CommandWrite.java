package corvusAST;

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
    public String generateJava() {
        return null;
    }
}
