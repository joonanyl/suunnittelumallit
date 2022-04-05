package factorymethod.teht9;

import java.util.List;

public class Converter2 implements ListConverter{

    @Override
    public String listToString(List<String> list) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 != 0) {
                output.append(" ").append(list.get(i)).append("\n");
            } else {
                output.append(list.get(i));
            }
        }
        return output.toString();
    }
}
