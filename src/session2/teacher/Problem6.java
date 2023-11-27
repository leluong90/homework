package session2.teacher;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        //        bài 6 :
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số điện đầu : ");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập số điên sau : ");
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = number2 - number1 ;
        int total = 0 ;
        if (number3<50){
            total=number3*10000 ;
        } else if (number3<100) {
            total = number3*15000 ;
        } else if (number3<150) {
            total = number3 *20000;

        } else if (number3<200) {
            total = number3*25000 ;
        }else {
            total = number3*3000;
        }
        System.out.println("tổng số tiền phải trả " + total + " đồng ");
    }
}
