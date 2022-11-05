package week2.leapyear;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Find whether the input is a leap year or not
 */

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;

        try {
            System.out.print("Year: ");
            year = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Incorrect Data Type");
            return;
        }

        if (year < 0) {
            System.out.println("Invalid Data ");
            return;
        }

        if (year % 4 == 0) {
            System.out.print(year + " is a leap year");
            return;
        }

        if (year % 400 == 0) {
            System.out.print(year + " is a leap year");
            return;
        }

        System.out.print(year + " is not an leap year");

    }
}
