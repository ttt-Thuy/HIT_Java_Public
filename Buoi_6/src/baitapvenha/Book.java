package baitapvenha;

import java.util.Scanner;


public class Book {
    private static int bookid = 0;
    private int bookId;
    private String title;
    private String author;
    private double price;
    private Publisher publisher;

    public Book() {
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book(String title, String author, double price, Publisher publisher) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId= bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "ID: "+ bookId +"Tua sach: "+ title + ", tac gia: " + author + ", don gia: " + price + ", nha xuat ban: " + publisher ;
    }

    public void displayInfor(){
        System.out.println("ID Sach: " + bookId + ", Tua sach: "+ title + ", tac gia: "+ author + ", don gia: " + price );
    }
    public void displayInfor(boolean showPublisher){
        if(showPublisher){
            System.out.println("ID Sach: " + bookId + ", Tua sach: "+ title + ", tac gia: "+ author + ", don gia: " + price  + ", nha xuat ban: " + publisher );

        }
        else{
            System.out.println("ID Sach: " + bookId + ", Tua sach: "+ title + ", tac gia: "+ author + ", don gia: " + price + ", nha xuat ban: Unknown" );

        }

    }
    public void nhap(){
        bookid++;
        bookId=bookid;
        Scanner  sc = new Scanner(System.in);

        System.out.println("Nhap tua sach: ");
        title = sc.nextLine();
        System.out.println("Nhap tac gia: ");
        author = sc.nextLine();
        System.out.println("Nhap don gia: ");
        price = sc.nextDouble();
        sc.nextLine();

        System.out.println("Nhap nha xuat ban! ");
        System.out.println("Nhap ten nha xuat ban: ");
        String ten = sc.nextLine();
        System.out.println("Nhap dia chi nha xuat ban: ");
        String diachi = sc.nextLine();
        publisher = new Publisher(ten,diachi);

    }
}
