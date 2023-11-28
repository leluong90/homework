package session4.teacher;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số dòng :");
        int row = scanner.nextInt();
        System.out.println("nhập số cột");
        int col= scanner.nextInt();
        int [][] array = new int[row][col];
//        for (int i = 0 ; i < row  ; i ++){
//            for (int j =0 ; j < col  ; j ++){
//                array[row][col] = scanner.nextInt();
//            }
//        }
        // Nhập giá trị cho mảng 2 chiều
        System.out.println("Nhập giá trị cho mảng " + row + "x" + col + ":");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Nhập giá trị cho phần tử [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0 ; i < row ; i ++){
            for (int j = 0 ; j < col ; j ++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }

    }

}
