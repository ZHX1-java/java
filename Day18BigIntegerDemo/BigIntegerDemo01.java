package Day18BigIntegerDemo;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo01 {
    public static void main(String[] args) {
        //获取一个随机大整数
        Random r = new Random();
        //BigInteger bd1 = new BigInteger(4,r);
        BigInteger bd1 = new BigInteger(4,new Random());
        System.out.println(bd1);//[0,15]


        //获取一个指定的大整数
        BigInteger bd2 = new BigInteger("9999");
        System.out.println(bd2);


        //获取一个指定进制的大整数
        //细节：
        //1.字符串中的数字必须是整数
        //2.字符串中的数字必须要跟进制吻合
        //比如二进制中，那么只能写0和1，写其他的就报错
        BigInteger bd3 = new BigInteger("100",2);//把二进制 100 幺零零  变成十进制  4
        System.out.println(bd3);



        //静态方法获取BigInteger的对象，内部有优化
        //细节：
        //1.能表示的范围比较小，只能在long的取值范围之内，如果超出long的范围就不行了
        //2.在内部对常用的数字: -16 ~ 16 进行了优化
        //   提前把 -16~16 先创建好BigInteger的对象，如果多次获取不会重新创建新的
        BigInteger bd4 = BigInteger.valueOf(100);
        System.out.println(bd4);
        BigInteger bd5 = BigInteger.valueOf(16);
        BigInteger bd6 = BigInteger.valueOf(16);
        System.out.println(bd5 == bd6);//true
        BigInteger bd7 = BigInteger.valueOf(17);
        BigInteger bd8 = BigInteger.valueOf(17);
        System.out.println(bd7 == bd8);//false
    }
}
