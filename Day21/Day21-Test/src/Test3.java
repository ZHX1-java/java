public class Test3 {
    public static void main(String[] args) {
        /*
            有一堆桃子，猴子第一天吃了其中的一半，并多吃了一个
            以后猴子媒体那吃当前剩下的一半，然后再多吃一个
            第十天的时候(还没吃)，发现只剩下一个桃子
            请问，最初总共多少桃子？



            day10:      1
            day9:       (day10 + 1) * 2 = 4
            day8:       (day9 + 1) * 2 = 10
                ....

            递归出口
                day == 10  剩下 1

            规律
                每天的桃子数量都是后一天数量 + 1 ，* 2
         */


        System.out.println(getCount(1));//1534
    }

    public static int getCount(int day) {
        if (day <= 0 || day >= 11) {
            return -1;
        }
        if (day == 10) {
            return 1;
        }

        return (getCount(day + 1) + 1) * 2;

    }
}
