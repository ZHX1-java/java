package interfaceDemo02;

public class PingpongCoach extends Coach implements speakEnglish {

    public PingpongCoach() {
    }

    public PingpongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("说英语");
    }
}
