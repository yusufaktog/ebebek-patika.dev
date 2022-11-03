package greengrocer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Greengrocer {
    public static final double PEAR_PRICE = 2.14;
    public static final double APPLE_PRICE = 3.67;
    public static final double TOMATO_PRICE = 1.11;
    public static final double BANANA_PRICE = 0.95;
    public static final double AUBERGINE_PRICE = 5.00;


    public static void main(String[] args) {
        double pear = 0, apple = 0, tomato = 1.11, banana = 0.95, aubergine = 5.00;

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("pear (Kg): ");
            pear = scanner.nextDouble();

            System.out.print("apple (Kg): ");
            apple = scanner.nextDouble();

            System.out.print("tomatoes (Kg): ");
            tomato = scanner.nextDouble();

            System.out.print("banana (Kg): ");
            banana = scanner.nextDouble();

            System.out.print("aubergine (Kg): ");
            aubergine = scanner.nextDouble();


        } catch (InputMismatchException e) {
            System.out.println("Invalid input format");
        }
        double total = pear * PEAR_PRICE +
                apple * APPLE_PRICE +
                tomato * TOMATO_PRICE +
                banana * BANANA_PRICE +
                aubergine * AUBERGINE_PRICE;

        System.out.println("Total Price " + total);

    }
}