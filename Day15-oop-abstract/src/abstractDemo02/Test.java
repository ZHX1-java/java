package abstractDemo02;

public class Test {
    public static void main(String[] args) {
        //创建青蛙对象
        Frog f = new Frog("青蛙",2);
        System.out.println(f.getName() + ", " + f.getAge() + "岁");
        f.eat();
        f.drink();



        //创建狗的对象
        Dog d = new Dog("黑狗",3);
        System.out.println(d.getName() + ", " + d.getAge() + "岁");
        d.eat();
        d.drink();



        //创建山羊对象
        Sheep s = new Sheep("山羊",4);
        System.out.println(s.getName() + ", " + s.getAge() + "岁");
        d.eat();
        d.drink();



    }
}
