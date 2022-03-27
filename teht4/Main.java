package factorymethod.teht4;

public class Main {
    public static void main(String[] args) {
        ClockTimer timer = new ClockTimer();
        timer.addObserver(new DigitalClock());
        new Thread(timer).start();
    }
}
