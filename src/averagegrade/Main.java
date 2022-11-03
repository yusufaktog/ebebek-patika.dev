package averagegrade;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

        Student student = new Student(math, physics, chemistry, turkish, music);

        double averageGrade = AverageGradeCalculator.calculateAverageGrade(student);
        System.out.println("The average is " + averageGrade);

        String message = averageGrade >= 60 ? "Class Passed" : "Class Failed";
        System.out.println(message);

    }
}
