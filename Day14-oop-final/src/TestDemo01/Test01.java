package TestDemo01;

public class Test01 {
    public static void main(String[] args) {
        //final修饰变量：叫做常量，只能被赋值一次
        final int a = 10;//a必须被赋值
        System.out.println(a);
        //a = 20;
    }
}


final class Fu{
    public final void show(){
        System.out.println("Fu --- show");
    }
}
//final修饰类：表示该类是最终类，不能被继承
/*
class Zi extends Fu{

}*/
