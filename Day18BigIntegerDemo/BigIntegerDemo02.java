package Day18BigIntegerDemo;

import java.math.BigInteger;

public class BigIntegerDemo02 {
    public static void main(String[] args) {
        /*
            public BigInteger add(BigInteger val) 加法
            public BigInteger subtract(BigInteger val) 减法
            public BigInteger multiply(BigInteger val) 乘法
            public BigInteger divide(BigInteger val) 除法，获取商
            public BigInteger[] divideAndRemainder(BigInteger val) 除法，获取商和余数
            public boolean equals(Object x) 比较是否相同
            public BigInteger pow(int exponent) 次幂
            public BigInteger max/min(BigInteger val) 返回较大值/较小值
            public int intValue(BigInteger val) 转为int类型整数，超出范围数据有误
        */

        //创建两个BigInteger对象
        BigInteger bd1 = BigInteger.valueOf(10);
        BigInteger bd2 = BigInteger.valueOf(3);


        //加法
        BigInteger bd3 = bd1.add(bd2);
        System.out.println(bd3);//13

        //减法
        BigInteger subtract = bd1.subtract(bd2);
        System.out.println(subtract);//7


        //乘法
        BigInteger multiply = bd1.multiply(bd2);
        System.out.println(multiply);//30


        //除法，获取商
        BigInteger divide = bd1.divide(bd2);
        System.out.println(divide);//商为： 3

        //除法，获取商和余数
        BigInteger[] arr = bd1.divideAndRemainder(bd2);
        System.out.println(arr[0]);//商为 ：3
        System.out.println(arr[1]);//余数为 ： 1


        //比较是否相同
        boolean result = bd1.equals(bd2);
        System.out.println(result);//false


        //次幂
        BigInteger bd4 = bd1.pow(2);
        System.out.println(bd4);//100


        //返回较大值/较小值
        BigInteger max = bd1.max(bd2);
        BigInteger min = bd1.min(bd2);
        System.out.println(max);//10
        System.out.println(min);//3
        System.out.println(max==bd1);//true


        //转为int类型整数，超出范围数据有误
        /*BigInteger bd5 = BigInteger.valueOf(2147483648L);
        int i = bd5.intValue();
        System.out.println(i);//-2147483648*/
        BigInteger bd5 = BigInteger.valueOf(200);
        double v = bd5.doubleValue();
        System.out.println(v);//200.0

    }
}
