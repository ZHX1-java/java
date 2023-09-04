package innerclassDemo05;

public class Outer {
    int a = 20;
    public void show(){
        int a = 10;//private 空着不写  protected  public 只能修饰成员，局部变量不能修饰 ---- 只能在外部类中的成员用

        //局部内部类
        class Inner{
            int b = 20;
            String name;
            int age;
            public void method1(){
                System.out.println(a);//局部内部类可以直接调用外部类中的成员
                System.out.println(b);//局部内部类也可以直接调用方法中的局部变量
                System.out.println("局部内部类中的method1方法");
            }
            public static void method2(){
                System.out.println("局部内部类中的method2静态方法");
            }
        }
        //创建局部内部类的对象
        Inner i = new Inner();
        System.out.println(i.name);
        System.out.println(i.age);
        System.out.println(i.b);//调用局部内部类中的变量
        i.method1();
        Inner.method2();

    }
}
