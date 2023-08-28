package Test04;

public class StudentLeader extends Person{
    private String job;

    public StudentLeader() {
    }

    public StudentLeader(String name, String gender, int age, String nationality, String job) {
        super(name, gender, age, nationality);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void meeting(){
        System.out.println("学生干部在开会");
    }

    @Override
    public void work() {
        System.out.println("学生干部喜欢开会！");
    }
}
