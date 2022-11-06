package week4.studentgradesystem;

public class Main {
    public static void main(String[] args) {
        Course math = new Course("Mathematics", "MTH101", "math", 0.2);
        Course physics = new Course("Physics", "PHY101", "physics", 0.3);
        Course chemistry = new Course("Chemistry", "CHM101", "chemistry", 0.15);

        Teacher teacher1 = new Teacher("John Doe Math", "90550000000", "math");
        Teacher teacher2 = new Teacher("John Doe Physics", "90550000002", "physics");
        Teacher teacher3 = new Teacher("John Doe Chemistry", "90550000003", "chemistry");

        math.addTeacher(teacher1);
        physics.addTeacher(teacher2);
        chemistry.addTeacher(teacher3);

        Student s1 = new Student("Student 1", 4, "140144015", math, physics, chemistry);
        s1.addBulkExamNote(50, 20, 40);
        s1.addVerbalBulkNote(55, 45, 65);
        s1.hasPassed();

        Student s2 = new Student("Student 2", 4, "2211133", math, physics, chemistry);
        s2.addBulkExamNote(100, 50, 40);
        s2.addVerbalBulkNote(100, 75, 50);
        s2.hasPassed();

        Student s3 = new Student("Student 3", 4, "221121312", math, physics, chemistry);
        s3.addBulkExamNote(50, 20, 40);
        s3.addVerbalBulkNote(55, 45, 55);
        s3.hasPassed();
    }
}
