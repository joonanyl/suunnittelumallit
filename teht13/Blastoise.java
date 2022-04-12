package factorymethod.teht13;

public class Blastoise extends PokemonState {
    private static Blastoise instance = null;

    private Blastoise() {}

    public static Blastoise getInstance() {
        if (instance == null) {
            instance = new Blastoise();
        }
        return instance;
    }

    void evolve(Pokemon p) {
        System.out.println("......? What's that?......");
        System.out.println("Blastoise can't evolve");
        // Jos haluaa palata ensimmäiseen evoluutioon
        // p.setState(Squirtle.getInstance());
    }

    void primaryAttack() {
        System.out.println("Blastoise used Hydro Pump!\n");
    }

    void secondaryAttack() {
        System.out.println("Blastoise used Skull Bash\n");
    }

    void drinkPotion() {
        System.out.println("Blastoise used a Hyper Potion!\n");
    }
}
