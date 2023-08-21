package a03StaticDemo03;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三",23,"男"));
        list.add(new Student("李四",26,"男"));
        list.add(new Student("王五",25,"男"));
        int max = StudentUtil.getMax(list);
        System.out.println(max);
    }
}
