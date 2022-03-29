package factorymethod.teht6;

public class PizzaTest {
    public static void main(String[] args) {
        Pizza pizza1 = new Mozzarella(new Kinkku(new Ananas(new Pohja())));
        Pizza pizza2 = new Mozzarella(new Pepperoni(new Rucola(new Pohja())));
        Pizza pizza3 = new Mozzarella(new Kinkku(new Pepperoni(new Pohja())));

        System.out.println(pizza1.getResepti());
        System.out.println(pizza2.getResepti());
        System.out.println(pizza3.getResepti());
    }
}
