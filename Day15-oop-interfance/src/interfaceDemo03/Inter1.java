package interfaceDemo03;

public interface Inter1 {
    public abstract void method();

    public default void show(){
        System.out.println("接口中的默认方法---show");
    }
}
