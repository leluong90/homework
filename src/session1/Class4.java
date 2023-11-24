package session1;

import java.util.Scanner;

public class Class4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài : ");
        Double length = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chiều rộng : ");
        Double width = Double.parseDouble(scanner.nextLine());

        Double perimeter = 2*(length+width);
        Double acreage = length*width;

        System.out.println("chu vi : " + perimeter);
        System.out.println("diện tích : "+ acreage);

    }
}
