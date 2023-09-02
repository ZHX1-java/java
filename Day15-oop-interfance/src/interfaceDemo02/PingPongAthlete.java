package interfaceDemo02;

public class PingPongAthlete extends Athlete implements speakEnglish {
    public PingPongAthlete() {
    }

    public PingPongAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("说英语");
    }
}
