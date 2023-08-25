package a01oopExtendsDemo10;

public class Test {
    public static void main(String[] args) {

        //创建经理对象
        Manager m = new Manager("z01", "张三", 4000, 500);
        m.work();//经理在管理其他人
        m.eat();//吃米饭
        System.out.println(m.getId() + "," + m.getName() + "," + m.getSalary() + "," + m.getBonus());//z01,张三,4000.0,500.0


        System.out.println("*****************************");


        //创建厨师对象
        Cooker c = new Cooker("z02", "李四", 5000);
       /* c.setId("z02");
        c.setName("李四");
        c.setSalary(5000);*/
        c.work();//厨师在炒菜
        c.eat();//吃米饭
        System.out.println(c.getId() + "," + c.getName() + "," + c.getSalary());//z02,李四,5000.0
    }
}
