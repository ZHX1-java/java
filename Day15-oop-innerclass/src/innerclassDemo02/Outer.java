package innerclassDemo02;

public class Outer {

    String name;

     public class Inner{
        int age = 10;
        public void show(){
            System.out.println("内部类方法---show");
        }


    }


    public Inner gerInstance(){
        return new Inner();
    }
}
