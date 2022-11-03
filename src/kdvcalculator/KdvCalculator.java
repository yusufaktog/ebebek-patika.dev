package kdvcalculator;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * @author JOSEPH
 * calcutlate the kdv ratio and amount of kdv applied
 */
public class KdvCalculator {
    public static void main(String[] args) {
        double basePrice = 0;
        final int KDV_LIMIT = 1000;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Price: ");
            basePrice = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input Format!");
        }

        double kdvRatio = basePrice < KDV_LIMIT ? 0.18 : 0.8;
        double kdv = basePrice * kdvRatio;

        System.out.println("kdv: " + kdv);
        System.out.println("Total price " + (basePrice + kdv));

    }
}
