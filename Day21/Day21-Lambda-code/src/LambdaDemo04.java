import java.util.Arrays;

public class LambdaDemo04 {
    public static void main(String[] args) {
        String[] arr = {"aaa", "a", "b", "aa", "aaaa"};

        Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());

        System.out.println(Arrays.toString(arr));// [a, b, aa, aaa, aaaa]
    }
}
