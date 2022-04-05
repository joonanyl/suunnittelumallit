package factorymethod.teht9;

import java.util.List;

public class Converter1 implements ListConverter {
    @Override
    public String listToString(List<String> list) {
        StringBuilder output = new StringBuilder();
        String[] array = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
            output.append(array[i]).append("\n");
        }

        return output.toString();
    }
}
