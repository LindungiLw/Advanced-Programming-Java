package object_class.ex3;

public class ObjectPrinter {
    public static void print(Object obj) {
        String string = "Object information: " + obj.toString();
        System.out.println(string);
    }
}