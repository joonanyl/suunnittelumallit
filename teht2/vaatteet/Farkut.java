package factorymethod.teht2.vaatteet;

public class Farkut {
    private String merkki;

    public Farkut(String merkki) {
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
