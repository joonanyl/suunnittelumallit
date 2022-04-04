package factorymethod.teht8;

public class GameTest {
    public static void main(String[] args) {
        Game game = new DiceGame();
        game.playOneGame(4);
    }
}
