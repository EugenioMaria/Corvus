package corvusDataStructures;

import corvusExceptions.CorvusSemanticException;

import java.util.HashMap;
import java.util.ArrayList;

public class CorvusSymbolTable {
    private HashMap<String, CorvusVariable> map;

    public CorvusSymbolTable(){
        map = new HashMap<String, CorvusVariable>();
    }

    public void add(CorvusVariable symbol){
        if(!exists(symbol.name)){
            map.put(symbol.getName(), symbol);
        } else {
            throw new CorvusSemanticException("Variable '" + symbol.getName() + "' has already been declared");
        }
    }

    public boolean exists(String symbolName){
        return map.get(symbolName) != null;
    }

    public CorvusVariable get(String symbolName){
        return map.get(symbolName);
    }

    public ArrayList<CorvusVariable> getAll(){
        ArrayList<CorvusVariable> lista = new ArrayList<CorvusVariable>();
        for (CorvusVariable symbol : map.values()) {
            lista.add(symbol);
        }
        return lista;
    }
}
