package Test05;

public class Test {
    public static void main(String[] args) {
        //创建项目经理对象
        Manager m = new Manager("zhangsan","z01",5000,1000);
        System.out.println(m.getName() + "," + m.getId() + "," + m.getSalary() + "," + m.getBonus());
        m.work();

        System.out.println("*****************");

        //创建程序员对象
        Coder c = new Coder("lisi","z02",15000);
        System.out.println(c.getName() + "," + c.getId() + "," + c.getSalary());
        c.work();
    }
}
