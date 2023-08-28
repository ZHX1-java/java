package Test02;

public class Teacher extends Person{
    private String position;

    public Teacher() {}

    public Teacher(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void behavior(){
        System.out.println("老师在发布问题");
    }
}
