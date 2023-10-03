package Day19RegexDemo;

public class RegexDemo02 {
    public static void main(String[] args) {
        //public boolean matches(String regex):判断是否与正则表达式匹配，匹配返回true

        //只能是 a   b   c
        System.out.println("---------------1---------------");
        System.out.println("a".matches("[abc]"));// true
        System.out.println("f".matches("[abc]"));// false
        System.out.println("ab".matches("[abc]"));// false
        System.out.println("ab".matches("[abc][abc]"));// true



        //不能出现 a   b   c
        System.out.println("---------------2---------------");
        System.out.println("a".matches("[^abc]"));// false
        System.out.println("z".matches("[^abc]"));// true
        System.out.println("zz".matches("[^abc]"));// false
        System.out.println("zz".matches("[^abc][^abc]"));// true
        System.out.println("zz".matches("[^abc][^abc]"));// true
                            //第一个z会跟第一个[^abc]判断
                            //第二个z会跟第二个[^abc]判断


        //  a到z   A到Z（包括头尾的范围）
        System.out.println("---------------3---------------");
        System.out.println("a".matches("[a-zA-z]"));// true
        System.out.println("z".matches("[a-zA-z]"));// true
        System.out.println("aa".matches("[a-zA-z]"));// false
        System.out.println("zz".matches("[a-zA-z]"));// false
        System.out.println("zz".matches("[a-zA-z][a-zA-z]"));// false
        System.out.println("0".matches("[a-zA-z]"));// false
        System.out.println("0".matches("[a-zA-z0-9]"));// true
        System.out.println("0".matches("[0-9]"));// true
        System.out.println("0".matches("[^a-zA-Z]"));// true


        //  [a-d[m-p]]   a到d，或m到p    也可以是[a-dm-p]  只是方便区分
        System.out.println("---------------4---------------");
        System.out.println("a".matches("[a-d[m-p]]"));// true
        System.out.println("d".matches("[a-d[m-p]]"));// true
        System.out.println("m".matches("[a-d[m-p]]"));// true
        System.out.println("p".matches("[a-d[m-p]]"));// true
        System.out.println("e".matches("[a-d[m-p]]"));// false
        System.out.println("0".matches("[a-d[m-p]]"));// false



        //   [a-z&&[def]]    a-z和def的交际。   为：d，e，f
        //细节：如果要求两个范围的交集，那么需要写符号 &&
        //如果写成一个 & ，那么此时 & 表示的就不是交集了，而是一个简简单单的 & 符号
        System.out.println("---------------5---------------");
        System.out.println("a".matches("[a-z&&[def]]"));// false
        System.out.println("a".matches("[a-z&[def]]"));// true
        System.out.println("&".matches("[a-z&[def]]"));// true
        System.out.println("d".matches("[a-z&&[def]]"));// true
        System.out.println("0".matches("[a-z&&[def]]"));// false



        //   [a-z&&[^bc]]     z-a和非bc的交集。（等同于[ad-z]）
        System.out.println("---------------6---------------");
        System.out.println("a".matches("[a-z&&[^bc]]"));// true
        System.out.println("b".matches("[a-z&&[^bc]]"));// false
        System.out.println("0".matches("[a-z&&[^bc]]"));// false


        // [a-z&&[m-p]] a到z除了m到p的交集。  (等同于[a-lq-z])
        System.out.println("---------------7---------------");
        System.out.println("a".matches("[a-z&&[^m-p]]"));// true
        System.out.println("m".matches("[a-z&&[^m-p]]"));// false
        System.out.println("0".matches("[a-z&&[^m-p]]"));// false


    }
}
