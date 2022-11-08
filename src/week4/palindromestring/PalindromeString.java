package week4.palindromestring;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author JOSEPH
 * If a word reversedis same with the original word, that word is "Palindromic Word".
 * Example: abba, madam, reviver, redivider, level...
 */
public class PalindromeString {
    static boolean isPalindrome(String word) {
        StringBuilder stringBuilder = new StringBuilder(word);
        return word.equals(stringBuilder.reverse().toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;

        // get input length from user
        try {
            System.out.print("Word: ");
            word = scanner.nextLine();

        } catch (InputMismatchException e) {
            System.out.println("Incorrect Data Type");
            return;
        }

        System.out.println(word + (isPalindrome(word) ? " is a palindromic word " : " is not a palindromic word."));
    }
}
