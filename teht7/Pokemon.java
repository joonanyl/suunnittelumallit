package factorymethod.teht7;

public class Pokemon {
    private PokemonState state;

    public Pokemon() {
        this.state = Squirtle.getInstance();
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
    }

    public void secondaryAttack() {
        state.secondaryAttack();
    }

    public void drinkPotion() {
        state.drinkPotion();
    }
}
