package factorymethod.teht2;

public class Main {
    public static void main(String[] args) {
        JasperFactory jasperFactory = new OpiskelijaFactory();
        Jasper jasper = jasperFactory.getJasper();
        System.out.println(jasper);

        jasperFactory = new InsinooriFactory();
        jasper = jasperFactory.getJasper();
        System.out.println(jasper);
    }
}
