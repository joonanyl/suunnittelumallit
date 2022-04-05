package factorymethod.teht9;

public class StrategyTest {
    public static void main(String[] args) {
        ListConverter converter = new Converter1();
        ListContext context = new ListContext(converter);

        // \n Jokaisen alkion jälkeen
        context.initializeList();
        context.convert();

        // \n Joka toisen alkion jälkeen
        context.setConverter(new Converter2());
        context.initializeList();
        context.convert();

        // \n Joka kolmannen alkion jälkeen
        context.setConverter(new Converter3());
        context.initializeList();
        context.convert();
    }
}
