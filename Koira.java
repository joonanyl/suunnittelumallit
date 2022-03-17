package factorymethod;

public class Koira extends AterioivaOtus {
    public Juoma createJuoma() {
        return new Vesi();
    }
}
