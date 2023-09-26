package Day18BigDecimalDemo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo03 {
    public static void main(String[] args) {
        /*
            public BigDecimal add(BigDecimal val) 加法
            public BigDecimal subtract(BigDecimal val) 减法
            public BigDecimal multiply(BigDecimal val) 乘法
            public BigDecimal divide(BigDecimal val) 除法
            public BigDecimal divide(BigDecimal val，精确几位，舍入模式)除法
        */

        //1.加法
        BigDecimal bd1 = BigDecimal.valueOf(10.0);
        BigDecimal bd2 = BigDecimal.valueOf(2.0);
        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd3);// 12.0


        //2.减法
        BigDecimal bd4 = bd1.subtract(bd2);
        System.out.println(bd4);// 8.0

        //3.乘法
        BigDecimal bd5 = bd1.multiply(bd2);
        System.out.println(bd5);// 20.00

        //4.除法
        BigDecimal bd6 = BigDecimal.valueOf(4.0);
        BigDecimal bd7 = BigDecimal.valueOf(3.0);
        BigDecimal bd8 = bd1.divide(bd2);
        System.out.println(bd8);// 5
        BigDecimal bd9 = bd1.divide(bd6);
        System.out.println(bd9);// 2.5
        BigDecimal bd10 = bd1.divide(bd7,2,RoundingMode.HALF_UP);  // 四舍五入并保留两位小数
        System.out.println(bd10);// 3.33


    }
}
