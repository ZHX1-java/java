package Day19RegexDemo;

public class RegexDemo03 {
    public static void main(String[] args) {
        //  \ 转义字符    改变了后面那个字符原本的含义
        // 练习： 以字符串的形式打印一个双引号
        //  "  在Java中表示字符串的开头或结尾   以一对的形式出现

        //  \"   此时 \ 就表示转义字符，改变了后面那个双引号原本的含义
        //  把他变成了一个普普通通的双引号而已。
        System.out.println("\"");// 打印结果  "

        //  \  表示转义字符
        //  \\  前面的 \ 是一个转义字符，改变了垢面 \ 原本的含义，把他变成了一个普普通通的 \ 而已
        System.out.println("E:\\IDEA\\代码\\Day18\\src\\Day18RegexDemo\\RegexDemo03.java");


        System.out.println("--------------1--------------");
        //  .  表示任意一个字符   一个 . 只能对应一个字符
        System.out.println("你".matches("."));// true
        System.out.println("你a".matches("."));// false
        System.out.println("你".matches(".."));// false
        System.out.println("你a".matches(".."));// true



        System.out.println("--------------2--------------");
        //   \\d 只能是任意的一位数字
        //   简单来及：两个\ 表示一个\
        System.out.println("a".matches("\\d"));// false
        System.out.println("3".matches("\\d"));// true
        System.out.println("333".matches("\\d"));// false
        System.out.println("333".matches("\\d\\d\\d"));// true




        System.out.println("--------------3--------------");
        //   \\w  只能是一位单词字符   [a-zA-Z_0-9]  a到z  A到Z 下划线_  0-9
        System.out.println("z".matches("\\w"));// true
        System.out.println("4".matches("\\w"));// true
        System.out.println("_".matches("\\w"));// true
        System.out.println("21".matches("\\w"));// false
        System.out.println("21".matches("\\w\\w"));// true
        System.out.println("你".matches("\\w"));// false



        System.out.println("--------------4--------------");
        //   \\W  非单词字符 相当于[^\\w]    非[a-zA-Z_0-9]  除了（a到z  A到Z 下划线_  0-9）
        System.out.println("你".matches("\\W"));// true
        System.out.println("你".matches("^\\w"));// true
        //以上只能校验单个字符



        System.out.println("--------------5--------------");
        // 必须是数字，字母，下划线，至少8位
        System.out.println("1234abcd".matches("\\w{8,}"));// true
        System.out.println("12ac".matches("\\w{8,}"));// false


        //必须是数字和字符，必须是四位
        System.out.println("24dF".matches("[0-9a-zA-Z]{4}"));// true
        System.out.println("24_F".matches("[0-9a-zA-Z]{4}"));// false
        System.out.println("24dF".matches("[\\w&&[^_]]{4}"));// true
        System.out.println("24_F".matches("[\\w&&[^_]]{4}"));// false
    }


}
