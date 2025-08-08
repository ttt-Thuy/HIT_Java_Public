package bai_1;

public class Student {private String name;
    private String className;
    private double score;
    private Faculty faculty;

    public Student(String name, String className, double score, Faculty faculty) {
        this.name = name;
        this.className = className;
        this.score = score;
        this.faculty = faculty;
    }

    public String getName() { return name; }
    public String getClassName() { return className; }
    public double getScore() { return score; }
    public Faculty getFaculty() { return faculty; }

    public void output() {
        System.out.println("Tên SV: " + name + ", Lớp: " + className + ", Điểm: " + score);
        faculty.output();
    }
}
