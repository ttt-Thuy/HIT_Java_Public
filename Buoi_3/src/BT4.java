import java.util.Scanner;

public class BT4 {

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n-1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so nguyen n ");
        int n = scanner.nextInt();

        System.out.println("Day tu 0 toi " + n + ": ");
        int T = 0;
        for (int i = 0; i <= n; i++) {
            int f = fibonacci(i);
            System.out.println(f + " ");
            if (f % 2 != 0) {
                T += f;
            }
        }
        System.out.println();
        System.out.println("Tong le " + T);
    }
}
