package week2.flightticket;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author JOSEPH
 * flight ticket price calculator with given inputs
 */

public class FlightTicket {
    public static final double PRICE_PER_KM = 0.1;

    public static void main(String[] args) {
        int discount;
        int age, distance, type;
        double price;

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Distance (km): ");
            distance = scanner.nextInt();

            System.out.print("Age: ");
            age = scanner.nextInt();

            System.out.print("Type of trip (1 => One Way, 2 => Round Trip): ");
            type = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Incorrect Data Type");
            return;
        }


        if (age < 0 || distance < 0 || type < 1 || type > 2) {
            System.out.println("Incorrect Data");
            return;
        }
        // age discount
        if (age < 12)
            discount = 50;
        else if (age > 12 && age < 24)
            discount = 10;
        else
            discount = 30;

        price = PRICE_PER_KM * distance;
        price -= (price * discount) / 100;

        if (type == 2) {
            price -= price * 0.2;
            price *= 2;
        }

        System.out.println("Total Price: " + price);
    }
}
