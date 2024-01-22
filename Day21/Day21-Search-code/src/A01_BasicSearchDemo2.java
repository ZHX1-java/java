import java.util.ArrayList;
import java.util.List;

public class A01_BasicSearchDemo2 {
    public static void main(String[] args) {
        //课堂练习1
        //需求：定义一个方法利用基本查找，查询某个元素的索引
        //不考虑数据重复

        int[] num = {131,127,147,81,103,23,7,79,81};
        int number = 81;
        System.out.println(getIndex(num,number));



        //课堂练习2
        //需求：定义一个方法利用基本查找，查询某个元素的索引
        //考虑数据重复
        int[] arr = {131,127,147,81,103,23,7,79,81};
        int target = 81;

        ArrayList<Integer> list = getRepeatIndex(arr, target);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    //不考虑数据重复
    public static int getIndex(int[] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                return i;
            }
        }
        return -1;
    }


    //考虑数据重复
    public static ArrayList<Integer> getRepeatIndex(int[] arr, int number){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                list.add(i);
            }
        }
        return list;
    }
}
