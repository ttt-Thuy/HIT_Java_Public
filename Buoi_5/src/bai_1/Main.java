package bai_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten truong: ");
        String schoolName = sc.nextLine();
        System.out.print("Nhap ngay vao truong: ");
        String schoolDate = sc.nextLine();
        School school = new School(schoolName, schoolDate);

        System.out.print("Nhap ten khoa: ");
        String facultyName = sc.nextLine();
        System.out.print("Nhap ngay vao khoa: ");
        String facultyDate = sc.nextLine();
        Faculty faculty = new Faculty(facultyName, facultyDate, school);

        System.out.print("Nhap ten sinh vien: ");
        String studentName = sc.nextLine();
        System.out.print("Nhap lop: ");
        String className = sc.nextLine();
        System.out.print("Nhap diem: ");
        double score = sc.nextDouble();
        Student student = new Student(studentName, className, score, faculty);

        System.out.println(" Thong tin sinh vien: ");
        student.output();
    }
}
