package week3.palindromenumber;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author JOSEPH
 * Palindromic numbers are numbers that
 * is still the same number when reversed.
 * Example: 1, 4, 8, 99, 101, 363, 4004, 9889...
 */

public class PalindromeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        // get input length from user
        try {
            System.out.print("Number: ");
            number = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Incorrect Data Type");
            return;
        }

        StringBuilder sb = new StringBuilder(String.valueOf(number));

        System.out.println(number + (sb.toString().equals(sb.reverse().toString()) ? " is a palindromic number " : " is not a palindromic number."));
    }
}
