package session4.teacher;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

public class Demo {
    public static void main(String[] args) {
//        int [] array = new int[5];
//        float [] arr = {3.1F , 3.2F , 3.2F};

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhập số phần tử của mảng : ");
//        int number = scanner.nextInt();
//        int [] array = new int[number];
//        do {
//            System.out.println("1 . nhập giá trị các phần tử mảng : ");
//            System.out.println("2 . in giá trị các phần tử của mảng : ");
//            System.out.println("3. in giá trị các phần tử có giá trị chẵn và tính tổng : ");
//            System.out.println("4. in giá trị các phần tử có chỉ số lẻ và tính tổng : ");
//            System.out.println("5. in giá trị các phần tử là số nguyên tố : ");
//            System.out.println("6. sắp xếp mảng tăng dần : ");
//            System.out.println("7. nhập 1 số và thống kê số đó xuất hiện bao nhiêu lần trong mảng");
//            System.out.println("8 thoát");
//            System.out.println(" lựa chọn của bạn : ");
//            int choice= scanner.nextInt();
//            switch (choice){
//                case 1 :
//                    System.out.println("nhập các giá trị vào mảng");
//                    for (int i = 0 ; i < array.length ; i++){
//                        System.out.println("phân tử thứ "+i);
//                        array[i] = scanner.nextInt();
//                    }
//                    break;
//                case 2:
//                    System.out.println("các phần tử trong mảng : ");
//                    for (int i =0 ; i < array.length ; i++ ){
//                        System.out.print(array[i] + " ");
//                    }
//                    break;
//                case 3 :
//                    int sum = 0 ;
//                    for (int i = 0 ; i < array.length ;i ++){
//                        if(array[i]%2 ==0){
//                            System.out.println(array[i] + " ");
//                            sum+=array[i];
//                        }
//                    }
//                    System.out.println("tổng của các phần tử có giá trị chẵn trong mảng là : "+ sum);
//                    break;
//                case 4 :
//                    int total = 0 ;
//                    for (int i = 0 ; i < array.length ;i ++){
//                        if(i%2 !=0){
//                            System.out.println(array[i] + " ");
//                            total+=array[i];
//                        }
//                    }
//                    System.out.println("tổng của các phần tử có giá trị chẵn trong mảng là : "+ total);
//                    break;
//
//
//                case 5 :
////                    int [] isPrime = new int [] ;
//                    for (int i = 0 ;i < array.length ; i++){
//                        for (int j = 2 ; j < array[i] ; j++){
//                            if (array[i]%j != 0 ){
//                                System.out.print(array[i] + " ");
//                            }
//                        }
//                    }
//                    break;
//                case 6 :
//
//
//                    int temp = array[0];
//                    for (int i = 0 ; i < array.length- 1 ; i ++){
//                        for (int j = i+1 ; j < array.length ; j++){
//                            if (array[i] > array[j]){
//                                temp = array[j];
//                                array[j] = array[i];
//                                array[i] = temp;
//                            }
//                        }
//                    }
//                    for (int i = 0 ; i < array.length ; i++){
//                        System.out.println(array[i] + " ");
//                    }
//                    break;
//                case 7 :
//                    System.out.println(" nhập số cần kiểm tra : ");
//                    int numberCheck = scanner.nextInt( );
//                    int count = 0 ;
//                    for (int i = 0 ; i < array.length ; i++){
//                        if (array[i] == numberCheck){
//                            count++;
//                        }
//                    }
//                    System.out.println("số lần lặp là : " + count);
//
//                    break;
//                case 8 :
//                    System.out.println("thoát");
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("vui lòng lựa chọn từ 1 - 8");
//                    break;
//            }
//        }while (true);
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số dòng :");
        int row = scanner.nextInt();
        System.out.println("nhập số cột");
        int col= scanner.nextInt();
        int [][] array = new int[row][col];


        do {
            System.out.println("1. Nhập các giá trị các phần tử mảng");
            System.out.println("2. In giá trị các phần tử mảng theo ma trận");
            System.out.println("3. in giá trị các phần tử trên đường biên và tính tổng");
            System.out.println("4. in giá trị các phần tử trên đường cheo chính và chéo phụ , tính tổng");
            System.out.println("5. tìm giá trị lớn nhất và nhỏ nhat trong mảng");
            System.out.println("6. sắp xếp mảng theo cột ");
            System.out.println("7. thống kê các phần tử có giá trị lẻ chia hết cho 3");
            System.out.println("8. thoát");
            System.out.println(" nhập lựa chọn");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    // Nhập giá trị cho mảng 2 chiều
                    System.out.println("Nhập giá trị cho mảng " + row + "x" + col + ":");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.print("Nhập giá trị cho phần tử [" + i + "][" + j + "]: ");
                            array[i][j] = scanner.nextInt();
                        }
                    }
//                    for (int i = 0 ; i < row ; i ++){
//                        for (int j = 0 ; j < col ; j ++){
//                            System.out.print(array[i][j]+ " ");
//                        }
//                        System.out.println();
//                    }
//                    break;
                case 2 :
//                    // Nhập giá trị cho mảng 2 chiều
//                    System.out.println("Nhập giá trị cho mảng " + row + "x" + col + ":");
//                    for (int i = 0; i < row; i++) {
//                        for (int j = 0; j < col; j++) {
//                            System.out.print("Nhập giá trị cho phần tử [" + i + "][" + j + "]: ");
//                            array[i][j] = scanner.nextInt();
//                        }
//                    }
                    for (int i = 0 ; i < row ; i ++){
                        for (int j = 0 ; j < col ; j ++){
                            System.out.print(array[i][j]+ " ");
                        }
                        System.out.println();
                    }
                    break;
                case 3 :
                    int sum = 0 ;
                    for (int i = 0 ; i< row ; i ++){
                        for (int j = 0 ; j < col ; j++){
                            if (i == 0 || i ==row -1 || j==0 || j ==col - 1){
                                System.out.print(array[i][j] + " ");
                                sum += array[i][j];
                            }else {
                                System.out.println("* ");

                            }
                        }
                        System.out.println();
                    }
                    System.out.println("tổng đường biên :" + sum );
                    break;
                case 4 :
                    int totalCheoChinh = 0 ;
                    int totalCheoPhu = 0 ;
                    if (row == col){
                        for (int i = 0 ; i < row ; i ++){
                            for (int j = 0 ; j < col ; j ++){
                                if (i == j){
                                    System.out.print(array[i][j] + " ");
                                    totalCheoChinh += array[i][j] ;

                                }else {
                                    System.out.println("* ");
                                }

                            }
                            System.out.println();
                        }
                        System.out.println("tong cheo chinh : "+ totalCheoChinh);
                    }else {
                        System.out.println("không có đường chéo chính");
                    }
                    if (row == col){
                        for (int i = 0 ; i < row ; i ++){
                            for (int j = 0 ; j < col ; j ++){
                                if (i + j == 3){
                                    System.out.print(array[i][j] + " ");
                                    totalCheoPhu += array[i][j] ;

                                }else {
                                    System.out.println("* ");
                                }

                            }
                            System.out.println();
                        }
                        System.out.println("tông chéo phụ " + totalCheoPhu);
                    }else {
                        System.out.println("không có đường chéo phụ");
                    }

                    break;
                case 5 :
                    int max = 0 ;
                    int min = 0 ;
                    for (int i = 0 ; i < row ; i++){
                        for (int j = 0 ; j < col ; j ++){
                            if(max< array[i][j]){
                                max = array[i][j];
                            }
                        }
                    }
                    for (int i = 0 ; i < row ; i++){
                        for (int j = 0 ; j < col ; j ++){
                            if(min< array[i][j]){
                                min = array[i][j];
                            }
                        }
                    }
                    System.out.println("max "+ max);
                    System.out.println("min "+ min);
                    break;
                case 6 :
                    int temp = array[0][0] ;
                    for (int i = 0 ; i < col ; i ++){
                        for(int j = 0 ; j < row ; j ++){
                            for(int k = 0; k < col ; k ++ ){
                                if (array[i][j]>array[i+1][j]){
                                    temp = array[i+1][j] ;
                                    array[i+1][j] = array[i][j];
                                    array[i][j]=temp ;
                                }
                            }
                        }
                    }
                    for (int i = 0 ; i < row ; i ++){
                        for (int j = 0 ; j < col ; j ++){
                            System.out.print(array[i][j]+ " ");
                        }
                        System.out.println();
                    }
                    break;
                case 7 :
                    System.out.println("các phần tử có giá trị lẻ là : ");
                    for(int i = 0 ; i < row ; i ++){
                        for(int j  = 0 ; j < col ; j ++){
                            if (array[i][j] % 2 !=0 && array[i][j]%3 ==0){
                                System.out.println(array[i][j]+ " ");
                            }
                        }
                    }

                    break;
                case 8 :
                    System.out.println("thoát");
                    System.exit(0);
                    break;
                default:
                    System.out.println("vui lòng chọn từ 1 - 8 ");
                    break;

            }


        }while (true);
    }
}
