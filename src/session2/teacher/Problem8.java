package session2.teacher;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        //        bài 9 :
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ngay : ");
        int day = scanner.nextInt();
        System.out.println("nhập tháng : ");
        int month = scanner.nextInt();
        System.out.println("nhap nam : ");
        int year = scanner.nextInt();
        if (day > 31 || day < 1) {
            System.out.println("ngày tháng năm không hợp lệ ");
        } else if (month > 12 || month < 1) {
            System.out.println("ngày tháng năm không hợp lệ ");
        } else {
            switch (month) {
                case 1:
                    if (day >= 0 || day <= 31) {
                        System.out.println("ngày tháng năm hợp lệ ");
                    }
                    break;
                case 2:
                    if (year % 4 == 0 && day <= 29) {
                        System.out.println("ngày tháng năm là hợp lệ ");
                    } else if (year % 4 != 0 && day <= 28) {
                        System.out.println("ngày tháng năm là hợp lệ");
                    } else {
                        System.out.println("ngày tháng năm không hợp lệ");
                    }
                    break;
                case 3:
                    if (day >= 0 || day <= 31) {
                        System.out.println("ngày tháng năm hợp lệ ");
                    }
                    break;
                case 4:
                    if (day >= 0 || day <= 30) {
                        System.out.println("ngày tháng năm hợp lệ ");
                    }
                    break;
                case 5:
                    if (day >= 0 || day <= 31) {
                        System.out.println("ngày tháng năm hợp lệ ");
                    }
                    break;
                case 6:
                    if (day >= 0 || day <= 30) {
                        System.out.println("ngày tháng năm hợp lệ ");
                    }
                    break;
                case 7:
                    if (day >= 0 || day <= 31) {
                        System.out.println("ngày tháng năm hợp lệ ");
                    }
                    break;
                case 8:
                    if (day >= 0 || day <= 31) {
                        System.out.println("ngày tháng năm hợp lệ ");
                    }
                    break;
                case 9:
                    if (day >= 0 || day <= 30) {
                        System.out.println("ngày tháng nam hợp lệ ");
                    }
                    break;
                case 10:
                    if (day > 1 || day < 31) {
                        System.out.println("ngày tháng năm hợp lệ ");
                    }
                    break;
                case 11:
                    if (day > 1 || day < 30) {
                        System.out.println("ngày tháng năm hợp lệ ");
                    }
                    break;
                case 12:
                    if (day > 1 || day < 31) {
                        System.out.println("ngày tháng năm hợp lệ ");
                    }
                    break;
                default:
                    System.out.println("ngày tháng năm không hợp lệ");
            }
        }
    }
}
