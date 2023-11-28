package session3.teacher;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("nhập số n : ");
            int n = scanner.nextInt();


            if (n%3 == 0 ){
                System.out.println(n);

            }
            if (n == 0){
                break;
            }

        }
    }
}
