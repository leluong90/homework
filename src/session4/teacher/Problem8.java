package session4.teacher;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số phần tử của mảng : ");
        int number = scanner.nextInt();
        int [] array = new int[number];
        for (int i = 0 ; i < array.length ; i ++ ){
            System.out.println("nhập phần tử mảng thứ "+ i);
            array[i] = scanner.nextInt();
        }

        for (int i = 0 ; i < array.length ; i ++ ){
            System.out.println(array[i] + " ");

        }
        System.out.println("nhập giá trị update ");
        int updateValue = scanner.nextInt();
        System.out.println("nhập vào vị trí muốn update");
        int updateIndex = scanner.nextInt();
        array[updateIndex] = updateValue ;
        System.out.println("in ra mảng mới ; ");
        for (int i = 0 ; i < array.length ; i ++){
            System.out.println(array[i] + " ");
        }
    }
}
