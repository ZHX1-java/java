package Test06;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void keepPet(Cat cat,String sth){
        System.out.println("颜色为" + cat.getColor() + "岁的" + cat.getAge() + "的猫，在吃" + sth);
    }

    public void keepPet(Dog dog,String sth){
        System.out.println("颜色为" + dog.getColor() + "岁的" + dog.getAge() + "的狗，在吃" + sth);
    }
}
