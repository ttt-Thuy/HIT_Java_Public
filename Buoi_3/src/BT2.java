import  java.util.Scanner;

public class BT2 {

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        final double PI = 3.14159265;

        System.out.println("Nhap ban kinh r: ");
        double r = sc.nextDouble();
        System.out.println("Nhap so mu k: ");
        int k = sc.nextInt();

        System.out.println("Chu vi hinh tron: " + (2*PI*r));
        System.out.println("Dien tich hinh tron: " + (PI*r*r));

        System.out.println("Can cua (r+k): "+ Math.pow(r+k , 2));
        System.out.println("Gia tri tuyet doi (r-k): "+ Math.abs(r-k));
    }
}
