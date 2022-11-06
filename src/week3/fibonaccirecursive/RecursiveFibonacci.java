package week3.fibonaccirecursive;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author JOSEPH
 * The Fibonacci sequence starts from 0 and goes on to infinity.
 * Each digit is added up with the previous digit.
 * The result obtained is written on the right side of the figure.
 * The first ten numbers of the Fibonacci sequence are as follows:
 * 9 Element Fibonacci Series: 0 1 1 2 3 5 8 13 21 34
 */
public class RecursiveFibonacci {
    static int fibo(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        return fibo(n - 2) + fibo(n - 1);
    }

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

        for (int i = 0; i < length; i++) {
            System.out.print(fibo(i) + " ");
        }
    }
}
