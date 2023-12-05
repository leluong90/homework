package session5.teacher;

import java.util.Scanner;

public class Book {
    /*
Xây dựng lớp Book trong package ra.entity gồm các thông tin sau:
Thuộc tính: mã sách, tên sách, giá nhập, giá xuất, tiêu đề, tác giả, nhà xuất bản
Có 2 constructor: không tham số và đầy đủ tham số khởi tạo tất cả thông tin sách
Phương thức:
+ inputData(Scanner scanner): Nhập các thông tin sách (trừ giá xuất)
+ displayData(): Hiển thị tất cả thông tin sách
+ calExportPrice(): Tính giá xuất theo công thức: exportPrice = importPrice*1.2;
Xây dựng lớp BookManagement trong package ra.run thực hiện:
Khai báo mảng gồm 100 sách
Hiển thị menu và thực hiện các chức năng theo menu:
**MENU**
Nhập số lượng sách (n) và nhập thông tin n sách (lưu vào mảng)
Hiển thị tất cả sách đang quản lý
Tính giá xuất của các sách đang quản lý
Sắp xếp sách theo giá nhập tăng dần
Tìm kiếm sách theo tên sách
Thoát
*/
   private String bookId ;
   private String bookName ;
   private double importPrice ;
   private double exportPrice ;
   private String title ;
   private String author ;
   private String manufacture ;

    public Book() {
    }

    public Book(String bookId, String bookName, double importPrice, double exportPrice, String title, String author, String manufacture) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.title = title;
        this.author = author;
        this.manufacture = manufacture;
    }
    public void inputData(Scanner scanner){
        System.out.println("Enter book id : ");
        this.bookId = scanner.nextLine();
        System.out.println("Enter book name : ");
        this.bookName = scanner.nextLine();
        System.out.println("Enter import Price : ");
        this.importPrice = Double.parseDouble(scanner.nextLine()) ;
        System.out.println("Enter title : ");
        this.title = scanner.nextLine();
        System.out.println("Enter author : ");
        this.author = scanner.nextLine();
        System.out.println("Enter manufacture : ");
        this.manufacture = scanner.nextLine();

    }

    public void displayData(){
        System.out.println("book id : " + this.bookId);
        System.out.println("book name : " + this.bookName);
        System.out.println("import price : " + this.importPrice);
        System.out.println("export price : " + this.exportPrice);
        System.out.println("title : " + this.title);
        System.out.println("author : " + this.author);
        System.out.println("manufacture : " + this.manufacture);

    }

    public void calExportPrice (){
        this.exportPrice = this.importPrice*1.2 ;
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

    public double getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(double importPrice) {
        this.importPrice = importPrice;
    }

    public double getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(double exportPrice) {
        this.exportPrice = exportPrice;
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

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }
}
