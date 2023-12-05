package session4.teacher;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập giá trị phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Nhập chỉ số phần tử cần xóa: ");
        int deleteIndex = scanner.nextInt();

        // Di chuyển các phần tử sau phan tu can xoa sang ben trai
        for (int i = deleteIndex; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        // In ra mảng sau khi xóa
        System.out.print("Mảng sau khi xóa: ");
        for (int i = 0; i < n-1; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}

