package baitaptrenlop.bai4_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Student hs = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String name = sc.nextLine();
        hs.setName(name);

        System.out.println("Nhap tuoi: ");
        int age = sc.nextInt();
        hs.setAge(age);

        hs.xuat();
    }
}
