package Test03;

public class Phone {
    private String brand;
    private double price;
    private int size = 6;

    public Phone() {
    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void call() {
        System.out.println("手机在打电话");
    }

    public void sendMessage() {
        System.out.println("手机在发短信");
    }

    public void playGame() {
        System.out.println("手机在打游戏");
    }

}

