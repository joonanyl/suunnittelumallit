package factorymethod.teht9;

import java.util.ArrayList;
import java.util.List;

public class ListContext {
    private List<String> list;
    private ListConverter converter;

    public ListContext(ListConverter converter) {
        this.converter = converter;
        this.list = new ArrayList<String>();
    }

    public void initializeList() {
        list.add("Tässä");
        list.add("on");
        list.add("paljon");
        list.add("testi");
        list.add("dataa");
        list.add("ja");
        list.add("vaikka");
        list.add("muille");
        list.add("jakaa");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
    }

    public void convert() {
        System.out.println(converter.listToString(list));
        list.clear();
    }

    public void setConverter(ListConverter converter) {
        this.converter = converter;
    }
}
