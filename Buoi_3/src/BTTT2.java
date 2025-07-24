import java.util.Scanner;

public class BTTT2 {


    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String input = sc.nextLine().trim();

        if (isPalindrome(input)) {
            System.out.println(input.toUpperCase());
            System.out.println("Doi xung .");
        } else {
            System.out.println(input.toLowerCase());
            System.out.println(" khong doi xung ");
        }
    }
}
