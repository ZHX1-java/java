package a01polymorphismdemo2;

public class Dog extends Animal{
    String name = "Dog";

    @Override
    public void show() {
        System.out.println("Dog --- show");
    }
}
