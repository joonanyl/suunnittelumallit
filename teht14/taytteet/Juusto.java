package factorymethod.teht14.taytteet;

public class Juusto {
    private String name;

    public Juusto(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
