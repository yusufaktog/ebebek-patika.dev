package week3.primenumbers;

import java.util.LinkedList;
import java.util.List;

/**
 * @author JOSEPH
 * find the prime numbers between 1 and 100
 */
public class PrimeNumber {
    public static void main(String[] args) {
        int i = 2, j = 2;
        List<Integer> numbers = new LinkedList<>();
        boolean divisible;

        while (i < 100) {
            divisible = false;
            j = 2;
            while (j < i) {
                if (i % j == 0) {
                    divisible = true;
                }
                j++;
            }
            if (!divisible)
                numbers.add(i);
            i++;
        }
        System.out.println(numbers);
    }
}
