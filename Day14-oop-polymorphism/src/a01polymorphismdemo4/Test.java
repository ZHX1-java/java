package a01polymorphismdemo4;

public class Test {
    public static void main(String[] args) {
        /*Person p1 = new Person("老王", 30);


        //p1.keekPet(new Dog(2,"黑"),"骨头");

        Dog d = new Dog(2, "黑");
        p1.keekPet(d, "骨头");

        Person p2 = new Person("张三",23);
        p2.keekPet(new Cat(3, "白"), "小鱼干");
*/
        Person p = new Person("张三",23);
        p.keekPet(new Dog(2,"黑"),"骨头");
        p.keekPet(new Cat(3,"白"),"小鱼干");
    }
}
