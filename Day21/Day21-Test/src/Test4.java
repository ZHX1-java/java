public class Test4 {
    public static void main(String[] args) {

        /*
            小明爬楼梯时，有时候一次爬一个台阶，有时候一次爬两个台阶，
            如果有20个台阶，小明一共有多少种爬法
         */

        System.out.println(getCount(20)); //10946
    }
    //递归
    public static int getCount(int step) {
        if (step == 1) {
            return 1;
        }
        if (step == 2){
            return 2;
        }
        return getCount(step - 1) + getCount(step - 2);

    }

    //动态规划
    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        if (n == 3) {
            return 4;
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
