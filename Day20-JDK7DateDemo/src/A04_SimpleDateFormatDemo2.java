import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A04_SimpleDateFormatDemo2 {
    public static void main(String[] args) throws ParseException {
        /*
            假设，出生年月日位：2000-11-11
            请用字符串表示这个数据，并将其转换为：2000年11月11日
         */
        String birth = "2000-11-11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(birth);
        System.out.println(date);
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
        String str = sdf1.format(date);
        System.out.println(str);
    }
}
