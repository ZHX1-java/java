package Test05;

public class Coder extends Person{
    public Coder() {
    }

    public Coder(String name, String id, int salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("程序员在写代码");
    }
}
