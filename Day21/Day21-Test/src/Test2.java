public class Test2 {
    public static void main(String[] args) {
        //斐波那契
        System.out.println(Fib(12));
    }
    public static int Fib(int num){
        if (num <= 2){    /*if(num == 1 || num == 2)*/
            return 1;
        }else {
            return Fib(num - 1) + Fib(num - 2);
        }
    }
}
