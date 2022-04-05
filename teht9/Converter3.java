package factorymethod.teht9;

import java.util.List;
import java.util.ListIterator;

public class Converter3 implements ListConverter {
    @Override
    public String listToString(List<String> list) {
        int count = 0;
        StringBuilder output = new StringBuilder();
        ListIterator<String> iterator = list.listIterator();

        output.append(iterator.next()).append(" ");
        count++;

        while (iterator.hasNext()) {
            if (count % 3 == 0)
                output.append(" ").append(iterator.next()).append("\n");
            else if (count % 3 == 1)
                output.append(iterator.next());
            else
                output.append(" ").append(iterator.next());

            count++;
        }
        return output.toString();
    }
}
