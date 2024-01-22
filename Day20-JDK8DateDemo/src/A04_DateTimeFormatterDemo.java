import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class A04_DateTimeFormatterDemo {
    public static void main(String[] args) {
        /*
            static DateTimeFormatter ofPattern(格式)          获取格式对象
            String fromat(时间对象)                             按照指定方式格式化
         */

        //获取事件对象
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));

        //解析/格式化器
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EE a");

        //格式化
        System.out.println(dtf1.format(time));//2023-11-18 10:33:41 周六 上午
    }
}
