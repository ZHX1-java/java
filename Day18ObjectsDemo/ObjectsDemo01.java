package Day18ObjectsDemo;

import java.util.Objects;

public class ObjectsDemo01 {
    public static void main(String[] args) {
        Student s1 = null;
        Student s2 = new Student("zhangsan",23);

        /*if (s1 != null) {
            System.out.println(s1.equals(s2));
        }else{
            System.out.println("调用者为空");
        }*/


        boolean result = Objects.equals(s1, s2);
        System.out.println(result);//false

        //细节：
        //1.方法的底层会判断是是否为null，如果为null，直接返回false
        //2.如果s1不为null，那么就利用s1再次调用 equals方法
        //3.此时s1是Student类型，所以最终还是会调用Student中的equals方法
        //  如果没有重写equals方法，比较地址值，如果重写了，比较属性值



        Student s3 = new Student();
        Student s4 = null;
        System.out.println(Objects.isNull(s3));//false 不为空
        System.out.println(Objects.isNull(s4));//true  为空

        System.out.println(Objects.nonNull(s3));//true  不为空
        System.out.println(Objects.nonNull(s4));//false 为空

    }
}
