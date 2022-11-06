package week3.methodpattern;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author JOSEPH
 * Subtract 5 from the entered number up to where the entered number is 0 or negative.
 * Print the last value to the screen during each subtraction.
 * Add 5 again after the number is negative or 0.
 * Again, print the last value of the number on the screen in each addition operation.
 */

public class CreateMethodByPattern {
    static void pattern(int n, int number, boolean negated) {
        System.out.print(n + " ");

        if (negated)
            n += 5;
        else
            n -= 5;

        if (!negated) // check only if number is negative
            negated = (n <= 0);

        if (n != number)
            pattern(n, number, negated);
        else
            System.out.print(n + " ");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        try {
            System.out.print("number: ");
            number = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Incorrect Data Type");
            return;
        }

        pattern(number, number, false);
    }
}
