package bai6_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyNhanVien manager = new QuanLyNhanVien();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nhan vien muon them: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            NhanVien nv = new NhanVien();
            manager.themNhanVien(nv);
        }
        System.out.println("Danh sach nhan vien");
        manager.hienThiThongTin();
        System.out.println("Tong luong cua cac nhan vien la: " + manager.tinhTongLuong());
    }
}
