package session4.teacher;

import java.util.Scanner;

public class Problem7 {
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
        System.out.println("nhập thêm giá trị ");
        int addValue = scanner.nextInt();
        System.out.println("nhập vào vị trí muốn chèn");
        int addIndex = scanner.nextInt();
        if (addIndex < 0 || addIndex > number) {
            System.out.println("Vị trí chèn không hợp lệ.");
            return;
        }
        int [] newArray = new int[number+ 1] ;
        for (int i = 0 , j =0 ; i < newArray.length ; i ++){
            if (i == addIndex){
                newArray[i] = addValue ;
            }else {
                newArray[i] = array[j];
                j++;
            }
        }
        System.out.println("in ra mảng mới ; ");
        for (int i = 0 ; i < newArray.length ; i ++){
            System.out.println(newArray[i] + " ");
        }
    }
}
