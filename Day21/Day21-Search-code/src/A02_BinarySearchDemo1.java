public class A02_BinarySearchDemo1 {
    public static void main(String[] args) {
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int target = 131;
        System.out.println(getIndex(arr, target));
        System.out.println();
    }

    public static int getIndex(int[] arr, int target) {
        int min = 0;
        int max = arr.length - 1;
        while (true) {
            if (min > max) {
                return -1;
            }
            int mid = (max + min) / 2;
            if (target > arr[mid]) {
                min = mid + 1;
            } else if (target < arr[mid]) {
                max = mid - 1;
            } else {
                return mid;
            }
        }
    }
}
