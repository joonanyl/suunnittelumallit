package factorymethod.teht14;

public class Hesburger implements IBurgerBuilder {

    private HeseBurger burger;

    @Override
    public void createBurger() {
        burger = new HeseBurger();
    }

    @Override
    public void buildPihvi() {
        burger.setPihvi("HesePihvi");
    }

    @Override
    public void buildSampyla() {
        burger.setSampyla("HeseSampyla");
    }

    @Override
    public void buildJuusto() {
        burger.setJuusto("HeseJuusto");
    }

    @Override
    public void buildSalaatti() {
        burger.setSalaatti("HeseSalaatti");
    }

    @Override
    public HeseBurger getBurger() {
        return burger;
    }
}
