package interfaceDemo01;

public class Test {
    public static void main(String[] args) {
        //创建青蛙对象
        Frog f = new Frog("青蛙", 2);
        System.out.println(f.getName() + ", " + f.getAge());
        f.eat();
        f.swim();

        //创建狗的对象
        Dog d = new Dog("狗", 3);
        System.out.println(d.getName() + ", " + d.getAge());
        d.eat();
        d.swim();

        //创建兔子对象
        Rabbit r = new Rabbit("兔子", 2);
        System.out.println(r.getName() + ", " + r.getAge());
        r.eat();
    }
}
