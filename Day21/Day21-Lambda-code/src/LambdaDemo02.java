

public class LambdaDemo02 {
    public static void main(String[] args) {

        //匿名内部类
        method(new Swim() {
            @Override
            public void swimming() {
                System.out.println("游泳");
            }
        });

        //Lambda 简写 匿名内部类
        method(
                () -> {
                    System.out.println("游泳");
                }
        );
    }

    public static void method(Swim s) {
        s.swimming();
    }
}

@FunctionalInterface
interface Swim {
    public abstract void swimming();
}
