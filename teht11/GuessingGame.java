package factorymethod.teht11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Guesser> guessers = new ArrayList<>();
        Riddler riddler = new Riddler(10);

        System.out.println("The Guessing game is about to begin! Enter the number of guessers: ");
        int guesserCount = scanner.nextInt();

        for (int i = 0; i < guesserCount; i++) {
            guessers.add(new Guesser(riddler, i + 1));
        }

        for(Guesser g : guessers) {
            new Thread(g).start();
        }
    }
}
