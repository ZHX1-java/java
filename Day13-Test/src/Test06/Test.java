package Test06;

import Test06.Person;

public class Test {
    public static void main(String[] args) {
        //创建人的对象
        Person p = new Test06.Person();

        //创建狗的对象
        Dog d = new Dog(2,"黑色");
        p.keepPet(d,"骨头");//颜色为黑色岁的2的狗，在吃骨头


        //创建猫的对象
        Cat c = new Cat(2,"白色");
        p.keepPet(c,"小鱼干");//颜色为白色岁的2的猫，在吃小鱼干
    }
}
