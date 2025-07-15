import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ho va ten: ");
        String name= sc.nextLine();
        System.out.println("Tuoi ");
        int age= sc.nextInt();
        System.out.println("Chieu cao ");
        double heigh=sc.nextDouble();
        System.out.println("Xin chao"+ name + " tuoi: "+ age+ "chieu cao: "+heigh);
    }
}
