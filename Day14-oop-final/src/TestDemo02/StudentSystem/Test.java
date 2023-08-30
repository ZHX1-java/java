package TestDemo02.StudentSystem;

import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        System.out.println(getCode());
    }

    public static String getCode() {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int num = r.nextInt(list.size());
            sb.append(list.get(num));
        }
        int number = r.nextInt(10);
        sb.append(number);
        char arr[] = sb.toString().toCharArray();
        char temp = 0;
        String str = "";
        int index = r.nextInt(arr.length);
        temp = arr[index];
        arr[index] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        return new String(arr);
    }
}
