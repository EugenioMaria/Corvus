package corvusDataStructures;

import corvusExceptions.CorvusSemanticException;

import java.util.HashMap;

public class CorvusSymbolTable {
    private HashMap<String, CorvusSymbol> map;

    public CorvusSymbolTable(){
        map = new HashMap<String, CorvusSymbol>();
    }

    public void add(CorvusSymbol symbol){
        if(!exists(symbol.name)){
            map.put(symbol.getName(), symbol);
        } else {
            throw new CorvusSemanticException("Variable '" + symbol.getName() + "' has already been declared");
        }
    }

    public boolean exists(String symbolName){
        return map.get(symbolName) != null;
    }

    public CorvusSymbol get(String symbolName){
        return map.get(symbolName);
    }

}
