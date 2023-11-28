package session3.teacher;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1.  tổng 3 số nguyên");
            System.out.println("2. trung bình cộng của 3 số nguyên");
            System.out.println("3. số lơn nhất, nhỏ nhất của 3 số");
            System.out.println("4. thoát");
            System.out.println("lựa chọn của bạn");
            int choice = scanner.nextInt();
            System.out.println("số nguyên a : ");
            int a = scanner.nextInt();
            System.out.println("số nguyên b : ");
            int b = scanner.nextInt();
            System.out.println("số nguyên c : ");
            int c = scanner.nextInt();
            switch (choice){
                case 1 :
                    System.out.println("Tổng 3 số nguyên : "+(a+b+c));
                    break;

                case 2:
                    System.out.println("Trung bình cộng của 3 số nguyên : "+(a+b+c)/3);
                    break;
                case 3 :
                    int max = 0 ;
                    int min = 0 ;
                    if (a>b ){
                        max = a ;
                    } else if (a > c) {
                        max =a ;
                    }else if(b> c ){
                        max = b ;
                        min = a ;
                    }else {
                        max = c ;
                        min = a ;
                    }

                    System.out.println("số lơn nhất là " + max);
                    System.out.println("số nhỏ nhất là "+ min);
                    break;
                case 4 :
                    System.out.println("thoát");
                    System.exit(0);
                default:
                    System.out.println("vui lòng nhập từ 1 dến 4");
                    break;
            }
        }while (true);

    }

}
