package factorymethod.teht7;

public class Wartortle extends PokemonState {
    private static Wartortle instance = null;

    public static Wartortle getInstance() {
        if (instance == null) {
            instance = new Wartortle();
        }
        return instance;
    }

    void evolve(Pokemon p) {
        System.out.println("......? What's that?........");
        System.out.println("Wartortle evolved into Blastoise!\n\n\n");
        p.setState(Blastoise.getInstance());
    }

    void primaryAttack() {
        System.out.println("Wartortle used Water Pulse!\n");
    }

    void secondaryAttack() {
        System.out.println("Wartortle used Aqua Tail!\n");
    }

    void drinkPotion() {
        System.out.println("Wartortle used a Super Potion!\n");
    }
}
