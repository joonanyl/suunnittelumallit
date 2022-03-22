package factorymethod.teht3;

public class Prosessori implements Komponentti {

    private Integer hinta;

    public Prosessori(Integer hinta) {
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
