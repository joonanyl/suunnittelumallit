package factorymethod.teht11;

public class Guesser implements Runnable {
    private Riddler riddler;
    private Object memento;
    private int playerId;
    private int guess = 1;
    private boolean correct;

    public Guesser(Riddler riddler, int playerId) {
        this.riddler = riddler;
        this.playerId = playerId;
    }

    @Override
    public synchronized void run() {
        memento = riddler.joinGame();
        while (!correct) {
            if (!riddler.checkGuess(guess, memento)) {
                System.out.println("Player " + playerId + " guessed: " + guess);
                guess++;
            } else {
                System.out.println("Player " + playerId + " guessed right! The correct number is: " + guess);
                correct = true;
            }
        }
    }
}
