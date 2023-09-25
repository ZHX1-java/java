package Day18MathDemo;

public class MathDemo02 {
    public static void main(String[] args) {
        //素数的判断

        System.out.println(isPrime(761));
    }

    public static boolean isPrime(int number){
        int count = 0;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            count++;
            if (number % i == 0){
                return false;
            }
        }
        System.out.println(count);
        return true;
    }
}
