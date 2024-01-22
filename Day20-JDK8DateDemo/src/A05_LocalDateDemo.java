import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class A05_LocalDateDemo {
    public static void main(String[] args) {
        //1.获取当前时间的日历对象(包含 年月日)
        LocalDate nowDate = LocalDate.now();//只获取当前时间的  年月日
        System.out.println("当前日期为:" + nowDate);// 当前日期为:2023-11-18
        System.out.println("**********************************************");
        //2.获取指定的时间的日历对象
        LocalDate ldDate = LocalDate.of(2004,7,21);
        System.out.println("指定时间为：" + ldDate);//指定时间为：2004-07-21
        System.out.println("**********************************************");
        //3.get系列方法获取日历中的每一个属性值//获取年
        int year = ldDate.getYear();
        System.out.println(year);// 2004
        System.out.println("**********************************************");
        //获取月
        // 方式一:
        Month m = ldDate.getMonth();
        System.out.println(m);// JULY
        System.out.println(m.getValue());// 7
        System.out.println("**********************************************");
        //方式二:
        int month = ldDate.getMonthValue();
        System.out.println(month);// 7
        System.out.println("**********************************************");
        //获取日
        int day = ldDate.getDayOfMonth();
        System.out.println(day);// 21
        System.out.println("**********************************************");
        //获取一年的第几天
        int dayofyear = ldDate.getDayOfYear();
        System.out.println(dayofyear);// 203
        System.out.println("**********************************************");
        //获取星期
        DayOfWeek dayOfWeek = ldDate.getDayOfWeek();
        System.out.println(dayOfWeek);// WEDNESDAY
        System.out.println(dayOfWeek.getValue());// 3
        System.out.println("**********************************************");
        //is开头的方法表示判断
        System.out.println(ldDate.isBefore(nowDate));// true
        System.out.println(ldDate.isAfter(nowDate));// false
        System.out.println("**********************************************");

        //with开头的方法表示修改，只能修改年月日

        //对象中的数据是不能发生改变的，如果要修改，就会产生一个新的对象

        LocalDate withLocalDate = ldDate.withYear(2000);
        System.out.println(withLocalDate);// 2000-07-21
        System.out.println("**********************************************");
        //minus开头的方法表示减少，只能减少年月日
        LocalDate minusLocalDate = ldDate.minusMonths(2);
        System.out.println(minusLocalDate);// 2004-05-21
        System.out.println("**********************************************");
        //plus开头的方法表示增加，只能增加年月日
        LocalDate plusLocalDate = ldDate.plusDays(2);
        System.out.println(plusLocalDate);// 2004-07-23
        System.out.println("**********************************************");

        // 判断今天是否是你的生日
        LocalDate birthDate = LocalDate.of(2004,7,21);//指定日期
        LocalDate nowDate1 = LocalDate.now();//获取当前日期
        //生日只比较 月和日
        //第一种获取日月方法
        MonthDay birthMD1 = MonthDay.of(birthDate.getMonthValue(),birthDate.getDayOfMonth());
        MonthDay nowMD1 = MonthDay.of(nowDate1.getMonthValue(),nowDate1.getDayOfMonth());
        System.out.println(birthMD1);// --07-21
        System.out.println(nowMD1);// --11-18
        System.out.println("今天是你生日吗？" + birthMD1.equals(nowMD1));//今天是你生日吗？false
        System.out.println("**********************************************");
        //第二种
        MonthDay birthMD2 = MonthDay.from(birthDate);
        MonthDay nowMD2 = MonthDay.from(nowDate1);
        System.out.println(birthMD2);// --07-21
        System.out.println(nowMD2);// --11-18
        System.out.println("今天是你生日吗？" + birthMD1.equals(nowMD1));//今天是你生日吗？false


    }
}
