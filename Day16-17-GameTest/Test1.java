package GameTest;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        //打乱数组中的数
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;

        }
        //遍历打乱后的一维数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int newArr[][] = new int[4][4];


        System.out.println();

        //将一维数组添加到二维数组当中

        //解法一：
        //遍历一维数组，将一维数组中的各个元素依次添加到二维数组中
        for (int i = 0; i < arr.length; i++) {
            newArr[i / 4][i % 4] = arr[i];

        }
        System.out.println();

        //解法二：
        //遍历二维数组，给里面的每一个数据赋值
        int index = 0;
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                newArr[i][j] = arr[index];
                index++;
            }
        }
        //遍历二维数组
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }



    }


}
