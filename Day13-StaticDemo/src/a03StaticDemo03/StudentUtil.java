package a03StaticDemo03;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil() {
    }

    public static int getMax(ArrayList<Student> list) {
        //获取最大值
        int max = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            //max = max > list.get(i).getAge() ? max : list.get(i).getAge();
            max = Math.max(max, list.get(i).getAge());
        }
        return max;
    }
}
