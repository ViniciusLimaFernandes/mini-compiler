package tcc.lexer.data;

import java.util.HashMap;

public class MinipascalSymbolTable {
    private final HashMap<String, MinipascalSymbol> map;

    public MinipascalSymbolTable() {
        this.map = new HashMap<String, MinipascalSymbol>();
    }

    public void add(MinipascalSymbol symbol) {
        this.map.put(symbol.getName(), symbol);
    }

    public boolean exists(String symbolName) {
        return this.map.get(symbolName) != null;
    }

    public MinipascalSymbol get(String symbolName) {
        return this.map.get(symbolName);
    }
}
