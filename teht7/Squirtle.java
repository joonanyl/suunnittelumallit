package factorymethod.teht7;

public class Squirtle extends PokemonState {
    private static Squirtle instance = null;

    static Squirtle getInstance() {
        if (instance == null) {
            instance = new Squirtle();
        }
        return instance;
    }

    void evolve(Pokemon p) {
        System.out.println("......? What's that?.....");
        System.out.println("Squirtle evolved into Wartortle!\n\n\n");
        p.setState(Wartortle.getInstance());
    }

    void primaryAttack() {
        System.out.println("Squirtle used Water Gun!\n");
    }

    void secondaryAttack() {
        System.out.println("Squirtle used Tackle!\n");
    }

    void drinkPotion() {
        System.out.println("Squirtle used a Potion!\n");
    }
}
