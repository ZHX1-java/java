import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        /*
            判断任意的一个年份是闰年还是平年要求:用JDK7和JDK8两种方式判断提示:
            二月有29天是闰年一年有366天是闰年
        */
        Scanner sc = new Scanner(System.in);
        String yearStr = sc.nextLine();// 1952
        int year = Integer.parseInt(yearStr);
        //jdk7
        Calendar c = Calendar.getInstance();
        //月份的范围是0-11
        //01月  1 2月……11 12月
        c.set(year,2,1);//这里的 2 就代表着三月份
        c.add(Calendar.DAY_OF_MONTH,-1);
        System.out.println(c.get(Calendar.DAY_OF_MONTH) == 29);// true


        //jdk8
        LocalDate ld1 = LocalDate.of(year,3,1);
        LocalDate ld2 = ld1.minusDays(1);
        // System.out.println(ld2.getDayOfMonth() == 29);// true
        //判断闰年的方法
        //返回值是一个boolean类型
        System.out.println(ld1.isLeapYear());// true



    }
}
