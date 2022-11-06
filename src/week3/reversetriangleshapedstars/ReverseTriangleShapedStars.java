package week3.reversetriangleshapedstars;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author JOSEPH
 * find the greatest common divisor
 * find the smallest common multiple
 */

public class ReverseTriangleShapedStars {
    public static void main(String[] args) {
        int rows;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Rows: ");
            rows = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Incorrect Data Type");
            return;
        }

        for (int i = rows; i >= 1; --i) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            for (int j = i; j <= 2 * i - 1; ++j) {
                System.out.print("* ");
            }

            for (int j = 0; j < i - 1; ++j) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
