package object_class.ex3;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("Toyota");
        Dog dog = new Dog("Buddy", 3);
        Dog dog2 = new Dog("Max", 5);

        System.out.println("1. Simple toString call");
        System.out.println(car.toString());
        System.out.println(dog.toString());
        System.out.println(dog2.toString());

        System.out.println("\n2. Using ObjectPrinter");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog);
        ObjectPrinter.print(dog2);
        System.out.println("\n3. Using System.out.println");
        System.out.println(car);
        System.out.println(dog);
        System.out.println(dog2);
    }
}
