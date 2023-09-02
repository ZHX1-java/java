package interfaceDemo02;


//因为现在不想让外界去直接创建Person对象
//因为创建顶级父类Person的对象此时是没有意义的
//所以就把他写为抽象的 abstract
public abstract class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
