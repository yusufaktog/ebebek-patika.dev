package bmicalculator;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author JOSEPH
 * Body Mass Index calculator
 * weight (kg), height(m)
 * bmi = weight / (height * height)
 */
public class BmiCalculator {  // Body Mass Index
    public static void main(String[] args) {
        double weight = 0, height = 0;
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Weight (Kg): ");
            weight = scanner.nextDouble();

            System.out.print("Height (Meters): ");
            height = scanner.nextDouble();

        } catch (InputMismatchException e) {
            System.out.println("Invalid input format");
        }

        double bmi = weight / (height * height);

        System.out.println("Your Body Mass Index is " + new DecimalFormat("0.00").format(bmi));

    }
}
