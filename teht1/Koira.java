package factorymethod.teht1;

public class Koira extends AterioivaOtus {
    public Juoma createJuoma() {
        return new Vesi();
    }
}
