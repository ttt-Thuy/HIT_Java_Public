package BAI3;

import BAI2.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        ArrayList<Student> list = new ArrayList<>();
        manager.setList(list);
        //fake data
        Student sv1 = new Student("001","Hoang", 7.0, 19, "abc@gmail.com", "cntt1", "Ha Noi");
        Student sv2 = new Student("002","Linh", 8.6, 23, "abcd@gmail.com", "cntt2", "Ha Noi");
        Student sv3 = new Student("003","Trang", 3.4, 21, "abcde@gmail.com", "cntt3", "Ha Noi");
        list.add(sv1);
        list.add(sv2);
        list.add(sv3);
        Scanner sc = new Scanner(System.in);
        int chon ;
        do{
            System.out.println("=======MENU=======");
            System.out.println("1.In danh sach");
            System.out.println("2.Sap diem giam dan");
            System.out.println("3.Sap diem tang dan");
            System.out.println("4.Tim theo ten");
            System.out.println("5.Thoat");
            System.out.println("CHON: ");
            chon = sc.nextInt();

            switch(chon){
                case 1:
                    manager.printStudents();
                    break;
                case 2:
                    manager.sortBySCoreDesc();
                    manager.printStudents();
                    break;
                case 3:
                    manager.sortByScoreAsc();
                    manager.printStudents();
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Nhap ten muon tim: ");
                    String ten = sc.nextLine();
                    Student result = manager.findByName(ten);
                    if(result!=null){
                        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %n", "ID", "|TEN", "|DIEM", "|TUOI", "|EMAIL", "|LOP", "|DIA CHI");
                        System.out.printf("%-10s %-10s %-10.2f %-10d %-10s %-10s %-10s %n", result.getId(), result.getName(), result.getScore(), result.getAge(), result.getEmail(), result.getClassName(), result.getAddress() );

                    }
                    else{
                        System.out.println("kHONG TIM THAY");
                    }
                    break;
            }
        }
        while(chon != 5);
    }
}
