package session4.teacher;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập n phần tử mảng : ");
        int number = scanner.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhập phần tử thứ " + i);
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
            }
            if (min >= array[i]) {
                min = array[i];
            }

        }
        System.out.println("số lơn nhất trong mảng : "+ max);
        System.out.println("số nhỏ nhất trong mảng : "+ min);

    }
}


