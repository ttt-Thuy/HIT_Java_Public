package bai_1;

public class Faculty {
    private String name;
    private String date;
    private School school;

    public Faculty(String name, String date, School school) {
        this.name = name;
        this.date = date;
        this.school = school;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
    public School getSchool() { return school; }
    public void setSchool(School school) { this.school = school; }

    public void output() {
        System.out.println("Khoa: " + name + ", Ngay vao: " + date);
        school.output();
    }
}
