package Day18ObjectDemo;

public class ObjectDemo01 {
    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println(obj.toString());//java.lang.Object@4eec7777 ---- 包名+类名@地址值

        Student s = new Student("zhangsan",23);
        System.out.println(s.toString());//Day18ObjectDemo.Student@41629346


        //细节：
        //System:类名
        //out:静态变量
        //System.out:获取打印的对象
        //println():方法
        //方法里面的参数：表示打印的内容
        //核心逻辑
        //当我们打印一个对象的时候，底层会调用对象的toString方法，把对象变成字符串
        //然后打印在控制台上，打印完毕后做换行处理

        /*在默认情况下，因为Object类中的toString方法返回的是地址值
        所以默认情况下，打印一个对象就是打印对象的地址值
        但是地址值对我们来说没有意义
        想要看到对象内部的属性值怎么办？
        处理方案：重写父类Object类中的toString方法
        */
        System.out.println(s);//Student{name = zhangsan, age = 23}

    }
}
