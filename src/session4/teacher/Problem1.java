package session4.teacher;

import java.sql.Array;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhập số phần tử của mảng");
//        int n = scanner.nextInt();


        int [] array = new int[5] ;

        for (int i = 0 ; i < 5 ; i++){
            System.out.println("Nhập số " + i + " : " );
            array[i] = scanner.nextInt();

        }
        System.out.println("in ra mảng :");
        for (int i = 0 ; i<array.length ; i++ ){
            System.out.print(array[i] + " ");
        }

    }
}
