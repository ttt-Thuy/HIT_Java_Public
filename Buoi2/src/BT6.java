import java.util.Scanner;

class Student{
    String name;
    int age;
    double gpa;
}

public class BT6 {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int n;
     do {
         System.out.println("Nhap so luong hoc sinh");
         n= sc.nextInt();
         if(n <=0)
             System.out.println("Nhap lai: ");
     }while(n <= 0);

     sc.nextLine();

     Student[] students =new Student[n];
    // String name = sc.nextLine(); //Nhap ten chua dau cach

     for(int i = 0; i< n ; i++)
     {
         students[i] = new Student();
         System.out.println(i);

         System.out.print("Ten: ");
         students[i].name = sc.nextLine();

         System.out.print("Tuoi: ");
         students[i].age = sc.nextInt();

         System.out.print("GPA: ");
         students[i].gpa = sc.nextDouble();
         sc.nextLine();
     }
    double T=0;
     for(int i=0; i<n; i++)
     {
         T+=students[i].gpa;
     }
        System.out.println("Diem tb: "+ (T*1.0/n));

     double max= students[0].gpa;
     int vt=0;
     for(int i=0; i<n; i++)
     {
         if(students[i].gpa > max) {
             max = students[i].gpa;
             vt= i;
         }
     }
        System.out.println("GPA cao nhat: ");
        System.out.println(students[vt].name +" "+ students[vt].age+" "+ students[vt].gpa);
    }
}
