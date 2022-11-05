package week2.chinesezodiac;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Monkey
 * Rooster
 * Dog
 * Pig
 * Rat
 * Ox
 * Tiger
 * Rabbit
 * Dragon
 * Snake
 * Horse
 * Goat
 * */
public class ChineseZodiac {
    public static void main(String[] args) {
        int year;
        String zodiac;

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Year: ");
            year = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Incorrect Data Type");
            return;
        }

        if (year % 12 == 0)
            zodiac = "Monkey";

        else if (year % 12 == 1)
            zodiac = "Rooster";

        else if (year % 12 == 2)
            zodiac = "Dog";

        else if (year % 12 == 3)
            zodiac = "Pig";

        else if (year % 12 == 4)
            zodiac = "Rat";

        else if (year % 12 == 5)
            zodiac = "Ox";

        else if (year % 12 == 6)
            zodiac = "Tiger";

        else if (year % 12 == 7)
            zodiac = "Rabbit";

        else if (year % 12 == 8)
            zodiac = "Dragon";

        else if (year % 12 == 9)
            zodiac = "Snake";

        else if (year % 12 == 10)
            zodiac = "horse";

        else
            zodiac = "Goat";

        System.out.print("Your chinese zodiac sign: " + zodiac);

    }
}
