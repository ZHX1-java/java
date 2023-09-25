package Day18RuntimeDemo;

import java.io.IOException;

public class RuntimeDemo01 {
    public static void main(String[] args) throws IOException {

        //1.获取Runtime的对象
        Runtime r1 = Runtime.getRuntime();
        Runtime r2 = Runtime.getRuntime();
        System.out.println(r1);
        System.out.println(r2);


        //2.exit  停止虚拟机
        //0:表示当前虚拟机是正常停止
        //非0:表示当前虚拟机异常停止
        //是System.exit(); 的底层代码
        //Runtime.getRuntime().exit(0);


        //3.获取cpu的线程数
        System.out.println(Runtime.getRuntime().availableProcessors());

        //4.获取总内存大小，单位byte（字节）
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);// 除一次--KB，两次--MB  /1024 --KB  / 1024 --- MB

        //5.获取已经从系统中获取的总内存大小，单位byte（字节）
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);//254


        //6.获取剩余内存大小
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);//251说明已经用了3MB了


        //7.运行cmd命令
        Runtime.getRuntime().exec("calc");
    }
}
