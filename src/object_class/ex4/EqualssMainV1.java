package object_class.ex4;

public class EqualssMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("1");
        UserV1 user2 = new UserV1("1");
        UserV1 user3 = user1;

        System.out.println("user1 == user2: " + (user1 == user2));
        System.out.println("user1 == user3: " + (user1 == user3));
        System.out.println("user1.equals(user2): " + user1.equals(user2));
    }
}
