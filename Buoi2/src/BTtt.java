import java.util.Scanner;
public class BTtt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bai 1: hinh tron ");
        System.out.println("nhap r: ");
        double r = sc.nextDouble();
        double pi = 3.14;
        System.out.println("tinh chu vi hinh tron: ");
        double cv = 2 * pi * r;
        System.out.println(" tinh dien tich hinh tron: ");
        double dt = pi * r * r;

        System.out.println(cv+" "+ dt);

        System.out.println("bai 2: Mang ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i += 2) {
            int left = (i - 1 >= 0) ? a[i - 1] : 0;
            int right = (i + 1 < n) ? a[i + 1] : 0;
            a[i] += Math.abs(left - right);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
            if (i < n - 1)
                System.out.print(" ");
        }
        System.out.println();

        System.out.println("bai 3 : Ma tran");
        int m = sc.nextInt();
        int[][] spiral = new int[m][m];

        int value = 1;
        int tren = 0, duoi = m - 1;
        int trai = 0, phai = m - 1;

        while (value <= m * m) {
            for (int i = trai; i <= phai; i++) spiral[tren][i] = value++;
            tren++;
            for (int i = tren; i <= duoi; i++) spiral[i][phai] = value++;
            phai--;
            for (int i = phai; i >= trai; i--) spiral[duoi][i] = value++;
            duoi--;
            for (int i = duoi; i >= tren; i--) spiral[i][trai] = value++;
            trai++;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(spiral[i][j] + " ");
            }
            System.out.println();
        }
    }
}


