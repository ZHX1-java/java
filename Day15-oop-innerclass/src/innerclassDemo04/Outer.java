package innerclassDemo04;

public class Outer {

    int a = 10;
    static int b = 20;

    static class Inner{
        public static void show1(){
            Outer o = new Outer();
            System.out.println(o.a);
            System.out.println(b);
            System.out.println("静态内部类的静态方法show1");
        }

        public void show2(){
            Outer o = new Outer();
            System.out.println(o.a);
            System.out.println(b);
            System.out.println("静态内部类的方法show2");
        }
    }
}
