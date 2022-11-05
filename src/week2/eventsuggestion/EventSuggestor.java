package week2.eventsuggestion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EventSuggestor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int temperature;

        try {

            System.out.print("Temperature: ");
            temperature = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Invalid input format");
            return;
        }

        if (temperature < 5) {
            System.out.println("Learn skiing");
        } else if (temperature > 5 && temperature < 15) {
            System.out.println("Go to Cinema");
        } else if (temperature > 15 && temperature < 25) {
            System.out.println("Go to Picnic");
        }else{
            System.out.println("Go to swimming");
        }
    }

}
