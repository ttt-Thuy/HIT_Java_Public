package BAI1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi ki tu: ");
        System.out.print(">");
        String str = sc.nextLine();
        String strCopy2 = "";
        int count = 0;
        int count2 = 0;

        String strCopy1 = str.toLowerCase();
        for (int i = 0; i < strCopy1.length(); i++) {
            if(strCopy1.charAt(i)== 'a' || strCopy1.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
                strCopy2 += str.charAt(i);
            }
            if(str.charAt(i) >=  'A' && str.charAt(i) <= 'Z'){
                count2++;
            }
        }
        System.out.println("So ki tu nguyen am la : " + count);
        System.out.println(">"+strCopy2);
        System.out.println("So ki tu in hoa la: " + count2);
    }
}
