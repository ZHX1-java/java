import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A03_SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        /*
                public SimpleDateFromat()                   默认格式
                public SimpleDateFromat(String pattern)     默认格式

                public final String format(Date date)       格式化(日期对象 -> 字符串)
                public Date parse(String source)            解析(字符串 -> 日期对象)

         */

        //1.定义一个字符串表示时间
        String str = "2023-11-11 11:11:11";
        //2.利用空参构造创建SimpleDateFromat对象
        //细节：
        //    创建时间对象的格式要跟字符串格式完全一致
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);
        //打印结果
        System.out.println(date.getTime());// 获取时间的毫秒值 1699672271000


        method();
    }

    private static void method() {
        //1.利用空参构造创建SimpleDateformat对象，默认格式
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        Date d1 = new Date(0L);
        String str1 = sdf1.format(d1);
        System.out.println(str1);// 中国的时间原点   1970/1/1 上午8:00


        //2.利用但参构造创建SimpleDateFormat对象，指定格式
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
        Date d2 = new Date();
        String str2 = sdf2.format(d2);
        System.out.println(str2);//  2023年10月09日 20:02:12 周一


        //课堂练习：yyyy年MM月dd日 时：分：秒  星期E
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEEE");
        Date d3 = new Date();
        String str3 = sdf3.format(d3);
        System.out.println(str3);//  2023年10月06日 17:53:10 星期五
    }
}
