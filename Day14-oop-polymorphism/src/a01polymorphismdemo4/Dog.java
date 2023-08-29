package a01polymorphismdemo4;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String sth) {
        System.out.println( getAge() + "岁的" + getColor() + "颜色的狗两只前腿死死的抱住骨头" + sth + "猛吃");
    }

    public void lookHome(){
        System.out.println("狗在看家");
    }
}
