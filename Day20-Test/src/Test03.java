public class Test03 {
    public static void main(String[] args) {
        /*

            定义一个方法自己实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制

         */
        int num = 100;
        System.out.println(toBinaryString(100));
        System.out.println(Integer.toBinaryString(100).toString().equals(toBinaryString(num)));// true
    }
    public static String toBinaryString(int num){
        StringBuilder sb = new StringBuilder();
        while (num != 0){
            sb.append(num % 2);
            num /= 2;
        }
        return sb.reverse().toString();
    }
}
