package week4.studentgradesystem;

public class Student {
    private final String name, studentNo;
    int classes;
    private final Course math;
    private final Course physics;
    private final Course chemistry;
    private double average;
    boolean passed;


    public Student(String name, int classes, String studentNo, Course math, Course physics, Course chemistry) {
        this.name = name;
        this.classes = classes;
        this.studentNo = studentNo;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        calculateAverageGrade();
        this.passed = false;
    }


    public void addBulkExamNote(int math, int physics, int chemistry) {

        if (math >= 0 && math <= 100) {
            this.math.setGrade(math);
        }

        if (physics >= 0 && physics <= 100) {
            this.physics.setGrade(physics);
        }

        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.setGrade(chemistry);
        }

    }

    public void addVerbalBulkNote(int mathVerbal, int physicsVerbal, int chemistryVerbal) {

        if (mathVerbal >= 0 && mathVerbal <= 100) {
            this.math.setVerbalGrade(mathVerbal);
        }

        if (physicsVerbal >= 0 && physicsVerbal <= 100) {
            this.physics.setVerbalGrade(physicsVerbal);
        }

        if (chemistryVerbal >= 0 && chemistryVerbal <= 100) {
            this.chemistry.setVerbalGrade(chemistryVerbal);
        }

    }

    public void hasPassed() {
        if (this.math.getGrade() == 0 || this.physics.getGrade() == 0 || this.chemistry.getGrade() == 0) {
            System.out.println("Grades have not been set yet !");
        } else {
            this.passed = isCheckPass();
            printNote();
            System.out.println("Average : " + this.average);
            if (this.passed) {
                System.out.println("Passed the course. ");
            } else {
                System.out.println("Failed...");
            }
        }
    }

    public void calculateAverageGrade() {
        this.average = (this.physics.calculateAverageGrade() +
                this.chemistry.calculateAverageGrade() +
                this.math.calculateAverageGrade()) / 3.0;
    }

    public boolean isCheckPass() {
        calculateAverageGrade();
        return this.average > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Student: " + this.name);

        System.out.println("Math Grade: " + this.math.getGrade() +
                ", verbal: " + this.math.getVerbalGrade());

        System.out.println("Physics Grade: " + this.physics.getGrade() +
                ", verbal: " + this.physics.getVerbalGrade());

        System.out.println("Chemistry Grade: " + this.chemistry.getGrade() +
                ", verbal: " + this.chemistry.getVerbalGrade());
    }
}
