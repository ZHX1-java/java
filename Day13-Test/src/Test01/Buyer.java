package Test01;

public class Buyer extends AdminSatff {
    public Buyer() {
    }

    public Buyer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("采购员在采购东西");
    }
}
