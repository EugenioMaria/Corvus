package corvusDataStructures;

public abstract class corvusSymbol {
    protected String name;

    public corvusSymbol(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
