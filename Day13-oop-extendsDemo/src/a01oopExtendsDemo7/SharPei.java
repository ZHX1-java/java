package a01oopExtendsDemo7;

public class SharPei extends Dog {
    @Override
    public void eat() {
        //因为沙皮狗吃的狗粮和骨头
        //父类中的方法不能满足我们的需求了，所以需要进行重写
        super.eat();//吃狗粮
        System.out.println("沙皮狗啃骨头");
    }
}
