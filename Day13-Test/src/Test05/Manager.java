package Test05;

import Test05.Person;

public class Manager extends Person {
    private int bonus;

    public Manager() {
    }

    public Manager(String name, String id, int salary, int bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("项目经理在管理员工");
    }
}
