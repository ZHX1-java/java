package interfaceDemo05;

public interface Inter {
    public default void show1(){
        System.out.println("show1开始执行了");
        show3();
    }

    public static void show2(){
        System.out.println("show2开始执行了");
        show4();
    }


    //普通的私有方法，只能服务默认方法
    private void show3(){
        System.out.println("记录程序在运行中的各种细节，这里有100行代码");
    }


    //静态的私有方法，只能服务静态方法
    private static void show4(){
        System.out.println("记录程序在运行中的各种细节，这里有100行代码");
    }
}
