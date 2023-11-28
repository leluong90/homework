package session2.lms;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("chọn giá tri cần tính chu vi và diện tích");
        System.out.println("1.tính chu vi và diện tích hình chữ nhật");
        System.out.println("2.tính chu vi và diện tích hình tam giác");
        System.out.println("3.tính chu vi và diện tích hình tròn");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("nhập chiều dài :");
                int length = scanner.nextInt();
                System.out.println("nhập chiều rộng :");
                int width = scanner.nextInt();
                System.out.println("chu vi hình chữ nhậy là : " + (2*(length+width)));
                System.out.println("diện tích hình chữ nhật là : "+(length*width));
                break;
            case 2 :
                System.out.println("nhập cạnh 1 :");
                int a = scanner.nextInt();
                System.out.println("nhập cạnh 2 :");
                int b = scanner.nextInt();
                System.out.println("nhập cạnh 3 :");
                int c = scanner.nextInt();
                double p = (a+b+c)/2 ;
                int perimeter = a+b+c;
                int acreage = (int) Math.sqrt(p*(p-a)*(p-b)*(p-c));
                System.out.println(perimeter + " là chu vi của hình tam giác");
                System.out.println(acreage+ " là diện tích của tam giác");
                break;
            case 3 :
                System.out.println("nhập bán kính : ");
                int radius = scanner.nextInt();
                double chuVi = radius * 2 * 3.14 ;
                double dienTich = radius*radius*3.14 ;
                System.out.println(chuVi + " là chu vi hình tròn");
                System.out.println(dienTich + " là diện tích hình tròn");
                break;
            default:
                System.out.println("bạn nhập sai lựa chọn");
                break;
        }
    }


}
