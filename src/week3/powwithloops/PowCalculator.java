package week3.powwithloops;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author JOSEPH
 * custom Math.pow() with loops.
 */

public class PowCalculator {
    public static void main(String[] args) {
        int base, power;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Base: ");
            base = scanner.nextInt();

            System.out.print("Power: ");
            power = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Incorrect Data Type");
            return;
        }

        int result = 1;

        for (int i = 0; i < power; i++) {
            result *= base;
        }

        if (base == 0 && power == 0)
            System.out.println("Undefined!");
        else
            System.out.printf("pow(%d,%d): %d", base, power, result);
    }
}
