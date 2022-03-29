package factorymethod.teht6;

public class Kinkku extends PizzaDecorator {
    private double hinta;

    public Kinkku(Pizza dekoroitavaPizza) {
        super(dekoroitavaPizza);
        this.hinta = 1.5;
    }

    @Override
    public String getResepti() {
        super.lisaaHintaan(hinta);
        return super.getResepti() + decorateKinkulla();
    }

    private String decorateKinkulla() {
        return "  kinkku - " + hinta + "€\n";
    }
}
