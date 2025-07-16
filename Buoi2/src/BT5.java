import java.util.Scanner;

public class BT5 {
    public static void main(String[] args){
        System.out.println("Bang cuu chuong: ");
        for(int i = 1 ; i <= 10 ; i++)
        {
            System.out.println("5 x "+i+ "= "+ (5*i));
        }

        System.out.println("Tong cac so chan bang vong for: ");
        int T = 0;
        for(int i = 2 ; i <=100 ; i+=2)
        {
           T+=i;
        }
        System.out.println(T);

        System.out.println("Tinh tong so chan bang while: ");
        int sum = 0;
        int t = 2;
        while(t <= 100)
        {
            sum += t;
            t += 2;
        }
        System.out.println(sum);
    }
}
