import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A05_SimpleDateFormatDemo3 {
    public static void main(String[] args) throws ParseException {
        /*
            /* 需求:
            秒杀活动开始时间:2023年11月11日 0:0:0(毫秒值)
            秒杀活动结束时间:2023年11月11日 0:10:0(毫秒值)

            小贾下单并付款的时间为:2023年11月11日 0:01:0
            小皮下单并付款的时间为:2023年11月11日 0:11:0
            用代码说明这两位同学有没有参加上秒杀活动?
         */

        //定义三个字符串表示时间
        String start = "2023年11月11日 0:0:0";
        String end = "2023年11月11日 0:10:0";
        String time1 = "2023年11月11日 0:01:0";
        String time2 = "2023年11月11日 0:11:0";

        //解析
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDate = sdf.parse(start);
        Date endDate = sdf.parse(end);
        Date time1Date = sdf.parse(time1);
        Date time2Date = sdf.parse(time2);

        //获取时间的毫秒值
        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        long time1Time = time1Date.getTime();
        long time2Time = time2Date.getTime();

        if (time1Time >= startTime && time1Time <= endTime){
            System.out.println("小贾参加上了秒杀活动");
        }else if (time2Time >= startTime && time2Time <= endTime){
            System.out.println("小皮参加上了秒杀活动");
        }else System.out.println("都超时了");

    }
}
