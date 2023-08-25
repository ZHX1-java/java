package a01oopExtendsDemo8;

import java.util.Queue;

public class Student extends Person{
    public Student() {
        super();//写在子类构造方法的第一句
        System.out.println("子类");
    }
    public Student(String name,int age){
        super(name,age);
    }
}
