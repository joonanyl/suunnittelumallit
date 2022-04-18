package factorymethod.teht14;

import factorymethod.teht14.taytteet.Juusto;
import factorymethod.teht14.taytteet.Pihvi;
import factorymethod.teht14.taytteet.Salaatti;
import factorymethod.teht14.taytteet.Sampyla;

import java.util.ArrayList;

public class McBurger {

    // Muuta nämä kaikki yhdeksi arraylistiksi
    private ArrayList<Object> taytteet = new ArrayList<>();

    public void setPihvi(Pihvi pihvi) {
        taytteet.add(pihvi);
    }

    public void setSalaatti(Salaatti salaatti) {
        taytteet.add(salaatti);
    }

    public void setJuusto(Juusto juusto) {
        taytteet.add(juusto);
    }

    public void setSampyla(Sampyla sampyla) {
        taytteet.add(sampyla);
    }

    public void printTaytteet() {
        System.out.println("McBurger:\n");
        for(Object o : taytteet) {
            System.out.println(o);
        }
    }
}
