package bai_1;

public class School {
    private String name;
    private String date;

    public School(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public void output() {
        System.out.println("Truong: " + name + ", Ngay vao: " + date);
    }
}
