package week4.RepetitiveEvenNumbers;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author JOSEPH
 * Write a program that specifies repeating even numbers in a list of integers.
 */
public class RepetitiveEvenNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = new LinkedList<>();

        int length = 1 + ThreadLocalRandom.current().nextInt(25);

        for (int i = 0; i < length; i++) {
            numbers.add(1 + ThreadLocalRandom.current().nextInt(10));
        }

        System.out.println("The List randomly created is:");
        System.out.println(numbers);

        System.out.println("------------------");

        System.out.print("Repetitive Even numbers: ");

        for (int number : new HashSet<>(numbers)) {
            long count = numbers.stream().filter(n -> n == number).count();
            if (count > 1 && number % 2 == 0) {
                System.out.print(number + ", ");
            }
        }

    }
}
