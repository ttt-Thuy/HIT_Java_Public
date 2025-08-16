package bai6_2;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyNhanVien {
    private ArrayList<NhanVien> danhSachNhanVien;

    public void themNhanVien(NhanVien nv){
        System.out.println(" Them nhan vien: ");
        Scanner sc= new Scanner(System.in);
        System.out.println("1.Full time");
        System.out.println("2.Part time");
        System.out.println(" Chon 1 or 2");

        int chon = sc.nextInt();

        if (chon==1){
            System.out.println("Ma sv: ");
            nv.getMaNV();
            System.out.println("Ten: ");
            nv.getTen();
            System.out.println("Tuoi: ");
            nv.getTuoi();
            System.out.println("Email");
            nv.getEmail();
            System.out.println("So dien thoai;");
            nv.getSoDienThoai();
        }
        else{
            System.out.println("Ma sv: ");
            nv.getMaNV();
            System.out.println("Ten: ");
            nv.getTen();
            System.out.println("Tuoi: ");
            nv.getTuoi();
            System.out.println("Email");
            nv.getEmail();
            System.out.println("So dien thoai;");
            nv.getSoDienThoai();
        }
        danhSachNhanVien.add(nv);

    }
    
    public void hienThiThongTin(){
        for(NhanVien nv : danhSachNhanVien)
            nv.hienThiThongTin();
    }

    public double tinhTongLuong() {
        double T = 0;
        for (NhanVien nv : danhSachNhanVien) {
            T += nv.tinhLuong();
        }
        return T;
    }
}
