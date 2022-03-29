package factorymethod.teht6;

public class Pohja implements Pizza {

    private final double pohjaHinta = 2.99;
    private double kokonaisHinta;

    @Override
    public String getResepti() {
        return "Pizzaresepti: " + String.format("%.2f", kokonaisHinta) + "€\n" + "  pohja - " + pohjaHinta + "€\n";
    }

    public double getKokonaisHinta() {
        return pohjaHinta;
    }

    public void lisaaHintaan(double h) {
        kokonaisHinta += h;
    }
}
