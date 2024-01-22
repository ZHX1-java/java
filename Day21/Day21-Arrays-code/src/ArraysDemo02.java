import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo02 {
    public static void main(String[] args) {
        /*
            public static void sort(数组，排序规则)        按照指定规则排序

            参数一：要排序的数组
            参数二：排序的规则
            //细节：
                    只能给引用数据类型的数组进行排序
                    如果数组是基本类型的，需要变成其对应的包装类
         */

        Integer[] arr = {6, 4, 5, 9, 2, 3, 1, 7, 8, 10};

        //简单理解： o1 - o2  升序
        //          o2 - o1  降序
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        System.out.println(Arrays.toString(arr));// [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
    }
}
