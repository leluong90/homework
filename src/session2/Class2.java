package session2;

import java.util.Scanner;

public class Class2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chiều dài : ");

        int length = Integer.parseInt(scanner.nextLine());
        System.out.println("nhaap chiều rộng : ");
        int width = Integer.parseInt(scanner.nextLine());

        for (int i = 1 ; i <= width ; i ++ ) {
            for (int j = 1 ; j <= length ; j++ ){
                System.out.print("*" );
            }
            System.out.println();


        }
//        for (int i = 1 ; i <= length ; i ++){
//            for (int j = 1 ; j <= length - i ; j ++){
//                System.out.print("*");
//
//            }
//            System.out.println();
//
//        }

        for(int i = 1 ; i <= length ; i ++){
            for (int j = i ; j <= length ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int  i = 1 ; i <= length ; i ++ ){
            for (int j =1 ; j < i ; j ++ ){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1 ; i <=length ; i++){
            for (int j = 1 ; j < i ; j++){
                for (int k  =1 ; k < j ; k ++ ){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
