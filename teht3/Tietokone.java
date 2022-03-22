package factorymethod.teht3;

import java.util.List;

public class Tietokone {
    public static void main(String[] args) {
        Koostekomponentti kotelo = new Kotelo(100);
        Koostekomponentti emolevy = new Emolevy(100);
        Komponentti naytonohjain = new Naytonohjain(600);
        Komponentti prosessori = new Prosessori(250);
        Komponentti muistipiiri = new Muistipiiri(80);

        emolevy.lisaaKomponentti(prosessori);
        emolevy.lisaaKomponentti(naytonohjain);
        emolevy.lisaaKomponentti(muistipiiri);
        kotelo.lisaaKomponentti(emolevy);
        System.out.println("KOKONAISHINTA: " + laskeKokonaishinta(kotelo) + "€");
    }

    private static int laskeKokonaishinta(Koostekomponentti komponentti) {
        return komponentti.getHinta();
    }
}
