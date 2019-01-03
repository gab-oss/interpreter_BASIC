public class StringVar extends Variable{
    private String value;

    public StringVar (String name, String value){
        super(name);
        this.value = value;
    }

    public StringVar (String name){
        super(name);
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}