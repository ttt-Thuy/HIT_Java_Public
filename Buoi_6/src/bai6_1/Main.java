package bai6_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> list = new  ArrayList<>();
        System.out.println("Nhap so sinh vien muon them");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            SinhVien sv = new SinhVien();
            LopHoc lh = new LopHoc();
            System.out.println("Ma sinh vien: ");
            sv.setMaSv(sc.nextLine());
            System.out.println("Ten: ");
            sv.setHoTen(sc.nextLine());
            System.out.println("Diem: ");
            sv.setDiemTB(sc.nextDouble());
            sc.nextLine();
            System.out.println("Ma lop: ");
            lh.setMaLop(sc.nextLine());
            System.out.println("Ten lop: ");
            lh.setTenLop(sc.nextLine());
            sv.setLop(lh);
            list.add(sv);
        }
        System.out.println("====DANH SACH SINH VIEN====");
        for (SinhVien sv : list) {
            sv.inThongTin();
        }
        System.out.println("Sinh vien co diem TB cao nhat la:");
        double max = list.get(0).getDiemTB();
        SinhVien svmax = new SinhVien();
        for (SinhVien sv : list) {
            if (sv.getDiemTB() > max) {
                max = sv.getDiemTB();
                svmax = sv;
            }
        }
        svmax.inThongTin();
    }
}
