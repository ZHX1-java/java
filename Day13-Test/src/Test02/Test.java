package Test02;

import java.awt.geom.GeneralPath;

public class Test {
    public static void main(String[] args) {
        //创建学生对象
        Student s = new Student("zhangsan", 23, "一班");
        System.out.println(s.getName() + "," + s.getAge() + "," + s.getRoom());
        s.behavior();

        System.out.println("***********************");

        //创建老师对象
        Teacher t = new Teacher("lisi", 24, "行政部");
        System.out.println(t.getName() + "," + t.getAge() + "," + t.getPosition());
        t.behavior();

    }
}
