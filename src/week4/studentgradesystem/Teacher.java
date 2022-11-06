package week4.studentgradesystem;

public class Teacher {
    private final String name;
    private final String mpno;
    private final String branch;

    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }
    public String getName() {
        return name;
    }

    public String getMpno() {
        return mpno;
    }

    public String getBranch() {
        return branch;
    }
}
