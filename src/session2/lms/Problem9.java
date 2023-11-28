package session2.lms;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0 ;

        int n = 0; ;
        do {
            System.out.println("1 .nhập vào số nguyên n : ");
            System.out.println("2. in ra các số chan tu 1 - n va tinh tong  : ");
            System.out.println("3. kiem tra n co phai so nguyen to khong : ");
            System.out.println("4. kiem tra n có phai so hoan hao khong : ");
            System.out.println("5. thoát");
            System.out.println("nhập lựa chọn");
            choice = scanner.nextInt();



            switch (choice){
                case 1:
                    System.out.println("nhập vào số n : ");
                    n = scanner.nextInt();
                    System.out.println("số nguyên là : " + n);
                case 2:
                    int sum = 0 ;
                    for (int i = 1 ; i <=n ; i++){
                        if (i % 2 == 0){
                            System.out.println(" " + i);
                            sum += i ;
                        }

                    }
                    System.out.println("tổng số chẵn là : " + sum);
                    break;

                case 3 :
                    int isPrime = 0 ;

                    for (int i = 2 ; i < n ; i ++ ){
                        if (n%i == 0){
                            isPrime = n ;
                            System.out.println(n + " không phải là số nguyên tố");
                            break;
                        }else {
                            System.out.println(n + " là số nguyên tố");
                        }
                    }
                    break;
                case 4 :
                    if (n == 1){
                        System.out.println("1 không phải số hoàn hảo");

                    }else{
                        int soHoanhao = 0 ;
                        for (int i = 1 ; i <= n/2 ; i++){

                            if (n % i == 0){
                                soHoanhao += i ;
                            }

                        }
                        if(n - soHoanhao ==0){
                            System.out.println(n + " là là số hoàn hao ");
                        }else {
                            System.out.println( n + " không phải là số hoàn hảo ");
                        }

                    }

                    break;
                case 5 :
                    System.out.println("đã thoát");
                    System.exit(0);
                    break;
                default:
                    System.out.println("lựa chọn không hợp lệ");
                    break;
            }


        }while (true);

    }
}
