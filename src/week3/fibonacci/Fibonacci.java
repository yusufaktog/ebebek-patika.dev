package week3.fibonacci;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author JOSEPH
 * The Fibonacci sequence starts from 0 and goes on to infinity.
 * Each digit is added up with the previous digit.
 * The result obtained is written on the right side of the figure.
 * The first ten numbers of the Fibonacci sequence are as follows:
 * 9 Element Fibonacci Series: 0 1 1 2 3 5 8 13 21 34
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        // get input length from user
        try {
            System.out.print("Length: ");
            length = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Incorrect Data Type");
            return;
        }
        // to store numbers
        List<Integer> numbers = new LinkedList<>();
        int before = 0, after = 1, i = 0;

        numbers.add(before);
        numbers.add(after);

        while (i < length - 1) {
            int temp = before + after;
            before = after;
            after = temp;
            numbers.add(after);
            i++;
        }
        System.out.println(numbers);

    }
}
