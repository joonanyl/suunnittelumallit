package factorymethod.teht14;

public class BurgerTest {
    public static void main(String[] args) {
        Kassa kassa = new Kassa();

        Hesburger hesburger = new Hesburger();

        kassa.setBuilder(hesburger);
        kassa.constructBurger();
        HeseBurger heseBurger = hesburger.getBurger();
        heseBurger.printTaytteet();

        McDonalds mcDonalds = new McDonalds();
        kassa.setBuilder(mcDonalds);
        kassa.constructBurger();
        McBurger mcBurger = mcDonalds.getBurger();
        mcBurger.printTaytteet();
    }
}
