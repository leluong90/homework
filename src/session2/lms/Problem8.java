package session2.lms;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập cạnh thứ nhất : ");
        int a  = scanner.nextInt();
        System.out.println("nhập cạnh thứ hai : ");
        int b  = scanner.nextInt();
        System.out.println("nhập cạnh thứ ba : ");
        int c  = scanner.nextInt();
        while (a + b > c || a+c > b ||a < b+c && a> 0 && b > 0 && c >0){
            int permeter = a+b+c ;
            int p = (a+b+c)/2;
            double acreage = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println(permeter + " là chu vi của tam giác");
            System.out.println(acreage + " là diện tích tam giác");
            break;


        }

    }
}
