package a01polymorphismdemo2;

public class Test {
    public static void main(String[] args) {
        //创建对象
        //格式：Fu f = new Zi();
        Animal a = new Dog();
        //调用成员变量：编译看左边，运行也看左边
        //编译看左边：javac编译代码的时候
        System.out.println(a.name);//动物
        //调用成员方法：编译看左边，运行看右边
        a.show();//Dog --- show
    }
}

