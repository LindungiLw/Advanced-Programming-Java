package immutable.mutable;

public class MutableObj {
    private int value;

    public MutableObj(int value){
        this.value = value;
    }

    public void add(int addValue){
        value = value + addValue;
    }

    public int getValue(){
        return value;
    }

    public  void  setValue(int value){
        this.value = value;
    }
}
