import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test04 {
    public static void main(String[] args) throws ParseException {
        //请使用代码实现计算你活了多少天，用JDK7和JDK8两种方式完成
        //JDK7
        //规则:只要对时间进行计算或者判断，都需要先获取当前时间的毫秒值
        String birthDate = "2004年7月21日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(birthDate);
        long birthTime = date.getTime();
        long nowTime = System.currentTimeMillis();
        long time = nowTime - birthTime;
        System.out.println(time / 1000 / 60 / 60 / 24);// 7060


        //JDK8
        LocalDate birth = LocalDate.of(2004, 7, 21);
        LocalDate now = LocalDate.now();
        //long totalDays = ChronoUnit.DAYS.between(birthDate, now);
        System.out.println(ChronoUnit.DAYS.between(birth, now));// 7060
    }
}
