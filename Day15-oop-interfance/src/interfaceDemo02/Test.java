package interfaceDemo02;

public class Test {
    public static void main(String[] args) {
        //创建乒乓球教练对象
        PingpongCoach ppc = new PingpongCoach("张三",23);
        System.out.println(ppc.getName() + ", " + ppc.getAge());
        ppc.teach();
        ppc.speak();


        //创建乒乓球运动员对象
        PingPongAthlete ppa = new PingPongAthlete("李四",24);
        System.out.println(ppa.getName() + ", " + ppa.getAge());
        ppa.study();
        ppa.speak();


        //创建篮球教练对象
        BasketballCoach bc = new BasketballCoach("王五",25);
        System.out.println(bc.getName() + ", " + bc.getAge());
        bc.teach();



        //创建篮球运动员对象
        BasketballAthlete ba = new BasketballAthlete("赵六",26);
        System.out.println(ba.getName() + ", " + ba.getAge());
        ba.study();

    }
}
