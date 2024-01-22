import java.util.Arrays;

public class ArraysDemo01 {
    public static void main(String[] args) {
        /*
            public static String toString(数组)                           把数组拼接成一个字符串
            public static int binarySearch(数组,查找的元素)                二分查找法查找元素
            public static int[] copyOf(原数组,新数组长度)                   拷贝数组
            public static int[] copyOfRange(原数组,起始索引,结束索引)       拷贝数组（指定范围）
            public static void fill(数组,元素)                             填充数组
            public static void sort(数组)                                 按照默认方式进行数组排序
            public static void sort(数组,排序规则)                         按照指定的规则排序
         */

        //toString(数组):把数组拼接成一个字符串
        System.out.println("---------------------toString---------------------");
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


        //binarySearch(数组,查找的元素):二分查找法查找元素
        //细节1：二分查找的前提必须数组是有序的， 数组中的元素必须是升序
        //细节2：如果我们要查找的元素纯在，那么返回的是真实的索引
        //      但是，如果要查找的元素是不存在的，返回的是 （ -插入点 - 1）
        //为什么要减1？
        // 如果此时要查找的元素是0，此时0是不存在的，但是按照上面规则-插入点，应该就是-0
        //为了避免这样的i情况，Java在这个基础上又 减1
        System.out.println("---------------------binarySearch---------------------");
        System.out.println(Arrays.binarySearch(arr,2)); //1
        System.out.println(Arrays.binarySearch(arr,10));// 9
        System.out.println(Arrays.binarySearch(arr,20));// -11


        //copyOf(原数组,新数组长度):拷贝数组
        //参数1：老数组
        //参数2：新数组的长度
        //方法的底层会根据第二个参数来创建新的数组
        System.out.println("---------------------copyOf---------------------");
        //如果新数组的长度等于老数组的长度，会完全拷贝
        int[] newArr1 = Arrays.copyOf(arr,10);
        System.out.println(Arrays.toString(newArr1));// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        //如果新数组的长度小于老数组的长度，会部分拷贝
        int[] newArr2 = Arrays.copyOf(arr,5);
        System.out.println(Arrays.toString(newArr2));// [1, 2, 3, 4, 5]
        //如果新数组的长度大于老数组的长度，会补上默认初始值
        int[] newArr3 = Arrays.copyOf(arr,20);
        System.out.println(Arrays.toString(newArr3));// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]



        //copyOfRange(原数组,起始索引,结束索引):拷贝数组（指定范围）
        //细节：包头不包围，包左不包右
        System.out.println("---------------------copyOfRange---------------------");
        int[] newArr4 = Arrays.copyOfRange(arr,2,7);// [2,7)
        System.out.println(Arrays.toString(newArr4));// [3, 4, 5, 6, 7]



        //fill(数组,元素):填充数组
        //用参数2 把数组中的所有元素覆盖
        System.out.println("---------------------fill---------------------");
        Arrays.fill(newArr1,100);
        System.out.println(Arrays.toString(newArr1));// [100, 100, 100, 100, 100, 100, 100, 100, 100, 100]


        //sort(数组):按照默认方式进行数组排序
        //默认情况下，给基本数据类型按升序排序，底层使用的是快速排序。
        System.out.println("---------------------sort---------------------");
        int[] arr2 = {4,62,6,9,12,5,7,1};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));// [1, 4, 5, 6, 7, 9, 12, 62]

    }
}
