public class A05_QuickSortDemo {
    public static void main(String[] args) {
        /*
        快速排序：
            第一轮：以0索引的数字为基准数，确定基准数在数组中正确的位置。
            比基准数小的全部在左边，比基准数大的全部在右边。
            后面以此类推。
      */

        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};

        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int[] arr, int i, int j) {
        int start = i;
        int end = j;
        //递归的出口
        if (start > end){
            return;
        }
        //基准数
        int baseNumber = arr[i];

        while (start != end) {
            ////利用end，从后往前开始找，找比基准数小的数字
            while (true) {
                if (end <= start || arr[end] < baseNumber) {
                    break;
                }
                end--;
            }

            //利用start，从前往后找，找比基准数大的数字
            while (true) {
                if (end <= start || arr[start] > baseNumber) {
                    break;
                }
                start++;
            }

            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
        }
        //当start和end指向了同一个元素的时候，那么上面的循环就会结束
        //表示已经找到了基准数在数组中应存入的位置
        //基准数归位
        //就是拿着这个范围中的第一个数字，跟start指向的元素进行交换
        int temp = arr[end];
        arr[end] = arr[i];
        arr[i] = temp;
        //确定基准数左边的范围，重复刚刚所做的事情
        quickSort(arr, i, start - 1);
        //确定基准数右边的范围，重复刚刚所做的事情
        quickSort(arr, start + 1, j);
    }
}
