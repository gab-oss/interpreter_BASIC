public class IntVar extends Variable{
    private int value;

    public IntVar (String name, int value){
        super(name);
        this.value = value;
    }

    public IntVar (String name){
        super(name);
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
