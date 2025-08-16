package baitapvenha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        Library library = new Library();
        do{
            System.out.println("MENU:");
            System.out.println("1.Them sach");
            System.out.println("2.Hien thi");
            System.out.println("3.Tim sach theo tac gia");
            System.out.println("4.Xoa sach theo ma va in ket qua");
            System.out.println("5.Thoat");
            System.out.println("CHON: ");
            chon = sc.nextInt();

            switch(chon){
                case 1:
                    System.out.println("Nhap so sach muon them: ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++){
                        Book book = new Book();
                        library.addBook(book);
                    }
                    break;
                case 2:
                    System.out.println("DANH SACH");
                    library.displayAllBooks();

                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Nhap ten tac gia muon tim: ");
                    String tg = sc.nextLine();
                    library.searchByAuthor(tg);
                    break;
                case 4:
                    System.out.println("Nhap ID sach muon xoa: ");
                    int id  = sc.nextInt();
                    library.removeBookById(id);
                    System.out.println("Danh sach sau khi xoa");
                    library.displayAllBooks();
                    break;
            }
        }while(chon != 5);
    }
}
