import java.util.Scanner;

public class BT4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a= new int[5];

        System.out.println("Nhap 5 so nguyen: ");
        for(int i=0; i<5 ; i++){
            System.out.print("a["+i+"]= ");
            a[i]=sc.nextInt();
        }

        System.out.println("Cac phan tu cua mang la: ");
        for(int i=0 ; i<5 ; i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();

        int T=0;
        for(int i = 0 ; i < 5 ; i++) {
            T += a[i];
        }
        System.out.println("Tong phan tu cua mang: " + T);

        int max=a[0];
        for(int i = 0 ; i < 5 ; i++) {
            if(a[i] > max)
                max=a[i];
        }
        System.out.println("Gia tri lon nhat la: " + max);
    }
}
