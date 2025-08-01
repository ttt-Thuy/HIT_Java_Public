package bai_2;

import bai_1.Student;

import java.util.Scanner;
import java.util.ArrayList;


public class menu {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.clear();
        Scanner sc = new Scanner(System.in);
        int chon;
        do{
            System.out.println("==========MENU========");
            System.out.println("1.Thêm sinh viên mới");
            System.out.println("2.Sửa thông tin sinh viên");
            System.out.println("3.Sắp xếp sinh viên theo tuổi ");
            System.out.println("4.Sắp xếp sinh viên theo GPA");
            System.out.println("5.Sắp xếp sinh viên theo số tiết nghỉ");
            System.out.println("6.Xóa sinh viên khỏi danh sách");
            System.out.println("0.Thoát");
            System.out.print("CHON : ");
            chon = sc.nextInt();

            switch(chon){
                case 1 :
                    nhapMang(list);
                    inTieuDe();
                    xuatMang(list);
                    break;
                case 2 :
                    sc.nextLine();
                    System.out.println("Nhap ten sinh vien muon sua thong tin: ");
                    String ten = sc.nextLine();
                    for (Student sv : list) {
                        if (ten.equalsIgnoreCase(sv.getTen())) {
                            System.out.print("Nhap ten moi: ");
                            String name = sc.nextLine();
                            sv.setTen(name);
                            System.out.print("Nhap nam sinh moi: ");
                            int nam = sc.nextInt();
                            sv.setNamSinh(nam);
                            sc.nextLine();
                            System.out.print("Nhap dia chi moi: ");
                            String dia = sc.nextLine();
                            sv.setDiaChi(dia);
                            System.out.print("Nhap diem TX1 moi: ");
                            double tx1 = sc.nextDouble();
                            sv.setTx1(tx1);
                            System.out.print("Nhap diem TX2 moi: ");
                            double tx2 = sc.nextDouble();
                            sv.setTx2(tx2);
                            System.out.print("Nhap diem KTHP moi: ");
                            double kthp = sc.nextDouble();
                            sv.setKthp(kthp);
                            System.out.print("Nhap so tiet nghi moi: ");
                            int soTietNghi = sc.nextInt();
                            sv.setSoTietNghi(soTietNghi);

                        }

                    }
                    inTieuDe();
                    xuatMang(list);
                    break;
                case 3 :
                    list.sort((s1, s2) -> Integer.compare(s1.getNamSinh(), s2.getNamSinh()));
                    inTieuDe();
                    xuatMang(list);
                    break;
                case 4 :
                    list.sort((s1, s2) -> Double.compare(s1.gpa(), s2.gpa()));
                    inTieuDe();
                    xuatMang(list);
                    break;
                case 5 :
                    list.sort((Student s1, Student s2)->Integer.compare(s1.getSoTietNghi(), s2.getSoTietNghi()));
                    inTieuDe();
                    xuatMang(list);
                    break;
                case 6 :
                    sc.nextLine();
                    System.out.println("Nhap ten sinh vien muon xoa: ");
                    String ten2 = sc.nextLine();
                    for (Student sv : list) {
                        if (ten2.equalsIgnoreCase(sv.getTen())) {
                            list.remove(sv);
                        }
                    }
                    inTieuDe();
                    xuatMang(list);
                    break;
            }
        }
        while(chon != 0);

    }
    public static void nhapMang(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so sinh vien : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("Nhap sinh vien thu " + (i + 1) + ":");
            Student sv = new Student();
            sv.nhap();
            list.add(sv);
        }
    }
    public static void xuatMang(ArrayList<Student> list){
        for (Student sv : list){
            sv.xuat();
        }
    }
    public static void inTieuDe(){
        System.out.printf( "Ten" + "NAM SINH" +"Dia Chi"+  "Diem TX1"+ "Diem TX2"+ "Diem KTHP"+ "GPA"+  "So Tiet Nghi");

    }
}
