package factorymethod.teht11;

public class Riddler {
    private int max;

    public Riddler(int max) {
        this.max = max;
    }

    public Memento joinGame() {
        return new Memento(((int)Math.floor(Math.random() * (max-1 + 1) + 1)));
    }

    public boolean checkGuess(int guess, Object obj) {
        Memento memento = (Memento) obj;
        return guess == memento.guessableNumber;
    }

    private class Memento {
        private int guessableNumber;

        public Memento(int guessableNumber) {
            this.guessableNumber = guessableNumber;
        }
    }
}
