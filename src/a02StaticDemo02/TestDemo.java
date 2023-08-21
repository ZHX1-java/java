package a02StaticDemo02;

public class TestDemo {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6};
        String str = ArrayUtil.printArr(arr1);
        System.out.println(str);

        double arr2[] = {1.2, 2.4, 56.2, 52.3};
        double avg = ArrayUtil.getaAverage(arr2);
        System.out.println(avg);
    }
}
