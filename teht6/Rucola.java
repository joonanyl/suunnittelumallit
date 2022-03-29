package factorymethod.teht6;

public class Rucola extends PizzaDecorator {
    private double hinta;

    public Rucola(Pizza dekoroitavaPizza) {
        super(dekoroitavaPizza);
        this.hinta = 0.87;
    }

    @Override
    public String getResepti() {
        super.lisaaHintaan(hinta);
        return super.getResepti() + decorateRucolalla();
    }

    private String decorateRucolalla() {
        return "  rucola - " + hinta + "€\n";
    }
}
