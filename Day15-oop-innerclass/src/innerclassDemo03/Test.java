package innerclassDemo03;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        oi.getA();

        /*Scanner sc = new Scanner(System.in);
        sc.next();*/
    }
}
