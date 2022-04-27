package factorymethod.teht18;

public class Clock implements Cloneable {
    private Pointer second;
    private Pointer minute;
    private Pointer hour;

    public Clock(int hour, int minute, int second) {
        this.second = new Pointer(second);
        this.minute = new Pointer(minute);
        this.hour = new Pointer(hour);
    }

    public Clock clone() {
        Clock clock = null;
        try {
            clock = (Clock) super.clone();
            clock.second = (Pointer) second.clone();
            clock.minute = (Pointer) minute.clone();
            clock.hour = (Pointer) hour.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
        return clock;
    }

    public Pointer getSecond() {
        return second;
    }

    public Pointer getMinute() {
        return minute;
    }

    public Pointer getHour() {
        return hour;
    }

    public void setSecond(Pointer second) {
        this.second = second;
    }

    public void setMinute(Pointer minute) {
        this.minute = minute;
    }

    public void setHour(Pointer hour) {
        this.hour = hour;
    }
}
