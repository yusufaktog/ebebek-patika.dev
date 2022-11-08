package week4.smallestandbiggestvalue;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author JOSEPH
 * Write a program that finds
 * the smallest number of elements in the array
 * and the closest number to the largest number.
 */
public class SmallestAndBiggestValue {
    public static void main(String[] args) {

        int number;
        List<Integer> numbers = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int length = 1 + ThreadLocalRandom.current().nextInt(15);

        for (int i = 0; i < length; i++) {
            numbers.add(1 + ThreadLocalRandom.current().nextInt(50));
        }

        try {
            System.out.print("Number: ");
            number = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Incorrect Data Type");
            return;
        }

        System.out.println("The List randomly created is:");
        System.out.println(numbers);

        // add the number to list, then sort the list,
        // min number is the number just before our number,
        // max number is the number just after our number
        numbers.add(number);
        numbers.sort(Integer::compare);

        int index = numbers.indexOf(number);

        if (index != 0)
            System.out.println("Min: " + numbers.get(index - 1));
        else
            System.out.println("There is no other value smaller than " + number + " in the list!");

        if (index != length)
            System.out.println("Max: " + numbers.get(index + 1));
        else
            System.out.println("There is no other value bigger than " + number + " in the list!");

    }
}
