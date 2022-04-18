package factorymethod.teht14.taytteet;

public class Pihvi {
    private String name;

    public Pihvi(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
