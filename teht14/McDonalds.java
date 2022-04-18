package factorymethod.teht14;

import factorymethod.teht14.taytteet.Juusto;
import factorymethod.teht14.taytteet.Pihvi;
import factorymethod.teht14.taytteet.Salaatti;
import factorymethod.teht14.taytteet.Sampyla;

public class McDonalds implements IBurgerBuilder {
    private McBurger burger;


    @Override
    public void createBurger() {
        burger = new McBurger();
    }

    @Override
    public void buildPihvi() {
        burger.setPihvi(new Pihvi("McPihvi"));
    }

    @Override
    public void buildSampyla() {
        burger.setSampyla(new Sampyla("McSampyla"));
    }

    @Override
    public void buildJuusto() {
        burger.setJuusto(new Juusto("McJuusto"));
    }

    @Override
    public void buildSalaatti() {
        burger.setSalaatti(new Salaatti("McSalaatti"));
    }

    @Override
    public McBurger getBurger() {
        return burger;
    }
}
