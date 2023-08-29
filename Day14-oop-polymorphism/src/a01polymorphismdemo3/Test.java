package a01polymorphismdemo3;

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();//狗在啃骨头

        //多态的弊端
        //不能直接使用子类的特有功能
        

        if (a instanceof Dog d){
            d.lookHome();//狗在看家
        }else if (a instanceof Cat c){
            c.catMouse();//不能转换成猫
        }else {
            System.out.println("没有这种类型，无法转换");
        }
    }
}

class Animal{
    public void eat(){
        System.out.println("动物在吃东西");
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗在啃骨头");
    }
    public void lookHome(){
        System.out.println("狗在看家");
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫在吃小鱼干");
    }

    public void catMouse(){
        System.out.println("猫在抓老鼠");
    }
}
