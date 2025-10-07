package object_class.ex4;

public class EqualsMainV2 {
    public static void main(String[] args) {
        UserV2 user1 = new UserV2("1");
        UserV2 user2 = new UserV2("1");
        UserV2 user3 = user1;

        System.out.println("user1 == user2: " + (user1 == user2));
        System.out.println("user1 == user3: " + (user1 == user3));
        System.out.println("user1.equals(user2): " + user1.equals(user2));
    }
}
