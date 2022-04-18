package factorymethod.teht14;

public class HeseBurger {

    // Muuta nämä kaikki yhdeksi stringbuilderiksi

    private StringBuilder taytteet = new StringBuilder();
    private String sampyla = "";
    private String juusto = "";
    private String pihvi = "";
    private String salaatti = "";

    public void setSampyla(String sampyla) {
        taytteet.append(sampyla).append("\n");
    }

    public void setJuusto(String juusto) {
        taytteet.append(juusto).append("\n");
    }

    public void setPihvi(String pihvi) {
        taytteet.append(pihvi).append("\n");
    }

    public void setSalaatti(String salaatti) {
        taytteet.append(salaatti).append("\n");
    }

    public void printTaytteet() {
        System.out.println("HeseBurger:\n\n" + taytteet.toString());
    }
}
