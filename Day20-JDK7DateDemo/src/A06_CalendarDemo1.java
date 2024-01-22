import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class A06_CalendarDemo1 {
    public static void main(String[] args) {
        /*
            public static Calendar lgetInstance()               获取当前时间的日历对象
            public final Date getTime()                         获取日期对象
            public final setTime(Date date)                     给日历设置日期对象
            public long getTimeInMillis()                       拿到时间毫秒值
            public void setTimeInMillis(long millis)            给日历设置时间毫秒值
            public int get(int field)                           获取日期中的某个字段信息
            public void set(int field,int value)                修改日历的某个字段信息
            public void add(int field,int amount)               为某个字段增加/减少指定的值
        */


        //1.获取日历对象
        //细节： Calendar是一个抽象类，不能直接new，而是通过一个静态方法获取到子类对象
        //底层原理：
        //   会根据系统的不同时区来获取不同的日历对象，默认表示当前时间
        //会把时间中的纪元，年，月，日，时，分，秒，星期，等等的都放到一个数组当中
        //0  :  纪元
        //1  :  年
        //2  :  月
        //3  :  一年中的第几周
        //4  :  一个月中的第几周
        //5  :  一个月中的第几天（日期）
        //......


        //细节2：
        //   月份：范围0~11   如果获取出来的时0，那么实际上时1月      如果是11，实际上是12月
        //    原因：  把时间中的所有东西都放到数组中
        //星期：在老外的眼里，星期日时一周中的第一天
        //    1（星期日）   2（星期一）   3（星期二）  4（星期三）  5（星期四）  6（星期五）  7（星期六）

        Calendar c = Calendar.getInstance();
        System.out.println(c);

        //2.修改以下日历代表的方法
        Date d = new Date(0L);
        c.setTime(d);


        //System.out.println(c);
        //   public int get(int field)                           获取日期中的某个字段信息
        //   public void set(int field,int value)                修改日历的某个字段信息
        //   public void add(int field,int amount)               为某个字段增加/减少指定的值


        //修改日历的某个字段信息
        c.set(Calendar.YEAR,2023);
        c.set(Calendar.MONTH,11);// 12月
        //如果这里是12，则为 2024，1
        //如果数值大于11,则会按照超出的月份向上加到年里
        c.set(Calendar.DATE,10);

        //为某个字段增加/减少指定的值
        c.add(Calendar.YEAR,10);
        c.add(Calendar.MONTH,2);//加了3个月
        c.add(Calendar.DATE,10);//  2034,2, 20, 星期三
        c.add(Calendar.DATE,-5);//  2034,2, 15, 星期二

        //获取日期中的某个字段信息
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        int week = c.get(Calendar.WEEK_OF_MONTH);
        System.out.println(year + "," + month + ", " + date + ", " + getWeek(week));//  1970,1, 1, 星期日
        //  1970,0, 1  这里月份位0是因为数组的1月份为0索引

    }

    public static String getWeek(int index) {
        String arr[] = {"", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        return arr[index];
    }
}
