package a01oopExtendsDemo7;

public class DogTest {
    public static void main(String[] args) {
        //创建哈士奇对象
        Husky h = new Husky();
        //调用方法
        h.eat();//吃狗粮
        h.drink();//喝水
        h.lookHome();//看家
        h.breakHome();//哈士奇拆家

        System.out.println("****************************");

        //创建沙皮狗对象
        SharPei sp = new SharPei();
        sp.eat();//吃狗粮   沙皮狗啃骨头
        sp.drink();//喝水
        sp.lookHome();//看家
        System.out.println("****************************");

        //创建中华田园犬对象
        ChineseDog cd = new ChineseDog();
        cd.eat();//中华田园犬在吃饭
        cd.drink();//喝水
        cd.lookHome();//看家
    }
}
