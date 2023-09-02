package interfaceDemo03;

public class InterImpl implements Inter1,Inter2{
    @Override
    public void method() {
        System.out.println("接口中重写后的抽象方法");
    }


    //如果实现了多个接口，多个接口中存在相同名字的默认方法，子类就必须对该默认方法进行重写
    @Override
    public void show() {
        System.out.println("接口中重写的show方法");
    }
}
