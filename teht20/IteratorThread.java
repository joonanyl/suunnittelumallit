package factorymethod.teht20;

import java.util.List;
import java.util.ListIterator;

public class IteratorThread implements Runnable {
    private final ListIterator<String> iterator;

    public IteratorThread(ListIterator<String> listIterator) {
        this.iterator = listIterator;
    }

    @Override
    public void run() {
        try {
            while (iterator.hasNext()) {
                System.out.println(Thread.currentThread().getId() + " " + iterator.next());
                iterator.remove();
                System.out.println(iterator.next());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
