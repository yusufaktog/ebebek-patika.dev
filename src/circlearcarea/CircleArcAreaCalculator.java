package circlearcarea;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author JOSEPH
 * Calcutate Circle Arc with angle 'a' in degrees
 * area = (Math.PI * radius * radius * a) / 360;
 */
public class CircleArcAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double angle = 0;
        double radius = 0;
        double area = 0;

        try {
            System.out.println("Radius : ");
            radius = scanner.nextDouble();

            System.out.println("Angle : ");
            angle = scanner.nextDouble();

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }

        area = (Math.PI * radius * radius * angle) / 360;

        System.out.println("Area of Arc " + area);
    }
}
