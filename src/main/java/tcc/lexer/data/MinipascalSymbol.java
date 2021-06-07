package tcc.lexer.data;

public abstract class MinipascalSymbol {

    protected String name;

    public MinipascalSymbol(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MinipascalSymbol [name= " + this.name + " ]";
    }
}
