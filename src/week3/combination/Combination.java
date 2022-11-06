package week3.combination;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author JOSEPH
 * The number of different groups
 * with r elements to be formed with the elements
 * of a set with n elements
 * is called the r combination of n.
 * The r combination of N is denoted as C(n,r).
 * Write a program that calculates combinations
 **/
public class Combination {
    public static long fact(int n) {
        if (n == 0)
            return 1;
        else
            return (n * fact(n - 1));
    }

    public static void main(String[] args) {
        int n, r;

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("n: ");
            n = scanner.nextInt();

            System.out.print("r: ");
            r = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Incorrect Data Type");
            return;
        }

        if (n < r) {
            int temp = r;
            r = n;
            n = temp;
        }

        long result = fact(n) / (fact(r) * fact(n - r));
        System.out.printf("C(%d,%d):%d ", n, r, result);
    }
}
