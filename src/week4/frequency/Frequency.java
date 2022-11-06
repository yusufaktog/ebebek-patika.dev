package week4.frequency;

import java.util.*;

/**
 * @author JOSEPH
 * frequency calculator
 * */

public class Frequency {

    // create a generic method to count occurrences of all distinct elements in a collection
    static <T> Map<T, Integer> getFrequencies(Collection<T> collection) {
        Map<T, Integer> frequencies = new LinkedHashMap<>();

        // if element exists add 1 to counter or else put a new record to map
        collection.forEach(t -> frequencies.put(t, frequencies.getOrDefault(t, 0) + 1));

        return frequencies;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = "";
        List<Integer> numbers = new LinkedList<>();

        System.out.println("Type set of numbers to get occurrences of each distinct number");
        System.out.println("Type 'q' to when done with typing ");

        do {
            try {
                System.out.print("Number: ");
                number = scanner.nextLine();
                numbers.add(Integer.parseInt(number));
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input Type");
                return;
            } catch (NumberFormatException ignored) {

            }

        } while (!number.equals("q"));

        // print out the result set
        getFrequencies(numbers).forEach((key, value) -> System.out.println("Number " +  key + "\t" + value + " times occurred"));

    }
}
