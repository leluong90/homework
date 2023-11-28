package session2.lms;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cần kiểm tra");
        int number = scanner.nextInt();
        System.out.println("Menu chức năng :");
        System.out.println("1. kiểm tra tính chẵn lẻ");
        System.out.println("2. kiểm tra số nguyên tố");
        System.out.println("3. kiểm tra số đó có chia hết cho 3 không");
        System.out.println("nhập lựa chọn cần kiểm tra : ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                if (number % 2 == 0) {
                    System.out.println(number + " là số chẵn");
                } else {
                    System.out.println(number + "là số lẻ");
                }
            case 2:
                int isPrime = 0 ;
                for (int i =2 ; i <= number/2; i++){

                    if (number % i != 0 ){
                        isPrime = i ;
                    }else {
                        System.out.println();

                    }
                    System.out.println(isPrime + " là số nguyên tố");

                }
            case 3 :
                if (number% 3 == 0){
                    System.out.println(number + " là số chia hết cho 3");
                }else {
                    System.out.println(number + " không phải là số chia hết cho 3");
                }


        }

    }
}
