package immutable;

public class RefMain4 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("Jakarta");
        ImmutableAddress b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = new ImmutableAddress("Bali");
        System.out.println("Bali -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
