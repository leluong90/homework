package session2.teacher;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
//        bài 10
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("lương cơ bản của bạn là : ");
        int basicSalary = scanner.nextInt();
        int salary;
        System.out.println("số ngày làm việc của bạn là : ");
        int workDay = scanner.nextInt();
        if(workDay >31)

        {
            System.out.println("bạn đã nhập sai ngày công");
        } else if(workDay >26)

        {
            salary = ((26 + (workDay - 26) * 150 / 100) * basicSalary);
            System.out.println("lương của bạn là : " + salary);

        } else

        {
            salary = workDay * basicSalary;
            System.out.println("lương của bạn là : " + salary);
        }
    }



}
