package session2.teacher;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập điểm html : ");
        int htmlScore = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập điểm css ; ");
        int cssScore = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập điểm javascript : ");
        int javascriptScore = Integer.parseInt(scanner.nextLine());
        int avgMark = (htmlScore + cssScore + javascriptScore)/3;

        if ( avgMark < 5 ){
            System.out.println("yếu");
        } else if (avgMark<7) {
            System.out.println("trung bình");

        } else if (avgMark<8) {
            System.out.println("khá");

        } else if (avgMark<9) {
            System.out.println("giỏi");

        }else {
            System.out.println("xuất sắc");

        }
    }
}
