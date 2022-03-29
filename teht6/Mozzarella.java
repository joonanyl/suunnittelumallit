package factorymethod.teht6;

public class Mozzarella extends PizzaDecorator {
    private double hinta;

    public Mozzarella(Pizza dekoroitavaPizza) {
        super(dekoroitavaPizza);
        this.hinta = 1.80;
    }

    @Override
    public String getResepti() {
        super.lisaaHintaan(hinta);
        return super.getResepti() + decorateMozzarellalla();
    }

    private String decorateMozzarellalla() {
        return "  mozzarella - " + hinta + "€\n";
    }
}
