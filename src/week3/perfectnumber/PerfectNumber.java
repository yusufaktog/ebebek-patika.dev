package week3.perfectnumber;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author JOSEPH
 * find the input is a perfect number or not
 * A perfect number is a number whose
 * sum of positive integer divisors
 * is equal to itself, excluding the number itself.
 */

public class PerfectNumber {
    public static void main(String[] args) {
        int number, total = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Number: ");
            number = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Incorrect Data Type");
            return;
        }

        for (int i = number - 1; i > 0; i--) {
            if (number % i == 0) {
                total += i;
            }
        }

        System.out.println(number + (total == number ? " is a perfect number" : " is not a perfect number"));

    }
}
