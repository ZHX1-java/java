package Test01;

public class Maintainer extends AdminSatff {
    public Maintainer() {
    }

    public Maintainer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("维护专员在维护");
    }
}
