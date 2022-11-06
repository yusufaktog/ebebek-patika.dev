package week3.evennumbers;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * Write a program that calculates the average of numbers
 * divisible by 3 and 4 from 0 to the number entered
 */
public class EvenNumber {

    public static void main(String[] args) {
        int limit, i = 0;
        List<Integer> numbers = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Limit: ");
            limit = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Incorrect Data Type");
            return;
        }

        while (i < limit) {
            if (i % 3 == 0 && i % 4 == 0) {
                numbers.add(i);
            }
            i++;
        }

        double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println("Average of numbers divisible by 3 and 4: " + average);
    }
}
