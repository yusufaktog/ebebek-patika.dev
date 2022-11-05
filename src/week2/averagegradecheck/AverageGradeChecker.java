package week2.averagegradecheck;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author JOSEPH
 * average grade  calculator with
 * math, turkish, physics, chemistry, music classes
 * min average to pass the class is 55;
 * */

public class AverageGradeChecker {
    public static void main(String[] args) {
        final int MIN_AVERAGE = 55;
        Scanner scanner = new Scanner(System.in);

        int math = 0, turkish = 0, physics = 0, chemistry = 0, music = 0;

        try {

            System.out.print("Math Grade: ");
            math = scanner.nextInt();

            System.out.print("Turkish Grade: ");
            turkish = scanner.nextInt();

            System.out.print("Physics Grade: ");
            physics = scanner.nextInt();

            System.out.print("Chemistry Grade: ");
            chemistry = scanner.nextInt();

            System.out.print("Music Grade: ");
            music = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Invalid input format");
        }

        double averageGrade = (chemistry + math + music + physics + turkish) / 5.0;
        System.out.println("The average is " + averageGrade);

        System.out.println(averageGrade >= MIN_AVERAGE ? "Class Passed" : "Class Failed");

    }
}
