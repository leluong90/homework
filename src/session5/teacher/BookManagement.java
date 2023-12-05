package session5.teacher;

import java.util.Scanner;

public class BookManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[100]; // Khai báo mảng gồm 100 sách
        int numberOfBooks = 0; // Số lượng sách hiện tại

        int choice;
        do {
            System.out.println("\n**MENU**");
            System.out.println("1. Nhập số lượng sách và thông tin cho sách");
            System.out.println("2. Hiển thị tất cả sách đang quản lý");
            System.out.println("3. Tính giá xuất của các sách đang quản lý");
            System.out.println("4. Sắp xếp sách theo giá nhập tăng dần");
            System.out.println("5. Tìm kiếm sách theo tên sách");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng (1-6): ");
            choice = scanner.nextInt();
//            scanner.nextLine(); // Đọc dòng trống sau khi nhập số

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng sách: ");
                    int n = scanner.nextInt();
                    scanner.nextLine(); // Đọc dòng trống sau khi nhập số lượng
                    for (int i = 0; i < n; i++) {
                        if (numberOfBooks < 100) { // Kiểm tra số lượng sách đã nhập
                            books[numberOfBooks] = new Book();
                            books[numberOfBooks].inputData(scanner);
                            numberOfBooks++;
                        } else {
                            System.out.println("Không thể thêm sách, danh sách đã đầy!");
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("\nDanh sách các sách đang quản lý:");
                    for (int i = 0; i < numberOfBooks; i++) {
                        books[i].displayData();
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("\nTính giá xuất của các sách đang quản lý:");
                    for (int i = 0; i < numberOfBooks; i++) {
                        books[i].calExportPrice();
                        System.out.println("Giá xuất của sách " + books[i].getBookName() + ": " + books[i].getExportPrice());
                    }
                    break;
                case 4:
                    // Viết mã sắp xếp sách theo giá nhập tăng dần ở đây
                    for (int i = 0; i < numberOfBooks - 1; i++) {
                        for (int j = 0; j < numberOfBooks - i - 1; j++) {
                            if (books[j].getImportPrice() > books[j + 1].getImportPrice()) {
                                // Hoán đổi vị trí của các sách nếu cần
                                Book temp = books[j];
                                books[j] = books[j + 1];
                                books[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("Đã sắp xếp sách theo giá nhập tăng dần.");
                    for (int i = 0; i < numberOfBooks; i++) {
                        books[i].displayData();
                        System.out.println();
                    }
                    break;
                case 5:
                    scanner.nextLine(); // Đọc dòng trống sau khi nhập số
                    System.out.print("Nhập tên sách cần tìm kiếm: ");
                    String searchName = scanner.nextLine();
                    boolean found = false;
                    System.out.println("\nKết quả tìm kiếm:");
                    for (int i = 0; i < numberOfBooks; i++) {
                        if (books[i].getBookName().equalsIgnoreCase(searchName)) {
                            books[i].displayData();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy sách có tên " + searchName);
                    }
                    break;
                case 6:
                    System.out.println("Đã thoát.");
                    break;
                default:
                    System.out.println("Vui lòng chọn từ 1 đến 6.");
                    break;
            }
        } while (choice != 6);

        scanner.close();
//        //Khởi tạo mảng sách gồm 100 phâ tử
//        Book[] arrBook = new Book[100];
//        int currentIndex = 0;
//        Scanner scanner = new Scanner(System.in);
//
//        do {
//            System.out.println("1. Nhập số lượng sách (n) và nhập thông tin n sách (lưu vào mảng)");
//            System.out.println("2. Hiển thị tất cả sách đang quản lý");
//            System.out.println("3. Tính giá xuất của các sách đang quản lý");
//            System.out.println("4. Sắp xếp sách theo giá nhập tăng dần");
//            System.out.println("5. Tìm kiếm sách theo tên sách");
//            System.out.println("6. Thoát");
//            System.out.println("Enter choice");
//            int choice = scanner.nextInt();
//
//            switch (choice){
//                case 1 :
//                    System.out.println("Enter number book");
//                    int numberBook = scanner.nextInt();
//                    //Dùng vòng lặp để nhập numberBook sách và lưu vào mảng
//                    for (int i = 0; i < numberBook; i++) {
//                        //Khởi tạo phần tử currentIndex là 1 đối tượng sách
//                        arrBook[currentIndex] = new Book();
//                        //Nhập thông tin cho phần tử currentIndex
//                        arrBook[currentIndex].inputData(scanner);
//                        currentIndex++;
//                    }
//
//                    break;
//                case 2 :
//                    for (int i = 0; i < currentIndex ; i++) {
//                        arrBook[currentIndex].displayData();
//                    }
//                    break;
//                case 3 :
//                    for (int i = 0; i < currentIndex ; i++) {
//                        arrBook[currentIndex].calExportPrice();
//                    }
//
//                    break;
//                case 4 :
//                    for (int i = 0; i < currentIndex -1 ; i++) {
//                        for (int j = i+1; j < currentIndex  ; j++) {
//                            if (arrBook[i].getImportPrice() > arrBook[j].getImportPrice()){
//                                Book temp = arrBook[i];
//                                arrBook[i] = arrBook[j];
//                                arrBook[j] = temp ;
//                            }
//                        }
//                    }
//                    break;
//                case 5 :
//                    System.out.println("Nhập vao tên sách cần tìm kiếm : ");
//                    String bookNameSearch = scanner.nextLine();
//                    for (int i = 0; i < currentIndex ; i++) {
//                        if (arrBook[i].getBookName().equals(bookNameSearch)){
//
//                        }
//                    }
//                    break;
//                case 6 :
//                    break;
//                default:
//                    break;
//            }
//
//
//        }while (true);

    }
}
