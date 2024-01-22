import java.time.Duration;
import java.time.LocalDateTime;

public class A09_DurationDemo {
    public static void main(String[] args) {
        //获取当前本地时间
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);// 2023-11-18T11:56:05.743517200

        //制定一个日期
        LocalDateTime birthDateTime = LocalDateTime.of(2004, 7,
                21, 0, 00, 00);
        System.out.println(birthDateTime);// 2004-07-21T00:00


        //计算两时间间隔
        Duration duration = Duration.between(birthDateTime,today);//第二个参数 减去 第一个参数
        System.out.println(duration); //PT169427H56M5.7435172S  两时间相差169427个小时56分钟5.7435172S秒


        System.out.println(duration.toDays());// 7059天
        System.out.println(duration.toHours());// 169427小时
        System.out.println(duration.toMinutes());// 10165676分钟
        System.out.println(duration.toSeconds());// 609940565秒
        System.out.println(duration.toMillis());// 609940565743微秒
        System.out.println(duration.toNanos());// 609940565743517200纳秒
    }
}
