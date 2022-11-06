package week4.studentgradesystem;

public class Course {
    private Teacher courseTeacher;
    private final String name;
    private final String code;
    private final String prefix;
    private int grade;
    private int verbalGrade;
    private final double verbalFactor;

    public Course(String name, String code, String prefix, double verbalFactor) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.verbalFactor = verbalFactor;
        this.grade = 0;
        this.verbalGrade = 0;
    }

    public void addTeacher(Teacher teacher) {
        if (this.prefix.equals(teacher.getBranch())) {
            this.courseTeacher = teacher;
            System.out.println(teacher.getName() + " has been added successfully to " + this.name + " course");
        } else {
            System.out.println("Lecturer " + teacher.getName() + " can not teach this course.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println("Lecturer of " + this.name + ": " + this.courseTeacher.getName());
        } else {
            System.out.println(this.name + " has no Lecturer.");
        }
    }

    public Teacher getCourseTeacher() {
        return courseTeacher;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getPrefix() {
        return prefix;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setVerbalGrade(int verbalGrade) {
        this.verbalGrade = verbalGrade;
    }

    public int getVerbalGrade() {
        return verbalGrade;
    }

    public double getVerbalFactor() {
        return verbalFactor;
    }

    public double calculateAverageGrade() {
        return grade * (1 - verbalFactor) + verbalGrade * verbalFactor;
    }
}
