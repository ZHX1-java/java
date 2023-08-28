package Test04;

public class Test {
    public static void main(String[] args) {
        //创建学生对象
        Student s = new Student();
        s.work();

        //创建工人对象
        Worker w = new Worker();
        w.work();

        //创建学生干部对象
        StudentLeader sl = new StudentLeader();
        sl.work();

    }
}
