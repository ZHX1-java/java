package Test03;

public class Test {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.setBrand("xiaomi");
        p1.setPrice(4999.99);
        System.out.println(p1.getBrand() + " ," + p1.getPrice() + "," + p1.getSize());
        p1.call();
        p1.sendMessage();
        p1.playGame();

        System.out.println("***********************");

        Phone p2 = new Phone("huawei", 5999.99);
        p2.setSize(7);
        System.out.println(p2.getBrand() + "," + p2.getPrice() + "," + p2.getSize());
        p2.call();
        p2.sendMessage();
        p2.playGame();
    }
}
