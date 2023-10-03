package Day19RegexDemo;

public class RegexDemo05 {
    public static void main(String[] args) {
        /*
            正则表达式练习:
            需求
            请编写正则表达式验证用户名是否满足要求。要求:大小写字母，数字，下划线一共4-16位请编写正则表达式验证身份证号码是否满足要求。
            简单要求:18位，前17位任意数字，最后一位可以是数字可以是大写或小写的x复杂要求:按照身份证号码的格式严格要求。

            身份证号码:
            41080119930228457x
            510801197609022309
            15040119810705387X
            130133197204039024 I
            430102197606046442
        */


        String regex1 = "\\w{4,16}";
        System.out.println("zhangsan42_".matches(regex1));


        String regex2 = "[1-9]\\d{16}(x|X|\\d)";
        String regex3 = "[1-9]\\d{16}[xX\\d]";
        System.out.println("41080119930228457x".matches(regex3));
        System.out.println("510801197609022309".matches(regex3));
        System.out.println("15040119810705387X".matches(regex3));
        System.out.println("130133197204039024".matches(regex3));
        System.out.println("430102197606046442".matches(regex3));

        System.out.println("----------------------------------------");
        String regex5 = "[1-9]\\d{16}((?i)x|\\d)";
        System.out.println("41080119930228457x".matches(regex5));
        System.out.println("510801197609022309".matches(regex5));
        System.out.println("15040119810705387X".matches(regex5));
        System.out.println("130133197204039024".matches(regex5));
        System.out.println("430102197606046442".matches(regex5));


        System.out.println("----------------------------------------");
        //忽略大小写的书写格式
        //在匹配的时候忽略abc的大小写
        String regex4 = "(?i)abc";
        System.out.println("abc".matches(regex4));// true
        System.out.println("AbC".matches(regex4));// true
        System.out.println("aBC".matches(regex4));// true
        //忽略bc的大小写
        System.out.println("aBC".matches("a(?i)bc"));// true
        //只忽略b的大小写
        System.out.println("aBc".matches("a((?i)b)c"));// true






        System.out.println("----------------------------------------");
        //身份证号码的严格校验
        //编写正则的小心得
        //第一步：按照正确的数据进行拆分
        //第二步：找每一部分的规律。并编写正则表达式
        //第三步：把每一部分的正则拼接在一起，就是最终的结果

        //150401  1981  07  05  387X
        //前面6位：省份，市区，派出所等信息   第一位不能是0，后面5位是任意数字          [1-9]\\d{5}
        //年的前半段： 可以是 18  19  20                                             (1[89]|20)
        //年的后半段： 可以是任意数字出现两次                                           \\d{2}
        //月份：  可以是  01 ~ 09 10  11  12                                        (0[1-9]|1[0-2])
        //日期：  可以是 01 ~ 31                                                    (0[1-9]|[12]\\d|3[01])
        //最后四位：  任意数字出现3次  最后一位可以是数字也可以是大写X或者小写x          \\d{3}(\\d|(?i)x)
        String regex6 = "[1-9]\\d{5}(1[89]|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])\\d{3}(\\d|(?i)x)";
        System.out.println("41080119930128457x".matches(regex6));
        System.out.println("510801197609022309".matches(regex6));
        System.out.println("15040119810705387X".matches(regex6));
        System.out.println("130133197204039024".matches(regex6));
        System.out.println("430102197606046442".matches(regex6));




    }
}
