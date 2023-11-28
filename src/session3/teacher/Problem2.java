package session3.teacher;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        // Khởi tạo biến tổng
        int sum = 0;

        // Vòng lặp nhập số
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // Nhập số
            System.out.print("Nhập số: ");
            int number = scanner.nextInt();

            // Kiểm tra số lẻ
            if (number % 2 == 1) {
                // Cộng số lẻ vào tổng
                sum += number;
            }

            // Kết thúc chương trình nếu nhập 0
            if (number == 0) {
                break;
            }
        }

        // In ra tổng
        System.out.println("Tổng các số lẻ nhập vào là: " + sum);
    }
}
