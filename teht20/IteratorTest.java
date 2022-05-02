package factorymethod.teht20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class IteratorTest {
    public static void main(String[] args) {
        List<String> list = Collections.synchronizedList(new ArrayList<>());
        list.add("Testi");
        list.add("lista");
        list.add("jossa");
        list.add("on");
        list.add("sisältöä");

        ListIterator<String> iterator1 = list.listIterator();
        ListIterator<String> iterator2 = list.listIterator();

        Thread thread1 = new Thread(new IteratorThread(iterator1));
        Thread thread2 = new Thread(new IteratorThread(iterator2));

        thread1.start();
        thread2.start();
    }
}
