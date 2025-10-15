package immutable.address;

import immutable.ImmutableAddress;

public class MemberMainV2 {
    public static void main(String[] args) {

        ImmutableAddress address = new ImmutableAddress("Jakarta");
        MemberV2 memberA = new MemberV2("John", address);
        MemberV2 memberB = new MemberV2("Jane", address);

        System.out.println("MemberA = " + memberA);
        System.out.println("MemberB = " + memberB);

        memberB.setAddress(new ImmutableAddress("Bali"));
        System.out.println("MemberA = " + memberA);
        System.out.println("MemberB = " + memberB);
    }
}