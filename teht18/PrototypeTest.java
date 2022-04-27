package factorymethod.teht18;

public class PrototypeTest {
    public static void main(String[] args) {
        Clock clock = new Clock(11, 23, 44);
        System.out.println(clock.getHour().getTime() + ":" + clock.getMinute().getTime() + ":"
                + clock.getSecond().getTime());

        Clock clock2 = clock.clone();

        System.out.println(clock2.getHour().getTime() + ":" + clock2.getMinute().getTime() + ":"
                + clock2.getSecond().getTime());

        clock.getHour().setTime(15);

        System.out.println(clock.getHour().getTime() + ":" + clock.getMinute().getTime() + ":"
                + clock.getSecond().getTime());

        System.out.println(clock2.getHour().getTime() + ":" + clock2.getMinute().getTime() + ":"
                + clock2.getSecond().getTime());


    }
}
