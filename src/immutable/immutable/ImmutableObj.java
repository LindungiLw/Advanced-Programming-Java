package immutable.immutable;

public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value){
        this.value = value;
    }

    public ImmutableObj add(int addValues){
        int result = value + addValues;
        return new ImmutableObj(result);
    }

    public int getValue(){
        return value;
    }
}
