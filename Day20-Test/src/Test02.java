import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        /*
            自己实现parseInt方法的效果，将字符串形式的数据转成整数。要求:
            字符串中只能是数字不能有其他字符最少一位，最多10位,0不能开头
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        String str = sc.nextLine();
        String regex = "[1-9]\\d{0,9}"; // 或则 ^0[0-9]{1,10}
        if (str.matches(regex)){
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                sum = (sum * 10) + str.charAt(i) - '0';
            }
            System.out.println(sum);
        }else System.out.println("输入的数据类型有误");
    }
}
