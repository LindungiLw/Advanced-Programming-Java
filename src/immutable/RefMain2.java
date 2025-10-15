package immutable;

import immutable.address.Address;

public class RefMain2 {
    public static void main(String[] args) {
        Address a = new Address("Jakarta");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("Bali");
        System.out.println("Bali -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a.setValue("Surabaya");
        System.out.println("Surabaya -> a");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
