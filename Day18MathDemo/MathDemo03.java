package Day18MathDemo;

public class MathDemo03 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10000; i <= 99999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;
            int wan = i / 10000 % 10;
            /*int shiwan = i / 100000 % 10;
            int baiwan = i / 1000000 % 10;
            int qianwan = i / 10000000 % 10;
            int yi = i / 100000000 % 10;*/
            double sum = Math.pow(ge,5) + Math.pow(shi,5) + Math.pow(bai,5) + Math.pow(qian,5) + Math.pow(wan,5) ;//+ Math.pow(shiwan,9) + Math.pow(baiwan,9) + Math.pow(qianwan ,9) + Math.pow(yi,9);
            if (sum == i){
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
}
