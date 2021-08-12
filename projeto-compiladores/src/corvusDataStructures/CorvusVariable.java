package corvusDataStructures;

import main.CorvusUtils;

public class CorvusVariable extends CorvusSymbol {
    public static final int intVar = 0;
    public static final int stringVar = 1;
    public static final int listVar = 2;
    public static final int booleanVar = 3;
    public static final int floatVar = 4;
    public static final String [] typeList = {"int","String","List","Boolean","double"};

    private int type;
    private String value;
    private Boolean read;

    public CorvusVariable(String name, String value, int type){
        super(name);
        this.type= type;
        this.value = value;
        this.read = false;
    }

    public void setRead(Boolean cond){
        this.read = cond;
    }

    public Boolean getRead(){
        return this.read;
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
        return this.type;
    }

    public String getTypeString() {
        return this.typeList[this.type];
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "corvusVariable{" +
                "type=" + type +
                ", value='" + value + '\'' +
                '}';
    }

    @Override
    public String generateJava(int index) {
        StringBuilder cmd = new StringBuilder();
        cmd.append(CorvusUtils.IdentationBuilder(index));
        cmd.append(typeList[this.type] + " " + this.name + ";");
        return cmd.toString();
    }
}
