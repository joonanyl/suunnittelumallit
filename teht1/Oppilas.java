package factorymethod.teht1;

public class Oppilas extends AterioivaOtus {
    public Juoma createJuoma() {return new Energiajuoma();}
}
