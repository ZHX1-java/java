import java.util.Scanner;

public class A05_IntegerDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*String str = sc.next();// 123 123
        System.out.println(str);//123*/
        //弊端:
        //当我们在使用next，nextInt，nextDouble在接收数据的时候，遇到空格，回车，制表符的时候就停止了
        //键盘录入的是123 123 那么此时只能接收到空格前面的数据
        //我想要的是接收一整行数据
        //约定:
        //以后我们如果想要键盘录入，不管什么类型，统一使用nextLine
        //特点:遇到回车才停止

        String line = sc.nextLine();// zhang 123 3.14
        System.out.println(line);// zhang 123 3.14

        String num1 = sc.nextLine();
        int i = Integer.parseInt(num1);// 123
        System.out.println(i);// 123
        System.out.println(i + 2);// 125


        String num2 = sc.nextLine();// 3.14
        double v = Double.parseDouble(num2);
        System.out.println(v);// 3.14
        System.out.println(v + 2);// 5.140000000000001

    }
}
