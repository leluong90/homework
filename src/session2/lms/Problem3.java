package session2.lms;

public class Problem3 {
    public static void main(String[] args) {
        for (int i = 3 ; i <=100 ; i ++){

            for ( int j = 2 ; j < i ; j++){
                if (i%j == 0){
                    break;
                } else if (j+1==i) {
                    System.out.println(i);
                }


            }

        }

    }

}
