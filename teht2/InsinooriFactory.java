package factorymethod.teht2;

public class InsinooriFactory implements JasperFactory{
    @Override
    public Jasper getJasper() {
        return new Jasper("Boss");
    }
}
