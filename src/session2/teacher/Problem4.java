package session2.teacher;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        //bài 4
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhâp số : ");
        int number1 = scanner.nextInt();
        String s = (number1 % 5 == 0 && number1 % 3 == 0) ? " chia hết cho 3 va 5" : " không chia hêt cho cả 3 va 5";
        System.out.println(s);
    }
}
