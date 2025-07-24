import java.util.Scanner;

public class BT1 {

    public static Scanner sc = new Scanner(System.in);

    public static int[] enterArray() {

        System.out.println(" nhap phan tu mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println(" nhap cac phan tu mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]= " + a[i]);
        }
    }

    public static void oddEven(int[] a, int n) {
        int total0dd = 0;
        int totaleven = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0)
                total0dd += a[i];
            totaleven += a[i];
        }
        System.out.println(" tong phan tu chan" + total0dd);
        System.out.println(" tong phan tu le " + totaleven);
    }

    public static boolean check(int number) {
        if (number < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static int SNT(int[] a, int n) {
        int sluong = 0;
        for (int x : a) {
            if( check(x))
                sluong++;
        }
        return sluong;
    }
    public static void main(String[] args){
        System.out.println(" nhap vao so luong mang: ");
        int n = sc.nextInt();

        int [] a = enterArray();
        printArray(a,n);
        oddEven(a,n);
    }

}
