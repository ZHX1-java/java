package Demo1;

public class Student {
    static {
        System.out.println("开始创建对象了");
    }

    private String name;
    private int gae;

    public Student() {
        System.out.println("空参构造");
    }

    public Student(String name, int gae) {
        System.out.println("有参构造");
        this.name = name;
        this.gae = gae;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGae() {
        return gae;
    }

    public void setGae(int gae) {
        this.gae = gae;
    }
}
