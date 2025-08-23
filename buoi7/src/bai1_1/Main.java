package bai1_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hinh: ");
        int n = sc.nextInt();
        int chon;
        Shape[] list = new Shape[n];
        double []area = new double[n];
        int i = 0;
        while(i < n){
            System.out.println("1.Hinh tron");
            System.out.println("2.Hinh chu nhat");
            System.out.println("CHON: ");
            chon = sc.nextInt();
            switch(chon){
                case 1:
                    System.out.println("Nhap ban kinh: ");
                    list[i] = new Circle(sc.nextDouble());
                    area[i] = list[i].area();
                    i++;
                    break;
                case 2:
                    System.out.println("Nhap dai:");
                    double dai = sc.nextDouble();
                    System.out.println("Nhap rong:");
                    double rong = sc.nextDouble();
                    list[i] = new Rectangle(dai, rong);
                    area[i] = list[i].area();
                    i++;
                    break;

            }
        }
        System.out.println("dien tich cac hinh lan luot la:");
        for(i = 0; i < n; i++){
            System.out.println("Dien tich hinh thu "+(i+1) +" la: "+area[i]);
        }
    }
}
