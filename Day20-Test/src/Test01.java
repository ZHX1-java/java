import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        //键盘录入一些1~100之间的整数，并添加到集合当中
        //知道集合中所有数据的和超过200为止
        Scanner sc = new Scanner(System.in);
        //String str = sc.nextLine();
        ArrayList<Integer> list = new ArrayList<>();
        while (true){
            System.out.println("请输入一个整数");
            String numStr = sc.nextLine();
            int num = Integer.parseInt(numStr);
            if (num < 1 || num > 100){
                System.out.println("输入的数据不在1~100之间");
                continue;
            }
            list.add(num);
            //list.add(Integer.valueOf(num));
            if (getSum(list) > 200){
                System.out.println(getSum(list));
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static int getSum(ArrayList<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
