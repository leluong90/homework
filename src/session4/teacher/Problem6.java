package session4.teacher;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số phần tử của mảng n");
        int number = scanner.nextInt();
        int [] array = new int[number] ;
        for (int i = 0 ; i < array.length ; i ++ ){
            System.out.println("nhập phần tử thứ "+ i);
            array[i] = scanner.nextInt();;
        }
        for (int i = 0 ; i < array.length ; i ++){
            System.out.println(array[i] + " ");
        }
        System.out.println("nhập số cần tìm : ");
        int findNumber = scanner.nextInt();
        int sum = 0 ;
        for (int i = 0 ; i < array.length; i++){
            if (array[i] == findNumber){
                System.out.println(i + " ");
                sum +=array[i] ;
            }
        }
        System.out.println( "tổng :"+sum );
    }
}
