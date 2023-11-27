package session2.teacher;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        //bài 5 :
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập cạnh 1 : ");
        int a = scanner.nextInt();
        System.out.println("nhập cạnh 2 : ");
        int b = scanner.nextInt();
        System.out.println("nhập cạnh 3 : ");
        int c = scanner.nextInt();
        if(a+b > c || a+c > b || b + c > a){
            if( a*a + b*b == c*c || a*a + c*c == b*b || a*a == b*b + c*c ){
                if (a ==b || b ==c || a ==c){
                    System.out.println("đây là tam giác vuông cân");
                }else {
                    System.out.println("đây là tam giác vuông");
                }
            } else if (a==b || a == c || b == c) {
                System.out.println("đây là tam giác cân ");
            } else if (a == b || b == c) {
                System.out.println("đây là tam giác đều");
            } else {
                System.out.println(" đây là tam giác thường");
            }
        }

    }
}
