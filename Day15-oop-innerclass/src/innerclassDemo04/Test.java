package innerclassDemo04;

public class Test {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer.Inner();
        oi.show2();//静态内部类的方法show2

        Outer.Inner.show1();//静态内部类的静态方法show1
    }
}
