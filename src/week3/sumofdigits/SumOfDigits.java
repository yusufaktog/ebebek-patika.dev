package week3.sumofdigits;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author JOSEPH
 * Calculate the sum of digits of a number.
 */

public class SumOfDigits {
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
        String str = String.valueOf(number);

        for (int i = 0; i < str.length(); i++) {
            total += Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        System.out.println("Sum of digits: " + total);
    }
}
