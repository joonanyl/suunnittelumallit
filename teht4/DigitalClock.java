package factorymethod.teht4;

import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {

    private ClockTimer timer;

    public DigitalClock() {
    }

    @Override
    public void update(Observable o, Object ct) {
        this.timer = (ClockTimer) ct;
        draw();
    }

    private void draw() {
        System.out.println(timer.getHour() + ":" + timer.getMinute() + ":" + timer.getSecond() + "\n");
    }
}
