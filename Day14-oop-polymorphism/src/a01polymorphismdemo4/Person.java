package a01polymorphismdemo4;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*public void keekPet(Dog d,String sth){
        System.out.println("年龄为" + age + "岁的" + name + "养了一只"+ d.getColor() + "色的" + d.getAge()  + "岁的狗");
        d.eat(sth);
    }

    public void keekPet(Cat c,String sth){
        System.out.println("年龄为" + age + "岁的" + name + "养了一只"+ c.getColor() + "色的" + c.getAge()  + "岁的猫");
        c.eat(sth);
    }*/


    public void keekPet(Animal a,String sth){
        if (a instanceof Dog d) {
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + d.getColor() + "色的" + d.getAge() + "岁的狗");
            d.eat(sth);
        }else if(a instanceof Cat c){
            System.out.println("年龄为" + age + "岁的" + name + "养了一只"+ c.getColor() + "色的" + c.getAge()  + "岁的猫");
            c.eat(sth);
        }
    }

}
