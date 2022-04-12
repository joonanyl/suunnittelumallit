package factorymethod.teht13;

public class Pokemon {
    private PokemonState state;
    protected int xp;

    public Pokemon() {
        this.state = Squirtle.getInstance();
        this.xp = 0;
    }

    public PokemonState getState() {
        return state;
    }

    protected void setState(PokemonState state) {
        this.state = state;
    }

    public void evolve() {
        state.evolve(this);
    }

    public void primaryAttack() {
        state.primaryAttack();
        xp++;
    }

    public void secondaryAttack() {
        state.secondaryAttack();
        xp++;
    }

    public void drinkPotion() {
        state.drinkPotion();
    }

    public void accept(PokemonVisitor visitor) {
        visitor.visit(this);
    }
}
