package factorymethod.teht2;

public class OpiskelijaFactory implements JasperFactory {
    @Override
    public Jasper getJasper() {
        return new Jasper("Adidas");
    }
}
