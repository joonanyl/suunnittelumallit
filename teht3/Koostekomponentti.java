package factorymethod.teht3;

public interface Koostekomponentti extends Komponentti {
    @Override
    void lisaaKomponentti(Komponentti komponentti);

    @Override
    void tulostaKokoonpano();

    @Override
    Integer getHinta();
}
