package week3.powerrecursive;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author JOSEPH
 * Wwrite a program that uses the "Recursive" method to exponentiate
 * the base and exponent values from the user.
 */
public class PowerRecursive {
    static int pow(int base, int power) {
        if (power == 0)
            return 1;

        return base * pow(base, power - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base, power;

        //get power and base numbers from user
        try {
            System.out.print("base: ");
            base = scanner.nextInt();

            System.out.print("power: ");
            power = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Incorrect Data Type");
            return;
        }

        System.out.println(pow(base, power));


    }
}
