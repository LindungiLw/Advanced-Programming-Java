package object_class.ex3;

public class Dog {
    private String dogName;
    private int age;

    public Dog(String dogName, int age){
        this.dogName = dogName;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Dog [dogName=" + dogName + ", age=" + age + "]";
    }
}
