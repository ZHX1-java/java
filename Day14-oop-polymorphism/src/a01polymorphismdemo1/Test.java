package a01polymorphismdemo1;

public class Test {
    public static void main(String[] args) {

        //创建学生对象
        Student s = new Student();
        s.setName("zhangsan");
        s.setAge(23);

        //创建老师对象
        Teacher t = new Teacher();
        t.setName("lisi");
        t.setAge(24);

        //创建管理员对象
        Administrator a = new Administrator();
        a.setName("wangwu");
        a.setAge(25);


        s.show();//学生的信息为：zhangsan,23
        t.show();//老师的信息为：lisi,24
        a.show();//管理员的信息为：wangwu,25

    }


    public static void register(Person p){
        p.show();
    }
}
