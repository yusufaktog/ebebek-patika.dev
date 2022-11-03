package averagegrade;

public class AverageGradeCalculator {

    public static double calculateAverageGrade(Student student) {
        return (student.chemistry + student.math + student.music + student.physics + student.turkish) / 5.0;
    }
}
