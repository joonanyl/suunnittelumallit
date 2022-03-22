package factorymethod.teht3;

import java.util.ArrayList;
import java.util.List;

public class Kotelo implements Koostekomponentti {
    private Integer hinta;
    private List<Komponentti> komponentit;

    public Kotelo(Integer hinta) {
        this.hinta = hinta;
        this.komponentit = new ArrayList<>();
    }

    public void lisaaKomponentti(Komponentti komponentti) {
        komponentit.add(komponentti);
        hinta += komponentti.getHinta();
    }

    public void tulostaKokoonpano() {
        for (Komponentti k: komponentit) {
            System.out.println(k.getHinta() + "€");
        }
    }

    @Override
    public Integer getHinta() {
        return hinta;
    }
}
