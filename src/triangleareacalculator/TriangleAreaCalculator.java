package triangleareacalculator;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        double perimeter;
        double area;

        double a = 0, b = 0, c = 0, u = 0;

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("First Edge: ");
            a = scanner.nextDouble();

            System.out.print("Second Edge: ");
            b = scanner.nextDouble();

            System.out.print("Third Edge: ");
            c = scanner.nextDouble();

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input!");
        }

        perimeter = (a + b + c);
        u = perimeter / 2;

        area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Area is " + area);
    }
}
