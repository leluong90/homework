package session4.teacher;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số phân tử row :");
        int row = scanner.nextInt();
        System.out.println("nhập số phân tử col : ");
        int col = scanner.nextInt();

        double [][] array = new double[row][col] ;
        for (int i = 0 ; i < row ; i++){
            for (int j = 0 ; j < col ; j++){
                System.out.println("nhap phần tử hàng "+ i +" cột " + j );
                array[i][j] = scanner.nextDouble();
            }
        }
        int sum = 0 ;
        for (int i = 0 ; i < row ; i ++){
            for (int j = 0 ; j < col ; j ++){
                if (array[i][j] %2 == 0  ){
                    System.out.println(array[i][j] + " ");
                    sum += array[i][j] ;
                }
            }
        }
        System.out.println("tổng các giá trị chẵn là : "+ sum);

    }
}
