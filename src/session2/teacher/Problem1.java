package session2.teacher;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số : ");
        int number = Integer.parseInt(scanner.nextLine());
        if (number % 2 == 0){
            System.out.println(number+" là số chẵn");
        }else {
            System.out.println(number+ "số đó là số lẻ");
        }

    }
}
