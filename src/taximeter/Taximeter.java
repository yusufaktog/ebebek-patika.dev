package taximeter;

import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author JOSEPH
 * Calculate the total price of drive
 */
public class Taximeter {
    public static final double PRICE_PER_KM = 2.2;
    public static final int MIN_PRICE = 20;
    public static final int OPENING_FEE = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distance = 0;
        double totalPrice = 0;

        try {
            System.out.println("Distance (Km) :");
            distance = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }

        totalPrice = OPENING_FEE + (distance * PRICE_PER_KM);

        totalPrice = totalPrice < MIN_PRICE ? MIN_PRICE : totalPrice;

        System.out.println("Total: " + totalPrice);
    }
}
