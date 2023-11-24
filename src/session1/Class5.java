package session1;

import java.util.Scanner;

public class Class5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập điểm toán : ");
        double math = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập điểm lý : ");
        double physical = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập điểm hóa : ");
        double chemistry = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập điểm văn : ");
        double literature = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập điểm tiếng anh : ");
        double english = Double.parseDouble(scanner.nextLine());

        double average = (math+ physical+ chemistry+ literature+english)/5 ;
        System.out.println("Điểm trung bình : " + average);

        if( average < 5){
            System.out.println("Xếp loại yếu");
        }else if (average<6.5){
            System.out.println("Xếp loại trung bình");
        } else if (average < 8) {
            System.out.println("Xếp loại khá");

        } else if (average<9) {
            System.out.println("Xếp loại giỏi");

        }else {
            System.out.println("Xếp loại xuất sắc");
        }



    }
}
