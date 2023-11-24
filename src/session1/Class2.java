package session1;

import java.util.Scanner;

public class Class2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000 ;
        System.out.println("nhập giá trị tiền vào ($) : ");
        Double inputUsd = Double.parseDouble(scanner.nextLine());
        int transaction = (int) (inputUsd * rate);
        System.out.println(transaction + " đồng ");
    }
}
