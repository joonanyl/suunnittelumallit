package factorymethod.teht6;

public class Pepperoni extends PizzaDecorator {
    private double hinta;

    public Pepperoni(Pizza dekoroitavaPizza) {
        super(dekoroitavaPizza);
        this.hinta = 2.09;
    }

    @Override
    public String getResepti() {
        super.lisaaHintaan(hinta);
        return super.getResepti() + decoratePepperonilla();
    }

    private String decoratePepperonilla() {
        return "  pepperoni - " + hinta + "€\n";
    }
}
