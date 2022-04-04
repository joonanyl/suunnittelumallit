package factorymethod.teht8;

import java.util.*;

public class DiceGame extends Game {
    private Scanner scanner;
    private int dice;
    private Random random;
    private List<Integer> results;
    private boolean end;
    private int lastPlayer;

    protected void initializeGame() {
        scanner = new Scanner(System.in);
        dice = 0;
        random = new Random();
        results = new ArrayList<>();
        end = false;
        lastPlayer = 0;
        System.out.println("--- THE DICE GAME BEGINS! ---\n");
        System.out.println("Instructions:\n\nEach player rolls a dice. The player with the largest roll wins!");
    }

    protected void makePlay(int player) {
        player++;
        if (lastPlayer < player) {
            lastPlayer = player;
        } else if (lastPlayer > player) {
            end = true;
            return;
        }

        System.out.println("Player " + player + ":\nPress enter to roll a dice");
        scanner.nextLine();

        dice = random.nextInt(6) + 1;
        System.out.println("Player " + player + " threw " + dice + "!\n");
        results.add(dice);
    }

    protected boolean endOfGame() {
        return end;
    }

    protected void printWinner() {
        int winner = Collections.max(results);
        winner = results.indexOf(winner) + 1;
        System.out.println("--- GAME HAS ENDED! ---");
        System.out.println("Winner is: Player " + winner);
    }
}
