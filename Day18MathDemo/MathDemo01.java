package Day18MathDemo;

public class MathDemo01 {
    public static void main(String[] args) {
        //Math.abs --- 取绝对值
        System.out.println(Math.abs(198));//198
        System.out.println(Math.abs(-198));//198
        System.out.println(Math.abs(-2147483647));//2147483647
        System.out.println(Math.abs(-2147483648));//-2147483648
        System.out.println(Integer.MIN_VALUE);
        //System.out.println(Math.absExact(-2147483648));
        //Math.absExact,如果等于int取值范围的最小值就报错


        System.out.println("*****************************************");


        //Math.ceil --- 向上取整   进一法，向数轴的正方向进一
        System.out.println(Math.ceil(1.9));// 2.0
        System.out.println(Math.ceil(1.1));// 2.0
        System.out.println(Math.ceil(-1.9));// -1.0
        System.out.println(Math.ceil(-1.1));// -1.0


        System.out.println("*****************************************");


        //Math.floor --- 向下取整
        System.out.println(Math.floor(1.9));// 1.0
        System.out.println(Math.floor(9.9));// 9.0
        System.out.println(Math.floor(-1.9));// -2.0
        System.out.println(Math.floor(-9.9));// -10.0


        System.out.println("*****************************************");


        //Math.round --- 四舍五入   --- 只跟小数点后一位的大小有关
        System.out.println(Math.round(3.14));// 3
        System.out.println(Math.round(3.15));// 3
        System.out.println(Math.round(3.45));// 3
        System.out.println(Math.round(3.55));// 4


        System.out.println("*****************************************");


        //Math.max() --- 获取两数最大值
        System.out.println(Math.max(10, 20));//20
        System.out.println(Math.max(-10, -20));//-10


        System.out.println("*****************************************");


        //Math.min() --- 获取两数最小值
        System.out.println(Math.min(10, 20));//10
        System.out.println(Math.min(-10, -20));//-20


        System.out.println("*****************************************");


        //Math.pow() --- 返回a的b次幂
        System.out.println(Math.pow(2, 3));//8.0
        System.out.println(Math.pow(4, 0.5));//2.0
        System.out.println(Math.pow(2,-2));//0.25


        System.out.println("*****************************************");


        //Math.sqrt()  ---  开(算术)平方根
        System.out.println(Math.sqrt(16));//4.0

        System.out.println("*****************************************");

        //Math.cbrt()  --- 开立方根
        System.out.println(Math.cbrt(8));//2.0

        System.out.println("*****************************************");

        //Math.random() --- 获取[0,1) 之间的随机数
        System.out.println(Math.random());//如：0.9381155560121202
        System.out.println(Math.floor(Math.random() * 100 + 1));//获取1-100之间的随机数


    }
}
