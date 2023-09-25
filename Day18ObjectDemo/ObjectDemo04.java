package Day18ObjectDemo;

public class ObjectDemo04 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //protected Object clone(int a)     对象克隆
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0};
        User u1 = new User(1,"zhangsan","123qwer","girl11",data);

        //克隆对象
        //细节：
        //方法在底层会帮我们创建一个对象，并把原来对象中的数据拷贝过去

        //书写细节：
        //1.重写Object中的clone方法
        //2.让JavaBean类实现Cloneable接口
        //3。创建元对象并调用clone方法就可以了。
        User u2 = (User) u1.clone();


        System.out.println(u1);
        System.out.println(u2);


    }
}
