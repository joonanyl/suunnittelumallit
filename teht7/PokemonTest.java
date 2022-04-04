package factorymethod.teht7;

public class PokemonTest {
    public static void main(String[] args) {

        Pokemon p = new Pokemon();

        for (int i = 0; i < 3; i++) {
            p.primaryAttack();
            p.secondaryAttack();
            p.drinkPotion();

            p.evolve();
        }
    }
}
