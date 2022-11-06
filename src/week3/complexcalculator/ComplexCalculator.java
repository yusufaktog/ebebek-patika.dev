package week3.complexcalculator;

import java.util.Scanner;

/**
 * 1- Summation
 * 2- Subtraction
 * 3- Multiplication
 * 4- Division
 * 5- Powers of
 * 6- Factorial
 * 7- Mode
 * 8- Rectangle area
 */

public class ComplexCalculator {
    static Scanner scanner = new Scanner(System.in);

    static void summation() {

        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". number :");
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Result: " + result);
    }

    static void subtraction() {

        System.out.print("Length: ");
        int counter = scanner.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scanner.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Result: " + result);
    }

    static void multiplication() {

        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". number :");
            number = scanner.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }

            result *= number;
        }

        System.out.println("Result : " + result);
    }

    static void division() {

        System.out.print("Length: ");
        int counter = scanner.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {

            System.out.print(i + ". number :");
            number = scanner.nextDouble();

            if (i != 1 && number == 0) {
                System.out.println("Divisor can not be zero.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Result: " + result);
    }

    static void power() {


        System.out.print("base: ");
        int base = scanner.nextInt();

        System.out.print("power: ");
        int exponent = scanner.nextInt();

        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("result: " + result);
    }

    static void factorial() {

        System.out.print("number: ");
        int n = scanner.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result: " + result);
    }

    static void rectangle() {
        int shortSide, longSide;

        System.out.print("Short Side: ");
        shortSide = scanner.nextInt();

        System.out.print("Long Side: ");
        longSide = scanner.nextInt();

        System.out.println("Area: " + shortSide * longSide + " perimeter: " + 2 * (shortSide + longSide));

    }

    static void mode() {
        int number, mode;

        System.out.print("Number: ");
        number = scanner.nextInt();

        System.out.print("Mode: ");
        mode = scanner.nextInt();

        System.out.print("mode(" + number + "," + mode + ")" + ": " + (number % mode));
    }

    public static void main(String[] args) {

        int option;
        String menu = """
                1- Summation
                2- Subtraction
                3- Multiplication
                4- Division
                5- Power
                6- Factorial
                7- Mode
                8- Rectangle area and perimeter
                0- Exit""";

        do {
            System.out.println("\n"+menu);
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    summation();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mode();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid number.");
            }
        } while (option != 0);


    }
}
