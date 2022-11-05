package week2.numbercomparator;

import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author JOSEPH
 * compare input number a,b,c and print them
 */
public class NumberComparator {
    public static void main(String[] args) {
        int a, b, c;
        Map<String, Integer> map = new LinkedHashMap<>();

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("First number(a): ");
            a = scanner.nextInt();

            System.out.print("Second number(b): ");
            b = scanner.nextInt();

            System.out.print("Third number(c): ");
            c = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Invalid input format");
            return;
        }

        //Java 8 STREAM API approach
        // put values in a map
        // sort the map, and print out with foreach

        StringBuilder stringBuilder = new StringBuilder();

        map.put("a", a);
        map.put("b", b);
        map.put("c", c);

        map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .forEach(entry -> stringBuilder.append(entry.getKey()).append(" > "));

        // remove ">" char at the end
        stringBuilder.reverse().replace(0, 3, "");

        System.out.println(stringBuilder);

    }
}
