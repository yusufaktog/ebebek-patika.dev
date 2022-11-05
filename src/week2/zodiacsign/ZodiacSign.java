package week2.zodiacsign;

import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author JOSEPH
 * Zodiac Sign
 * Aquarius: Kova  (Ocak 21- Şubat 19)
 * Pisces: Balık  (Şubat 20 – Mart 20)
 * Aries: Koç  (Mart 21 – Nisan 20)
 * Taurus: Boğa  (Nisan 21 – Mayıs 21)
 * Gemini: İkizler  (Mayıs 22 – Haziran 21)
 * Cancer: Yengeç  (Haziran 22 – Temmuz 22)
 * Leo: Aslan  (Temmuz 23 – Ağustos 21)
 * Virgo: Başak  (Ağustos 22 – Eylül 23)
 * Libra: Terazi  (Eylül 24 – Ekim 23)
 * Scorpio: Akrep  (Ekim 24 – Kasım 22)
 * Sagittarius: Yay  (Kasım 23 – Aralık 22)
 * Capricorn: Oğlak  (Aralık 23 – Ocak 20)
 */

public class ZodiacSign {
    public static void main(String[] args) {
        int day, month;

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Day of Birth: ");
            day = scanner.nextInt();

            System.out.print("Month of Birth: ");
            month = scanner.nextInt();


        } catch (InputMismatchException e) {
            System.out.println("Invalid input format");
            return;
        }

        if (!(day >= 1 && day <= 31)) {
            System.out.println("Invalid Day");
            return;
        }
        if (!(month >= 1 && month <= 12)) {
            System.out.println("Invalid Moth");
            return;
        }

        if (month == 1) {
            if (day <= 21)
                System.out.println("Capricorn");
            else
                System.out.println("Aquarius");
        } else if (month == 2) {
            if (day <= 19)
                System.out.println("Aquarius");
            else
                System.out.println("Pisces");
        } else if (month == 3) {
            if (day <= 20)
                System.out.println("Pisces");
            else
                System.out.println("Aries");
        } else if (month == 4) {
            if (day <= 20)
                System.out.println("Aries");
            else
                System.out.println("Taurus");
        } else if (month == 5) {
            if (day <= 21)
                System.out.println("Taurus");
            else
                System.out.println("Gemini");
        } else if (month == 6) {
            if (day <= 22)
                System.out.println("Gemini");
            else
                System.out.println("Cancer");
        } else if (month == 7) {
            if (day <= 22)
                System.out.println("Cancer");
            else
                System.out.println("Leo");
        } else if (month == 8) {
            if (day <= 22)
                System.out.println("Leo");
            else
                System.out.println("Virgo");
        } else if (month == 9) {
            if (day <= 22)
                System.out.println("Virgo");
            else
                System.out.println("Libra");
        } else if (month == 10) {
            if (day <= 22)
                System.out.println("Libra");
            else
                System.out.println("Scorpio");
        } else if (month == 11) {
            if (day <= 21)
                System.out.println("Scorpio");
            else
                System.out.println("Sagittarius");
        } else {
            if (day <= 21)
                System.out.println("Sagittarius");
            else
                System.out.println("Capricorn");
        }
    }
}
