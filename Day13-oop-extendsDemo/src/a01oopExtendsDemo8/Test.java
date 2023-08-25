package a01oopExtendsDemo8;

public class Test {
    public static void main(String[] args) {
        //Student s = new Student();//父类  子类
        Student s = new Student("zhangsan", 23);
        System.out.println(s.name + ", " + s.age);//zhangsan, 23

    }
}
