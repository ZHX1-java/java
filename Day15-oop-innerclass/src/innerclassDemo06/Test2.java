package innerclassDemo06;

public class Test2 {
    public static void main(String[] args) {
        Dog d = new Dog(){
            @Override
            public void eat() {
                super.eat();
            }
        };
        d.eat();//狗吃骨头

        new Dog(){
            @Override
            public void eat() {
                super.eat();
            }
        }.eat();//重写了游泳的方法
    }
}
