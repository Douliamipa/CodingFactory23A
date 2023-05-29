package gr.uaeb.cf.ch6;

/**
 *
 *
 */
public class ArraySearchApp {
    public static void main(String[] args) {
        final  int SECRET = 12 ;
        int [] arr = { 1,5,9,3,12};
        boolean secretIsFound = false ;


        for (int item : arr){
            if (item == SECRET){
                secretIsFound = true ;
                break;
            }
        }

        if (secretIsFound){
            System.out.println("secret was found ");
        }else {
            System.out.println("secret was not found");
        }
    }
}
