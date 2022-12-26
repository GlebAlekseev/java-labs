package lab3;

public abstract class NumberSystem {
    private final String value;

    protected NumberSystem(String value){
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
