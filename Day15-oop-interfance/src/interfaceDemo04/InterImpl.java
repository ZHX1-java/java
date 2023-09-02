package interfaceDemo04;

public class InterImpl implements Inter{
    @Override
    public void method() {
        System.out.println("实现类中重写的抽象方法---method");

    }


    //静态方法不能被重写
    //这个show方法只是刚好跟接口中重名的show方法
    public static void show(){
        System.out.println("实现类中的---show");
    }
}
