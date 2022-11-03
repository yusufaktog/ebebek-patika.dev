package week2.calculator;

import java.util.Scanner;

/**
 * @author JOSEPH
 * basic calculator with switch-case
 * */
public class Calculator {
    public static void main(String[] args) {
        int n1, n2, choice;

        Scanner scanner = new Scanner(System.in);

        System.out.print("First Number: ");
        n1 = scanner.nextInt();

        System.out.print("Second Number: ");
        n2 = scanner.nextInt();

        System.out.println("Choose An Option\n1-Summation\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.print("\nOption:");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Sum of " + n1 + " and " + n2 + " is " + (n1 + n2));
                break;
            case 2:
                System.out.println("Difference between " + n1 + " and " + n2 + " is " + (n1 - n2));
                break;
            case 3:
                System.out.println(n1 + " times " + n2 + " is " + (n1 * n2));
                break;
            case 4:
                System.out.println(n1 + " divided by " + n2 + " is " + (n1 / n2));
                break;
        }
    }
}
