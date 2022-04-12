package factorymethod.teht13;

public class PokemonTest {
    public static void main(String[] args) {

        Pokemon p = new Pokemon();
        PokemonVisitor visitor = new PokemonVisitor();

        for (int i = 0; i < 5; i++) {
            p.primaryAttack();
            p.secondaryAttack();
            p.drinkPotion();

            p.accept(visitor);
        }
    }
}
