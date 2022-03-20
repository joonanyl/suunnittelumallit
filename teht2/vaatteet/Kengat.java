package factorymethod.teht2.vaatteet;

public class Kengat {
    private String merkki;

    public Kengat(String merkki) {
        this.merkki = merkki;
    }

    public String getMerkki() {
        return merkki;
    }

    public void setMerkki(String merkki) {
        this.merkki = merkki;
    }

    @Override
    public String toString() {
        return merkki;
    }
}
