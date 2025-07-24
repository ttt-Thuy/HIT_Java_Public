import java.util.Scanner;

public class BT3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi ki tu: ");
        String str = sc.nextLine();

        str = str.trim();

        String dao_nguoc = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            dao_nguoc += str.charAt(i);
        }

        System.out.println("Chuỗi đảo ngược: " + dao_nguoc);

        if (str.equalsIgnoreCase(dao_nguoc))
            System.out.println("Đây là chuỗi Palindrome (đối xứng).");
        System.out.println("Đây không phải là chuỗi Palindrome.");
    }

}
