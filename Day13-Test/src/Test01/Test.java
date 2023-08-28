package Test01;

public class Test {
    public static void main(String[] args) {
        //创建讲师对象
        Lecturer l = new Lecturer("z01", "zhangsan");
        l.work();
        System.out.println(l.getId() + "," + l.getName());
        System.out.println("***********************************");

        //创建助教对象
        Tutor t = new Tutor("z02", "lisi");
        t.work();
        System.out.println(t.getId() + "," + t.getName());
        System.out.println("***********************************");

        //创建维护专员对象
        Maintainer m = new Maintainer("z03", "wangwu");
        m.work();
        System.out.println(m.getId() + "," + m.getName());
        System.out.println("***********************************");

        //创建采购员对象
        Buyer b = new Buyer("z04", "zhaoliu");
        b.work();
        System.out.println(b.getId() + "," + b.getName());

    }
}
