package session2.lms;

public class Problem5 {
    public static void main(String[] args) {
        int number =1;
        while(number < 1000){
            if(number % 5 == 0 && number%7==0 && number %11==0){
                System.out.println(number + " là số chia hết cho 5 , 7 và 11");
                break;
            }
            number ++ ;
        }
    }
}
