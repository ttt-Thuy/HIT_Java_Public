package bai_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma quan ly: ");
        String maQL = sc.nextLine();
        System.out.print("Nhap ten quan ly: ");
        String tenQL = sc.nextLine();
        QuanLy ql = new QuanLy(maQL, tenQL);

        System.out.print("Nhap ma phong: ");
        String maPhong = sc.nextLine();
        System.out.print("Nhap ten phong: ");
        String tenPhong = sc.nextLine();
        System.out.print("Nhap dien tich: ");
        double dienTich = sc.nextDouble();
        sc.nextLine(); // bỏ trôi dòng

        System.out.print("Nhap so luong may: ");
        int n = sc.nextInt();
        sc.nextLine();

        May[] dsMay = new May[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin may " + (i+1) + ":");
            System.out.print("  Ma may: ");
            String maMay = sc.nextLine();
            System.out.print("  Ten may: ");
            String tenMay = sc.nextLine();
            System.out.print("  Tinh trang: ");
            String tinhTrang = sc.nextLine();
            dsMay[i] = new May(maMay, tenMay, tinhTrang);
        }

        PhongMay pm = new PhongMay(maPhong, tenPhong, dienTich, ql, dsMay);

        System.out.println(" Thông tin phòng máy");
        pm.output();
    }
}
