package session6.teacher;

import java.util.Scanner;

public class Book {
    private String bookId ;
    private String bookName ;
    private float importPrice ;
    private float exportPrice ;
    private String author ;
    private float interest ;
    private int year ;

    public Book() {
    }

    public Book(String bookId, String bookName, float importPrice, float exportPrice, String author, float interest, int year) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.author = author;
        this.interest = interest;
        this.year = year;
    }

    public void inputData(Scanner scanner){
        System.out.println("Enter book id : ");
        this.bookId = scanner.nextLine();
        System.out.println("Enter book name : ");
        this.bookName = scanner.nextLine();
        System.out.println("Enter import price : ");
        this.importPrice = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter export price : ");
        this.exportPrice = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter author : ");
        this.author = scanner.nextLine();
        System.out.println("Enter year : ");
        this.year= Integer.parseInt(scanner.nextLine());
    }
    public void display(){
        System.out.println("Book id : " + this.bookId);
        System.out.println("Book name : " + this.bookName);
        System.out.println("Import price : " + this.importPrice);
        System.out.println("Export price : " + this.exportPrice);
        System.out.println("Author : " + this.author);
        System.out.println("Interest : " + this.interest);
        System.out.println("Year : " + this.year);

    }
    public float profit(){
        this.interest = this.exportPrice - this.importPrice ;
        return this.interest;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
