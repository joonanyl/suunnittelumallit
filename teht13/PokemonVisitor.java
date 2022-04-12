package factorymethod.teht13;

public class PokemonVisitor {
    public void visit(Pokemon p) {
        if (p.xp >= 4 && p.getState() != Blastoise.getInstance())
            p.evolve();
    }
}
