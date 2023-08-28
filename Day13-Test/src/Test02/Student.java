package Test02;

import java.util.Random;

public class Student extends Person{
    private String room;

    public Student() {}

    public Student(String name, int age, String room) {
        super(name, age);
        this.room = room;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void behavior(){
        System.out.println("学生在填写听课反馈");
    }
}
