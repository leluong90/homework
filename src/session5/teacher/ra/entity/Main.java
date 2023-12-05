package session5.teacher.ra.entity;

import session5.teacher.Book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main objMain = new Main();
        do {
            System.out.println("***********menu*********");
            System.out.println("1.  Quản lý danh mục sản phẩm");
            System.out.println("2.  Quản lý sản phẩm");
            System.out.println("3.  Thoát");
            System.out.println("vui lòng nhập 1 - 3");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1.  Quản lý danh mục sản phẩm");
                    objMain.displayCategoriesMenu();
                    break;
                case 2:
                    System.out.println("2.  Quản lý sản phẩm");
                    break;
                case 3:
                    System.out.println("3.  Thoát");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng chọn 1-3");
                    break;
            }
        } while (true);


    }

    public void displayCategoriesMenu() {
        Scanner scanner = new Scanner(System.in);
        Categories[] arrCategories = new Categories[100]; // Khai báo mảng gồm 100 sách

        int index = 0; // Số lượng sách hiện tại
        do {

            System.out.println("******categories*******");
            System.out.println("1. Nhập thông tin các danh mục");
            System.out.println("2. Hiển thị thông tin các danh mục");
            System.out.println("3. Cập nhật thông tin danh mục");
            System.out.println("4. Xóa danh mục");
            System.out.println("5. Cập nhật trạng thái danh mục");
            System.out.println("6. Thoát");
            System.out.println("Vui lòng chọn 1-6 ");


            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Categories: ");
                    int n = scanner.nextInt();
                    scanner.nextLine(); // Đọc dòng trống sau khi nhập số lượng
                    for (int i = 0; i < n; i++) {
                        if (index < 100) { // Kiểm tra số lượng sách đã nhập
                            arrCategories[index] = new Categories();
                            arrCategories[index].inputData(scanner, arrCategories, index);
                            index++;
                        } else {
                            System.out.println("Không thể thêm sách, danh sách đã đầy!");
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("2. Hiển thị thông tin các danh mục");
                    for (int i = 0; i < index; i++) {
                        arrCategories[i].display();
                        System.out.println();
                    }

                    break;
                case 3:
                    System.out.println("3. Cập nhật thông tin danh mục");
                    System.out.println("Enter Categories id update : ");
                    String updateCategoryId = scanner.nextLine();
//                    boolean found = false;
                    updateCategories(updateCategoryId , scanner , arrCategories , index);
                    break;
                case 4:
                    System.out.println("4. Xóa danh mục");

                    System.out.print("Enter categories id delete : ");
                    int categoryIdToDelete = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    break;
                case 5:
                    System.out.println("5. Cập nhật trạng thái danh mục");
                    break;
                case 6:
                    System.out.println("6. Thoát");

                    break;
                default:
                    System.out.println("Vui lòng nhập lại từ 1 - 6 ");
                    break;
            }
        } while (true);
    }

    public void updateCategories(String updateCategoryId, Scanner scanner, Categories[] arrCategories, int index) {

        boolean found = false;
        for (int i = 0; i < index; i++) {
            if (arrCategories[i] != null && arrCategories[i].getCatalogId() == updateCategoryId) {
                found = true;
                System.out.println("Category found. Enter new information:");

                System.out.print("Enter new catalog name (max 50 characters): ");
                String newName = scanner.nextLine();

                // Validate if the name is not already taken and length is less than or equal to 50 characters
                if ( newName.length() <= 50) {
                    arrCategories[i].setCatalogName(newName);

                    System.out.print("Enter new description: ");
                    String newDescription = scanner.nextLine();
                    arrCategories[i].setDescriptions(newDescription);

                    System.out.print("Enter new catalog status (true/false): ");
                    boolean newStatus = scanner.nextBoolean();
                    arrCategories[i].setCatalogStatus(newStatus);
                    scanner.nextLine(); // Consume the newline character after nextBoolean()

                    System.out.println("Category information updated successfully.");
                } else {
                    System.out.println("Invalid catalog name or already exists!");
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Category ID not found!");
        }
    }
    public void deleteCategories (Scanner scanner , Categories[] arrCategories , int index , String deleteCategoryId ){
        boolean isDeleted = false;
        for (int i = 0; i < index; i++) {
            if (arrCategories[i] != null && arrCategories[i].getCatalogId() == deleteCategoryId) {
                isDeleted = true;
//                if (!isCategoryContainsProducts(deleteCategoryId, arrProducts)) {
//                    // Shift elements to overwrite the deleted category
//                    for (int j = i; j < index - 1; j++) {
//                        arrCategories[j] = arrCategories[j + 1];
//                    }
//                    arrCategories[index - 1] = null; // Set last element to null
//                    System.out.println("Danh mục đã được xóa thành công.");
//                    index--; // Decrement the index as one category is removed
//                } else {
//                    System.out.println("Không thể xóa danh mục vì chứa sản phẩm.");
//                }
                break;
            }
        }
        if (!isDeleted) {
            System.out.println("Không tìm thấy mã danh mục!");
        }

    }

}
