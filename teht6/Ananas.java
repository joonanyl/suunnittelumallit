package factorymethod.teht6;

public class Ananas extends PizzaDecorator {
    private double hinta;

    public Ananas(Pizza dekoroitavaPizza) {
        super(dekoroitavaPizza);
        this.hinta = 0.49;
    }

    @Override
    public String getResepti() {
        super.lisaaHintaan(hinta);
        return super.getResepti() + decorateAnanaksella();
    }

    private String decorateAnanaksella() {
        return "  ananas - " + hinta + "€\n";
    }
}
