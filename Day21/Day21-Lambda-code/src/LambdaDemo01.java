import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo01 {
    public static void main(String[] args) {
        Integer[] arr = {6, 4, 5, 9, 2, 3, 1, 7, 8, 10};


        /*Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });*/


        Arrays.sort(arr, (Integer o1, Integer o2) -> {
                    return o2 - o1;
                }
        );

        System.out.println(Arrays.toString(arr));// [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
    }
}
