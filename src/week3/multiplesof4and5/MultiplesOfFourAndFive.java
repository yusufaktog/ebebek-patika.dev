package week3.multiplesof4and5;

import java.util.*;

/**
*@author JOSEPH
 *  powers of 4 and 5 up to the number entered.
*
*/

public class MultiplesOfFourAndFive {
    public static void main(String[] args) {
        int number, i = 0;
        Set<Integer> numbers = new LinkedHashSet<>();

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Number: ");
            number = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Incorrect Data Type");
            return;
        }

        boolean c1 = false, c2 = false;

        while (i < number) {
            if (Math.pow(4, i) < number) {
                numbers.add((int) Math.pow(4, i));
            } else {
                c1 = true;
            }

            if (Math.pow(5, i) < number) {
                numbers.add((int) Math.pow(5, i));
            } else {
                c2 = true;
            }

            if (c1 || c2)
                break;
            i++;
        }

        System.out.println(numbers);

    }
}
