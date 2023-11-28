package session3.teacher;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        do {
            System.out.println("*******************");
            System.out.println("1. phở tôm hùm ");
            System.out.println("2. phở bò kobe");
            System.out.println("3. phở gà việt nam");
            System.out.println("4. xôi trứng thịt");
            System.out.println("5. bánh mì trứng");
            System.out.println("6. mỳ tôm không người lái");
            System.out.println("7. thoát");
            System.out.println("vui lòng nhập số : ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("bạn vừa chọn món phở tôm hùm , vui lòng đợi trong giây lát");
                    break;
                case 2:
                    System.out.println("bạn vừa chọn phở bò kobe , vui lòng đợi trong giây lát ");
                    break;
                case 3:
                    System.out.println("bạn vừa chọn phở gà Việt Nam , vui lòng đợi trong giây lát");
                    break;
                case 4:
                    System.out.println("bạn vừa chọn xôi trứng thịt , vui lòng đợi trong giây lát");
                    break;
                case 5:
                    System.out.println("bạn vừa chọn bánh mỳ trứng , vui lòng đợi trong giây lát");
                    break;
                case 6:
                    System.out.println("bạn vừa chọn mỳ tôm không người lái , vui lòng đợi trong giây lát");
                    break;
                case 7:
                    System.out.println("thoát");
                    System.exit(0);
                default:
                    System.out.println("vui lòng chọn 1-7");
                    break;
            }

        } while (true);
    }
}
