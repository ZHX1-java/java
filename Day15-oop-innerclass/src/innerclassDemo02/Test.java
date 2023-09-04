package innerclassDemo02;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {



        Outer.Inner oi = new Outer().new Inner();
        oi.show();//内部类方法---show
        Outer o = new Outer();
        System.out.println(o.gerInstance());//innerclassDemo02.Outer$Inner@41629346

        //Object ob = o.gerInstance();
        //System.out.println(ob);

    }
}
