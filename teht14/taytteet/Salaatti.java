package factorymethod.teht14.taytteet;

public class Salaatti {
    private String name;

    public Salaatti(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
