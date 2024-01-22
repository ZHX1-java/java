import java.time.LocalDate;
import java.time.Period;

public class A08_PeriodDemo {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(2004,7,21);
        System.out.println(birthDate);// 2004-07-21

        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate);// 2023-11-18

        Period period = Period.between(birthDate,nowDate);// 第二个参数 减去 第一个参数
        System.out.println(period);//P19Y3M28D 相差 19年3个月28天

        System.out.println(period.getYears());// 19
        System.out.println(period.getMonths());// 3
        System.out.println(period.getDays());// 28


        System.out.println(period.toTotalMonths());// 两个时间相差 231个月

    }
}
