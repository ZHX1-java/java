package innerclassDemo01;

public class Car {
    String carName;
    int carAge;
    String carColor;

    public void show(){
        System.out.println(carName);


        //要像在外部类调用内部类中的成员，必须先创建内部类的对象
        engine e = new engine();
        System.out.println(e.engineName);
    }


    class engine{
        String engineName;
        int engineAge;


        public void show(){
            System.out.println(carName);//内部类可以直接调用外部类中的成员
            System.out.println(engineName);//内部类可以直接内部类中的成员

        }
    }
}
