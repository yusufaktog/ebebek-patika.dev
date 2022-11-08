package week4.numberguess;


import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type the max value (limit) of the guess: ");
        int limit = scanner.nextInt();

        int number = ThreadLocalRandom.current().nextInt(limit);

        System.out.print("How many guesses are you going to take: ");
        int remainingGuesses = scanner.nextInt();

        System.out.println("You have to find the number randomly generated between 0 and "
                + limit + " in " + remainingGuesses + " guesses");
        System.out.println("Good Luck!");

        int guess;

        boolean won = false;

        while (remainingGuesses > 0) {
            System.out.print("Your Guess : ");
            guess = scanner.nextInt();

            if (guess < 0 || guess > limit) {
                System.out.println("PLease type a number between '0' and '100'.");
            }

            if (guess == number) {
                System.out.println("Congrats!, your guess was correct");
                won = true;
                break;
            }

            if (guess > number) {
                System.out.println("Lower your guess.");
            } else {
                System.out.println("Higher the guess.");
            }

            remainingGuesses--;

            System.out.println("Remaining rights: " + (remainingGuesses));
        }

        if (!won) {
            System.out.println("Game OVER! ");
            System.out.println("The Number was " + number);
        }

    }
}
