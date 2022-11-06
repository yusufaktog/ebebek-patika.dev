package week3.ebobekok;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author JOSEPH
 * find the greatest common divisor
 * find the smallest common multiple
 */

public class EbobAndEkok {
    public static void main(String[] args) {
        int number1, number2;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Number 1: ");
            number1 = scanner.nextInt();

            System.out.print("Number 2: ");
            number2 = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Incorrect Data Type");
            return;
        }

        int min = Math.min(number1, number2);
        int max = Math.max(number1, number2);

        int ebob = 1;
        int ekok = number1 * number2;
        int i = 1;

        while (i <= min) {
            if (number1 % i == 0 && number2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        i = max;

        while (i < max * min) {
            if (i % max == 0 && i % min == 0) {
                ekok = i;
                break;
            }
            i++;
        }

        System.out.println("ebob " + ebob + " ekok " + ekok);
    }
}
