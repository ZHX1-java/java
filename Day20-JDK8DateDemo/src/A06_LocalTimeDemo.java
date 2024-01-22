import java.time.LocalTime;

public class A06_LocalTimeDemo {
    public static void main(String[] args) {
        // 获取本地时间的日历对象。(包含 时分秒)
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);// 11:16:26.522531700

        //获取当前时间的  时
        int hour = nowTime.getHour();
        System.out.println(hour);   // 11

        //获取当前时间的  分
        int minute = nowTime.getMinute();
        System.out.println(minute); // 16

        //获取当前时间的  秒
        int second = nowTime.getSecond();
        System.out.println(second); // 26

        //获取当前时间的  纳秒
        int nano = nowTime.getNano();
        System.out.println(nano);   // 522531700

        System.out.println("------------------------------------");


        System.out.println(LocalTime.of(16,20));// 16:20
        System.out.println(LocalTime.of(15,34,52));// 15:34:52
        System.out.println(LocalTime.of(12,12,12,120211));// 12:12:12.000120211

        //is系列的方法
        LocalTime mTime = LocalTime.of(12,12,12,120211);
        System.out.println(mTime.isBefore(nowTime));// false
        System.out.println(mTime.isAfter(nowTime));// true


        ////with系列的方法，只能修改时、分、秒
        System.out.println(mTime);
        LocalTime withLocalTime = mTime.withHour(17);// 12:12:12.000120211
        System.out.println(withLocalTime);//        17:12:12.000120211

        //plus系列的方法，只能修改时、分、秒
        System.out.println(mTime.plusMinutes(15));//12:27:12.000120211

        //minus系列的方法，只能修改时、分、秒
        System.out.println(mTime.minusHours(3));//09:12:12.000120211

    }
}
