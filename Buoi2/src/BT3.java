import java.util.Scanner;

public class BT3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("tong= "+ (a+b));
        System.out.println("hieu10= "+ (a-b));
        System.out.println("tich= "+ (a*b));

        if(b!=0){
            System.out.println("chia lay du= "+ (a%b));
            System.out.println("thuong= "+ (a/b));
        }
        if(a==b) {
            System.out.println("Hai so bang nhau. ");
        }else{
            System.out.println("Hai so khong bang nhau. ");
        }
    }
}
