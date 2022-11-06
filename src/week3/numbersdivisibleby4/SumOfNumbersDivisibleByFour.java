package week3.numbersdivisibleby4;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * Write a program that calculates the average of numbers
 * Divisible by 3 and 4 from 0 to the number entered
 */

public class SumOfNumbersDivisibleByFour {

    public static void main(String[] args) {
        int input;

        List<Integer> numbers = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        do {
            try {
                System.out.print("Number: ");
                input = scanner.nextInt();

                if (input % 4 == 0)
                    numbers.add(input);

            } catch (InputMismatchException e) {
                System.out.println("Incorrect Data Type");
                return;
            }
        }
        while (input % 2 != 1);

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Sum of numbers divisible by 4 is: " + sum);

    }
}
