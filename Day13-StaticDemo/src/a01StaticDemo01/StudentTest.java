package a01StaticDemo01;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student.teacherName = "尼古拉斯阿伟";
        s1.setName("张三");
        s1.setAge(23);
        s1.setGender("男");
        //s1.teacherName = "尼古拉斯阿伟";
        s1.study();
        s1.show();



        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(24);
        s2.setGender("女");
        //s2.teacherName = "尼古拉斯阿伟";
        s2.study();
        s2.show();

    }
}
