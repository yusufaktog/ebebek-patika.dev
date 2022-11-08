package week4.harmonicaverage;


import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class HarmonicAverage {
    public static void main(String[] args) {
        double total = 0;
        List<Integer> numbers = new LinkedList<>();

        // create random list
        int length = 1 + ThreadLocalRandom.current().nextInt(20);

        for (int i = 0; i < length; i++) {
            numbers.add(1 + ThreadLocalRandom.current().nextInt(100));
        }

        // loop through random list
        for (int i = 0; i < length; i++) {
            total += 1.0 / numbers.get(i);
        }

        System.out.println(numbers);
        System.out.println("harmonic average for list printed out above is: " + length / total);

    }
}
