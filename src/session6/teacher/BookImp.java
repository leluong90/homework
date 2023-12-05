package session6.teacher;

import java.util.Scanner;

public class BookImp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book [] arrBook = new Book[100];
        int index = 0 ;

        do {
            System.out.println("1. Nhập thông tin n sách (n nhập từ bàn phím)");
            System.out.println("2. Tính lợi nhuận các sách");
            System.out.println("3. Hiển thị thông tin sách");
            System.out.println("4. Sắp xếp sách theo giá bán tăng dần");
            System.out.println("5. Sắp xếp sách theo lợi nhuận giảm dần");
            System.out.println("6. Tìm sách theo tên sách (tên sách nhập từ bàn phím)");
            System.out.println("7. Thống kê số lượng sách theo năm xuất bản");
            System.out.println("8. Thống kê số lượng sách theo tác giả");
            System.out.println("9. Thoát");
            System.out.println("Please choose 1 - 9 : ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1 :
                    System.out.println("Enter number of books : ");
                    int numberOfBook = scanner.nextInt();
                    scanner.nextLine(); // Đọc dòng trống sau khi nhập số lượng

                    for (int i = 0 ; i < numberOfBook ; i++){
                        arrBook[index] = new Book() ;
                        arrBook[index].inputData(scanner);
                        index ++ ;
                    }
                    break;
                case 2 :
                    System.out.println("Caculate profit of book");
                    for (int i = 0; i < index ; i++) {
                        System.out.println(arrBook[i].getBookName() + " : ");
                        System.out.println(arrBook[i].profit());

                    }
                    break;
                case 3 :
                    System.out.println("Display data");
                    for (int i = 0; i < index ; i++) {
                        arrBook[i].display();
                        System.out.println();
                    }
                    break;
                case 4 :
                    System.out.println("Sort export price ascending");
                    for (int i = 0; i < index - 1 ; i++) {
//                        arrBook[i].getExportPrice();
                        for (int j = 0; j < index- i - 1; j++) {
                            if (arrBook[i].getExportPrice() > arrBook[j+1].getExportPrice() ){
                                Book temp = arrBook[j];
                                arrBook[j] = arrBook[j+1];
                                arrBook[j+1] = temp ;
                            }
                        }
                    }
                    break;
                case 5 :
                    System.out.println("Sort interest descending");
                    for (int i = 0; i < index-1; i++) {
                        for (int j = 0; j < index-i-1; j++) {
                            // So sánh các phần tử liền kề và hoán đổi nếu cần
                            if (arrBook[j].getInterest() < arrBook[j+1].getInterest()) {
                                // Hoán đổi arr[j] và arr[j+1]
                                Book temp = arrBook[j];
                                arrBook[j] = arrBook[j+1];
                                arrBook[j+1] = temp;
                            }
                        }
                    }
                    break;
                case 6 :
                    System.out.println("Search book name");
                    String searchBookName = scanner.nextLine();
                    for (int i = 0; i < index; i++) {
                        if (arrBook[i].getBookName() == searchBookName){
                            arrBook[i].display();
                        }
                    }
                    break;
                case 7 :
                    System.out.println("Statistics by year");
                    System.out.println("Enter year");
                    int searchYear = scanner.nextInt();
                    int countYear = 0 ;
                    for (int i = 0; i < index; i++) {
                        if(arrBook[i].getYear() == searchYear ){
                            arrBook[i].display();
                            countYear++;
                        }
                        System.out.println();
                    }
                    System.out.println("Number year of book " + searchYear +  " : " + countYear);
                    break;
                case 8 :
                    System.out.println("Statistics ny author");
                    System.out.println("Enter author");
                    String searchAuthor = scanner.nextLine();
                    int countAuthor = 0 ;
                    for (int i = 0; i < index; i++) {
                        if (arrBook[i].getAuthor() == searchAuthor){
                            arrBook[i].display();
                            countAuthor ++ ;
                        }
                        System.out.println();
                    }
                    System.out.println("Number author of book" + searchAuthor + " : " + countAuthor);
                    break;
                case 9 :
                    System.out.println("Exit");
                    System.exit(0);

                    break;
                default:
                    System.out.println("Please enter 1 - 9 ");
                    break;


            }
        }while (true);
    }
}
