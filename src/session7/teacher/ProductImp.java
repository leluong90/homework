package session7.teacher;

import session6.teacher.Book;

import java.util.Scanner;

public class ProductImp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product [] arrProduct = new Product[100];
        int index = 0 ;


        do {
            System.out.println("***********************MENU**************************");
            System.out.println("1. Nhập thông tin n sản phẩm (n nhập từ bàn phím)");
            System.out.println("2. Hiển thị thông tin các sản phẩm");
            System.out.println("3. Tính lợi nhuận các sản phẩm");
            System.out.println("4. Sắp xếp các sản phẩm theo lợi nhuận giảm dần");
            System.out.println("5. Thống kê các sản phẩm theo giá");
            System.out.println("6. Tìm các sản phẩm theo tên sản phẩm");
            System.out.println("7. Nhập sản phẩm");
            System.out.println("8. Bán sản phẩm");
            System.out.println("9. Cập nhật trạng thái sản phẩm");
            System.out.println("10. Thoát");
            System.out.println("Please Enter 1 - 10 ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Product");
                    System.out.println("Enter number product");
                    int numberOfProduct = scanner.nextInt();
                    scanner.nextLine(); // Đọc dòng trống sau khi nhập số lượng
                    for (int i = 0; i < numberOfProduct; i++) {
                        arrProduct[index] = new Product();
                        arrProduct[index].inputData(scanner, arrProduct);
                        index++ ;
                    }
                    break;
                case 2:
                    System.out.println("Display information of product ");
                    System.out.println();
                    System.out.println();
                    for (int i = 0 ; i < index ; i++){
                        arrProduct[i].display();
                        System.out.println();

                    }
                    break;
                case 3:
                    System.out.println("Caculate profit of product");
                    for (int i = 0; i < index; i++) {
                        System.out.println(arrProduct[i].getProductName()+ " profit : ");
                        arrProduct[i].calProfit();
                    }
                    break;
                case 4:
                    System.out.println("Sort profit descending");
//                    int n = arr.length;
                    for (int i = 0; i < index-1; i++) {
                        for (int j = 0; j < index-i-1; j++) {
                            // So sánh các phần tử liền kề và hoán đổi nếu cần
                            if (arrProduct[j].getProfit() < arrProduct[j+1].getProfit()) {
                                // Hoán đổi arr[j] và arr[j+1]
                                Product temp = arrProduct[j];
                                arrProduct[j] = arrProduct[j+1];
                                arrProduct[j+1] = temp;
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Enter begin price of arange :");
                    float fromPrice =  Float.parseFloat(scanner.nextLine());
                    System.out.println("Enter last price of arange :");
                    float toPrice = Float.parseFloat(scanner.nextLine());
                    int countExportPrice = 0 ;
                    for (int i = 0; i < index; i++) {
                        if (fromPrice <= arrProduct[i].getExportPrice() && arrProduct[i].getExportPrice()<= toPrice){
                            arrProduct[i].display();
                            countExportPrice++ ;
                            System.out.println();
                        }
                    }
                    System.out.println("have " + countExportPrice + "product");
                    break;
                case 6:
                    System.out.println("Enter product need search");
                    String searchProduct = scanner.nextLine();
                    for (int i = 0; i < index; i++) {
                        if (arrProduct[i].getProductName().equals(searchProduct)){
                            arrProduct[i].display();
                            System.out.println();
                        }

                    }
                    break;
                case 7:
                    System.out.println("Enter product id : ");
                    String searchProductId = scanner.nextLine();
                    System.out.println("Enter add number of quantity");
                    int addQuantity = scanner.nextInt();
                    for (int i = 0; i < index; i++) {
                        if (arrProduct[i].getProductId().equals(searchProductId)){
                            arrProduct[i].setQuantity(arrProduct[i].getQuantity()+ addQuantity);
                        }
                    }
                    break;
                case 8:
                    System.out.println("Enter product name need sell");
                    String saleProductName = scanner.nextLine();
                    System.out.println("Enter quantity need sell");
                    int saleQuantity = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < index; i++) {
                        if (arrProduct[i].getProductName().equals(saleProductName)){
                            arrProduct[i].setQuantity(arrProduct[i].getQuantity() - saleQuantity);
                        }
                    }
                    break;
                case 9:
                    System.out.println("Enter product id update");
                    String updateProductId = scanner.nextLine();
                    System.out.println("Enter product status update");
                    Boolean updateStatus = Boolean.parseBoolean(scanner.nextLine());
                    for (int i = 0; i < index; i++) {
                        if (arrProduct[i].getProductId().equals(updateProductId)){
                            arrProduct[i].setStatus(updateStatus);
                        }

                    }
                    break;
                case 10:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter 1 -10");
                    break;


            }

        } while (true);
    }
}
