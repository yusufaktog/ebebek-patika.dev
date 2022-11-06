package week3.primecheckrecursive;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author JOSEPH
 * Wwrite a program that uses the "Recursive" method to find
 * if the user input is prime or not
 */
public class PrimeNumberRecursive {

    static boolean isPrime(int number, int divisor) {
        if (number == 2)
            return true;
        if (number % divisor == 0)
            return false;
        if (divisor * divisor > number)
            return true;

        return isPrime(number, divisor + 2);
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

        System.out.println(number + (isPrime(number, 2) ? " is prime" : " is not prime"));

    }
}
