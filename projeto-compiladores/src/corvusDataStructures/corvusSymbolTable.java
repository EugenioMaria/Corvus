package corvusDataStructures;

import corvusExceptions.corvusSemanticException;

import java.util.HashMap;

public class corvusSymbolTable {
    private HashMap<String, corvusSymbol> map;

    public corvusSymbolTable(){
        map = new HashMap<String, corvusSymbol>();
    }

    public void add(corvusSymbol symbol){
        if(!exists(symbol.name)){
            map.put(symbol.getName(), symbol);
        } else {
            throw new corvusSemanticException("Variable '" + symbol.getName() + "' has already been declared");
        }
    }

    public boolean exists(String symbolName){
        return map.get(symbolName) != null;
    }

    public corvusSymbol get(String symbolName){
        return map.get(symbolName);
    }

}
