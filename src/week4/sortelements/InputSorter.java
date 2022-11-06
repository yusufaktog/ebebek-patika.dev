package week4.sortelements;

import java.util.Arrays;

import java.util.Scanner;

public class InputSorter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // get input length
        System.out.print("input length: ");
        int length = scanner.nextInt();

        int[] numbers = new int[length];

        int number;

        // take numbers
        for (int i = 0; i < length; i++) {
            System.out.print((i +1) +  ".number: ");
            number = scanner.nextInt();
            numbers[i] = number;
        }

        //use Arrays.sort() to sort the array in ascending order
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
    }
}
