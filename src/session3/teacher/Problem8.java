package session3.teacher;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên n (n >= 2): ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Vui lòng nhập n >= 2.");
            return;
        }

        while (true) {
            System.out.println("**********************PRACTICE**********************");
            System.out.println("1. In dãy số chia hết cho 2 và giảm dần");
            System.out.println("2. In các số nhỏ hơn n và tính tổng");
            System.out.println("3. In ra các ước số chẵn của n");
            System.out.println("4. In ra các ước số lẻ và số lượng các ước lẻ của n");
            System.out.println("5. In ra ước số lẻ lớn nhất của n");
            System.out.println("6. Thoát");

            System.out.print("Lựa chọn của bạn: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Dãy số chia hết cho 2 và giảm dần:");
                    for (int num = n; num >= 2; num--) {
                        if (num % 2 == 0) {
                            System.out.print(num + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 2:
                    int total = 0;
                    System.out.println("Các số nhỏ hơn " + n + " và tổng của chúng:");
                    for (int num = 2; num < n; num++) {
                        System.out.print(num + " ");
                        total += num;
                    }
                    System.out.println("\nTổng: " + total);
                    break;
                case 3:
                    System.out.println("Các ước số chẵn của " + n + ":");
                    for (int i = 2; i <= n; i++) {
                        if (n % i == 0 && i % 2 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    int count = 0;
                    System.out.println("Các ước số lẻ của " + n + " và số lượng ước lẻ:");
                    for (int i = 1; i <= n; i++) {
                        if (n % i == 0 && i % 2 != 0) {
                            System.out.print(i + " ");
                            count++;
                        }
                    }
                    System.out.println("\nSố lượng ước số lẻ: " + count);
                    break;
                case 5:
                    int largestOddFactor = -1;
                    System.out.println("Ước số lẻ lớn nhất của " + n + ":");
                    for (int i = 1; i <= n/2; i++) {
                        if (n % i == 0 && i % 2 != 0) {
                            largestOddFactor = Math.max(largestOddFactor, i);

                        }
                    }
                    if (largestOddFactor != -1 ) {
                        System.out.println(largestOddFactor);
                    } else {
                        System.out.println("Không có ước số lẻ của " + n);
                    }
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }


}
