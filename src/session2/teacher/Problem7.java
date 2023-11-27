package session2.teacher;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
//        bài 7
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tháng : ");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập năm : ");
        int year = Integer.parseInt(scanner.nextLine());
        switch (month) {
            case 1:
                System.out.println("số ngày trong tháng 1 là 31 ngày ");
                break;
            case 2:
                if (year % 4 == 0) {
                    System.out.println("số ngày trong tháng 2 là 29 ngày ");
                } else {
                    System.out.println("số ngày trong tháng 2 là 28 ngày");
                }
                break;
            case 3:
                System.out.println("số ngày trong tháng 3 là 31 ngày ");
                break;
            case 4:
                System.out.println("số ngày trong tháng 4 là 30 ngày ");
                break;
            case 5:
                System.out.println("số ngày trong tháng 5 là 31 ngày ");
                break;
            case 6:
                System.out.println("số ngày trong tháng 6 là 30 ngày ");
                break;
            case 7:
                System.out.println("số ngày trong tháng 7 là 31 ngày ");
                break;
            case 8:
                System.out.println("số ngày trong tháng 8 là 31 ngày ");
                break;
            case 9:
                System.out.println("số ngày trong tháng 9 là 30 ngày ");
                break;
            case 10:
                System.out.println("số ngày trong tháng 10 là 31 ngày ");
                break;
            case 11:
                System.out.println("số ngày trong tháng 11 là 30 ngày ");
                break;
            case 12:
                System.out.println("số ngày trong tháng 12 là 31 ngày ");
                break;
        }
    }
}
