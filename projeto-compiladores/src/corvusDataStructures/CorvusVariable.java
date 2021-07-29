package corvusDataStructures;

public class CorvusVariable extends CorvusSymbol {
    public static final int intVar = 0;
    public static final int stringVar = 1;
    public static final int listVar = 2;
    public static final int objVar = 3;
    public static final int floatVar = 4;

    private int type;
    private String value;

    public CorvusVariable(String name, String value, int type){
        super(name);
        this.type= type;
        this.value = value;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "corvusVariable{" +
                "type=" + type +
                ", value='" + value + '\'' +
                '}';
    }
}
