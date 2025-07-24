import java.util.Scanner;

public class BT5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Tạo đối tượng Scanner để nhập
        System.out.print("Nhap kich thuoc: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        int value = 1;
        int top = 0, bottom = n - 1, left = 0, right = n - 1; // Biến để điều khiển hướng điền

        while (value <= n * n) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = value++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value++;
            }
            right--;

            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = value++;
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = value++;
            }
            left++;
        }

        System.out.println("Ma tran:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(matrix[i][j]);
            }
            System.out.println();
        }

        int T = 0;
        for (int i = 0; i < n; i++) {
            T += matrix[i][i];
            T += matrix[i][n - 1 - i];
        }

        if (n % 2 == 1) {
            T -= matrix[n / 2][n / 2];
        }

        System.out.println("Tong  " + T);
    }
}
