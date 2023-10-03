package Day19RegexDemo;

import java.util.Scanner;

public class RegexDemo01 {
    public static void main(String[] args) {
        System.out.print("请输入qq");
        String qq = new Scanner(System.in).next();
        /*boolean flag = checkQQ(qq);
        System.out.println(flag);*/

        //正则表达式
        System.out.println(qq.matches("[1-9]\\d{5,19}"));
    }
    public static boolean checkQQ(String  qq){
        //规则：6位及20内之内，0不能开头，必须全是数字
        //核心思想
        //先把异常数据进行过滤
        //下面的就是满足要求的数据了
        if (qq.length() < 6 || qq.length() > 20){
            return false;
        }
        if (qq.startsWith("0")){//如果qq以0开始
            return false;
        }
        for (int i = 0; i < qq.length(); i++) {
            char c = qq.charAt(i);
            if (c < '0' || c > '9'){
                return false;
            }
        }
        return true;
    }
}
