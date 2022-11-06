package week3.findminandmaxinput;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author JOSEPH
 * find the min and max number from a series of input
 */

public class FindMinAndMaxInput {
    public static void main(String[] args) {
        int length, input;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Length: ");
            length = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Incorrect Data Type");
            return;
        }

        int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print((i + 1) + ".Number: ");
            input = scanner.nextInt();
            numbers[i] = input;
        }

        Arrays.sort(numbers);

        System.out.println("Min input: " + numbers[0] + ", Max input: " + numbers[length - 1]);
    }
}
