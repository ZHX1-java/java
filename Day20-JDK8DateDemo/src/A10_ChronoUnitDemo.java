import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class A10_ChronoUnitDemo {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.of(2023, 11, 18, 13, 8, 21);
        LocalDateTime birthDate = LocalDateTime.of(2004, 7, 21, 0, 00, 00);
        System.out.println("相差的年数:" + ChronoUnit.YEARS.between(birthDate, today)); // 相差的年数:19
        System.out.println("相差的月数:" + ChronoUnit.MONTHS.between(birthDate, today)); // 相差的月数:231
        System.out.println("相差的周数:" + ChronoUnit.WEEKS.between(birthDate, today)); // 相差的周数:1008
        System.out.println("相差的天数:" + ChronoUnit.DAYS.between(birthDate, today)); // 相差的天数:7059
        System.out.println("相差的时数:" + ChronoUnit.HOURS.between(birthDate, today)); // 相差的时数:169429
        System.out.println("相差的分数:" + ChronoUnit.MINUTES.between(birthDate, today)); // 相差的分数:10165748
        System.out.println("相差的秒数:" + ChronoUnit.SECONDS.between(birthDate, today)); // 相差的秒数:609944901
        System.out.println("相差的毫秒数:" + ChronoUnit.MILLIS.between(birthDate, today)); // 相差的毫秒数:609944901000
        System.out.println("相差的微秒数:" + ChronoUnit.MICROS.between(birthDate, today)); // 相差的微秒数:609944901000000
        System.out.println("相差的纳秒数:" + ChronoUnit.NANOS.between(birthDate, today)); // 相差的纳秒数:609944901000000000
        System.out.println("相差的半天数:" + ChronoUnit.HALF_DAYS.between(birthDate, today)); // 相差的半天数:14119
        System.out.println("相差的十年数:" + ChronoUnit.DECADES.between(birthDate, today)); // 相差的十年数:1
        System.out.println("相差的世纪(百年)数:" + ChronoUnit.CENTURIES.between(birthDate, today)); // 相差的世纪(百年)数:0
        System.out.println("相差的千年数:" + ChronoUnit.MILLENNIA.between(birthDate, today)); // 相差的千年数:0
        System.out.println("相差的纪元数:" + ChronoUnit.ERAS.between(birthDate, today)); // 相差的纪元数:0
    }
}
