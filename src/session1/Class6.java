package session1;

import java.util.Scanner;

public class Class6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số : ");
        int number = Integer.parseInt(scanner.nextLine());

        if(number%3==0 && number%5==0 ){
            System.out.println(number + " chia hết cho cả 3 và 5");
        } else if (number%3==0 && number%5!=0) {
            System.out.println(number + " chỉ chia hét cho 3");
        } else if (number%3!=0 && number%5==0) {
            System.out.println(number + " chỉ chia hết cho 5");

        } else {
            System.out.println(number + " không chia hết cho 3 , cũng không chia hết cho 5");
        }
    }
}
