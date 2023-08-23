package a01oopExtendsDemo1;

public class Test {
    public static void main(String[] args) {
        //创建布偶猫对象
        Ragdoll rd = new Ragdoll();
        rd.eat();
        rd.drink();
        rd.catchMouse();


        System.out.println("=========================");

        //创建哈士奇对象
        Husky hsk = new Husky();
        hsk.eat();
        hsk.drink();
        hsk.lookHome();
        hsk.breakHome();
    }
}
