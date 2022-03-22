package factorymethod.teht3;

public class Muistipiiri implements Komponentti{

    private Integer hinta;

    public Muistipiiri(Integer hinta) {
        this.hinta = hinta;
    }

    @Override
    public Integer getHinta() {
        return hinta;
    }

    @Override
    public void lisaaKomponentti(Komponentti komponentti) {
        throw new RuntimeException("Naytonohjain ei ole koostekomponentti!");
    }

    @Override
    public void tulostaKokoonpano() {
        throw new RuntimeException("Naytonohjain ei ole koostekomponentti!");
    }
}
