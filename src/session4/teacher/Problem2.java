package session4.teacher;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số phần tử của mảng : ");
        int n = scanner.nextInt();

        int [] array = new int[n];
        for (int i =0 ; i<array.length ; i++){
            System.out.println("nhập phân tử trong mảng : " + i  );
            array[i] = scanner.nextInt();
        }
        int sum = 0 ;
        for (int i = 0 ; i < array.length  ; i++){
            sum += array[i] ;
        }
        System.out.println("trug binh cộng : " + sum/n);


    }
}
