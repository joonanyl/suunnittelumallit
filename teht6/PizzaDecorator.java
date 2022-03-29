package factorymethod.teht6;

public abstract class PizzaDecorator implements Pizza {
    protected Pizza dekoroitavaPizza;

    public PizzaDecorator(Pizza dekoroitavaPizza) {
        this.dekoroitavaPizza = dekoroitavaPizza;
    }

    public String getResepti() {
        return dekoroitavaPizza.getResepti();
    }

    public void lisaaHintaan(double h) {
        dekoroitavaPizza.lisaaHintaan(h);
    }
}
