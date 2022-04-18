package factorymethod.teht14;

public interface IBurgerBuilder {
    public abstract void createBurger();
    public abstract void buildPihvi();
    public abstract void buildSampyla();
    public abstract void buildJuusto();
    public abstract void buildSalaatti();

    public abstract Object getBurger();
}
