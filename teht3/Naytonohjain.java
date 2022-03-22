package factorymethod.teht3;

public class Naytonohjain implements Komponentti {

    private Integer hinta;

    public Naytonohjain(Integer hinta) {
        this.hinta = hinta;
    }

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
