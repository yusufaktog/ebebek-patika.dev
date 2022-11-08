package week3.harmonicseries;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author JOSEPH
 * Write a program that calculates the harmonic mean of the numbers in the array.
 * Harmonic Mean formula: n (number of elements) / harmonic series of elements
 */

public class HarmonicSeries {
    public static void main(String[] args) {
        int number;
        double total = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Number: ");
            number = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Incorrect Data Type");
            return;
        }

        for (int i = 1; i < number + 1; i++) {
            total += 1.0 / i;
        }

        System.out.printf("Harmonic Series of %d: %f ", number, total);
    }
}
