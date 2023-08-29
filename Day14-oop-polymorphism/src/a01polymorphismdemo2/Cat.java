package a01polymorphismdemo2;

public class Cat extends Animal{
    String name = "Cat";

    @Override
    public void show() {
        System.out.println("Cat --- show");
    }
}
