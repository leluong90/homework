package session3.teacher;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Tổng 2 số ");
            System.out.println("2. Hiệu 2 số");
            System.out.println("3. Tích 2 số");
            System.out.println("4. Thương 2 số");
            System.out.println("5. So dư trong phép chia 2 số");
            System.out.println("6. Ước chung lớn nhất");
            System.out.println("7. Bội chung lớn nhất");
            System.out.println("8. Thoát");

            System.out.println("nhập số thứ nhất : ");
            int a = scanner.nextInt();
            System.out.println("nhập số thứ hai :");
            int b = scanner.nextInt();
            System.out.println("nhập lựa chọn : ");
            int choice = scanner.nextInt();
//            int temp = 0 ;
//            if (b > a ){
//                temp = a ;
//                a = b ;
//                b = temp ;
//
//            }

            switch (choice){
                case 1 :
                    System.out.println("tổng 2 số là : " + (a+b));
                    break;
                case 2 :
                    System.out.println("hiệu 2 số là : "+(a-b));
                    break;
                case 3 :
                    System.out.println("tích 2 số là : "+(a*b));
                    break;
                case 4 :

                    System.out.println("thương 2 số là : " + (a/b));
                    break;
                case 5 :
                    int balance = a % b ;
                    System.out.println("số dư 2 số là " + balance);
                    break;
                case 6 :
                    int c = 0 ;
                    for (int i = 1 ; i <= b ; i ++){

                        if (a %i== 0 && b % i ==0){
                            c = i ;
                        }
                        System.out.println("ước chung lớn nhất là : " + c);
                    }
                    break;
                case 7 :
                    int lcm = a ;
                    while (true){
                        if(lcm % a == 0 && lcm%b == 0){
                            System.out.println("ội chung nhỏ nhất là : " + lcm);
                            break;
                        }
                        lcm ++ ;
                    }
                    break;
                case 8 :
                    System.out.println("thoát");
                    System.exit(0);
                    break;
                default:
                    System.out.println("vui long nhập lại 1-8");
                    break;
            }
        }while (true);
    }
}
