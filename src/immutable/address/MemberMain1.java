package immutable.address;

public class MemberMain1 {
    public static void main(String[] args) {
        Address address = new Address("Jakarta");
        MemberV1 memberA = new MemberV1("John", address);
        MemberV1 memberB = new MemberV1("Jane", address);

        System.out.println("MemberA = " + memberA);
        System.out.println("MemberB = " + memberB);

        address.setValue("Bali");
        System.out.println("MemberA = " + memberA);
        System.out.println("MemberB = " + memberB);

    }
}
