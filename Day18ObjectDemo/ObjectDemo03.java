package Day18ObjectDemo;

public class ObjectDemo03 {
    public static void main(String[] args) {
        String s = "abc";
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(s.equals(sb));//false
        //sb传的是sb的地址值
        /*
        因为equals方法是被s调用的，而s是字符串
        所以equals要看String类中的
        字符串中的equals方法，先判断参数是否为字符串
        如果是字符串，在比较内部的属性
        但是，如果参数不是字符串，直接返回false
         */

        System.out.println(sb.equals(s));//false
        /*
        因为equals方法是被sb调用的，而sb是StringBuilder
        所以这里的equals方法要看StringBuilder类中的equals方法
        那么在StringBuilder当中，没有重写equals方法
        在Object当中默认是使用==好比较两个对象的地址值
        而这里s和sb记录的地址值是不一样的，所以结果返回一个false
         */
    }
}
