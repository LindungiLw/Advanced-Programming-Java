package immutable;

public class ImmutableAddress {
    private final String value;
    public ImmutableAddress(String value){
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
