package week3.diamondshapedstars;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author JOSEPH
 * Diamond shaped stars
 */
public class DiamondShapedStars {
    public static void main(String[] args) {
        int i, j, number;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Row Number(Up to Middle): ");
            number = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Incorrect Data Type");
            return;
        }

        for (i = 0; i <= number; i++) {
            for (j = 1; j <= number - i; j++)
                System.out.print(" ");
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }

        for (i = number - 1; i >= 1; i--) {
            for (j = 1; j <= number - i; j++)
                System.out.print(" ");
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }

    }
}
