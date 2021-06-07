package tcc.lexer.data;

public class MinipascalVariable extends MinipascalSymbol {
    public static final int NUMBER = 0;

    public static final int TEXT = 1;

    private int type;

    private String value;

    public MinipascalVariable(String name, int type, String value) {
        super(name);
        this.type = type;
        this.value = value;
    }

    public static int getNUMBER() {
        return NUMBER;
    }

    public static int getTEXT() {
        return TEXT;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MinipascalVariable [name=" + this.name + ", type=" + this.type + ", value=" + this.value + " ]";
    }
}
