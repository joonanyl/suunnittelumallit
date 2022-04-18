package factorymethod.teht14;

public class Kassa {
    private IBurgerBuilder builder;

    public void constructBurger() {
        builder.createBurger();
        builder.buildSampyla();
        builder.buildPihvi();
        builder.buildJuusto();
        builder.buildSalaatti();
    }

    public void setBuilder(IBurgerBuilder builder) {
        this.builder = builder;
    }
}
