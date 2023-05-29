package gr.uaeb.cf.ch4;

/**
 *
 * ektupwnei se auxousa seira  1,2,3,4,5... asterakia of the gods se kathe grammi
 */
public class StarsAscending {
    public static void main(String[] args) {
        for (int i = 1 ; i <= 10 ; i++){
            for ( int j = 1 ; j <= i; j++) {


                System.out.print("*");
            }
            System.out.println();
        }

    }
}
