import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten ban la gi? ");
        String name= sc.nextLine();
        int number1 = sc.nextInt();
        double number2= sc.nextDouble();
        System.out.println(name);
        sc.nextLine();//khắc phục lỗi khi không nhập
        //int[] a = new int[3]; mảng
    }
}
