package baitapvenha;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    ArrayList<Book> list = new ArrayList<Book>();

    public void addBook(Book book){
        book.nhap();
        list.add(book);
    }
    public void displayAllBooks(){
        Scanner sc = new Scanner(System.in);
        System.out.println("In ra nxb?(true/false): ");
        boolean showPublisher = sc.nextBoolean();
        if(showPublisher){
            for(Book book:list){
                book.displayInfor(showPublisher);
            }
        }
        else{
            for(Book book:list){
                book.displayInfor();
            }
        }

    }

    public void searchByAuthor(String author){
        Scanner sc = new Scanner(System.in);
        for(Book book:list){
            if(book.getAuthor().equalsIgnoreCase(author)){
                System.out.println(book.toString());
            }
        }
    }
    public void removeBookById(int id){
        boolean found = false;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getBookId() == id){
                list.remove(i);
                found = true;
            }

        }
        if(!found){
            System.out.println("Khong tim thay");
        }
    }
}
