package immutable.address;

public class Address {
    private String value;
    public Address(String value){
        this.value = value;
    }

    public void setValue(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
