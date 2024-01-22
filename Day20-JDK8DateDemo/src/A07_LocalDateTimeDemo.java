import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class A07_LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("今天是：" + nowDateTime);// 2023-11-18T11:23:48.959795700
        System.out.println("年" + nowDateTime.getYear());//年2023
        System.out.println("月" + nowDateTime.getMonth().getValue());//月11
        System.out.println("日" + nowDateTime.getDayOfMonth());//日18
        System.out.println("时" + nowDateTime.getHour());//时11
        System.out.println("分" + nowDateTime.getMinute());//分27
        System.out.println("秒" + nowDateTime.getSecond());//秒54
        System.out.println("纳秒" + nowDateTime.getNano());//纳秒213579500

        //一年中的第几天
        System.out.println("今天是一年中的第：" + nowDateTime.getDayOfYear() + "天");//今天是一年中的第：322天
        //星期几
        System.out.println("今天是星期：" + nowDateTime.getDayOfWeek());//今天是星期SATURDAY
        System.out.println("今天是星期：" + nowDateTime.getDayOfWeek().getValue());//今天是星期6
        //月份
        System.out.println("今天是几月： " + nowDateTime.getMonth());// 今天是几月： NOVEMBER
        System.out.println("今天是几月： " + nowDateTime.getMonth().getValue());// 今天是几月： 11

        //将 LocalDateTime -> LocalDate
        LocalDate ld = nowDateTime.toLocalDate();
        System.out.println(ld);// 2023-11-18

        ////将 LocalDateTime -> LocalTime
        LocalTime lt = nowDateTime.toLocalTime();
        System.out.println(lt);// 11:34:18.085723100

    }
}
