package session2;

import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số number1 : ");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập number 2 : ");
        int number2 = Integer.parseInt(scanner.nextLine());
        int total = 0 ;

        for (int i = number1 ; i <= number2 ; i++){
            if (i%2 == 0  ){
                total += i ;

            }
        }
        System.out.println("Tổng của của các số chẵn trong khoảng " + number1 + " đến " + number2 + " là " + total  );
    }
}
